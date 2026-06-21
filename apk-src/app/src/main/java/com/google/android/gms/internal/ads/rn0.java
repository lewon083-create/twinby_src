package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class rn0 extends IllegalStateException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10001c;

    public rn0(int i, int i10) {
        super(i != 0 ? i != 1 ? i != 2 ? i != 3 ? l7.o.l(new StringBuilder(String.valueOf(i10).length() + 31), "Player stuck suppressed for ", i10, " ms") : l7.o.l(new StringBuilder(String.valueOf(i10).length() + 43), "Player stuck playing without ending for ", i10, " ms") : l7.o.l(new StringBuilder(String.valueOf(i10).length() + 45), "Player stuck playing with no progress for ", i10, " ms") : l7.o.l(new StringBuilder(String.valueOf(i10).length() + 47), "Player stuck buffering with no progress for ", i10, " ms") : l7.o.l(new StringBuilder(String.valueOf(i10).length() + 46), "Player stuck buffering and not loading for ", i10, " ms"));
        this.f10000b = i;
        this.f10001c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rn0.class != obj.getClass()) {
            return false;
        }
        rn0 rn0Var = (rn0) obj;
        return this.f10000b == rn0Var.f10000b && this.f10001c == rn0Var.f10001c;
    }

    public final int hashCode() {
        return ((this.f10000b + 527) * 31) + this.f10001c;
    }
}
