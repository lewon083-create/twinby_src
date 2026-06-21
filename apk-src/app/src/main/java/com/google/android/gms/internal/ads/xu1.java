package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class xu1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ci f12332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hy1 f12334d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f12335e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ci f12336f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f12337g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final hy1 f12338h;
    public final long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f12339j;

    public xu1(long j10, ci ciVar, int i, hy1 hy1Var, long j11, ci ciVar2, int i10, hy1 hy1Var2, long j12, long j13) {
        this.f12331a = j10;
        this.f12332b = ciVar;
        this.f12333c = i;
        this.f12334d = hy1Var;
        this.f12335e = j11;
        this.f12336f = ciVar2;
        this.f12337g = i10;
        this.f12338h = hy1Var2;
        this.i = j12;
        this.f12339j = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && xu1.class == obj.getClass()) {
            xu1 xu1Var = (xu1) obj;
            if (this.f12331a == xu1Var.f12331a && this.f12333c == xu1Var.f12333c && this.f12335e == xu1Var.f12335e && this.f12337g == xu1Var.f12337g && this.i == xu1Var.i && this.f12339j == xu1Var.f12339j && Objects.equals(this.f12332b, xu1Var.f12332b) && Objects.equals(this.f12334d, xu1Var.f12334d) && Objects.equals(this.f12336f, xu1Var.f12336f) && Objects.equals(this.f12338h, xu1Var.f12338h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f12331a), this.f12332b, Integer.valueOf(this.f12333c), this.f12334d, Long.valueOf(this.f12335e), this.f12336f, Integer.valueOf(this.f12337g), this.f12338h, Long.valueOf(this.i), Long.valueOf(this.f12339j));
    }
}
