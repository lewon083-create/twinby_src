package e5;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16267c;

    public p(String str, String str2, String str3) {
        super(str);
        this.f16266b = str2;
        this.f16267c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p.class == obj.getClass()) {
            p pVar = (p) obj;
            if (this.f16252a.equals(pVar.f16252a) && Objects.equals(this.f16266b, pVar.f16266b) && Objects.equals(this.f16267c, pVar.f16267c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iE = gf.a.e(527, 31, this.f16252a);
        String str = this.f16266b;
        int iHashCode = (iE + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f16267c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // e5.j
    public final String toString() {
        return this.f16252a + ": url=" + this.f16267c;
    }
}
