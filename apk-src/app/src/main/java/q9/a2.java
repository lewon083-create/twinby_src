package q9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.ug;
import com.google.android.gms.internal.ads.vg;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a2 extends ug implements b2 {
    public a2() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    public static b2 l4(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        return iInterfaceQueryLocalInterface instanceof b2 ? (b2) iInterfaceQueryLocalInterface : new z1(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.ug
    public final boolean k4(int i, Parcel parcel, Parcel parcel2) {
        c2 c2Var;
        switch (i) {
            case 1:
                i();
                parcel2.writeNoException();
                return true;
            case 2:
                c();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zA = vg.a(parcel);
                vg.f(parcel);
                u0(zA);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zM = m();
                parcel2.writeNoException();
                ClassLoader classLoader = vg.f11374a;
                parcel2.writeInt(zM ? 1 : 0);
                return true;
            case 5:
                int iF = f();
                parcel2.writeNoException();
                parcel2.writeInt(iF);
                return true;
            case 6:
                float fD = d();
                parcel2.writeNoException();
                parcel2.writeFloat(fD);
                return true;
            case 7:
                float fN = n();
                parcel2.writeNoException();
                parcel2.writeFloat(fN);
                return true;
            case 8:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    c2Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
                    c2Var = iInterfaceQueryLocalInterface instanceof c2 ? (c2) iInterfaceQueryLocalInterface : new c2(strongBinder);
                }
                vg.f(parcel);
                Z3(c2Var);
                parcel2.writeNoException();
                return true;
            case 9:
                float fP = p();
                parcel2.writeNoException();
                parcel2.writeFloat(fP);
                return true;
            case 10:
                boolean zQ = q();
                parcel2.writeNoException();
                ClassLoader classLoader2 = vg.f11374a;
                parcel2.writeInt(zQ ? 1 : 0);
                return true;
            case 11:
                c2 c2VarR = r();
                parcel2.writeNoException();
                vg.e(parcel2, c2VarR);
                return true;
            case 12:
                boolean zS = s();
                parcel2.writeNoException();
                ClassLoader classLoader3 = vg.f11374a;
                parcel2.writeInt(zS ? 1 : 0);
                return true;
            case 13:
                y();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
