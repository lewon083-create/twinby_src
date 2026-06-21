package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class mg implements us1 {
    public static final Parcelable.Creator<mg> CREATOR = new lg();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f40910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f40911c;

    public mg(int i, String str) {
        this.f40910b = i;
        this.f40911c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Ait(controlCode=");
        sb2.append(this.f40910b);
        sb2.append(",url=");
        return a0.u.o(sb2, this.f40911c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f40911c);
        parcel.writeInt(this.f40910b);
    }
}
