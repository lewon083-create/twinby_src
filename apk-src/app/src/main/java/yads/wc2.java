package yads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class wc2 {
    public final yc2 a(Context context) {
        yc2 yc2Var;
        yc2 yc2Var2 = yc2.i;
        if (yc2Var2 != null) {
            return yc2Var2;
        }
        synchronized (this) {
            Context applicationContext = context.getApplicationContext();
            Executor executorA = pg1.a().a();
            yc2Var = yc2.i;
            if (yc2Var == null) {
                yc2 yc2Var3 = new yc2(applicationContext, executorA, fw2.a(), new vc2(applicationContext.getApplicationContext()), new uc2());
                yc2.i = yc2Var3;
                yc2Var = yc2Var3;
            }
        }
        return yc2Var;
    }
}
