package q9;

import android.os.Parcel;
import com.google.android.gms.internal.ads.fr;
import com.google.android.gms.internal.ads.ir;
import com.google.android.gms.internal.ads.vg;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 extends cb.a implements d1 {
    @Override // q9.d1
    public final ir getAdapterCreator() {
        Parcel parcelP1 = p1(D0(), 2);
        ir irVarL4 = fr.l4(parcelP1.readStrongBinder());
        parcelP1.recycle();
        return irVarL4;
    }

    @Override // q9.d1
    public final n2 getLiteSdkVersion() {
        Parcel parcelP1 = p1(D0(), 1);
        n2 n2Var = (n2) vg.b(parcelP1, n2.CREATOR);
        parcelP1.recycle();
        return n2Var;
    }
}
