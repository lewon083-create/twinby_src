package u9;

import com.google.android.gms.internal.ads.om1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f34389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f34390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f34391d;

    public h(int i, int i10, double d10, boolean z5) {
        this.f34388a = i;
        this.f34389b = i10;
        this.f34390c = d10;
        this.f34391d = z5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f34388a == hVar.f34388a && this.f34389b == hVar.f34389b && Double.doubleToLongBits(this.f34390c) == Double.doubleToLongBits(hVar.f34390c) && this.f34391d == hVar.f34391d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        double d10 = this.f34390c;
        return ((((int) (Double.doubleToLongBits(d10) ^ (Double.doubleToLongBits(d10) >>> 32))) ^ ((((this.f34388a ^ 1000003) * 1000003) ^ this.f34389b) * 1000003)) * 1000003) ^ (true != this.f34391d ? 1237 : 1231);
    }

    public final String toString() {
        int i = this.f34388a;
        int length = String.valueOf(i).length();
        int i10 = this.f34389b;
        int length2 = String.valueOf(i10).length();
        double d10 = this.f34390c;
        int length3 = String.valueOf(d10).length();
        boolean z5 = this.f34391d;
        StringBuilder sb2 = new StringBuilder(length + 44 + length2 + 20 + length3 + 25 + String.valueOf(z5).length() + 1);
        om1.u(sb2, "PingStrategy{maxAttempts=", i, ", initialBackoffMs=", i10);
        sb2.append(", backoffMultiplier=");
        sb2.append(d10);
        sb2.append(", bufferAfterMaxAttempts=");
        sb2.append(z5);
        sb2.append("}");
        return sb2.toString();
    }
}
