package yads;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class am1 implements xq {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final am1 f36771g = new am1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final wq f36772h = new zf.a(13);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f36773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f36774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f36775d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f36776e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f36777f;

    public am1(long j10, long j11, long j12, float f10, float f11) {
        this.f36773b = j10;
        this.f36774c = j11;
        this.f36775d = j12;
        this.f36776e = f10;
        this.f36777f = f11;
    }

    public static am1 a(Bundle bundle) {
        return new am1(bundle.getLong(Integer.toString(0, 36), -9223372036854775807L), bundle.getLong(Integer.toString(1, 36), -9223372036854775807L), bundle.getLong(Integer.toString(2, 36), -9223372036854775807L), bundle.getFloat(Integer.toString(3, 36), -3.4028235E38f), bundle.getFloat(Integer.toString(4, 36), -3.4028235E38f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof am1)) {
            return false;
        }
        am1 am1Var = (am1) obj;
        return this.f36773b == am1Var.f36773b && this.f36774c == am1Var.f36774c && this.f36775d == am1Var.f36775d && this.f36776e == am1Var.f36776e && this.f36777f == am1Var.f36777f;
    }

    public final int hashCode() {
        long j10 = this.f36773b;
        long j11 = this.f36774c;
        int i = ((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f36775d;
        int i10 = (i + ((int) ((j12 >>> 32) ^ j12))) * 31;
        float f10 = this.f36776e;
        int iFloatToIntBits = (i10 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31;
        float f11 = this.f36777f;
        return iFloatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0);
    }
}
