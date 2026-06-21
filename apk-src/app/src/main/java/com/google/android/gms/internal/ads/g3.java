package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f3 f5631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w2 f5632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5634d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f5635e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5636f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5637g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5638h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f5639j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f5640k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f5641l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long[] f5642m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int[] f5643n;

    public g3(int i, f3 f3Var, w2 w2Var) {
        int i10 = f3Var.f5204d;
        this.f5631a = f3Var;
        int iA = f3Var.a();
        boolean z5 = true;
        if (iA != 1) {
            if (iA == 2) {
                iA = 2;
            } else {
                z5 = false;
            }
        }
        ix.o(z5);
        int i11 = ((i / 10) + 48) | (((i % 10) + 48) << 8);
        this.f5633c = (iA == 2 ? 1667497984 : 1651965952) | i11;
        this.f5635e = cq0.u(i10, ((long) f3Var.f5202b) * 1000000, f3Var.f5203c, RoundingMode.DOWN);
        this.f5632b = w2Var;
        this.f5634d = iA == 2 ? 1650720768 | i11 : -1;
        this.f5641l = -1L;
        this.f5642m = new long[512];
        this.f5643n = new int[512];
        this.f5636f = i10;
    }

    public final n2 a(long j10) {
        if (this.f5640k == 0) {
            p2 p2Var = new p2(0L, this.f5641l);
            return new n2(p2Var, p2Var);
        }
        int i = (int) (j10 / ((this.f5635e * ((long) 1)) / ((long) this.f5636f)));
        int iP = cq0.p(this.f5643n, i, true, true);
        if (this.f5643n[iP] == i) {
            p2 p2VarB = b(iP);
            return new n2(p2VarB, p2VarB);
        }
        p2 p2VarB2 = b(iP);
        int i10 = iP + 1;
        return i10 < this.f5642m.length ? new n2(p2VarB2, b(i10)) : new n2(p2VarB2, p2VarB2);
    }

    public final p2 b(int i) {
        return new p2(((this.f5635e * ((long) 1)) / ((long) this.f5636f)) * ((long) this.f5643n[i]), this.f5642m[i]);
    }
}
