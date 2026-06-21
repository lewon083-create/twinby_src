package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class pg1 {
    public static qg1 a() {
        qg1 qg1Var;
        qg1 qg1Var2 = qg1.f42295e;
        if (qg1Var2 != null) {
            return qg1Var2;
        }
        synchronized (qg1.f42294d) {
            qg1Var = qg1.f42295e;
            if (qg1Var == null) {
                qg1Var = new qg1(new gy1(gy1.f38942c));
                qg1.f42295e = qg1Var;
            }
        }
        return qg1Var;
    }
}
