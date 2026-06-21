package com.google.android.gms.internal.auth;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class z1 extends l0 {
    private static final z1 zzb;
    private m0 zzd = i1.f13233e;

    static {
        z1 z1Var = new z1();
        zzb = z1Var;
        l0.e(z1Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0045, code lost:
    
        if (r7 != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.auth.z1 j(byte[] r7) throws com.google.android.gms.internal.auth.p0 {
        /*
            com.google.android.gms.internal.auth.z1 r0 = com.google.android.gms.internal.auth.z1.zzb
            int r5 = r7.length
            com.google.android.gms.internal.auth.h0 r1 = com.google.android.gms.internal.auth.h0.f13227a
            com.google.android.gms.internal.auth.l0 r2 = r0.b()
            com.google.android.gms.internal.auth.h1 r0 = com.google.android.gms.internal.auth.h1.f13228c     // Catch: java.lang.IndexOutOfBoundsException -> L5b java.io.IOException -> L60 com.google.android.gms.internal.auth.m1 -> L7b com.google.android.gms.internal.auth.p0 -> L87
            java.lang.Class r3 = r2.getClass()     // Catch: java.lang.IndexOutOfBoundsException -> L5b java.io.IOException -> L60 com.google.android.gms.internal.auth.m1 -> L7b com.google.android.gms.internal.auth.p0 -> L87
            com.google.android.gms.internal.auth.k1 r3 = r0.a(r3)     // Catch: java.lang.IndexOutOfBoundsException -> L5b java.io.IOException -> L60 com.google.android.gms.internal.auth.m1 -> L7b com.google.android.gms.internal.auth.p0 -> L87
            a4.g r6 = new a4.g     // Catch: java.lang.IndexOutOfBoundsException -> L5b java.io.IOException -> L60 com.google.android.gms.internal.auth.m1 -> L7b com.google.android.gms.internal.auth.p0 -> L87
            r4 = 4
            r6.<init>(r4)     // Catch: java.lang.IndexOutOfBoundsException -> L5b java.io.IOException -> L60 com.google.android.gms.internal.auth.m1 -> L7b com.google.android.gms.internal.auth.p0 -> L87
            r1.getClass()     // Catch: java.lang.IndexOutOfBoundsException -> L5b java.io.IOException -> L60 com.google.android.gms.internal.auth.m1 -> L7b com.google.android.gms.internal.auth.p0 -> L87
            r4 = 0
            r1 = r3
            r3 = r7
            r1.b(r2, r3, r4, r5, r6)     // Catch: java.lang.IndexOutOfBoundsException -> L5b java.io.IOException -> L60 com.google.android.gms.internal.auth.m1 -> L7b com.google.android.gms.internal.auth.p0 -> L87
            r1.d(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L5b java.io.IOException -> L60 com.google.android.gms.internal.auth.m1 -> L7b com.google.android.gms.internal.auth.p0 -> L87
            r7 = 1
            java.lang.Object r1 = r2.h(r7)
            java.lang.Byte r1 = (java.lang.Byte) r1
            byte r1 = r1.byteValue()
            if (r1 != r7) goto L33
            goto L47
        L33:
            if (r1 == 0) goto L4a
            java.lang.Class r7 = r2.getClass()
            com.google.android.gms.internal.auth.k1 r7 = r0.a(r7)
            boolean r7 = r7.f(r2)
            r0 = 2
            r2.h(r0)
            if (r7 == 0) goto L4a
        L47:
            com.google.android.gms.internal.auth.z1 r2 = (com.google.android.gms.internal.auth.z1) r2
            return r2
        L4a:
            com.google.android.gms.internal.auth.m1 r7 = new com.google.android.gms.internal.auth.m1
            java.lang.String r0 = "Message was missing required fields.  (Lite runtime could not determine which fields were missing)."
            r7.<init>(r0)
            com.google.android.gms.internal.auth.p0 r0 = new com.google.android.gms.internal.auth.p0
            java.lang.String r7 = r7.getMessage()
            r0.<init>(r7)
            throw r0
        L5b:
            com.google.android.gms.internal.auth.p0 r7 = com.google.android.gms.internal.auth.p0.c()
            throw r7
        L60:
            r0 = move-exception
            r7 = r0
            java.lang.Throwable r0 = r7.getCause()
            boolean r0 = r0 instanceof com.google.android.gms.internal.auth.p0
            if (r0 == 0) goto L71
            java.lang.Throwable r7 = r7.getCause()
            com.google.android.gms.internal.auth.p0 r7 = (com.google.android.gms.internal.auth.p0) r7
            throw r7
        L71:
            com.google.android.gms.internal.auth.p0 r0 = new com.google.android.gms.internal.auth.p0
            java.lang.String r1 = r7.getMessage()
            r0.<init>(r1, r7)
            throw r0
        L7b:
            r0 = move-exception
            r7 = r0
            com.google.android.gms.internal.auth.p0 r0 = new com.google.android.gms.internal.auth.p0
            java.lang.String r7 = r7.getMessage()
            r0.<init>(r7)
            throw r0
        L87:
            r0 = move-exception
            r7 = r0
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.z1.j(byte[]):com.google.android.gms.internal.auth.z1");
    }

    @Override // com.google.android.gms.internal.auth.l0
    public final Object h(int i) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new j1(zzb, new Object[]{"zzd"});
        }
        if (i10 == 3) {
            return new z1();
        }
        if (i10 == 4) {
            return new y1();
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }

    public final m0 k() {
        return this.zzd;
    }
}
