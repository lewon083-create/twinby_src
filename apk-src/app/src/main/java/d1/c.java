package d1;

import g0.j;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f15514c;

    public c(String str, int i, j jVar) {
        this.f15512a = str;
        this.f15513b = i;
        this.f15514c = jVar;
    }

    public final boolean equals(Object obj) {
        j jVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            j jVar2 = cVar.f15514c;
            if (this.f15512a.equals(cVar.f15512a) && this.f15513b == cVar.f15513b && ((jVar = this.f15514c) != null ? jVar.equals(jVar2) : jVar2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f15512a.hashCode() ^ 1000003) * 1000003) ^ this.f15513b) * 1000003;
        j jVar = this.f15514c;
        return iHashCode ^ (jVar == null ? 0 : jVar.hashCode());
    }

    public final String toString() {
        return "VideoMimeInfo{mimeType=" + this.f15512a + ", profile=" + this.f15513b + ", compatibleVideoProfile=" + this.f15514c + "}";
    }
}
