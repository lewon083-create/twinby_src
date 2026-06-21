package la;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import i0.o;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28070a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f28070a) {
            case 0:
                int iS = o.S(parcel);
                Intent intent = null;
                while (parcel.dataPosition() < iS) {
                    int i = parcel.readInt();
                    if (((char) i) != 1) {
                        o.O(parcel, i);
                    } else {
                        intent = (Intent) o.m(parcel, i, Intent.CREATOR);
                    }
                }
                o.v(parcel, iS);
                return new a(intent);
            default:
                return new g(parcel.readStrongBinder());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.f28070a) {
            case 0:
                return new a[i];
            default:
                return new g[i];
        }
    }
}
