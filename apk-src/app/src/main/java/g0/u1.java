package g0;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class u1 implements v0 {
    public static final d2.a M;
    public static final u1 N;
    public final TreeMap L;

    static {
        d2.a aVar = new d2.a(2);
        M = aVar;
        N = new u1(new TreeMap(aVar));
    }

    public u1(TreeMap treeMap) {
        this.L = treeMap;
    }

    public static u1 u(v0 v0Var) {
        if (u1.class.equals(v0Var.getClass())) {
            return (u1) v0Var;
        }
        TreeMap treeMap = new TreeMap(M);
        for (g gVar : v0Var.d()) {
            Set<u0> setE = v0Var.e(gVar);
            ArrayMap arrayMap = new ArrayMap();
            for (u0 u0Var : setE) {
                arrayMap.put(u0Var, v0Var.b(gVar, u0Var));
            }
            treeMap.put(gVar, arrayMap);
        }
        return new u1(treeMap);
    }

    @Override // g0.v0
    public final Object a(g gVar) {
        Map map = (Map) this.L.get(gVar);
        if (map != null) {
            return map.get((u0) Collections.min(map.keySet()));
        }
        throw new IllegalArgumentException("Option does not exist: " + gVar);
    }

    @Override // g0.v0
    public final Object b(g gVar, u0 u0Var) {
        Map map = (Map) this.L.get(gVar);
        if (map == null) {
            throw new IllegalArgumentException("Option does not exist: " + gVar);
        }
        if (map.containsKey(u0Var)) {
            return map.get(u0Var);
        }
        throw new IllegalArgumentException("Option does not exist: " + gVar + " with priority=" + u0Var);
    }

    @Override // g0.v0
    public final u0 c(g gVar) {
        Map map = (Map) this.L.get(gVar);
        if (map != null) {
            return (u0) Collections.min(map.keySet());
        }
        throw new IllegalArgumentException("Option does not exist: " + gVar);
    }

    @Override // g0.v0
    public final Set d() {
        return Collections.unmodifiableSet(this.L.keySet());
    }

    @Override // g0.v0
    public final Set e(g gVar) {
        Map map = (Map) this.L.get(gVar);
        return map == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(map.keySet());
    }

    @Override // g0.v0
    public final void f(oi.i iVar) {
        for (Map.Entry entry : this.L.tailMap(new g("camera2.captureRequest.option.", Void.class, null)).entrySet()) {
            if (!((g) entry.getKey()).f19561a.startsWith("camera2.captureRequest.option.")) {
                return;
            }
            g gVar = (g) entry.getKey();
            a0.c0 c0Var = (a0.c0) iVar.f30688c;
            v0 v0Var = (v0) iVar.f30689d;
            c0Var.f50a.x(gVar, v0Var.c(gVar), v0Var.a(gVar));
        }
    }

    @Override // g0.v0
    public final Object g(g gVar, Object obj) {
        Map map = (Map) this.L.get(gVar);
        return map == null ? obj : map.get((u0) Collections.min(map.keySet()));
    }

    @Override // g0.v0
    public final boolean h(g gVar) {
        return this.L.containsKey(gVar);
    }
}
