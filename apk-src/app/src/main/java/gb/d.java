package gb;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends cb.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f20068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sb.g f20069d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(int i, sb.g gVar) {
        super("com.google.android.gms.location.internal.ISettingsCallbacks", 5);
        this.f20068c = i;
        switch (i) {
            case 1:
                this.f20069d = gVar;
                super("com.google.android.gms.location.internal.ILocationStatusCallback", 5);
                break;
            default:
                this.f20069d = gVar;
                break;
        }
    }

    @Override // cb.c
    public final boolean p1(Parcel parcel, int i) {
        switch (this.f20068c) {
            case 0:
                if (i == 1) {
                    kb.g gVar = (kb.g) b.a(parcel, kb.g.CREATOR);
                    b.c(parcel);
                    Status status = gVar.f27337b;
                    kb.f fVar = new kb.f();
                    fVar.f27336a = gVar;
                    a.a.o(status, fVar, this.f20069d);
                }
                break;
            default:
                if (i == 1) {
                    Status status2 = (Status) b.a(parcel, Status.CREATOR);
                    Location location = (Location) b.a(parcel, Location.CREATOR);
                    b.c(parcel);
                    a.a.o(status2, location, this.f20069d);
                }
                break;
        }
        return true;
    }
}
