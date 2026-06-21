package q9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.vg;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class z1 extends cb.a implements b2 {
    public z1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController", 1);
    }

    @Override // q9.b2
    public final void Z3(c2 c2Var) {
        Parcel parcelD0 = D0();
        vg.e(parcelD0, c2Var);
        L1(parcelD0, 8);
    }

    @Override // q9.b2
    public final float d() {
        throw null;
    }

    @Override // q9.b2
    public final float n() {
        throw null;
    }

    @Override // q9.b2
    public final float p() {
        throw null;
    }

    @Override // q9.b2
    public final c2 r() {
        c2 c2Var;
        Parcel parcelP1 = p1(D0(), 11);
        IBinder strongBinder = parcelP1.readStrongBinder();
        if (strongBinder == null) {
            c2Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            c2Var = iInterfaceQueryLocalInterface instanceof c2 ? (c2) iInterfaceQueryLocalInterface : new c2(strongBinder);
        }
        parcelP1.recycle();
        return c2Var;
    }
}
