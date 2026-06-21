package tb;

import java.util.Arrays;
import pa.c0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements na.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f33743b;

    public q(l7.n nVar) {
        this.f33743b = nVar.f28052c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q) || !c0.m(Integer.valueOf(this.f33743b), Integer.valueOf(((q) obj).f33743b)) || !c0.m(1, 1) || !c0.m(null, null)) {
            return false;
        }
        Boolean bool = Boolean.TRUE;
        return c0.m(bool, bool);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f33743b), 1, null, Boolean.TRUE});
    }
}
