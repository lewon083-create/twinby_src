package i0;

import a0.u;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n[] f20789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n[][] f20790d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HashSet f20791e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f20792f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f20793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ByteOrder f20794b;

    static {
        n[] nVarArr = {new n("ImageWidth", 256, 3, 4), new n("ImageLength", 257, 3, 4), new n("Make", 271, 2), new n("Model", 272, 2), new n("Orientation", 274, 3), new n("XResolution", 282, 5), new n("YResolution", 283, 5), new n("ResolutionUnit", 296, 3), new n("Software", 305, 2), new n("DateTime", 306, 2), new n("YCbCrPositioning", 531, 3), new n("SubIFDPointer", 330, 4), new n("ExifIFDPointer", 34665, 4), new n("GPSInfoIFDPointer", 34853, 4)};
        n[] nVarArr2 = {new n("ExposureTime", 33434, 5), new n("FNumber", 33437, 5), new n("ExposureProgram", 34850, 3), new n("PhotographicSensitivity", 34855, 3), new n("SensitivityType", 34864, 3), new n("ExifVersion", 36864, 2), new n("DateTimeOriginal", 36867, 2), new n("DateTimeDigitized", 36868, 2), new n("ComponentsConfiguration", 37121, 7), new n("ShutterSpeedValue", 37377, 10), new n("ApertureValue", 37378, 5), new n("BrightnessValue", 37379, 10), new n("ExposureBiasValue", 37380, 10), new n("MaxApertureValue", 37381, 5), new n("MeteringMode", 37383, 3), new n("LightSource", 37384, 3), new n("Flash", 37385, 3), new n("FocalLength", 37386, 5), new n("SubSecTime", 37520, 2), new n("SubSecTimeOriginal", 37521, 2), new n("SubSecTimeDigitized", 37522, 2), new n("FlashpixVersion", 40960, 7), new n("ColorSpace", 40961, 3), new n("PixelXDimension", 40962, 3, 4), new n("PixelYDimension", 40963, 3, 4), new n("InteroperabilityIFDPointer", 40965, 4), new n("FocalPlaneResolutionUnit", 41488, 3), new n("SensingMethod", 41495, 3), new n("FileSource", 41728, 7), new n("SceneType", 41729, 7), new n("CustomRendered", 41985, 3), new n("ExposureMode", 41986, 3), new n("WhiteBalance", 41987, 3), new n("SceneCaptureType", 41990, 3), new n("Contrast", 41992, 3), new n("Saturation", 41993, 3), new n("Sharpness", 41994, 3)};
        n[] nVarArr3 = {new n("GPSVersionID", 0, 1), new n("GPSLatitudeRef", 1, 2), new n("GPSLatitude", 2, 5, 10), new n("GPSLongitudeRef", 3, 2), new n("GPSLongitude", 4, 5, 10), new n("GPSAltitudeRef", 5, 1), new n("GPSAltitude", 6, 5), new n("GPSTimeStamp", 7, 5), new n("GPSSpeedRef", 12, 2), new n("GPSTrackRef", 14, 2), new n("GPSImgDirectionRef", 16, 2), new n("GPSDestBearingRef", 23, 2), new n("GPSDestDistanceRef", 25, 2)};
        f20789c = new n[]{new n("SubIFDPointer", 330, 4), new n("ExifIFDPointer", 34665, 4), new n("GPSInfoIFDPointer", 34853, 4), new n("InteroperabilityIFDPointer", 40965, 4)};
        f20790d = new n[][]{nVarArr, nVarArr2, nVarArr3, new n[]{new n("InteroperabilityIndex", 1, 2)}};
        f20791e = new HashSet(Arrays.asList("FNumber", "ExposureTime", "GPSTimeStamp"));
        f20792f = new String(new byte[]{1, 2, 3, 0}, StandardCharsets.UTF_8);
    }

    public l(ByteOrder byteOrder, ArrayList arrayList) {
        f2.g.h("Malformed attributes list. Number of IFDs mismatch.", arrayList.size() == 4);
        this.f20794b = byteOrder;
        this.f20793a = arrayList;
    }

    public final Map a(int i) {
        f2.g.e(u.k(i, "Invalid IFD index: ", ". Index should be between [0, EXIF_TAGS.length] "), i, 0, 4);
        return (Map) this.f20793a.get(i);
    }
}
