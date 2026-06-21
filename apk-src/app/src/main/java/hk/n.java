package hk;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class n extends f1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f20692f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f20693g;

    public /* synthetic */ n(l lVar, int i) {
        this.f20692f = i;
        this.f20693g = lVar;
    }

    @Override // hk.f1
    public final boolean j() {
        switch (this.f20692f) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // hk.f1
    public final void k(Throwable th2) {
        int i = this.f20692f;
        l lVar = this.f20693g;
        switch (i) {
            case 0:
                Throwable thR = lVar.r(i());
                if (lVar.x()) {
                    mj.a aVar = lVar.f20687e;
                    Intrinsics.c(aVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
                    mk.f fVar = (mk.f) aVar;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = mk.f.i;
                    while (true) {
                        Object obj = atomicReferenceFieldUpdater.get(fVar);
                        d8.k kVar = mk.a.f28906c;
                        if (Intrinsics.a(obj, kVar)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(fVar, kVar, thR)) {
                                if (atomicReferenceFieldUpdater.get(fVar) != kVar) {
                                }
                                break;
                            }
                        } else if (!(obj instanceof Throwable)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, null)) {
                                if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                                }
                            }
                        }
                    }
                }
                lVar.o(thR);
                if (!lVar.x()) {
                    lVar.p();
                }
                break;
            default:
                ij.k kVar2 = ij.m.f21341c;
                lVar.resumeWith(Unit.f27471a);
                break;
        }
    }
}
