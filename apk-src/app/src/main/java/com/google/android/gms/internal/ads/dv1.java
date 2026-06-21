package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class dv1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Random f4684h = new Random();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ev1 f4688d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f4690f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nh f4685a = new nh();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bh f4686b = new bh();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f4687c = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ci f4689e = ci.f4215a;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f4691g = -1;

    public final synchronized String a(ci ciVar, hy1 hy1Var) {
        return e(ciVar.o(hy1Var.f6299a, this.f4686b).f3786c, hy1Var).f4338a;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034 A[Catch: all -> 0x0056, TryCatch #0 {all -> 0x0056, blocks: (B:4:0x0007, B:6:0x000b, B:9:0x0015, B:11:0x0019, B:13:0x0021, B:15:0x002d, B:18:0x0034, B:21:0x003d, B:23:0x0049, B:25:0x004f, B:30:0x0059, B:32:0x0063, B:35:0x006a, B:37:0x0070, B:39:0x0083, B:40:0x0097, B:42:0x009b, B:43:0x009d, B:45:0x00a7, B:47:0x00ab, B:49:0x00b8, B:52:0x00bf, B:58:0x00dc), top: B:61:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d A[Catch: all -> 0x0056, TryCatch #0 {all -> 0x0056, blocks: (B:4:0x0007, B:6:0x000b, B:9:0x0015, B:11:0x0019, B:13:0x0021, B:15:0x002d, B:18:0x0034, B:21:0x003d, B:23:0x0049, B:25:0x004f, B:30:0x0059, B:32:0x0063, B:35:0x006a, B:37:0x0070, B:39:0x0083, B:40:0x0097, B:42:0x009b, B:43:0x009d, B:45:0x00a7, B:47:0x00ab, B:49:0x00b8, B:52:0x00bf, B:58:0x00dc), top: B:61:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0059 A[Catch: all -> 0x0056, TryCatch #0 {all -> 0x0056, blocks: (B:4:0x0007, B:6:0x000b, B:9:0x0015, B:11:0x0019, B:13:0x0021, B:15:0x002d, B:18:0x0034, B:21:0x003d, B:23:0x0049, B:25:0x004f, B:30:0x0059, B:32:0x0063, B:35:0x006a, B:37:0x0070, B:39:0x0083, B:40:0x0097, B:42:0x009b, B:43:0x009d, B:45:0x00a7, B:47:0x00ab, B:49:0x00b8, B:52:0x00bf, B:58:0x00dc), top: B:61:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void b(com.google.android.gms.internal.ads.xu1 r15) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.dv1.b(com.google.android.gms.internal.ads.xu1):void");
    }

    public final void c(xu1 xu1Var) {
        hy1 hy1Var;
        boolean zG = xu1Var.f12332b.g();
        HashMap map = this.f4687c;
        if (zG) {
            String str = this.f4690f;
            if (str != null) {
                cv1 cv1Var = (cv1) map.get(str);
                cv1Var.getClass();
                d(cv1Var);
                return;
            }
            return;
        }
        cv1 cv1Var2 = (cv1) map.get(this.f4690f);
        int i = xu1Var.f12333c;
        hy1 hy1Var2 = xu1Var.f12334d;
        this.f4690f = e(i, hy1Var2).f4338a;
        b(xu1Var);
        if (hy1Var2 != null) {
            long j10 = hy1Var2.f6302d;
            if (hy1Var2.b()) {
                if (cv1Var2 != null && cv1Var2.f4340c == j10 && (hy1Var = cv1Var2.f4341d) != null) {
                    if (hy1Var.f6300b == hy1Var2.f6300b) {
                        if (hy1Var.f6301c == hy1Var2.f6301c) {
                            return;
                        }
                    }
                }
                e(i, new hy1(hy1Var2.f6299a, j10));
            }
        }
    }

    public final void d(cv1 cv1Var) {
        long j10 = cv1Var.f4340c;
        if (j10 != -1 && cv1Var.f4342e) {
            this.f4691g = j10;
        }
        this.f4690f = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a0 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.cv1 e(int r19, com.google.android.gms.internal.ads.hy1 r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            java.util.HashMap r3 = r0.f4687c
            java.util.Collection r4 = r3.values()
            java.util.Iterator r4 = r4.iterator()
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r7 = 0
        L16:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto La4
            java.lang.Object r8 = r4.next()
            com.google.android.gms.internal.ads.cv1 r8 = (com.google.android.gms.internal.ads.cv1) r8
            long r9 = r8.f4340c
            com.google.android.gms.internal.ads.hy1 r11 = r8.f4341d
            r12 = -1
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 != 0) goto L57
            int r9 = r8.f4339b
            if (r1 != r9) goto L57
            if (r2 == 0) goto L57
            com.google.android.gms.internal.ads.dv1 r9 = r8.f4344g
            long r14 = r2.f6302d
            java.util.HashMap r10 = r9.f4687c
            r16 = r12
            java.lang.String r12 = r9.f4690f
            java.lang.Object r10 = r10.get(r12)
            com.google.android.gms.internal.ads.cv1 r10 = (com.google.android.gms.internal.ads.cv1) r10
            if (r10 == 0) goto L4b
            long r12 = r10.f4340c
            int r10 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r10 == 0) goto L4b
            goto L50
        L4b:
            long r9 = r9.f4691g
            r12 = 1
            long r12 = r12 + r9
        L50:
            int r9 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r9 < 0) goto L59
            r8.f4340c = r14
            goto L59
        L57:
            r16 = r12
        L59:
            if (r2 == 0) goto L84
            long r9 = r2.f6302d
            int r12 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r12 != 0) goto L62
            goto L84
        L62:
            if (r11 != 0) goto L71
            boolean r12 = r2.b()
            if (r12 != 0) goto L16
            long r12 = r8.f4340c
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 != 0) goto L16
            goto L88
        L71:
            long r12 = r11.f6302d
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 != 0) goto L16
            int r9 = r2.f6300b
            int r10 = r11.f6300b
            if (r9 != r10) goto L16
            int r9 = r2.f6301c
            int r10 = r11.f6301c
            if (r9 != r10) goto L16
            goto L88
        L84:
            int r9 = r8.f4339b
            if (r1 != r9) goto L16
        L88:
            long r9 = r8.f4340c
            int r12 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r12 == 0) goto La0
            int r12 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r12 >= 0) goto L93
            goto La0
        L93:
            if (r12 != 0) goto L16
            java.lang.String r9 = com.google.android.gms.internal.ads.cq0.f4293a
            com.google.android.gms.internal.ads.hy1 r9 = r7.f4341d
            if (r9 == 0) goto L16
            if (r11 == 0) goto L16
            r7 = r8
            goto L16
        La0:
            r7 = r8
            r5 = r9
            goto L16
        La4:
            if (r7 != 0) goto Lbe
            r4 = 12
            byte[] r4 = new byte[r4]
            java.util.Random r5 = com.google.android.gms.internal.ads.dv1.f4684h
            r5.nextBytes(r4)
            r5 = 10
            java.lang.String r4 = android.util.Base64.encodeToString(r4, r5)
            com.google.android.gms.internal.ads.cv1 r5 = new com.google.android.gms.internal.ads.cv1
            r5.<init>(r0, r4, r1, r2)
            r3.put(r4, r5)
            return r5
        Lbe:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.dv1.e(int, com.google.android.gms.internal.ads.hy1):com.google.android.gms.internal.ads.cv1");
    }
}
