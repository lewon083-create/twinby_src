package j3;

import ad.b1;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0 f26357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ad.j0 f26358b;

    static {
        m3.z.G(0);
        m3.z.G(1);
    }

    public q0(p0 p0Var, int i) {
        b1 b1VarW = ad.j0.w(Integer.valueOf(i));
        if (!b1VarW.isEmpty() && (((Integer) Collections.min(b1VarW)).intValue() < 0 || ((Integer) Collections.max(b1VarW)).intValue() >= p0Var.f26351a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f26357a = p0Var;
        this.f26358b = ad.j0.r(b1VarW);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q0.class == obj.getClass()) {
            q0 q0Var = (q0) obj;
            if (this.f26357a.equals(q0Var.f26357a) && this.f26358b.equals(q0Var.f26358b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f26358b.hashCode() * 31) + this.f26357a.hashCode();
    }
}
