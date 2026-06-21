package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ij1 implements us1 {
    public static final Parcelable.Creator<ij1> CREATOR = new hj1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f39560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f39561d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f39562e;

    public ij1(int i, int i10, String str, byte[] bArr) {
        this.f39559b = str;
        this.f39560c = bArr;
        this.f39561d = i;
        this.f39562e = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ij1.class == obj.getClass()) {
            ij1 ij1Var = (ij1) obj;
            if (this.f39559b.equals(ij1Var.f39559b) && Arrays.equals(this.f39560c, ij1Var.f39560c) && this.f39561d == ij1Var.f39561d && this.f39562e == ij1Var.f39562e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f39560c) + k4.a(this.f39559b, 527, 31)) * 31) + this.f39561d) * 31) + this.f39562e;
    }

    public final String toString() {
        return "mdta: key=" + this.f39559b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f39559b);
        parcel.writeByteArray(this.f39560c);
        parcel.writeInt(this.f39561d);
        parcel.writeInt(this.f39562e);
    }

    public ij1(Parcel parcel) {
        this.f39559b = (String) lb3.a((Object) parcel.readString());
        this.f39560c = (byte[]) lb3.a((Object) parcel.createByteArray());
        this.f39561d = parcel.readInt();
        this.f39562e = parcel.readInt();
    }
}
