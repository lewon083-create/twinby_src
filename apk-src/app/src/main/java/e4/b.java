package e4;

import ad.g1;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16047d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f16048e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f16049f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f16050g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f16051h;
    public final g1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a f16052j;

    public b(dl.d dVar, g1 g1Var, a aVar) {
        this.f16044a = (String) dVar.f15827d;
        this.f16045b = dVar.f15824a;
        this.f16046c = (String) dVar.f15828e;
        this.f16047d = dVar.f15825b;
        this.f16049f = (String) dVar.f15830g;
        this.f16050g = (String) dVar.f15831h;
        this.f16048e = dVar.f15826c;
        this.f16051h = (String) dVar.i;
        this.i = g1Var;
        this.f16052j = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f16044a.equals(bVar.f16044a) && this.f16045b == bVar.f16045b && this.f16046c.equals(bVar.f16046c) && this.f16047d == bVar.f16047d && this.f16048e == bVar.f16048e) {
                g1 g1Var = bVar.i;
                g1 g1Var2 = this.i;
                g1Var2.getClass();
                if (ad.q.f(g1Var, g1Var2) && this.f16052j.equals(bVar.f16052j) && Objects.equals(this.f16049f, bVar.f16049f) && Objects.equals(this.f16050g, bVar.f16050g) && Objects.equals(this.f16051h, bVar.f16051h)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f16052j.hashCode() + ((this.i.hashCode() + ((((gf.a.e((gf.a.e(217, 31, this.f16044a) + this.f16045b) * 31, 31, this.f16046c) + this.f16047d) * 31) + this.f16048e) * 31)) * 31)) * 31;
        String str = this.f16049f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f16050g;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f16051h;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}
