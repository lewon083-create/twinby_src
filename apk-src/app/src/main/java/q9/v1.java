package q9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.fr;
import com.google.android.gms.internal.ads.vg;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class v1 extends cb.a {
    public final u1 d3(xa.b bVar, fr frVar) {
        u1 t1Var;
        Parcel parcelD0 = D0();
        vg.e(parcelD0, bVar);
        vg.e(parcelD0, frVar);
        parcelD0.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelP1 = p1(parcelD0, 1);
        IBinder strongBinder = parcelP1.readStrongBinder();
        if (strongBinder == null) {
            t1Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            t1Var = iInterfaceQueryLocalInterface instanceof u1 ? (u1) iInterfaceQueryLocalInterface : new t1(strongBinder);
        }
        parcelP1.recycle();
        return t1Var;
    }
}
