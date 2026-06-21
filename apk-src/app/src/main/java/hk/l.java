package hk;

import com.google.android.gms.internal.ads.oc;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class l extends j0 implements j, oj.d, b2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f20685g = AtomicIntegerFieldUpdater.newUpdater(l.class, "_decisionAndIndex$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f20686h = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final mj.a f20687e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CoroutineContext f20688f;

    public l(int i10, mj.a aVar) {
        super(i10);
        this.f20687e = aVar;
        this.f20688f = aVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = b.f20632a;
    }

    public static Object D(o1 o1Var, Object obj, int i10, wj.n nVar) {
        if (obj instanceof t) {
            return obj;
        }
        if (i10 != 1 && i10 != 2) {
            return obj;
        }
        if (nVar != null || (o1Var instanceof i)) {
            return new s(obj, o1Var instanceof i ? (i) o1Var : null, nVar, (CancellationException) null, 16);
        }
        return obj;
    }

    public static void y(o1 o1Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + o1Var + ", already has " + obj).toString());
    }

    public final void A() {
        mj.a aVar = this.f20687e;
        Throwable th2 = null;
        mk.f fVar = aVar instanceof mk.f ? (mk.f) aVar : null;
        if (fVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = mk.f.i;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(fVar);
                d8.k kVar = mk.a.f28906c;
                if (obj == kVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(fVar, kVar, this)) {
                        if (atomicReferenceFieldUpdater.get(fVar) != kVar) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th2 = (Throwable) obj;
                }
            }
            if (th2 == null) {
                return;
            }
            p();
            o(th2);
        }
    }

    public final void B(Object obj, int i10, wj.n nVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20686h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof o1) {
                Object objD = D((o1) obj2, obj, i10, nVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objD)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!x()) {
                    p();
                }
                q(i10);
                return;
            }
            if (obj2 instanceof m) {
                m mVar = (m) obj2;
                if (m.f20691c.compareAndSet(mVar, 0, 1)) {
                    if (nVar != null) {
                        m(nVar, mVar.f20711a, obj);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    public final void C(x xVar, Unit unit) {
        mj.a aVar = this.f20687e;
        mk.f fVar = aVar instanceof mk.f ? (mk.f) aVar : null;
        B(unit, (fVar != null ? fVar.f28912e : null) == xVar ? 4 : this.f20674d, null);
    }

    public final d8.k E(Object obj, wj.n nVar) {
        d8.k kVar = c0.f20641a;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20686h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof o1)) {
                return null;
            }
            Object objD = D((o1) obj2, obj, this.f20674d, nVar);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objD)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!x()) {
                p();
            }
            return kVar;
        }
    }

    @Override // hk.b2
    public final void a(mk.r rVar, int i10) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i11;
        do {
            atomicIntegerFieldUpdater = f20685g;
            i11 = atomicIntegerFieldUpdater.get(this);
            if ((i11 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, ((i11 >> 29) << 29) + i10));
        w(rVar);
    }

    @Override // hk.j0
    public final void b(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20686h;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof o1) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof t) {
                return;
            }
            if (!(obj instanceof s)) {
                cancellationException2 = cancellationException;
                s sVar = new s(obj, (i) null, (wj.n) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, sVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            s sVar2 = (s) obj;
            if (sVar2.f20708e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            s sVarA = s.a(sVar2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, sVarA)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    cancellationException2 = cancellationException;
                }
            }
            i iVar = sVar2.f20705b;
            if (iVar != null) {
                l(iVar, cancellationException);
            }
            wj.n nVar = sVar2.f20706c;
            if (nVar != null) {
                m(nVar, cancellationException, sVar2.f20704a);
                return;
            }
            return;
            cancellationException = cancellationException2;
        }
    }

    @Override // hk.j0
    public final mj.a c() {
        return this.f20687e;
    }

    @Override // hk.j0
    public final Throwable d(Object obj) {
        Throwable thD = super.d(obj);
        if (thD != null) {
            return thD;
        }
        return null;
    }

    @Override // hk.j0
    public final Object e(Object obj) {
        return obj instanceof s ? ((s) obj).f20704a : obj;
    }

    @Override // hk.j
    public final d8.k f(Object obj, wj.n nVar) {
        return E(obj, nVar);
    }

    @Override // hk.j
    public final void g(Object obj, Function1 function1) {
        B(obj, this.f20674d, function1 != null ? new k(0, function1) : null);
    }

    @Override // oj.d
    public final oj.d getCallerFrame() {
        mj.a aVar = this.f20687e;
        if (aVar instanceof oj.d) {
            return (oj.d) aVar;
        }
        return null;
    }

    @Override // mj.a
    public final CoroutineContext getContext() {
        return this.f20688f;
    }

    @Override // hk.j
    public final void h(Object obj, wj.n nVar) {
        B(obj, this.f20674d, nVar);
    }

    @Override // hk.j
    public final boolean isActive() {
        return f20686h.get(this) instanceof o1;
    }

    @Override // hk.j
    public final void j(Object obj) {
        q(this.f20674d);
    }

    @Override // hk.j0
    public final Object k() {
        return f20686h.get(this);
    }

    public final void l(i iVar, Throwable th2) {
        try {
            iVar.a(th2);
        } catch (Throwable th3) {
            c0.j(this.f20688f, new oc("Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    public final void m(wj.n nVar, Throwable th2, Object obj) {
        CoroutineContext coroutineContext = this.f20688f;
        try {
            nVar.invoke(th2, obj, coroutineContext);
        } catch (Throwable th3) {
            c0.j(coroutineContext, new oc("Exception in resume onCancellation handler for " + this, th3));
        }
    }

    public final void n(mk.r rVar, Throwable th2) {
        CoroutineContext coroutineContext = this.f20688f;
        int i10 = f20685g.get(this) & 536870911;
        if (i10 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            rVar.h(i10, coroutineContext);
        } catch (Throwable th3) {
            c0.j(coroutineContext, new oc("Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    public final void o(Throwable th2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20686h;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof o1) {
                m mVar = new m(this, th2, (obj instanceof i) || (obj instanceof mk.r));
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                o1 o1Var = (o1) obj;
                if (o1Var instanceof i) {
                    l((i) obj, th2);
                } else if (o1Var instanceof mk.r) {
                    n((mk.r) obj, th2);
                }
                if (!x()) {
                    p();
                }
                q(this.f20674d);
                return;
            }
            return;
        }
    }

    public final void p() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
        m0 m0Var = (m0) atomicReferenceFieldUpdater.get(this);
        if (m0Var == null) {
            return;
        }
        m0Var.a();
        atomicReferenceFieldUpdater.set(this, n1.f20696b);
    }

    public final void q(int i10) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i11;
        do {
            atomicIntegerFieldUpdater = f20685g;
            i11 = atomicIntegerFieldUpdater.get(this);
            int i12 = i11 >> 29;
            if (i12 != 0) {
                if (i12 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z5 = i10 == 4;
                mj.a aVar = this.f20687e;
                if (!z5 && (aVar instanceof mk.f)) {
                    boolean z10 = i10 == 1 || i10 == 2;
                    int i13 = this.f20674d;
                    if (z10 == (i13 == 1 || i13 == 2)) {
                        mk.f fVar = (mk.f) aVar;
                        x xVar = fVar.f28912e;
                        CoroutineContext context = fVar.f28913f.getContext();
                        if (xVar.k(context)) {
                            xVar.j(context, this);
                            return;
                        }
                        u0 u0VarA = u1.a();
                        if (u0VarA.f20716d < 4294967296L) {
                            u0VarA.I(true);
                            try {
                                c0.o(this, aVar, true);
                                do {
                                } while (u0VarA.K());
                            } finally {
                                try {
                                } finally {
                                }
                            }
                            return;
                        }
                        kotlin.collections.l lVar = u0VarA.f20718f;
                        if (lVar == null) {
                            lVar = new kotlin.collections.l();
                            u0VarA.f20718f = lVar;
                        }
                        lVar.addLast(this);
                        return;
                    }
                }
                c0.o(this, aVar, z5);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, 1073741824 + (536870911 & i11)));
    }

    public Throwable r(k1 k1Var) {
        return k1Var.v();
    }

    @Override // mj.a
    public final void resumeWith(Object obj) {
        Throwable thA = ij.m.a(obj);
        if (thA != null) {
            obj = new t(thA, false);
        }
        B(obj, this.f20674d, null);
    }

    public final Object s() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        c1 c1Var;
        boolean zX = x();
        do {
            atomicIntegerFieldUpdater = f20685g;
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (zX) {
                    A();
                }
                Object obj = f20686h.get(this);
                if (obj instanceof t) {
                    throw ((t) obj).f20711a;
                }
                int i12 = this.f20674d;
                if ((i12 != 1 && i12 != 2) || (c1Var = (c1) this.f20688f.get(b1.f20637b)) == null || c1Var.isActive()) {
                    return e(obj);
                }
                CancellationException cancellationExceptionV = ((k1) c1Var).v();
                b(cancellationExceptionV);
                throw cancellationExceptionV;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 536870912 + (536870911 & i10)));
        if (((m0) i.get(this)) == null) {
            u();
        }
        if (zX) {
            A();
        }
        return nj.a.f29512b;
    }

    public final void t() {
        m0 m0VarU = u();
        if (m0VarU == null || (f20686h.get(this) instanceof o1)) {
            return;
        }
        m0VarU.a();
        i.set(this, n1.f20696b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z());
        sb2.append('(');
        sb2.append(c0.r(this.f20687e));
        sb2.append("){");
        Object obj = f20686h.get(this);
        sb2.append(obj instanceof o1 ? "Active" : obj instanceof m ? "Cancelled" : "Completed");
        sb2.append("}@");
        sb2.append(c0.h(this));
        return sb2.toString();
    }

    public final m0 u() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        c1 c1Var = (c1) this.f20688f.get(b1.f20637b);
        if (c1Var == null) {
            return null;
        }
        m0 m0VarK = c0.k(c1Var, true, new n(this, 0));
        do {
            atomicReferenceFieldUpdater = i;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, m0VarK)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return m0VarK;
    }

    public final void v(Function1 function1) {
        w(new h(1, function1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a0, code lost:
    
        y(r8, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a3, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w(hk.o1 r8) {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = hk.l.f20686h
            java.lang.Object r2 = r0.get(r7)
            boolean r1 = r2 instanceof hk.b
            if (r1 == 0) goto L19
        La:
            boolean r1 = r0.compareAndSet(r7, r2, r8)
            if (r1 == 0) goto L12
            goto L97
        L12:
            java.lang.Object r1 = r0.get(r7)
            if (r1 == r2) goto La
            goto L0
        L19:
            boolean r1 = r2 instanceof hk.i
            r3 = 0
            if (r1 != 0) goto La0
            boolean r1 = r2 instanceof mk.r
            if (r1 != 0) goto La0
            boolean r1 = r2 instanceof hk.t
            if (r1 == 0) goto L4d
            r0 = r2
            hk.t r0 = (hk.t) r0
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = hk.t.f20710b
            r4 = 0
            r5 = 1
            boolean r1 = r1.compareAndSet(r0, r4, r5)
            if (r1 == 0) goto L49
            boolean r1 = r2 instanceof hk.m
            if (r1 == 0) goto L97
            java.lang.Throwable r0 = r0.f20711a
            boolean r1 = r8 instanceof hk.i
            if (r1 == 0) goto L43
            hk.i r8 = (hk.i) r8
            r7.l(r8, r0)
            return
        L43:
            mk.r r8 = (mk.r) r8
            r7.n(r8, r0)
            return
        L49:
            y(r8, r2)
            throw r3
        L4d:
            boolean r1 = r2 instanceof hk.s
            if (r1 == 0) goto L80
            r1 = r2
            hk.s r1 = (hk.s) r1
            hk.i r4 = r1.f20705b
            if (r4 != 0) goto L7c
            boolean r4 = r8 instanceof mk.r
            if (r4 == 0) goto L5d
            goto L97
        L5d:
            r4 = r8
            hk.i r4 = (hk.i) r4
            java.lang.Throwable r5 = r1.f20708e
            if (r5 == 0) goto L68
            r7.l(r4, r5)
            return
        L68:
            r5 = 29
            hk.s r1 = hk.s.a(r1, r4, r3, r5)
        L6e:
            boolean r3 = r0.compareAndSet(r7, r2, r1)
            if (r3 == 0) goto L75
            goto L97
        L75:
            java.lang.Object r3 = r0.get(r7)
            if (r3 == r2) goto L6e
            goto L0
        L7c:
            y(r8, r2)
            throw r3
        L80:
            boolean r1 = r8 instanceof mk.r
            if (r1 == 0) goto L85
            goto L97
        L85:
            r3 = r8
            hk.i r3 = (hk.i) r3
            hk.s r1 = new hk.s
            r5 = 0
            r6 = 28
            r4 = 0
            r1.<init>(r2, r3, r4, r5, r6)
        L91:
            boolean r3 = r0.compareAndSet(r7, r2, r1)
            if (r3 == 0) goto L98
        L97:
            return
        L98:
            java.lang.Object r3 = r0.get(r7)
            if (r3 == r2) goto L91
            goto L0
        La0:
            y(r8, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: hk.l.w(hk.o1):void");
    }

    public final boolean x() {
        if (this.f20674d != 2) {
            return false;
        }
        mj.a aVar = this.f20687e;
        Intrinsics.c(aVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return mk.f.i.get((mk.f) aVar) != null;
    }

    public String z() {
        return "CancellableContinuation";
    }
}
