package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class rz1 extends zz1 implements Comparable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f10101f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f10102g;

    public rz1(int i, pi piVar, int i10, uz1 uz1Var, int i11) {
        int i12;
        super(i, piVar, i10);
        this.f10101f = gx1.I(i11, uz1Var.B) ? 1 : 0;
        jx1 jx1Var = this.f13163e;
        int i13 = jx1Var.f6982t;
        int i14 = -1;
        if (i13 != -1 && (i12 = jx1Var.f6983u) != -1) {
            i14 = i13 * i12;
        }
        this.f10102g = i14;
    }

    @Override // com.google.android.gms.internal.ads.zz1
    public final int a() {
        return this.f10101f;
    }

    @Override // com.google.android.gms.internal.ads.zz1
    public final /* bridge */ /* synthetic */ boolean b(zz1 zz1Var) {
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f10102g, ((rz1) obj).f10102g);
    }
}
