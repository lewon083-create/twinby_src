package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class cz0 extends w21 {
    public static final Parcelable.Creator<cz0> CREATOR = new bz0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f37573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f37574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f37575e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f37576f;

    public cz0(Parcel parcel) {
        super("GEOB");
        this.f37573c = (String) lb3.a((Object) parcel.readString());
        this.f37574d = (String) lb3.a((Object) parcel.readString());
        this.f37575e = (String) lb3.a((Object) parcel.readString());
        this.f37576f = (byte[]) lb3.a((Object) parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && cz0.class == obj.getClass()) {
            cz0 cz0Var = (cz0) obj;
            if (lb3.a(this.f37573c, cz0Var.f37573c) && lb3.a(this.f37574d, cz0Var.f37574d) && lb3.a(this.f37575e, cz0Var.f37575e) && Arrays.equals(this.f37576f, cz0Var.f37576f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f37573c;
        int iHashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f37574d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f37575e;
        return Arrays.hashCode(this.f37576f) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // yads.w21
    public final String toString() {
        return this.f44259b + ": mimeType=" + this.f37573c + ", filename=" + this.f37574d + ", description=" + this.f37575e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f37573c);
        parcel.writeString(this.f37574d);
        parcel.writeString(this.f37575e);
        parcel.writeByteArray(this.f37576f);
    }

    public cz0(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f37573c = str;
        this.f37574d = str2;
        this.f37575e = str3;
        this.f37576f = bArr;
    }
}
