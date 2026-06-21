package hk;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends f1 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_disposer$volatile");
    private volatile /* synthetic */ Object _disposer$volatile;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f20638f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public m0 f20639g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e f20640h;

    public c(e eVar, l lVar) {
        this.f20640h = eVar;
        this.f20638f = lVar;
    }

    @Override // hk.f1
    public final boolean j() {
        return false;
    }

    @Override // hk.f1
    public final void k(Throwable th2) {
        l lVar = this.f20638f;
        if (th2 != null) {
            lVar.getClass();
            d8.k kVarE = lVar.E(new t(th2, false), null);
            if (kVarE != null) {
                lVar.j(kVarE);
                d dVar = (d) i.get(this);
                if (dVar != null) {
                    dVar.b();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = e.f20655b;
        e eVar = this.f20640h;
        if (atomicIntegerFieldUpdater.decrementAndGet(eVar) == 0) {
            f0[] f0VarArr = eVar.f20656a;
            ArrayList arrayList = new ArrayList(f0VarArr.length);
            for (f0 f0Var : f0VarArr) {
                arrayList.add(f0Var.b());
            }
            ij.k kVar = ij.m.f21341c;
            lVar.resumeWith(arrayList);
        }
    }
}
