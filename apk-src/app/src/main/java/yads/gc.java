package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class gc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jk f38699c;

    public gc(String str, String str2, jk jkVar) {
        this.f38697a = str;
        this.f38698b = str2;
        this.f38699c = jkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gc)) {
            return false;
        }
        gc gcVar = (gc) obj;
        return Intrinsics.a(this.f38697a, gcVar.f38697a) && Intrinsics.a(this.f38698b, gcVar.f38698b) && Intrinsics.a(this.f38699c, gcVar.f38699c);
    }

    public final int hashCode() {
        String str = this.f38697a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f38698b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        jk jkVar = this.f38699c;
        return iHashCode2 + (jkVar != null ? jkVar.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f38697a;
        String str2 = this.f38698b;
        jk jkVar = this.f38699c;
        StringBuilder sbJ = t.z.j("AdditionalInfo(skuId=", str, ", performanceOpeningUrl=", str2, ", attributes=");
        sbJ.append(jkVar);
        sbJ.append(")");
        return sbJ.toString();
    }
}
