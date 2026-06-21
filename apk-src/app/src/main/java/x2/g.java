package x2;

import a0.u;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.internal.measurement.j4;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import kotlin.KotlinVersion;
import l7.o;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static final byte[] A;
    public static final byte[] B;
    public static final byte[] C;
    public static final byte[] D;
    public static final byte[] E;
    public static final byte[] F;
    public static final byte[] G;
    public static final byte[] H;
    public static final byte[] I;
    public static final byte[] J;
    public static final byte[] K;
    public static final byte[] L;
    public static final byte[] M;
    public static final byte[] N;
    public static final byte[] O;
    public static final byte[] P;
    public static final String[] Q;
    public static final int[] R;
    public static final byte[] S;
    public static final d T;
    public static final d[][] U;
    public static final d[] V;
    public static final HashMap[] W;
    public static final HashMap[] X;
    public static final Set Y;
    public static final HashMap Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final Charset f35729a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final byte[] f35730b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final byte[] f35731c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final Pattern f35732d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final Pattern f35733e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final Pattern f35734f0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final boolean f35735u = Log.isLoggable("ExifInterface", 3);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int[] f35736v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int[] f35737w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final byte[] f35738x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final byte[] f35739y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final byte[] f35740z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FileDescriptor f35742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f35743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f35744d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap[] f35745e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashSet f35746f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ByteOrder f35747g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f35748h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f35749j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f35750k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f35751l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte[] f35752m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f35753n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f35754o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f35755p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f35756q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f35757r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public c f35758s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f35759t;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        f35736v = new int[]{8, 8, 8};
        f35737w = new int[]{8};
        f35738x = new byte[]{-1, -40, -1};
        f35739y = new byte[]{102, 116, 121, 112};
        f35740z = new byte[]{109, 105, 102, 49};
        A = new byte[]{104, 101, 105, 99};
        B = new byte[]{97, 118, 105, 102};
        C = new byte[]{97, 118, 105, 115};
        D = new byte[]{79, 76, 89, 77, 80, 0};
        E = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        F = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        G = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);
        H = new byte[]{82, 73, 70, 70};
        I = new byte[]{87, 69, 66, 80};
        J = new byte[]{69, 88, 73, 70};
        K = new byte[]{-99, 1, 42};
        L = "VP8X".getBytes(Charset.defaultCharset());
        M = "VP8L".getBytes(Charset.defaultCharset());
        N = "VP8 ".getBytes(Charset.defaultCharset());
        O = "ANIM".getBytes(Charset.defaultCharset());
        P = "ANMF".getBytes(Charset.defaultCharset());
        Q = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        R = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        S = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        d[] dVarArr = {new d("NewSubfileType", 254, 4), new d("SubfileType", KotlinVersion.MAX_COMPONENT_VALUE, 4), new d("ImageWidth", 256, 3, 4), new d("ImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7), new d("Xmp", 700, 1)};
        d[] dVarArr2 = {new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("SensitivityType", 34864, 3), new d("StandardOutputSensitivity", 34865, 4), new d("RecommendedExposureIndex", 34866, 4), new d("ISOSpeed", 34867, 4), new d("ISOSpeedLatitudeyyy", 34868, 4), new d("ISOSpeedLatitudezzz", 34869, 4), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("OffsetTime", 36880, 2), new d("OffsetTimeOriginal", 36881, 2), new d("OffsetTimeDigitized", 36882, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d("PixelXDimension", 40962, 3, 4), new d("PixelYDimension", 40963, 3, 4), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("CameraOwnerName", 42032, 2), new d("BodySerialNumber", 42033, 2), new d("LensSpecification", 42034, 5), new d("LensMake", 42035, 2), new d("LensModel", 42036, 2), new d("Gamma", 42240, 5), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        d[] dVarArr3 = {new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d("GPSLatitude", 2, 5, 10), new d("GPSLongitudeRef", 3, 2), new d("GPSLongitude", 4, 5, 10), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3), new d("GPSHPositioningError", 31, 5)};
        d[] dVarArr4 = {new d("InteroperabilityIndex", 1, 2)};
        d[] dVarArr5 = {new d("NewSubfileType", 254, 4), new d("SubfileType", KotlinVersion.MAX_COMPONENT_VALUE, 4), new d("ThumbnailImageWidth", 256, 3, 4), new d("ThumbnailImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("ThumbnailOrientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        T = new d("StripOffsets", 273, 3);
        U = new d[][]{dVarArr, dVarArr2, dVarArr3, dVarArr4, dVarArr5, dVarArr, new d[]{new d("ThumbnailImage", 256, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)}, new d[]{new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4)}, new d[]{new d("AspectFrame", 4371, 3)}, new d[]{new d("ColorSpace", 55, 3)}};
        V = new d[]{new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
        W = new HashMap[10];
        X = new HashMap[10];
        Y = Collections.unmodifiableSet(new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        Z = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        f35729a0 = charsetForName;
        f35730b0 = "Exif\u0000\u0000".getBytes(charsetForName);
        f35731c0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            d[][] dVarArr6 = U;
            if (i >= dVarArr6.length) {
                HashMap map = Z;
                d[] dVarArr7 = V;
                map.put(Integer.valueOf(dVarArr7[0].f35723a), 5);
                map.put(Integer.valueOf(dVarArr7[1].f35723a), 1);
                map.put(Integer.valueOf(dVarArr7[2].f35723a), 2);
                map.put(Integer.valueOf(dVarArr7[3].f35723a), 3);
                map.put(Integer.valueOf(dVarArr7[4].f35723a), 7);
                map.put(Integer.valueOf(dVarArr7[5].f35723a), 8);
                Pattern.compile(".*[1-9].*");
                f35732d0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f35733e0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f35734f0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            W[i] = new HashMap();
            X[i] = new HashMap();
            for (d dVar : dVarArr6[i]) {
                W[i].put(Integer.valueOf(dVar.f35723a), dVar);
                X[i].put(dVar.f35724b, dVar);
            }
            i++;
        }
    }

    public g(String str) throws Throwable {
        FileInputStream fileInputStream;
        boolean z5;
        d[][] dVarArr = U;
        this.f35745e = new HashMap[dVarArr.length];
        this.f35746f = new HashSet(dVarArr.length);
        this.f35747g = ByteOrder.BIG_ENDIAN;
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        this.f35741a = str;
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(str);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            try {
                Os.lseek(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                z5 = true;
            } catch (Exception unused) {
                if (f35735u) {
                    Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                }
                z5 = false;
            }
            if (z5) {
                this.f35742b = fileInputStream.getFD();
            } else {
                this.f35742b = null;
            }
            u(fileInputStream);
            j4.f(fileInputStream);
        } catch (Throwable th3) {
            th = th3;
            fileInputStream2 = fileInputStream;
            j4.f(fileInputStream2);
            throw th;
        }
    }

    public static double b(String str, String str2) {
        try {
            String[] strArrSplit = str.split(StringUtils.COMMA, -1);
            String[] strArrSplit2 = strArrSplit[0].split("/", -1);
            double d10 = Double.parseDouble(strArrSplit2[0].trim()) / Double.parseDouble(strArrSplit2[1].trim());
            String[] strArrSplit3 = strArrSplit[1].split("/", -1);
            double d11 = Double.parseDouble(strArrSplit3[0].trim()) / Double.parseDouble(strArrSplit3[1].trim());
            String[] strArrSplit4 = strArrSplit[2].split("/", -1);
            double d12 = ((Double.parseDouble(strArrSplit4[0].trim()) / Double.parseDouble(strArrSplit4[1].trim())) / 3600.0d) + (d11 / 60.0d) + d10;
            if (!str2.equals("S") && !str2.equals("W")) {
                if (!str2.equals("N") && !str2.equals("E")) {
                    throw new IllegalArgumentException();
                }
                return d12;
            }
            return -d12;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e3) {
            throw new IllegalArgumentException(e3);
        }
    }

    public static Pair r(String str) {
        if (str.contains(StringUtils.COMMA)) {
            String[] strArrSplit = str.split(StringUtils.COMMA, -1);
            Pair pairR = r(strArrSplit[0]);
            if (((Integer) pairR.first).intValue() == 2) {
                return pairR;
            }
            for (int i = 1; i < strArrSplit.length; i++) {
                Pair pairR2 = r(strArrSplit[i]);
                int iIntValue = (((Integer) pairR2.first).equals(pairR.first) || ((Integer) pairR2.second).equals(pairR.first)) ? ((Integer) pairR.first).intValue() : -1;
                int iIntValue2 = (((Integer) pairR.second).intValue() == -1 || !(((Integer) pairR2.first).equals(pairR.second) || ((Integer) pairR2.second).equals(pairR.second))) ? -1 : ((Integer) pairR.second).intValue();
                if (iIntValue == -1 && iIntValue2 == -1) {
                    return new Pair(2, -1);
                }
                if (iIntValue == -1) {
                    pairR = new Pair(Integer.valueOf(iIntValue2), -1);
                } else if (iIntValue2 == -1) {
                    pairR = new Pair(Integer.valueOf(iIntValue), -1);
                }
            }
            return pairR;
        }
        if (!str.contains("/")) {
            try {
                try {
                    long j10 = Long.parseLong(str);
                    return (j10 < 0 || j10 > 65535) ? j10 < 0 ? new Pair(9, -1) : new Pair(4, -1) : new Pair(3, 4);
                } catch (NumberFormatException unused) {
                    Double.parseDouble(str);
                    return new Pair(12, -1);
                }
            } catch (NumberFormatException unused2) {
                return new Pair(2, -1);
            }
        }
        String[] strArrSplit2 = str.split("/", -1);
        if (strArrSplit2.length == 2) {
            try {
                long j11 = (long) Double.parseDouble(strArrSplit2[0]);
                long j12 = (long) Double.parseDouble(strArrSplit2[1]);
                if (j11 >= 0 && j12 >= 0) {
                    if (j11 <= 2147483647L && j12 <= 2147483647L) {
                        return new Pair(10, 5);
                    }
                    return new Pair(5, -1);
                }
                return new Pair(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair(2, -1);
    }

    public static ByteOrder x(b bVar) throws IOException {
        short s10 = bVar.readShort();
        boolean z5 = f35735u;
        if (s10 == 18761) {
            if (z5) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s10 == 19789) {
            if (z5) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s10));
    }

    public final void A(String str) {
        for (int i = 0; i < U.length; i++) {
            this.f35745e[i].remove(str);
        }
    }

    public final void B(int i, String str, String str2) {
        HashMap[] mapArr = this.f35745e;
        if (mapArr[i].isEmpty() || mapArr[i].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i];
        map.put(str2, (c) map.get(str));
        mapArr[i].remove(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f9 A[Catch: all -> 0x0102, Exception -> 0x0105, TryCatch #19 {Exception -> 0x0105, all -> 0x0102, blocks: (B:79:0x00f5, B:81:0x00f9, B:88:0x0117, B:87:0x0108), top: B:128:0x00f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0108 A[Catch: all -> 0x0102, Exception -> 0x0105, TryCatch #19 {Exception -> 0x0105, all -> 0x0102, blocks: (B:79:0x00f5, B:81:0x00f9, B:88:0x0117, B:87:0x0108), top: B:128:0x00f5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void C() {
        /*
            Method dump skipped, instruction units count: 369
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.g.C():void");
    }

    public final void D(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws IOException {
        byte b2;
        if (f35735u) {
            Log.d("ExifInterface", "saveJpegAttributes starting with (inputStream: " + bufferedInputStream + ", outputStream: " + bufferedOutputStream + ")");
        }
        b bVar = new b(bufferedInputStream);
        i0.c cVar = new i0.c(bufferedOutputStream, ByteOrder.BIG_ENDIAN);
        if (bVar.readByte() != -1) {
            throw new IOException("Invalid marker");
        }
        cVar.a(-1);
        if (bVar.readByte() != -40) {
            throw new IOException("Invalid marker");
        }
        cVar.a(-40);
        cVar.a(-1);
        cVar.a(-31);
        this.f35754o = L(cVar);
        c cVar2 = this.f35758s;
        byte[] bArr = f35731c0;
        if (cVar2 != null) {
            cVar.write(-1);
            cVar.a(-31);
            cVar.i(bArr.length + 2 + this.f35758s.f35722d.length);
            cVar.write(bArr);
            cVar.write(this.f35758s.f35722d);
            this.f35759t = true;
        }
        byte[] bArr2 = new byte[4096];
        while (bVar.readByte() == -1) {
            do {
                b2 = bVar.readByte();
            } while (b2 == -1);
            if (b2 == -39 || b2 == -38) {
                cVar.a(-1);
                cVar.a(b2);
                j4.i(bVar, cVar);
                return;
            }
            if (b2 != -31) {
                cVar.a(-1);
                cVar.a(b2);
                int unsignedShort = bVar.readUnsignedShort();
                cVar.i(unsignedShort);
                int i = unsignedShort - 2;
                if (i < 0) {
                    throw new IOException("Invalid length");
                }
                while (i > 0) {
                    int i10 = bVar.read(bArr2, 0, Math.min(i, 4096));
                    if (i10 >= 0) {
                        cVar.write(bArr2, 0, i10);
                        i -= i10;
                    }
                }
            } else {
                int unsignedShort2 = bVar.readUnsignedShort();
                int length = unsignedShort2 - 2;
                if (length < 0) {
                    throw new IOException("Invalid length");
                }
                int length2 = bArr.length;
                byte[] bArr3 = f35730b0;
                byte[] bArr4 = length >= length2 ? new byte[bArr.length] : length >= bArr3.length ? new byte[bArr3.length] : null;
                if (bArr4 != null) {
                    bVar.readFully(bArr4);
                    if (j4.w(bArr4, bArr3) || j4.w(bArr4, bArr)) {
                        bVar.a(length - bArr4.length);
                    }
                }
                cVar.a(-1);
                cVar.a(b2);
                cVar.i(unsignedShort2);
                if (bArr4 != null) {
                    length -= bArr4.length;
                    cVar.write(bArr4);
                }
                while (length > 0) {
                    int i11 = bVar.read(bArr2, 0, Math.min(length, 4096));
                    if (i11 >= 0) {
                        cVar.write(bArr2, 0, i11);
                        length -= i11;
                    }
                }
            }
        }
        throw new IOException("Invalid marker");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0043 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0075 -> B:10:0x0041). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E(java.io.BufferedInputStream r9, java.io.BufferedOutputStream r10) {
        /*
            r8 = this;
            boolean r0 = x2.g.f35735u
            if (r0 == 0) goto L24
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "savePngAttributes starting with (inputStream: "
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r1 = ", outputStream: "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ExifInterface"
            android.util.Log.d(r1, r0)
        L24:
            x2.b r0 = new x2.b
            r0.<init>(r9)
            i0.c r9 = new i0.c
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r9.<init>(r10, r1)
            byte[] r10 = x2.g.F
            int r10 = r10.length
            com.google.android.gms.internal.measurement.j4.j(r0, r9, r10)
            x2.c r10 = r8.f35758s
            r1 = 1
            r2 = 0
            if (r10 != 0) goto L40
            boolean r10 = r8.f35759t
            if (r10 == 0) goto L75
        L40:
            r10 = r1
        L41:
            if (r1 != 0) goto L4a
            if (r10 == 0) goto L46
            goto L4a
        L46:
            com.google.android.gms.internal.measurement.j4.i(r0, r9)
            return
        L4a:
            int r3 = r0.readInt()
            int r4 = r0.readInt()
            r5 = 1229472850(0x49484452, float:820293.1)
            if (r4 != r5) goto L77
            r9.b(r3)
            r9.b(r4)
            int r3 = r3 + 4
            com.google.android.gms.internal.measurement.j4.j(r0, r9, r3)
            int r3 = r8.f35754o
            if (r3 != 0) goto L6a
            r8.M(r9)
            r1 = r2
        L6a:
            x2.c r3 = r8.f35758s
            if (r3 == 0) goto L41
            boolean r3 = r8.f35759t
            if (r3 != 0) goto L41
            r8.N(r9)
        L75:
            r10 = r2
            goto L41
        L77:
            r5 = 1700284774(0x65584966, float:6.383657E22)
            if (r4 != r5) goto L88
            if (r1 == 0) goto L88
            r8.M(r9)
            int r3 = r3 + 4
            r0.a(r3)
            r1 = r2
            goto L41
        L88:
            r5 = 1767135348(0x69545874, float:1.6044374E25)
            if (r4 != r5) goto Lba
            byte[] r5 = x2.g.G
            int r6 = r5.length
            if (r3 < r6) goto Lba
            int r6 = r5.length
            byte[] r7 = new byte[r6]
            r0.readFully(r7)
            int r6 = r3 - r6
            int r6 = r6 + 4
            boolean r5 = java.util.Arrays.equals(r7, r5)
            if (r5 == 0) goto Lad
            x2.c r10 = r8.f35758s
            if (r10 == 0) goto La9
            r8.N(r9)
        La9:
            r0.a(r6)
            goto L75
        Lad:
            r9.b(r3)
            r9.b(r4)
            r9.write(r7)
            com.google.android.gms.internal.measurement.j4.j(r0, r9, r6)
            goto L41
        Lba:
            r9.b(r3)
            r9.b(r4)
            int r3 = r3 + 4
            com.google.android.gms.internal.measurement.j4.j(r0, r9, r3)
            goto L41
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.g.E(java.io.BufferedInputStream, java.io.BufferedOutputStream):void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:0|2|(1:4)|5|(6:140|6|146|7|8|145)|(4:10|(1:12)|13|14)(3:20|21|(7:23|(1:25)(1:26)|27|(1:29)(1:30)|31|(4:33|(3:34|(1:36)|37)|(5:40|143|41|42|(1:154)(3:46|(2:48|155)(1:156)|49))|45)(2:(4:50|(1:52)|53|(1:159)(2:162|160))|58)|59)(6:60|61|(22:67|(1:69)(1:71)|70|72|73|(2:75|(1:77)(2:78|79))(3:80|81|(2:83|(3:85|(1:87)(1:88)|89)(2:90|91))(1:92))|93|(1:95)(1:97)|98|99|151|100|(1:102)(2:108|(2:110|111))|112|113|114|(1:116)|117|149|118|119|120)(1:66)|124|136|137))|15|113|114|(0)|117|149|118|119|120|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0295, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0298, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x027e A[Catch: all -> 0x0246, Exception -> 0x024b, TRY_ENTER, TRY_LEAVE, TryCatch #11 {Exception -> 0x024b, all -> 0x0246, blocks: (B:116:0x027e, B:102:0x023c, B:111:0x0257), top: B:145:0x0056 }] */
    /* JADX WARN: Type inference failed for: r24v0, types: [java.io.BufferedOutputStream, java.io.OutputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r24v1 */
    /* JADX WARN: Type inference failed for: r24v10, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r24v13 */
    /* JADX WARN: Type inference failed for: r24v14 */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r24v4 */
    /* JADX WARN: Type inference failed for: r24v8 */
    /* JADX WARN: Type inference failed for: r24v9 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.io.ByteArrayOutputStream, java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void F(java.io.BufferedInputStream r23, java.io.BufferedOutputStream r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 696
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.g.F(java.io.BufferedInputStream, java.io.BufferedOutputStream):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0489  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void G(java.lang.String r36, java.lang.String r37) {
        /*
            Method dump skipped, instruction units count: 1216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.g.G(java.lang.String, java.lang.String):void");
    }

    public final void H(b bVar) throws Throwable {
        String str;
        c cVar;
        int i;
        HashMap map = this.f35745e[4];
        c cVar2 = (c) map.get("Compression");
        if (cVar2 == null) {
            this.f35753n = 6;
            s(bVar, map);
            return;
        }
        int i10 = cVar2.i(this.f35747g);
        this.f35753n = i10;
        int i11 = 1;
        if (i10 != 1) {
            if (i10 == 6) {
                s(bVar, map);
                return;
            } else if (i10 != 7) {
                return;
            }
        }
        c cVar3 = (c) map.get("BitsPerSample");
        String str2 = "ExifInterface";
        if (cVar3 != null) {
            int[] iArr = (int[]) cVar3.k(this.f35747g);
            int[] iArr2 = f35736v;
            if (Arrays.equals(iArr2, iArr) || (this.f35743c == 3 && (cVar = (c) map.get("PhotometricInterpretation")) != null && (((i = cVar.i(this.f35747g)) == 1 && Arrays.equals(iArr, f35737w)) || (i == 6 && Arrays.equals(iArr, iArr2))))) {
                c cVar4 = (c) map.get("StripOffsets");
                c cVar5 = (c) map.get("StripByteCounts");
                if (cVar4 == null || cVar5 == null) {
                    return;
                }
                long[] jArrH = j4.h(cVar4.k(this.f35747g));
                long[] jArrH2 = j4.h(cVar5.k(this.f35747g));
                if (jArrH == null || jArrH.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (jArrH2 == null || jArrH2.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (jArrH.length != jArrH2.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j10 = 0;
                for (long j11 : jArrH2) {
                    j10 += j11;
                }
                int i12 = (int) j10;
                byte[] bArr = new byte[i12];
                this.f35749j = true;
                this.i = true;
                this.f35748h = true;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                while (i13 < jArrH.length) {
                    int i16 = (int) jArrH[i13];
                    int i17 = (int) jArrH2[i13];
                    if (i13 < jArrH.length - i11) {
                        str = str2;
                        if (i16 + i17 != jArrH[i13 + 1]) {
                            this.f35749j = false;
                        }
                    } else {
                        str = str2;
                    }
                    int i18 = i16 - i14;
                    if (i18 < 0) {
                        Log.d(str, "Invalid strip offset value");
                        return;
                    }
                    String str3 = str;
                    try {
                        bVar.a(i18);
                        int i19 = i14 + i18;
                        byte[] bArr2 = new byte[i17];
                        try {
                            bVar.readFully(bArr2);
                            i14 = i19 + i17;
                            System.arraycopy(bArr2, 0, bArr, i15, i17);
                            i15 += i17;
                            i13++;
                            str2 = str3;
                            i11 = 1;
                        } catch (EOFException unused) {
                            Log.d(str3, "Failed to read " + i17 + " bytes.");
                            return;
                        }
                    } catch (EOFException unused2) {
                        Log.d(str3, "Failed to skip " + i18 + " bytes.");
                        return;
                    }
                }
                this.f35752m = bArr;
                if (this.f35749j) {
                    this.f35750k = (int) jArrH[0];
                    this.f35751l = i12;
                    return;
                }
                return;
            }
        }
        if (f35735u) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    public final void I(int i, int i10) throws Throwable {
        HashMap[] mapArr = this.f35745e;
        boolean zIsEmpty = mapArr[i].isEmpty();
        boolean z5 = f35735u;
        if (zIsEmpty || mapArr[i10].isEmpty()) {
            if (z5) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        c cVar = (c) mapArr[i].get("ImageLength");
        c cVar2 = (c) mapArr[i].get("ImageWidth");
        c cVar3 = (c) mapArr[i10].get("ImageLength");
        c cVar4 = (c) mapArr[i10].get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            if (z5) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (cVar3 == null || cVar4 == null) {
            if (z5) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int i11 = cVar.i(this.f35747g);
        int i12 = cVar2.i(this.f35747g);
        int i13 = cVar3.i(this.f35747g);
        int i14 = cVar4.i(this.f35747g);
        if (i11 >= i13 || i12 >= i14) {
            return;
        }
        HashMap map = mapArr[i];
        mapArr[i] = mapArr[i10];
        mapArr[i10] = map;
    }

    public final void J(f fVar, int i) throws Throwable {
        c cVarF;
        c cVarF2;
        HashMap[] mapArr = this.f35745e;
        c cVar = (c) mapArr[i].get("DefaultCropSize");
        c cVar2 = (c) mapArr[i].get("SensorTopBorder");
        c cVar3 = (c) mapArr[i].get("SensorLeftBorder");
        c cVar4 = (c) mapArr[i].get("SensorBottomBorder");
        c cVar5 = (c) mapArr[i].get("SensorRightBorder");
        if (cVar != null) {
            if (cVar.f35719a == 5) {
                e[] eVarArr = (e[]) cVar.k(this.f35747g);
                if (eVarArr == null || eVarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(eVarArr));
                    return;
                } else {
                    cVarF = c.e(new e[]{eVarArr[0]}, this.f35747g);
                    cVarF2 = c.e(new e[]{eVarArr[1]}, this.f35747g);
                }
            } else {
                int[] iArr = (int[]) cVar.k(this.f35747g);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                cVarF = c.f(iArr[0], this.f35747g);
                cVarF2 = c.f(iArr[1], this.f35747g);
            }
            mapArr[i].put("ImageWidth", cVarF);
            mapArr[i].put("ImageLength", cVarF2);
            return;
        }
        if (cVar2 != null && cVar3 != null && cVar4 != null && cVar5 != null) {
            int i10 = cVar2.i(this.f35747g);
            int i11 = cVar4.i(this.f35747g);
            int i12 = cVar5.i(this.f35747g);
            int i13 = cVar3.i(this.f35747g);
            if (i11 <= i10 || i12 <= i13) {
                return;
            }
            c cVarF3 = c.f(i11 - i10, this.f35747g);
            c cVarF4 = c.f(i12 - i13, this.f35747g);
            mapArr[i].put("ImageLength", cVarF3);
            mapArr[i].put("ImageWidth", cVarF4);
            return;
        }
        c cVar6 = (c) mapArr[i].get("ImageLength");
        c cVar7 = (c) mapArr[i].get("ImageWidth");
        if (cVar6 == null || cVar7 == null) {
            c cVar8 = (c) mapArr[i].get("JPEGInterchangeFormat");
            c cVar9 = (c) mapArr[i].get("JPEGInterchangeFormatLength");
            if (cVar8 == null || cVar9 == null) {
                return;
            }
            int i14 = cVar8.i(this.f35747g);
            int i15 = cVar8.i(this.f35747g);
            fVar.b(i14);
            byte[] bArr = new byte[i15];
            fVar.readFully(bArr);
            g(new b(bArr), i14, i);
        }
    }

    public final void K() throws Throwable {
        I(0, 5);
        I(0, 4);
        I(5, 4);
        HashMap[] mapArr = this.f35745e;
        c cVar = (c) mapArr[1].get("PixelXDimension");
        c cVar2 = (c) mapArr[1].get("PixelYDimension");
        if (cVar != null && cVar2 != null) {
            mapArr[0].put("ImageWidth", cVar);
            mapArr[0].put("ImageLength", cVar2);
        }
        if (mapArr[4].isEmpty() && t(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        if (!t(mapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        B(0, "ThumbnailOrientation", "Orientation");
        B(0, "ThumbnailImageLength", "ImageLength");
        B(0, "ThumbnailImageWidth", "ImageWidth");
        B(5, "ThumbnailOrientation", "Orientation");
        B(5, "ThumbnailImageLength", "ImageLength");
        B(5, "ThumbnailImageWidth", "ImageWidth");
        B(4, "Orientation", "ThumbnailOrientation");
        B(4, "ImageLength", "ThumbnailImageLength");
        B(4, "ImageWidth", "ThumbnailImageWidth");
    }

    public final int L(i0.c cVar) throws IOException {
        HashMap[] mapArr;
        int i;
        int i10;
        char c8;
        char c9;
        int[] iArr;
        int i11;
        d[][] dVarArr = U;
        int[] iArr2 = new int[dVarArr.length];
        int[] iArr3 = new int[dVarArr.length];
        d[] dVarArr2 = V;
        for (d dVar : dVarArr2) {
            A(dVar.f35724b);
        }
        if (this.f35748h) {
            if (this.i) {
                A("StripOffsets");
                A("StripByteCounts");
            } else {
                A("JPEGInterchangeFormat");
                A("JPEGInterchangeFormatLength");
            }
        }
        int i12 = 0;
        while (true) {
            int length = dVarArr.length;
            mapArr = this.f35745e;
            if (i12 >= length) {
                break;
            }
            Iterator it = mapArr[i12].entrySet().iterator();
            while (it.hasNext()) {
                if (((Map.Entry) it.next()).getValue() == null) {
                    it.remove();
                }
            }
            i12++;
        }
        if (mapArr[1].isEmpty()) {
            i = 1;
            i10 = 0;
        } else {
            i = 1;
            i10 = 0;
            mapArr[0].put(dVarArr2[1].f35724b, c.c(0L, this.f35747g));
        }
        if (mapArr[2].isEmpty()) {
            c8 = 2;
        } else {
            c8 = 2;
            mapArr[i10].put(dVarArr2[2].f35724b, c.c(0L, this.f35747g));
        }
        if (mapArr[3].isEmpty()) {
            c9 = 3;
        } else {
            c9 = 3;
            mapArr[i].put(dVarArr2[3].f35724b, c.c(0L, this.f35747g));
        }
        int i13 = 4;
        if (this.f35748h) {
            if (this.i) {
                mapArr[4].put("StripOffsets", c.f(i10, this.f35747g));
                mapArr[4].put("StripByteCounts", c.f(this.f35751l, this.f35747g));
            } else {
                mapArr[4].put("JPEGInterchangeFormat", c.c(0L, this.f35747g));
                mapArr[4].put("JPEGInterchangeFormatLength", c.c(this.f35751l, this.f35747g));
            }
        }
        int i14 = 0;
        while (true) {
            int length2 = dVarArr.length;
            iArr = R;
            if (i14 >= length2) {
                break;
            }
            Iterator it2 = mapArr[i14].entrySet().iterator();
            int i15 = 0;
            while (it2.hasNext()) {
                c cVar2 = (c) ((Map.Entry) it2.next()).getValue();
                cVar2.getClass();
                int i16 = iArr[cVar2.f35719a] * cVar2.f35720b;
                if (i16 > 4) {
                    i15 += i16;
                }
            }
            iArr3[i14] = iArr3[i14] + i15;
            i14++;
        }
        int size = 8;
        for (int i17 = 0; i17 < dVarArr.length; i17++) {
            if (!mapArr[i17].isEmpty()) {
                iArr2[i17] = size;
                size = (mapArr[i17].size() * 12) + 6 + iArr3[i17] + size;
            }
        }
        if (this.f35748h) {
            if (this.i) {
                mapArr[4].put("StripOffsets", c.f(size, this.f35747g));
            } else {
                mapArr[4].put("JPEGInterchangeFormat", c.c(size, this.f35747g));
            }
            this.f35750k = size;
            size += this.f35751l;
        }
        if (this.f35743c == 4) {
            size += 8;
        }
        if (f35735u) {
            for (int i18 = 0; i18 < dVarArr.length; i18++) {
                Log.d("ExifInterface", String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i18), Integer.valueOf(iArr2[i18]), Integer.valueOf(mapArr[i18].size()), Integer.valueOf(iArr3[i18]), Integer.valueOf(size)));
            }
        }
        if (!mapArr[i].isEmpty()) {
            mapArr[0].put(dVarArr2[i].f35724b, c.c(iArr2[i], this.f35747g));
        }
        if (!mapArr[c8].isEmpty()) {
            mapArr[0].put(dVarArr2[c8].f35724b, c.c(iArr2[c8], this.f35747g));
        }
        if (!mapArr[c9].isEmpty()) {
            mapArr[i].put(dVarArr2[c9].f35724b, c.c(iArr2[c9], this.f35747g));
        }
        int i19 = this.f35743c;
        if (i19 == 4) {
            if (size > 65535) {
                throw new IllegalStateException(u.k(size, "Size of exif data (", " bytes) exceeds the max size of a JPEG APP1 segment (65536 bytes)"));
            }
            cVar.i(size);
            cVar.write(f35730b0);
        } else if (i19 == 13) {
            cVar.b(size);
            cVar.b(1700284774);
        } else if (i19 == 14) {
            cVar.write(J);
            cVar.b(size);
        }
        int size2 = ((DataOutputStream) cVar.f20765d).size();
        cVar.d(this.f35747g == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        cVar.f20764c = this.f35747g;
        cVar.i(42);
        cVar.h(8L);
        int i20 = 0;
        while (i20 < dVarArr.length) {
            if (mapArr[i20].isEmpty()) {
                i11 = i13;
            } else {
                cVar.i(mapArr[i20].size());
                int size3 = (mapArr[i20].size() * 12) + iArr2[i20] + 2 + i13;
                for (Map.Entry entry : mapArr[i20].entrySet()) {
                    int i21 = ((d) X[i20].get(entry.getKey())).f35723a;
                    c cVar3 = (c) entry.getValue();
                    cVar3.getClass();
                    int i22 = cVar3.f35720b;
                    int i23 = cVar3.f35719a;
                    int i24 = iArr[i23] * i22;
                    cVar.i(i21);
                    cVar.i(i23);
                    cVar.b(i22);
                    if (i24 > 4) {
                        cVar.h(size3);
                        size3 += i24;
                    } else {
                        cVar.write(cVar3.f35722d);
                        if (i24 < 4) {
                            while (i24 < 4) {
                                cVar.a(0);
                                i24++;
                            }
                        }
                    }
                    i13 = 4;
                }
                int i25 = i13;
                if (i20 != 0 || mapArr[i25].isEmpty()) {
                    cVar.h(0L);
                } else {
                    cVar.h(iArr2[i25]);
                }
                Iterator it3 = mapArr[i20].entrySet().iterator();
                while (it3.hasNext()) {
                    byte[] bArr = ((c) ((Map.Entry) it3.next()).getValue()).f35722d;
                    if (bArr.length > 4) {
                        cVar.write(bArr, 0, bArr.length);
                    }
                }
                i11 = 4;
            }
            i20++;
            i13 = i11;
        }
        if (this.f35748h) {
            cVar.write(p());
        }
        if (this.f35743c == 14 && size % 2 == i) {
            cVar.a(0);
        }
        cVar.f20764c = ByteOrder.BIG_ENDIAN;
        return size2;
    }

    public final void M(i0.c cVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f35754o = ((DataOutputStream) cVar.f20765d).size() + L(new i0.c(byteArrayOutputStream, ByteOrder.BIG_ENDIAN));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        cVar.write(byteArray);
        CRC32 crc32 = new CRC32();
        crc32.update(byteArray, 4, byteArray.length - 4);
        cVar.b((int) crc32.getValue());
    }

    public final void N(i0.c cVar) throws IOException {
        cVar.b(this.f35758s.f35722d.length + 22);
        CRC32 crc32 = new CRC32();
        cVar.b(1767135348);
        crc32.update(105);
        crc32.update(26964);
        crc32.update(6902872);
        crc32.update(1767135348);
        byte[] bArr = G;
        cVar.write(bArr);
        crc32.update(bArr);
        cVar.write(this.f35758s.f35722d);
        crc32.update(this.f35758s.f35722d);
        cVar.b((int) crc32.getValue());
        this.f35759t = true;
    }

    public final void a() {
        String strC = c("DateTimeOriginal");
        HashMap[] mapArr = this.f35745e;
        if (strC != null && c("DateTime") == null) {
            mapArr[0].put("DateTime", c.b(strC));
        }
        if (c("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", c.c(0L, this.f35747g));
        }
        if (c("ImageLength") == null) {
            mapArr[0].put("ImageLength", c.c(0L, this.f35747g));
        }
        if (c("Orientation") == null) {
            mapArr[0].put("Orientation", c.c(0L, this.f35747g));
        }
        if (c("LightSource") == null) {
            mapArr[1].put("LightSource", c.c(0L, this.f35747g));
        }
    }

    public final String c(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        c cVarE = e(str);
        if (cVarE != null) {
            int i = cVarE.f35719a;
            if (str.equals("GPSTimeStamp")) {
                if (i != 5 && i != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i);
                    return null;
                }
                e[] eVarArr = (e[]) cVarE.k(this.f35747g);
                if (eVarArr == null || eVarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(eVarArr));
                    return null;
                }
                e eVar = eVarArr[0];
                Integer numValueOf = Integer.valueOf((int) (eVar.f35727a / eVar.f35728b));
                e eVar2 = eVarArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (eVar2.f35727a / eVar2.f35728b));
                e eVar3 = eVarArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (eVar3.f35727a / eVar3.f35728b)));
            }
            if (!Y.contains(str)) {
                return cVarE.j(this.f35747g);
            }
            try {
                return Double.toString(cVarE.h(this.f35747g));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final int d(int i, String str) {
        c cVarE = e(str);
        if (cVarE == null) {
            return i;
        }
        try {
            return cVarE.i(this.f35747g);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public final c e(String str) {
        c cVar;
        int i;
        c cVar2;
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str)) {
            if (f35735u) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        if ("Xmp".equals(str) && (i = this.f35743c) != 4 && ((i == 9 || i == 15 || i == 12 || i == 13) && (cVar2 = this.f35758s) != null)) {
            return cVar2;
        }
        for (int i10 = 0; i10 < U.length; i10++) {
            c cVar3 = (c) this.f35745e[i10].get(str);
            if (cVar3 != null) {
                return cVar3;
            }
        }
        if (!"Xmp".equals(str) || (cVar = this.f35758s) == null) {
            return null;
        }
        return cVar;
    }

    public final void f(f fVar, int i) {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIC files is supported from SDK 28 and above");
        }
        if (i == 15 && i10 < 31) {
            throw new UnsupportedOperationException("Reading EXIF from AVIF files is supported from SDK 31 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(new a(fVar));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                HashMap[] mapArr = this.f35745e;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", c.f(Integer.parseInt(strExtractMetadata), this.f35747g));
                }
                if (strExtractMetadata3 != null) {
                    mapArr[0].put("ImageLength", c.f(Integer.parseInt(strExtractMetadata3), this.f35747g));
                }
                if (strExtractMetadata2 != null) {
                    int i11 = Integer.parseInt(strExtractMetadata2);
                    mapArr[0].put("Orientation", c.f(i11 != 90 ? i11 != 180 ? i11 != 270 ? 1 : 8 : 3 : 6, this.f35747g));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i12 = Integer.parseInt(strExtractMetadata4);
                    int i13 = Integer.parseInt(strExtractMetadata5);
                    if (i13 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    fVar.b(i12);
                    byte[] bArr = new byte[6];
                    fVar.readFully(bArr);
                    int i14 = i12 + 6;
                    int i15 = i13 - 6;
                    if (!Arrays.equals(bArr, f35730b0)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i15];
                    fVar.readFully(bArr2);
                    this.f35754o = i14;
                    y(0, bArr2);
                }
                String strExtractMetadata8 = mediaMetadataRetriever.extractMetadata(41);
                String strExtractMetadata9 = mediaMetadataRetriever.extractMetadata(42);
                if (strExtractMetadata8 != null && strExtractMetadata9 != null) {
                    int i16 = Integer.parseInt(strExtractMetadata8);
                    int i17 = Integer.parseInt(strExtractMetadata9);
                    long j10 = i16;
                    fVar.b(j10);
                    byte[] bArr3 = new byte[i17];
                    fVar.readFully(bArr3);
                    this.f35758s = new c(j10, bArr3, 1, i17);
                    this.f35759t = true;
                }
                if (f35735u) {
                    Log.d("ExifInterface", "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata3 + ", rotation " + strExtractMetadata2);
                }
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException unused) {
                }
            } catch (RuntimeException e3) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.", e3);
            }
        } catch (Throwable th2) {
            try {
                mediaMetadataRetriever.release();
            } catch (IOException unused2) {
            }
            throw th2;
        }
    }

    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    public final void g(x2.b r22, int r23, int r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 484
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.g.g(x2.b, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x00f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f1 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int h(java.io.BufferedInputStream r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.g.h(java.io.BufferedInputStream):int");
    }

    public final void i(f fVar) throws Throwable {
        int i;
        int i10;
        l(fVar);
        HashMap[] mapArr = this.f35745e;
        c cVar = (c) mapArr[1].get("MakerNote");
        if (cVar != null) {
            f fVar2 = new f(cVar.f35722d);
            fVar2.f35716d = this.f35747g;
            byte[] bArr = D;
            byte[] bArr2 = new byte[bArr.length];
            fVar2.readFully(bArr2);
            fVar2.b(0L);
            byte[] bArr3 = E;
            byte[] bArr4 = new byte[bArr3.length];
            fVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                fVar2.b(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                fVar2.b(12L);
            }
            z(fVar2, 6);
            c cVar2 = (c) mapArr[7].get("PreviewImageStart");
            c cVar3 = (c) mapArr[7].get("PreviewImageLength");
            if (cVar2 != null && cVar3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", cVar2);
                mapArr[5].put("JPEGInterchangeFormatLength", cVar3);
            }
            c cVar4 = (c) mapArr[8].get("AspectFrame");
            if (cVar4 != null) {
                int[] iArr = (int[]) cVar4.k(this.f35747g);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i11 = iArr[2];
                int i12 = iArr[0];
                if (i11 <= i12 || (i = iArr[3]) <= (i10 = iArr[1])) {
                    return;
                }
                int i13 = (i11 - i12) + 1;
                int i14 = (i - i10) + 1;
                if (i13 < i14) {
                    int i15 = i13 + i14;
                    i14 = i15 - i14;
                    i13 = i15 - i14;
                }
                c cVarF = c.f(i13, this.f35747g);
                c cVarF2 = c.f(i14, this.f35747g);
                mapArr[0].put("ImageWidth", cVarF);
                mapArr[0].put("ImageLength", cVarF2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
    
        r18.f35759t = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(x2.b r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.g.j(x2.b):void");
    }

    public final void k(b bVar) throws Throwable {
        boolean z5 = f35735u;
        if (z5) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.readFully(bArr);
        bVar.readFully(bArr2);
        bVar.readFully(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i10 = ByteBuffer.wrap(bArr2).getInt();
        int i11 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i10];
        bVar.a(i - bVar.f35715c);
        bVar.readFully(bArr4);
        g(new b(bArr4), i, 5);
        bVar.a(i11 - bVar.f35715c);
        bVar.f35716d = ByteOrder.BIG_ENDIAN;
        int i12 = bVar.readInt();
        if (z5) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i12);
        }
        for (int i13 = 0; i13 < i12; i13++) {
            int unsignedShort = bVar.readUnsignedShort();
            int unsignedShort2 = bVar.readUnsignedShort();
            if (unsignedShort == T.f35723a) {
                short s10 = bVar.readShort();
                short s11 = bVar.readShort();
                c cVarF = c.f(s10, this.f35747g);
                c cVarF2 = c.f(s11, this.f35747g);
                HashMap[] mapArr = this.f35745e;
                mapArr[0].put("ImageLength", cVarF);
                mapArr[0].put("ImageWidth", cVarF2);
                if (z5) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s10) + ", width: " + ((int) s11));
                    return;
                }
                return;
            }
            bVar.a(unsignedShort2);
        }
    }

    public final void l(f fVar) throws Throwable {
        v(fVar);
        z(fVar, 0);
        J(fVar, 0);
        J(fVar, 5);
        J(fVar, 4);
        K();
        if (this.f35743c == 8) {
            HashMap[] mapArr = this.f35745e;
            c cVar = (c) mapArr[1].get("MakerNote");
            if (cVar != null) {
                f fVar2 = new f(cVar.f35722d);
                fVar2.f35716d = this.f35747g;
                fVar2.a(6);
                z(fVar2, 9);
                c cVar2 = (c) mapArr[9].get("ColorSpace");
                if (cVar2 != null) {
                    mapArr[1].put("ColorSpace", cVar2);
                }
            }
        }
    }

    public final int m() {
        switch (d(1, "Orientation")) {
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

    public final void n(f fVar) throws Throwable {
        if (f35735u) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + fVar);
        }
        l(fVar);
        HashMap[] mapArr = this.f35745e;
        c cVar = (c) mapArr[0].get("JpgFromRaw");
        if (cVar != null) {
            g(new b(cVar.f35722d), (int) cVar.f35721c, 5);
        }
        c cVar2 = (c) mapArr[0].get("ISO");
        c cVar3 = (c) mapArr[1].get("PhotographicSensitivity");
        if (cVar2 == null || cVar3 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", cVar2);
    }

    public final boolean o(f fVar) throws IOException {
        byte[] bArr = f35730b0;
        byte[] bArr2 = new byte[bArr.length];
        fVar.readFully(bArr2);
        if (!Arrays.equals(bArr2, bArr)) {
            Log.w("ExifInterface", "Given data is not EXIF-only.");
            return false;
        }
        byte[] bArrCopyOf = new byte[1024];
        int i = 0;
        while (true) {
            if (i == bArrCopyOf.length) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length * 2);
            }
            int i10 = fVar.f35714b.read(bArrCopyOf, i, bArrCopyOf.length - i);
            if (i10 == -1) {
                byte[] bArrCopyOf2 = Arrays.copyOf(bArrCopyOf, i);
                this.f35754o = bArr.length;
                y(0, bArrCopyOf2);
                return true;
            }
            i += i10;
            fVar.f35715c += i10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x008b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x007a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] p() throws java.lang.Throwable {
        /*
            r10 = this;
            java.lang.String r0 = "Error closing fd."
            java.lang.String r1 = "ExifInterfaceUtils"
            java.lang.String r2 = "ExifInterface"
            boolean r3 = r10.f35748h
            r4 = 0
            if (r3 != 0) goto Ld
            goto L82
        Ld:
            byte[] r3 = r10.f35752m
            if (r3 == 0) goto L12
            return r3
        L12:
            java.lang.String r3 = r10.f35741a     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L23
            if (r3 == 0) goto L27
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L23
            java.lang.String r5 = r10.f35741a     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L23
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L23
            r5 = r4
            goto L3c
        L1f:
            r2 = move-exception
            r5 = r4
            goto L86
        L23:
            r3 = move-exception
            r5 = r4
            r6 = r5
            goto L70
        L27:
            java.io.FileDescriptor r3 = r10.f35742b     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L23
            java.io.FileDescriptor r3 = android.system.Os.dup(r3)     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L23
            int r5 = android.system.OsConstants.SEEK_SET     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            r6 = 0
            android.system.Os.lseek(r3, r6, r5)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            r9 = r5
            r5 = r3
            r3 = r9
        L3c:
            x2.b r6 = new x2.b     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            r6.<init>(r3)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            int r7 = r10.f35750k     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            int r8 = r10.f35754o     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            int r7 = r7 + r8
            r6.a(r7)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            int r7 = r10.f35751l     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            byte[] r7 = new byte[r7]     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            r6.readFully(r7)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            r10.f35752m = r7     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            com.google.android.gms.internal.measurement.j4.f(r3)
            if (r5 == 0) goto L5f
            android.system.Os.close(r5)     // Catch: android.system.ErrnoException -> L5b
            return r7
        L5b:
            r2 = move-exception
            android.util.Log.e(r1, r0, r2)
        L5f:
            return r7
        L60:
            r2 = move-exception
            r4 = r3
            goto L86
        L63:
            r6 = move-exception
            r9 = r5
            r5 = r3
            r3 = r6
            r6 = r9
            goto L70
        L69:
            r2 = move-exception
            r5 = r3
            goto L86
        L6c:
            r5 = move-exception
            r6 = r3
            r3 = r5
            r5 = r4
        L70:
            java.lang.String r7 = "Encountered exception while getting thumbnail"
            android.util.Log.d(r2, r7, r3)     // Catch: java.lang.Throwable -> L83
            com.google.android.gms.internal.measurement.j4.f(r5)
            if (r6 == 0) goto L82
            android.system.Os.close(r6)     // Catch: android.system.ErrnoException -> L7e
            goto L82
        L7e:
            r2 = move-exception
            android.util.Log.e(r1, r0, r2)
        L82:
            return r4
        L83:
            r2 = move-exception
            r4 = r5
            r5 = r6
        L86:
            com.google.android.gms.internal.measurement.j4.f(r4)
            if (r5 == 0) goto L93
            android.system.Os.close(r5)     // Catch: android.system.ErrnoException -> L8f
            goto L93
        L8f:
            r3 = move-exception
            android.util.Log.e(r1, r0, r3)
        L93:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.g.p():byte[]");
    }

    public final void q(b bVar) throws Throwable {
        if (f35735u) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.f35716d = ByteOrder.LITTLE_ENDIAN;
        bVar.a(H.length);
        int i = bVar.readInt() + 8;
        byte[] bArr = I;
        bVar.a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int i10 = bVar.readInt();
                int i11 = length + 8;
                if (Arrays.equals(J, bArr2)) {
                    byte[] bArrCopyOfRange = new byte[i10];
                    bVar.readFully(bArrCopyOfRange);
                    byte[] bArr3 = f35730b0;
                    if (j4.w(bArrCopyOfRange, bArr3)) {
                        bArrCopyOfRange = Arrays.copyOfRange(bArrCopyOfRange, bArr3.length, i10);
                    }
                    this.f35754o = i11;
                    y(0, bArrCopyOfRange);
                    H(new b(bArrCopyOfRange));
                    return;
                }
                if (i10 % 2 == 1) {
                    i10++;
                }
                length = i11 + i10;
                if (length == i) {
                    return;
                }
                if (length > i) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.a(i10);
            } catch (EOFException e3) {
                throw new IOException("Encountered corrupt WebP file.", e3);
            }
        }
    }

    public final void s(b bVar, HashMap map) throws Throwable {
        c cVar = (c) map.get("JPEGInterchangeFormat");
        c cVar2 = (c) map.get("JPEGInterchangeFormatLength");
        if (cVar == null || cVar2 == null) {
            return;
        }
        int i = cVar.i(this.f35747g);
        int i10 = cVar2.i(this.f35747g);
        if (this.f35743c == 7) {
            i += this.f35755p;
        }
        if (i > 0 && i10 > 0) {
            this.f35748h = true;
            if (this.f35741a == null && this.f35742b == null) {
                byte[] bArr = new byte[i10];
                bVar.a(i);
                bVar.readFully(bArr);
                this.f35752m = bArr;
            }
            this.f35750k = i;
            this.f35751l = i10;
        }
        if (f35735u) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + i + ", length: " + i10);
        }
    }

    public final boolean t(HashMap map) {
        c cVar = (c) map.get("ImageLength");
        c cVar2 = (c) map.get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            return false;
        }
        return cVar.i(this.f35747g) <= 512 && cVar2.i(this.f35747g) <= 512;
    }

    public final void u(InputStream inputStream) {
        boolean z5 = f35735u;
        for (int i = 0; i < U.length; i++) {
            try {
                try {
                    this.f35745e[i] = new HashMap();
                } catch (IOException | UnsupportedOperationException e3) {
                    if (z5) {
                        Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file (ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e3);
                    }
                    a();
                    if (z5) {
                        w();
                        return;
                    }
                    return;
                }
            } finally {
                a();
                if (z5) {
                    w();
                }
            }
        }
        boolean z10 = this.f35744d;
        if (!z10) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.f35743c = h(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        int i10 = this.f35743c;
        if (i10 == 4 || i10 == 9 || i10 == 13 || i10 == 14) {
            b bVar = new b(inputStream);
            int i11 = this.f35743c;
            if (i11 == 4) {
                g(bVar, 0, 0);
            } else if (i11 == 13) {
                j(bVar);
            } else if (i11 == 9) {
                k(bVar);
            } else if (i11 == 14) {
                q(bVar);
            }
        } else {
            f fVar = new f(inputStream);
            if (!z10) {
                int i12 = this.f35743c;
                if (i12 == 12 || i12 == 15) {
                    f(fVar, i12);
                } else if (i12 == 7) {
                    i(fVar);
                } else if (i12 == 10) {
                    n(fVar);
                } else {
                    l(fVar);
                }
            } else if (!o(fVar)) {
                if (z5) {
                    return;
                } else {
                    return;
                }
            }
            fVar.b(this.f35754o);
            H(fVar);
        }
        a();
        if (z5) {
            w();
        }
    }

    public final void v(f fVar) throws IOException {
        ByteOrder byteOrderX = x(fVar);
        this.f35747g = byteOrderX;
        fVar.f35716d = byteOrderX;
        int unsignedShort = fVar.readUnsignedShort();
        int i = this.f35743c;
        if (i != 7 && i != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i10 = fVar.readInt();
        if (i10 < 8) {
            throw new IOException(o.i(i10, "Invalid first Ifd offset: "));
        }
        int i11 = i10 - 8;
        if (i11 > 0) {
            fVar.a(i11);
        }
    }

    public final void w() {
        int i = 0;
        while (true) {
            HashMap[] mapArr = this.f35745e;
            if (i >= mapArr.length) {
                return;
            }
            StringBuilder sbM = o.m(i, "The size of tag group[", "]: ");
            sbM.append(mapArr[i].size());
            Log.d("ExifInterface", sbM.toString());
            for (Map.Entry entry : mapArr[i].entrySet()) {
                c cVar = (c) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + cVar.toString() + ", tagValue: '" + cVar.j(this.f35747g) + "'");
            }
            i++;
        }
    }

    public final void y(int i, byte[] bArr) throws IOException {
        f fVar = new f(bArr);
        v(fVar);
        z(fVar, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0158  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z(x2.f r30, int r31) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 940
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.g.z(x2.f, int):void");
    }

    public g(ByteArrayInputStream byteArrayInputStream) {
        d[][] dVarArr = U;
        this.f35745e = new HashMap[dVarArr.length];
        this.f35746f = new HashSet(dVarArr.length);
        this.f35747g = ByteOrder.BIG_ENDIAN;
        this.f35741a = null;
        this.f35744d = false;
        this.f35742b = null;
        u(byteArrayInputStream);
    }
}
