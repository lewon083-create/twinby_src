package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class y33 implements Comparable, Parcelable {
    public static final Parcelable.Creator<y33> CREATOR = new x33();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f44912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f44913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f44914d;

    public y33(int i, int i10, int i11) {
        this.f44912b = i;
        this.f44913c = i10;
        this.f44914d = i11;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        y33 y33Var = (y33) obj;
        int i = this.f44912b - y33Var.f44912b;
        if (i != 0) {
            return i;
        }
        int i10 = this.f44913c - y33Var.f44913c;
        return i10 == 0 ? this.f44914d - y33Var.f44914d : i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y33.class == obj.getClass()) {
            y33 y33Var = (y33) obj;
            if (this.f44912b == y33Var.f44912b && this.f44913c == y33Var.f44913c && this.f44914d == y33Var.f44914d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f44912b * 31) + this.f44913c) * 31) + this.f44914d;
    }

    public final String toString() {
        return this.f44912b + "." + this.f44913c + "." + this.f44914d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f44912b);
        parcel.writeInt(this.f44913c);
        parcel.writeInt(this.f44914d);
    }

    public y33(Parcel parcel) {
        this.f44912b = parcel.readInt();
        this.f44913c = parcel.readInt();
        this.f44914d = parcel.readInt();
    }
}
