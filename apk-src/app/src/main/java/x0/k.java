package x0;

import android.util.Range;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Range f35626e = new Range(0, Integer.MAX_VALUE);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p f35627f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f35628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f35629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Range f35630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f35631d;

    static {
        g gVar = g.f35586g;
        f35627f = p.a(Arrays.asList(gVar, g.f35585f, g.f35584e), new c(gVar, 1));
    }

    public k(p pVar, int i, Range range, int i10) {
        this.f35628a = pVar;
        this.f35629b = i;
        this.f35630c = range;
        this.f35631d = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f35628a.equals(kVar.f35628a) && this.f35629b == kVar.f35629b && this.f35630c.equals(kVar.f35630c) && this.f35631d == kVar.f35631d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f35628a.hashCode() ^ 1000003) * 1000003) ^ this.f35629b) * 1000003) ^ this.f35630c.hashCode()) * 1000003) ^ this.f35631d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VideoSpec{qualitySelector=");
        sb2.append(this.f35628a);
        sb2.append(", encodeFrameRate=");
        sb2.append(this.f35629b);
        sb2.append(", bitrate=");
        sb2.append(this.f35630c);
        sb2.append(", aspectRatio=");
        return t.z.d(this.f35631d, "}", sb2);
    }
}
