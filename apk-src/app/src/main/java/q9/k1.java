package q9;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k1 extends cb.a implements l1 {
    @Override // q9.l1
    public final String c() {
        Parcel parcelP1 = p1(D0(), 2);
        String string = parcelP1.readString();
        parcelP1.recycle();
        return string;
    }

    @Override // q9.l1
    public final String i() {
        Parcel parcelP1 = p1(D0(), 1);
        String string = parcelP1.readString();
        parcelP1.recycle();
        return string;
    }
}
