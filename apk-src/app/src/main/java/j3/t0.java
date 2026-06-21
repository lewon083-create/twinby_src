package j3;

import com.google.android.gms.internal.measurement.h5;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p0 f26392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f26393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f26394d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean[] f26395e;

    static {
        m3.z.G(0);
        m3.z.G(1);
        m3.z.G(3);
        m3.z.G(4);
    }

    public t0(p0 p0Var, boolean z5, int[] iArr, boolean[] zArr) {
        int i = p0Var.f26351a;
        this.f26391a = i;
        boolean z10 = false;
        h5.h(i == iArr.length && i == zArr.length);
        this.f26392b = p0Var;
        if (z5 && i > 1) {
            z10 = true;
        }
        this.f26393c = z10;
        this.f26394d = (int[]) iArr.clone();
        this.f26395e = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t0.class == obj.getClass()) {
            t0 t0Var = (t0) obj;
            if (this.f26393c == t0Var.f26393c && this.f26392b.equals(t0Var.f26392b) && Arrays.equals(this.f26394d, t0Var.f26394d) && Arrays.equals(this.f26395e, t0Var.f26395e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f26395e) + ((Arrays.hashCode(this.f26394d) + (((this.f26392b.hashCode() * 31) + (this.f26393c ? 1 : 0)) * 31)) * 31);
    }
}
