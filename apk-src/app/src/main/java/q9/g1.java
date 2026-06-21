package q9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.fr;
import com.google.android.gms.internal.ads.ir;
import com.google.android.gms.internal.ads.sp;
import com.google.android.gms.internal.ads.tp;
import com.google.android.gms.internal.ads.ug;
import com.google.android.gms.internal.ads.vg;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g1 extends ug implements h1 {
    public g1() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.ads.ug
    public final boolean k4(int i, Parcel parcel, Parcel parcel2) {
        tp spVar = null;
        o1 m1Var = null;
        switch (i) {
            case 1:
                i();
                parcel2.writeNoException();
                return true;
            case 2:
                float f10 = parcel.readFloat();
                vg.f(parcel);
                r1(f10);
                parcel2.writeNoException();
                return true;
            case 3:
                String string = parcel.readString();
                vg.f(parcel);
                f3(string);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zA = vg.a(parcel);
                vg.f(parcel);
                I(zA);
                parcel2.writeNoException();
                return true;
            case 5:
                xa.a aVarL1 = xa.b.L1(parcel.readStrongBinder());
                String string2 = parcel.readString();
                vg.f(parcel);
                s2(string2, aVarL1);
                parcel2.writeNoException();
                return true;
            case 6:
                String string3 = parcel.readString();
                xa.a aVarL12 = xa.b.L1(parcel.readStrongBinder());
                vg.f(parcel);
                Q3(string3, aVarL12);
                parcel2.writeNoException();
                return true;
            case 7:
                float fN = n();
                parcel2.writeNoException();
                parcel2.writeFloat(fN);
                return true;
            case 8:
                boolean zE = e();
                parcel2.writeNoException();
                ClassLoader classLoader = vg.f11374a;
                parcel2.writeInt(zE ? 1 : 0);
                return true;
            case 9:
                String strP = p();
                parcel2.writeNoException();
                parcel2.writeString(strP);
                return true;
            case 10:
                String string4 = parcel.readString();
                vg.f(parcel);
                f0(string4);
                parcel2.writeNoException();
                return true;
            case 11:
                ir irVarL4 = fr.l4(parcel.readStrongBinder());
                vg.f(parcel);
                K3(irVarL4);
                parcel2.writeNoException();
                return true;
            case 12:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
                    spVar = iInterfaceQueryLocalInterface instanceof tp ? (tp) iInterfaceQueryLocalInterface : new sp(strongBinder, "com.google.android.gms.ads.internal.initialization.IInitializationCallback", 1);
                }
                vg.f(parcel);
                R1(spVar);
                parcel2.writeNoException();
                return true;
            case 13:
                List listO = o();
                parcel2.writeNoException();
                parcel2.writeTypedList(listO);
                return true;
            case 14:
                y2 y2Var = (y2) vg.b(parcel, y2.CREATOR);
                vg.f(parcel);
                K0(y2Var);
                parcel2.writeNoException();
                return true;
            case 15:
                v();
                parcel2.writeNoException();
                return true;
            case 16:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                    m1Var = iInterfaceQueryLocalInterface2 instanceof o1 ? (o1) iInterfaceQueryLocalInterface2 : new m1(strongBinder2, "com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener", 1);
                }
                vg.f(parcel);
                M0(m1Var);
                parcel2.writeNoException();
                return true;
            case 17:
                boolean zA2 = vg.a(parcel);
                vg.f(parcel);
                I0(zA2);
                parcel2.writeNoException();
                return true;
            case 18:
                String string5 = parcel.readString();
                vg.f(parcel);
                a0(string5);
                parcel2.writeNoException();
                return true;
            case 19:
                b0();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
