package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a02 extends zz1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f2679f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final uz1 f2680g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f2681h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f2682j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f2683k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f2684l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f2685m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f2686n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f2687o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f2688p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f2689q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f2690r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f2691s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f2692t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f2693u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f2694v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f2695w;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a02(int r8, com.google.android.gms.internal.ads.pi r9, int r10, com.google.android.gms.internal.ads.uz1 r11, int r12, java.lang.String r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.a02.<init>(int, com.google.android.gms.internal.ads.pi, int, com.google.android.gms.internal.ads.uz1, int, java.lang.String, boolean):void");
    }

    public static int c(a02 a02Var, a02 a02Var2) {
        q41 q41VarD = q41.f9329a.d(a02Var.i, a02Var2.i);
        Integer numValueOf = Integer.valueOf(a02Var.f2686n);
        Integer numValueOf2 = Integer.valueOf(a02Var2.f2686n);
        o51 o51Var = o51.f8613d;
        q41 q41VarA = q41VarD.a(numValueOf, numValueOf2, o51Var).b(a02Var.f2687o, a02Var2.f2687o).b(a02Var.f2688p, a02Var2.f2688p).a(Integer.valueOf(a02Var.f2689q), Integer.valueOf(a02Var2.f2689q), o51Var).d(a02Var.f2690r, a02Var2.f2690r).b(a02Var.f2691s, a02Var2.f2691s).d(a02Var.f2682j, a02Var2.f2682j).d(a02Var.f2679f, a02Var2.f2679f).d(a02Var.f2681h, a02Var2.f2681h).a(Integer.valueOf(a02Var.f2685m), Integer.valueOf(a02Var2.f2685m), o51Var);
        boolean z5 = a02Var.f2693u;
        q41 q41VarD2 = q41VarA.d(z5, a02Var2.f2693u);
        boolean z10 = a02Var.f2694v;
        q41 q41VarD3 = q41VarD2.d(z10, a02Var2.f2694v);
        if (z5 && z10) {
            q41VarD3 = q41VarD3.b(a02Var.f2695w, a02Var2.f2695w);
        }
        return q41VarD3.e();
    }

    public static int d(a02 a02Var, a02 a02Var2) {
        Comparator y51Var = (a02Var.f2679f && a02Var.i) ? b.f3520k : new y51();
        a02Var.f2680g.getClass();
        return o41.f(y51Var.compare(Integer.valueOf(a02Var.f2684l), Integer.valueOf(a02Var2.f2684l))).a(Integer.valueOf(a02Var.f2683k), Integer.valueOf(a02Var2.f2683k), y51Var).e();
    }

    @Override // com.google.android.gms.internal.ads.zz1
    public final int a() {
        return this.f2692t;
    }

    @Override // com.google.android.gms.internal.ads.zz1
    public final /* bridge */ /* synthetic */ boolean b(zz1 zz1Var) {
        a02 a02Var = (a02) zz1Var;
        if (!Objects.equals(this.f13163e.f6975m, a02Var.f13163e.f6975m)) {
            return false;
        }
        this.f2680g.getClass();
        return this.f2693u == a02Var.f2693u && this.f2694v == a02Var.f2694v;
    }
}
