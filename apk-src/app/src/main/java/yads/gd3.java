package yads;

import android.content.Context;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class gd3 extends y73 {
    public final hy2 C;
    public final dy2 D;
    public final lc3 E;

    public gd3(Context context, d4 d4Var, ct1 ct1Var, String str, tm3 tm3Var, xd3 xd3Var, pp3 pp3Var, hy2 hy2Var, dy2 dy2Var, lc3 lc3Var) {
        super(context, d4Var, 0, str, tm3Var, xd3Var, pp3Var, null, ct1Var, 1664);
        this.C = hy2Var;
        this.D = dy2Var;
        this.E = lc3Var;
    }

    @Override // yads.y73
    public final xp2 a(h82 h82Var, int i) {
        Map mapD = h82Var.f39071c;
        if (mapD == null) {
            mapD = kotlin.collections.j0.d();
        }
        this.D.a(mapD);
        hc3 hc3VarA = this.E.a(h82Var);
        if (hc3VarA == null) {
            return new xp2(new nb2("Can't parse VAST response."));
        }
        List list = hc3VarA.f39129a.f37336b;
        return list.isEmpty() ? new xp2(new am0()) : new xp2(list, null);
    }

    @Override // yads.y73, yads.ro2
    public final Map d() {
        jj.i builder = new jj.i();
        String strA = ((iy2) this.C).a();
        if (strA != null) {
        }
        builder.putAll(super.d());
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.b();
    }
}
