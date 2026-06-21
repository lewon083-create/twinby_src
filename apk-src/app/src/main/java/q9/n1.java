package q9;

import android.os.Parcel;
import com.google.android.gms.internal.ads.ug;
import com.google.android.gms.internal.ads.vg;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n1 extends ug implements o1 {
    public n1() {
        super("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
    }

    @Override // com.google.android.gms.internal.ads.ug
    public final boolean k4(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        x1 x1Var = (x1) vg.b(parcel, x1.CREATOR);
        vg.f(parcel);
        j0(x1Var);
        parcel2.writeNoException();
        return true;
    }
}
