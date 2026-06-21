package zl;

import yads.gk2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class p implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f46621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gk2 f46622c;

    public /* synthetic */ p(gk2 gk2Var, int i) {
        this.f46621b = i;
        this.f46622c = gk2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f46621b) {
            case 0:
                this.f46622c.f();
                break;
            case 1:
                this.f46622c.g();
                break;
            default:
                this.f46622c.e();
                break;
        }
    }
}
