package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class bp0 {
    public static dp0 a() {
        dp0 dp0Var;
        dp0 dp0Var2 = dp0.f37873d;
        if (dp0Var2 != null) {
            return dp0Var2;
        }
        synchronized (dp0.f37872c) {
            dp0Var = dp0.f37873d;
            if (dp0Var == null) {
                dp0Var = new dp0();
                dp0.f37873d = dp0Var;
            }
        }
        return dp0Var;
    }
}
