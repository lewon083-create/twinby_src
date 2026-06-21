package yads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class hf0 extends gf0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f39150f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final af0 f39151g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f39152h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f39153j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f39154k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f39155l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f39156m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f39157n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f39158o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f39159p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f39160q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f39161r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f39162s;

    /* JADX WARN: Removed duplicated region for block: B:31:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public hf0(int r5, yads.k73 r6, int r7, yads.af0 r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.hf0.<init>(int, yads.k73, int, yads.af0, int, int, boolean):void");
    }

    public static int a(hf0 hf0Var, hf0 hf0Var2) {
        hy hyVarA = fy.a(lq.a(hf0Var.i, hf0Var2.i)).a(hf0Var.f39156m, hf0Var2.f39156m).a(hf0Var.f39157n, hf0Var2.f39157n).a(hf0Var.f39150f, hf0Var2.f39150f).a(hf0Var.f39152h, hf0Var2.f39152h);
        Integer numValueOf = Integer.valueOf(hf0Var.f39155l);
        Integer numValueOf2 = Integer.valueOf(hf0Var2.f39155l);
        b82.f36960b.getClass();
        hy hyVarA2 = hyVarA.a(numValueOf, numValueOf2, lq2.f40637b).a(hf0Var.f39160q, hf0Var2.f39160q).a(hf0Var.f39161r, hf0Var2.f39161r);
        if (hf0Var.f39160q && hf0Var.f39161r) {
            hyVarA2 = hyVarA2.a(hf0Var.f39162s, hf0Var2.f39162s);
        }
        return hyVarA2.a();
    }

    public static int b(hf0 hf0Var, hf0 hf0Var2) {
        ua2 ua2VarA = (hf0Var.f39150f && hf0Var.i) ? if0.i : if0.i.a();
        return fy.a((hf0Var.f39151g.f43227x ? if0.i.a() : if0.f39525j).compare(Integer.valueOf(hf0Var.f39153j), Integer.valueOf(hf0Var2.f39153j))).a(Integer.valueOf(hf0Var.f39154k), Integer.valueOf(hf0Var2.f39154k), ua2VarA).a(Integer.valueOf(hf0Var.f39153j), Integer.valueOf(hf0Var2.f39153j), ua2VarA).a();
    }

    public static int a(List list, List list2) {
        return fy.a(a((hf0) Collections.max(list, new d2.a(23)), (hf0) Collections.max(list2, new d2.a(23)))).a(list.size(), list2.size()).a((hf0) Collections.max(list, new d2.a(24)), (hf0) Collections.max(list2, new d2.a(24)), new d2.a(24)).a();
    }

    public final int a(int i, int i10) {
        if ((this.f38753e.f41369f & 16384) != 0 || !if0.a(this.f39151g.M, i)) {
            return 0;
        }
        if (!this.f39150f && !this.f39151g.C) {
            return 0;
        }
        if (!if0.a(false, i) || !this.f39152h || !this.f39150f || this.f38753e.i == -1) {
            return 1;
        }
        af0 af0Var = this.f39151g;
        return (af0Var.f43228y || af0Var.f43227x || (i & i10) == 0) ? 1 : 2;
    }

    @Override // yads.gf0
    public final int a() {
        return this.f39159p;
    }

    @Override // yads.gf0
    public final boolean a(gf0 gf0Var) {
        hf0 hf0Var = (hf0) gf0Var;
        if (!this.f39158o && !lb3.a(this.f38753e.f41375m, hf0Var.f38753e.f41375m)) {
            return false;
        }
        if (this.f39151g.F) {
            return true;
        }
        return this.f39160q == hf0Var.f39160q && this.f39161r == hf0Var.f39161r;
    }
}
