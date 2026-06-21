package j3;

import android.util.SparseBooleanArray;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f26273a;

    public m(SparseBooleanArray sparseBooleanArray) {
        this.f26273a = sparseBooleanArray;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            return this.f26273a.equals(((m) obj).f26273a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f26273a.hashCode();
    }
}
