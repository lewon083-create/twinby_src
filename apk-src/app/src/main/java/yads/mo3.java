package yads;

import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class mo3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f40983c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f40984d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lb2 f40985a = new lb2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StringBuilder f40986b = new StringBuilder();

    public static String a(lb2 lb2Var, StringBuilder sb2) {
        boolean z5 = false;
        sb2.setLength(0);
        int i = lb2Var.f40464b;
        int i10 = lb2Var.f40465c;
        while (i < i10 && !z5) {
            char c8 = (char) lb2Var.f40463a[i];
            if ((c8 < 'A' || c8 > 'Z') && ((c8 < 'a' || c8 > 'z') && !((c8 >= '0' && c8 <= '9') || c8 == '#' || c8 == '-' || c8 == '.' || c8 == '_'))) {
                z5 = true;
            } else {
                i++;
                sb2.append(c8);
            }
        }
        int i11 = lb2Var.f40464b;
        lb2Var.e((i - i11) + i11);
        return sb2.toString();
    }

    public static String b(lb2 lb2Var, StringBuilder sb2) {
        a(lb2Var);
        if (lb2Var.f40465c - lb2Var.f40464b == 0) {
            return null;
        }
        String strA = a(lb2Var, sb2);
        if (!"".equals(strA)) {
            return strA;
        }
        return "" + ((char) lb2Var.m());
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0053, code lost:
    
        r8.e(r3 + 1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(yads.lb2 r8) {
        /*
            r0 = 1
        L1:
            r1 = r0
        L2:
            int r2 = r8.f40465c
            int r3 = r8.f40464b
            int r4 = r2 - r3
            if (r4 <= 0) goto L59
            if (r1 == 0) goto L59
            byte[] r1 = r8.f40463a
            r4 = r1[r3]
            char r5 = (char) r4
            r6 = 9
            if (r5 == r6) goto L53
            r6 = 10
            if (r5 == r6) goto L53
            r6 = 12
            if (r5 == r6) goto L53
            r6 = 13
            if (r5 == r6) goto L53
            r6 = 32
            if (r5 == r6) goto L53
            int r5 = r3 + 2
            if (r5 > r2) goto L51
            int r3 = r3 + 1
            r6 = 47
            if (r4 != r6) goto L51
            r3 = r1[r3]
            r4 = 42
            if (r3 != r4) goto L51
        L35:
            int r3 = r5 + 1
            if (r3 >= r2) goto L49
            r7 = r1[r5]
            char r7 = (char) r7
            if (r7 != r4) goto L47
            r7 = r1[r3]
            char r7 = (char) r7
            if (r7 != r6) goto L47
            int r5 = r5 + 2
            r2 = r5
            goto L35
        L47:
            r5 = r3
            goto L35
        L49:
            int r1 = r8.f40464b
            int r2 = r2 - r1
            int r2 = r2 + r1
            r8.e(r2)
            goto L1
        L51:
            r1 = 0
            goto L2
        L53:
            int r3 = r3 + 1
            r8.e(r3)
            goto L1
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.mo3.a(yads.lb2):void");
    }
}
