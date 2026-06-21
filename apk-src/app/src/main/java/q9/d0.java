package q9;

import android.os.Parcel;
import com.google.android.gms.internal.ads.ug;
import com.google.android.gms.internal.ads.vg;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d0 extends ug implements e0 {
    public d0() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.ug
    public final boolean k4(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            d3 d3Var = (d3) vg.b(parcel, d3.CREATOR);
            vg.f(parcel);
            X(d3Var);
            parcel2.writeNoException();
            return true;
        }
        if (i == 2) {
            String strC = c();
            parcel2.writeNoException();
            parcel2.writeString(strC);
            return true;
        }
        if (i == 3) {
            boolean zK = k();
            parcel2.writeNoException();
            ClassLoader classLoader = vg.f11374a;
            parcel2.writeInt(zK ? 1 : 0);
            return true;
        }
        if (i == 4) {
            String strM = m();
            parcel2.writeNoException();
            parcel2.writeString(strM);
            return true;
        }
        if (i != 5) {
            return false;
        }
        d3 d3Var2 = (d3) vg.b(parcel, d3.CREATOR);
        int i10 = parcel.readInt();
        vg.f(parcel);
        B0(d3Var2, i10);
        parcel2.writeNoException();
        return true;
    }
}
