package hk;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class f1 extends mk.j implements m0, y0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public k1 f20661e;

    @Override // hk.m0
    public final void a() {
        k1 k1VarI = i();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k1.f20683b;
            Object obj = atomicReferenceFieldUpdater.get(k1VarI);
            if (obj instanceof f1) {
                if (obj != this) {
                    return;
                }
                o0 o0Var = c0.f20649j;
                while (!atomicReferenceFieldUpdater.compareAndSet(k1VarI, obj, o0Var)) {
                    if (atomicReferenceFieldUpdater.get(k1VarI) != obj) {
                        break;
                    }
                }
                return;
            }
            if (!(obj instanceof y0) || ((y0) obj).c() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = mk.j.f28922b;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof mk.o) {
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                Intrinsics.c(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                mk.j jVar = (mk.j) obj2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = mk.j.f28924d;
                mk.o oVar = (mk.o) atomicReferenceFieldUpdater3.get(jVar);
                if (oVar == null) {
                    oVar = new mk.o(jVar);
                    atomicReferenceFieldUpdater3.set(jVar, oVar);
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, oVar)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                        break;
                    }
                }
                jVar.e();
                return;
            }
        }
    }

    @Override // hk.y0
    public final m1 c() {
        return null;
    }

    public c1 getParent() {
        return i();
    }

    public final k1 i() {
        k1 k1Var = this.f20661e;
        if (k1Var != null) {
            return k1Var;
        }
        Intrinsics.g("job");
        throw null;
    }

    @Override // hk.y0
    public final boolean isActive() {
        return true;
    }

    public abstract boolean j();

    public abstract void k(Throwable th2);

    @Override // mk.j
    public final String toString() {
        return getClass().getSimpleName() + '@' + c0.h(this) + "[job@" + c0.h(i()) + ']';
    }
}
