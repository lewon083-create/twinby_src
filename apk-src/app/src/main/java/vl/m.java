package vl;

import java.nio.charset.Charset;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f34934a = {',', ';'};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f34935b = new HashMap();

    static {
        l lVar = l.f34927f;
        new ThreadLocal();
        Charset.forName("UTF8");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(java.lang.StringBuilder r4, vl.l r5, int r6) throws java.io.IOException {
        /*
            int[] r0 = r5.f34932d
            int r0 = java.util.Arrays.binarySearch(r0, r6)
            java.lang.String r1 = ""
            if (r0 < 0) goto L1f
            java.lang.String[] r2 = r5.f34933e
            int r3 = r2.length
            int r3 = r3 + (-1)
            if (r0 >= r3) goto L1c
            int[] r5 = r5.f34932d
            int r3 = r0 + 1
            r5 = r5[r3]
            if (r5 != r6) goto L1c
            r5 = r2[r3]
            goto L20
        L1c:
            r5 = r2[r0]
            goto L20
        L1f:
            r5 = r1
        L20:
            r0 = 59
            if (r5 == r1) goto L32
            r6 = 38
            java.lang.Appendable r4 = r4.append(r6)
            java.lang.Appendable r4 = r4.append(r5)
            r4.append(r0)
            return
        L32:
            java.lang.String r5 = "&#x"
            java.lang.Appendable r4 = r4.append(r5)
            java.lang.String r5 = java.lang.Integer.toHexString(r6)
            java.lang.Appendable r4 = r4.append(r5)
            r4.append(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vl.m.a(java.lang.StringBuilder, vl.l, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(java.lang.StringBuilder r10, java.lang.String r11, vl.g r12, boolean r13, boolean r14) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: vl.m.b(java.lang.StringBuilder, java.lang.String, vl.g, boolean, boolean):void");
    }
}
