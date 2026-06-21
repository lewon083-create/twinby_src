package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class hn extends ug implements in {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f6194b = 0;

    public hn() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // com.google.android.gms.internal.ads.ug
    public final boolean k4(int i, Parcel parcel, Parcel parcel2) {
        cn bnVar;
        switch (i) {
            case 1:
                String string = parcel.readString();
                xa.a aVarL1 = xa.b.L1(parcel.readStrongBinder());
                vg.f(parcel);
                F3(string, aVarL1);
                parcel2.writeNoException();
                return true;
            case 2:
                String string2 = parcel.readString();
                vg.f(parcel);
                xa.a aVarQ = Q(string2);
                parcel2.writeNoException();
                vg.e(parcel2, aVarQ);
                return true;
            case 3:
                xa.a aVarL12 = xa.b.L1(parcel.readStrongBinder());
                vg.f(parcel);
                d2(aVarL12);
                parcel2.writeNoException();
                return true;
            case 4:
                i();
                parcel2.writeNoException();
                return true;
            case 5:
                xa.b.L1(parcel.readStrongBinder());
                parcel.readInt();
                vg.f(parcel);
                parcel2.writeNoException();
                return true;
            case 6:
                xa.a aVarL13 = xa.b.L1(parcel.readStrongBinder());
                vg.f(parcel);
                H(aVarL13);
                parcel2.writeNoException();
                return true;
            case 7:
                xa.a aVarL14 = xa.b.L1(parcel.readStrongBinder());
                vg.f(parcel);
                a1(aVarL14);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    bnVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
                    bnVar = iInterfaceQueryLocalInterface instanceof cn ? (cn) iInterfaceQueryLocalInterface : new bn(strongBinder);
                }
                vg.f(parcel);
                X3(bnVar);
                parcel2.writeNoException();
                return true;
            case 9:
                xa.a aVarL15 = xa.b.L1(parcel.readStrongBinder());
                vg.f(parcel);
                w0(aVarL15);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
