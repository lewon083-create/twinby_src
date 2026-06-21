package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ez implements wt1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.datastore.preferences.protobuf.l f5144a = new androidx.datastore.preferences.protobuf.l(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f5145b = 15000000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f5146c = 30000000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f5147d = 2500000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f5148e = 5000000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5149f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f5150g;

    @Override // com.google.android.gms.internal.ads.wt1
    public final void a(fv1 fv1Var) {
        this.f5149f = 0;
        this.f5150g = false;
    }

    @Override // com.google.android.gms.internal.ads.wt1
    public final void b(fv1 fv1Var) {
        this.f5149f = 0;
        this.f5150g = false;
        androidx.datastore.preferences.protobuf.l lVar = this.f5144a;
        synchronized (lVar) {
            lVar.e0(0);
        }
    }

    @Override // com.google.android.gms.internal.ads.wt1
    public final long c() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.wt1
    public final boolean e(vt1 vt1Var) {
        long j10 = vt1Var.f11477f ? this.f5148e : this.f5147d;
        return j10 <= 0 || vt1Var.f11475d >= j10;
    }

    @Override // com.google.android.gms.internal.ads.wt1
    public final void f(fv1 fv1Var) {
        this.f5149f = 0;
        this.f5150g = false;
        androidx.datastore.preferences.protobuf.l lVar = this.f5144a;
        synchronized (lVar) {
            lVar.e0(0);
        }
    }

    @Override // com.google.android.gms.internal.ads.wt1
    public final boolean g(vt1 vt1Var) {
        int i;
        long j10 = vt1Var.f11475d;
        boolean z5 = true;
        char c8 = j10 > this.f5146c ? (char) 0 : j10 < this.f5145b ? (char) 2 : (char) 1;
        androidx.datastore.preferences.protobuf.l lVar = this.f5144a;
        synchronized (lVar) {
            i = lVar.f1436c * 65536;
        }
        int i10 = this.f5149f;
        if (c8 != 2 && (c8 != 1 || !this.f5150g || i >= i10)) {
            z5 = false;
        }
        this.f5150g = z5;
        return z5;
    }

    @Override // com.google.android.gms.internal.ads.wt1
    public final void h(vt1 vt1Var, d[] dVarArr) {
        int i;
        this.f5149f = 0;
        for (d dVar : dVarArr) {
            if (dVar != null) {
                int i10 = this.f5149f;
                int i11 = dVar.h().f9072c;
                if (i11 == 0) {
                    i = 144310272;
                } else if (i11 == 1) {
                    i = 13107200;
                } else if (i11 != 2) {
                    i = 131072;
                    if (i11 != 3 && i11 != 5 && i11 != 6) {
                        throw new IllegalArgumentException();
                    }
                } else {
                    i = 131072000;
                }
                this.f5149f = i10 + i;
            }
        }
        this.f5144a.e0(this.f5149f);
    }

    @Override // com.google.android.gms.internal.ads.wt1
    public final i i(fv1 fv1Var) {
        return this.f5144a;
    }
}
