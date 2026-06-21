package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c2 extends n1 implements Runnable, j1 {
    public final Runnable i;

    public c2(Runnable runnable) {
        runnable.getClass();
        this.i = runnable;
    }

    @Override // com.google.android.gms.internal.play_billing.n1
    public final String b() {
        return pe.a.f("task=[", this.i.toString(), "]");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.i.run();
        } catch (Throwable th2) {
            e(th2);
            throw th2;
        }
    }
}
