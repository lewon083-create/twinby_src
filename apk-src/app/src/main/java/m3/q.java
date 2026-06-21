package m3;

import com.google.android.gms.internal.measurement.h5;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q f28592c = new q(-1, -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f28594b;

    static {
        new q(0, 0);
        z.G(0);
        z.G(1);
    }

    public q(int i, int i10) {
        h5.h((i == -1 || i >= 0) && (i10 == -1 || i10 >= 0));
        this.f28593a = i;
        this.f28594b = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.f28593a == qVar.f28593a && this.f28594b == qVar.f28594b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f28593a;
        return ((i >>> 16) | (i << 16)) ^ this.f28594b;
    }

    public final String toString() {
        return this.f28593a + "x" + this.f28594b;
    }
}
