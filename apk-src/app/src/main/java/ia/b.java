package ia;

import h3.e;
import java.util.Arrays;
import pa.c0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements na.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f21225d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f21226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f21227c;

    static {
        e eVar = new e(12);
        eVar.f20375c = Boolean.FALSE;
        f21225d = new b(eVar);
    }

    public b(e eVar) {
        this.f21226b = ((Boolean) eVar.f20375c).booleanValue();
        this.f21227c = (String) eVar.f20376d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return c0.m(null, null) && this.f21226b == bVar.f21226b && c0.m(this.f21227c, bVar.f21227c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f21226b), this.f21227c});
    }
}
