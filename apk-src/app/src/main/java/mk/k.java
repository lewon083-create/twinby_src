package mk;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f28925a = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new m(8, false);

    public final boolean a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28925a;
            m mVar = (m) atomicReferenceFieldUpdater.get(this);
            int iA = mVar.a(runnable);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                m mVarC = mVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, mVar, mVarC) && atomicReferenceFieldUpdater.get(this) == mVar) {
                }
            } else if (iA == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28925a;
            m mVar = (m) atomicReferenceFieldUpdater.get(this);
            if (mVar.b()) {
                return;
            }
            m mVarC = mVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, mVar, mVarC) && atomicReferenceFieldUpdater.get(this) == mVar) {
            }
        }
    }

    public final int c() {
        m mVar = (m) f28925a.get(this);
        mVar.getClass();
        long j10 = m.f28928f.get(mVar);
        return (((int) ((j10 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j10))) & 1073741823;
    }

    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28925a;
            m mVar = (m) atomicReferenceFieldUpdater.get(this);
            Object objD = mVar.d();
            if (objD != m.f28929g) {
                return objD;
            }
            m mVarC = mVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, mVar, mVarC) && atomicReferenceFieldUpdater.get(this) == mVar) {
            }
        }
    }
}
