package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class j30 {
    public static u30 a(no2 no2Var, String str, rl2 rl2Var, int i) {
        t30 t30Var = new t30();
        t30Var.f43166a = rl2Var.a(str);
        t30Var.f43169d = rl2Var.f42627a;
        t30Var.f43170e = rl2Var.f42628b;
        String strC = no2Var.c();
        if (strC == null) {
            strC = rl2Var.a(((uo) no2Var.f41310b.get(0)).f43742a).toString();
        }
        return t30Var.a(strC).a(i).a();
    }

    /* JADX WARN: Finally extract failed */
    public static hu a(p30 p30Var, int i, no2 no2Var) {
        nq0 tx0Var;
        p30 p30Var2;
        if (no2Var.f41313e == null) {
            return null;
        }
        nx0 nx0Var = no2Var.f41309a;
        String str = nx0Var.f41374l;
        if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm"))) {
            tx0Var = new bj1();
        } else {
            tx0Var = new tx0();
        }
        ar arVar = new ar(tx0Var, i, nx0Var);
        try {
            rl2 rl2Var = (rl2) ni.a(no2Var.f());
            rl2 rl2VarE = no2Var.e();
            if (rl2VarE != null) {
                rl2 rl2VarA = rl2Var.a(rl2VarE, ((uo) no2Var.f41310b.get(0)).f43742a);
                if (rl2VarA == null) {
                    p30Var2 = p30Var;
                    new t61(p30Var2, a(no2Var, ((uo) no2Var.f41310b.get(0)).f43742a, rl2Var, 0), no2Var.f41309a, 0, null, arVar).a();
                } else {
                    p30Var2 = p30Var;
                    rl2VarE = rl2VarA;
                }
                new t61(p30Var2, a(no2Var, ((uo) no2Var.f41310b.get(0)).f43742a, rl2VarE, 0), no2Var.f41309a, 0, null, arVar).a();
            }
            arVar.c();
            return arVar.b();
        } catch (Throwable th2) {
            arVar.c();
            throw th2;
        }
    }
}
