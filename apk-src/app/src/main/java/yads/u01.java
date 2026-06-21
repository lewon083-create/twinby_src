package yads;

import java.nio.charset.Charset;
import java.util.Map;
import kotlin.text.Charsets;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class u01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f43507a = Charsets.f27531b;

    public static final boolean a(Map map, v11 v11Var) {
        String strC = c(map, v11Var);
        if (strC == null) {
            return true;
        }
        return Boolean.parseBoolean(strC);
    }

    public static boolean b(Map map, v11 v11Var) {
        String strC = c(map, v11Var);
        if (strC == null) {
            return false;
        }
        return Boolean.parseBoolean(strC);
    }

    public static final String c(Map map, v11 v11Var) {
        if (map != null) {
            return (String) map.get(v11Var.f43847b);
        }
        return null;
    }

    public static int d(Map map, v11 v11Var) {
        String strC = c(map, v11Var);
        int i = tb.f43257b;
        if (strC == null) {
            return 0;
        }
        try {
            return Integer.parseInt(strC);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.ArrayList e(java.util.Map r10, yads.v11 r11) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r10 = c(r10, r11)
            if (r10 == 0) goto Lab
            int r11 = r10.length()
            if (r11 != 0) goto L13
            goto Lab
        L13:
            kotlin.text.Regex r11 = new kotlin.text.Regex
            java.lang.String r1 = ","
            r11.<init>(r1)
            java.util.List r10 = r11.d(r10)
            boolean r11 = r10.isEmpty()
            r1 = 1
            if (r11 != 0) goto L4a
            int r11 = r10.size()
            java.util.ListIterator r11 = r10.listIterator(r11)
        L2d:
            boolean r2 = r11.hasPrevious()
            if (r2 == 0) goto L4a
            java.lang.Object r2 = r11.previous()
            java.lang.String r2 = (java.lang.String) r2
            int r2 = r2.length()
            if (r2 != 0) goto L40
            goto L2d
        L40:
            int r11 = r11.nextIndex()
            int r11 = r11 + r1
            java.util.List r10 = kotlin.collections.CollectionsKt.O(r10, r11)
            goto L4c
        L4a:
            kotlin.collections.b0 r10 = kotlin.collections.b0.f27475b
        L4c:
            r11 = 0
            java.lang.String[] r2 = new java.lang.String[r11]
            java.lang.Object[] r10 = r10.toArray(r2)
            java.lang.String[] r10 = (java.lang.String[]) r10
            int r2 = r10.length
            r3 = r11
        L57:
            if (r3 >= r2) goto Lab
            r4 = r10[r3]
            ij.k r5 = ij.m.f21341c     // Catch: java.lang.Throwable -> L89
            int r5 = r4.length()     // Catch: java.lang.Throwable -> L89
            int r5 = r5 - r1
            r6 = r11
            r7 = r6
        L64:
            if (r6 > r5) goto L8b
            if (r7 != 0) goto L6a
            r8 = r6
            goto L6b
        L6a:
            r8 = r5
        L6b:
            char r8 = r4.charAt(r8)     // Catch: java.lang.Throwable -> L89
            r9 = 32
            int r8 = kotlin.jvm.internal.Intrinsics.d(r8, r9)     // Catch: java.lang.Throwable -> L89
            if (r8 > 0) goto L79
            r8 = r1
            goto L7a
        L79:
            r8 = r11
        L7a:
            if (r7 != 0) goto L83
            if (r8 != 0) goto L80
            r7 = r1
            goto L64
        L80:
            int r6 = r6 + 1
            goto L64
        L83:
            if (r8 != 0) goto L86
            goto L8b
        L86:
            int r5 = r5 + (-1)
            goto L64
        L89:
            r4 = move-exception
            goto La3
        L8b:
            int r5 = r5 + 1
            java.lang.CharSequence r4 = r4.subSequence(r6, r5)     // Catch: java.lang.Throwable -> L89
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L89
            java.lang.String r5 = "UTF-8"
            java.lang.String r4 = java.net.URLDecoder.decode(r4, r5)     // Catch: java.lang.Throwable -> L89
            if (r4 == 0) goto La0
            r0.add(r4)     // Catch: java.lang.Throwable -> L89
        La0:
            ij.k r4 = ij.m.f21341c     // Catch: java.lang.Throwable -> L89
            goto La8
        La3:
            ij.k r5 = ij.m.f21341c
            com.google.android.gms.internal.measurement.h5.s(r4)
        La8:
            int r3 = r3 + 1
            goto L57
        Lab:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.u01.e(java.util.Map, yads.v11):java.util.ArrayList");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.nio.charset.Charset a(java.util.Map r10) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.u01.a(java.util.Map):java.nio.charset.Charset");
    }
}
