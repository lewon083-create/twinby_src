package qa;

import android.os.Parcel;
import l7.o;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends RuntimeException {
    public b(String str, Parcel parcel) {
        int iDataPosition = parcel.dataPosition();
        int iDataSize = parcel.dataSize();
        int length = String.valueOf(str).length();
        StringBuilder sb2 = new StringBuilder(length + 13 + String.valueOf(iDataPosition).length() + 6 + String.valueOf(iDataSize).length());
        o.p(iDataPosition, str, " Parcel: pos=", " size=", sb2);
        sb2.append(iDataSize);
        super(sb2.toString());
    }
}
