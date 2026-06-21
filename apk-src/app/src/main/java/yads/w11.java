package yads;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class w11 {
    public static lr a(h82 h82Var) {
        long j10;
        boolean z5;
        long j11;
        long j12;
        long j13;
        long j14;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map map = h82Var.f39071c;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long jA = str != null ? a(str) : 0L;
        String str2 = (String) map.get("Cache-Control");
        int i = 0;
        if (str2 != null) {
            String[] strArrSplit = str2.split(StringUtils.COMMA, 0);
            z5 = false;
            j11 = 0;
            j12 = 0;
            while (i < strArrSplit.length) {
                String strTrim = strArrSplit[i].trim();
                if (strTrim.equals("no-cache") || strTrim.equals("no-store")) {
                    return null;
                }
                if (strTrim.startsWith("max-age=")) {
                    try {
                        j11 = Long.parseLong(strTrim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j12 = Long.parseLong(strTrim.substring(23));
                } else if (strTrim.equals("must-revalidate") || strTrim.equals("proxy-revalidate")) {
                    z5 = true;
                }
                i++;
            }
            j10 = 0;
            i = 1;
        } else {
            j10 = 0;
            z5 = false;
            j11 = 0;
            j12 = 0;
        }
        String str3 = (String) map.get("Expires");
        long jA2 = str3 != null ? a(str3) : j10;
        String str4 = (String) map.get("Last-Modified");
        long jA3 = str4 != null ? a(str4) : j10;
        String str5 = (String) map.get("ETag");
        if (i != 0) {
            j14 = (j11 * 1000) + jCurrentTimeMillis;
            j13 = z5 ? j14 : (j12 * 1000) + j14;
        } else {
            j13 = (jA <= j10 || jA2 < jA) ? j10 : (jA2 - jA) + jCurrentTimeMillis;
            j14 = j13;
        }
        lr lrVar = new lr();
        lrVar.f40638a = h82Var.f39070b;
        lrVar.f40639b = str5;
        lrVar.f40643f = j14;
        lrVar.f40642e = j13;
        lrVar.f40640c = jA;
        lrVar.f40641d = jA3;
        lrVar.f40644g = map;
        lrVar.f40645h = h82Var.f39072d;
        return lrVar;
    }

    public static String a(Map map) {
        String str;
        if (map == null || (str = (String) map.get("Content-Type")) == null) {
            return "ISO-8859-1";
        }
        String[] strArrSplit = str.split(";", 0);
        for (int i = 1; i < strArrSplit.length; i++) {
            String[] strArrSplit2 = strArrSplit[i].trim().split("=", 0);
            if (strArrSplit2.length == 2 && strArrSplit2[0].equals("charset")) {
                return strArrSplit2[1];
            }
        }
        return "ISO-8859-1";
    }

    public static long a(String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            return simpleDateFormat.parse(str).getTime();
        } catch (ParseException unused) {
            if (!CommonUrlParts.Values.FALSE_INTEGER.equals(str) && !"-1".equals(str)) {
                boolean z5 = om3.f41652a;
                return 0L;
            }
            boolean z10 = om3.f41652a;
            return 0L;
        }
    }
}
