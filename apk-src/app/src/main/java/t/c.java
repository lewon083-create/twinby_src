package t;

import android.util.Size;
import g0.x2;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f32961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g0.h2 f32962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x2 f32963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Size f32964e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g0.n f32965f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f32966g;

    public c(String str, Class cls, g0.h2 h2Var, x2 x2Var, Size size, g0.n nVar, ArrayList arrayList) {
        if (str == null) {
            throw new NullPointerException("Null useCaseId");
        }
        this.f32960a = str;
        this.f32961b = cls;
        if (h2Var == null) {
            throw new NullPointerException("Null sessionConfig");
        }
        this.f32962c = h2Var;
        if (x2Var == null) {
            throw new NullPointerException("Null useCaseConfig");
        }
        this.f32963d = x2Var;
        this.f32964e = size;
        this.f32965f = nVar;
        this.f32966g = arrayList;
    }

    public final boolean equals(Object obj) {
        Size size;
        g0.n nVar;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            List list2 = cVar.f32966g;
            g0.n nVar2 = cVar.f32965f;
            Size size2 = cVar.f32964e;
            if (this.f32960a.equals(cVar.f32960a) && this.f32961b.equals(cVar.f32961b) && this.f32962c.equals(cVar.f32962c) && this.f32963d.equals(cVar.f32963d) && ((size = this.f32964e) != null ? size.equals(size2) : size2 == null) && ((nVar = this.f32965f) != null ? nVar.equals(nVar2) : nVar2 == null) && ((list = this.f32966g) != null ? list.equals(list2) : list2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f32960a.hashCode() ^ 1000003) * 1000003) ^ this.f32961b.hashCode()) * 1000003) ^ this.f32962c.hashCode()) * 1000003) ^ this.f32963d.hashCode()) * 1000003;
        Size size = this.f32964e;
        int iHashCode2 = (iHashCode ^ (size == null ? 0 : size.hashCode())) * 1000003;
        g0.n nVar = this.f32965f;
        int iHashCode3 = (iHashCode2 ^ (nVar == null ? 0 : nVar.hashCode())) * 1000003;
        List list = this.f32966g;
        return iHashCode3 ^ (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UseCaseInfo{useCaseId=");
        sb2.append(this.f32960a);
        sb2.append(", useCaseType=");
        sb2.append(this.f32961b);
        sb2.append(", sessionConfig=");
        sb2.append(this.f32962c);
        sb2.append(", useCaseConfig=");
        sb2.append(this.f32963d);
        sb2.append(", surfaceResolution=");
        sb2.append(this.f32964e);
        sb2.append(", streamSpec=");
        sb2.append(this.f32965f);
        sb2.append(", captureTypes=");
        return z.h(sb2, this.f32966g, "}");
    }
}
