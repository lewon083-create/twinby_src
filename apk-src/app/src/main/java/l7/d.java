package l7;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f28019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f28020b;

    public d(boolean z5, Uri uri) {
        this.f28019a = uri;
        this.f28020b = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f28020b == dVar.f28020b && this.f28019a.equals(dVar.f28019a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f28019a.hashCode() * 31) + (this.f28020b ? 1 : 0);
    }
}
