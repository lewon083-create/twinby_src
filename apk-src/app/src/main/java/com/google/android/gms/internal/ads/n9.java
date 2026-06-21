package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class n9 implements s9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m9 f8240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tk0 f8241b = new tk0(32);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f8244e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f8245f;

    public n9(m9 m9Var) {
        this.f8240a = m9Var;
    }

    @Override // com.google.android.gms.internal.ads.s9
    public final void a(int i, tk0 tk0Var) {
        int i10 = i & 1;
        int iK = i10 != 0 ? tk0Var.f10642b + tk0Var.K() : -1;
        if (this.f8245f) {
            if (i10 == 0) {
                return;
            }
            this.f8245f = false;
            tk0Var.E(iK);
            this.f8243d = 0;
        }
        while (tk0Var.B() > 0) {
            int i11 = this.f8243d;
            tk0 tk0Var2 = this.f8241b;
            if (i11 < 3) {
                if (i11 == 0) {
                    int iK2 = tk0Var.K();
                    tk0Var.E(tk0Var.f10642b - 1);
                    if (iK2 == 255) {
                        this.f8245f = true;
                        return;
                    }
                }
                int iMin = Math.min(tk0Var.B(), 3 - this.f8243d);
                tk0Var.H(tk0Var2.f10641a, this.f8243d, iMin);
                int i12 = this.f8243d + iMin;
                this.f8243d = i12;
                if (i12 == 3) {
                    tk0Var2.E(0);
                    tk0Var2.C(3);
                    tk0Var2.G(1);
                    int iK3 = tk0Var2.K();
                    boolean z5 = (iK3 & 128) != 0;
                    int iK4 = tk0Var2.K();
                    this.f8244e = z5;
                    int i13 = (((iK3 & 15) << 8) | iK4) + 3;
                    this.f8242c = i13;
                    byte[] bArr = tk0Var2.f10641a;
                    if (bArr.length < i13) {
                        int length = bArr.length;
                        tk0Var2.A(Math.min(4098, Math.max(i13, length + length)));
                    }
                }
            } else {
                int iMin2 = Math.min(tk0Var.B(), this.f8242c - this.f8243d);
                tk0Var.H(tk0Var2.f10641a, this.f8243d, iMin2);
                int i14 = this.f8243d + iMin2;
                this.f8243d = i14;
                int i15 = this.f8242c;
                if (i14 != i15) {
                    continue;
                } else {
                    if (!this.f8244e) {
                        tk0Var2.C(i15);
                    } else {
                        if (cq0.f(0, i15, -1, tk0Var2.f10641a) != 0) {
                            this.f8245f = true;
                            return;
                        }
                        tk0Var2.C(this.f8242c - 4);
                    }
                    tk0Var2.E(0);
                    this.f8240a.n(tk0Var2);
                    this.f8243d = 0;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.s9
    public final void c(yo0 yo0Var, b2 b2Var, r9 r9Var) {
        this.f8240a.c(yo0Var, b2Var, r9Var);
        this.f8245f = true;
    }

    @Override // com.google.android.gms.internal.ads.s9
    public final void j() {
        this.f8245f = true;
    }
}
