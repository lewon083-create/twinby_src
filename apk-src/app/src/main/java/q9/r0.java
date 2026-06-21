package q9;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.fr;
import com.google.android.gms.internal.ads.vg;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends cb.a implements s0 {
    public r0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloader", 1);
    }

    @Override // q9.s0
    public final void R(int i) {
        Parcel parcelD0 = D0();
        parcelD0.writeInt(i);
        L1(parcelD0, 18);
    }

    @Override // q9.s0
    public final void x2(fr frVar) {
        Parcel parcelD0 = D0();
        vg.e(parcelD0, frVar);
        L1(parcelD0, 8);
    }
}
