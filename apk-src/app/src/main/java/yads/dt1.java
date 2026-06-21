package yads;

import android.content.Context;
import com.yandex.varioqub.appmetricaadapter.AppMetricaAdapter;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class dt1 extends kotlin.jvm.internal.r implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bc3 f37884b = su3.f43085a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f37885c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dt1(Context context) {
        super(0);
        this.f37885c = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ru3 ru3Var;
        bc3 bc3Var = this.f37884b;
        Context context = this.f37885c;
        ((su3) bc3Var).getClass();
        ru3 ru3Var2 = su3.f43087c;
        if (ru3Var2 != null) {
            return ru3Var2;
        }
        synchronized (su3.f43086b) {
            try {
                ru3Var = su3.f43087c;
                if (ru3Var == null) {
                    String str = ub.a(context) ? "322a737a-a0ca-44e0-bc85-649b1c7c1db6" : "478cb909-6ad1-4e12-84cc-b3629a789f93";
                    qg qgVar = new qg(context, new zg(context));
                    try {
                        AppMetricaAdapter appMetricaAdapter = qgVar.f42293a;
                        if (appMetricaAdapter != null) {
                            appMetricaAdapter.f15320b.a(appMetricaAdapter.f15319a, str);
                        }
                    } catch (Throwable unused) {
                    }
                    ru3Var = new ru3(qgVar, new zg(context));
                    su3.f43087c = ru3Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return ru3Var;
    }
}
