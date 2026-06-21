package j3;

import android.util.SparseBooleanArray;
import com.google.android.gms.internal.measurement.h5;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f26248a;

    static {
        new SparseBooleanArray();
        h5.r(!false);
        m3.z.G(0);
    }

    public g0(m mVar) {
        this.f26248a = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g0) {
            return this.f26248a.equals(((g0) obj).f26248a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f26248a.f26273a.hashCode();
    }
}
