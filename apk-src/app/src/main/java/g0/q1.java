package g0;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class q1 extends u1 {
    public static q1 v() {
        return new q1(new TreeMap(u1.M));
    }

    public static q1 w(v0 v0Var) {
        TreeMap treeMap = new TreeMap(u1.M);
        for (g gVar : v0Var.d()) {
            Set<u0> setE = v0Var.e(gVar);
            ArrayMap arrayMap = new ArrayMap();
            for (u0 u0Var : setE) {
                arrayMap.put(u0Var, v0Var.b(gVar, u0Var));
            }
            treeMap.put(gVar, arrayMap);
        }
        return new q1(treeMap);
    }

    public final void x(g gVar, u0 u0Var, Object obj) {
        u0 u0Var2;
        TreeMap treeMap = this.L;
        Map map = (Map) treeMap.get(gVar);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            treeMap.put(gVar, arrayMap);
            arrayMap.put(u0Var, obj);
            return;
        }
        u0 u0Var3 = (u0) Collections.min(map.keySet());
        if (Objects.equals(map.get(u0Var3), obj) || u0Var3 != (u0Var2 = u0.f19774d) || u0Var != u0Var2) {
            map.put(u0Var, obj);
            return;
        }
        throw new IllegalArgumentException("Option values conflicts: " + gVar.f19561a + ", existing value (" + u0Var3 + ")=" + map.get(u0Var3) + ", conflicting (" + u0Var + ")=" + obj);
    }

    public final void y(g gVar, Object obj) {
        x(gVar, u0.f19775e, obj);
    }

    public final void z(g gVar) {
        this.L.remove(gVar);
    }
}
