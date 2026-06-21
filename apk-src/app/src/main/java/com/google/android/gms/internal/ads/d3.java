package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d3 implements z1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c6 f4428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4429e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e3 f4431g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f4433j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public g3 f4434k;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f4438o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f4439p;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f4427c = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tk0 f4425a = new tk0(12);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c3 f4426b = new c3();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b2 f4430f = new c6(15);
    public g3[] i = new g3[0];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f4436m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f4437n = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4435l = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f4432h = -9223372036854775807L;

    public d3(c6 c6Var) {
        this.f4428d = c6Var;
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final boolean a(a2 a2Var) {
        tk0 tk0Var = this.f4425a;
        a2Var.E(tk0Var.f10641a, 0, 12);
        tk0Var.E(0);
        if (tk0Var.c() != 1179011410) {
            return false;
        }
        tk0Var.G(4);
        return tk0Var.c() == 541677121;
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final void b(b2 b2Var) {
        this.f4429e = 0;
        if (this.f4427c) {
            b2Var = new b7(b2Var, this.f4428d);
        }
        this.f4430f = b2Var;
        this.f4433j = -1L;
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final void d(long j10, long j11) {
        this.f4433j = -1L;
        this.f4434k = null;
        for (g3 g3Var : this.i) {
            if (g3Var.f5640k == 0) {
                g3Var.i = 0;
            } else {
                g3Var.i = g3Var.f5643n[cq0.q(g3Var.f5642m, j10, true)];
            }
        }
        if (j10 == 0) {
            this.f4429e = this.i.length != 0 ? 3 : 0;
        } else {
            this.f4429e = 6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:190:0x03bf  */
    @Override // com.google.android.gms.internal.ads.z1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e(com.google.android.gms.internal.ads.a2 r31, com.google.android.gms.internal.ads.e2 r32) throws com.google.android.gms.internal.ads.eb, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instruction units count: 1159
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.d3.e(com.google.android.gms.internal.ads.a2, com.google.android.gms.internal.ads.e2):int");
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final void c() {
    }
}
