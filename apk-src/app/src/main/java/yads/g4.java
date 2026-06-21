package yads;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class g4 {
    public static h4 a(h82 h82Var) {
        m4 m4Var;
        int i = h82Var != null ? h82Var.f39069a : -1;
        if (204 == i) {
            m4Var = m4.f40772d;
        } else {
            Map map = h82Var != null ? h82Var.f39071c : null;
            Integer numValueOf = h82Var != null ? Integer.valueOf(h82Var.f39069a) : null;
            m4Var = (numValueOf != null && 400 == numValueOf.intValue() && map != null && u01.b(map, v11.N)) ? m4.f40776h : 403 == i ? m4.f40775g : 404 == i ? m4.f40770b : (500 > i || i > 599) ? -1 == i ? m4.f40779l : m4.f40773e : m4.f40774f;
        }
        return new h4(m4Var, h82Var);
    }
}
