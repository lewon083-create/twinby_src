package gb;

import a0.b1;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.i4;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends cb.c implements kb.n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f20073d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i4 f20074c;

    public g(i4 i4Var) {
        super("com.google.android.gms.location.ILocationCallback", 5);
        this.f20074c = i4Var;
    }

    public final void c() {
        this.f20074c.n().a(new a7.l(17, this));
    }

    @Override // cb.c
    public final boolean p1(Parcel parcel, int i) {
        i4 i4Var = this.f20074c;
        if (i == 1) {
            LocationResult locationResult = (LocationResult) b.a(parcel, LocationResult.CREATOR);
            b.c(parcel);
            i4Var.n().a(new v7.f(15, locationResult));
            return true;
        }
        if (i != 2) {
            if (i != 3) {
                return false;
            }
            c();
            return true;
        }
        LocationAvailability locationAvailability = (LocationAvailability) b.a(parcel, LocationAvailability.CREATOR);
        b.c(parcel);
        i4Var.n().a(new b1(12, locationAvailability));
        return true;
    }
}
