package yads;

import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class r83 implements xq {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r83 f42518c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r51 f42519b;

    static {
        o51 o51Var = r51.f42498c;
        f42518c = new r83(um2.f43723f);
    }

    public r83(r51 r51Var) {
        this.f42519b = r51.a((Collection) r51Var);
    }

    public final boolean a(int i) {
        for (int i10 = 0; i10 < this.f42519b.size(); i10++) {
            q83 q83Var = (q83) this.f42519b.get(i10);
            if (q83Var.b() && q83Var.a() == i) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r83.class != obj.getClass()) {
            return false;
        }
        return this.f42519b.equals(((r83) obj).f42519b);
    }

    public final int hashCode() {
        return this.f42519b.hashCode();
    }
}
