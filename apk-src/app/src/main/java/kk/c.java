package kk;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends lk.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final oj.i f27411e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final oj.i f27412f;

    /* JADX WARN: Multi-variable type inference failed */
    public c(Function2 function2, CoroutineContext coroutineContext, int i, jk.a aVar) {
        super(coroutineContext, i, aVar);
        oj.i iVar = (oj.i) function2;
        this.f27411e = iVar;
        this.f27412f = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v3, types: [kotlin.jvm.functions.Function2, oj.i] */
    @Override // lk.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(jk.q r5, mj.a r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kk.b
            if (r0 == 0) goto L13
            r0 = r6
            kk.b r0 = (kk.b) r0
            int r1 = r0.f27410o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27410o = r1
            goto L1a
        L13:
            kk.b r0 = new kk.b
            oj.c r6 = (oj.c) r6
            r0.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r0.f27408m
            nj.a r1 = nj.a.f29512b
            int r2 = r0.f27410o
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            jk.q r5 = r0.f27407l
            com.google.android.gms.internal.measurement.h5.E(r6)
            goto L48
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            com.google.android.gms.internal.measurement.h5.E(r6)
            r0.f27407l = r5
            r0.f27410o = r3
            oj.i r6 = r4.f27411e
            java.lang.Object r6 = r6.invoke(r5, r0)
            if (r6 != r1) goto L43
            goto L45
        L43:
            kotlin.Unit r6 = kotlin.Unit.f27471a
        L45:
            if (r6 != r1) goto L48
            return r1
        L48:
            jk.p r5 = (jk.p) r5
            jk.c r5 = r5.f26721e
            boolean r5 = r5.s()
            if (r5 == 0) goto L55
            kotlin.Unit r5 = kotlin.Unit.f27471a
            return r5
        L55:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kk.c.b(jk.q, mj.a):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function2, oj.i] */
    @Override // lk.b
    public final lk.b c(CoroutineContext coroutineContext, int i, jk.a aVar) {
        return new c(this.f27412f, coroutineContext, i, aVar);
    }

    @Override // lk.b
    public final String toString() {
        return "block[" + this.f27411e + "] -> " + super.toString();
    }
}
