package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l9 implements z1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f7451e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f7452f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f7453g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f7454h;
    public n3 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b2 f7455j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f7456k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yo0 f7447a = new yo0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tk0 f7449c = new tk0(4096);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f7448b = new SparseArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j9 f7450d = new j9(0);

    static {
        int i = rs.H;
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final boolean a(a2 a2Var) throws EOFException, InterruptedIOException {
        byte[] bArr = new byte[14];
        v1 v1Var = (v1) a2Var;
        v1Var.R(bArr, 0, 14, false);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) == 442 && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            v1Var.b(bArr[13] & 7, false);
            v1Var.R(bArr, 0, 3, false);
            if ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255)) == 1) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final void b(b2 b2Var) {
        this.f7455j = b2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0021  */
    @Override // com.google.android.gms.internal.ads.z1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(long r5, long r7) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.yo0 r5 = r4.f7447a
            monitor-enter(r5)
            long r0 = r5.f12676b     // Catch: java.lang.Throwable -> L46
            monitor-exit(r5)
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L21
            long r0 = r5.a()
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L24
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L24
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 == 0) goto L24
        L21:
            r5.b(r7)
        L24:
            com.google.android.gms.internal.ads.n3 r5 = r4.i
            r6 = 0
            if (r5 == 0) goto L2c
            r5.d(r7)
        L2c:
            r5 = r6
        L2d:
            android.util.SparseArray r7 = r4.f7448b
            int r8 = r7.size()
            if (r5 >= r8) goto L45
            java.lang.Object r7 = r7.valueAt(r5)
            com.google.android.gms.internal.ads.k9 r7 = (com.google.android.gms.internal.ads.k9) r7
            r7.f7142f = r6
            com.google.android.gms.internal.ads.t8 r7 = r7.f7137a
            r7.h()
            int r5 = r5 + 1
            goto L2d
        L45:
            return
        L46:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L46
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.l9.d(long, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0233  */
    @Override // com.google.android.gms.internal.ads.z1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e(com.google.android.gms.internal.ads.a2 r26, com.google.android.gms.internal.ads.e2 r27) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instruction units count: 808
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.l9.e(com.google.android.gms.internal.ads.a2, com.google.android.gms.internal.ads.e2):int");
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final void c() {
    }
}
