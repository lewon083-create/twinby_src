package q9;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 extends qa.a {
    public static final Parcelable.Creator<o0> CREATOR = new f1(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f31952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f31953c;

    public o0(String str, String str2) {
        this.f31952b = str;
        this.f31953c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.b0(parcel, 1, this.f31952b);
        j0.g.b0(parcel, 2, this.f31953c);
        j0.g.m0(parcel, iI0);
    }
}
