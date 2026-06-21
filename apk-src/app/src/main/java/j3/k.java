package j3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new j(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UUID f26262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f26263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f26264e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f26265f;

    public k(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f26262c = uuid;
        this.f26263d = str;
        str2.getClass();
        this.f26264e = c0.n(str2);
        this.f26265f = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        k kVar = (k) obj;
        return Objects.equals(this.f26263d, kVar.f26263d) && Objects.equals(this.f26264e, kVar.f26264e) && Objects.equals(this.f26262c, kVar.f26262c) && Arrays.equals(this.f26265f, kVar.f26265f);
    }

    public final int hashCode() {
        if (this.f26261b == 0) {
            int iHashCode = this.f26262c.hashCode() * 31;
            String str = this.f26263d;
            this.f26261b = Arrays.hashCode(this.f26265f) + gf.a.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f26264e);
        }
        return this.f26261b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        UUID uuid = this.f26262c;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f26263d);
        parcel.writeString(this.f26264e);
        parcel.writeByteArray(this.f26265f);
    }

    public k(Parcel parcel) {
        this.f26262c = new UUID(parcel.readLong(), parcel.readLong());
        this.f26263d = parcel.readString();
        String string = parcel.readString();
        String str = m3.z.f28608a;
        this.f26264e = string;
        this.f26265f = parcel.createByteArray();
    }
}
