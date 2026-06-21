package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class cd2 implements us1 {
    public static final Parcelable.Creator<cd2> CREATOR = new bd2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f37339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f37340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f37341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f37342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f37343f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f37344g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f37345h;
    public final byte[] i;

    public cd2(int i, String str, String str2, int i10, int i11, int i12, int i13, byte[] bArr) {
        this.f37339b = i;
        this.f37340c = str;
        this.f37341d = str2;
        this.f37342e = i10;
        this.f37343f = i11;
        this.f37344g = i12;
        this.f37345h = i13;
        this.i = bArr;
    }

    @Override // yads.us1
    public final void a(km1 km1Var) {
        byte[] bArr = this.i;
        int i = this.f37339b;
        if (km1Var.f40260j == null || lb3.a((Object) Integer.valueOf(i), (Object) 3) || !lb3.a((Object) km1Var.f40261k, (Object) 3)) {
            km1Var.f40260j = (byte[]) bArr.clone();
            km1Var.f40261k = Integer.valueOf(i);
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
        if (obj != null && cd2.class == obj.getClass()) {
            cd2 cd2Var = (cd2) obj;
            if (this.f37339b == cd2Var.f37339b && this.f37340c.equals(cd2Var.f37340c) && this.f37341d.equals(cd2Var.f37341d) && this.f37342e == cd2Var.f37342e && this.f37343f == cd2Var.f37343f && this.f37344g == cd2Var.f37344g && this.f37345h == cd2Var.f37345h && Arrays.equals(this.i, cd2Var.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.i) + ((((((((k4.a(this.f37341d, k4.a(this.f37340c, (this.f37339b + 527) * 31, 31), 31) + this.f37342e) * 31) + this.f37343f) * 31) + this.f37344g) * 31) + this.f37345h) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f37340c + ", description=" + this.f37341d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f37339b);
        parcel.writeString(this.f37340c);
        parcel.writeString(this.f37341d);
        parcel.writeInt(this.f37342e);
        parcel.writeInt(this.f37343f);
        parcel.writeInt(this.f37344g);
        parcel.writeInt(this.f37345h);
        parcel.writeByteArray(this.i);
    }

    public cd2(Parcel parcel) {
        this.f37339b = parcel.readInt();
        this.f37340c = (String) lb3.a((Object) parcel.readString());
        this.f37341d = (String) lb3.a((Object) parcel.readString());
        this.f37342e = parcel.readInt();
        this.f37343f = parcel.readInt();
        this.f37344g = parcel.readInt();
        this.f37345h = parcel.readInt();
        this.i = (byte[]) lb3.a((Object) parcel.createByteArray());
    }
}
