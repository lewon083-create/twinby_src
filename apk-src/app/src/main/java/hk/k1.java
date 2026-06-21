package hk;

import com.google.android.gms.internal.ads.oc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class k1 implements c1, p1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f20683b = AtomicReferenceFieldUpdater.newUpdater(k1.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f20684c = AtomicReferenceFieldUpdater.newUpdater(k1.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public k1(boolean z5) {
        this._state$volatile = z5 ? c0.f20649j : c0.i;
    }

    public static p K(mk.j jVar) {
        while (jVar.h()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = mk.j.f28923c;
            mk.j jVarE = jVar.e();
            if (jVarE == null) {
                Object obj = atomicReferenceFieldUpdater.get(jVar);
                while (true) {
                    jVar = (mk.j) obj;
                    if (!jVar.h()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(jVar);
                }
            } else {
                jVar = jVarE;
            }
        }
        while (true) {
            jVar = jVar.g();
            if (!jVar.h()) {
                if (jVar instanceof p) {
                    return (p) jVar;
                }
                if (jVar instanceof m1) {
                    return null;
                }
            }
        }
    }

    public static String R(Object obj) {
        if (!(obj instanceof i1)) {
            return obj instanceof y0 ? ((y0) obj).isActive() ? "Active" : "New" : obj instanceof t ? "Cancelled" : "Completed";
        }
        i1 i1Var = (i1) obj;
        return i1Var.d() ? "Cancelling" : i1.f20670c.get(i1Var) != 0 ? "Completing" : "Active";
    }

    public final m1 A(y0 y0Var) {
        m1 m1VarC = y0Var.c();
        if (m1VarC != null) {
            return m1VarC;
        }
        if (y0Var instanceof o0) {
            return new m1();
        }
        if (y0Var instanceof f1) {
            P((f1) y0Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + y0Var).toString());
    }

    public boolean B(Throwable th2) {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0087, code lost:
    
        r3 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [hk.f1, hk.p, java.lang.Object, mk.j] */
    /* JADX WARN: Type inference failed for: r3v3, types: [hk.m0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r5v8, types: [hk.m1, mk.j] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D(hk.c1 r8) {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = hk.k1.f20684c
            hk.n1 r1 = hk.n1.f20696b
            if (r8 != 0) goto La
            r0.set(r7, r1)
            return
        La:
            hk.k1 r8 = (hk.k1) r8
        Lc:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = hk.k1.f20683b
            java.lang.Object r3 = r2.get(r8)
            int r3 = r8.Q(r3)
            if (r3 == 0) goto L1c
            r4 = 1
            if (r3 == r4) goto L1c
            goto Lc
        L1c:
            hk.p r3 = new hk.p
            r3.<init>(r7)
            r3.f20661e = r8
        L23:
            java.lang.Object r4 = r2.get(r8)
            boolean r5 = r4 instanceof hk.o0
            if (r5 == 0) goto L45
            r5 = r4
            hk.o0 r5 = (hk.o0) r5
            boolean r6 = r5.f20697b
            if (r6 == 0) goto L41
        L32:
            boolean r5 = r2.compareAndSet(r8, r4, r3)
            if (r5 == 0) goto L3a
            goto L9d
        L3a:
            java.lang.Object r5 = r2.get(r8)
            if (r5 == r4) goto L32
            goto L23
        L41:
            r8.O(r5)
            goto L23
        L45:
            boolean r5 = r4 instanceof hk.y0
            r6 = 0
            if (r5 == 0) goto L89
            r5 = r4
            hk.y0 r5 = (hk.y0) r5
            hk.m1 r5 = r5.c()
            if (r5 != 0) goto L59
            hk.f1 r4 = (hk.f1) r4
            r8.P(r4)
            goto L23
        L59:
            r4 = 7
            boolean r4 = r5.d(r3, r4)
            if (r4 == 0) goto L61
            goto L9d
        L61:
            r4 = 3
            boolean r4 = r5.d(r3, r4)
            java.lang.Object r8 = r2.get(r8)
            boolean r5 = r8 instanceof hk.i1
            if (r5 == 0) goto L75
            hk.i1 r8 = (hk.i1) r8
            java.lang.Throwable r6 = r8.b()
            goto L81
        L75:
            boolean r5 = r8 instanceof hk.t
            if (r5 == 0) goto L7c
            hk.t r8 = (hk.t) r8
            goto L7d
        L7c:
            r8 = r6
        L7d:
            if (r8 == 0) goto L81
            java.lang.Throwable r6 = r8.f20711a
        L81:
            r3.k(r6)
            if (r4 == 0) goto L87
            goto L9d
        L87:
            r3 = r1
            goto L9d
        L89:
            java.lang.Object r8 = r2.get(r8)
            boolean r4 = r8 instanceof hk.t
            if (r4 == 0) goto L94
            hk.t r8 = (hk.t) r8
            goto L95
        L94:
            r8 = r6
        L95:
            if (r8 == 0) goto L99
            java.lang.Throwable r6 = r8.f20711a
        L99:
            r3.k(r6)
            goto L87
        L9d:
            r0.set(r7, r3)
            java.lang.Object r8 = r2.get(r7)
            boolean r8 = r8 instanceof hk.y0
            if (r8 != 0) goto Lae
            r3.a()
            r0.set(r7, r1)
        Lae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hk.k1.D(hk.c1):void");
    }

    public final m0 E(boolean z5, f1 f1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        n1 n1Var;
        boolean z10;
        boolean zD;
        f1Var.f20661e = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = f20683b;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z11 = obj instanceof o0;
            n1Var = n1.f20696b;
            z10 = true;
            if (!z11) {
                if (!(obj instanceof y0)) {
                    z10 = false;
                    break;
                }
                y0 y0Var = (y0) obj;
                m1 m1VarC = y0Var.c();
                if (m1VarC == null) {
                    P((f1) obj);
                } else {
                    if (f1Var.j()) {
                        i1 i1Var = y0Var instanceof i1 ? (i1) y0Var : null;
                        Throwable thB = i1Var != null ? i1Var.b() : null;
                        if (thB == null) {
                            zD = m1VarC.d(f1Var, 5);
                        } else if (z5) {
                            f1Var.k(thB);
                            return n1Var;
                        }
                    } else {
                        zD = m1VarC.d(f1Var, 1);
                    }
                    if (zD) {
                        break;
                    }
                }
            } else {
                o0 o0Var = (o0) obj;
                if (o0Var.f20697b) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, f1Var)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                O(o0Var);
            }
        }
        if (z10) {
            return f1Var;
        }
        if (z5) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            t tVar = obj2 instanceof t ? (t) obj2 : null;
            f1Var.k(tVar != null ? tVar.f20711a : null);
        }
        return n1Var;
    }

    public boolean F() {
        return this instanceof f;
    }

    public final Object G(oj.c frame) {
        Object obj;
        do {
            obj = f20683b.get(this);
            if (!(obj instanceof y0)) {
                c0.f(frame.getContext());
                return Unit.f27471a;
            }
        } while (Q(obj) < 0);
        l lVar = new l(1, nj.f.b(frame));
        lVar.t();
        lVar.w(new h(2, c0.k(this, true, new n(lVar, 1))));
        Object objS = lVar.s();
        nj.a aVar = nj.a.f29512b;
        if (objS == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        if (objS != aVar) {
            objS = Unit.f27471a;
        }
        return objS == aVar ? objS : Unit.f27471a;
    }

    public final boolean H(Object obj) {
        Object objS;
        do {
            objS = S(f20683b.get(this), obj);
            if (objS == c0.f20644d) {
                return false;
            }
            if (objS == c0.f20645e) {
                return true;
            }
        } while (objS == c0.f20646f);
        k(objS);
        return true;
    }

    public final Object I(Object obj) {
        Object objS;
        do {
            objS = S(f20683b.get(this), obj);
            if (objS == c0.f20644d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                t tVar = obj instanceof t ? (t) obj : null;
                throw new IllegalStateException(str, tVar != null ? tVar.f20711a : null);
            }
        } while (objS == c0.f20646f);
        return objS;
    }

    public String J() {
        return getClass().getSimpleName();
    }

    public final void L(m1 m1Var, Throwable th2) {
        m1Var.d(new mk.h(4), 4);
        Object obj = mk.j.f28922b.get(m1Var);
        Intrinsics.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        oc ocVar = null;
        for (mk.j jVarG = (mk.j) obj; !jVarG.equals(m1Var); jVarG = jVarG.g()) {
            if ((jVarG instanceof f1) && ((f1) jVarG).j()) {
                try {
                    ((f1) jVarG).k(th2);
                } catch (Throwable th3) {
                    if (ocVar != null) {
                        ij.d.a(ocVar, th3);
                    } else {
                        ocVar = new oc("Exception in completion handler " + jVarG + " for " + this, th3);
                        Unit unit = Unit.f27471a;
                    }
                }
            }
        }
        if (ocVar != null) {
            C(ocVar);
        }
        p(th2);
    }

    public final void O(o0 o0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        m1 m1Var = new m1();
        Object x0Var = m1Var;
        if (!o0Var.f20697b) {
            x0Var = new x0(m1Var);
        }
        do {
            atomicReferenceFieldUpdater = f20683b;
            if (atomicReferenceFieldUpdater.compareAndSet(this, o0Var, x0Var)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == o0Var);
    }

    public final void P(f1 f1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        m1 m1Var = new m1();
        f1Var.getClass();
        mk.j.f28923c.set(m1Var, f1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = mk.j.f28922b;
        atomicReferenceFieldUpdater2.set(m1Var, f1Var);
        loop0: while (true) {
            if (atomicReferenceFieldUpdater2.get(f1Var) == f1Var) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(f1Var, f1Var, m1Var)) {
                    if (atomicReferenceFieldUpdater2.get(f1Var) != f1Var) {
                        break;
                    }
                }
                m1Var.f(f1Var);
                break loop0;
            }
            break;
        }
        mk.j jVarG = f1Var.g();
        do {
            atomicReferenceFieldUpdater = f20683b;
            if (atomicReferenceFieldUpdater.compareAndSet(this, f1Var, jVarG)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == f1Var);
    }

    public final int Q(Object obj) {
        boolean z5 = obj instanceof o0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20683b;
        if (z5) {
            if (((o0) obj).f20697b) {
                return 0;
            }
            o0 o0Var = c0.f20649j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, o0Var)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            N();
            return 1;
        }
        if (!(obj instanceof x0)) {
            return 0;
        }
        m1 m1Var = ((x0) obj).f20724b;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, m1Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        N();
        return 1;
    }

    public final Object S(Object obj, Object obj2) {
        if (!(obj instanceof y0)) {
            return c0.f20644d;
        }
        if (((obj instanceof o0) || (obj instanceof f1)) && !(obj instanceof p) && !(obj2 instanceof t)) {
            y0 y0Var = (y0) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20683b;
            Object z0Var = obj2 instanceof y0 ? new z0((y0) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, y0Var, z0Var)) {
                if (atomicReferenceFieldUpdater.get(this) != y0Var) {
                    return c0.f20646f;
                }
            }
            M(obj2);
            s(y0Var, obj2);
            return obj2;
        }
        y0 y0Var2 = (y0) obj;
        m1 m1VarA = A(y0Var2);
        if (m1VarA == null) {
            return c0.f20646f;
        }
        i1 i1Var = y0Var2 instanceof i1 ? (i1) y0Var2 : null;
        if (i1Var == null) {
            i1Var = new i1(m1VarA, null);
        }
        synchronized (i1Var) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = i1.f20670c;
            if (atomicIntegerFieldUpdater.get(i1Var) != 0) {
                return c0.f20644d;
            }
            atomicIntegerFieldUpdater.set(i1Var, 1);
            if (i1Var != y0Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f20683b;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, y0Var2, i1Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != y0Var2) {
                        return c0.f20646f;
                    }
                }
            }
            boolean zD = i1Var.d();
            t tVar = obj2 instanceof t ? (t) obj2 : null;
            if (tVar != null) {
                i1Var.a(tVar.f20711a);
            }
            Throwable thB = zD ? null : i1Var.b();
            Unit unit = Unit.f27471a;
            if (thB != null) {
                L(m1VarA, thB);
            }
            p pVarK = K(m1VarA);
            if (pVarK != null && T(i1Var, pVarK, obj2)) {
                return c0.f20645e;
            }
            m1VarA.d(new mk.h(2), 2);
            p pVarK2 = K(m1VarA);
            return (pVarK2 == null || !T(i1Var, pVarK2, obj2)) ? u(i1Var, obj2) : c0.f20645e;
        }
    }

    public final boolean T(i1 i1Var, p pVar, Object obj) {
        while (c0.k(pVar.f20698f, false, new h1(this, i1Var, pVar, obj)) == n1.f20696b) {
            pVar = K(pVar);
            if (pVar == null) {
                return false;
            }
        }
        return true;
    }

    @Override // hk.c1
    public void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new d1(q(), null, this);
        }
        o(cancellationException);
    }

    public Object b() {
        return w();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(obj, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(kotlin.coroutines.f fVar) {
        return kotlin.coroutines.e.b(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final kotlin.coroutines.f getKey() {
        return b1.f20637b;
    }

    @Override // hk.c1
    public boolean isActive() {
        Object obj = f20683b.get(this);
        return (obj instanceof y0) && ((y0) obj).isActive();
    }

    public void l(Object obj) {
        k(obj);
    }

    public final Object m(oj.i frame) throws Throwable {
        Object obj;
        do {
            obj = f20683b.get(this);
            if (!(obj instanceof y0)) {
                if (obj instanceof t) {
                    throw ((t) obj).f20711a;
                }
                return c0.s(obj);
            }
        } while (Q(obj) < 0);
        g1 g1Var = new g1(this, nj.f.b(frame));
        g1Var.t();
        g1Var.w(new h(2, c0.k(this, true, new n0(2, g1Var))));
        Object objS = g1Var.s();
        if (objS == nj.a.f29512b) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objS;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(kotlin.coroutines.f fVar) {
        return kotlin.coroutines.e.c(this, fVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0064, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e A[PHI: r0
      0x003e: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v13 java.lang.Object) binds: [B:3:0x0008, B:16:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean n(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: hk.k1.n(java.lang.Object):boolean");
    }

    public void o(CancellationException cancellationException) {
        n(cancellationException);
    }

    public final boolean p(Throwable th2) {
        if (F()) {
            return true;
        }
        boolean z5 = th2 instanceof CancellationException;
        o oVar = (o) f20684c.get(this);
        return (oVar == null || oVar == n1.f20696b) ? z5 : oVar.b(th2) || z5;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return kotlin.coroutines.e.d(this, coroutineContext);
    }

    public String q() {
        return "Job was cancelled";
    }

    public boolean r(Throwable th2) {
        if (th2 instanceof CancellationException) {
            return true;
        }
        return n(th2) && y();
    }

    public final void s(y0 y0Var, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20684c;
        o oVar = (o) atomicReferenceFieldUpdater.get(this);
        if (oVar != null) {
            oVar.a();
            atomicReferenceFieldUpdater.set(this, n1.f20696b);
        }
        oc ocVar = null;
        t tVar = obj instanceof t ? (t) obj : null;
        Throwable th2 = tVar != null ? tVar.f20711a : null;
        if (y0Var instanceof f1) {
            try {
                ((f1) y0Var).k(th2);
                return;
            } catch (Throwable th3) {
                C(new oc("Exception in completion handler " + y0Var + " for " + this, th3));
                return;
            }
        }
        m1 m1VarC = y0Var.c();
        if (m1VarC != null) {
            m1VarC.d(new mk.h(1), 1);
            Object obj2 = mk.j.f28922b.get(m1VarC);
            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            for (mk.j jVarG = (mk.j) obj2; !jVarG.equals(m1VarC); jVarG = jVarG.g()) {
                if (jVarG instanceof f1) {
                    try {
                        ((f1) jVarG).k(th2);
                    } catch (Throwable th4) {
                        if (ocVar != null) {
                            ij.d.a(ocVar, th4);
                        } else {
                            ocVar = new oc("Exception in completion handler " + jVarG + " for " + this, th4);
                            Unit unit = Unit.f27471a;
                        }
                    }
                }
            }
            if (ocVar != null) {
                C(ocVar);
            }
        }
    }

    public final Throwable t(Object obj) {
        Throwable thB;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        k1 k1Var = (k1) ((p1) obj);
        Object obj2 = f20683b.get(k1Var);
        if (obj2 instanceof i1) {
            thB = ((i1) obj2).b();
        } else if (obj2 instanceof t) {
            thB = ((t) obj2).f20711a;
        } else {
            if (obj2 instanceof y0) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + obj2).toString());
            }
            thB = null;
        }
        CancellationException cancellationException = thB instanceof CancellationException ? (CancellationException) thB : null;
        return cancellationException == null ? new d1("Parent job is ".concat(R(obj2)), thB, k1Var) : cancellationException;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(J() + '{' + R(f20683b.get(this)) + '}');
        sb2.append('@');
        sb2.append(c0.h(this));
        return sb2.toString();
    }

    public final Object u(i1 i1Var, Object obj) {
        Throwable thX;
        t tVar = obj instanceof t ? (t) obj : null;
        Throwable th2 = tVar != null ? tVar.f20711a : null;
        synchronized (i1Var) {
            i1Var.d();
            ArrayList<Throwable> arrayListE = i1Var.e(th2);
            thX = x(i1Var, arrayListE);
            if (thX != null && arrayListE.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListE.size()));
                for (Throwable th3 : arrayListE) {
                    if (th3 != thX && th3 != thX && !(th3 instanceof CancellationException) && setNewSetFromMap.add(th3)) {
                        ij.d.a(thX, th3);
                    }
                }
            }
        }
        if (thX != null && thX != th2) {
            obj = new t(thX, false);
        }
        if (thX != null && (p(thX) || B(thX))) {
            Intrinsics.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            t.f20710b.compareAndSet((t) obj, 0, 1);
        }
        M(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20683b;
        Object z0Var = obj instanceof y0 ? new z0((y0) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, i1Var, z0Var) && atomicReferenceFieldUpdater.get(this) == i1Var) {
        }
        s(i1Var, obj);
        return obj;
    }

    public final CancellationException v() {
        CancellationException cancellationException;
        Object obj = f20683b.get(this);
        if (!(obj instanceof i1)) {
            if (obj instanceof y0) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(obj instanceof t)) {
                return new d1(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th2 = ((t) obj).f20711a;
            cancellationException = th2 instanceof CancellationException ? (CancellationException) th2 : null;
            return cancellationException == null ? new d1(q(), th2, this) : cancellationException;
        }
        Throwable thB = ((i1) obj).b();
        if (thB == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = thB instanceof CancellationException ? (CancellationException) thB : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (strConcat == null) {
            strConcat = q();
        }
        return new d1(strConcat, thB, this);
    }

    public final Object w() throws Throwable {
        Object obj = f20683b.get(this);
        if (obj instanceof y0) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (obj instanceof t) {
            throw ((t) obj).f20711a;
        }
        return c0.s(obj);
    }

    public final Throwable x(i1 i1Var, ArrayList arrayList) {
        Object next;
        Object obj = null;
        if (arrayList.isEmpty()) {
            if (i1Var.d()) {
                return new d1(q(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th2 = (Throwable) next;
        if (th2 != null) {
            return th2;
        }
        Throwable th3 = (Throwable) arrayList.get(0);
        if (th3 instanceof v1) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                Throwable th4 = (Throwable) next2;
                if (th4 != th3 && (th4 instanceof v1)) {
                    obj = next2;
                    break;
                }
            }
            Throwable th5 = (Throwable) obj;
            if (th5 != null) {
                return th5;
            }
        }
        return th3;
    }

    public boolean y() {
        return true;
    }

    public boolean z() {
        return this instanceof r;
    }

    public void N() {
    }

    public void C(oc ocVar) {
        throw ocVar;
    }

    public void M(Object obj) {
    }

    public void k(Object obj) {
    }
}
