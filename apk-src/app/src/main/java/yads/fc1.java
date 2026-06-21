package yads;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class fc1 extends po {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Context f38413w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ap2 f38414x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Map f38415y;

    public fc1(Context context, String str, ap2 ap2Var, Map map, e71 e71Var) {
        super(context, str, e71Var);
        this.f38413w = context;
        this.f38414x = ap2Var;
        this.f38415y = map;
    }

    @Override // yads.po, yads.ro2
    public final lm3 a(lm3 lm3Var) {
        return lm3Var;
    }

    @Override // yads.ro2
    public final Map d() {
        HashMap map = new HashMap();
        pt2 pt2VarA = fw2.a().a(this.f38413w);
        if (pt2VarA != null && pt2VarA.f42065z) {
            v11 v11Var = v11.f43824c;
            map.put("encrypted-request", "1");
        }
        map.putAll(this.f38415y);
        return map;
    }

    @Override // yads.ro2
    public final xp2 a(h82 h82Var) {
        if (200 != h82Var.f39069a) {
            return new xp2(new h4(m4.f40773e, h82Var));
        }
        j80 j80Var = (j80) this.f38414x.a(h82Var);
        return j80Var != null ? new xp2(j80Var, w11.a(h82Var)) : new xp2(new h4(m4.f40771c, h82Var));
    }
}
