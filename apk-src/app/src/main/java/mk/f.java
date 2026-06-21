package mk;

import hk.c0;
import hk.j0;
import hk.u0;
import hk.u1;
import hk.x;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends j0 implements oj.d, mj.a {
    public static final /* synthetic */ AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x f28912e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final oj.c f28913f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f28914g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f28915h;

    public f(x xVar, oj.c cVar) {
        super(-1);
        this.f28912e = xVar;
        this.f28913f = cVar;
        this.f28914g = a.f28905b;
        this.f28915h = u.b(cVar.getContext());
    }

    @Override // oj.d
    public final oj.d getCallerFrame() {
        return this.f28913f;
    }

    @Override // mj.a
    public final CoroutineContext getContext() {
        return this.f28913f.getContext();
    }

    @Override // hk.j0
    public final Object k() {
        Object obj = this.f28914g;
        this.f28914g = a.f28905b;
        return obj;
    }

    @Override // mj.a
    public final void resumeWith(Object obj) {
        Throwable thA = ij.m.a(obj);
        Object tVar = thA == null ? obj : new hk.t(thA, false);
        oj.c cVar = this.f28913f;
        CoroutineContext context = cVar.getContext();
        x xVar = this.f28912e;
        if (xVar.k(context)) {
            this.f28914g = tVar;
            this.f20674d = 0;
            xVar.j(cVar.getContext(), this);
            return;
        }
        u0 u0VarA = u1.a();
        if (u0VarA.f20716d >= 4294967296L) {
            this.f28914g = tVar;
            this.f20674d = 0;
            kotlin.collections.l lVar = u0VarA.f20718f;
            if (lVar == null) {
                lVar = new kotlin.collections.l();
                u0VarA.f20718f = lVar;
            }
            lVar.addLast(this);
            return;
        }
        u0VarA.I(true);
        try {
            CoroutineContext context2 = cVar.getContext();
            Object objC = u.c(context2, this.f28915h);
            try {
                cVar.resumeWith(obj);
                Unit unit = Unit.f27471a;
                while (u0VarA.K()) {
                }
            } finally {
                u.a(context2, objC);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f28912e + ", " + c0.r(this.f28913f) + ']';
    }

    @Override // hk.j0
    public final mj.a c() {
        return this;
    }
}
