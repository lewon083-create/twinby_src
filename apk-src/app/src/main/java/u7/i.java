package u7;

import t.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f34328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f34329b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f34329b != iVar.f34329b) {
            return false;
        }
        return this.f34328a.equals(iVar.f34328a);
    }

    public final int hashCode() {
        return z.m(this.f34329b) + (this.f34328a.hashCode() * 31);
    }
}
