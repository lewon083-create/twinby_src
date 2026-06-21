package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c30 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e30 f4008c;

    public /* synthetic */ c30(e30 e30Var, int i) {
        this.f4007b = i;
        this.f4008c = e30Var;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f4007b) {
            case 0:
                e30 e30Var = this.f4008c;
                e30Var.f4809c.execute(new c30(e30Var, 1));
                break;
            default:
                this.f4008c.g();
                break;
        }
    }
}
