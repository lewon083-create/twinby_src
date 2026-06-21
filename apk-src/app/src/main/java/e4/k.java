package e4;

import ad.g1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j3.o f16140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g1 f16141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f16142e;

    public k(j3.o oVar, int i, int i10, g1 g1Var, String str) {
        this.f16138a = i;
        this.f16139b = i10;
        this.f16140c = oVar;
        this.f16141d = g1.a(g1Var);
        this.f16142e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            if (this.f16138a == kVar.f16138a && this.f16139b == kVar.f16139b && this.f16140c.equals(kVar.f16140c)) {
                g1 g1Var = kVar.f16141d;
                g1 g1Var2 = this.f16141d;
                g1Var2.getClass();
                if (ad.q.f(g1Var, g1Var2) && this.f16142e.equals(kVar.f16142e)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f16142e.hashCode() + ((this.f16141d.hashCode() + ((this.f16140c.hashCode() + ((((217 + this.f16138a) * 31) + this.f16139b) * 31)) * 31)) * 31);
    }
}
