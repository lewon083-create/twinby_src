package q9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.vg;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class w1 extends cb.a implements y1 {
    public w1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo", 1);
    }

    @Override // q9.y1
    public final String c() {
        Parcel parcelP1 = p1(D0(), 2);
        String string = parcelP1.readString();
        parcelP1.recycle();
        return string;
    }

    @Override // q9.y1
    public final String d() {
        Parcel parcelP1 = p1(D0(), 6);
        String string = parcelP1.readString();
        parcelP1.recycle();
        return string;
    }

    @Override // q9.y1
    public final Bundle f() {
        Parcel parcelP1 = p1(D0(), 5);
        Bundle bundle = (Bundle) vg.b(parcelP1, Bundle.CREATOR);
        parcelP1.recycle();
        return bundle;
    }

    @Override // q9.y1
    public final String i() {
        Parcel parcelP1 = p1(D0(), 1);
        String string = parcelP1.readString();
        parcelP1.recycle();
        return string;
    }

    @Override // q9.y1
    public final List k() {
        Parcel parcelP1 = p1(D0(), 3);
        ArrayList arrayListCreateTypedArrayList = parcelP1.createTypedArrayList(i3.CREATOR);
        parcelP1.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // q9.y1
    public final i3 m() {
        Parcel parcelP1 = p1(D0(), 4);
        i3 i3Var = (i3) vg.b(parcelP1, i3.CREATOR);
        parcelP1.recycle();
        return i3Var;
    }
}
