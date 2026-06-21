package jk;

import hk.c0;
import hk.d1;
import hk.i1;
import hk.k1;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class p extends hk.a implements q, g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f26721e;

    public p(CoroutineContext coroutineContext, c cVar) {
        super(coroutineContext, true);
        this.f26721e = cVar;
    }

    @Override // hk.a
    public final void U(Throwable th2, boolean z5) {
        if (this.f26721e.g(th2, false) || z5) {
            return;
        }
        c0.j(this.f20628d, th2);
    }

    @Override // hk.a
    public final void V(Object obj) {
        this.f26721e.g(null, false);
    }

    public final void X(o oVar) {
        c cVar = this.f26721e;
        cVar.getClass();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f26689k;
        while (!atomicReferenceFieldUpdater.compareAndSet(cVar, null, oVar)) {
            if (atomicReferenceFieldUpdater.get(cVar) != null) {
                while (true) {
                    Object obj = atomicReferenceFieldUpdater.get(cVar);
                    d8.k kVar = e.f26707q;
                    if (obj != kVar) {
                        if (obj == e.f26708r) {
                            throw new IllegalStateException("Another handler was already registered and successfully invoked");
                        }
                        throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
                    }
                    d8.k kVar2 = e.f26708r;
                    while (!atomicReferenceFieldUpdater.compareAndSet(cVar, kVar, kVar2)) {
                        if (atomicReferenceFieldUpdater.get(cVar) != kVar) {
                            break;
                        }
                    }
                    oVar.invoke(cVar.m());
                    return;
                }
            }
        }
    }

    @Override // hk.k1, hk.c1
    public final void a(CancellationException cancellationException) {
        Object obj = k1.f20683b.get(this);
        if (obj instanceof hk.t) {
            return;
        }
        if ((obj instanceof i1) && ((i1) obj).d()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new d1(q(), null, this);
        }
        o(cancellationException);
    }

    @Override // jk.s
    public final Object c(Object obj, mj.a aVar) {
        return this.f26721e.c(obj, aVar);
    }

    @Override // jk.s
    public final Object i(Object obj) {
        return this.f26721e.i(obj);
    }

    @Override // jk.r
    public final b iterator() {
        c cVar = this.f26721e;
        cVar.getClass();
        return new b(cVar);
    }

    @Override // hk.k1
    public final void o(CancellationException cancellationException) {
        this.f26721e.g(cancellationException, true);
        n(cancellationException);
    }
}
