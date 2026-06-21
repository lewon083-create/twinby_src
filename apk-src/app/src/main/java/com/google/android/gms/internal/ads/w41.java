package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class w41 extends x41 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f11631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f11632e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x41 f11633f;

    public w41(x41 x41Var, int i, int i10) {
        this.f11633f = x41Var;
        this.f11631d = i;
        this.f11632e = i10;
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final Object[] c() {
        return this.f11633f.c();
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final int e() {
        return this.f11633f.e() + this.f11631d;
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final int f() {
        return this.f11633f.e() + this.f11631d + this.f11632e;
    }

    @Override // java.util.List
    public final Object get(int i) {
        ix.n0(i, this.f11632e);
        return this.f11633f.get(i + this.f11631d);
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final boolean n() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.x41, java.util.List
    /* JADX INFO: renamed from: p */
    public final x41 subList(int i, int i10) {
        ix.p0(i, i10, this.f11632e);
        int i11 = this.f11631d;
        return this.f11633f.subList(i + i11, i10 + i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11632e;
    }
}
