package e5;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f16256d;

    public l(String str, String str2, String str3) {
        super("----");
        this.f16254b = str;
        this.f16255c = str2;
        this.f16256d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (Objects.equals(this.f16255c, lVar.f16255c) && Objects.equals(this.f16254b, lVar.f16254b) && Objects.equals(this.f16256d, lVar.f16256d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f16254b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f16255c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f16256d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // e5.j
    public final String toString() {
        return this.f16252a + ": domain=" + this.f16254b + ", description=" + this.f16255c;
    }
}
