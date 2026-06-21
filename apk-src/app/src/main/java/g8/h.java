package g8;

import android.app.Activity;
import android.content.Context;
import android.location.LocationManager;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public interface h {
    static boolean b(Context context) {
        LocationManager locationManager = (LocationManager) context.getSystemService("location");
        return locationManager.isProviderEnabled("gps") || locationManager.isProviderEnabled("network");
    }

    void a(e8.e eVar, e8.e eVar2);

    void c(Activity activity, p pVar, f8.a aVar);

    boolean d(int i, int i10);

    void e();

    void f(b bVar);
}
