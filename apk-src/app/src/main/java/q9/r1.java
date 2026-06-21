package q9;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.vg;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class r1 extends cb.a implements s1 {
    public r1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener", 1);
    }

    @Override // q9.s1
    public final boolean c() {
        Parcel parcelP1 = p1(D0(), 2);
        ClassLoader classLoader = vg.f11374a;
        boolean z5 = parcelP1.readInt() != 0;
        parcelP1.recycle();
        return z5;
    }

    @Override // q9.s1
    public final void l3(h3 h3Var) {
        Parcel parcelD0 = D0();
        vg.c(parcelD0, h3Var);
        L1(parcelD0, 1);
    }
}
