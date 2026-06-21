package yads;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class lh3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile nj0 f40555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f40556b = new Object();

    public static nj0 a(Context context) {
        Context applicationContext = context.getApplicationContext();
        l33 l33Var = new l33(applicationContext);
        nr nrVarA = cp0.a().a(applicationContext);
        oc0 oc0Var = new oc0(applicationContext, new pu2(((o53) ne.a().f39490a).a(), es2.a().a(applicationContext)));
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(4);
        rc0 rc0Var = new rc0(l33Var, 0);
        qr qrVar = new qr();
        qrVar.f42373a = nrVarA;
        qrVar.f42376d = oc0Var;
        return new nj0(applicationContext, rc0Var, new sc0(qrVar, executorServiceNewFixedThreadPool));
    }

    public static nj0 b(Context context) {
        nj0 nj0VarA;
        nj0 nj0Var = f40555a;
        if (nj0Var != null) {
            return nj0Var;
        }
        synchronized (f40556b) {
            nj0 nj0Var2 = f40555a;
            if (nj0Var2 != null) {
                return nj0Var2;
            }
            try {
                nj0VarA = a(context);
                f40555a = nj0VarA;
            } catch (Throwable th2) {
                th2.toString();
                nj0VarA = null;
            }
            return nj0VarA;
        }
    }
}
