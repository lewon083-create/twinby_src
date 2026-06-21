package yads;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class du2 extends po {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Context f37886w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ap2 f37887x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Map f37888y;

    public du2(Context context, String str, eu2 eu2Var, Map map, fu2 fu2Var, fu2 fu2Var2) {
        super(context, 0, str, fu2Var2, fu2Var);
        this.f37886w = context;
        this.f37887x = eu2Var;
        this.f37888y = map;
        l();
        m();
    }

    @Override // yads.po, yads.ro2
    public final lm3 a(lm3 lm3Var) {
        m4 m4Var;
        int i = h4.f39016d;
        h82 h82Var = lm3Var.f40609b;
        Integer numValueOf = h82Var != null ? Integer.valueOf(h82Var.f39069a) : null;
        if (numValueOf == null) {
            m4Var = lm3Var instanceof d92 ? m4.f40779l : lm3Var instanceof y63 ? m4.f40780m : lm3Var instanceof pl ? m4.f40781n : lm3Var instanceof ov ? m4.f40782o : lm3Var instanceof ob2 ? m4.f40783p : m4.f40784q;
        } else {
            int iIntValue = numValueOf.intValue();
            m4Var = (500 > iIntValue || iIntValue > 599) ? m4.f40773e : m4.f40774f;
        }
        return new h4(m4Var, h82Var);
    }

    @Override // yads.ro2
    public final Map d() {
        HashMap map = new HashMap();
        pt2 pt2VarA = fw2.a().a(this.f37886w);
        if (pt2VarA != null && pt2VarA.f42065z) {
            v11 v11Var = v11.f43824c;
            map.put("encrypted-request", "1");
        }
        map.putAll(this.f37888y);
        return map;
    }

    @Override // yads.ro2
    public final xp2 a(h82 h82Var) {
        m4 m4Var;
        if (200 == h82Var.f39069a) {
            pt2 pt2Var = (pt2) this.f37887x.a(h82Var);
            if (pt2Var != null) {
                Map mapD = h82Var.f39071c;
                if (mapD == null) {
                    mapD = kotlin.collections.j0.d();
                }
                String strC = u01.c(mapD, v11.R);
                if (strC != null) {
                    wx2 wx2Var = xx2.f44838a;
                    Context context = this.f41968s;
                    wx2Var.getClass();
                    ((vg1) ((yx2) wx2.a(context)).f45187b).a("ServerSideClientIP", strC);
                }
                return new xp2(pt2Var, w11.a(h82Var));
            }
            m4Var = m4.f40771c;
        } else {
            m4Var = m4.f40773e;
        }
        return new xp2(new h4(m4Var, h82Var));
    }
}
