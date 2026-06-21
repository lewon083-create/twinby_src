package hk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class j1 extends oj.h implements Function2 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public m1 f20675m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p f20676n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f20677o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f20678p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ k1 f20679q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(k1 k1Var, mj.a aVar) {
        super(2, aVar);
        this.f20679q = k1Var;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        j1 j1Var = new j1(this.f20679q, aVar);
        j1Var.f20678p = obj;
        return j1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j1) create((ek.l) obj, (mj.a) obj2)).invokeSuspend(Unit.f27471a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0066 -> B:25:0x007a). Please report as a decompilation issue!!! */
    @Override // oj.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            nj.a r0 = nj.a.f29512b
            int r1 = r5.f20677o
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            hk.p r1 = r5.f20676n
            hk.m1 r3 = r5.f20675m
            java.lang.Object r4 = r5.f20678p
            ek.l r4 = (ek.l) r4
            com.google.android.gms.internal.measurement.h5.E(r6)
            goto L7a
        L18:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L20:
            com.google.android.gms.internal.measurement.h5.E(r6)
            goto L7f
        L24:
            com.google.android.gms.internal.measurement.h5.E(r6)
            java.lang.Object r6 = r5.f20678p
            ek.l r6 = (ek.l) r6
            hk.k1 r1 = r5.f20679q
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = hk.k1.f20683b
            java.lang.Object r1 = r4.get(r1)
            boolean r4 = r1 instanceof hk.p
            if (r4 == 0) goto L41
            hk.p r1 = (hk.p) r1
            hk.k1 r1 = r1.f20698f
            r5.f20677o = r3
            r6.a(r1, r5)
            return r0
        L41:
            boolean r3 = r1 instanceof hk.y0
            if (r3 == 0) goto L7f
            hk.y0 r1 = (hk.y0) r1
            hk.m1 r1 = r1.c()
            if (r1 == 0) goto L7f
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = mk.j.f28922b
            java.lang.Object r3 = r3.get(r1)
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
            kotlin.jvm.internal.Intrinsics.c(r3, r4)
            mk.j r3 = (mk.j) r3
            r4 = r3
            r3 = r1
            r1 = r4
            r4 = r6
        L5e:
            boolean r6 = r1.equals(r3)
            if (r6 != 0) goto L7f
            boolean r6 = r1 instanceof hk.p
            if (r6 == 0) goto L7a
            hk.p r1 = (hk.p) r1
            hk.k1 r6 = r1.f20698f
            r5.f20678p = r4
            r5.f20675m = r3
            r5.f20676n = r1
            r5.f20677o = r2
            r4.a(r6, r5)
            nj.a r6 = nj.a.f29512b
            return r0
        L7a:
            mk.j r1 = r1.g()
            goto L5e
        L7f:
            kotlin.Unit r6 = kotlin.Unit.f27471a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: hk.j1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
