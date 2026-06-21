package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class s21 implements us1 {
    public static final Parcelable.Creator<s21> CREATOR = new r21();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f42789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f42790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f42791d;

    public s21(Parcel parcel) {
        this.f42789b = (byte[]) ni.a(parcel.createByteArray());
        this.f42790c = parcel.readString();
        this.f42791d = parcel.readString();
    }

    @Override // yads.us1
    public final void a(km1 km1Var) {
        String str = this.f42790c;
        if (str != null) {
            km1Var.f40252a = str;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s21.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f42789b, ((s21) obj).f42789b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f42789b);
    }

    public final String toString() {
        return t.z.d(this.f42789b.length, "\"", t.z.j("ICY: title=\"", this.f42790c, "\", url=\"", this.f42791d, "\", rawMetadata.length=\""));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.f42789b);
        parcel.writeString(this.f42790c);
        parcel.writeString(this.f42791d);
    }

    public s21(byte[] bArr, String str, String str2) {
        this.f42789b = bArr;
        this.f42790c = str;
        this.f42791d = str2;
    }
}
