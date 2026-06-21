package j3;

import ad.b1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u0 f26401b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ad.j0 f26402a;

    static {
        ad.h0 h0Var = ad.j0.f818c;
        f26401b = new u0(b1.f768f);
        m3.z.G(0);
    }

    public u0(b1 b1Var) {
        this.f26402a = ad.j0.r(b1Var);
    }

    public final boolean a(int i) {
        int i10 = 0;
        while (true) {
            ad.j0 j0Var = this.f26402a;
            if (i10 >= j0Var.size()) {
                return false;
            }
            t0 t0Var = (t0) j0Var.get(i10);
            boolean[] zArr = t0Var.f26395e;
            int length = zArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                if (!zArr[i11]) {
                    i11++;
                } else if (t0Var.f26392b.f26353c == i) {
                    return true;
                }
            }
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u0.class != obj.getClass()) {
            return false;
        }
        return this.f26402a.equals(((u0) obj).f26402a);
    }

    public final int hashCode() {
        return this.f26402a.hashCode();
    }
}
