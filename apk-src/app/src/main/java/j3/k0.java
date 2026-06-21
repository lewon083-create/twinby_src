package j3;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements Comparable, Parcelable {
    public static final Parcelable.Creator<k0> CREATOR = new j(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f26267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f26268d;

    static {
        m3.z.G(0);
        m3.z.G(1);
        m3.z.G(2);
    }

    public k0() {
        this.f26266b = -1;
        this.f26267c = -1;
        this.f26268d = -1;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        k0 k0Var = (k0) obj;
        int i = this.f26266b - k0Var.f26266b;
        if (i != 0) {
            return i;
        }
        int i10 = this.f26267c - k0Var.f26267c;
        return i10 == 0 ? this.f26268d - k0Var.f26268d : i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k0.class == obj.getClass()) {
            k0 k0Var = (k0) obj;
            if (this.f26266b == k0Var.f26266b && this.f26267c == k0Var.f26267c && this.f26268d == k0Var.f26268d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f26266b * 31) + this.f26267c) * 31) + this.f26268d;
    }

    public final String toString() {
        return this.f26266b + "." + this.f26267c + "." + this.f26268d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f26266b);
        parcel.writeInt(this.f26267c);
        parcel.writeInt(this.f26268d);
    }

    public k0(Parcel parcel) {
        this.f26266b = parcel.readInt();
        this.f26267c = parcel.readInt();
        this.f26268d = parcel.readInt();
    }
}
