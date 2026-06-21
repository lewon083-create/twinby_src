package com.google.android.gms.internal.ads;

import android.content.res.Resources;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Comparator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class pz1 extends zz1 implements Comparable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f9225f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f9226g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f9227h;
    public final uz1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f9228j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f9229k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f9230l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f9231m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f9232n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f9233o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f9234p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f9235q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f9236r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f9237s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f9238t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f9239u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f9240v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f9241w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f9242x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f9243y;

    public pz1(int i, pi piVar, int i10, uz1 uz1Var, int i11, boolean z5, qz1 qz1Var) {
        int i12;
        int iD;
        int iHashCode;
        int iD2;
        boolean z10;
        super(i, piVar, i10);
        this.i = uz1Var;
        boolean z11 = uz1Var.f11142z;
        x41 x41Var = uz1Var.f7943p;
        x41 x41Var2 = uz1Var.f7939l;
        int i13 = 1;
        int i14 = true != z11 ? 16 : 24;
        this.f9227h = b.c(this.f13163e.f6967d);
        this.f9228j = gx1.I(i11, false);
        int i15 = 0;
        while (true) {
            i12 = Integer.MAX_VALUE;
            if (i15 >= x41Var2.size()) {
                iD = 0;
                i15 = Integer.MAX_VALUE;
                break;
            } else {
                iD = b.d(this.f13163e, (String) x41Var2.get(i15), false);
                if (iD > 0) {
                    break;
                } else {
                    i15++;
                }
            }
        }
        this.f9230l = i15;
        this.f9229k = iD;
        int i16 = this.f13163e.f6969f;
        this.f9231m = (i16 == 0 || i16 != 0) ? Integer.bitCount(0) : Integer.MAX_VALUE;
        this.f9232n = b.e(this.f13163e, uz1Var.f7940m);
        jx1 jx1Var = this.f13163e;
        int i17 = jx1Var.f6969f;
        this.f9233o = i17 == 0 || (i17 & 1) != 0;
        this.f9236r = 1 == (jx1Var.f6968e & 1);
        String str = jx1Var.f6975m;
        this.f9243y = str != null && ((iHashCode = str.hashCode()) == -2123537834 ? str.equals("audio/eac3-joc") : !(iHashCode == 187078297 ? !str.equals("audio/ac4") : !(iHashCode == 1504698186 && str.equals("audio/iamf"))));
        int i18 = jx1Var.E;
        this.f9237s = i18;
        this.f9238t = jx1Var.F;
        int i19 = jx1Var.i;
        this.f9239u = i19;
        this.f9226g = (i19 == -1 || i19 <= uz1Var.f7942o) && (i18 == -1 || i18 <= uz1Var.f7941n) && qz1Var.a(jx1Var);
        String str2 = cq0.f4293a;
        String[] strArrSplit = Resources.getSystem().getConfiguration().getLocales().toLanguageTags().split(StringUtils.COMMA, -1);
        for (int i20 = 0; i20 < strArrSplit.length; i20++) {
            strArrSplit[i20] = cq0.o(strArrSplit[i20]);
        }
        int i21 = 0;
        while (true) {
            if (i21 >= strArrSplit.length) {
                iD2 = 0;
                i21 = Integer.MAX_VALUE;
                break;
            } else {
                iD2 = b.d(this.f13163e, strArrSplit[i21], false);
                if (iD2 > 0) {
                    break;
                } else {
                    i21++;
                }
            }
        }
        this.f9234p = i21;
        this.f9235q = iD2;
        int i22 = 0;
        while (true) {
            if (i22 >= x41Var.size()) {
                break;
            }
            String str3 = this.f13163e.f6975m;
            if (str3 != null && str3.equals(x41Var.get(i22))) {
                i12 = i22;
                break;
            }
            i22++;
        }
        this.f9240v = i12;
        this.f9241w = (i11 & 384) == 128;
        this.f9242x = (i11 & 64) == 64;
        uz1 uz1Var2 = this.i;
        if (gx1.I(i11, uz1Var2.B) && ((z10 = this.f9226g) || uz1Var2.f11141y)) {
            uz1Var2.f7944q.getClass();
            if (gx1.I(i11, false) && z10 && this.f13163e.i != -1 && ((uz1Var2.C || !z5) && (i14 & i11) != 0)) {
                i13 = 2;
            }
        } else {
            i13 = 0;
        }
        this.f9225f = i13;
    }

    @Override // com.google.android.gms.internal.ads.zz1
    public final int a() {
        return this.f9225f;
    }

    @Override // com.google.android.gms.internal.ads.zz1
    public final /* bridge */ /* synthetic */ boolean b(zz1 zz1Var) {
        String str;
        int i;
        pz1 pz1Var = (pz1) zz1Var;
        this.i.getClass();
        jx1 jx1Var = this.f13163e;
        int i10 = jx1Var.E;
        if (i10 == -1) {
            return false;
        }
        jx1 jx1Var2 = pz1Var.f13163e;
        return i10 == jx1Var2.E && (str = jx1Var.f6975m) != null && TextUtils.equals(str, jx1Var2.f6975m) && (i = jx1Var.F) != -1 && i == jx1Var2.F && this.f9241w == pz1Var.f9241w && this.f9242x == pz1Var.f9242x;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(pz1 pz1Var) {
        boolean z5 = this.f9228j;
        boolean z10 = this.f9226g;
        Comparator y51Var = (z10 && z5) ? b.f3520k : new y51();
        q41 q41VarD = q41.f9329a.d(z5, pz1Var.f9228j);
        Integer numValueOf = Integer.valueOf(this.f9230l);
        Integer numValueOf2 = Integer.valueOf(pz1Var.f9230l);
        o51 o51Var = o51.f8613d;
        q41 q41VarA = q41VarD.a(numValueOf, numValueOf2, o51Var).b(this.f9229k, pz1Var.f9229k).b(this.f9231m, pz1Var.f9231m).a(Integer.valueOf(this.f9232n), Integer.valueOf(pz1Var.f9232n), o51Var).d(this.f9236r, pz1Var.f9236r).d(this.f9233o, pz1Var.f9233o).a(Integer.valueOf(this.f9234p), Integer.valueOf(pz1Var.f9234p), o51Var).b(this.f9235q, pz1Var.f9235q).d(z10, pz1Var.f9226g).a(Integer.valueOf(this.f9240v), Integer.valueOf(pz1Var.f9240v), o51Var);
        this.i.getClass();
        q41 q41VarA2 = q41VarA.d(this.f9241w, pz1Var.f9241w).d(this.f9242x, pz1Var.f9242x).d(this.f9243y, pz1Var.f9243y).a(Integer.valueOf(this.f9237s), Integer.valueOf(pz1Var.f9237s), y51Var).a(Integer.valueOf(this.f9238t), Integer.valueOf(pz1Var.f9238t), y51Var);
        if (Objects.equals(this.f9227h, pz1Var.f9227h)) {
            q41VarA2 = q41VarA2.a(Integer.valueOf(this.f9239u), Integer.valueOf(pz1Var.f9239u), y51Var);
        }
        return q41VarA2.e();
    }
}
