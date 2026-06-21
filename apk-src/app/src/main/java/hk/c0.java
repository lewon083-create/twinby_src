package hk;

import com.google.android.gms.internal.measurement.h5;
import com.google.android.gms.internal.measurement.j4;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d8.k f20641a = new d8.k("RESUME_TOKEN", 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d8.k f20642b = new d8.k("REMOVED_TASK", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d8.k f20643c = new d8.k("CLOSED_EMPTY", 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d8.k f20644d = new d8.k("COMPLETING_ALREADY", 1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d8.k f20645e = new d8.k("COMPLETING_WAITING_CHILDREN", 1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d8.k f20646f = new d8.k("COMPLETING_RETRY", 1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d8.k f20647g = new d8.k("TOO_LATE_TO_CANCEL", 1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d8.k f20648h = new d8.k("SEALED", 1);
    public static final o0 i = new o0(false);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final o0 f20649j = new o0(true);

    public static final mk.c a(CoroutineContext coroutineContext) {
        if (coroutineContext.get(b1.f20637b) == null) {
            coroutineContext = coroutineContext.plus(new e1());
        }
        return new mk.c(coroutineContext);
    }

    public static g0 b(a0 a0Var, Function2 function2, int i10) {
        b0 b0Var = b0.f20634c;
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f27499b;
        b0 b0Var2 = (i10 & 2) != 0 ? b0.f20633b : b0Var;
        CoroutineContext coroutineContextB = v.b(a0Var, gVar);
        g0 l1Var = b0Var2 == b0Var ? new l1(coroutineContextB, function2) : new g0(coroutineContextB, true);
        l1Var.W(b0Var2, l1Var, function2);
        return l1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object c(Collection collection, oj.i frame) {
        int iQ;
        if (collection.isEmpty()) {
            return kotlin.collections.b0.f27475b;
        }
        f0[] f0VarArr = (f0[]) collection.toArray(new f0[0]);
        e eVar = new e(f0VarArr);
        l lVar = new l(1, nj.f.b(frame));
        lVar.t();
        int length = f0VarArr.length;
        c[] cVarArr = new c[length];
        for (int i10 = 0; i10 < length; i10++) {
            g0 g0Var = f0VarArr[i10];
            g0 g0Var2 = g0Var;
            g0Var2.getClass();
            do {
                iQ = g0Var2.Q(k1.f20683b.get(g0Var2));
                if (iQ != 0) {
                }
                c cVar = new c(eVar, lVar);
                cVar.f20639g = k(g0Var, true, cVar);
                Unit unit = Unit.f27471a;
                cVarArr[i10] = cVar;
            } while (iQ != 1);
            c cVar2 = new c(eVar, lVar);
            cVar2.f20639g = k(g0Var, true, cVar2);
            Unit unit2 = Unit.f27471a;
            cVarArr[i10] = cVar2;
        }
        d dVar = new d(cVarArr);
        for (int i11 = 0; i11 < length; i11++) {
            c cVar3 = cVarArr[i11];
            cVar3.getClass();
            c.i.set(cVar3, dVar);
        }
        if (l.f20686h.get(lVar) instanceof o1) {
            lVar.w(dVar);
        } else {
            dVar.b();
        }
        Object objS = lVar.s();
        if (objS == nj.a.f29512b) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objS;
    }

    public static void d(a0 a0Var) {
        c1 c1Var = (c1) a0Var.e().get(b1.f20637b);
        if (c1Var != null) {
            c1Var.a(null);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + a0Var).toString());
        }
    }

    public static final Object e(Function2 function2, mj.a frame) throws Throwable {
        mk.q qVar = new mk.q(frame.getContext(), frame);
        Object objD = h5.D(qVar, qVar, function2);
        if (objD == nj.a.f29512b) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objD;
    }

    public static final void f(CoroutineContext coroutineContext) {
        c1 c1Var = (c1) coroutineContext.get(b1.f20637b);
        if (c1Var != null && !c1Var.isActive()) {
            throw ((k1) c1Var).v();
        }
    }

    public static final h0 g(CoroutineContext coroutineContext) {
        CoroutineContext.Element element = coroutineContext.get(kotlin.coroutines.d.R1);
        h0 h0Var = element instanceof h0 ? (h0) element : null;
        return h0Var == null ? e0.f20657a : h0Var;
    }

    public static final String h(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final l i(mj.a aVar) {
        l lVar;
        l lVar2;
        if (!(aVar instanceof mk.f)) {
            return new l(1, aVar);
        }
        mk.f fVar = (mk.f) aVar;
        d8.k kVar = mk.a.f28906c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = mk.f.i;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(fVar);
            lVar = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(fVar, kVar);
                lVar2 = null;
                break;
            }
            if (obj instanceof l) {
                while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, kVar)) {
                    if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                        break;
                    }
                }
                lVar2 = (l) obj;
                break loop0;
            }
            if (obj != kVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (lVar2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = l.f20686h;
            Object obj2 = atomicReferenceFieldUpdater2.get(lVar2);
            if (!(obj2 instanceof s) || ((s) obj2).f20707d == null) {
                l.f20685g.set(lVar2, 536870911);
                atomicReferenceFieldUpdater2.set(lVar2, b.f20632a);
                lVar = lVar2;
            } else {
                lVar2.p();
            }
            if (lVar != null) {
                return lVar;
            }
        }
        return new l(2, aVar);
    }

    public static final void j(CoroutineContext coroutineContext, Throwable th2) {
        try {
            z zVar = (z) coroutineContext.get(y.f20728b);
            if (zVar != null) {
                zVar.handleException(coroutineContext, th2);
            } else {
                mk.a.d(coroutineContext, th2);
            }
        } catch (Throwable th3) {
            if (th2 != th3) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                ij.d.a(runtimeException, th2);
                th2 = runtimeException;
            }
            mk.a.d(coroutineContext, th2);
        }
    }

    public static final m0 k(c1 c1Var, boolean z5, f1 f1Var) {
        if (c1Var instanceof k1) {
            return ((k1) c1Var).E(z5, f1Var);
        }
        boolean zJ = f1Var.j();
        ef.b bVar = new ef.b(1, f1Var, f1.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 1);
        k1 k1Var = (k1) c1Var;
        k1Var.getClass();
        return k1Var.E(z5, zJ ? new a1(bVar) : new n0(1, bVar));
    }

    public static m0 l(long j10, w1 w1Var, CoroutineContext coroutineContext) {
        return e0.f20657a.h(j10, w1Var, coroutineContext);
    }

    public static q1 m(a0 a0Var, CoroutineContext coroutineContext, Function2 function2, int i10) {
        if ((i10 & 1) != 0) {
            coroutineContext = kotlin.coroutines.g.f27499b;
        }
        b0 b0Var = b0.f20633b;
        CoroutineContext coroutineContextB = v.b(a0Var, coroutineContext);
        b0 b0Var2 = b0.f20633b;
        q1 q1Var = new q1(coroutineContextB, true);
        q1Var.W(b0Var, q1Var, function2);
        return q1Var;
    }

    public static final Object n(Object obj) {
        if (obj instanceof t) {
            ij.k kVar = ij.m.f21341c;
            return h5.s(((t) obj).f20711a);
        }
        ij.k kVar2 = ij.m.f21341c;
        return obj;
    }

    public static final void o(l lVar, mj.a aVar, boolean z5) {
        Object objE;
        Object obj = l.f20686h.get(lVar);
        Throwable thD = lVar.d(obj);
        if (thD != null) {
            ij.k kVar = ij.m.f21341c;
            objE = h5.s(thD);
        } else {
            ij.k kVar2 = ij.m.f21341c;
            objE = lVar.e(obj);
        }
        if (!z5) {
            aVar.resumeWith(objE);
            return;
        }
        Intrinsics.c(aVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        mk.f fVar = (mk.f) aVar;
        oj.c cVar = fVar.f28913f;
        Object obj2 = fVar.f28915h;
        CoroutineContext context = cVar.getContext();
        Object objC = mk.u.c(context, obj2);
        z1 z1VarC = objC != mk.u.f28941a ? v.c(cVar, context, objC) : null;
        try {
            cVar.resumeWith(objE);
            Unit unit = Unit.f27471a;
            if (z1VarC == null || z1VarC.X()) {
                mk.u.a(context, objC);
            }
        } catch (Throwable th2) {
            if (z1VarC == null || z1VarC.X()) {
                mk.u.a(context, objC);
            }
            throw th2;
        }
    }

    public static Object p(Function2 function2) throws Throwable {
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f27499b;
        Thread threadCurrentThread = Thread.currentThread();
        mj.b bVar = kotlin.coroutines.d.R1;
        gVar.get(bVar);
        u0 context = u1.a();
        Intrinsics.checkNotNullParameter(context, "context");
        CoroutineContext coroutineContextA = v.a(gVar, context, true);
        ok.e eVar = k0.f20682a;
        if (coroutineContextA != eVar && coroutineContextA.get(bVar) == null) {
            coroutineContextA = coroutineContextA.plus(eVar);
        }
        f fVar = new f(coroutineContextA, threadCurrentThread, context);
        fVar.W(b0.f20633b, fVar, function2);
        u0 u0Var = fVar.f20660f;
        if (u0Var != null) {
            int i10 = u0.f20715g;
            u0Var.I(false);
        }
        while (!Thread.interrupted()) {
            try {
                long J = u0Var != null ? u0Var.J() : Long.MAX_VALUE;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k1.f20683b;
                if (!(atomicReferenceFieldUpdater.get(fVar) instanceof y0)) {
                    if (u0Var != null) {
                        int i11 = u0.f20715g;
                        u0Var.m(false);
                    }
                    Object objS = s(atomicReferenceFieldUpdater.get(fVar));
                    t tVar = objS instanceof t ? (t) objS : null;
                    if (tVar == null) {
                        return objS;
                    }
                    throw tVar.f20711a;
                }
                LockSupport.parkNanos(fVar, J);
            } catch (Throwable th2) {
                if (u0Var != null) {
                    int i12 = u0.f20715g;
                    u0Var.m(false);
                }
                throw th2;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        fVar.n(interruptedException);
        throw interruptedException;
    }

    public static final Object q(w1 w1Var, Function2 function2) throws Throwable {
        Object tVar;
        Object objI;
        k(w1Var, true, new n0(0, g(w1Var.f28936e.getContext()).h(w1Var.f20722f, w1Var, w1Var.f20628d)));
        try {
            if (function2 instanceof oj.a) {
                kotlin.jvm.internal.k0.b(2, function2);
                tVar = function2.invoke(w1Var, w1Var);
            } else {
                tVar = nj.f.c(function2, w1Var, w1Var);
            }
        } catch (Throwable th2) {
            tVar = new t(th2, false);
        }
        nj.a aVar = nj.a.f29512b;
        if (tVar == aVar || (objI = w1Var.I(tVar)) == f20645e) {
            return aVar;
        }
        if (objI instanceof t) {
            Throwable th3 = ((t) objI).f20711a;
            if (!(th3 instanceof v1) || ((v1) th3).f20720b != w1Var) {
                throw th3;
            }
            if (tVar instanceof t) {
                throw ((t) tVar).f20711a;
            }
        } else {
            tVar = s(objI);
        }
        return tVar;
    }

    public static final String r(mj.a aVar) {
        Object objS;
        if (aVar instanceof mk.f) {
            return ((mk.f) aVar).toString();
        }
        try {
            ij.k kVar = ij.m.f21341c;
            objS = aVar + '@' + h(aVar);
        } catch (Throwable th2) {
            ij.k kVar2 = ij.m.f21341c;
            objS = h5.s(th2);
        }
        if (ij.m.a(objS) != null) {
            objS = aVar.getClass().getName() + '@' + h(aVar);
        }
        return (String) objS;
    }

    public static final Object s(Object obj) {
        y0 y0Var;
        z0 z0Var = obj instanceof z0 ? (z0) obj : null;
        return (z0Var == null || (y0Var = z0Var.f20730a) == null) ? obj : y0Var;
    }

    public static final Object t(CoroutineContext coroutineContext, Function2 function2, mj.a frame) throws Throwable {
        Object objS;
        CoroutineContext context = frame.getContext();
        CoroutineContext coroutineContextPlus = !((Boolean) coroutineContext.fold(Boolean.FALSE, new u(0))).booleanValue() ? context.plus(coroutineContext) : v.a(context, coroutineContext, false);
        f(coroutineContextPlus);
        if (coroutineContextPlus == context) {
            mk.q qVar = new mk.q(coroutineContextPlus, frame);
            objS = h5.D(qVar, qVar, function2);
        } else {
            mj.b bVar = kotlin.coroutines.d.R1;
            if (Intrinsics.a(coroutineContextPlus.get(bVar), context.get(bVar))) {
                z1 z1Var = new z1(coroutineContextPlus, frame);
                CoroutineContext coroutineContext2 = z1Var.f20628d;
                Object objC = mk.u.c(coroutineContext2, null);
                try {
                    Object objD = h5.D(z1Var, z1Var, function2);
                    mk.u.a(coroutineContext2, objC);
                    objS = objD;
                } catch (Throwable th2) {
                    mk.u.a(coroutineContext2, objC);
                    throw th2;
                }
            } else {
                i0 i0Var = new i0(coroutineContextPlus, frame);
                j4.v(function2, i0Var, i0Var);
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = i0.f20669f;
                while (true) {
                    int i10 = atomicIntegerFieldUpdater.get(i0Var);
                    if (i10 != 0) {
                        if (i10 != 2) {
                            throw new IllegalStateException("Already suspended");
                        }
                        objS = s(k1.f20683b.get(i0Var));
                        if (objS instanceof t) {
                            throw ((t) objS).f20711a;
                        }
                    } else if (atomicIntegerFieldUpdater.compareAndSet(i0Var, 0, 1)) {
                        objS = nj.a.f29512b;
                        break;
                    }
                }
            }
        }
        if (objS == nj.a.f29512b) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objS;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0069 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object u(long r6, kotlin.jvm.functions.Function2 r8, oj.c r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof hk.x1
            if (r0 == 0) goto L13
            r0 = r9
            hk.x1 r0 = (hk.x1) r0
            int r1 = r0.f20727n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20727n = r1
            goto L18
        L13:
            hk.x1 r0 = new hk.x1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f20726m
            nj.a r1 = nj.a.f29512b
            int r2 = r0.f20727n
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.jvm.internal.f0 r6 = r0.f20725l
            com.google.android.gms.internal.measurement.h5.E(r9)     // Catch: hk.v1 -> L29
            return r9
        L29:
            r7 = move-exception
            goto L63
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            com.google.android.gms.internal.measurement.h5.E(r9)
            r4 = 0
            int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r9 > 0) goto L3d
            goto L69
        L3d:
            kotlin.jvm.internal.f0 r9 = new kotlin.jvm.internal.f0
            r9.<init>()
            r0.f20725l = r9     // Catch: hk.v1 -> L61
            r0.f20727n = r3     // Catch: hk.v1 -> L61
            hk.w1 r2 = new hk.w1     // Catch: hk.v1 -> L61
            r2.<init>(r6, r0)     // Catch: hk.v1 -> L61
            r9.f27510b = r2     // Catch: hk.v1 -> L61
            java.lang.Object r6 = q(r2, r8)     // Catch: hk.v1 -> L61
            if (r6 != r1) goto L5d
            java.lang.String r7 = "frame"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r7)     // Catch: hk.v1 -> L59
            goto L5d
        L59:
            r6 = move-exception
            r7 = r6
        L5b:
            r6 = r9
            goto L63
        L5d:
            if (r6 != r1) goto L60
            return r1
        L60:
            return r6
        L61:
            r7 = move-exception
            goto L5b
        L63:
            hk.c1 r8 = r7.f20720b
            java.lang.Object r6 = r6.f27510b
            if (r8 != r6) goto L6b
        L69:
            r6 = 0
            return r6
        L6b:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: hk.c0.u(long, kotlin.jvm.functions.Function2, oj.c):java.lang.Object");
    }
}
