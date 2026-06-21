package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e9 implements t8, x5.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f4878d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4879e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4880f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f4881g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f4882h;
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4883j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f4884k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f4885l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f4886m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f4887n;

    public e9(int i, int i10, String str, String str2) {
        switch (i10) {
            case 1:
                this.f4879e = 0;
                m3.p pVar = new m3.p(4);
                this.f4885l = pVar;
                pVar.f28589a[0] = -1;
                this.f4886m = new bi.d();
                this.f4884k = -9223372036854775807L;
                this.f4875a = str;
                this.f4876b = i;
                this.f4877c = str2;
                break;
            default:
                this.f4879e = 0;
                tk0 tk0Var = new tk0(4);
                this.f4885l = tk0Var;
                tk0Var.f10641a[0] = -1;
                this.f4886m = new bi.d();
                this.f4884k = -9223372036854775807L;
                this.f4875a = str;
                this.f4876b = i;
                this.f4877c = str2;
                break;
        }
    }

    @Override // x5.f
    public void a() {
        this.f4879e = 0;
        this.f4880f = 0;
        this.f4882h = false;
        this.f4884k = -9223372036854775807L;
    }

    @Override // x5.f
    public void c(m3.p pVar) {
        m3.p pVar2 = (m3.p) this.f4885l;
        ((q4.a0) this.f4887n).getClass();
        while (pVar.a() > 0) {
            int i = this.f4879e;
            if (i == 0) {
                byte[] bArr = pVar.f28589a;
                int i10 = pVar.f28590b;
                int i11 = pVar.f28591c;
                while (true) {
                    if (i10 >= i11) {
                        pVar.M(i11);
                        break;
                    }
                    byte b2 = bArr[i10];
                    boolean z5 = (b2 & 255) == 255;
                    boolean z10 = this.f4882h && (b2 & 224) == 224;
                    this.f4882h = z5;
                    if (z10) {
                        pVar.M(i10 + 1);
                        this.f4882h = false;
                        pVar2.f28589a[1] = bArr[i10];
                        this.f4880f = 2;
                        this.f4879e = 1;
                        break;
                    }
                    i10++;
                }
            } else if (i == 1) {
                bi.d dVar = (bi.d) this.f4886m;
                int iMin = Math.min(pVar.a(), 4 - this.f4880f);
                pVar.k(pVar2.f28589a, this.f4880f, iMin);
                int i12 = this.f4880f + iMin;
                this.f4880f = i12;
                if (i12 >= 4) {
                    pVar2.M(0);
                    if (dVar.a(pVar2.m())) {
                        this.f4883j = dVar.f2156c;
                        if (!this.f4881g) {
                            this.i = (((long) dVar.f2160g) * 1000000) / ((long) dVar.f2157d);
                            j3.n nVar = new j3.n();
                            nVar.f26281a = this.f4878d;
                            nVar.f26291l = j3.c0.n(this.f4877c);
                            nVar.f26292m = j3.c0.n(dVar.f2155b);
                            nVar.f26293n = 4096;
                            nVar.E = dVar.f2158e;
                            nVar.F = dVar.f2157d;
                            nVar.f26284d = this.f4875a;
                            nVar.f26286f = this.f4876b;
                            ((q4.a0) this.f4887n).a(new j3.o(nVar));
                            this.f4881g = true;
                        }
                        pVar2.M(0);
                        ((q4.a0) this.f4887n).d(4, pVar2);
                        this.f4879e = 2;
                    } else {
                        this.f4880f = 0;
                        this.f4879e = 1;
                    }
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException();
                }
                int iMin2 = Math.min(pVar.a(), this.f4883j - this.f4880f);
                ((q4.a0) this.f4887n).d(iMin2, pVar);
                int i13 = this.f4880f + iMin2;
                this.f4880f = i13;
                if (i13 >= this.f4883j) {
                    com.google.android.gms.internal.measurement.h5.r(this.f4884k != -9223372036854775807L);
                    ((q4.a0) this.f4887n).f(this.f4884k, 1, this.f4883j, 0, null);
                    this.f4884k += this.i;
                    this.f4880f = 0;
                    this.f4879e = 0;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.t8
    public void d(int i, long j10) {
        this.f4884k = j10;
    }

    @Override // x5.f
    public void e(q4.m mVar, r9 r9Var) {
        r9Var.a();
        r9Var.b();
        this.f4878d = (String) r9Var.f9764e;
        r9Var.b();
        this.f4887n = mVar.P(r9Var.f9763d, 1);
    }

    @Override // com.google.android.gms.internal.ads.t8
    public void g(tk0 tk0Var) {
        tk0 tk0Var2 = (tk0) this.f4885l;
        ((w2) this.f4887n).getClass();
        while (tk0Var.B() > 0) {
            int i = this.f4879e;
            if (i == 0) {
                byte[] bArr = tk0Var.f10641a;
                int i10 = tk0Var.f10642b;
                int i11 = tk0Var.f10643c;
                while (true) {
                    if (i10 >= i11) {
                        tk0Var.E(i11);
                        break;
                    }
                    int i12 = i10 + 1;
                    byte b2 = bArr[i10];
                    boolean z5 = (b2 & 255) == 255;
                    boolean z10 = this.f4882h && (b2 & 224) == 224;
                    this.f4882h = z5;
                    if (z10) {
                        tk0Var.E(i12);
                        this.f4882h = false;
                        tk0Var2.f10641a[1] = bArr[i10];
                        this.f4880f = 2;
                        this.f4879e = 1;
                        break;
                    }
                    i10 = i12;
                }
            } else if (i != 1) {
                int iMin = Math.min(tk0Var.B(), this.f4883j - this.f4880f);
                ((w2) this.f4887n).a(iMin, tk0Var);
                int i13 = this.f4880f + iMin;
                this.f4880f = i13;
                if (i13 >= this.f4883j) {
                    ix.k0(this.f4884k != -9223372036854775807L);
                    ((w2) this.f4887n).c(this.f4884k, 1, this.f4883j, 0, null);
                    this.f4884k += this.i;
                    this.f4880f = 0;
                    this.f4879e = 0;
                }
            } else {
                int iMin2 = Math.min(tk0Var.B(), 4 - this.f4880f);
                tk0Var.H(tk0Var2.f10641a, this.f4880f, iMin2);
                int i14 = this.f4880f + iMin2;
                this.f4880f = i14;
                if (i14 >= 4) {
                    tk0Var2.E(0);
                    bi.d dVar = (bi.d) this.f4886m;
                    if (dVar.b(tk0Var2.b())) {
                        this.f4883j = dVar.f2156c;
                        if (!this.f4881g) {
                            this.i = (((long) dVar.f2160g) * 1000000) / ((long) dVar.f2157d);
                            ow1 ow1Var = new ow1();
                            ow1Var.f8822a = this.f4878d;
                            ow1Var.d(this.f4877c);
                            ow1Var.e(dVar.f2155b);
                            ow1Var.f8833m = 4096;
                            ow1Var.D = dVar.f2158e;
                            ow1Var.E = dVar.f2157d;
                            ow1Var.f8825d = this.f4875a;
                            ow1Var.f8827f = this.f4876b;
                            ((w2) this.f4887n).e(new jx1(ow1Var));
                            this.f4881g = true;
                        }
                        tk0Var2.E(0);
                        ((w2) this.f4887n).a(4, tk0Var2);
                        this.f4879e = 2;
                    } else {
                        this.f4880f = 0;
                        this.f4879e = 1;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.t8
    public void h() {
        this.f4879e = 0;
        this.f4880f = 0;
        this.f4882h = false;
        this.f4884k = -9223372036854775807L;
    }

    @Override // x5.f
    public void i(int i, long j10) {
        this.f4884k = j10;
    }

    @Override // com.google.android.gms.internal.ads.t8
    public void j(b2 b2Var, r9 r9Var) {
        r9Var.f();
        r9Var.g();
        this.f4878d = (String) r9Var.f9764e;
        r9Var.g();
        this.f4887n = b2Var.O(r9Var.f9763d, 1);
    }

    @Override // com.google.android.gms.internal.ads.t8
    public void b(boolean z5) {
    }

    @Override // x5.f
    public void f(boolean z5) {
    }
}
