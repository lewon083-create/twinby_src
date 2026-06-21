package p2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends g0 {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r6, oj.c r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof p2.m0
            if (r0 == 0) goto L13
            r0 = r7
            p2.m0 r0 = (p2.m0) r0
            int r1 = r0.f31034p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31034p = r1
            goto L18
        L13:
            p2.m0 r0 = new p2.m0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f31032n
            nj.a r1 = nj.a.f29512b
            int r2 = r0.f31034p
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.io.FileOutputStream r6 = r0.f31031m
            java.io.FileOutputStream r0 = r0.f31030l
            com.google.android.gms.internal.measurement.h5.E(r7)     // Catch: java.lang.Throwable -> L2b
            goto L5d
        L2b:
            r6 = move-exception
            goto L6f
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            com.google.android.gms.internal.measurement.h5.E(r7)
            java.util.concurrent.atomic.AtomicBoolean r7 = r5.f30979c
            boolean r7 = r7.get()
            if (r7 != 0) goto L75
            java.io.FileOutputStream r7 = new java.io.FileOutputStream
            java.io.File r2 = r5.f30977a
            r7.<init>(r2)
            p2.s0 r2 = r5.f30978b     // Catch: java.lang.Throwable -> L6d
            nl.f r4 = new nl.f     // Catch: java.lang.Throwable -> L6d
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L6d
            r0.f31030l = r7     // Catch: java.lang.Throwable -> L6d
            r0.f31031m = r7     // Catch: java.lang.Throwable -> L6d
            r0.f31034p = r3     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r6 = r2.c(r6, r4, r0)     // Catch: java.lang.Throwable -> L6d
            if (r6 != r1) goto L5b
            return r1
        L5b:
            r6 = r7
            r0 = r6
        L5d:
            java.io.FileDescriptor r6 = r6.getFD()     // Catch: java.lang.Throwable -> L2b
            r6.sync()     // Catch: java.lang.Throwable -> L2b
            kotlin.Unit r6 = kotlin.Unit.f27471a     // Catch: java.lang.Throwable -> L2b
            r6 = 0
            hl.l.g(r0, r6)
            kotlin.Unit r6 = kotlin.Unit.f27471a
            return r6
        L6d:
            r6 = move-exception
            r0 = r7
        L6f:
            throw r6     // Catch: java.lang.Throwable -> L70
        L70:
            r7 = move-exception
            hl.l.g(r0, r6)
            throw r7
        L75:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "This scope has already been closed."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.n0.b(java.lang.Object, oj.c):java.lang.Object");
    }
}
