package e1;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements j1.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f15961c;

    public /* synthetic */ f(AtomicReference atomicReference, int i) {
        this.f15960b = i;
        this.f15961c = atomicReference;
    }

    @Override // j1.i
    public final Object m(j1.h hVar) {
        switch (this.f15960b) {
            case 0:
                this.f15961c.set(hVar);
                return "Data closed";
            case 1:
                this.f15961c.set(hVar);
                return "Data closed";
            case 2:
                this.f15961c.set(hVar);
                return "acquireInputBuffer";
            case 3:
                this.f15961c.set(hVar);
                return "mReleasedFuture";
            case 4:
                this.f15961c.set(hVar);
                return "Terminate InputBuffer";
            default:
                this.f15961c.set(new l0.h(1, hVar));
                return "OnScreenFlashUiApplied";
        }
    }
}
