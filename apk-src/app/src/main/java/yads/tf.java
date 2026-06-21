package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class tf extends oj.i implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f43313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vf f43314c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tf(vf vfVar, mj.a aVar) {
        super(2, aVar);
        this.f43314c = vfVar;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        return new tf(this.f43314c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new tf(this.f43314c, (mj.a) obj2).invokeSuspend(Unit.f27471a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033 A[PHI: r9
      0x0033: PHI (r9v4 java.lang.Object) = (r9v3 java.lang.Object), (r9v0 java.lang.Object) binds: [B:12:0x0030, B:9:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x007a -> B:11:0x001c). Please report as a decompilation issue!!! */
    @Override // oj.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            nj.a r0 = nj.a.f29512b
            int r1 = r8.f43313b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L19
            if (r1 == r3) goto L15
            if (r1 != r2) goto Ld
            goto L19
        Ld:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L15:
            com.google.android.gms.internal.measurement.h5.E(r9)
            goto L33
        L19:
            com.google.android.gms.internal.measurement.h5.E(r9)
        L1c:
            yads.vf r9 = r8.f43314c
            yads.jf r1 = r9.f44019e
            long r4 = r9.f44016b
            r8.f43313b = r3
            kotlin.coroutines.CoroutineContext r9 = r1.f39847a
            yads.if r6 = new yads.if
            r7 = 0
            r6.<init>(r1, r4, r7)
            java.lang.Object r9 = hk.c0.t(r9, r6, r8)
            if (r9 != r0) goto L33
            goto L7c
        L33:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L7d
            yads.vf r9 = r8.f43314c
            long r4 = r9.f44015a
            r8.f43313b = r2
            r6 = 0
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 > 0) goto L4a
            kotlin.Unit r9 = kotlin.Unit.f27471a
            goto L7a
        L4a:
            hk.l r9 = new hk.l
            mj.a r1 = nj.f.b(r8)
            r9.<init>(r3, r1)
            r9.t()
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 >= 0) goto L68
            kotlin.coroutines.CoroutineContext r1 = r9.f20688f
            hk.h0 r1 = hk.c0.g(r1)
            r1.i(r4, r9)
        L68:
            java.lang.Object r9 = r9.s()
            nj.a r1 = nj.a.f29512b
            if (r9 != r1) goto L75
            java.lang.String r4 = "frame"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r4)
        L75:
            if (r9 != r1) goto L78
            goto L7a
        L78:
            kotlin.Unit r9 = kotlin.Unit.f27471a
        L7a:
            if (r9 != r0) goto L1c
        L7c:
            return r0
        L7d:
            yads.vf r9 = r8.f43314c
            yads.vf.a(r9)
            kotlin.Unit r9 = kotlin.Unit.f27471a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.tf.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
