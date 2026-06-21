package j3;

import com.google.android.gms.internal.measurement.h5;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f26252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f26254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f26255d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f26256e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f26257f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f26258g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f26259h;
    public final int i;

    static {
        gf.a.o(0, 1, 2, 3, 4);
        m3.z.G(5);
        m3.z.G(6);
    }

    public i0(Object obj, int i, x xVar, Object obj2, int i10, long j10, long j11, int i11, int i12) {
        h5.h(i >= 0);
        h5.h(i10 >= 0);
        this.f26252a = obj;
        this.f26253b = i;
        this.f26254c = xVar;
        this.f26255d = obj2;
        this.f26256e = i10;
        this.f26257f = j10;
        this.f26258g = j11;
        this.f26259h = i11;
        this.i = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i0.class == obj.getClass()) {
            i0 i0Var = (i0) obj;
            if (this.f26253b == i0Var.f26253b && this.f26256e == i0Var.f26256e && this.f26257f == i0Var.f26257f && this.f26258g == i0Var.f26258g && this.f26259h == i0Var.f26259h && this.i == i0Var.i && Objects.equals(this.f26254c, i0Var.f26254c) && Objects.equals(this.f26252a, i0Var.f26252a) && Objects.equals(this.f26255d, i0Var.f26255d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f26252a, Integer.valueOf(this.f26253b), this.f26254c, this.f26255d, Integer.valueOf(this.f26256e), Long.valueOf(this.f26257f), Long.valueOf(this.f26258g), Integer.valueOf(this.f26259h), Integer.valueOf(this.i));
    }

    public final String toString() {
        String str = "mediaItem=" + this.f26253b + ", period=" + this.f26256e + ", pos=" + this.f26257f;
        int i = this.f26259h;
        if (i == -1) {
            return str;
        }
        StringBuilder sbK = pe.a.k(str, ", contentPos=");
        sbK.append(this.f26258g);
        sbK.append(", adGroup=");
        sbK.append(i);
        sbK.append(", ad=");
        sbK.append(this.i);
        return sbK.toString();
    }
}
