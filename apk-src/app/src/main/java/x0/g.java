package x0;

import android.util.Size;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g f35584e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g f35585f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g f35586g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final g f35587h;
    public static final g i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final g f35588j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final g f35589k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final HashSet f35590l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final List f35591m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f35593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f35594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f35595d;

    static {
        g gVar = new g(4, 2002, "SD", Collections.unmodifiableList(Arrays.asList(new Size(720, 480), new Size(640, 480))));
        f35584e = gVar;
        g gVar2 = new g(5, 2003, "HD", Collections.singletonList(new Size(1280, 720)));
        f35585f = gVar2;
        g gVar3 = new g(6, 2004, "FHD", Collections.singletonList(new Size(1920, 1080)));
        f35586g = gVar3;
        g gVar4 = new g(8, 2005, "UHD", Collections.singletonList(new Size(3840, 2160)));
        f35587h = gVar4;
        List list = Collections.EMPTY_LIST;
        g gVar5 = new g(0, 2000, "LOWEST", list);
        i = gVar5;
        g gVar6 = new g(1, 2001, "HIGHEST", list);
        f35588j = gVar6;
        f35589k = new g(-1, -1, "NONE", list);
        f35590l = new HashSet(Arrays.asList(gVar5, gVar6, gVar, gVar2, gVar3, gVar4));
        f35591m = Arrays.asList(gVar4, gVar3, gVar2, gVar);
    }

    public g(int i10, int i11, String str, List list) {
        this.f35592a = i10;
        this.f35593b = i11;
        this.f35594c = str;
        if (list == null) {
            throw new NullPointerException("Null typicalSizes");
        }
        this.f35595d = list;
    }

    public final int a(int i10) {
        if (i10 == 1) {
            return this.f35592a;
        }
        if (i10 == 2) {
            return this.f35593b;
        }
        throw new AssertionError(l7.o.i(i10, "Unknown quality source: "));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f35592a == gVar.f35592a && this.f35593b == gVar.f35593b && this.f35594c.equals(gVar.f35594c) && this.f35595d.equals(gVar.f35595d);
    }

    public final int hashCode() {
        return ((((((this.f35592a ^ 1000003) * 1000003) ^ this.f35593b) * 1000003) ^ this.f35594c.hashCode()) * 1000003) ^ this.f35595d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ConstantQuality{value=");
        sb2.append(this.f35592a);
        sb2.append(", highSpeedValue=");
        sb2.append(this.f35593b);
        sb2.append(", name=");
        sb2.append(this.f35594c);
        sb2.append(", typicalSizes=");
        return t.z.h(sb2, this.f35595d, "}");
    }
}
