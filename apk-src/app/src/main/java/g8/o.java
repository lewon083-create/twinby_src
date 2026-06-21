package g8;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.location.OnNmeaMessageListener;
import android.os.Bundle;
import android.os.Handler;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Calendar;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocationManager f20051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f20052c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f20055f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f20056g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public double f20057h;
    public Calendar i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f20058j = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f20053d = new OnNmeaMessageListener() { // from class: g8.m
        @Override // android.location.OnNmeaMessageListener
        public final void onNmeaMessage(String str, long j10) {
            o oVar = this.f20048a;
            oVar.getClass();
            if (str.trim().matches("^\\$..GGA.*$")) {
                oVar.f20055f = str;
                oVar.i = Calendar.getInstance();
            }
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n f20054e = new n(this);

    /* JADX WARN: Type inference failed for: r2v3, types: [g8.m] */
    public o(Context context, k kVar) {
        this.f20050a = context;
        this.f20052c = kVar;
        this.f20051b = (LocationManager) context.getSystemService("location");
    }

    public final void a(Location location) {
        k kVar;
        if (location == null) {
            return;
        }
        if (location.getExtras() == null) {
            location.setExtras(Bundle.EMPTY);
        }
        location.getExtras().putDouble("geolocator_mslSatelliteCount", this.f20056g);
        location.getExtras().putDouble("geolocator_mslSatellitesUsedInFix", this.f20057h);
        if (this.f20055f == null || (kVar = this.f20052c) == null || !this.f20058j) {
            return;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.add(13, -5);
        Calendar calendar2 = this.i;
        if ((calendar2 == null || !calendar2.before(calendar)) && kVar.f20045d) {
            String[] strArrSplit = this.f20055f.split(StringUtils.COMMA);
            String str = strArrSplit[0];
            if (!this.f20055f.trim().matches("^\\$..GGA.*$") || strArrSplit.length <= 9 || strArrSplit[9].isEmpty()) {
                return;
            }
            double d10 = Double.parseDouble(strArrSplit[9]);
            if (location.getExtras() == null) {
                location.setExtras(Bundle.EMPTY);
            }
            location.getExtras().putDouble("geolocator_mslAltitude", d10);
        }
    }

    public final void b() {
        LocationManager locationManager;
        if (this.f20058j || this.f20052c == null || (locationManager = this.f20051b) == null || this.f20050a.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") != 0) {
            return;
        }
        locationManager.addNmeaListener(this.f20053d, (Handler) null);
        locationManager.registerGnssStatusCallback(this.f20054e, (Handler) null);
        this.f20058j = true;
    }
}
