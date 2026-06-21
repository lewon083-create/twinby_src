package hk;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class a1 extends f1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f20629g = AtomicIntegerFieldUpdater.newUpdater(a1.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ef.b f20630f;

    public a1(ef.b bVar) {
        this.f20630f = bVar;
    }

    @Override // hk.f1
    public final boolean j() {
        return true;
    }

    @Override // hk.f1
    public final void k(Throwable th2) {
        if (f20629g.compareAndSet(this, 0, 1)) {
            this.f20630f.invoke(th2);
        }
    }
}
