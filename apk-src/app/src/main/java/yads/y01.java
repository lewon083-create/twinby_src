package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class y01 implements be {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final is2 f44878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f44879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a11 f44880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b11 f44881d;

    public /* synthetic */ y01(Context context) {
        this(context, new is2());
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    @Override // yads.be
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final yads.td a() {
        /*
            r7 = this;
            yads.b11 r0 = r7.f44881d
            r0.getClass()
            android.content.Intent r0 = yads.b11.a()
            yads.is2 r1 = r7.f44878a
            android.content.Context r2 = r7.f44879b
            r1.getClass()
            r1 = 0
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: java.lang.Throwable -> L1b
            r3 = 0
            android.content.pm.ResolveInfo r2 = r2.resolveService(r0, r3)     // Catch: java.lang.Throwable -> L1b
            goto L1c
        L1b:
            r2 = r1
        L1c:
            if (r2 == 0) goto L5b
            com.monetization.ads.core.identifiers.ad.huawei.a r2 = new com.monetization.ads.core.identifiers.ad.huawei.a     // Catch: java.lang.Throwable -> L5b
            r2.<init>()     // Catch: java.lang.Throwable -> L5b
            android.content.Context r3 = r7.f44879b     // Catch: java.lang.Throwable -> L5b
            r4 = 1
            boolean r0 = r3.bindService(r0, r2, r4)     // Catch: java.lang.Throwable -> L5b
            if (r0 == 0) goto L5b
            yads.a11 r0 = r7.f44880c     // Catch: java.lang.Throwable -> L5b
            r0.getClass()     // Catch: java.lang.Throwable -> L5b
            java.util.concurrent.LinkedBlockingQueue r3 = r2.f15015a     // Catch: java.lang.Exception -> L54 java.lang.Throwable -> L5b
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Exception -> L54 java.lang.Throwable -> L5b
            r5 = 5
            java.lang.Object r3 = r3.poll(r5, r4)     // Catch: java.lang.Exception -> L54 java.lang.Throwable -> L5b
            com.monetization.ads.core.identifiers.ad.huawei.OpenDeviceIdentifierService r3 = (com.monetization.ads.core.identifiers.ad.huawei.OpenDeviceIdentifierService) r3     // Catch: java.lang.Exception -> L54 java.lang.Throwable -> L5b
            if (r3 == 0) goto L54
            java.lang.String r4 = r3.getOaid()     // Catch: java.lang.Exception -> L54 java.lang.Throwable -> L5b
            boolean r3 = r3.getOaidTrackLimited()     // Catch: java.lang.Exception -> L54 java.lang.Throwable -> L5b
            yads.ud r0 = r0.f36609a     // Catch: java.lang.Exception -> L54 java.lang.Throwable -> L5b
            r0.getClass()     // Catch: java.lang.Exception -> L54 java.lang.Throwable -> L5b
            if (r4 == 0) goto L54
            yads.td r0 = new yads.td     // Catch: java.lang.Exception -> L54 java.lang.Throwable -> L5b
            r0.<init>(r4, r3)     // Catch: java.lang.Exception -> L54 java.lang.Throwable -> L5b
            goto L55
        L54:
            r0 = r1
        L55:
            android.content.Context r3 = r7.f44879b     // Catch: java.lang.Throwable -> L5b
            r3.unbindService(r2)     // Catch: java.lang.Throwable -> L5b
            r1 = r0
        L5b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.y01.a():yads.td");
    }

    public y01(Context context, is2 is2Var) {
        this.f44878a = is2Var;
        this.f44879b = context.getApplicationContext();
        this.f44880c = new a11();
        this.f44881d = new b11();
    }
}
