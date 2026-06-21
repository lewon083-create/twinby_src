package j3;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f26350b;

    static {
        m3.z.G(0);
        m3.z.G(1);
    }

    public p(String str, String str2) {
        this.f26349a = m3.z.N(str);
        this.f26350b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p.class == obj.getClass()) {
            p pVar = (p) obj;
            if (Objects.equals(this.f26349a, pVar.f26349a) && Objects.equals(this.f26350b, pVar.f26350b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f26350b.hashCode() * 31;
        String str = this.f26349a;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
