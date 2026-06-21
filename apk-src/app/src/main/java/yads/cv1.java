package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class cv1 {
    public static dv1 a() {
        dv1 dv1Var;
        dv1 dv1Var2 = dv1.f37897b;
        if (dv1Var2 != null) {
            return dv1Var2;
        }
        synchronized (dv1.f37898c) {
            dv1Var = dv1.f37897b;
            if (dv1Var == null) {
                dv1Var = new dv1();
                dv1.f37897b = dv1Var;
            }
        }
        return dv1Var;
    }
}
