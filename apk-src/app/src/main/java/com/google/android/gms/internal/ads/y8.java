package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class y8 implements t8 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float[] f12535l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o9 f12536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tk0 f12537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean[] f12538c = new boolean[4];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w8 f12539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h9 f12540e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public x8 f12541f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f12542g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f12543h;
    public w2 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f12544j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f12545k;

    public y8(o9 o9Var) {
        this.f12536a = o9Var;
        w8 w8Var = new w8();
        w8Var.f11694e = new byte[128];
        this.f12539d = w8Var;
        this.f12545k = -9223372036854775807L;
        this.f12540e = new h9(178, 0);
        this.f12537b = new tk0();
    }

    @Override // com.google.android.gms.internal.ads.t8
    public final void b(boolean z5) {
        x8 x8Var = this.f12541f;
        x8Var.getClass();
        if (z5) {
            x8Var.d(0, this.f12542g, this.f12544j);
            x8 x8Var2 = this.f12541f;
            x8Var2.f12066a = false;
            x8Var2.f12067b = false;
            x8Var2.f12068c = false;
            x8Var2.f12069d = -1;
        }
    }

    @Override // com.google.android.gms.internal.ads.t8
    public final void d(int i, long j10) {
        this.f12545k = j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013c  */
    @Override // com.google.android.gms.internal.ads.t8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(com.google.android.gms.internal.ads.tk0 r20) {
        /*
            Method dump skipped, instruction units count: 604
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.y8.g(com.google.android.gms.internal.ads.tk0):void");
    }

    @Override // com.google.android.gms.internal.ads.t8
    public final void h() {
        rs.O(this.f12538c);
        w8 w8Var = this.f12539d;
        w8Var.f11690a = false;
        w8Var.f11692c = 0;
        w8Var.f11691b = 0;
        x8 x8Var = this.f12541f;
        if (x8Var != null) {
            x8Var.f12066a = false;
            x8Var.f12067b = false;
            x8Var.f12068c = false;
            x8Var.f12069d = -1;
        }
        this.f12540e.e();
        this.f12542g = 0L;
        this.f12545k = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.t8
    public final void j(b2 b2Var, r9 r9Var) {
        r9Var.f();
        r9Var.g();
        this.f12543h = (String) r9Var.f9764e;
        r9Var.g();
        w2 w2VarO = b2Var.O(r9Var.f9763d, 2);
        this.i = w2VarO;
        this.f12541f = new x8(w2VarO);
        this.f12536a.a(b2Var, r9Var);
    }
}
