package ti;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import q9.i3;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f33812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f33813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f33814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f33815e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f33816f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f33817g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f33818h;
    public final String i;

    public f(k9.k kVar) {
        i3 i3Var = kVar.f27271a;
        this.f33811a = i3Var.f31902b;
        this.f33812b = i3Var.f31903c;
        this.f33813c = kVar.toString();
        i3 i3Var2 = kVar.f27271a;
        if (i3Var2.f31905e != null) {
            this.f33814d = new HashMap();
            for (String str : i3Var2.f31905e.keySet()) {
                this.f33814d.put(str, i3Var2.f31905e.getString(str));
            }
        } else {
            this.f33814d = new HashMap();
        }
        la.m mVar = kVar.f27272b;
        if (mVar != null) {
            this.f33815e = new e(mVar);
        }
        this.f33816f = i3Var2.f31906f;
        this.f33817g = i3Var2.f31907g;
        this.f33818h = i3Var2.f31908h;
        this.i = i3Var2.i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Objects.equals(this.f33811a, fVar.f33811a) && this.f33812b == fVar.f33812b && Objects.equals(this.f33813c, fVar.f33813c) && Objects.equals(this.f33815e, fVar.f33815e) && Objects.equals(this.f33814d, fVar.f33814d) && Objects.equals(this.f33816f, fVar.f33816f) && Objects.equals(this.f33817g, fVar.f33817g) && Objects.equals(this.f33818h, fVar.f33818h) && Objects.equals(this.i, fVar.i);
    }

    public final int hashCode() {
        return Objects.hash(this.f33811a, Long.valueOf(this.f33812b), this.f33813c, this.f33815e, this.f33816f, this.f33817g, this.f33818h, this.i);
    }

    public f(String str, long j10, String str2, Map map, e eVar, String str3, String str4, String str5, String str6) {
        this.f33811a = str;
        this.f33812b = j10;
        this.f33813c = str2;
        this.f33814d = map;
        this.f33815e = eVar;
        this.f33816f = str3;
        this.f33817g = str4;
        this.f33818h = str5;
        this.i = str6;
    }
}
