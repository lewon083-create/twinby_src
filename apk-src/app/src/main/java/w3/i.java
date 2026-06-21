package w3;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f35065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f35066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f35067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f35068e;

    public i(String str, String str2, String str3, String str4, String str5) {
        this.f35064a = str;
        this.f35065b = str2;
        this.f35066c = str3;
        this.f35067d = str4;
        this.f35068e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Objects.equals(this.f35064a, iVar.f35064a) && Objects.equals(this.f35065b, iVar.f35065b) && Objects.equals(this.f35066c, iVar.f35066c) && Objects.equals(this.f35067d, iVar.f35067d) && Objects.equals(this.f35068e, iVar.f35068e);
    }

    public final int hashCode() {
        String str = this.f35064a;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f35065b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f35066c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f35067d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f35068e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
