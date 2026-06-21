package v;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f34618a;

    public g(e eVar) {
        this.f34618a = eVar;
    }

    public static g a(Object obj) {
        if (obj == null) {
            return null;
        }
        return Build.VERSION.SDK_INT >= 31 ? new g(new f(obj)) : new g(new e(obj));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        return this.f34618a.equals(((g) obj).f34618a);
    }

    public final int hashCode() {
        return this.f34618a.hashCode();
    }

    public final String toString() {
        return this.f34618a.toString();
    }
}
