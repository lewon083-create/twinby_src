package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class uu1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final uu1 f11101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final uu1 f11102d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11104b;

    static {
        uu1 uu1Var = new uu1(0L, 0L);
        new uu1(Long.MAX_VALUE, Long.MAX_VALUE);
        f11101c = new uu1(Long.MAX_VALUE, 0L);
        new uu1(0L, Long.MAX_VALUE);
        f11102d = uu1Var;
    }

    public uu1(long j10, long j11) {
        ix.o(j10 >= 0);
        ix.o(j11 >= 0);
        this.f11103a = j10;
        this.f11104b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && uu1.class == obj.getClass()) {
            uu1 uu1Var = (uu1) obj;
            if (this.f11103a == uu1Var.f11103a && this.f11104b == uu1Var.f11104b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f11103a) * 31) + ((int) this.f11104b);
    }
}
