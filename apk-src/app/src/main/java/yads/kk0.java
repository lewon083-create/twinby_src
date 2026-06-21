package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class kk0 implements Parcelable {
    public static final Parcelable.Creator<kk0> CREATOR = new jk0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f40222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UUID f40223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f40224d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f40225e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f40226f;

    public kk0(Parcel parcel) {
        this.f40223c = new UUID(parcel.readLong(), parcel.readLong());
        this.f40224d = parcel.readString();
        this.f40225e = (String) lb3.a((Object) parcel.readString());
        this.f40226f = parcel.createByteArray();
    }

    public final boolean a(UUID uuid) {
        return jr.f39932a.equals(this.f40223c) || uuid.equals(this.f40223c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kk0)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        kk0 kk0Var = (kk0) obj;
        return lb3.a(this.f40224d, kk0Var.f40224d) && lb3.a(this.f40225e, kk0Var.f40225e) && lb3.a(this.f40223c, kk0Var.f40223c) && Arrays.equals(this.f40226f, kk0Var.f40226f);
    }

    public final int hashCode() {
        if (this.f40222b == 0) {
            int iHashCode = this.f40223c.hashCode() * 31;
            String str = this.f40224d;
            this.f40222b = Arrays.hashCode(this.f40226f) + k4.a(this.f40225e, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        }
        return this.f40222b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f40223c.getMostSignificantBits());
        parcel.writeLong(this.f40223c.getLeastSignificantBits());
        parcel.writeString(this.f40224d);
        parcel.writeString(this.f40225e);
        parcel.writeByteArray(this.f40226f);
    }

    public kk0(UUID uuid, String str, String str2, byte[] bArr) {
        this.f40223c = (UUID) ni.a(uuid);
        this.f40224d = str;
        this.f40225e = (String) ni.a((Object) str2);
        this.f40226f = bArr;
    }
}
