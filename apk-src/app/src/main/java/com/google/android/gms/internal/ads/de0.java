package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class de0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f4558a = new ConcurrentHashMap();

    /* JADX WARN: Removed duplicated region for block: B:43:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d5 A[Catch: all -> 0x0068, TryCatch #0 {all -> 0x0068, blocks: (B:3:0x0001, B:8:0x001a, B:10:0x001f, B:12:0x0028, B:13:0x002d, B:15:0x0030, B:16:0x0035, B:17:0x0044, B:18:0x0045, B:20:0x0054, B:22:0x005a, B:24:0x0063, B:28:0x006b, B:30:0x0070, B:32:0x0079, B:33:0x007e, B:35:0x0082, B:36:0x0087, B:37:0x0096, B:38:0x0097, B:44:0x00a7, B:48:0x00d5, B:50:0x00df, B:51:0x00e7, B:52:0x00ee, B:54:0x00f4, B:55:0x00f8, B:57:0x010d, B:58:0x0116, B:60:0x011c, B:62:0x012a, B:64:0x0130, B:65:0x0142, B:67:0x0148, B:69:0x015a, B:71:0x0162, B:75:0x0173, B:77:0x017b, B:79:0x0181, B:81:0x018a, B:82:0x0193, B:45:0x00b6, B:46:0x00c5), top: B:89:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void a(int r8, long r9, long r11) {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.de0.a(int, long, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            r9 = this;
            p9.k r0 = p9.k.C
            ua.a r0 = r0.f31304k
            r0.getClass()
            long r0 = java.lang.System.currentTimeMillis()
            java.util.concurrent.ConcurrentHashMap r2 = r9.f4558a
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L15:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto La5
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            com.google.android.gms.internal.ads.ce0 r4 = (com.google.android.gms.internal.ads.ce0) r4
            java.lang.Object r3 = r3.getValue()
            java.util.ArrayDeque r3 = (java.util.ArrayDeque) r3
            int r4 = r4.f4191b
            r5 = 0
            if (r4 == 0) goto L3c
            r7 = 1
            if (r4 == r7) goto L60
            r7 = 2
            if (r4 == r7) goto L4f
            r7 = 3
            if (r4 == r7) goto L3e
        L3c:
            r7 = r5
            goto L70
        L3e:
            com.google.android.gms.internal.ads.wk r4 = com.google.android.gms.internal.ads.al.L8
            q9.s r7 = q9.s.f31967e
            com.google.android.gms.internal.ads.yk r7 = r7.f31970c
            java.lang.Object r4 = r7.a(r4)
            java.lang.Long r4 = (java.lang.Long) r4
            long r7 = r4.longValue()
            goto L70
        L4f:
            com.google.android.gms.internal.ads.wk r4 = com.google.android.gms.internal.ads.al.K8
            q9.s r7 = q9.s.f31967e
            com.google.android.gms.internal.ads.yk r7 = r7.f31970c
            java.lang.Object r4 = r7.a(r4)
            java.lang.Long r4 = (java.lang.Long) r4
            long r7 = r4.longValue()
            goto L70
        L60:
            com.google.android.gms.internal.ads.wk r4 = com.google.android.gms.internal.ads.al.J8
            q9.s r7 = q9.s.f31967e
            com.google.android.gms.internal.ads.yk r7 = r7.f31970c
            java.lang.Object r4 = r7.a(r4)
            java.lang.Long r4 = (java.lang.Long) r4
            long r7 = r4.longValue()
        L70:
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 != 0) goto L78
            r2.remove()
            r7 = r5
        L78:
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 <= 0) goto L15
            java.util.Iterator r4 = r3.iterator()
        L80:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L9a
            java.lang.Object r5 = r4.next()
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            long r5 = r0 - r5
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 <= 0) goto L9a
            r4.remove()
            goto L80
        L9a:
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L15
            r2.remove()
            goto L15
        La5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.de0.b():void");
    }
}
