package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ct0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dt0 f4311c;

    public /* synthetic */ ct0(dt0 dt0Var, int i) {
        this.f4310b = i;
        this.f4311c = dt0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4310b) {
            case 0:
                this.f4311c.k();
                return;
            case 1:
                this.f4311c.k();
                return;
            case 2:
                this.f4311c.k();
                return;
            case 3:
                this.f4311c.k();
                return;
            default:
                dt0 dt0Var = this.f4311c;
                synchronized (dt0Var) {
                    dt0Var.f4643b.set(false);
                    dt0Var.k();
                }
                return;
        }
    }
}
