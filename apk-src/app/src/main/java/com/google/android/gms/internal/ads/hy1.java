package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class hy1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f6299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f6302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6303e;

    public hy1(Object obj, int i, int i10, long j10, int i11) {
        this.f6299a = obj;
        this.f6300b = i;
        this.f6301c = i10;
        this.f6302d = j10;
        this.f6303e = i11;
    }

    public final hy1 a(Object obj) {
        return this.f6299a.equals(obj) ? this : new hy1(obj, this.f6300b, this.f6301c, this.f6302d, this.f6303e);
    }

    public final boolean b() {
        return this.f6300b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hy1)) {
            return false;
        }
        hy1 hy1Var = (hy1) obj;
        return this.f6299a.equals(hy1Var.f6299a) && this.f6300b == hy1Var.f6300b && this.f6301c == hy1Var.f6301c && this.f6302d == hy1Var.f6302d && this.f6303e == hy1Var.f6303e;
    }

    public final int hashCode() {
        return ((((((((this.f6299a.hashCode() + 527) * 31) + this.f6300b) * 31) + this.f6301c) * 31) + ((int) this.f6302d)) * 31) + this.f6303e;
    }

    public hy1(Object obj, long j10) {
        this(obj, -1, -1, j10, -1);
    }

    public hy1(Object obj, long j10, int i) {
        this(obj, -1, -1, j10, i);
    }
}
