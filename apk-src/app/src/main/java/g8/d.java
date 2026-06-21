package g8;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends kb.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f20017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f20018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f20019d;

    public d(e eVar, k kVar, Context context) {
        this.f20019d = eVar;
        this.f20017b = kVar;
        this.f20018c = context;
    }

    @Override // kb.c
    public final synchronized void onLocationAvailability(LocationAvailability locationAvailability) {
        f8.a aVar;
        if (!(locationAvailability.f14398e < 1000) && !h.b(this.f20018c) && (aVar = this.f20019d.f20026g) != null) {
            aVar.onError(3);
        }
    }

    @Override // kb.c
    public final synchronized void onLocationResult(LocationResult locationResult) {
        if (this.f20019d.f20027h == null) {
            Log.e("FlutterGeolocator", "LocationCallback was called with empty locationResult or no positionChangedCallback was registered.");
            e eVar = this.f20019d;
            eVar.f20022c.f(eVar.f20021b);
            f8.a aVar = this.f20019d.f20026g;
            if (aVar != null) {
                aVar.onError(2);
            }
            return;
        }
        List list = locationResult.f14414b;
        int size = list.size();
        Location location = size == 0 ? null : (Location) list.get(size - 1);
        if (location == null) {
            return;
        }
        if (location.getExtras() == null) {
            location.setExtras(Bundle.EMPTY);
        }
        if (this.f20017b != null) {
            location.getExtras().putBoolean("geolocator_use_mslAltitude", this.f20017b.f20045d);
        }
        this.f20019d.f20023d.a(location);
        this.f20019d.f20027h.a(location);
    }
}
