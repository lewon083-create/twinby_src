package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class t1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x1 f14309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final la.m f14310c;

    public t1(x1 x1Var, la.m mVar) {
        this.f14309b = x1Var;
        this.f14310c = mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r5 = this;
            la.m r0 = r5.f14310c
            com.google.android.gms.internal.play_billing.x1 r1 = r5.f14309b
            boolean r2 = r1 instanceof com.google.android.gms.internal.play_billing.i2
            if (r2 == 0) goto L24
            r2 = r1
            com.google.android.gms.internal.play_billing.i2 r2 = (com.google.android.gms.internal.play_billing.i2) r2
            com.google.android.gms.internal.play_billing.n1 r2 = (com.google.android.gms.internal.play_billing.n1) r2
            boolean r3 = r2 instanceof com.google.android.gms.internal.play_billing.j1
            if (r3 == 0) goto L1c
            java.lang.Object r2 = r2.f14252b
            boolean r3 = r2 instanceof com.google.android.gms.internal.play_billing.e1
            if (r3 == 0) goto L1c
            com.google.android.gms.internal.play_billing.e1 r2 = (com.google.android.gms.internal.play_billing.e1) r2
            java.lang.Throwable r2 = r2.f14167a
            goto L1d
        L1c:
            r2 = 0
        L1d:
            if (r2 != 0) goto L20
            goto L24
        L20:
            r0.k(r2)
            return
        L24:
            boolean r2 = r1.isDone()     // Catch: java.lang.Throwable -> L3b java.util.concurrent.ExecutionException -> L3d
            java.lang.String r3 = "Future was expected to be done: %s"
            if (r2 == 0) goto L7a
            r2 = 0
        L2d:
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L6c java.lang.InterruptedException -> L78
            if (r2 == 0) goto L3f
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L3b java.util.concurrent.ExecutionException -> L3d
            r2.interrupt()     // Catch: java.lang.Throwable -> L3b java.util.concurrent.ExecutionException -> L3d
            goto L3f
        L3b:
            r1 = move-exception
            goto L88
        L3d:
            r1 = move-exception
            goto L8c
        L3f:
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r2 = r1.intValue()
            java.lang.Object r3 = r0.f28101f
            d8.i0 r3 = (d8.i0) r3
            if (r2 <= 0) goto L64
            int r2 = r0.f28098c
            int r1 = r1.intValue()
            java.lang.String r4 = "Billing override value was set by a license tester."
            d8.j r1 = d8.n0.a(r1, r4)
            r4 = 105(0x69, float:1.47E-43)
            r3.Q(r4, r2, r1)
            java.lang.Object r0 = r0.f28099d
            java.util.function.Consumer r0 = (java.util.function.Consumer) r0
            r0.accept(r1)
            goto L6b
        L64:
            java.lang.Object r0 = r0.f28100e
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()
        L6b:
            return
        L6c:
            r1 = move-exception
            if (r2 != 0) goto L70
            goto L77
        L70:
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L3b java.util.concurrent.ExecutionException -> L3d
            r2.interrupt()     // Catch: java.lang.Throwable -> L3b java.util.concurrent.ExecutionException -> L3d
        L77:
            throw r1     // Catch: java.lang.Throwable -> L3b java.util.concurrent.ExecutionException -> L3d
        L78:
            r2 = 1
            goto L2d
        L7a:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L3b java.util.concurrent.ExecutionException -> L3d
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.Throwable -> L3b java.util.concurrent.ExecutionException -> L3d
            java.lang.String r1 = com.google.android.gms.internal.play_billing.d3.g(r3, r1)     // Catch: java.lang.Throwable -> L3b java.util.concurrent.ExecutionException -> L3d
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L3b java.util.concurrent.ExecutionException -> L3d
            throw r2     // Catch: java.lang.Throwable -> L3b java.util.concurrent.ExecutionException -> L3d
        L88:
            r0.k(r1)
            return
        L8c:
            java.lang.Throwable r1 = r1.getCause()
            r0.k(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.t1.run():void");
    }

    public final String toString() {
        ka.k kVar = new ka.k(t1.class.getSimpleName());
        i iVar = new i();
        ((i) kVar.f27326e).f14213b = iVar;
        kVar.f27326e = iVar;
        iVar.f14212a = this.f14310c;
        return kVar.toString();
    }
}
