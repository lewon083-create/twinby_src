package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class bu1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hy1 f3906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f3907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f3908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f3909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f3910e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f3911f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f3912g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f3913h;

    public bu1(hy1 hy1Var, long j10, long j11, long j12, long j13, boolean z5, boolean z10, boolean z11) {
        ix.o(!z11 || z5);
        ix.o(!z10 || z5);
        this.f3906a = hy1Var;
        this.f3907b = j10;
        this.f3908c = j11;
        this.f3909d = j12;
        this.f3910e = j13;
        this.f3911f = z5;
        this.f3912g = z10;
        this.f3913h = z11;
    }

    public final bu1 a(long j10) {
        return j10 == this.f3907b ? this : new bu1(this.f3906a, j10, this.f3908c, this.f3909d, this.f3910e, this.f3911f, this.f3912g, this.f3913h);
    }

    public final bu1 b(long j10) {
        return j10 == this.f3908c ? this : new bu1(this.f3906a, this.f3907b, j10, this.f3909d, this.f3910e, this.f3911f, this.f3912g, this.f3913h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && bu1.class == obj.getClass()) {
            bu1 bu1Var = (bu1) obj;
            if (this.f3907b == bu1Var.f3907b && this.f3908c == bu1Var.f3908c && this.f3909d == bu1Var.f3909d && this.f3910e == bu1Var.f3910e && this.f3911f == bu1Var.f3911f && this.f3912g == bu1Var.f3912g && this.f3913h == bu1Var.f3913h && Objects.equals(this.f3906a, bu1Var.f3906a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.f3906a.hashCode() + 527) * 31) + ((int) this.f3907b)) * 31) + ((int) this.f3908c)) * 31) + ((int) this.f3909d)) * 31) + ((int) this.f3910e)) * 29791) + (this.f3911f ? 1 : 0)) * 31) + (this.f3912g ? 1 : 0)) * 31) + (this.f3913h ? 1 : 0);
    }
}
