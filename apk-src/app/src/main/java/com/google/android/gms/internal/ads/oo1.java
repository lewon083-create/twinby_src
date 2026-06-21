package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class oo1 implements yo1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pm1 f8749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c6 f8750b;

    public oo1(c6 c6Var, pm1 pm1Var) {
        jl1 jl1Var = ln1.f7586a;
        this.f8750b = c6Var;
        this.f8749a = pm1Var;
    }

    @Override // com.google.android.gms.internal.ads.yo1
    public final void a(Object obj) {
        this.f8750b.getClass();
        ep1 ep1Var = ((sn1) obj).zzt;
        if (ep1Var.f5031e) {
            ep1Var.f5031e = false;
        }
        jl1 jl1Var = ln1.f7586a;
        throw y8.e.a(obj);
    }

    @Override // com.google.android.gms.internal.ads.yo1
    public final void b(Object obj, Object obj2) {
        zo1.d(obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.yo1
    public final void c(Object obj, androidx.datastore.preferences.protobuf.l lVar, kn1 kn1Var) {
        this.f8750b.getClass();
        c6.z(obj);
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.internal.ads.yo1
    public final boolean d(sn1 sn1Var, sn1 sn1Var2) {
        return sn1Var.zzt.equals(sn1Var2.zzt);
    }

    @Override // com.google.android.gms.internal.ads.yo1
    public final boolean e(Object obj) {
        throw y8.e.a(obj);
    }

    @Override // com.google.android.gms.internal.ads.yo1
    public final int f(sn1 sn1Var) {
        ep1 ep1Var = sn1Var.zzt;
        int i = ep1Var.f5030d;
        if (i != -1) {
            return i;
        }
        int iV = 0;
        for (int i10 = 0; i10 < ep1Var.f5027a; i10++) {
            int i11 = ep1Var.f5028b[i10] >>> 3;
            bn1 bn1Var = (bn1) ep1Var.f5029c[i10];
            int iN = hn1.N(8);
            int iN2 = hn1.N(i11) + hn1.N(16);
            int iN3 = hn1.N(24);
            int iN4 = bn1Var.n();
            iV = l7.o.v(iN + iN, iN2, om1.v(iN4, iN4, iN3), iV);
        }
        ep1Var.f5030d = iV;
        return iV;
    }

    @Override // com.google.android.gms.internal.ads.yo1
    public final void g(Object obj, pp0 pp0Var) {
        throw y8.e.a(obj);
    }

    @Override // com.google.android.gms.internal.ads.yo1
    public final sn1 h() {
        pm1 pm1Var = this.f8749a;
        return pm1Var instanceof sn1 ? ((sn1) pm1Var).p() : ((qn1) ((sn1) pm1Var).v(5, null)).c();
    }

    @Override // com.google.android.gms.internal.ads.yo1
    public final int i(sn1 sn1Var) {
        return sn1Var.zzt.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.yo1
    public final void j(Object obj, byte[] bArr, int i, int i10, um1 um1Var) {
        sn1 sn1Var = (sn1) obj;
        if (sn1Var.zzt == ep1.f5026f) {
            sn1Var.zzt = ep1.a();
        }
        throw y8.e.a(obj);
    }
}
