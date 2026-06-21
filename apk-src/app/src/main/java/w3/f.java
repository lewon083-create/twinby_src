package w3;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f35054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f35055c;

    public f(String str, String str2, String str3) {
        this.f35053a = str;
        this.f35054b = str2;
        this.f35055c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f35053a, fVar.f35053a) && Objects.equals(this.f35054b, fVar.f35054b) && Objects.equals(this.f35055c, fVar.f35055c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f35053a.hashCode() * 31;
        String str = this.f35054b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f35055c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
