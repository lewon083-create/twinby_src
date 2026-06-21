package l7;

import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import com.google.android.gms.internal.measurement.h5;
import com.vk.dto.common.id.UserId;
import fj.l0;
import java.util.HashMap;
import java.util.regex.Matcher;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class o {
    public static final boolean a(int i) {
        return i == 3 || i == 4 || i == 6;
    }

    public static int b(float f10, int i, int i10) {
        return (Float.hashCode(f10) + i) * i10;
    }

    public static int c(int i, int i10, int i11, int i12) {
        return ((i - i10) / i11) + i12;
    }

    public static int d(long j10, int i, int i10) {
        return (Long.hashCode(j10) + i) * i10;
    }

    public static int e(UserId userId, int i, int i10) {
        return (userId.hashCode() + i) * i10;
    }

    public static int f(Matcher matcher, int i, int i10) {
        String strGroup = matcher.group(i);
        strGroup.getClass();
        return Integer.parseInt(strGroup, i10);
    }

    public static ij.l g(String str, String str2, String str3) {
        return h5.s(new ni.p(str, str2, str3));
    }

    public static ij.l h(String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, str2);
        return h5.s(new ni.p(str3, str4, str5));
    }

    public static String i(int i, String str) {
        return str + i;
    }

    public static String j(int i, String str, StringBuilder sb2) {
        sb2.append(str);
        sb2.append(i);
        return sb2.toString();
    }

    public static String k(String str, Throwable th2, String str2, String str3) {
        return str + th2 + str2 + str3;
    }

    public static String l(StringBuilder sb2, String str, int i, String str2) {
        sb2.append(str);
        sb2.append(i);
        sb2.append(str2);
        return sb2.toString();
    }

    public static StringBuilder m(int i, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i);
        sb2.append(str2);
        return sb2;
    }

    public static /* synthetic */ void n(int i) {
        if (i == 0) {
            throw new NullPointerException("null reference");
        }
    }

    public static void o(int i, SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12) {
        spannableStringBuilder.setSpan(new StyleSpan(i), i10, i11, i12);
    }

    public static void p(int i, String str, String str2, String str3, StringBuilder sb2) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(i);
        sb2.append(str3);
    }

    public static void q(int i, HashMap map, String str, int i10, String str2) {
        map.put(str, Integer.valueOf(i));
        map.put(str2, Integer.valueOf(i10));
    }

    public static void r(ij.l lVar, l0 l0Var) {
        l0Var.invoke(new ij.m(lVar));
    }

    public static void s(String str, String str2, String str3) {
        m3.b.s(str3, str + str2);
    }

    public static void t(StringBuilder sb2, String str, String str2, String str3, String str4) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
    }

    public static void u(HashMap map, String str, Integer num, int i, String str2) {
        map.put(str, num);
        map.put(str2, Integer.valueOf(i));
    }

    public static int v(int i, int i10, int i11, int i12) {
        return i + i10 + i11 + i12;
    }

    public static int w(int i, int i10, int i11, int i12) {
        return i12 - ((i + i10) * i11);
    }

    public static /* synthetic */ String x(int i) {
        switch (i) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String y(int i) {
        switch (i) {
            case 1:
                return "NOT_REQUIRED";
            case 2:
                return "CONNECTED";
            case 3:
                return "UNMETERED";
            case 4:
                return "NOT_ROAMING";
            case 5:
                return "METERED";
            case 6:
                return "TEMPORARILY_UNMETERED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String z(int i) {
        switch (i) {
            case 1:
                return "ENQUEUED";
            case 2:
                return "RUNNING";
            case 3:
                return "SUCCEEDED";
            case 4:
                return "FAILED";
            case 5:
                return "BLOCKED";
            case 6:
                return "CANCELLED";
            default:
                return "null";
        }
    }
}
