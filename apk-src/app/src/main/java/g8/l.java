package g8;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ii.g f20046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f20047b;

    public l(ii.g gVar) {
        this.f20046a = gVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.location.PROVIDERS_CHANGED".equals(intent.getAction())) {
            LocationManager locationManager = (LocationManager) context.getSystemService("location");
            boolean zIsProviderEnabled = locationManager.isProviderEnabled("gps");
            boolean zIsProviderEnabled2 = locationManager.isProviderEnabled("network");
            ii.g gVar = this.f20046a;
            if (zIsProviderEnabled || zIsProviderEnabled2) {
                int i = this.f20047b;
                if (i == 0 || i == 1) {
                    this.f20047b = 2;
                    gVar.b(1);
                    return;
                }
                return;
            }
            int i10 = this.f20047b;
            if (i10 == 0 || i10 == 2) {
                this.f20047b = 1;
                gVar.b(0);
            }
        }
    }
}
