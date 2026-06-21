package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hm0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ im0 f6186c;

    public /* synthetic */ hm0(im0 im0Var, int i) {
        this.f6185b = i;
        this.f6186c = im0Var;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f6185b) {
            case 0:
                im0 im0Var = this.f6186c;
                im0Var.f6543a.set(new gm0(im0Var.f6547e.h(), im0Var.f6548f, im0Var.f6545c));
                break;
            default:
                im0 im0Var2 = this.f6186c;
                im0Var2.f6546d.execute(new hm0(im0Var2, 0));
                break;
        }
    }
}
