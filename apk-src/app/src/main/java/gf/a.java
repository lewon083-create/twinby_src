package gf;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.ads.om1;
import com.vk.api.sdk.exceptions.VKApiCodes;
import com.vk.sdk.api.base.dto.BaseBoolInt;
import io.sentry.ILogger;
import io.sentry.ObjectWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import m3.b;
import t.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class a {
    public static int a(String str) throws NoSuchFieldException {
        String str2;
        for (int i : z.p(2)) {
            if (i == 1) {
                str2 = "Brightness.light";
            } else {
                if (i != 2) {
                    throw null;
                }
                str2 = "Brightness.dark";
            }
            if (str2.equals(str)) {
                return i;
            }
        }
        throw new NoSuchFieldException(om1.k("No such Brightness: ", str));
    }

    public static int b(String str) throws NoSuchFieldException {
        for (int i : z.p(8)) {
            String str2 = null;
            switch (i) {
                case 1:
                    break;
                case 2:
                    str2 = "HapticFeedbackType.lightImpact";
                    break;
                case 3:
                    str2 = "HapticFeedbackType.mediumImpact";
                    break;
                case 4:
                    str2 = "HapticFeedbackType.heavyImpact";
                    break;
                case 5:
                    str2 = "HapticFeedbackType.selectionClick";
                    break;
                case 6:
                    str2 = "HapticFeedbackType.successNotification";
                    break;
                case 7:
                    str2 = "HapticFeedbackType.warningNotification";
                    break;
                case 8:
                    str2 = "HapticFeedbackType.errorNotification";
                    break;
                default:
                    throw null;
            }
            if ((str2 == null && str == null) || (str2 != null && str2.equals(str))) {
                return i;
            }
        }
        throw new NoSuchFieldException(om1.k("No such HapticFeedbackType: ", str));
    }

    public static int c(String str) throws NoSuchFieldException {
        String str2;
        for (int i : z.p(3)) {
            if (i == 1) {
                str2 = "SystemSoundType.click";
            } else if (i == 2) {
                str2 = "SystemSoundType.tick";
            } else {
                if (i != 3) {
                    throw null;
                }
                str2 = "SystemSoundType.alert";
            }
            if (str2.equals(str)) {
                return i;
            }
        }
        throw new NoSuchFieldException(om1.k("No such SoundType: ", str));
    }

    public static /* synthetic */ int d(int i) {
        switch (i) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 8;
            case 5:
                return 16;
            case 6:
                return 32;
            case 7:
                return 64;
            case 8:
                return 128;
            case 9:
                return 256;
            case 10:
                return 512;
            case 11:
                return 1024;
            case 12:
                return 2048;
            case 13:
                return 4096;
            case 14:
                return 8192;
            case 15:
                return 16384;
            case 16:
                return 32768;
            case 17:
                return 65536;
            case 18:
                return 131072;
            case 19:
                return 262144;
            case 20:
                return 524288;
            case 21:
                return 1048576;
            case 22:
                return 2097152;
            case 23:
                return 4194304;
            case 24:
                return 8388608;
            case 25:
                return 16777216;
            case 26:
                return 33554432;
            case 27:
                return 67108864;
            case 28:
                return 134217728;
            case 29:
                return 268435456;
            case 30:
                return 536870912;
            case 31:
                return 1073741824;
            case 32:
                return VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
            default:
                throw null;
        }
    }

    public static int e(int i, int i10, String str) {
        return (str.hashCode() + i) * i10;
    }

    public static int f(BaseBoolInt baseBoolInt, int i, int i10) {
        return (baseBoolInt.hashCode() + i) * i10;
    }

    public static Object g(int i, ArrayList arrayList) {
        return arrayList.get(arrayList.size() - i);
    }

    public static String h(int i, String str, String str2, String str3, List list) {
        return str + i + str2 + list + str3;
    }

    public static String i(RecyclerView recyclerView, StringBuilder sb2) {
        sb2.append(recyclerView.exceptionLabel());
        return sb2.toString();
    }

    public static String j(String str, Integer num, String str2, List list, String str3) {
        return str + num + str2 + list + str3;
    }

    public static String k(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String l(StringBuilder sb2, List list, String str, List list2, String str2) {
        sb2.append(list);
        sb2.append(str);
        sb2.append(list2);
        sb2.append(str2);
        return sb2.toString();
    }

    public static StringBuilder m(int i, String str, String str2, String str3, List list) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i);
        sb2.append(str2);
        sb2.append(list);
        sb2.append(str3);
        return sb2;
    }

    public static StringBuilder n(String str, String str2, long j10) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(j10);
        sb2.append(str2);
        return sb2;
    }

    public static void o(int i, int i10, int i11, int i12, int i13) {
        m3.z.G(i);
        m3.z.G(i10);
        m3.z.G(i11);
        m3.z.G(i12);
        m3.z.G(i13);
    }

    public static void p(int i, String str, String str2) {
        b.s(str2, str + i);
    }

    public static void q(int i, String str, String str2, String str3, StringBuilder sb2) {
        sb2.append(i);
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
    }

    public static void r(Integer num, String str, String str2, String str3, StringBuilder sb2) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(num);
        sb2.append(str3);
    }

    public static void s(StringBuilder sb2, BaseBoolInt baseBoolInt, String str, BaseBoolInt baseBoolInt2, String str2) {
        sb2.append(baseBoolInt);
        sb2.append(str);
        sb2.append(baseBoolInt2);
        sb2.append(str2);
    }

    public static void t(StringBuilder sb2, Integer num, String str, Integer num2, String str2) {
        sb2.append(num);
        sb2.append(str);
        sb2.append(num2);
        sb2.append(str2);
    }

    public static void u(StringBuilder sb2, List list, String str, List list2, String str2) {
        sb2.append(list);
        sb2.append(str);
        sb2.append(list2);
        sb2.append(str2);
    }

    public static void v(Map map, String str, ObjectWriter objectWriter, String str2, ILogger iLogger) {
        Object obj = map.get(str);
        objectWriter.name(str2);
        objectWriter.value(iLogger, obj);
    }

    public static /* synthetic */ String w(int i) {
        if (i == 1) {
            return "PORTRAIT_UP";
        }
        if (i == 2) {
            return "PORTRAIT_DOWN";
        }
        if (i == 3) {
            return "LANDSCAPE_LEFT";
        }
        if (i == 4) {
            return "LANDSCAPE_RIGHT";
        }
        throw null;
    }
}
