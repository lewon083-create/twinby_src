package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class r2 implements z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9681d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9682e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b2 f9683f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public w2 f9684g;

    public r2(int i, int i10, String str) {
        this.f9678a = i;
        this.f9679b = i10;
        this.f9680c = str;
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final boolean a(a2 a2Var) {
        int i = this.f9679b;
        int i10 = this.f9678a;
        ix.k0((i10 == -1 || i == -1) ? false : true);
        tk0 tk0Var = new tk0(i);
        ((v1) a2Var).R(tk0Var.f10641a, 0, i, false);
        return tk0Var.L() == i10;
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final void b(b2 b2Var) {
        this.f9683f = b2Var;
        w2 w2VarO = b2Var.O(1024, 4);
        this.f9684g = w2VarO;
        ow1 ow1Var = new ow1();
        String str = this.f9680c;
        ow1Var.d(str);
        ow1Var.e(str);
        w2VarO.e(new jx1(ow1Var));
        this.f9683f.u();
        this.f9683f.U(new s2());
        this.f9682e = 1;
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final void d(long j10, long j11) {
        if (j10 == 0 || this.f9682e == 1) {
            this.f9682e = 1;
            this.f9681d = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final int e(a2 a2Var, e2 e2Var) {
        int i = this.f9682e;
        if (i != 1) {
            if (i == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        w2 w2Var = this.f9684g;
        w2Var.getClass();
        int iF = w2Var.f(a2Var, 1024, true);
        if (iF != -1) {
            this.f9681d += iF;
            return 0;
        }
        this.f9682e = 2;
        this.f9684g.c(0L, 1, this.f9681d, 0, null);
        this.f9681d = 0;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final void c() {
    }
}
