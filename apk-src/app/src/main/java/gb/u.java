package gb;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u extends cb.c implements v {
    public u() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback", 5);
    }

    @Override // cb.c
    public final boolean p1(Parcel parcel, int i) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            i();
            return true;
        }
        s sVar = (s) b.a(parcel, s.CREATOR);
        b.c(parcel);
        V1(sVar);
        return true;
    }
}
