package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class kt extends ug implements lt {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f7292b = 0;

    public kt() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // com.google.android.gms.internal.ads.ug
    public final boolean k4(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                Bundle bundle = (Bundle) vg.b(parcel, Bundle.CREATOR);
                vg.f(parcel);
                T3(bundle);
                parcel2.writeNoException();
                return true;
            case 2:
                f();
                parcel2.writeNoException();
                return true;
            case 3:
                d();
                parcel2.writeNoException();
                return true;
            case 4:
                n();
                parcel2.writeNoException();
                return true;
            case 5:
                e();
                parcel2.writeNoException();
                return true;
            case 6:
                Bundle bundle2 = (Bundle) vg.b(parcel, Bundle.CREATOR);
                vg.f(parcel);
                W(bundle2);
                parcel2.writeNoException();
                vg.d(parcel2, bundle2);
                return true;
            case 7:
                K();
                parcel2.writeNoException();
                return true;
            case 8:
                y();
                parcel2.writeNoException();
                return true;
            case 9:
                v();
                parcel2.writeNoException();
                return true;
            case 10:
                i();
                parcel2.writeNoException();
                return true;
            case 11:
                boolean zK = k();
                parcel2.writeNoException();
                ClassLoader classLoader = vg.f11374a;
                parcel2.writeInt(zK ? 1 : 0);
                return true;
            case 12:
                int i10 = parcel.readInt();
                int i11 = parcel.readInt();
                Intent intent = (Intent) vg.b(parcel, Intent.CREATOR);
                vg.f(parcel);
                s1(i10, i11, intent);
                parcel2.writeNoException();
                return true;
            case 13:
                xa.a aVarL1 = xa.b.L1(parcel.readStrongBinder());
                vg.f(parcel);
                L(aVarL1);
                parcel2.writeNoException();
                return true;
            case 14:
                c();
                parcel2.writeNoException();
                return true;
            case 15:
                int i12 = parcel.readInt();
                String[] strArrCreateStringArray = parcel.createStringArray();
                int[] iArrCreateIntArray = parcel.createIntArray();
                vg.f(parcel);
                k1(i12, strArrCreateStringArray, iArrCreateIntArray);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
