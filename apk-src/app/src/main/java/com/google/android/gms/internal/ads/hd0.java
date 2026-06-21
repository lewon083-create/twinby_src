package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hd0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ id0 f6101c;

    public /* synthetic */ hd0(id0 id0Var, int i) {
        this.f6100b = i;
        this.f6101c = id0Var;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f6100b) {
            case 0:
                id0 id0Var = this.f6101c;
                id0Var.f6466c.execute(new hd0(id0Var, 1));
                break;
            case 1:
                this.f6101c.a();
                break;
            default:
                this.f6101c.a();
                break;
        }
    }
}
