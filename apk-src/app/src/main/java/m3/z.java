package m3;

import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.lg0;
import com.google.android.gms.internal.measurement.h5;
import com.google.android.gms.internal.measurement.j4;
import com.vk.api.sdk.exceptions.VKApiCodes;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.sentry.MeasurementUnit;
import io.sentry.protocol.User;
import io.sentry.rrweb.RRWebVideoEvent;
import j3.d0;
import java.io.Closeable;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.KotlinVersion;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f28608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f28609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long[] f28610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f28611d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f28612e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f28613f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f28614g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static HashMap f28615h;
    public static final String[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String[] f28616j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f28617k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f28618l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f28619m;

    static {
        int i10 = Build.VERSION.SDK_INT;
        String str = Build.DEVICE;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.MODEL;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(", ");
        sb2.append(str3);
        sb2.append(", ");
        sb2.append(str2);
        f28608a = l7.o.j(i10, ", ", sb2);
        f28609b = new byte[0];
        f28610c = new long[0];
        f28611d = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt ](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)?))?");
        f28612e = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f28613f = Pattern.compile("%([A-Fa-f0-9]{2})");
        f28614g = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        i = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", User.JsonKeys.GEO, "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f28616j = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f28617k = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f28618l = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        f28619m = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, VKApiCodes.CODE_ACCESS_DENIED_TO_AUDIO, 206, 219, 220, 213, 210, KotlinVersion.MAX_COMPONENT_VALUE, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, VKApiCodes.CODE_INVALID_PHOTO_FORMAT, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, ModuleDescriptor.MODULE_VERSION, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, VKApiCodes.CODE_ACCESS_DENIED_TO_ALBUM, 221, 218, 211, VKApiCodes.CODE_ERROR_WALL_ACCESS_REPLIES, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, VKApiCodes.CODE_INVALID_TIMESTAMP, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, VKApiCodes.CODE_ACCESS_DENIED_TO_GROUP, 230, 225, 232, 239, 250, VKApiCodes.CODE_ACCESS_POLLS_WITHOUT_VOTE, 244, 243};
    }

    public static long A(long j10) {
        return j10 == -9223372036854775807L ? System.currentTimeMillis() : SystemClock.elapsedRealtime() + j10;
    }

    public static int B(int i10, ByteOrder byteOrder) {
        if (i10 == 8) {
            return 3;
        }
        if (i10 == 16) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 2 : 268435456;
        }
        if (i10 == 24) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 21 : 1342177280;
        }
        if (i10 != 32) {
            return 0;
        }
        return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 22 : 1610612736;
    }

    public static long C(long j10, float f10) {
        return f10 == 1.0f ? j10 : Math.round(j10 / ((double) f10));
    }

    public static String D(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e3) {
            b.f("Util", "Failed to read system property ".concat(str), e3);
            return null;
        }
    }

    public static String E(int i10) {
        switch (i10) {
            case -2:
                return MeasurementUnit.NONE;
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return RRWebVideoEvent.EVENT_TAG;
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            case 6:
                return "camera motion";
            default:
                return i10 >= 10000 ? a0.u.k(i10, "custom (", ")") : "?";
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e1 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int F(android.net.Uri r7, java.lang.String r8) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.z.F(android.net.Uri, java.lang.String):int");
    }

    public static void G(int i10) {
        Integer.toString(i10, 36);
    }

    public static boolean H(int i10) {
        return i10 == 3 || i10 == 2 || i10 == 268435456 || i10 == 21 || i10 == 1342177280 || i10 == 22 || i10 == 1610612736 || i10 == 4;
    }

    public static boolean I(Context context) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
            return true;
        }
        if (i10 == 30) {
            String str = Build.MODEL;
            if (j4.n(str, "moto g(20)") || j4.n(str, "rmx3231")) {
                return true;
            }
        }
        return i10 == 34 && j4.n(Build.MODEL, "sm-x200");
    }

    public static boolean J(int i10) {
        return i10 == 10 || i10 == 13;
    }

    public static boolean K(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static boolean L(p pVar, p pVar2, Inflater inflater) {
        if (pVar.a() > 0 && pVar.j() == 120 && pVar.a() != 0) {
            if (pVar2.f28589a.length < pVar.a()) {
                pVar2.c(pVar.a() * 2);
            }
            if (inflater == null) {
                inflater = new Inflater();
            }
            inflater.setInput(pVar.f28589a, pVar.f28590b, pVar.a());
            int iInflate = 0;
            while (true) {
                try {
                    byte[] bArr = pVar2.f28589a;
                    iInflate += inflater.inflate(bArr, iInflate, bArr.length - iInflate);
                    if (!inflater.finished()) {
                        if (inflater.needsDictionary() || inflater.needsInput()) {
                            break;
                        }
                        byte[] bArr2 = pVar2.f28589a;
                        if (iInflate == bArr2.length) {
                            pVar2.c(bArr2.length * 2);
                        }
                    } else {
                        pVar2.L(iInflate);
                        inflater.reset();
                        return true;
                    }
                } catch (DataFormatException unused) {
                } catch (Throwable th2) {
                    inflater.reset();
                    throw th2;
                }
            }
            inflater.reset();
        }
        return false;
    }

    public static long M(long j10) {
        return (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? j10 : j10 * 1000;
    }

    public static String N(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace('_', '-');
        if (!strReplace.isEmpty() && !strReplace.equals("und")) {
            str = strReplace;
        }
        String strX = j4.x(str);
        int i10 = 0;
        String str2 = strX.split("-", 2)[0];
        if (f28615h == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            int length = iSOLanguages.length;
            String[] strArr = i;
            HashMap map = new HashMap(length + strArr.length);
            for (String str3 : iSOLanguages) {
                try {
                    String iSO3Language = new Locale(str3).getISO3Language();
                    if (!TextUtils.isEmpty(iSO3Language)) {
                        map.put(iSO3Language, str3);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            for (int i11 = 0; i11 < strArr.length; i11 += 2) {
                map.put(strArr[i11], strArr[i11 + 1]);
            }
            f28615h = map;
        }
        String str4 = (String) f28615h.get(str2);
        if (str4 != null) {
            StringBuilder sbJ = pe.a.j(str4);
            sbJ.append(strX.substring(str2.length()));
            strX = sbJ.toString();
            str2 = str4;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return strX;
        }
        while (true) {
            String[] strArr2 = f28616j;
            if (i10 >= strArr2.length) {
                return strX;
            }
            if (strX.startsWith(strArr2[i10])) {
                return strArr2[i10 + 1] + strX.substring(strArr2[i10].length());
            }
            i10 += 2;
        }
    }

    public static Object[] O(int i10, Object[] objArr) {
        h5.h(i10 <= objArr.length);
        return Arrays.copyOf(objArr, i10);
    }

    public static long P(String str) throws d0 {
        Matcher matcher = f28611d.matcher(str);
        if (!matcher.matches()) {
            throw d0.a(null, "Invalid date/time format: " + str);
        }
        int i10 = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            int i11 = Integer.parseInt(matcher.group(12)) * 60;
            String strGroup = matcher.group(13);
            i10 = strGroup != null ? Integer.parseInt(strGroup) + i11 : i11;
            if ("-".equals(matcher.group(11))) {
                i10 *= -1;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i10 != 0 ? timeInMillis - (((long) i10) * 60000) : timeInMillis;
    }

    public static void Q(Handler handler, Runnable runnable) {
        Looper looper = handler.getLooper();
        if (looper.getThread().isAlive()) {
            if (looper == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }
    }

    public static void R(ArrayList arrayList, int i10, int i11) {
        if (i10 < 0 || i11 > arrayList.size() || i10 > i11) {
            throw new IllegalArgumentException();
        }
        if (i10 != i11) {
            arrayList.subList(i10, i11).clear();
        }
    }

    public static long S(int i10, long j10) {
        return U(j10, 1000000L, i10, RoundingMode.DOWN);
    }

    public static void T(long[] jArr, long j10) {
        long j11;
        RoundingMode roundingMode = RoundingMode.DOWN;
        int i10 = 0;
        if (j10 >= 1000000 && j10 % 1000000 == 0) {
            long jI = com.google.android.gms.internal.auth.g.i(j10, 1000000L, RoundingMode.UNNECESSARY);
            while (i10 < jArr.length) {
                jArr[i10] = com.google.android.gms.internal.auth.g.i(jArr[i10], jI, roundingMode);
                i10++;
            }
            return;
        }
        if (j10 < 1000000 && 1000000 % j10 == 0) {
            long jI2 = com.google.android.gms.internal.auth.g.i(1000000L, j10, RoundingMode.UNNECESSARY);
            while (i10 < jArr.length) {
                jArr[i10] = com.google.android.gms.internal.auth.g.C(jArr[i10], jI2);
                i10++;
            }
            return;
        }
        int i11 = 0;
        while (i11 < jArr.length) {
            long j12 = jArr[i11];
            if (j12 != 0) {
                if (j10 >= j12 && j10 % j12 == 0) {
                    jArr[i11] = com.google.android.gms.internal.auth.g.i(1000000L, com.google.android.gms.internal.auth.g.i(j10, j12, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j10 >= j12 || j12 % j10 != 0) {
                    j11 = j10;
                    jArr[i11] = V(j12, 1000000L, j11, roundingMode);
                } else {
                    jArr[i11] = com.google.android.gms.internal.auth.g.C(1000000L, com.google.android.gms.internal.auth.g.i(j12, j10, RoundingMode.UNNECESSARY));
                }
                j11 = j10;
            } else {
                j11 = j10;
            }
            i11++;
            j10 = j11;
        }
    }

    public static long U(long j10, long j11, long j12, RoundingMode roundingMode) {
        if (j10 == 0 || j11 == 0) {
            return 0L;
        }
        return (j12 < j11 || j12 % j11 != 0) ? (j12 >= j11 || j11 % j12 != 0) ? (j12 < j10 || j12 % j10 != 0) ? (j12 >= j10 || j10 % j12 != 0) ? V(j10, j11, j12, roundingMode) : com.google.android.gms.internal.auth.g.C(j11, com.google.android.gms.internal.auth.g.i(j10, j12, RoundingMode.UNNECESSARY)) : com.google.android.gms.internal.auth.g.i(j11, com.google.android.gms.internal.auth.g.i(j12, j10, RoundingMode.UNNECESSARY), roundingMode) : com.google.android.gms.internal.auth.g.C(j10, com.google.android.gms.internal.auth.g.i(j11, j12, RoundingMode.UNNECESSARY)) : com.google.android.gms.internal.auth.g.i(j10, com.google.android.gms.internal.auth.g.i(j12, j11, RoundingMode.UNNECESSARY), roundingMode);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long V(long r9, long r11, long r13, java.math.RoundingMode r15) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.z.V(long, long, long, java.math.RoundingMode):long");
    }

    public static String[] W(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : str.trim().split("(\\s*,\\s*)", -1);
    }

    public static String X(int i10) {
        return new String(new byte[]{(byte) (i10 >> 24), (byte) (i10 >> 16), (byte) (i10 >> 8), (byte) i10}, StandardCharsets.US_ASCII);
    }

    public static String Y(byte[] bArr) {
        boolean z5;
        bd.b bVar = bd.e.f2066e;
        bd.e bVar2 = bVar.f2069c;
        if (bVar2 == null) {
            bd.a aVarB = bVar.f2067a;
            char[] cArr = aVarB.f2058b;
            int length = cArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (j4.q(cArr[i10])) {
                    int length2 = cArr.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= length2) {
                            z5 = false;
                            break;
                        }
                        char c8 = cArr[i11];
                        if (c8 >= 'a' && c8 <= 'z') {
                            z5 = true;
                            break;
                        }
                        i11++;
                    }
                    h5.q("Cannot call lowerCase() on a mixed-case alphabet", !z5);
                    char[] cArr2 = new char[cArr.length];
                    for (int i12 = 0; i12 < cArr.length; i12++) {
                        char c9 = cArr[i12];
                        if (j4.q(c9)) {
                            c9 = (char) (c9 ^ ' ');
                        }
                        cArr2[i12] = c9;
                    }
                    bd.a aVar = new bd.a(a0.u.o(new StringBuilder(), aVarB.f2057a, ".lowerCase()"), cArr2);
                    aVarB = aVarB.i ? aVar.b() : aVar;
                } else {
                    i10++;
                }
            }
            bVar2 = aVarB == bVar.f2067a ? bVar : new bd.b(aVarB);
            bVar.f2069c = bVar2;
        }
        int length3 = bArr.length;
        h5.p(0, length3, bArr.length);
        bd.a aVar2 = bVar2.f2067a;
        int i13 = aVar2.f2061e;
        int i14 = aVar2.f2062f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb2 = new StringBuilder(a0.e.f(length3, i14) * i13);
        try {
            bVar2.c(sb2, bArr, length3);
            return sb2.toString();
        } catch (IOException e3) {
            throw new AssertionError(e3);
        }
    }

    public static long Z(long j10) {
        return (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? j10 : j10 / 1000;
    }

    public static long a(long j10, long j11) {
        long j12 = j10 + j11;
        long j13 = (((j11 ^ j10) > 0L ? 1 : ((j11 ^ j10) == 0L ? 0 : -1)) < 0) | ((j10 ^ j12) >= 0) ? j12 : ((j12 >>> 63) ^ 1) + Long.MAX_VALUE;
        if ((j13 != Long.MIN_VALUE || j12 == Long.MIN_VALUE) && (j13 != Long.MAX_VALUE || j12 == Long.MAX_VALUE)) {
            return j13;
        }
        return Long.MAX_VALUE;
    }

    public static int b(long[] jArr, long j10, boolean z5) {
        int i10;
        int iBinarySearch = Arrays.binarySearch(jArr, j10);
        if (iBinarySearch < 0) {
            return ~iBinarySearch;
        }
        while (true) {
            i10 = iBinarySearch + 1;
            if (i10 >= jArr.length || jArr[i10] != j10) {
                break;
            }
            iBinarySearch = i10;
        }
        return z5 ? iBinarySearch : i10;
    }

    public static int c(lg0 lg0Var, long j10) {
        int i10 = lg0Var.f7509a - 1;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            if (lg0Var.c(i12) < j10) {
                i11 = i12 + 1;
            } else {
                i10 = i12 - 1;
            }
        }
        int i13 = i10 + 1;
        if (i13 < lg0Var.f7509a && lg0Var.c(i13) == j10) {
            return i13;
        }
        if (i10 == -1) {
            return 0;
        }
        return i10;
    }

    public static int d(List list, Long l10, boolean z5) {
        int i10;
        int iBinarySearch = Collections.binarySearch(list, l10);
        if (iBinarySearch < 0) {
            i10 = -(iBinarySearch + 2);
        } else {
            while (true) {
                int i11 = iBinarySearch - 1;
                if (i11 < 0 || ((Comparable) list.get(i11)).compareTo(l10) != 0) {
                    break;
                }
                iBinarySearch = i11;
            }
            i10 = iBinarySearch;
        }
        return z5 ? Math.max(0, i10) : i10;
    }

    public static int e(int[] iArr, int i10, boolean z5, boolean z10) {
        int i11;
        int i12;
        int iBinarySearch = Arrays.binarySearch(iArr, i10);
        if (iBinarySearch < 0) {
            i12 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i11 = iBinarySearch - 1;
                if (i11 < 0 || iArr[i11] != i10) {
                    break;
                }
                iBinarySearch = i11;
            }
            i12 = z5 ? iBinarySearch : i11;
        }
        return z10 ? Math.max(0, i12) : i12;
    }

    public static int f(long[] jArr, long j10, boolean z5) {
        int i10;
        int iBinarySearch = Arrays.binarySearch(jArr, j10);
        if (iBinarySearch < 0) {
            i10 = -(iBinarySearch + 2);
        } else {
            while (true) {
                int i11 = iBinarySearch - 1;
                if (i11 < 0 || jArr[i11] != j10) {
                    break;
                }
                iBinarySearch = i11;
            }
            i10 = iBinarySearch;
        }
        return z5 ? Math.max(0, i10) : i10;
    }

    public static int g(int i10, int i11) {
        return ((i10 + i11) - 1) / i11;
    }

    public static void h(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static float i(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f10, f12));
    }

    public static int j(int i10, int i11, int i12) {
        return Math.max(i11, Math.min(i10, i12));
    }

    public static long k(long j10, long j11, long j12) {
        return Math.max(j11, Math.min(j10, j12));
    }

    public static boolean l(SparseArray sparseArray, int i10) {
        return sparseArray.indexOfKey(i10) >= 0;
    }

    public static boolean m(Object[] objArr, Object obj) {
        for (Object obj2 : objArr) {
            if (Objects.equals(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    public static int n(int i10, int i11, int i12, byte[] bArr) {
        while (i10 < i11) {
            i12 = f28617k[((i12 >>> 24) ^ (bArr[i10] & 255)) & KotlinVersion.MAX_COMPONENT_VALUE] ^ (i12 << 8);
            i10++;
        }
        return i12;
    }

    public static Handler o(Handler.Callback callback) {
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        return new Handler(looperMyLooper, callback);
    }

    public static String p(byte[] bArr) {
        return new String(bArr, StandardCharsets.UTF_8);
    }

    public static int q(int i10) {
        if (i10 == 30) {
            return 34;
        }
        switch (i10) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
                return 28;
            default:
                switch (i10) {
                    case 14:
                        return 25;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        return 28;
                    default:
                        switch (i10) {
                            case 20:
                                return 30;
                            case 21:
                            case 22:
                                return 31;
                            default:
                                return Integer.MAX_VALUE;
                        }
                }
        }
    }

    public static int r(int i10) {
        if (i10 == 10) {
            return Build.VERSION.SDK_INT >= 32 ? 737532 : 6396;
        }
        if (i10 == 16) {
            return Build.VERSION.SDK_INT >= 32 ? 205215996 : 0;
        }
        if (i10 == 24) {
            return Build.VERSION.SDK_INT >= 32 ? 67108860 : 0;
        }
        switch (i10) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            default:
                switch (i10) {
                    case 13:
                        if (Build.VERSION.SDK_INT >= 32) {
                        }
                        break;
                    case 14:
                        if (Build.VERSION.SDK_INT >= 32) {
                        }
                        break;
                }
                break;
        }
        return 0;
    }

    public static int s(int i10) {
        if (i10 != 2) {
            if (i10 == 3) {
                return 1;
            }
            if (i10 != 4) {
                if (i10 != 21) {
                    if (i10 != 22) {
                        if (i10 != 268435456) {
                            if (i10 != 1342177280) {
                                if (i10 != 1610612736) {
                                    throw new IllegalArgumentException();
                                }
                            }
                        }
                    }
                }
                return 3;
            }
            return 4;
        }
        return 2;
    }

    public static byte[] t(String str) {
        bd.b bVar = bd.e.f2066e;
        bd.e bVar2 = bVar.f2070d;
        if (bVar2 == null) {
            bd.a aVarB = bVar.f2067a.b();
            bVar2 = aVarB == bVar.f2067a ? bVar : new bd.b(aVarB);
            bVar.f2070d = bVar2;
        }
        try {
            CharSequence charSequenceD = bVar2.d(str);
            int length = (int) (((((long) bVar2.f2067a.f2060d) * ((long) charSequenceD.length())) + 7) / 8);
            byte[] bArr = new byte[length];
            int iA = bVar2.a(bArr, charSequenceD);
            if (iA == length) {
                return bArr;
            }
            byte[] bArr2 = new byte[iA];
            System.arraycopy(bArr, 0, bArr2, 0, iA);
            return bArr2;
        } catch (bd.d e3) {
            throw new IllegalArgumentException(e3);
        }
    }

    public static int u(int i10, String str) {
        int i11 = 0;
        for (String str2 : W(str)) {
            if (i10 == j3.c0.h(j3.c0.d(str2))) {
                i11++;
            }
        }
        return i11;
    }

    public static String v(int i10, String str) {
        String[] strArrW = W(str);
        if (strArrW.length == 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : strArrW) {
            if (i10 == j3.c0.h(j3.c0.d(str2))) {
                if (sb2.length() > 0) {
                    sb2.append(StringUtils.COMMA);
                }
                sb2.append(str2);
            }
        }
        if (sb2.length() > 0) {
            return sb2.toString();
        }
        return null;
    }

    public static Point w(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && K(context)) {
            String strD = Build.VERSION.SDK_INT < 28 ? D("sys.display-size") : D("vendor.display-size");
            if (!TextUtils.isEmpty(strD)) {
                try {
                    String[] strArrSplit = strD.trim().split("x", -1);
                    if (strArrSplit.length == 2) {
                        int i10 = Integer.parseInt(strArrSplit[0]);
                        int i11 = Integer.parseInt(strArrSplit[1]);
                        if (i10 > 0 && i11 > 0) {
                            return new Point(i10, i11);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                b.e("Util", "Invalid display size: " + strD);
            }
            if ("Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
        return point;
    }

    public static int x(int i10) {
        if (i10 == 2 || i10 == 4) {
            return 6005;
        }
        if (i10 == 10) {
            return 6004;
        }
        if (i10 == 7) {
            return 6005;
        }
        if (i10 == 8) {
            return 6003;
        }
        switch (i10) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i10) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    public static int y(String str) {
        String[] strArrSplit;
        int length;
        int i10 = 0;
        if (str == null || (length = (strArrSplit = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = strArrSplit[length - 1];
        boolean z5 = length >= 3 && "neg".equals(strArrSplit[length - 2]);
        try {
            str2.getClass();
            i10 = Integer.parseInt(str2);
            if (z5) {
                return -i10;
            }
        } catch (NumberFormatException unused) {
        }
        return i10;
    }

    public static long z(long j10, float f10) {
        return f10 == 1.0f ? j10 : Math.round(j10 * ((double) f10));
    }
}
