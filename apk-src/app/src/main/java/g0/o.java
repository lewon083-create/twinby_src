package g0;

import android.util.Size;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Size f19695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f19696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Size f19697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f19698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Size f19699e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f19700f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f19701g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f19702h;
    public final HashMap i;

    public o(Size size, HashMap map, Size size2, HashMap map2, Size size3, HashMap map3, HashMap map4, HashMap map5, HashMap map6) {
        if (size == null) {
            throw new NullPointerException("Null analysisSize");
        }
        this.f19695a = size;
        this.f19696b = map;
        if (size2 == null) {
            throw new NullPointerException("Null previewSize");
        }
        this.f19697c = size2;
        this.f19698d = map2;
        if (size3 == null) {
            throw new NullPointerException("Null recordSize");
        }
        this.f19699e = size3;
        this.f19700f = map3;
        this.f19701g = map4;
        this.f19702h = map5;
        this.i = map6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f19695a.equals(oVar.f19695a) && this.f19696b.equals(oVar.f19696b) && this.f19697c.equals(oVar.f19697c) && this.f19698d.equals(oVar.f19698d) && this.f19699e.equals(oVar.f19699e) && this.f19700f.equals(oVar.f19700f) && this.f19701g.equals(oVar.f19701g) && this.f19702h.equals(oVar.f19702h) && this.i.equals(oVar.i);
    }

    public final int hashCode() {
        return ((((((((((((((((this.f19695a.hashCode() ^ 1000003) * 1000003) ^ this.f19696b.hashCode()) * 1000003) ^ this.f19697c.hashCode()) * 1000003) ^ this.f19698d.hashCode()) * 1000003) ^ this.f19699e.hashCode()) * 1000003) ^ this.f19700f.hashCode()) * 1000003) ^ this.f19701g.hashCode()) * 1000003) ^ this.f19702h.hashCode()) * 1000003) ^ this.i.hashCode();
    }

    public final String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.f19695a + ", s720pSizeMap=" + this.f19696b + ", previewSize=" + this.f19697c + ", s1440pSizeMap=" + this.f19698d + ", recordSize=" + this.f19699e + ", maximumSizeMap=" + this.f19700f + ", maximum4x3SizeMap=" + this.f19701g + ", maximum16x9SizeMap=" + this.f19702h + ", ultraMaximumSizeMap=" + this.i + "}";
    }
}
