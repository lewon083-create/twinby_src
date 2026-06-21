package zl;

import yads.rp2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class w0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f46649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ rp2 f46650c;

    public /* synthetic */ w0(rp2 rp2Var, int i) {
        this.f46649b = i;
        this.f46650c = rp2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f46649b) {
            case 0:
                this.f46650c.a();
                break;
            default:
                this.f46650c.b();
                break;
        }
    }
}
