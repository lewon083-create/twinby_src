package e8;

import android.location.Location;
import com.baseflow.geolocator.GeolocatorLocationService;
import com.google.android.gms.internal.ads.om1;
import com.google.android.gms.internal.measurement.h5;
import g8.p;
import ii.g;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements p, f8.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f16278c;

    public /* synthetic */ a(g gVar, int i) {
        this.f16277b = i;
        this.f16278c = gVar;
    }

    @Override // g8.p
    public void a(Location location) {
        int i = this.f16277b;
        g gVar = this.f16278c;
        switch (i) {
            case 0:
                int i10 = GeolocatorLocationService.f2483l;
                gVar.b(h5.F(location));
                break;
            default:
                gVar.b(h5.F(location));
                break;
        }
    }

    @Override // f8.a
    public void onError(int i) {
        int i10 = this.f16277b;
        g gVar = this.f16278c;
        switch (i10) {
            case 1:
                int i11 = GeolocatorLocationService.f2483l;
                gVar.a(om1.b(i), om1.a(i));
                break;
            default:
                gVar.a(om1.b(i), om1.a(i));
                break;
        }
    }
}
