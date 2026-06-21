package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kk0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lk0 f7249c;

    public /* synthetic */ kk0(lk0 lk0Var, int i) {
        this.f7248b = i;
        this.f7249c = lk0Var;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f7248b) {
            case 0:
                this.f7249c.c();
                break;
            case 1:
                this.f7249c.c();
                break;
            default:
                lk0 lk0Var = this.f7249c;
                lk0Var.getClass();
                lk0Var.f7556f.execute(new kk0(lk0Var, 1));
                break;
        }
    }
}
