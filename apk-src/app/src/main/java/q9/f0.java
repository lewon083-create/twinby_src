package q9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.bo;
import com.google.android.gms.internal.ads.un;
import com.google.android.gms.internal.ads.vg;
import com.google.android.gms.internal.ads.wm;
import com.google.android.gms.internal.ads.wn;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends cb.a implements h0 {
    public f0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder", 1);
    }

    @Override // q9.h0
    public final void H2(wm wmVar) {
        Parcel parcelD0 = D0();
        vg.c(parcelD0, wmVar);
        L1(parcelD0, 6);
    }

    @Override // q9.h0
    public final void P0(bo boVar) {
        Parcel parcelD0 = D0();
        vg.e(parcelD0, boVar);
        L1(parcelD0, 10);
    }

    @Override // q9.h0
    public final void R2(String str, wn wnVar, un unVar) {
        Parcel parcelD0 = D0();
        parcelD0.writeString(str);
        vg.e(parcelD0, wnVar);
        vg.e(parcelD0, unVar);
        L1(parcelD0, 5);
    }

    @Override // q9.h0
    public final e0 i() {
        e0 c0Var;
        Parcel parcelP1 = p1(D0(), 1);
        IBinder strongBinder = parcelP1.readStrongBinder();
        if (strongBinder == null) {
            c0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            c0Var = iInterfaceQueryLocalInterface instanceof e0 ? (e0) iInterfaceQueryLocalInterface : new c0(strongBinder, "com.google.android.gms.ads.internal.client.IAdLoader", 1);
        }
        parcelP1.recycle();
        return c0Var;
    }

    @Override // q9.h0
    public final void x3(y yVar) {
        Parcel parcelD0 = D0();
        vg.e(parcelD0, yVar);
        L1(parcelD0, 2);
    }
}
