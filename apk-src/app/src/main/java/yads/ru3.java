package yads;

import com.yandex.varioqub.appmetricaadapter.AppMetricaAdapter;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ru3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qg f42733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zg f42734b;

    public ru3(qg qgVar, zg zgVar) {
        this.f42733a = qgVar;
        this.f42734b = zgVar;
    }

    public final void a(String str) {
        if (this.f42734b.c()) {
            qg qgVar = this.f42733a;
            qgVar.getClass();
            try {
                AppMetricaAdapter appMetricaAdapter = qgVar.f42293a;
                if (appMetricaAdapter != null) {
                    appMetricaAdapter.setExperiments(str);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void a(Set set) {
        if (this.f42734b.c()) {
            qg qgVar = this.f42733a;
            qgVar.getClass();
            try {
                AppMetricaAdapter appMetricaAdapter = qgVar.f42293a;
                if (appMetricaAdapter != null) {
                    appMetricaAdapter.setTriggeredTestIds(set);
                }
            } catch (Throwable unused) {
                set.toString();
            }
        }
    }
}
