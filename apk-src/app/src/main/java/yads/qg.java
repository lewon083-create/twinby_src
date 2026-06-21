package yads;

import android.content.Context;
import com.yandex.varioqub.appmetricaadapter.AppMetricaAdapter;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class qg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppMetricaAdapter f42293a;

    public qg(Context context, zg zgVar) {
        AppMetricaAdapter appMetricaAdapter = null;
        if (zgVar.c()) {
            try {
                appMetricaAdapter = new AppMetricaAdapter(context);
            } catch (Throwable th2) {
                th2.toString();
            }
        }
        this.f42293a = appMetricaAdapter;
    }
}
