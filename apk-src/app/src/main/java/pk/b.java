package pk;

import d8.k;
import ek.o;
import hk.b2;
import hk.j;
import hk.l;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import mk.r;
import wj.n;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements j, b2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f31505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f31506c;

    public b(c cVar, l lVar) {
        this.f31506c = cVar;
        this.f31505b = lVar;
    }

    @Override // hk.b2
    public final void a(r rVar, int i) {
        this.f31505b.a(rVar, i);
    }

    @Override // hk.j
    public final k f(Object obj, n nVar) {
        c cVar = this.f31506c;
        hk.k kVar = new hk.k(cVar, this);
        k kVarE = this.f31505b.E((Unit) obj, kVar);
        if (kVarE != null) {
            c.f31507g.set(cVar, null);
        }
        return kVarE;
    }

    @Override // hk.j
    public final void g(Object obj, Function1 function1) {
        this.f31505b.g((Unit) obj, null);
    }

    @Override // mj.a
    public final CoroutineContext getContext() {
        return this.f31505b.f20688f;
    }

    @Override // hk.j
    public final void h(Object obj, n nVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f31507g;
        c cVar = this.f31506c;
        atomicReferenceFieldUpdater.set(cVar, null);
        o oVar = new o(cVar, this);
        this.f31505b.g((Unit) obj, oVar);
    }

    @Override // hk.j
    public final boolean isActive() {
        return this.f31505b.isActive();
    }

    @Override // hk.j
    public final void j(Object obj) {
        this.f31505b.j(obj);
    }

    @Override // mj.a
    public final void resumeWith(Object obj) {
        this.f31505b.resumeWith(obj);
    }
}
