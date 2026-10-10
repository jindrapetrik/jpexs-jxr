package com.jpexs.jxr;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * Small Java 8 Swing viewer; decoding and encoding run outside the EDT.
 */
public final class JxrViewer extends JFrame {

    private BufferedImage image;
    private final JLabel canvas = new JLabel();
    private final JLabel status = new JLabel("Open a JXR, PNG, or JPEG image.");
    private final JButton open = new JButton("Open…");
    private final JButton save = new JButton("Save JXR…");
    private final JSlider quality = new JSlider(0, 100, 100);

    public JxrViewer() {
        super("JPEG XR – Java 8");
        JComponent.setDefaultLocale(Locale.ENGLISH);
        setLocale(Locale.ENGLISH);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel toolbar = new JPanel();
        toolbar.add(open);
        toolbar.add(save);
        toolbar.add(new JLabel("Quality:"));
        toolbar.add(quality);
        JLabel value = new JLabel("100 (lossless)");
        toolbar.add(value);
        quality.addChangeListener(e -> value.setText(quality.getValue() == 100 ? "100 (lossless)" : Integer.toString(quality.getValue())));
        save.setEnabled(false);
        add(toolbar, BorderLayout.NORTH);
        add(new JScrollPane(canvas), BorderLayout.CENTER);
        add(status, BorderLayout.SOUTH);
        open.addActionListener(e -> {
            JFileChooser chooser = new JFileChooser();
            chooser.setFileFilter(new FileNameExtensionFilter("Images JXR / WDP / HDP / PNG / JPEG", "jxr", "wdp", "hdp", "png", "jpg", "jpeg", "bmp", "gif"));
            if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
                load(chooser.getSelectedFile());
            }
        });
        save.addActionListener(e -> {
            JFileChooser chooser = new JFileChooser();
            chooser.setFileFilter(new FileNameExtensionFilter("JPEG XR", "jxr"));
            if (chooser.showSaveDialog(this) != JFileChooser.APPROVE_OPTION) {
                return;
            }
            File selected = chooser.getSelectedFile();
            final File file = selected.getName().toLowerCase(java.util.Locale.ROOT).endsWith(".jxr") ? selected : new File(selected.getPath() + ".jxr");
            if (file.exists() && JOptionPane.showConfirmDialog(this, "Overwrite " + file.getName() + "?", "Save", JOptionPane.YES_NO_OPTION) != JOptionPane.YES_OPTION) {
                return;
            }
            JxrImageWriteParam param = new JxrImageWriteParam();
            param.setCompressionQuality(quality.getValue() / 100f);
            busy(true, "Saving…");
            new SwingWorker<Void, Void>() {
                @Override
                protected Void doInBackground() throws Exception {
                    Jxr.write(image, file, param);
                    return null;
                }

                @Override
                protected void done() {
                    try {
                        get();
                        busy(false, "Saved: " + file);
                    } catch (Exception ex) {
                        failed(ex);
                    }
                }
            }.execute();
        });
        setSize(1000, 720);
        setLocationRelativeTo(null);
    }

    private void busy(boolean busy, String message) {
        open.setEnabled(!busy);
        save.setEnabled(!busy && image != null);
        quality.setEnabled(!busy);
        status.setText(message);
    }

    private void failed(Exception e) {
        Throwable cause = e instanceof ExecutionException ? e.getCause() : e;
        if (cause instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        busy(false, "The operation failed.");
        JOptionPane.showMessageDialog(this, cause.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }

    private void load(final File file) {
        busy(true, "Loading…");
        new SwingWorker<BufferedImage, Void>() {
            @Override
            protected BufferedImage doInBackground() throws Exception {
                return Jxr.read(file);
            }

            @Override
            protected void done() {
                try {
                    image = get();
                    canvas.setIcon(new ImageIcon(image));
                    setTitle(file.getName() + " – JPEG XR");
                    busy(false, image.getWidth() + " × " + image.getHeight() + " px – " + file);
                } catch (Exception e) {
                    failed(e);
                }
            }
        }.execute();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JxrViewer viewer = new JxrViewer();
            viewer.setVisible(true);
            if (args.length > 0) {
                viewer.load(new File(args[0]));
            }
        });
    }
}
