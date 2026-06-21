package f5;

import j3.a0;
import l7.o;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f16661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16662b;

    public c(float f10, int i) {
        this.f16661a = f10;
        this.f16662b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f16661a == cVar.f16661a && this.f16662b == cVar.f16662b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return o.b(this.f16661a, 527, 31) + this.f16662b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f16661a + ", svcTemporalLayerCount=" + this.f16662b;
    }
}
