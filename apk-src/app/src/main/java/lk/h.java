package lk;

import hk.c0;
import hk.u;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import wj.n;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends oj.c implements kk.f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final kk.f f28141l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final CoroutineContext f28142m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f28143n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public CoroutineContext f28144o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public mj.a f28145p;

    public h(kk.f fVar, CoroutineContext coroutineContext) {
        super(kotlin.coroutines.g.f27499b, f.f28138b);
        this.f28141l = fVar;
        this.f28142m = coroutineContext;
        this.f28143n = ((Number) coroutineContext.fold(0, new u(3))).intValue();
    }

    public final Object a(mj.a aVar, Object obj) {
        CoroutineContext context = aVar.getContext();
        c0.f(context);
        CoroutineContext coroutineContext = this.f28144o;
        if (coroutineContext != context) {
            if (coroutineContext instanceof d) {
                throw new IllegalStateException(kotlin.text.u.b("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((d) coroutineContext).f28137c + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.fold(0, new Function2() { // from class: lk.k
                /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
                @Override // kotlin.jvm.functions.Function2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invoke(java.lang.Object r4, java.lang.Object r5) {
                    /*
                        r3 = this;
                        java.lang.Integer r4 = (java.lang.Integer) r4
                        int r4 = r4.intValue()
                        kotlin.coroutines.CoroutineContext$Element r5 = (kotlin.coroutines.CoroutineContext.Element) r5
                        kotlin.coroutines.f r0 = r5.getKey()
                        lk.h r1 = r3.f28148b
                        kotlin.coroutines.CoroutineContext r1 = r1.f28142m
                        kotlin.coroutines.CoroutineContext$Element r1 = r1.get(r0)
                        hk.b1 r2 = hk.b1.f20637b
                        if (r0 == r2) goto L20
                        if (r5 == r1) goto L1d
                        r4 = -2147483648(0xffffffff80000000, float:-0.0)
                        goto L34
                    L1d:
                        int r4 = r4 + 1
                        goto L34
                    L20:
                        hk.c1 r1 = (hk.c1) r1
                        hk.c1 r5 = (hk.c1) r5
                    L24:
                        r0 = 0
                        if (r5 != 0) goto L29
                        r5 = r0
                        goto L30
                    L29:
                        if (r5 != r1) goto L2c
                        goto L30
                    L2c:
                        boolean r2 = r5 instanceof mk.q
                        if (r2 != 0) goto L5e
                    L30:
                        if (r5 != r1) goto L39
                        if (r1 != 0) goto L1d
                    L34:
                        java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                        return r4
                    L39:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        java.lang.String r2 = "Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of "
                        r0.<init>(r2)
                        r0.append(r5)
                        java.lang.String r5 = ", expected child of "
                        r0.append(r5)
                        r0.append(r1)
                        java.lang.String r5 = ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'"
                        r0.append(r5)
                        java.lang.String r5 = r0.toString()
                        java.lang.String r5 = r5.toString()
                        r4.<init>(r5)
                        throw r4
                    L5e:
                        mk.q r5 = (mk.q) r5
                        java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = hk.k1.f20684c
                        java.lang.Object r5 = r2.get(r5)
                        hk.o r5 = (hk.o) r5
                        if (r5 == 0) goto L6f
                        hk.c1 r5 = r5.getParent()
                        goto L24
                    L6f:
                        r5 = r0
                        goto L24
                    */
                    throw new UnsupportedOperationException("Method not decompiled: lk.k.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                }
            })).intValue() != this.f28143n) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f28142m + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f28144o = context;
        }
        this.f28145p = aVar;
        n nVar = j.f28147a;
        kk.f fVar = this.f28141l;
        Intrinsics.c(fVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object objInvoke = nVar.invoke(fVar, obj, this);
        if (!Intrinsics.a(objInvoke, nj.a.f29512b)) {
            this.f28145p = null;
        }
        return objInvoke;
    }

    @Override // kk.f
    public final Object emit(Object obj, mj.a frame) {
        try {
            Object objA = a(frame, obj);
            nj.a aVar = nj.a.f29512b;
            if (objA == aVar) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            return objA == aVar ? objA : Unit.f27471a;
        } catch (Throwable th2) {
            this.f28144o = new d(frame.getContext(), th2);
            throw th2;
        }
    }

    @Override // oj.a, oj.d
    public final oj.d getCallerFrame() {
        mj.a aVar = this.f28145p;
        if (aVar instanceof oj.d) {
            return (oj.d) aVar;
        }
        return null;
    }

    @Override // oj.c, mj.a
    public final CoroutineContext getContext() {
        CoroutineContext coroutineContext = this.f28144o;
        return coroutineContext == null ? kotlin.coroutines.g.f27499b : coroutineContext;
    }

    @Override // oj.a
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) {
        Throwable thA = ij.m.a(obj);
        if (thA != null) {
            this.f28144o = new d(getContext(), thA);
        }
        mj.a aVar = this.f28145p;
        if (aVar != null) {
            aVar.resumeWith(obj);
        }
        return nj.a.f29512b;
    }
}
