package p2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends oj.i implements Function2 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public kotlin.jvm.internal.e0 f30940l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f30941m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f30942n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.e0 f30943o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ e0 f30944p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f30945q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f30946r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(kotlin.jvm.internal.e0 e0Var, e0 e0Var2, Object obj, boolean z5, mj.a aVar) {
        super(2, aVar);
        this.f30943o = e0Var;
        this.f30944p = e0Var2;
        this.f30945q = obj;
        this.f30946r = z5;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        d0 d0Var = new d0(this.f30943o, this.f30944p, this.f30945q, this.f30946r, aVar);
        d0Var.f30942n = obj;
        return d0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d0) create((n0) obj, (mj.a) obj2)).invokeSuspend(Unit.f27471a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0062, code lost:
    
        if (r6.b(r2, r7) == r0) goto L16;
     */
    @Override // oj.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            nj.a r0 = nj.a.f29512b
            int r1 = r7.f30941m
            java.lang.Object r2 = r7.f30945q
            p2.e0 r3 = r7.f30944p
            kotlin.jvm.internal.e0 r4 = r7.f30943o
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L28
            if (r1 == r6) goto L1e
            if (r1 != r5) goto L16
            com.google.android.gms.internal.measurement.h5.E(r8)
            goto L65
        L16:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1e:
            kotlin.jvm.internal.e0 r1 = r7.f30940l
            java.lang.Object r6 = r7.f30942n
            p2.n0 r6 = (p2.n0) r6
            com.google.android.gms.internal.measurement.h5.E(r8)
            goto L4f
        L28:
            com.google.android.gms.internal.measurement.h5.E(r8)
            java.lang.Object r8 = r7.f30942n
            p2.n0 r8 = (p2.n0) r8
            p2.v0 r1 = r3.g()
            r7.f30942n = r8
            r7.f30940l = r4
            r7.f30941m = r6
            k6.t0 r1 = r1.f31090b
            java.lang.Object r1 = r1.f27180c
            java.util.concurrent.atomic.AtomicInteger r1 = (java.util.concurrent.atomic.AtomicInteger) r1
            int r1 = r1.incrementAndGet()
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r1)
            if (r6 != r0) goto L4b
            goto L64
        L4b:
            r1 = r6
            r6 = r8
            r8 = r1
            r1 = r4
        L4f:
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r1.f27508b = r8
            r8 = 0
            r7.f30942n = r8
            r7.f30940l = r8
            r7.f30941m = r5
            java.lang.Object r8 = r6.b(r2, r7)
            if (r8 != r0) goto L65
        L64:
            return r0
        L65:
            boolean r8 = r7.f30946r
            if (r8 == 0) goto L7d
            m7.a r8 = r3.f30958h
            p2.d r0 = new p2.d
            if (r2 == 0) goto L74
            int r1 = r2.hashCode()
            goto L75
        L74:
            r1 = 0
        L75:
            int r3 = r4.f27508b
            r0.<init>(r2, r1, r3)
            r8.u(r0)
        L7d:
            kotlin.Unit r8 = kotlin.Unit.f27471a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.d0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
