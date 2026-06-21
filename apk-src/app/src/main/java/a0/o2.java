package a0;

import android.util.Range;
import android.util.Size;
import android.view.Surface;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o2 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Range f177q = g0.n.f19676h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f178a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Size f179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0 f180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Range f181d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g0.f0 f182e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f183f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f184g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j1.k f185h;
    public final j1.h i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final j1.k f186j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final j1.h f187k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j1.h f188l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final l2 f189m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public m f190n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public n2 f191o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Executor f192p;

    public o2(Size size, g0.f0 f0Var, boolean z5, i0 i0Var, int i, Range range, q0.h hVar) {
        this.f179b = size;
        this.f182e = f0Var;
        this.f183f = z5;
        f2.g.a("SurfaceRequest's DynamicRange must always be fully specified.", i0Var.b());
        this.f180c = i0Var;
        this.f184g = i;
        this.f181d = range;
        final String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        final AtomicReference atomicReference = new AtomicReference(null);
        final int i10 = 0;
        j1.k kVarW = i0.o.w(new j1.i() { // from class: a0.i2
            @Override // j1.i
            public final Object m(j1.h hVar2) {
                switch (i10) {
                    case 0:
                        atomicReference.set(hVar2);
                        return str + "-cancellation";
                    case 1:
                        atomicReference.set(hVar2);
                        return str + "-status";
                    default:
                        atomicReference.set(hVar2);
                        return str + "-Surface";
                }
            }
        });
        j1.h hVar2 = (j1.h) atomicReference.get();
        hVar2.getClass();
        this.f188l = hVar2;
        final AtomicReference atomicReference2 = new AtomicReference(null);
        final int i11 = 1;
        j1.k kVarW2 = i0.o.w(new j1.i() { // from class: a0.i2
            @Override // j1.i
            public final Object m(j1.h hVar22) {
                switch (i11) {
                    case 0:
                        atomicReference2.set(hVar22);
                        return str + "-cancellation";
                    case 1:
                        atomicReference2.set(hVar22);
                        return str + "-status";
                    default:
                        atomicReference2.set(hVar22);
                        return str + "-Surface";
                }
            }
        });
        this.f186j = kVarW2;
        k0.j.a(kVarW2, new g0(2, hVar2, kVarW), hl.d.j());
        j1.h hVar3 = (j1.h) atomicReference2.get();
        hVar3.getClass();
        final AtomicReference atomicReference3 = new AtomicReference(null);
        final int i12 = 2;
        j1.k kVarW3 = i0.o.w(new j1.i() { // from class: a0.i2
            @Override // j1.i
            public final Object m(j1.h hVar22) {
                switch (i12) {
                    case 0:
                        atomicReference3.set(hVar22);
                        return str + "-cancellation";
                    case 1:
                        atomicReference3.set(hVar22);
                        return str + "-status";
                    default:
                        atomicReference3.set(hVar22);
                        return str + "-Surface";
                }
            }
        });
        this.f185h = kVarW3;
        j1.h hVar4 = (j1.h) atomicReference3.get();
        hVar4.getClass();
        this.i = hVar4;
        l2 l2Var = new l2(this, size);
        this.f189m = l2Var;
        ed.d dVarF = k0.j.f(l2Var.f19513e);
        k0.j.a(kVarW3, new bb.e(dVarF, hVar3, str, 1), hl.d.j());
        dVarF.a(new j2(this, 0), hl.d.j());
        j0.b bVarJ = hl.d.j();
        AtomicReference atomicReference4 = new AtomicReference(null);
        k0.j.a(i0.o.w(new y(2, this, atomicReference4)), new fe.c(1, hVar), bVarJ);
        j1.h hVar5 = (j1.h) atomicReference4.get();
        hVar5.getClass();
        this.f187k = hVar5;
    }

    public final boolean a() {
        return this.f185h.f26173c.isDone();
    }

    public final void b(final Surface surface, Executor executor, final f2.a aVar) {
        if (!surface.isValid()) {
            final int i = 0;
            executor.execute(new Runnable() { // from class: a0.k2
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i) {
                        case 0:
                            aVar.accept(new l(2, surface));
                            break;
                        case 1:
                            aVar.accept(new l(3, surface));
                            break;
                        default:
                            aVar.accept(new l(4, surface));
                            break;
                    }
                }
            });
            return;
        }
        if (!this.i.b(surface)) {
            j1.k kVar = this.f185h;
            if (!kVar.isCancelled()) {
                f2.g.h(null, kVar.f26173c.isDone());
                try {
                    kVar.get();
                    final int i10 = 1;
                    executor.execute(new Runnable() { // from class: a0.k2
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    aVar.accept(new l(2, surface));
                                    break;
                                case 1:
                                    aVar.accept(new l(3, surface));
                                    break;
                                default:
                                    aVar.accept(new l(4, surface));
                                    break;
                            }
                        }
                    });
                    return;
                } catch (InterruptedException | ExecutionException unused) {
                    final int i11 = 2;
                    executor.execute(new Runnable() { // from class: a0.k2
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    aVar.accept(new l(2, surface));
                                    break;
                                case 1:
                                    aVar.accept(new l(3, surface));
                                    break;
                                default:
                                    aVar.accept(new l(4, surface));
                                    break;
                            }
                        }
                    });
                    return;
                }
            }
        }
        k0.j.a(this.f186j, new g0(3, aVar, surface), executor);
    }

    public final void c(Executor executor, n2 n2Var) {
        m mVar;
        synchronized (this.f178a) {
            this.f191o = n2Var;
            this.f192p = executor;
            mVar = this.f190n;
        }
        if (mVar != null) {
            executor.execute(new h2(n2Var, mVar, 1));
        }
    }

    public final void d() {
        this.i.d(new c7.k("Surface request will not complete."));
    }
}
