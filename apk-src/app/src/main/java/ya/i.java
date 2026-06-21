package ya;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends cb.a {
    public final xa.a d3(xa.b bVar, String str, int i, xa.b bVar2) {
        Parcel parcelD0 = D0();
        fb.h.b(parcelD0, bVar);
        parcelD0.writeString(str);
        parcelD0.writeInt(i);
        fb.h.b(parcelD0, bVar2);
        return pe.a.n(l0(parcelD0, 2));
    }

    public final xa.a r3(xa.b bVar, String str, int i, xa.b bVar2) {
        Parcel parcelD0 = D0();
        fb.h.b(parcelD0, bVar);
        parcelD0.writeString(str);
        parcelD0.writeInt(i);
        fb.h.b(parcelD0, bVar2);
        return pe.a.n(l0(parcelD0, 3));
    }
}
