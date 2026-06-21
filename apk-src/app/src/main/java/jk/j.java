package jk;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f26713a = new i();

    public static c a(int i, a aVar, int i10) {
        if ((i10 & 1) != 0) {
            i = 0;
        }
        if ((i10 & 2) != 0) {
            aVar = a.f26675b;
        }
        if (i == -2) {
            if (aVar != a.f26675b) {
                return new m(1, aVar);
            }
            g.P1.getClass();
            return new c(f.f26711b);
        }
        if (i != -1) {
            return i != 0 ? i != Integer.MAX_VALUE ? aVar == a.f26675b ? new c(i) : new m(i, aVar) : new c(Integer.MAX_VALUE) : aVar == a.f26675b ? new c(0) : new m(1, aVar);
        }
        if (aVar == a.f26675b) {
            return new m(1, a.f26676c);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(jk.q r4, kotlin.jvm.functions.Function0 r5, oj.c r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof jk.n
            if (r0 == 0) goto L13
            r0 = r6
            jk.n r0 = (jk.n) r0
            int r1 = r0.f26719n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26719n = r1
            goto L18
        L13:
            jk.n r0 = new jk.n
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f26718m
            nj.a r1 = nj.a.f29512b
            int r2 = r0.f26719n
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.jvm.functions.Function0 r5 = r0.f26717l
            com.google.android.gms.internal.measurement.h5.E(r6)     // Catch: java.lang.Throwable -> L29
            goto L6a
        L29:
            r4 = move-exception
            goto L70
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            com.google.android.gms.internal.measurement.h5.E(r6)
            kotlin.coroutines.CoroutineContext r6 = r0.getContext()
            hk.b1 r2 = hk.b1.f20637b
            kotlin.coroutines.CoroutineContext$Element r6 = r6.get(r2)
            if (r6 != r4) goto L74
            r0.f26717l = r5     // Catch: java.lang.Throwable -> L29
            r0.f26719n = r3     // Catch: java.lang.Throwable -> L29
            hk.l r6 = new hk.l     // Catch: java.lang.Throwable -> L29
            mj.a r2 = nj.f.b(r0)     // Catch: java.lang.Throwable -> L29
            r6.<init>(r3, r2)     // Catch: java.lang.Throwable -> L29
            r6.t()     // Catch: java.lang.Throwable -> L29
            jk.o r2 = new jk.o     // Catch: java.lang.Throwable -> L29
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L29
            jk.p r4 = (jk.p) r4     // Catch: java.lang.Throwable -> L29
            r4.X(r2)     // Catch: java.lang.Throwable -> L29
            java.lang.Object r4 = r6.s()     // Catch: java.lang.Throwable -> L29
            if (r4 != r1) goto L67
            java.lang.String r6 = "frame"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r6)     // Catch: java.lang.Throwable -> L29
        L67:
            if (r4 != r1) goto L6a
            return r1
        L6a:
            r5.invoke()
            kotlin.Unit r4 = kotlin.Unit.f27471a
            return r4
        L70:
            r5.invoke()
            throw r4
        L74:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: jk.j.b(jk.q, kotlin.jvm.functions.Function0, oj.c):java.lang.Object");
    }
}
