package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class xz1 extends zz1 implements Comparable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f12422f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f12423g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f12424h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f12425j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f12426k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f12427l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f12428m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f12429n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f12430o;

    public xz1(int i, pi piVar, int i10, uz1 uz1Var, int i11, String str, String str2) {
        int iD;
        super(i, piVar, i10);
        int i12 = 0;
        this.f12423g = gx1.I(i11, false);
        int i13 = this.f13163e.f6968e;
        uz1Var.getClass();
        x41 x41Var = uz1Var.f7945r;
        this.f12424h = 1 == (i13 & 1);
        this.i = (i13 & 2) != 0;
        x41 x41VarQ = str2 != null ? x41.q(str2) : x41Var.isEmpty() ? x41.q("") : x41Var;
        int i14 = 0;
        while (true) {
            if (i14 >= x41VarQ.size()) {
                iD = 0;
                i14 = Integer.MAX_VALUE;
                break;
            } else {
                iD = b.d(this.f13163e, (String) x41VarQ.get(i14), false);
                if (iD > 0) {
                    break;
                } else {
                    i14++;
                }
            }
        }
        this.f12425j = i14;
        this.f12426k = iD;
        int i15 = str2 != null ? 1088 : 0;
        int i16 = this.f13163e.f6969f;
        int iBitCount = (i16 == 0 || i16 != i15) ? Integer.bitCount(i15 & i16) : Integer.MAX_VALUE;
        this.f12427l = iBitCount;
        jx1 jx1Var = this.f13163e;
        this.f12430o = (1088 & jx1Var.f6969f) != 0;
        int iE = b.e(jx1Var, uz1Var.f7946s);
        this.f12428m = iE;
        int iD2 = b.d(this.f13163e, str, b.c(str) == null);
        this.f12429n = iD2;
        boolean z5 = iD > 0 || (x41Var.isEmpty() && iBitCount > 0) || ((x41Var.isEmpty() && iE != Integer.MAX_VALUE) || this.f12424h || (this.i && iD2 > 0));
        if (gx1.I(i11, uz1Var.B) && z5) {
            i12 = 1;
        }
        this.f12422f = i12;
    }

    @Override // com.google.android.gms.internal.ads.zz1
    public final int a() {
        return this.f12422f;
    }

    @Override // com.google.android.gms.internal.ads.zz1
    public final /* bridge */ /* synthetic */ boolean b(zz1 zz1Var) {
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(xz1 xz1Var) {
        q41 q41VarD = q41.f9329a.d(this.f12423g, xz1Var.f12423g);
        Integer numValueOf = Integer.valueOf(this.f12425j);
        Integer numValueOf2 = Integer.valueOf(xz1Var.f12425j);
        o51 o51Var = o51.f8612c;
        o51 o51Var2 = o51.f8613d;
        q41 q41VarA = q41VarD.a(numValueOf, numValueOf2, o51Var2);
        int i = xz1Var.f12426k;
        int i10 = this.f12426k;
        q41 q41VarB = q41VarA.b(i10, i);
        int i11 = xz1Var.f12427l;
        int i12 = this.f12427l;
        q41 q41VarD2 = q41VarB.b(i12, i11).a(Integer.valueOf(this.f12428m), Integer.valueOf(xz1Var.f12428m), o51Var2).d(this.f12424h, xz1Var.f12424h);
        Boolean boolValueOf = Boolean.valueOf(this.i);
        Boolean boolValueOf2 = Boolean.valueOf(xz1Var.i);
        if (i10 != 0) {
            o51Var = o51Var2;
        }
        q41 q41VarB2 = q41VarD2.a(boolValueOf, boolValueOf2, o51Var).b(this.f12429n, xz1Var.f12429n);
        if (i12 == 0) {
            q41VarB2 = q41VarB2.c(this.f12430o, xz1Var.f12430o);
        }
        return q41VarB2.e();
    }
}
