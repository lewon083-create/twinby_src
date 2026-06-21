package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class w81 extends g71 implements Runnable {
    public final Runnable i;

    public w81(Runnable runnable) {
        runnable.getClass();
        this.i = runnable;
    }

    @Override // com.google.android.gms.internal.ads.h71
    public final String h() {
        String string = this.i.toString();
        return t.z.g(new StringBuilder(string.length() + 7), "task=[", string, "]");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.i.run();
        } catch (Throwable th2) {
            f(th2);
            throw th2;
        }
    }
}
