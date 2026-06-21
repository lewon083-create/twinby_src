package p1;

import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends ViewGroup.MarginLayoutParams {
    public int A;
    public int B;
    public int C;
    public int D;
    public float E;
    public float F;
    public String G;
    public float H;
    public float I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public float R;
    public float S;
    public int T;
    public int U;
    public int V;
    public boolean W;
    public boolean X;
    public String Y;
    public int Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f30776a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f30777a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f30778b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f30779b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f30780c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f30781c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f30782d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f30783d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f30784e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f30785e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f30786f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f30787f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f30788g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f30789g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f30790h;
    public int h0;
    public int i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f30791i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f30792j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public int f30793j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f30794k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f30795k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f30796l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public float f30797l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f30798m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public int f30799m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f30800n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public int f30801n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f30802o;
    public float o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f30803p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public m1.d f30804p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f30805q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f30806r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f30807s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f30808t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f30809u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f30810v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f30811w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f30812x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f30813y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f30814z;

    public final void a() {
        this.f30783d0 = false;
        this.f30777a0 = true;
        this.f30779b0 = true;
        int i = ((ViewGroup.MarginLayoutParams) this).width;
        if (i == -2 && this.W) {
            this.f30777a0 = false;
            if (this.L == 0) {
                this.L = 1;
            }
        }
        int i10 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i10 == -2 && this.X) {
            this.f30779b0 = false;
            if (this.M == 0) {
                this.M = 1;
            }
        }
        if (i == 0 || i == -1) {
            this.f30777a0 = false;
            if (i == 0 && this.L == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.W = true;
            }
        }
        if (i10 == 0 || i10 == -1) {
            this.f30779b0 = false;
            if (i10 == 0 && this.M == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.X = true;
            }
        }
        if (this.f30780c == -1.0f && this.f30776a == -1 && this.f30778b == -1) {
            return;
        }
        this.f30783d0 = true;
        this.f30777a0 = true;
        this.f30779b0 = true;
        if (!(this.f30804p0 instanceof m1.h)) {
            this.f30804p0 = new m1.h();
        }
        ((m1.h) this.f30804p0).S(this.V);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void resolveLayoutDirection(int r11) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.d.resolveLayoutDirection(int):void");
    }
}
