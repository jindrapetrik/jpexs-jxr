package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

public final class Dispatch {

    private Dispatch() {
    }

    public static long call(Heap m, long address, long[] args) {
        switch ((int) address) {
            case 1879048192:
                return F0000_Clean.run(m, args[0]);
            case 1879048194:
                return F0002_Allocate.run(m, args[0], args[1]);
            case 1879048197:
                return F0005_AdaptDiscriminant.run(m, args[0]);
            case 1879048198:
                return F0006_port_error.run(m);
            case 1879048199:
                return F0007_port_probe.run(m, args[0], args[1], args[2]);
            case 1879048201:
                return F0009_open_decoder.run(m, args[0], args[1], args[2], args[3]);
            case 1879048202:
                return F0010_image_info.run(m, args[0], args[1], args[2]);
            case 1879048205:
                return F0013_port_decode.run(m, args[0], args[1]);
            case 1879048208:
                return F0016_port_encode.run(m, args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7], args[8]);
            case 1879048210:
                return F0018_counted_write.run(m, args[0], args[1], args[2]);
            case 1879048211:
                return F0019_AllocateCodingContextDec.run(m, args[0], args[1]);
            case 1879048213:
                return F0021_ResetCodingContextDec.run(m, args[0]);
            case 1879048214:
                return F0022_FreeCodingContextDec.run(m, args[0]);
            case 1879048215:
                return F0023_AllocateCodingContextEnc.run(m, args[0], args[1], args[2]);
            case 1879048217:
                return F0025_ResetCodingContextEnc.run(m, args[0]);
            case 1879048218:
                return F0026_FreeCodingContextEnc.run(m, args[0]);
            case 1879048219:
                return F0027_UpdateModelMB.run(m, args[0], args[1], args[2], args[3]);
            case 1879048220:
                return F0028_ResetCodingContext.run(m, args[0]);
            case 1879048221:
                return F0029_InitZigzagScan.run(m, args[0]);
            case 1879048222:
                return F0030_PKAlloc.run(m, args[0], args[1]);
            case 1879048224:
                return F0032_PKFree.run(m, args[0]);
            case 1879048225:
                return F0033_PKAllocAligned.run(m, args[0], args[1], args[2]);
            case 1879048226:
                return F0034_PKFreeAligned.run(m, args[0]);
            case 1879048227:
                return F0035_PKStrnicmp.run(m, args[0], args[1], args[2]);
            case 1879048229:
                return F0037_PixelFormatLookup.run(m, args[0], args[1]);
            case 1879048231:
                return F0039_GetPixelFormatFromHash.run(m, args[0]);
            case 1879048232:
                return F0040_GetImageEncodeIID.run(m, args[0], args[1]);
            case 1879048233:
                return F0041_GetIIDInfo.run(m, args[0], args[1]);
            case 1879048235:
                return F0043_GetImageDecodeIID.run(m, args[0], args[1]);
            case 1879048236:
                return F0044_PKCreateFactory_CreateStream.run(m, args[0]);
            case 1879048237:
                return F0045_PKCreateFactory_Release.run(m, args[0]);
            case 1879048238:
                return F0046_PKCreateFactory.run(m, args[0], args[1]);
            case 1879048239:
                return F0047_PKCodecFactory_CreateCodec.run(m, args[0], args[1]);
            case 1879048240:
                return F0048_PKCodecFactory_CreateDecoderFromFile.run(m, args[0], args[1]);
            case 1879048242:
                return F0050_PKCodecFactory_CreateFormatConverter.run(m, args[0]);
            case 1879048243:
                return F0051_PKCreateCodecFactory_Release.run(m, args[0]);
            case 1879048244:
                return F0052_PKCreateCodecFactory.run(m, args[0], args[1]);
            case 1879048245:
                return F0053_PKImageEncode_Initialize.run(m, args[0], args[1], args[2], args[3]);
            case 1879048246:
                return F0054_PKImageEncode_Terminate.run(m, args[0]);
            case 1879048247:
                return F0055_PKImageEncode_SetPixelFormat.run(m, args[0], args[1]);
            case 1879048248:
                return F0056_PKImageEncode_SetSize.run(m, args[0], args[1], args[2]);
            case 1879048249:
                return F0057_PKImageEncode_SetResolution.run(m, args[0], args[1], args[2]);
            case 1879048250:
                return F0058_PKImageEncode_SetColorContext.run(m, args[0], args[1], args[2]);
            case 1879048251:
                return F0059_PKImageEncode_SetDescriptiveMetadata.run(m, args[0], args[1]);
            case 1879048252:
                return F0060_PKImageEncode_WritePixels.run(m, args[0], args[1], args[2], args[3]);
            case 1879048253:
                return F0061_PKImageEncode_WriteSource.run(m, args[0], args[1], args[2]);
            case 1879048255:
                return F0063_PKImageEncode_WritePixelsBandedBegin.run(m, args[0], args[1]);
            case 1879048256:
                return F0064_PKImageEncode_WritePixelsBanded.run(m, args[0], args[1], args[2], args[3], args[4]);
            case 1879048257:
                return F0065_PKImageEncode_WritePixelsBandedEnd.run(m, args[0]);
            case 1879048258:
                return F0066_PKImageEncode_Transcode.run(m, args[0], args[1], args[2]);
            case 1879048259:
                return F0067_PKImageEncode_CreateNewFrame.run(m, args[0], args[1], args[2]);
            case 1879048260:
                return F0068_PKImageEncode_Release.run(m, args[0]);
            case 1879048261:
                return F0069_PKImageEncode_Create.run(m, args[0]);
            case 1879048262:
                return F0070_PKImageDecode_Initialize.run(m, args[0], args[1]);
            case 1879048263:
                return F0071_PKImageDecode_GetPixelFormat.run(m, args[0], args[1]);
            case 1879048264:
                return F0072_PKImageDecode_GetSize.run(m, args[0], args[1], args[2]);
            case 1879048265:
                return F0073_PKImageDecode_GetResolution.run(m, args[0], args[1], args[2]);
            case 1879048266:
                return F0074_PKImageDecode_GetColorContext.run(m, args[0], args[1], args[2]);
            case 1879048267:
                return F0075_PKImageDecode_GetDescriptiveMetadata.run(m, args[0], args[1]);
            case 1879048268:
                return F0076_PKImageDecode_Copy.run(m, args[0], args[1], args[2], args[3]);
            case 1879048269:
                return F0077_PKImageDecode_GetFrameCount.run(m, args[0], args[1]);
            case 1879048270:
                return F0078_PKImageDecode_SelectFrame.run(m, args[0], args[1]);
            case 1879048271:
                return F0079_PKImageDecode_Release.run(m, args[0]);
            case 1879048272:
                return F0080_PKImageDecode_Create.run(m, args[0]);
            case 1879048273:
                return F0081_CalcMetadataSizeLPSTR.run(m, args[0], args[1], args[2], args[3]);
            case 1879048274:
                return F0082_CalcMetadataSizeLPWSTR.run(m, args[0], args[1], args[2], args[3]);
            case 1879048276:
                return F0084_CalcMetadataSizeUI2.run(m, args[0], args[1], args[2]);
            case 1879048277:
                return F0085_CalcMetadataSizeUI4.run(m, args[0], args[1], args[2]);
            case 1879048278:
                return F0086_CalcMetadataOffsetSize.run(m, args[0], args[1], args[2]);
            case 1879048279:
                return F0087_CopyDescMetadata.run(m, args[0], args[1]);
            case 1879048280:
                return F0088_FreeDescMetadata.run(m, args[0]);
            case 1879048281:
                return F0089_WriteDescMetadata.run(m, args[0], args[1], args[2], args[3], args[4]);
            case 1879048282:
                return F0090_WriteContainerPre.run(m, args[0]);
            case 1879048284:
                return F0092_WriteContainerPost.run(m, args[0]);
            case 1879048285:
                return F0093_PKImageEncode_Initialize_WMP.run(m, args[0], args[1], args[2], args[3]);
            case 1879048286:
                return F0094_PKImageEncode_Terminate_WMP.run(m, args[0]);
            case 1879048287:
                return F0095_PKImageEncode_EncodeContent_Init.run(m, args[0], args[1], args[2], args[3], args[4]);
            case 1879048288:
                return F0096_PKImageEncode_EncodeContent_Encode.run(m, args[0], args[1], args[2], args[3]);
            case 1879048289:
                return F0097_PKImageEncode_EncodeContent_Term.run(m, args[0]);
            case 1879048290:
                return F0098_PKImageEncode_EncodeContent.run(m, args[0], args[1], args[2], args[3], args[4]);
            case 1879048291:
                return F0099_PKImageEncode_EncodeAlpha_Init.run(m, args[0], args[1], args[2], args[3], args[4]);
            case 1879048292:
                return F0100_PKImageEncode_EncodeAlpha_Encode.run(m, args[0], args[1], args[2], args[3]);
            case 1879048293:
                return F0101_PKImageEncode_EncodeAlpha_Term.run(m, args[0]);
            case 1879048294:
                return F0102_PKImageEncode_EncodeAlpha.run(m, args[0], args[1], args[2], args[3], args[4]);
            case 1879048295:
                return F0103_PKImageEncode_SetColorContext_WMP.run(m, args[0], args[1], args[2]);
            case 1879048296:
                return F0104_PKImageEncode_SetXMPMetadata_WMP.run(m, args[0], args[1], args[2]);
            case 1879048300:
                return F0108_PKImageEncode_SetEXIFMetadata_WMP.run(m, args[0], args[1], args[2]);
            case 1879048301:
                return F0109_PKImageEncode_SetGPSInfoMetadata_WMP.run(m, args[0], args[1], args[2]);
            case 1879048302:
                return F0110_PKImageEncode_SetIPTCNAAMetadata_WMP.run(m, args[0], args[1], args[2]);
            case 1879048303:
                return F0111_PKImageEncode_SetPhotoshopMetadata_WMP.run(m, args[0], args[1], args[2]);
            case 1879048304:
                return F0112_PKImageEncode_SetDescriptiveMetadata_WMP.run(m, args[0], args[1]);
            case 1879048305:
                return F0113_PKImageEncode_WritePixels_WMP.run(m, args[0], args[1], args[2], args[3]);
            case 1879048306:
                return F0114_PKImageEncode_WritePixelsBandedBegin_WMP.run(m, args[0], args[1]);
            case 1879048307:
                return F0115_PKImageEncode_WritePixelsBanded_WMP.run(m, args[0], args[1], args[2], args[3], args[4]);
            case 1879048308:
                return F0116_PKImageEncode_WritePixelsBandedEnd_WMP.run(m, args[0]);
            case 1879048309:
                return F0117_PKImageEncode_Transcode_WMP.run(m, args[0], args[1], args[2]);
            case 1879048310:
                return F0118_PKImageEncode_CreateNewFrame_WMP.run(m, args[0], args[1], args[2]);
            case 1879048311:
                return F0119_PKImageEncode_Release_WMP.run(m, args[0]);
            case 1879048312:
                return F0120_PKImageEncode_Create_WMP.run(m, args[0]);
            case 1879048313:
                return F0121_ParsePFDEntry.run(m, args[0], args[1], args[2], args[3], args[4]);
            case 1879048315:
                return F0123_ParsePFD.run(m, args[0], args[1], args[2]);
            case 1879048316:
                return F0124_ReadContainer.run(m, args[0]);
            case 1879048317:
                return F0125_PKImageDecode_Initialize_WMP.run(m, args[0], args[1]);
            case 1879048318:
                return F0126_PKImageDecode_GetSize_WMP.run(m, args[0], args[1], args[2]);
            case 1879048319:
                return F0127_PKImageDecode_GetRawStream_WMP.run(m, args[0], args[1]);
            case 1879048320:
                return F0128_PKImageDecode_Copy_WMP.run(m, args[0], args[1], args[2], args[3]);
            case 1879048321:
                return F0129_PKImageDecode_GetMetadata_WMP.run(m, args[0], args[1], args[2], args[3], args[4]);
            case 1879048322:
                return F0130_PKImageDecode_GetColorContext_WMP.run(m, args[0], args[1], args[2]);
            case 1879048323:
                return F0131_PKImageDecode_GetXMPMetadata_WMP.run(m, args[0], args[1], args[2]);
            case 1879048324:
                return F0132_PKImageDecode_GetEXIFMetadata_WMP.run(m, args[0], args[1], args[2]);
            case 1879048325:
                return F0133_PKImageDecode_GetGPSInfoMetadata_WMP.run(m, args[0], args[1], args[2]);
            case 1879048326:
                return F0134_PKImageDecode_GetIPTCNAAMetadata_WMP.run(m, args[0], args[1], args[2]);
            case 1879048327:
                return F0135_PKImageDecode_GetPhotoshopMetadata_WMP.run(m, args[0], args[1], args[2]);
            case 1879048328:
                return F0136_PKImageDecode_GetDescriptiveMetadata_WMP.run(m, args[0], args[1]);
            case 1879048329:
                return F0137_PKImageDecode_Release_WMP.run(m, args[0]);
            case 1879048330:
                return F0138_PKImageDecode_Create_WMP.run(m, args[0]);
            case 1879048331:
                return F0139_RGB24_BGR24.run(m, args[0], args[1], args[2], args[3]);
            case 1879048332:
                return F0140_BGR24_RGB24.run(m, args[0], args[1], args[2], args[3]);
            case 1879048333:
                return F0141_RGB24_BGR32.run(m, args[0], args[1], args[2], args[3]);
            case 1879048334:
                return F0142_BGR32_RGB24.run(m, args[0], args[1], args[2], args[3]);
            case 1879048335:
                return F0143_RGB24_Gray8.run(m, args[0], args[1], args[2], args[3]);
            case 1879048336:
                return F0144_BGR24_Gray8.run(m, args[0], args[1], args[2], args[3]);
            case 1879048337:
                return F0145_Gray8_RGB24.run(m, args[0], args[1], args[2], args[3]);
            case 1879048338:
                return F0146_Gray8_BGR24.run(m, args[0], args[1], args[2], args[3]);
            case 1879048339:
                return F0147_RGBA128Fixed_RGBA128Float.run(m, args[0], args[1], args[2], args[3]);
            case 1879048340:
                return F0148_RGBA128Float_RGBA128Fixed.run(m, args[0], args[1], args[2], args[3]);
            case 1879048342:
                return F0150_RGB96Fixed_RGB96Float.run(m, args[0], args[1], args[2], args[3]);
            case 1879048343:
                return F0151_RGB128Fixed_RGB96Float.run(m, args[0], args[1], args[2], args[3]);
            case 1879048344:
                return F0152_RGB96Float_RGB96Fixed.run(m, args[0], args[1], args[2], args[3]);
            case 1879048345:
                return F0153_RGB96Float_RGB128Fixed.run(m, args[0], args[1], args[2], args[3]);
            case 1879048346:
                return F0154_RGB96Float_RGB128Float.run(m, args[0], args[1], args[2], args[3]);
            case 1879048347:
                return F0155_RGB128Float_RGB96Float.run(m, args[0], args[1], args[2], args[3]);
            case 1879048348:
                return F0156_RGB48Half_RGB64Half.run(m, args[0], args[1], args[2], args[3]);
            case 1879048349:
                return F0157_RGB64Half_RGB48Half.run(m, args[0], args[1], args[2], args[3]);
            case 1879048350:
                return F0158_BGR24_BGR32.run(m, args[0], args[1], args[2], args[3]);
            case 1879048351:
                return F0159_BGR32_BGR24.run(m, args[0], args[1], args[2], args[3]);
            case 1879048352:
                return F0160_Gray32Fixed_Gray32Float.run(m, args[0], args[1], args[2], args[3]);
            case 1879048353:
                return F0161_Gray32Float_Gray32Fixed.run(m, args[0], args[1], args[2], args[3]);
            case 1879048354:
                return F0162_Gray16Fixed_Gray32Float.run(m, args[0], args[1], args[2], args[3]);
            case 1879048355:
                return F0163_Gray32Float_Gray16Fixed.run(m, args[0], args[1], args[2], args[3]);
            case 1879048356:
                return F0164_RGB48Fixed_RGB96Float.run(m, args[0], args[1], args[2], args[3]);
            case 1879048357:
                return F0165_RGB96Float_RGB48Fixed.run(m, args[0], args[1], args[2], args[3]);
            case 1879048358:
                return F0166_RGB64Fixed_RGB96Float.run(m, args[0], args[1], args[2], args[3]);
            case 1879048359:
                return F0167_RGB96Float_RGB64Fixed.run(m, args[0], args[1], args[2], args[3]);
            case 1879048360:
                return F0168_RGBA64Fixed_RGBA128Float.run(m, args[0], args[1], args[2], args[3]);
            case 1879048361:
                return F0169_RGBA128Float_RGBA64Fixed.run(m, args[0], args[1], args[2], args[3]);
            case 1879048362:
                return F0170_RGBE_RGB96Float.run(m, args[0], args[1], args[2], args[3]);
            case 1879048365:
                return F0173_RGB96Float_RGBE.run(m, args[0], args[1], args[2], args[3]);
            case 1879048367:
                return F0175_RGBA64Half_RGBA128Float.run(m, args[0], args[1], args[2], args[3]);
            case 1879048368:
                return F0176_RGBA128Float_RGBA64Half.run(m, args[0], args[1], args[2], args[3]);
            case 1879048369:
                return F0177_RGB64Half_RGB96Float.run(m, args[0], args[1], args[2], args[3]);
            case 1879048370:
                return F0178_RGB96Float_RGB64Half.run(m, args[0], args[1], args[2], args[3]);
            case 1879048371:
                return F0179_RGB48Half_RGB96Float.run(m, args[0], args[1], args[2], args[3]);
            case 1879048372:
                return F0180_RGB96Float_RGB48Half.run(m, args[0], args[1], args[2], args[3]);
            case 1879048373:
                return F0181_Gray16Half_Gray32Float.run(m, args[0], args[1], args[2], args[3]);
            case 1879048374:
                return F0182_Gray32Float_Gray16Half.run(m, args[0], args[1], args[2], args[3]);
            case 1879048375:
                return F0183_RGB555_RGB24.run(m, args[0], args[1], args[2], args[3]);
            case 1879048376:
                return F0184_RGB101010_RGB48.run(m, args[0], args[1], args[2], args[3]);
            case 1879048377:
                return F0185_RGB24_RGB555.run(m, args[0], args[1], args[2], args[3]);
            case 1879048378:
                return F0186_RGB48_RGB101010.run(m, args[0], args[1], args[2], args[3]);
            case 1879048379:
                return F0187_RGB565_RGB24.run(m, args[0], args[1], args[2], args[3]);
            case 1879048380:
                return F0188_RGB24_RGB565.run(m, args[0], args[1], args[2], args[3]);
            case 1879048381:
                return F0189_RGBA32_BGRA32.run(m, args[0], args[1], args[2], args[3]);
            case 1879048382:
                return F0190_BGRA32_RGBA32.run(m, args[0], args[1], args[2], args[3]);
            case 1879048383:
                return F0191_BlackWhite_Gray8.run(m, args[0], args[1], args[2], args[3]);
            case 1879048384:
                return F0192_Gray16_Gray8.run(m, args[0], args[1], args[2], args[3]);
            case 1879048385:
                return F0193_RGB48_RGB24.run(m, args[0], args[1], args[2], args[3]);
            case 1879048386:
                return F0194_RGBA64_RGBA32.run(m, args[0], args[1], args[2], args[3]);
            case 1879048387:
                return F0195_Gray32Float_Gray8.run(m, args[0], args[1], args[2], args[3]);
            case 1879048389:
                return F0197_RGB96Float_RGB24.run(m, args[0], args[1], args[2], args[3]);
            case 1879048390:
                return F0198_RGB128Float_RGB24.run(m, args[0], args[1], args[2], args[3]);
            case 1879048391:
                return F0199_RGBA128Float_RGBA32.run(m, args[0], args[1], args[2], args[3]);
            case 1879048392:
                return F0200_Gray16Fixed_Gray8.run(m, args[0], args[1], args[2], args[3]);
            case 1879048393:
                return F0201_Gray32Fixed_Gray8.run(m, args[0], args[1], args[2], args[3]);
            case 1879048394:
                return F0202_RGB48Fixed_RGB24.run(m, args[0], args[1], args[2], args[3]);
            case 1879048395:
                return F0203_RGB64Fixed_RGB24.run(m, args[0], args[1], args[2], args[3]);
            case 1879048396:
                return F0204_RGB96Fixed_RGB24.run(m, args[0], args[1], args[2], args[3]);
            case 1879048397:
                return F0205_RGB128Fixed_RGB24.run(m, args[0], args[1], args[2], args[3]);
            case 1879048398:
                return F0206_RGBA64Fixed_RGBA32.run(m, args[0], args[1], args[2], args[3]);
            case 1879048399:
                return F0207_RGBA128Fixed_RGBA32.run(m, args[0], args[1], args[2], args[3]);
            case 1879048400:
                return F0208_Gray16Half_Gray8.run(m, args[0], args[1], args[2], args[3]);
            case 1879048401:
                return F0209_RGB48Half_RGB24.run(m, args[0], args[1], args[2], args[3]);
            case 1879048402:
                return F0210_RGB64Half_RGB24.run(m, args[0], args[1], args[2], args[3]);
            case 1879048403:
                return F0211_RGBA64Half_RGBA32.run(m, args[0], args[1], args[2], args[3]);
            case 1879048404:
                return F0212_RGB101010_RGB24.run(m, args[0], args[1], args[2], args[3]);
            case 1879048405:
                return F0213_RGBE_RGB24.run(m, args[0], args[1], args[2], args[3]);
            case 1879048406:
                return F0214_PKFormatConverter_Initialize.run(m, args[0], args[1], args[2], args[3]);
            case 1879048407:
                return F0215_PKFormatConverter_InitializeConvert.run(m, args[0], args[1], args[2], args[3]);
            case 1879048408:
                return F0216_PKFormatConverter_EnumConversions.run(m, args[0], args[1], args[2]);
            case 1879048409:
                return F0217_PKFormatConverter_GetPixelFormat.run(m, args[0], args[1]);
            case 1879048410:
                return F0218_PKFormatConverter_GetSourcePixelFormat.run(m, args[0], args[1]);
            case 1879048411:
                return F0219_PKFormatConverter_GetSize.run(m, args[0], args[1], args[2]);
            case 1879048412:
                return F0220_PKFormatConverter_GetResolution.run(m, args[0], args[1], args[2]);
            case 1879048413:
                return F0221_PKFormatConverter_Copy.run(m, args[0], args[1], args[2], args[3]);
            case 1879048414:
                return F0222_PKFormatConverter_Convert.run(m, args[0], args[1], args[2], args[3]);
            case 1879048415:
                return F0223_PKFormatConverter_Release.run(m, args[0]);
            case 1879048416:
                return F0224_getbfcpy.run(m, args[0], args[1], args[2], args[3], args[4]);
            case 1879048417:
                return F0225_getbfw.run(m, args[0], args[1], args[2], args[3]);
            case 1879048418:
                return F0226_getbfdw.run(m, args[0], args[1], args[2], args[3]);
            case 1879048419:
                return F0227_getbfwbig.run(m, args[0], args[1], args[2], args[3]);
            case 1879048420:
                return F0228_getbfdwbig.run(m, args[0], args[1], args[2], args[3]);
            case 1879048421:
                return F0229_getbfwe.run(m, args[0], args[1], args[2], args[3], args[4]);
            case 1879048422:
                return F0230_getbfdwe.run(m, args[0], args[1], args[2], args[3], args[4]);
            case 1879048423:
                return F0231_setbfcpy.run(m, args[0], args[1], args[2], args[3], args[4]);
            case 1879048424:
                return F0232_setbfw.run(m, args[0], args[1], args[2], args[3]);
            case 1879048425:
                return F0233_setbfdw.run(m, args[0], args[1], args[2], args[3]);
            case 1879048426:
                return F0234_setbfwbig.run(m, args[0], args[1], args[2], args[3]);
            case 1879048427:
                return F0235_setbfdwbig.run(m, args[0], args[1], args[2], args[3]);
            case 1879048428:
                return F0236_BufferCalcIFDSize.run(m, args[0], args[1], args[2], args[3], args[4]);
            case 1879048429:
                return F0237_StreamCalcIFDSize.run(m, args[0], args[1], args[2]);
            case 1879048430:
                return F0238_GetUShort.run(m, args[0], args[1], args[2]);
            case 1879048431:
                return F0239_GetULong.run(m, args[0], args[1], args[2]);
            case 1879048432:
                return F0240_BufferCopyIFD.run(m, args[0], args[1], args[2], args[3], args[4], args[5], args[6]);
            case 1879048433:
                return F0241_StreamCopyIFD.run(m, args[0], args[1], args[2], args[3], args[4]);
            case 1879048434:
                return F0242_PutUShort.run(m, args[0], args[1], args[2]);
            case 1879048435:
                return F0243_PutULong.run(m, args[0], args[1], args[2]);
            case 1879048436:
                return F0244_ReadBinaryData.run(m, args[0], args[1], args[2], args[3]);
            case 1879048437:
                return F0245_ReadPropvar.run(m, args[0], args[1], args[2], args[3], args[4]);
            case 1879048438:
                return F0246_WriteWmpDE.run(m, args[0], args[1], args[2], args[3], args[4]);
            case 1879048439:
                return F0247_transcodeQuantizer.run(m, args[0], args[1], args[2], args[3]);
            case 1879048441:
                return F0249_transcodeQuantizers.run(m, args[0], args[1], args[2], args[3], args[4], args[5]);
            case 1879048442:
                return F0250_transcodeQuantizersAlpha.run(m, args[0], args[1], args[2], args[3], args[4]);
            case 1879048443:
                return F0251_transcodeTileHeader.run(m, args[0], args[1]);
            case 1879048444:
                return F0252_transformDCBlock.run(m, args[0], args[1], args[2]);
            case 1879048445:
                return F0253_transformDCBlock422.run(m, args[0], args[1], args[2]);
            case 1879048446:
                return F0254_transformDCBlock420.run(m, args[0], args[1], args[2]);
            case 1879048447:
                return F0255_transformACBlocks.run(m, args[0], args[1], args[2]);
            case 1879048448:
                return F0256_transformACBlocks422.run(m, args[0], args[1], args[2]);
            case 1879048449:
                return F0257_transformACBlocks420.run(m, args[0], args[1], args[2]);
            case 1879048450:
                return F0258_getROI.run(m, args[0], args[1], args[2], args[3]);
            case 1879048452:
                return F0260_isTileBoundary.run(m, args[0], args[1], args[2], args[3]);
            case 1879048453:
                return F0261_isTileExtraction.run(m, args[0], args[1]);
            case 1879048454:
                return F0262_WMPhotoTranscode.run(m, args[0], args[1], args[2]);
            case 1879048455:
                return F0263_smoothMB.run(m, args[0], args[1], args[2], args[3]);
            case 1879048456:
                return F0264_smooth.run(m, args[0], args[1], args[2], args[3], args[4], args[5]);
            case 1879048457:
                return F0265_initPostProc.run(m, args[0], args[1], args[2]);
            case 1879048458:
                return F0266_termPostProc.run(m, args[0], args[1]);
            case 1879048459:
                return F0267_slideOneMBRow.run(m, args[0], args[1], args[2], args[3], args[4]);
            case 1879048460:
                return F0268_updatePostProcInfo.run(m, args[0], args[1], args[2], args[3]);
            case 1879048461:
                return F0269_postProcMB.run(m, args[0], args[1], args[2], args[3], args[4], args[5]);
            case 1879048462:
                return F0270_postProcBlock.run(m, args[0], args[1], args[2], args[3], args[4], args[5]);
            case 1879048463:
                return F0271_getHuff.run(m, args[0], args[1]);
            case 1879048464:
                return F0272_DecodeSignificantRun.run(m, args[0], args[1], args[2]);
            case 1879048465:
                return F0273__getBool16.run(m, args[0]);
            case 1879048466:
                return F0274_decodeQPIndex.run(m, args[0], args[1]);
            case 1879048467:
                return F0275_DecodeMacroblockLowpass.run(m, args[0], args[1], args[2], args[3]);
            case 1879048469:
                return F0277__getBit16.run(m, args[0], args[1]);
            case 1879048470:
                return F0278_DecodeSignificantAbsLevel.run(m, args[0], args[1]);
            case 1879048471:
                return F0279_DecodeIndex.run(m, args[0], args[1], args[2], args[3]);
            case 1879048472:
                return F0280_AdaptLowpassDec.run(m, args[0]);
            case 1879048473:
                return F0281_DecodeMacroblockDC.run(m, args[0], args[1], args[2], args[3]);
            case 1879048474:
                return F0282_DecodeMacroblockHighpass.run(m, args[0], args[1], args[2], args[3]);
            case 1879048475:
                return F0283_AdaptHighpassDec.run(m, args[0]);
            case 1879048476:
                return F0284_encodeQPIndex.run(m, args[0], args[1], args[2]);
            case 1879048477:
                return F0285_EncodeMacroblockDC.run(m, args[0], args[1], args[2], args[3]);
            case 1879048479:
                return F0287_EncodeSignificantAbsLevel.run(m, args[0], args[1], args[2]);
            case 1879048480:
                return F0288_EncodeMacroblockLowpass.run(m, args[0], args[1], args[2], args[3]);
            case 1879048481:
                return F0289_AdaptiveScan.run(m, args[0], args[1], args[2], args[3], args[4], args[5]);
            case 1879048482:
                return F0290_EncodeBlock.run(m, args[0], args[1], args[2], args[3], args[4], args[5], args[6]);
            case 1879048483:
                return F0291_AdaptLowpassEnc.run(m, args[0]);
            case 1879048484:
                return F0292_AdaptHighpassEnc.run(m, args[0]);
            case 1879048485:
                return F0293_EncodeMacroblockHighpass.run(m, args[0], args[1], args[2], args[3]);
            case 1879048486:
                return F0294_checkImageBuffer.run(m, args[0], args[1], args[2]);
            case 1879048487:
                return F0295_writeQPIndex.run(m, args[0], args[1], args[2]);
            case 1879048489:
                return F0297_putBit16.run(m, args[0], args[1], args[2]);
            case 1879048490:
                return F0298_readQPIndex.run(m, args[0], args[1]);
            case 1879048491:
                return F0299_getBit16.run(m, args[0], args[1]);
            case 1879048492:
                return F0300_getTilePos.run(m, args[0], args[1], args[2]);
            case 1879048493:
                return F0301_initMRPtr.run(m, args[0]);
            case 1879048494:
                return F0302_advanceMRPtr.run(m, args[0]);
            case 1879048495:
                return F0303_advanceOneMBRow.run(m, args[0]);
            case 1879048496:
                return F0304_swapMRPtr.run(m, args[0]);
            case 1879048497:
                return F0305_IDPEmpty.run(m, args[0]);
            case 1879048498:
                return F0306_WMPAlloc.run(m, args[0], args[1]);
            case 1879048499:
                return F0307_WMPFree.run(m, args[0]);
            case 1879048500:
                return F0308_CreateWS_File.run(m, args[0], args[1], args[2]);
            case 1879048501:
                return F0309_CloseWS_File.run(m, args[0]);
            case 1879048502:
                return F0310_EOSWS_File.run(m, args[0]);
            case 1879048503:
                return F0311_ReadWS_File.run(m, args[0], args[1], args[2]);
            case 1879048504:
                return F0312_WriteWS_File.run(m, args[0], args[1], args[2]);
            case 1879048505:
                return F0313_SetPosWS_File.run(m, args[0], args[1]);
            case 1879048506:
                return F0314_GetPosWS_File.run(m, args[0], args[1]);
            case 1879048514:
                return F0322_CreateWS_Memory.run(m, args[0], args[1], args[2]);
            case 1879048515:
                return F0323_CloseWS_Memory.run(m, args[0]);
            case 1879048516:
                return F0324_EOSWS_Memory.run(m, args[0]);
            case 1879048517:
                return F0325_ReadWS_Memory.run(m, args[0], args[1], args[2]);
            case 1879048518:
                return F0326_WriteWS_Memory.run(m, args[0], args[1], args[2]);
            case 1879048519:
                return F0327_SetPosWS_Memory.run(m, args[0], args[1]);
            case 1879048520:
                return F0328_GetPosWS_Memory.run(m, args[0], args[1]);
            case 1879048521:
                return F0329_CreateWS_List.run(m, args[0]);
            case 1879048522:
                return F0330_CloseWS_List.run(m, args[0]);
            case 1879048523:
                return F0331_ReadWS_List.run(m, args[0], args[1], args[2]);
            case 1879048524:
                return F0332_WriteWS_List.run(m, args[0], args[1], args[2]);
            case 1879048525:
                return F0333_SetPosWS_List.run(m, args[0], args[1]);
            case 1879048526:
                return F0334_GetPosWS_List.run(m, args[0], args[1]);
            case 1879048527:
                return F0335_attach_SB.run(m, args[0], args[1]);
            case 1879048528:
                return F0336_getBit32_SB.run(m, args[0], args[1]);
            case 1879048529:
                return F0337_flushToByte_SB.run(m, args[0]);
            case 1879048530:
                return F0338_getByteRead_SB.run(m, args[0]);
            case 1879048531:
                return F0339_detach_SB.run(m, args[0]);
            case 1879048532:
                return F0340__byteswap_ulong.run(m, args[0]);
            case 1879048533:
                return F0341_load4BE.run(m, args[0]);
            case 1879048534:
                return F0342_allocateBitIOInfo.run(m, args[0]);
            case 1879048535:
                return F0343_setBitIOPointers.run(m, args[0]);
            case 1879048536:
                return F0344_allocateTileInfo.run(m, args[0]);
            case 1879048537:
                return F0345_freeTileInfo.run(m, args[0]);
            case 1879048538:
                return F0346_freeQuantizer.run(m, args[0]);
            case 1879048539:
                return F0347_allocateQuantizer.run(m, args[0], args[1], args[2]);
            case 1879048540:
                return F0348_formatQuantizer.run(m, args[0], args[1], args[2], args[3], args[4], args[5]);
            case 1879048541:
                return F0349_setUniformQuantizer.run(m, args[0], args[1]);
            case 1879048542:
                return F0350_useDCQuantizer.run(m, args[0], args[1]);
            case 1879048543:
                return F0351_useLPQuantizer.run(m, args[0], args[1], args[2]);
            case 1879048544:
                return F0352_dquantBits.run(m, args[0]);
            case 1879048545:
                return F0353_peekBit16.run(m, args[0], args[1]);
            case 1879048546:
                return F0354_flushBit16.run(m, args[0], args[1]);
            case 1879048547:
                return F0355_getBool16.run(m, args[0]);
            case 1879048548:
                return F0356_getBit16s.run(m, args[0], args[1]);
            case 1879048549:
                return F0357_getBit32.run(m, args[0], args[1]);
            case 1879048550:
                return F0358_flushToByte.run(m, args[0]);
            case 1879048551:
                return F0359_putBit16z.run(m, args[0], args[1], args[2]);
            case 1879048552:
                return F0360_putBit32.run(m, args[0], args[1], args[2]);
            case 1879048553:
                return F0361_fillToByte.run(m, args[0]);
            case 1879048554:
                return F0362_getBit16_S.run(m, args[0], args[1], args[2]);
            case 1879048555:
                return F0363_readIS.run(m, args[0], args[1]);
            case 1879048556:
                return F0364_putBit16_S.run(m, args[0], args[1], args[2], args[3]);
            case 1879048557:
                return F0365_writeIS.run(m, args[0], args[1]);
            case 1879048558:
                return F0366_getSizeRead.run(m, args[0]);
            case 1879048559:
                return F0367_getSizeWrite.run(m, args[0]);
            case 1879048560:
                return F0368_getPosRead.run(m, args[0]);
            case 1879048561:
                return F0369_attachISRead.run(m, args[0], args[1], args[2]);
            case 1879048562:
                return F0370_detachISRead.run(m, args[0], args[1]);
            case 1879048563:
                return F0371_attachISWrite.run(m, args[0], args[1]);
            case 1879048564:
                return F0372_detachISWrite.run(m, args[0], args[1]);
            case 1879048565:
                return F0373_readQuantizerSB.run(m, args[0], args[1], args[2]);
            case 1879048566:
                return F0374_readQuantizer.run(m, args[0], args[1], args[2], args[3]);
            case 1879048567:
                return F0375_readPacketHeader.run(m, args[0], args[1], args[2]);
            case 1879048568:
                return F0376_readTileHeaderDC.run(m, args[0], args[1]);
            case 1879048569:
                return F0377_readTileHeaderLP.run(m, args[0], args[1]);
            case 1879048570:
                return F0378_readTileHeaderHP.run(m, args[0], args[1]);
            case 1879048571:
                return F0379_readPackets.run(m, args[0]);
            case 1879048572:
                return F0380_processMacroblockDec.run(m, args[0]);
            case 1879048573:
                return F0381_interpolateUV.run(m, args[0]);
            case 1879048574:
                return F0382_outputNChannel.run(m, args[0], args[1], args[2], args[3], args[4], args[5], args[6]);
            case 1879048575:
                return F0383_outputMBRowAlpha.run(m, args[0]);
            case 1879048576:
                return F0384_outputMBRow.run(m, args[0]);
            case 1879048578:
                return F0386_outputNChannelThumbnail.run(m, args[0], args[1], args[2], args[3], args[4]);
            case 1879048579:
                return F0387_decodeThumbnailAlpha.run(m, args[0], args[1], args[2], args[3]);
            case 1879048580:
                return F0388_decodeThumbnail.run(m, args[0]);
            case 1879048581:
                return F0389_readIndexTable.run(m, args[0]);
            case 1879048582:
                return F0390_GetVLWordEsc.run(m, args[0]);
            case 1879048583:
                return F0391_StrIODecInit.run(m, args[0]);
            case 1879048584:
                return F0392_StrIODecTerm.run(m, args[0]);
            case 1879048585:
                return F0393_initLookupTables.run(m, args[0]);
            case 1879048586:
                return F0394_setROI.run(m, args[0]);
            case 1879048587:
                return F0395_StrDecInit.run(m, args[0]);
            case 1879048588:
                return F0396_StrDecTerm.run(m, args[0]);
            case 1879048589:
                return F0397_ReadImagePlaneHeader.run(m, args[0], args[1], args[2], args[3]);
            case 1879048590:
                return F0398_ReadWMIHeader.run(m, args[0], args[1], args[2]);
            case 1879048591:
                return F0399_ImageStrDecGetInfo.run(m, args[0], args[1]);
            case 1879048592:
                return F0400_WMPhotoValidate.run(m, args[0], args[1]);
            case 1879048593:
                return F0401_ImageStrDecInit.run(m, args[0], args[1], args[2]);
            case 1879048594:
                return F0402_InitializeStrDec.run(m, args[0], args[1], args[2]);
            case 1879048595:
                return F0403_ImageStrDecDecode.run(m, args[0], args[1], args[2]);
            case 1879048596:
                return F0404_ImageStrDecTerm.run(m, args[0]);
            case 1879048597:
                return F0405_writeQuantizer.run(m, args[0], args[1], args[2], args[3], args[4]);
            case 1879048598:
                return F0406_writePacketHeader.run(m, args[0], args[1], args[2]);
            case 1879048599:
                return F0407_writeTileHeaderDC.run(m, args[0], args[1]);
            case 1879048600:
                return F0408_writeTileHeaderLP.run(m, args[0], args[1]);
            case 1879048601:
                return F0409_writeTileHeaderHP.run(m, args[0], args[1]);
            case 1879048602:
                return F0410_encodeMB.run(m, args[0], args[1], args[2]);
            case 1879048603:
                return F0411_processMacroblock.run(m, args[0]);
            case 1879048604:
                return F0412_StrIOEncInit.run(m, args[0]);
            case 1879048607:
                return F0415_writeIndexTableNull.run(m, args[0]);
            case 1879048608:
                return F0416_writeIndexTable.run(m, args[0]);
            case 1879048609:
                return F0417_copyTo.run(m, args[0], args[1], args[2]);
            case 1879048610:
                return F0418_StrIOEncTerm.run(m, args[0]);
            case 1879048612:
                return F0420_WriteImagePlaneHeader.run(m, args[0]);
            case 1879048613:
                return F0421_WriteWMIHeader.run(m, args[0]);
            case 1879048614:
                return F0422_StrEncInit.run(m, args[0]);
            case 1879048615:
                return F0423_setUniformTiling.run(m, args[0], args[1], args[2]);
            case 1879048616:
                return F0424_validateTiling.run(m, args[0], args[1], args[2]);
            case 1879048617:
                return F0425_ValidateArgs.run(m, args[0], args[1]);
            case 1879048618:
                return F0426_ImageStrEncInit.run(m, args[0], args[1], args[2]);
            case 1879048619:
                return F0427_inputMBRow.run(m, args[0]);
            case 1879048620:
                return F0428_InitializeStrEnc.run(m, args[0], args[1], args[2]);
            case 1879048621:
                return F0429_padHorizontally.run(m, args[0]);
            case 1879048622:
                return F0430_downsampleUV.run(m, args[0]);
            case 1879048623:
                return F0431_inputMBRowAlpha.run(m, args[0]);
            case 1879048624:
                return F0432_ImageStrEncEncode.run(m, args[0], args[1]);
            case 1879048625:
                return F0433_ImageStrEncTerm.run(m, args[0]);
            case 1879048626:
                return F0434_strDCT4x4Stage1.run(m, args[0]);
            case 1879048627:
                return F0435_strDCT4x4SecondStage.run(m, args[0]);
            case 1879048628:
                return F0436_strNormalizeEnc.run(m, args[0], args[1]);
            case 1879048629:
                return F0437_strDCT2x2dnEnc.run(m, args[0], args[1], args[2], args[3]);
            case 1879048630:
                return F0438_strPre2.run(m, args[0], args[1]);
            case 1879048631:
                return F0439_strPre2x2.run(m, args[0], args[1], args[2], args[3]);
            case 1879048632:
                return F0440_strPre4.run(m, args[0], args[1], args[2], args[3]);
            case 1879048633:
                return F0441_strPre4x4Stage1Split.run(m, args[0], args[1], args[2]);
            case 1879048634:
                return F0442_strPre4x4Stage1.run(m, args[0], args[1]);
            case 1879048635:
                return F0443_strPre4x4Stage2Split.run(m, args[0], args[1]);
            case 1879048636:
                return F0444_transformMacroblock.run(m, args[0]);
            case 1879048637:
                return F0445_strIDCT4x4Stage1.run(m, args[0]);
            case 1879048638:
                return F0446_strIDCT4x4Stage2.run(m, args[0]);
            case 1879048639:
                return F0447_strNormalizeDec.run(m, args[0], args[1]);
            case 1879048640:
                return F0448_strDCT2x2dnDec.run(m, args[0], args[1], args[2], args[3]);
            case 1879048641:
                return F0449_strPost2.run(m, args[0], args[1]);
            case 1879048642:
                return F0450_strPost2_alternate.run(m, args[0], args[1]);
            case 1879048643:
                return F0451_strPost2x2.run(m, args[0], args[1], args[2], args[3]);
            case 1879048644:
                return F0452_strPost2x2_alternate.run(m, args[0], args[1], args[2], args[3]);
            case 1879048645:
                return F0453_strPost4.run(m, args[0], args[1], args[2], args[3]);
            case 1879048646:
                return F0454_strPost4_alternate.run(m, args[0], args[1], args[2], args[3]);
            case 1879048647:
                return F0455_DCCompensate.run(m, args[0], args[1], args[2], args[3], args[4]);
            case 1879048648:
                return F0456_ClipDCL.run(m, args[0], args[1]);
            case 1879048649:
                return F0457_strPost4x4Stage1Split.run(m, args[0], args[1], args[2], args[3], args[4]);
            case 1879048650:
                return F0458_strPost4x4Stage1.run(m, args[0], args[1], args[2], args[3]);
            case 1879048651:
                return F0459_strPost4x4Stage1Split_alternate.run(m, args[0], args[1], args[2]);
            case 1879048652:
                return F0460_strPost4x4Stage1_alternate.run(m, args[0], args[1]);
            case 1879048653:
                return F0461_strPost4x4Stage2Split.run(m, args[0], args[1]);
            case 1879048654:
                return F0462_strPost4x4Stage2Split_alternate.run(m, args[0], args[1]);
            case 1879048655:
                return F0463_invTransformMacroblock.run(m, args[0]);
            case 1879048656:
                return F0464_invTransformMacroblock_alteredOperators_hard.run(m, args[0]);
            case 1879048657:
                return F0465_remapQP.run(m, args[0], args[1], args[2]);
            case 1879048658:
                return F0466_allocatePredInfo.run(m, args[0]);
            case 1879048659:
                return F0467_freePredInfo.run(m, args[0]);
            case 1879048660:
                return F0468_getACPredMode.run(m, args[0], args[1]);
            case 1879048661:
                return F0469_getDCACPredMode.run(m, args[0], args[1]);
            case 1879048662:
                return F0470_copyAC.run(m, args[0], args[1]);
            case 1879048663:
                return F0471_updatePredInfo.run(m, args[0], args[1], args[2], args[3]);
            case 1879048664:
                return F0472_dequantizeBlock4x4.run(m, args[0], args[1], args[2], args[3]);
            case 1879048665:
                return F0473_dequantizeBlock2x2.run(m, args[0], args[1], args[2]);
            case 1879048666:
                return F0474_dequantizeBlock4x2.run(m, args[0], args[1], args[2]);
            case 1879048667:
                return F0475_dequantizeMacroblock.run(m, args[0]);
            case 1879048668:
                return F0476_predDCACDec.run(m, args[0]);
            case 1879048669:
                return F0477_predACDec.run(m, args[0]);
            case 1879048670:
                return F0478_predCBPDec.run(m, args[0], args[1]);
            case 1879048671:
                return F0479_predCBPC422Dec.run(m, args[0], args[1], args[2], args[3], args[4]);
            case 1879048672:
                return F0480_predCBPC420Dec.run(m, args[0], args[1], args[2], args[3], args[4]);
            case 1879048673:
                return F0481_QUANT_Mulless.run(m, args[0], args[1], args[2]);
            case 1879048674:
                return F0482_MUL32HR.run(m, args[0], args[1], args[2]);
            case 1879048675:
                return F0483_QUANT.run(m, args[0], args[1], args[2], args[3]);
            case 1879048676:
                return F0484_quantizeMacroblock.run(m, args[0]);
            case 1879048677:
                return F0485_predMacroblockEnc.run(m, args[0]);
            case 1879048678:
                return F0486_predCBPEnc.run(m, args[0], args[1]);
            case 1879048679:
                return F0487_strDCT2x2dn.run(m, args[0], args[1], args[2], args[3]);
            case 1879048680:
                return F0488_strDCT2x2up.run(m, args[0], args[1], args[2], args[3]);
            case 1879048681:
                return F0489_FOURBUTTERFLY_HARDCODED1.run(m, args[0]);
            default:
                throw new IllegalStateException("Invalid function pointer: " + address);
        }
    }
}
