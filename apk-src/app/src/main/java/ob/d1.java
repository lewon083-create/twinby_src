package ob;

import com.google.android.gms.internal.measurement.k4;
import com.google.android.gms.internal.measurement.x5;
import io.sentry.SentryLockReason;
import io.sentry.protocol.App;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d1 implements Callable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f30056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e1 f30057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f30058d;

    public /* synthetic */ d1(e1 e1Var, String str, int i) {
        this.f30056b = i;
        this.f30057c = e1Var;
        this.f30058d = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f30056b) {
            case 0:
                return new k4(new d1(this.f30057c, this.f30058d, 1));
            case 1:
                e1 e1Var = this.f30057c;
                n nVar = e1Var.f30373c.f30607d;
                z3.T(nVar);
                String str = this.f30058d;
                w0 w0VarE0 = nVar.E0(str);
                HashMap map = new HashMap();
                map.put("platform", "android");
                map.put(SentryLockReason.JsonKeys.PACKAGE_NAME, str);
                ((l1) e1Var.f15951b).f30263e.H();
                map.put("gmp_version", 133005L);
                if (w0VarE0 != null) {
                    String strN = w0VarE0.N();
                    if (strN != null) {
                        map.put(App.JsonKeys.APP_VERSION, strN);
                    }
                    map.put("app_version_int", Long.valueOf(w0VarE0.P()));
                    map.put("dynamite_version", Long.valueOf(w0VarE0.b()));
                }
                return map;
            default:
                l6.i iVar = new l6.i(13, this.f30057c, this.f30058d, false);
                x5 x5Var = new x5("internal.remoteConfig", 0);
                x5Var.f13769c.put("getValue", new k4(x5Var, iVar));
                return x5Var;
        }
    }
}
