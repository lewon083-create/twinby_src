package q9;

import android.os.Parcel;
import com.google.android.gms.internal.ads.ug;
import com.google.android.gms.internal.ads.vg;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a0 extends ug implements b0 {
    public a0() {
        super("com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.ug
    public final boolean k4(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            z();
        } else {
            if (i != 2) {
                return false;
            }
            x1 x1Var = (x1) vg.b(parcel, x1.CREATOR);
            vg.f(parcel);
            p0(x1Var);
        }
        parcel2.writeNoException();
        return true;
    }
}
