package g2;

import android.graphics.Point;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Point f19923c;

    public t(int i, int i10, Point point) {
        int i11 = point.x;
        int i12 = point.y;
        this.f19921a = i;
        this.f19922b = i10;
        this.f19923c = new Point(i11, i12);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t) {
            t tVar = (t) obj;
            if (this.f19921a == tVar.f19921a && this.f19922b == tVar.f19922b && this.f19923c.equals(tVar.f19923c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f19923c.hashCode() + (((this.f19921a * 31) + this.f19922b) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RoundedCornerCompat{position=");
        int i = this.f19921a;
        sb2.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? "Invalid" : "BottomLeft" : "BottomRight" : "TopRight" : "TopLeft");
        sb2.append(", radius=");
        sb2.append(this.f19922b);
        sb2.append(", center=");
        sb2.append(this.f19923c);
        sb2.append('}');
        return sb2.toString();
    }
}
