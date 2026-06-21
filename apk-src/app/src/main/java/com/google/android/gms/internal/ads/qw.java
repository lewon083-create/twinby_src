package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class qw extends cb.a implements sw {
    public final pw d3(xa.b bVar, fr frVar) {
        pw nwVar;
        Parcel parcelD0 = D0();
        vg.e(parcelD0, bVar);
        vg.e(parcelD0, frVar);
        parcelD0.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelP1 = p1(parcelD0, 2);
        IBinder strongBinder = parcelP1.readStrongBinder();
        if (strongBinder == null) {
            nwVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            nwVar = iInterfaceQueryLocalInterface instanceof pw ? (pw) iInterfaceQueryLocalInterface : new nw(strongBinder);
        }
        parcelP1.recycle();
        return nwVar;
    }
}
