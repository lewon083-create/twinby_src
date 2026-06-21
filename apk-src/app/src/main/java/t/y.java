package t;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f33323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bb.e f33324c;

    public /* synthetic */ y(bb.e eVar, int i) {
        this.f33323b = i;
        this.f33324c = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f33323b) {
            case 0:
                bb.e eVar = this.f33324c;
                if (((c0) ((r3.b) eVar.f2021e).f32189d).M == 9) {
                    ((c0) ((r3.b) eVar.f2021e).f32189d).v("Camera onError timeout, reopen it.", null);
                    ((c0) ((r3.b) eVar.f2021e).f32189d).F(8);
                    ((c0) ((r3.b) eVar.f2021e).f32189d).i.b();
                } else {
                    c0 c0Var = (c0) ((r3.b) eVar.f2021e).f32189d;
                    c0Var.v("Camera skip reopen at state: ".concat(z.n(c0Var.M)), null);
                }
                break;
            default:
                bb.e eVar2 = this.f33324c;
                if (!((AtomicBoolean) eVar2.f2020d).getAndSet(true)) {
                    ((c0) ((r3.b) eVar2.f2021e).f32189d).f32969d.execute(new y(eVar2, 0));
                    break;
                }
                break;
        }
    }
}
