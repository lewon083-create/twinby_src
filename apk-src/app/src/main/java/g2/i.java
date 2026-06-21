package g2;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19867c;

    public i(String str, int i, int i10) {
        this.f19865a = str;
        this.f19866b = i;
        this.f19867c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Objects.equals(this.f19865a, iVar.f19865a) && this.f19866b == iVar.f19866b && this.f19867c == iVar.f19867c;
    }

    public final int hashCode() {
        Integer numValueOf = Integer.valueOf(this.f19866b);
        Integer numValueOf2 = Integer.valueOf(this.f19867c);
        Float fValueOf = Float.valueOf(1.0f);
        return Objects.hash(this.f19865a, numValueOf, numValueOf2, fValueOf, 0, 0, 0, fValueOf);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DisplayShapeCompat{ spec=");
        String str = this.f19865a;
        sb2.append(str != null ? Integer.valueOf(str.hashCode()) : "null");
        sb2.append(" displayWidth=");
        sb2.append(this.f19866b);
        sb2.append(" displayHeight=");
        return t.z.d(this.f19867c, " physicalPixelDisplaySizeRatio=1.0 rotation=0 offsetX=0 offsetY=0 scale=1.0}", sb2);
    }
}
