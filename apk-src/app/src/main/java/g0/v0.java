package g0;

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public interface v0 {
    static u1 l(v0 v0Var, v0 v0Var2) {
        if (v0Var == null && v0Var2 == null) {
            return u1.N;
        }
        q1 q1VarW = v0Var2 != null ? q1.w(v0Var2) : q1.v();
        if (v0Var != null) {
            Iterator it = v0Var.d().iterator();
            while (it.hasNext()) {
                t(q1VarW, v0Var2, v0Var, (g) it.next());
            }
        }
        return u1.u(q1VarW);
    }

    static void t(q1 q1Var, v0 v0Var, v0 v0Var2, g gVar) {
        if (!Objects.equals(gVar, i1.f19612q)) {
            q1Var.x(gVar, v0Var2.c(gVar), v0Var2.a(gVar));
            return;
        }
        t0.b bVar = (t0.b) v0Var2.g(gVar, null);
        t0.b bVar2 = (t0.b) v0Var.g(gVar, null);
        u0 u0VarC = v0Var2.c(gVar);
        if (bVar == null) {
            bVar = bVar2;
        } else if (bVar2 != null) {
            t0.a aVar = bVar2.f33335a;
            t0.c cVar = bVar2.f33336b;
            ni.j1 j1Var = bVar2.f33337c;
            t0.a aVar2 = bVar.f33335a;
            if (aVar2 != null) {
                aVar = aVar2;
            }
            t0.c cVar2 = bVar.f33336b;
            if (cVar2 != null) {
                cVar = cVar2;
            }
            ni.j1 j1Var2 = bVar.f33337c;
            if (j1Var2 != null) {
                j1Var = j1Var2;
            }
            bVar = new t0.b(aVar, cVar, j1Var);
        }
        q1Var.x(gVar, u0VarC, bVar);
    }

    Object a(g gVar);

    Object b(g gVar, u0 u0Var);

    u0 c(g gVar);

    Set d();

    Set e(g gVar);

    void f(oi.i iVar);

    Object g(g gVar, Object obj);

    boolean h(g gVar);
}
