package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class et1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gw2 f38252a = fw2.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile ct1 f38253b;

    /* JADX WARN: Removed duplicated region for block: B:31:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static yads.ct1 a(android.content.Context r6, yads.pt2 r7, yads.fq3 r8) {
        /*
            yads.su3 r0 = yads.su3.f43085a
            yads.bh r0 = new yads.bh
            r0.<init>()
            yads.fh r1 = yads.pg.a(r6)
            boolean r2 = yads.ub.a(r6)
            if (r2 == 0) goto L14
            java.lang.String r2 = "322a737a-a0ca-44e0-bc85-649b1c7c1db6"
            goto L16
        L14:
            java.lang.String r2 = "478cb909-6ad1-4e12-84cc-b3629a789f93"
        L16:
            yads.zg r3 = r1.f38443a
            boolean r3 = r3.a()
            r4 = 0
            r5 = 0
            if (r3 == 0) goto L33
            yads.eh r3 = new yads.eh     // Catch: java.lang.Throwable -> L31
            r3.<init>(r8, r6, r1, r2)     // Catch: java.lang.Throwable -> L31
            ij.p r8 = ij.h.b(r3)     // Catch: java.lang.Throwable -> L31
            yads.gh r2 = new yads.gh     // Catch: java.lang.Throwable -> L31
            yads.zg r1 = r1.f38443a     // Catch: java.lang.Throwable -> L31
            r2.<init>(r8, r1)     // Catch: java.lang.Throwable -> L31
            goto L37
        L31:
            r2 = r5
            goto L37
        L33:
            io.appmetrica.analytics.AppMetrica.setDataSendingEnabled(r4)     // Catch: java.lang.Throwable -> L31
            goto L31
        L37:
            yads.dt1 r8 = new yads.dt1
            r8.<init>(r6)
            ij.p r8 = ij.h.b(r8)
            if (r7 == 0) goto L48
            boolean r7 = r7.f42027e0
            r1 = 1
            if (r7 != r1) goto L48
            r4 = r1
        L48:
            yads.ct1 r7 = new yads.ct1
            yads.qg1 r1 = yads.pg1.a()
            java.util.concurrent.Executor r1 = r1.a()
            r7.<init>(r2, r8, r4, r1)
            yads.qt2 r8 = new yads.qt2
            r8.<init>(r6, r0)
            yads.zt2 r6 = yads.yt2.a()
            java.lang.Object r0 = yads.zt2.f45529b
            monitor-enter(r0)
            java.util.HashMap r1 = r6.f45531a     // Catch: java.lang.Throwable -> L6f
            boolean r1 = r1.containsKey(r8)     // Catch: java.lang.Throwable -> L6f
            if (r1 != 0) goto L71
            java.util.HashMap r6 = r6.f45531a     // Catch: java.lang.Throwable -> L6f
            r6.put(r8, r5)     // Catch: java.lang.Throwable -> L6f
            goto L71
        L6f:
            r6 = move-exception
            goto L75
        L71:
            kotlin.Unit r6 = kotlin.Unit.f27471a     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r0)
            return r7
        L75:
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.et1.a(android.content.Context, yads.pt2, yads.fq3):yads.ct1");
    }
}
