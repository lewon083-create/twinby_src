package q9;

import android.os.Parcel;
import com.google.android.gms.internal.ads.ug;
import com.google.android.gms.internal.ads.vg;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x extends ug implements y {
    public x() {
        super("com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // com.google.android.gms.internal.ads.ug
    public final boolean k4(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                z();
                break;
            case 2:
                int i10 = parcel.readInt();
                vg.f(parcel);
                E(i10);
                break;
            case 3:
                break;
            case 4:
                c();
                break;
            case 5:
                k();
                break;
            case 6:
                m();
                break;
            case 7:
                d();
                break;
            case 8:
                x1 x1Var = (x1) vg.b(parcel, x1.CREATOR);
                vg.f(parcel);
                d0(x1Var);
                break;
            case 9:
                f();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
