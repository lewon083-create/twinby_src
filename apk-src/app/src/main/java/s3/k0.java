package s3;

import com.google.android.gms.internal.measurement.h5;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i4.c0 f32598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f32599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f32600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f32601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f32602e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f32603f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f32604g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f32605h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f32606j;

    public k0(i4.c0 c0Var, long j10, long j11, long j12, long j13, boolean z5, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14 = true;
        h5.h(!z13 || z11);
        h5.h(!z12 || z11);
        if (z10 && (z11 || z12 || z13)) {
            z14 = false;
        }
        h5.h(z14);
        this.f32598a = c0Var;
        this.f32599b = j10;
        this.f32600c = j11;
        this.f32601d = j12;
        this.f32602e = j13;
        this.f32603f = z5;
        this.f32604g = z10;
        this.f32605h = z11;
        this.i = z12;
        this.f32606j = z13;
    }

    public final k0 a(long j10) {
        if (j10 == this.f32600c) {
            return this;
        }
        return new k0(this.f32598a, this.f32599b, j10, this.f32601d, this.f32602e, this.f32603f, this.f32604g, this.f32605h, this.i, this.f32606j);
    }

    public final k0 b(long j10) {
        if (j10 == this.f32599b) {
            return this;
        }
        return new k0(this.f32598a, j10, this.f32600c, this.f32601d, this.f32602e, this.f32603f, this.f32604g, this.f32605h, this.i, this.f32606j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k0.class == obj.getClass()) {
            k0 k0Var = (k0) obj;
            if (this.f32599b == k0Var.f32599b && this.f32600c == k0Var.f32600c && this.f32601d == k0Var.f32601d && this.f32602e == k0Var.f32602e && this.f32603f == k0Var.f32603f && this.f32604g == k0Var.f32604g && this.f32605h == k0Var.f32605h && this.i == k0Var.i && this.f32606j == k0Var.f32606j && Objects.equals(this.f32598a, k0Var.f32598a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f32598a.hashCode() + 527) * 31) + ((int) this.f32599b)) * 31) + ((int) this.f32600c)) * 31) + ((int) this.f32601d)) * 31) + ((int) this.f32602e)) * 31) + (this.f32603f ? 1 : 0)) * 31) + (this.f32604g ? 1 : 0)) * 31) + (this.f32605h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.f32606j ? 1 : 0);
    }
}
