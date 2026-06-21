package q9;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.vg;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class t1 extends cb.a implements u1 {
    public t1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTester", 1);
    }

    @Override // q9.u1
    public final void w2(String str, xa.a aVar, xa.a aVar2) {
        Parcel parcelD0 = D0();
        parcelD0.writeString(str);
        vg.e(parcelD0, aVar);
        vg.e(parcelD0, aVar2);
        L1(parcelD0, 1);
    }
}
