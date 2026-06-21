package zl;

import yads.cl;
import yads.pa0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f46554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cl f46555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pa0 f46556d;

    public /* synthetic */ e(cl clVar, pa0 pa0Var, int i) {
        this.f46554b = i;
        this.f46555c = clVar;
        this.f46556d = pa0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f46554b) {
            case 0:
                this.f46555c.c(this.f46556d);
                break;
            default:
                this.f46555c.d(this.f46556d);
                break;
        }
    }
}
