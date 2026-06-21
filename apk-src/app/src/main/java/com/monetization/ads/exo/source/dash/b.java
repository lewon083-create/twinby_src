package com.monetization.ads.exo.source.dash;

import yads.am1;
import yads.c30;
import yads.e6;
import yads.hc2;
import yads.hm1;
import yads.lb3;
import yads.ni;
import yads.s63;
import yads.v63;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends v63 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f15023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f15024d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f15025e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f15026f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f15027g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f15028h;
    public final long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c30 f15029j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final hm1 f15030k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final am1 f15031l;

    public b(long j10, long j11, long j12, int i, long j13, long j14, long j15, c30 c30Var, hm1 hm1Var, am1 am1Var) {
        ni.b(c30Var.f37256d == (am1Var != null));
        this.f15023c = j10;
        this.f15024d = j11;
        this.f15025e = j12;
        this.f15026f = i;
        this.f15027g = j13;
        this.f15028h = j14;
        this.i = j15;
        this.f15029j = c30Var;
        this.f15030k = hm1Var;
        this.f15031l = am1Var;
    }

    @Override // yads.v63
    public final s63 a(int i, s63 s63Var, boolean z5) {
        ni.a(i, a());
        String str = z5 ? ((hc2) this.f15029j.f37264m.get(i)).f39125a : null;
        Integer numValueOf = z5 ? Integer.valueOf(this.f15026f + i) : null;
        long jA = lb3.a(this.f15029j.b(i));
        long jA2 = lb3.a(((hc2) this.f15029j.f37264m.get(i)).f39126b - ((hc2) this.f15029j.f37264m.get(0)).f39126b) - this.f15027g;
        s63Var.getClass();
        return s63Var.a(str, numValueOf, 0, jA, jA2, e6.f38020h, false);
    }

    @Override // yads.v63
    public final int b() {
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00e3  */
    @Override // yads.v63
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final yads.u63 a(int r41, yads.u63 r42, long r43) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.monetization.ads.exo.source.dash.b.a(int, yads.u63, long):yads.u63");
    }

    @Override // yads.v63
    public final int a() {
        return this.f15029j.f37264m.size();
    }

    @Override // yads.v63
    public final int a(Object obj) {
        int iIntValue;
        if ((obj instanceof Integer) && (iIntValue = ((Integer) obj).intValue() - this.f15026f) >= 0 && iIntValue < a()) {
            return iIntValue;
        }
        return -1;
    }

    @Override // yads.v63
    public final Object a(int i) {
        ni.a(i, a());
        return Integer.valueOf(this.f15026f + i);
    }
}
