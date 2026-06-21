package kk;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class j implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m4.d f27428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p2.q f27429c;

    public j(m4.d dVar, p2.q qVar) {
        this.f27428b = dVar;
        this.f27429c = qVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kk.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object p(kk.f r9, mj.a r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof kk.i
            if (r0 == 0) goto L13
            r0 = r10
            kk.i r0 = (kk.i) r0
            int r1 = r0.f27424m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27424m = r1
            goto L18
        L13:
            kk.i r0 = new kk.i
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f27423l
            nj.a r1 = nj.a.f29512b
            int r2 = r0.f27424m
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L50
            if (r2 == r5) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r9 = r0.f27426o
            lk.h r9 = (lk.h) r9
            com.google.android.gms.internal.measurement.h5.E(r10)     // Catch: java.lang.Throwable -> L32
            goto L7c
        L32:
            r10 = move-exception
            goto L86
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            java.lang.Object r9 = r0.f27426o
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            com.google.android.gms.internal.measurement.h5.E(r10)
            goto La0
        L44:
            kk.f r9 = r0.f27427p
            java.lang.Object r2 = r0.f27426o
            kk.j r2 = (kk.j) r2
            com.google.android.gms.internal.measurement.h5.E(r10)     // Catch: java.lang.Throwable -> L4e
            goto L63
        L4e:
            r9 = move-exception
            goto L8c
        L50:
            com.google.android.gms.internal.measurement.h5.E(r10)
            m4.d r10 = r8.f27428b     // Catch: java.lang.Throwable -> L8a
            r0.f27426o = r8     // Catch: java.lang.Throwable -> L8a
            r0.f27427p = r9     // Catch: java.lang.Throwable -> L8a
            r0.f27424m = r5     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r10 = r10.p(r9, r0)     // Catch: java.lang.Throwable -> L8a
            if (r10 != r1) goto L62
            goto L9f
        L62:
            r2 = r8
        L63:
            lk.h r10 = new lk.h
            kotlin.coroutines.CoroutineContext r4 = r0.getContext()
            r10.<init>(r9, r4)
            p2.q r9 = r2.f27429c     // Catch: java.lang.Throwable -> L82
            r0.f27426o = r10     // Catch: java.lang.Throwable -> L82
            r0.f27427p = r6     // Catch: java.lang.Throwable -> L82
            r0.f27424m = r3     // Catch: java.lang.Throwable -> L82
            java.lang.Object r9 = r9.invoke(r10, r6, r0)     // Catch: java.lang.Throwable -> L82
            if (r9 != r1) goto L7b
            goto L9f
        L7b:
            r9 = r10
        L7c:
            r9.releaseIntercepted()
            kotlin.Unit r9 = kotlin.Unit.f27471a
            return r9
        L82:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L86:
            r9.releaseIntercepted()
            throw r10
        L8a:
            r9 = move-exception
            r2 = r8
        L8c:
            kk.w r10 = new kk.w
            r10.<init>(r9)
            p2.q r2 = r2.f27429c
            r0.f27426o = r9
            r0.f27427p = r6
            r0.f27424m = r4
            java.lang.Object r10 = kk.u.a(r10, r2, r9, r0)
            if (r10 != r1) goto La0
        L9f:
            return r1
        La0:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kk.j.p(kk.f, mj.a):java.lang.Object");
    }
}
