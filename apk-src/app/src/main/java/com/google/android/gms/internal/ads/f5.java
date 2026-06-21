package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f5 implements z1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b2 f5230e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public w2 f5231f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5233h;
    public f9 i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f5235k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f5236l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f5238n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public h5 f5239o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f5240p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tk0 f5226a = new tk0(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bi.d f5227b = new bi.d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j2 f5228c = new j2();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f5234j = -9223372036854775807L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l2 f5229d = new l2(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public w2 f5232g = new y1();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f5237m = -1;

    static {
        int i = rs.H;
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final boolean a(a2 a2Var) {
        return f(a2Var, true);
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final void b(b2 b2Var) {
        this.f5230e = b2Var;
        w2 w2VarO = b2Var.O(0, 1);
        this.f5231f = w2VarO;
        this.f5232g = w2VarO;
        this.f5230e.u();
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final void d(long j10, long j11) {
        this.f5233h = 0;
        this.f5234j = -9223372036854775807L;
        this.f5235k = 0L;
        this.f5238n = 0;
        this.f5237m = -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:237:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0090  */
    @Override // com.google.android.gms.internal.ads.z1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e(com.google.android.gms.internal.ads.a2 r47, com.google.android.gms.internal.ads.e2 r48) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instruction units count: 1327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.f5.e(com.google.android.gms.internal.ads.a2, com.google.android.gms.internal.ads.e2):int");
    }

    public final boolean f(a2 a2Var, boolean z5) throws EOFException {
        int iP;
        int i;
        int iA;
        a2Var.e();
        if (a2Var.q() == 0) {
            f9 f9VarA = this.f5229d.a(a2Var, null, 131072);
            this.i = f9VarA;
            if (f9VarA != null) {
                this.f5228c.a(f9VarA);
            }
            iP = (int) a2Var.p();
            if (!z5) {
                a2Var.t(iP);
            }
            i = 0;
        } else {
            iP = 0;
            i = 0;
        }
        int i10 = i;
        int i11 = i10;
        while (true) {
            if (!g(a2Var)) {
                tk0 tk0Var = this.f5226a;
                tk0Var.E(0);
                int iB = tk0Var.b();
                if ((i == 0 || ((-128000) & iB) == (((long) i) & (-128000))) && (iA = rs.a(iB)) != -1) {
                    i10++;
                    if (i10 != 1) {
                        if (i10 == 4) {
                            break;
                        }
                    } else {
                        this.f5227b.b(iB);
                        i = iB;
                    }
                    a2Var.v(iA - 4);
                } else {
                    int i12 = i11 + 1;
                    if (i11 == 131072) {
                        if (z5) {
                            return false;
                        }
                        h();
                        throw new EOFException();
                    }
                    if (z5) {
                        a2Var.e();
                        a2Var.v(iP + i12);
                    } else {
                        a2Var.t(1);
                    }
                    i10 = 0;
                    i11 = i12;
                    i = 0;
                }
            } else if (i10 <= 0) {
                h();
                throw new EOFException();
            }
        }
        if (z5) {
            a2Var.t(iP + i11);
        } else {
            a2Var.e();
        }
        this.f5233h = i;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(com.google.android.gms.internal.ads.a2 r9) {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.h5 r0 = r8.f5239o
            r1 = 1
            if (r0 == 0) goto L1a
            long r2 = r0.c()
            r4 = -1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L1a
            long r4 = r9.p()
            r6 = -4
            long r2 = r2 + r6
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 > 0) goto L28
        L1a:
            com.google.android.gms.internal.ads.tk0 r0 = r8.f5226a     // Catch: java.io.EOFException -> L28
            byte[] r0 = r0.f10641a     // Catch: java.io.EOFException -> L28
            r2 = 4
            r3 = 0
            boolean r9 = r9.R(r0, r3, r2, r1)     // Catch: java.io.EOFException -> L28
            if (r9 != 0) goto L27
            goto L28
        L27:
            return r3
        L28:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.f5.g(com.google.android.gms.internal.ads.a2):boolean");
    }

    public final void h() {
        h5 h5Var = this.f5239o;
        if ((h5Var instanceof d5) && ((d5) h5Var).j()) {
            long j10 = this.f5237m;
            if (j10 == -1 || j10 == this.f5239o.c()) {
                return;
            }
            d5 d5Var = (d5) this.f5239o;
            this.f5239o = new d5(d5Var.f4462h, d5Var.i, this.f5237m, d5Var.f4461g);
            b2 b2Var = this.f5230e;
            b2Var.getClass();
            b2Var.U(this.f5239o);
            this.f5231f.getClass();
            this.f5239o.h();
        }
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final void c() {
    }
}
