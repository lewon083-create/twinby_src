package hk;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class i0 extends mk.q {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f20669f = AtomicIntegerFieldUpdater.newUpdater(i0.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // mk.q, hk.k1
    public final void k(Object obj) {
        l(obj);
    }

    @Override // mk.q, hk.k1
    public final void l(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f20669f;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                mk.a.g(c0.n(obj), nj.f.b(this.f28936e));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
