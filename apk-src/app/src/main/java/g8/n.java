package g8;

import android.location.GnssStatus;
import com.yandex.varioqub.config.model.ConfigValue;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends GnssStatus.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f20049a;

    public n(o oVar) {
        this.f20049a = oVar;
    }

    @Override // android.location.GnssStatus.Callback
    public final void onSatelliteStatusChanged(GnssStatus gnssStatus) {
        double satelliteCount = gnssStatus.getSatelliteCount();
        o oVar = this.f20049a;
        oVar.f20056g = satelliteCount;
        oVar.f20057h = ConfigValue.DOUBLE_DEFAULT_VALUE;
        for (int i = 0; i < oVar.f20056g; i++) {
            if (gnssStatus.usedInFix(i)) {
                oVar.f20057h += 1.0d;
            }
        }
    }
}
