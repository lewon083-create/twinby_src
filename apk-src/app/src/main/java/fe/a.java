package fe;

import a0.u;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16780b;

    public a(String str, String str2) {
        this.f16779a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f16780b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f16779a.equals(aVar.f16779a) && this.f16780b.equals(aVar.f16780b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f16779a.hashCode() ^ 1000003) * 1000003) ^ this.f16780b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f16779a);
        sb2.append(", version=");
        return u.o(sb2, this.f16780b, "}");
    }
}
