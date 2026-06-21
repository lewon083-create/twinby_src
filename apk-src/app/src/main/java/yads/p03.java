package yads;

import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class p03 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashSet f41795b = new HashSet(kotlin.collections.s.f(j63.f39736c, j63.f39735b));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l63 f41796a;

    public /* synthetic */ p03() {
        this(new l63(f41795b));
    }

    public final jg3 a(b20 b20Var) {
        int i = b20Var.i;
        q03 q03Var = b20Var.f36903g;
        if (q03Var == null) {
            return null;
        }
        ad3 ad3VarA = this.f41796a.a(q03Var.f42132a);
        if (ad3VarA == null) {
            return null;
        }
        float f10 = ad3VarA.f36693c;
        if (zc3.f45373c == ad3VarA.f36692b) {
            f10 = (long) ((f10 / 100) * i);
        }
        return new jg3((long) Math.min(f10, i));
    }

    public p03(l63 l63Var) {
        this.f41796a = l63Var;
    }
}
