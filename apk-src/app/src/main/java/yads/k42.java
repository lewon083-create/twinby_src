package yads;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class k42 extends oj.i implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public hk.f0 f40066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f40067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f40068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d4 f40069e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l42 f40070f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Context f40071g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ty1 f40072h;
    public final /* synthetic */ z30 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ oi2 f40073j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k42(d4 d4Var, l42 l42Var, Context context, ty1 ty1Var, z30 z30Var, oi2 oi2Var, mj.a aVar) {
        super(2, aVar);
        this.f40069e = d4Var;
        this.f40070f = l42Var;
        this.f40071g = context;
        this.f40072h = ty1Var;
        this.i = z30Var;
        this.f40073j = oi2Var;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        k42 k42Var = new k42(this.f40069e, this.f40070f, this.f40071g, this.f40072h, this.i, this.f40073j, aVar);
        k42Var.f40068d = obj;
        return k42Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k42) create((hk.a0) obj, (mj.a) obj2)).invokeSuspend(Unit.f27471a);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009a A[RETURN] */
    @Override // oj.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            r13 = this;
            nj.a r0 = nj.a.f29512b
            int r1 = r13.f40067c
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L35
            if (r1 == r5) goto L2b
            if (r1 == r4) goto L23
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L17
            com.google.android.gms.internal.measurement.h5.E(r14)
            return r14
        L17:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L1f:
            com.google.android.gms.internal.measurement.h5.E(r14)
            return r14
        L23:
            java.lang.Object r1 = r13.f40068d
            hk.f0 r1 = (hk.f0) r1
            com.google.android.gms.internal.measurement.h5.E(r14)
            goto L8f
        L2b:
            hk.f0 r1 = r13.f40066b
            java.lang.Object r2 = r13.f40068d
            hk.c1 r2 = (hk.c1) r2
            com.google.android.gms.internal.measurement.h5.E(r14)
            goto L80
        L35:
            com.google.android.gms.internal.measurement.h5.E(r14)
            java.lang.Object r14 = r13.f40068d
            hk.a0 r14 = (hk.a0) r14
            yads.d4 r1 = r13.f40069e
            boolean r1 = r1.f37624m
            if (r1 == 0) goto L9b
            yads.h42 r1 = new yads.h42
            yads.l42 r2 = r13.f40070f
            yads.ty1 r7 = r13.f40072h
            yads.oi2 r8 = r13.f40073j
            r1.<init>(r2, r7, r8, r6)
            hk.q1 r1 = hk.c0.m(r14, r6, r1, r3)
            yads.j42 r2 = new yads.j42
            yads.l42 r7 = r13.f40070f
            android.content.Context r8 = r13.f40071g
            yads.ty1 r9 = r13.f40072h
            r2.<init>(r7, r8, r9, r6)
            hk.q1 r2 = hk.c0.m(r14, r6, r2, r3)
            yads.i42 r7 = new yads.i42
            yads.l42 r8 = r13.f40070f
            android.content.Context r9 = r13.f40071g
            yads.ty1 r10 = r13.f40072h
            yads.z30 r11 = r13.i
            r12 = 0
            r7.<init>(r8, r9, r10, r11, r12)
            hk.g0 r14 = hk.c0.b(r14, r7, r3)
            r13.f40068d = r2
            r13.f40066b = r14
            r13.f40067c = r5
            java.lang.Object r1 = r1.G(r13)
            if (r1 != r0) goto L7f
            goto Laf
        L7f:
            r1 = r14
        L80:
            r13.f40068d = r1
            r13.f40066b = r6
            r13.f40067c = r4
            hk.k1 r2 = (hk.k1) r2
            java.lang.Object r14 = r2.G(r13)
            if (r14 != r0) goto L8f
            goto Laf
        L8f:
            r13.f40068d = r6
            r13.f40067c = r3
            java.lang.Object r14 = r1.d(r13)
            if (r14 != r0) goto L9a
            goto Laf
        L9a:
            return r14
        L9b:
            yads.l42 r14 = r13.f40070f
            yads.k62 r3 = r14.f40424c
            android.content.Context r5 = r13.f40071g
            yads.ty1 r6 = r13.f40072h
            yads.z30 r7 = r13.i
            r13.f40067c = r2
            r4 = 0
            r8 = r13
            java.lang.Object r14 = r3.a(r4, r5, r6, r7, r8)
            if (r14 != r0) goto Lb0
        Laf:
            return r0
        Lb0:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.k42.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
