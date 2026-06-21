package zl;

import yads.fj3;
import yads.pa0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f46612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fj3 f46613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pa0 f46614d;

    public /* synthetic */ m(fj3 fj3Var, pa0 pa0Var, int i) {
        this.f46612b = i;
        this.f46613c = fj3Var;
        this.f46614d = pa0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f46612b) {
            case 0:
                this.f46613c.c(this.f46614d);
                break;
            default:
                this.f46613c.d(this.f46614d);
                break;
        }
    }
}
