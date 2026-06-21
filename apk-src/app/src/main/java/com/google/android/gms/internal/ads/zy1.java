package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class zy1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f13150b;

    public zy1(int i, boolean z5) {
        this.f13149a = i;
        this.f13150b = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zy1.class != obj.getClass()) {
            return false;
        }
        zy1 zy1Var = (zy1) obj;
        return this.f13149a == zy1Var.f13149a && this.f13150b == zy1Var.f13150b;
    }

    public final int hashCode() {
        return (this.f13149a * 31) + (this.f13150b ? 1 : 0);
    }
}
