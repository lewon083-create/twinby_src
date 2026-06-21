package w5;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import j3.d0;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
import m3.p;
import m3.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f35161a = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean a(p pVar) {
        pVar.getClass();
        String strN = pVar.n(StandardCharsets.UTF_8);
        return strN != null && strN.startsWith("WEBVTT");
    }

    public static float b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long c(String str) {
        String str2 = z.f28608a;
        String[] strArrSplit = str.split("\\.", 2);
        long j10 = 0;
        for (String str3 : strArrSplit[0].split(StringUtils.PROCESS_POSTFIX_DELIMITER, -1)) {
            j10 = (j10 * 60) + Long.parseLong(str3);
        }
        long j11 = j10 * 1000;
        if (strArrSplit.length == 2) {
            String strTrim = strArrSplit[1].trim();
            if (strTrim.length() != 3) {
                throw new IllegalArgumentException("Expected 3 decimal places, got: ".concat(strTrim));
            }
            j11 += Long.parseLong(strTrim);
        }
        return j11 * 1000;
    }

    public static void d(p pVar) throws d0 {
        int i = pVar.f28590b;
        if (a(pVar)) {
            return;
        }
        pVar.M(i);
        throw d0.a(null, "Expected WEBVTT. Got " + pVar.n(StandardCharsets.UTF_8));
    }
}
