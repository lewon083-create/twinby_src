package yads;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class vl1 implements xq {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final wq f44067g = new zl.g0(27);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f44068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f44069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f44070d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f44071e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f44072f;

    public vl1(ul1 ul1Var) {
        this.f44068b = ul1Var.f43708a;
        this.f44069c = ul1Var.f43709b;
        this.f44070d = ul1Var.f43710c;
        this.f44071e = ul1Var.f43711d;
        this.f44072f = ul1Var.f43712e;
    }

    public static wl1 a(Bundle bundle) {
        ul1 ul1Var = new ul1();
        long j10 = bundle.getLong(Integer.toString(0, 36), 0L);
        if (j10 < 0) {
            throw new IllegalArgumentException();
        }
        ul1Var.f43708a = j10;
        long j11 = bundle.getLong(Integer.toString(1, 36), Long.MIN_VALUE);
        if (j11 != Long.MIN_VALUE && j11 < 0) {
            throw new IllegalArgumentException();
        }
        ul1Var.f43709b = j11;
        ul1Var.f43710c = bundle.getBoolean(Integer.toString(2, 36), false);
        ul1Var.f43711d = bundle.getBoolean(Integer.toString(3, 36), false);
        ul1Var.f43712e = bundle.getBoolean(Integer.toString(4, 36), false);
        return new wl1(ul1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vl1)) {
            return false;
        }
        vl1 vl1Var = (vl1) obj;
        return this.f44068b == vl1Var.f44068b && this.f44069c == vl1Var.f44069c && this.f44070d == vl1Var.f44070d && this.f44071e == vl1Var.f44071e && this.f44072f == vl1Var.f44072f;
    }

    public final int hashCode() {
        long j10 = this.f44068b;
        int i = ((int) (j10 ^ (j10 >>> 32))) * 31;
        long j11 = this.f44069c;
        return ((((((i + ((int) ((j11 >>> 32) ^ j11))) * 31) + (this.f44070d ? 1 : 0)) * 31) + (this.f44071e ? 1 : 0)) * 31) + (this.f44072f ? 1 : 0);
    }
}
