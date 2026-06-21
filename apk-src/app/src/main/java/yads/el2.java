package yads;

import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class el2 implements nq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b73 f38163a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f38167e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f38168f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f38169g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f38170h;
    public bl2 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public qq0 f38171j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f38172k;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lb2 f38165c = new lb2(4096);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f38164b = new SparseArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final cl2 f38166d = new cl2();

    public el2(b73 b73Var) {
        this.f38163a = b73Var;
    }

    @Override // yads.nq0
    public final void a(qq0 qq0Var) {
        this.f38171j = qq0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
    @Override // yads.nq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void seek(long r5, long r7) {
        /*
            r4 = this;
            yads.b73 r5 = r4.f38163a
            monitor-enter(r5)
            long r0 = r5.f36951b     // Catch: java.lang.Throwable -> L54
            monitor-exit(r5)
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r1 = 0
            if (r0 != 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = r1
        L13:
            if (r0 != 0) goto L2a
            yads.b73 r0 = r4.f38163a
            long r2 = r0.a()
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 == 0) goto L31
            r5 = 0
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 == 0) goto L31
            int r5 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r5 == 0) goto L31
            goto L2c
        L2a:
            if (r0 == 0) goto L31
        L2c:
            yads.b73 r5 = r4.f38163a
            r5.c(r7)
        L31:
            yads.bl2 r5 = r4.i
            if (r5 == 0) goto L38
            r5.a(r7)
        L38:
            r5 = r1
        L39:
            android.util.SparseArray r6 = r4.f38164b
            int r6 = r6.size()
            if (r5 >= r6) goto L53
            android.util.SparseArray r6 = r4.f38164b
            java.lang.Object r6 = r6.valueAt(r5)
            yads.dl2 r6 = (yads.dl2) r6
            r6.f37821f = r1
            yads.vl0 r6 = r6.f37816a
            r6.a()
            int r5 = r5 + 1
            goto L39
        L53:
            return
        L54:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.el2.seek(long, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0273  */
    @Override // yads.nq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(yads.oq0 r25, yads.ig2 r26) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instruction units count: 947
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.el2.a(yads.oq0, yads.ig2):int");
    }

    @Override // yads.nq0
    public final void release() {
    }

    @Override // yads.nq0
    public final boolean a(oq0 oq0Var) {
        byte[] bArr = new byte[14];
        ld0 ld0Var = (ld0) oq0Var;
        ld0Var.b(bArr, 0, 14, false);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        ld0Var.a(false, bArr[13] & 7);
        ld0Var.b(bArr, 0, 3, false);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    public static nq0[] a() {
        return new nq0[]{new el2(new b73(0L))};
    }
}
