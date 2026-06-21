package i0;

import com.google.android.gms.internal.ads.gb;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final gb f20768b = new gb(8);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final gb f20769c = new gb(9);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final gb f20770d = new gb(10);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final List f20771e = Arrays.asList("ImageWidth", "ImageLength", "BitsPerSample", "Compression", "PhotometricInterpretation", "Orientation", "SamplesPerPixel", "PlanarConfiguration", "YCbCrSubSampling", "YCbCrPositioning", "XResolution", "YResolution", "ResolutionUnit", "StripOffsets", "RowsPerStrip", "StripByteCounts", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "TransferFunction", "WhitePoint", "PrimaryChromaticities", "YCbCrCoefficients", "ReferenceBlackWhite", "DateTime", "ImageDescription", "Make", "Model", "Software", "Artist", "Copyright", "ExifVersion", "FlashpixVersion", "ColorSpace", "Gamma", "PixelXDimension", "PixelYDimension", "ComponentsConfiguration", "CompressedBitsPerPixel", "MakerNote", "UserComment", "RelatedSoundFile", "DateTimeOriginal", "DateTimeDigitized", "OffsetTime", "OffsetTimeOriginal", "OffsetTimeDigitized", "SubSecTime", "SubSecTimeOriginal", "SubSecTimeDigitized", "ExposureTime", "FNumber", "ExposureProgram", "SpectralSensitivity", "PhotographicSensitivity", "OECF", "SensitivityType", "StandardOutputSensitivity", "RecommendedExposureIndex", "ISOSpeed", "ISOSpeedLatitudeyyy", "ISOSpeedLatitudezzz", "ShutterSpeedValue", "ApertureValue", "BrightnessValue", "ExposureBiasValue", "MaxApertureValue", "SubjectDistance", "MeteringMode", "LightSource", "Flash", "SubjectArea", "FocalLength", "FlashEnergy", "SpatialFrequencyResponse", "FocalPlaneXResolution", "FocalPlaneYResolution", "FocalPlaneResolutionUnit", "SubjectLocation", "ExposureIndex", "SensingMethod", "FileSource", "SceneType", "CFAPattern", "CustomRendered", "ExposureMode", "WhiteBalance", "DigitalZoomRatio", "FocalLengthIn35mmFilm", "SceneCaptureType", "GainControl", "Contrast", "Saturation", "Sharpness", "DeviceSettingDescription", "SubjectDistanceRange", "ImageUniqueID", "CameraOwnerName", "BodySerialNumber", "LensSpecification", "LensMake", "LensModel", "LensSerialNumber", "GPSVersionID", "GPSLatitudeRef", "GPSLatitude", "GPSLongitudeRef", "GPSLongitude", "GPSAltitudeRef", "GPSAltitude", "GPSTimeStamp", "GPSSatellites", "GPSStatus", "GPSMeasureMode", "GPSDOP", "GPSSpeedRef", "GPSSpeed", "GPSTrackRef", "GPSTrack", "GPSImgDirectionRef", "GPSImgDirection", "GPSMapDatum", "GPSDestLatitudeRef", "GPSDestLatitude", "GPSDestLongitudeRef", "GPSDestLongitude", "GPSDestBearingRef", "GPSDestBearing", "GPSDestDistanceRef", "GPSDestDistance", "GPSProcessingMethod", "GPSAreaInformation", "GPSDateStamp", "GPSDifferential", "GPSHPositioningError", "InteroperabilityIndex", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation", "DNGVersion", "DefaultCropSize", "ThumbnailImage", "PreviewImageStart", "PreviewImageLength", "AspectFrame", "SensorBottomBorder", "SensorLeftBorder", "SensorRightBorder", "SensorTopBorder", "ISO", "JpgFromRaw", "Xmp", "NewSubfileType", "SubfileType");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final List f20772f = Arrays.asList("ImageWidth", "ImageLength", "PixelXDimension", "PixelYDimension", "Compression", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x2.g f20773a;

    public g(x2.g gVar) {
        this.f20773a = gVar;
    }

    public final void a(g gVar) {
        x2.g gVar2 = gVar.f20773a;
        ArrayList<String> arrayList = new ArrayList(f20771e);
        arrayList.removeAll(f20772f);
        for (String str : arrayList) {
            String strC = this.f20773a.c(str);
            String strC2 = gVar2.c(str);
            if (strC != null && !strC.equals(strC2)) {
                gVar2.G(str, strC);
            }
        }
    }

    public final int b() {
        switch (this.f20773a.d(0, "Orientation")) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    public final void c(int i) {
        int i10 = i % 90;
        x2.g gVar = this.f20773a;
        if (i10 != 0) {
            Locale locale = Locale.US;
            com.google.android.gms.internal.auth.g.O("g", "Can only rotate in right angles (eg. 0, 90, 180, 270). " + i + " is unsupported.");
            gVar.G("Orientation", String.valueOf(0));
            return;
        }
        int i11 = i % 360;
        int iD = gVar.d(0, "Orientation");
        while (i11 < 0) {
            i11 += 90;
            switch (iD) {
                case 2:
                    iD = 5;
                    break;
                case 3:
                case 8:
                    iD = 6;
                    break;
                case 4:
                    iD = 7;
                    break;
                case 5:
                    iD = 4;
                    break;
                case 6:
                    iD = 1;
                    break;
                case 7:
                    iD = 2;
                    break;
                default:
                    iD = 8;
                    break;
            }
        }
        while (i11 > 0) {
            i11 -= 90;
            switch (iD) {
                case 2:
                    iD = 7;
                    break;
                case 3:
                    iD = 8;
                    break;
                case 4:
                    iD = 5;
                    break;
                case 5:
                    iD = 2;
                    break;
                case 6:
                    iD = 3;
                    break;
                case 7:
                    iD = 4;
                    break;
                case 8:
                    iD = 1;
                    break;
                default:
                    iD = 6;
                    break;
            }
        }
        gVar.G("Orientation", String.valueOf(iD));
    }

    public final void d() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        gb gbVar = f20770d;
        String str = ((SimpleDateFormat) gbVar.get()).format(new Date(jCurrentTimeMillis));
        x2.g gVar = this.f20773a;
        gVar.G("DateTime", str);
        try {
            gVar.G("SubSecTime", Long.toString(jCurrentTimeMillis - ((SimpleDateFormat) gbVar.get()).parse(str).getTime()));
        } catch (ParseException unused) {
        }
        gVar.C();
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x01b2, code lost:
    
        if (r3.equals("M") != false) goto L84;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0115 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00e6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0117 A[Catch: ParseException -> 0x0110, TRY_ENTER, TryCatch #0 {ParseException -> 0x0110, blocks: (B:55:0x0117, B:58:0x0130), top: B:121:0x0115 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 546
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.g.toString():java.lang.String");
    }
}
