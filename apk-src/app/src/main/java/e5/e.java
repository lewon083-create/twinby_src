package e5;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f16244d;

    public e(String str, String str2, String str3) {
        super("COMM");
        this.f16242b = str;
        this.f16243c = str2;
        this.f16244d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (Objects.equals(this.f16243c, eVar.f16243c) && Objects.equals(this.f16242b, eVar.f16242b) && Objects.equals(this.f16244d, eVar.f16244d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f16242b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f16243c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f16244d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // e5.j
    public final String toString() {
        return this.f16252a + ": language=" + this.f16242b + ", description=" + this.f16243c + ", text=" + this.f16244d;
    }
}
