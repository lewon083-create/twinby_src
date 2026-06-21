package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class kv1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final kv1 f7317d = new p5().c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f7319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f7320c;

    public /* synthetic */ kv1(p5 p5Var) {
        this.f7318a = p5Var.f8926a;
        this.f7319b = p5Var.f8927b;
        this.f7320c = p5Var.f8928c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kv1.class != obj.getClass()) {
            return false;
        }
        kv1 kv1Var = (kv1) obj;
        return this.f7318a == kv1Var.f7318a && this.f7319b == kv1Var.f7319b && this.f7320c == kv1Var.f7320c;
    }

    public final int hashCode() {
        int i = (this.f7318a ? 1 : 0) << 2;
        boolean z5 = this.f7319b;
        return (z5 ? 1 : 0) + (z5 ? 1 : 0) + i + (this.f7320c ? 1 : 0);
    }
}
