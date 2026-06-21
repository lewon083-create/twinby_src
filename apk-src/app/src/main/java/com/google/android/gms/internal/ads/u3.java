package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class u3 implements z1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b2 f10798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a2 f10799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.google.android.gms.ads.identifier.c f10800d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b6 f10801e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f10803g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f10804h;
    public int i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tk0 f10797a = new tk0(16);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f10805j = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10802f = 0;

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0065, code lost:
    
        return false;
     */
    @Override // com.google.android.gms.internal.ads.z1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(com.google.android.gms.internal.ads.a2 r14) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            r13 = this;
            com.google.android.gms.internal.ads.tk0 r0 = new com.google.android.gms.internal.ads.tk0
            r1 = 16
            r0.<init>(r1)
            r2 = 1
            r3 = r2
        L9:
            r4 = 8
            r0.y(r4)
            byte[] r5 = r0.f10641a
            r6 = r14
            com.google.android.gms.internal.ads.v1 r6 = (com.google.android.gms.internal.ads.v1) r6
            r7 = 0
            boolean r5 = r6.R(r5, r7, r4, r2)
            if (r5 != 0) goto L1b
            goto L65
        L1b:
            long r8 = r0.P()
            int r5 = r0.b()
            r10 = 1
            int r10 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r10 != 0) goto L38
            byte[] r8 = r0.f10641a
            boolean r8 = r6.R(r8, r4, r4, r2)
            if (r8 != 0) goto L32
            goto L65
        L32:
            long r8 = r0.j()
            r10 = r1
            goto L39
        L38:
            r10 = r4
        L39:
            long r10 = (long) r10
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 >= 0) goto L3f
            goto L65
        L3f:
            long r8 = r8 - r10
            int r8 = (int) r8
            if (r3 == 0) goto L66
            r3 = 1718909296(0x66747970, float:2.8862439E23)
            if (r5 != r3) goto L65
            if (r8 >= r4) goto L4b
            goto L65
        L4b:
            r3 = 4
            r0.y(r3)
            byte[] r4 = r0.f10641a
            r6.R(r4, r7, r3, r7)
            int r3 = r0.b()
            r4 = 1751476579(0x68656963, float:4.333464E24)
            if (r3 == r4) goto L5e
            goto L65
        L5e:
            int r8 = r8 + (-4)
            r6.b(r8, r7)
        L63:
            r3 = r7
            goto L9
        L65:
            return r7
        L66:
            r3 = 1836086884(0x6d707664, float:4.6512205E27)
            if (r5 != r3) goto L6c
            return r2
        L6c:
            if (r8 == 0) goto L63
            r6.b(r8, r7)
            goto L63
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.u3.a(com.google.android.gms.internal.ads.a2):boolean");
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final void b(b2 b2Var) {
        this.f10798b = b2Var;
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final void c() {
        if (this.f10801e != null) {
            this.f10801e = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final void d(long j10, long j11) {
        if (j10 != 0) {
            if (this.f10802f == 3) {
                b6 b6Var = this.f10801e;
                b6Var.getClass();
                b6Var.d(j10, j11);
                return;
            }
            return;
        }
        this.f10802f = 0;
        this.i = 0;
        this.f10805j = -1L;
        if (this.f10801e != null) {
            this.f10801e = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final int e(a2 a2Var, e2 e2Var) throws eb {
        while (true) {
            int i = this.f10802f;
            int i10 = 2;
            if (i == 0) {
                int i11 = this.i;
                tk0 tk0Var = this.f10797a;
                if (i11 == 0) {
                    if (!a2Var.J(tk0Var.f10641a, 0, 8, true)) {
                        b2 b2Var = this.f10798b;
                        b2Var.getClass();
                        b2Var.u();
                        this.f10798b.U(new f2(-9223372036854775807L, 0L));
                        this.f10802f = 4;
                        return -1;
                    }
                    this.i = 8;
                    tk0Var.E(0);
                    this.f10804h = tk0Var.P();
                    this.f10803g = tk0Var.b();
                }
                long j10 = this.f10804h;
                if (j10 == 1) {
                    a2Var.w(tk0Var.f10641a, 8, 8);
                    this.i += 8;
                    j10 = tk0Var.j();
                    this.f10804h = j10;
                }
                if (this.f10803g == 1836086884) {
                    long jQ = a2Var.q();
                    this.f10805j = jQ;
                    long j11 = this.i;
                    y3 y3Var = new y3(0L, jQ - j11, -9223372036854775807L, jQ, j10 - j11);
                    b2 b2Var2 = this.f10798b;
                    b2Var2.getClass();
                    w2 w2VarO = b2Var2.O(1024, 4);
                    ow1 ow1Var = new ow1();
                    ow1Var.d("image/heic");
                    ow1Var.f8830j = new f9(y3Var);
                    w2VarO.e(new jx1(ow1Var));
                    this.f10802f = 2;
                } else {
                    this.f10802f = 1;
                }
            } else if (i == 1) {
                a2Var.t((int) (this.f10804h - ((long) this.i)));
                this.i = 0;
                this.f10802f = 0;
            } else {
                if (i != 2) {
                    if (i != 3) {
                        return -1;
                    }
                    if (this.f10800d == null || a2Var != this.f10799c) {
                        this.f10799c = a2Var;
                        this.f10800d = new com.google.android.gms.ads.identifier.c(a2Var, this.f10805j);
                    }
                    b6 b6Var = this.f10801e;
                    b6Var.getClass();
                    int iE = b6Var.e(this.f10800d, e2Var);
                    if (iE == 1) {
                        e2Var.f4793b += this.f10805j;
                    }
                    return iE;
                }
                if (this.f10801e == null) {
                    this.f10801e = new b6(z6.A1, 8);
                }
                com.google.android.gms.ads.identifier.c cVar = new com.google.android.gms.ads.identifier.c(a2Var, this.f10805j);
                this.f10800d = cVar;
                if (this.f10801e.a(cVar)) {
                    b6 b6Var2 = this.f10801e;
                    long j12 = this.f10805j;
                    b2 b2Var3 = this.f10798b;
                    b2Var3.getClass();
                    b6Var2.b(new com.google.android.gms.ads.identifier.c(j12, b2Var3, i10));
                    this.f10802f = 3;
                } else {
                    b2 b2Var4 = this.f10798b;
                    b2Var4.getClass();
                    b2Var4.u();
                    this.f10798b.U(new f2(-9223372036854775807L, 0L));
                    this.f10802f = 4;
                }
            }
        }
    }
}
