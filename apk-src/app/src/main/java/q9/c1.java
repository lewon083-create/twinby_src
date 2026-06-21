package q9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.ir;
import com.google.android.gms.internal.ads.ug;
import com.google.android.gms.internal.ads.vg;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c1 extends ug implements d1 {
    public static d1 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
        return iInterfaceQueryLocalInterface instanceof d1 ? (d1) iInterfaceQueryLocalInterface : new b1(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo", 1);
    }

    @Override // com.google.android.gms.internal.ads.ug
    public final boolean k4(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            n2 liteSdkVersion = getLiteSdkVersion();
            parcel2.writeNoException();
            vg.d(parcel2, liteSdkVersion);
            return true;
        }
        if (i != 2) {
            return false;
        }
        ir adapterCreator = getAdapterCreator();
        parcel2.writeNoException();
        vg.e(parcel2, adapterCreator);
        return true;
    }
}
