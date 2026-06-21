package ob;

import android.os.Parcel;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends cb.a implements i0 {
    @Override // ob.i0
    public final void G3(List list) {
        Parcel parcelD0 = D0();
        parcelD0.writeTypedList(list);
        w1(parcelD0);
    }
}
