package i0;

import android.util.Pair;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f20783c = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f20784d = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f20785e = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ArrayList f20786f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f20787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ByteOrder f20788b;

    static {
        i iVar = new i(0);
        iVar.f20781b = 0;
        f20786f = Collections.list(iVar);
    }

    public k() {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        i iVar = new i(1);
        iVar.f20781b = 0;
        this.f20787a = Collections.list(iVar);
        this.f20788b = byteOrder;
    }

    public static Pair a(String str) {
        if (str.contains(StringUtils.COMMA)) {
            String[] strArrSplit = str.split(StringUtils.COMMA, -1);
            Pair pairA = a(strArrSplit[0]);
            if (((Integer) pairA.first).intValue() == 2) {
                return pairA;
            }
            for (int i = 1; i < strArrSplit.length; i++) {
                Pair pairA2 = a(strArrSplit[i]);
                int iIntValue = (((Integer) pairA2.first).equals(pairA.first) || ((Integer) pairA2.second).equals(pairA.first)) ? ((Integer) pairA.first).intValue() : -1;
                int iIntValue2 = (((Integer) pairA.second).intValue() == -1 || !(((Integer) pairA2.first).equals(pairA.second) || ((Integer) pairA2.second).equals(pairA.second))) ? -1 : ((Integer) pairA.second).intValue();
                if (iIntValue == -1 && iIntValue2 == -1) {
                    return new Pair(2, -1);
                }
                if (iIntValue == -1) {
                    pairA = new Pair(Integer.valueOf(iIntValue2), -1);
                } else if (iIntValue2 == -1) {
                    pairA = new Pair(Integer.valueOf(iIntValue), -1);
                }
            }
            return pairA;
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

    public final void b(String str, String str2, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((Map) it.next()).containsKey(str)) {
                return;
            }
        }
        c(str, str2, arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0175, code lost:
    
        if (r6 != r8) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.lang.String r24, java.lang.String r25, java.util.List r26) {
        /*
            Method dump skipped, instruction units count: 1072
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.k.c(java.lang.String, java.lang.String, java.util.List):void");
    }

    public final void d(int i) {
        int i10;
        if (i == 0) {
            i10 = 1;
        } else if (i == 90) {
            i10 = 6;
        } else if (i == 180) {
            i10 = 3;
        } else if (i != 270) {
            com.google.android.gms.internal.auth.g.O("ExifData", "Unexpected orientation value: " + i + ". Must be one of 0, 90, 180, 270.");
            i10 = 0;
        } else {
            i10 = 8;
        }
        c("Orientation", String.valueOf(i10), this.f20787a);
    }
}
