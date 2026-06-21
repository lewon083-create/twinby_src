package q0;

import g0.a1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a1 f31581c;

    public /* synthetic */ i(a1 a1Var, int i) {
        this.f31580b = i;
        this.f31581c = a1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f31580b) {
            case 0:
                this.f31581c.a();
                break;
            default:
                this.f31581c.b();
                break;
        }
    }
}
