package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class oy1 implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f8856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pi f8857b;

    public oy1(d dVar, pi piVar) {
        this.f8856a = dVar;
        this.f8857b = piVar;
    }

    @Override // com.google.android.gms.internal.ads.d
    public final int O(int i) {
        return this.f8856a.O(i);
    }

    public final boolean a(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof oy1) {
            return this.f8856a.equals(((oy1) obj).f8856a);
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (a(obj) && (obj instanceof oy1)) {
            return this.f8857b.equals(((oy1) obj).f8857b);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.d
    public final pi h() {
        return this.f8857b;
    }

    public final int hashCode() {
        return this.f8857b.hashCode() + (this.f8856a.hashCode() * 31);
    }

    @Override // com.google.android.gms.internal.ads.d
    public final int i() {
        return this.f8856a.i();
    }

    @Override // com.google.android.gms.internal.ads.d
    public final jx1 l() {
        return this.f8857b.f9073d[this.f8856a.m()];
    }

    @Override // com.google.android.gms.internal.ads.d
    public final int m() {
        return this.f8856a.m();
    }

    @Override // com.google.android.gms.internal.ads.d
    public final int t(int i) {
        return this.f8856a.t(i);
    }

    @Override // com.google.android.gms.internal.ads.d
    public final jx1 u(int i) {
        return this.f8857b.f9073d[this.f8856a.t(i)];
    }
}
