package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends c0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f14135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f14136e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c0 f14137f;

    public b0(c0 c0Var, int i, int i10) {
        this.f14137f = c0Var;
        this.f14135d = i;
        this.f14136e = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.x
    public final int c() {
        return this.f14137f.e() + this.f14135d + this.f14136e;
    }

    @Override // com.google.android.gms.internal.play_billing.x
    public final int e() {
        return this.f14137f.e() + this.f14135d;
    }

    @Override // com.google.android.gms.internal.play_billing.x
    public final boolean g() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        d3.h(i, this.f14136e);
        return this.f14137f.get(i + this.f14135d);
    }

    @Override // com.google.android.gms.internal.play_billing.x
    public final Object[] n() {
        return this.f14137f.n();
    }

    @Override // com.google.android.gms.internal.play_billing.c0, java.util.List
    /* JADX INFO: renamed from: p */
    public final c0 subList(int i, int i10) {
        d3.y(i, i10, this.f14136e);
        int i11 = this.f14135d;
        return this.f14137f.subList(i + i11, i10 + i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14136e;
    }
}
