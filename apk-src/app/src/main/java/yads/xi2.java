package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class xi2 extends w21 {
    public static final Parcelable.Creator<xi2> CREATOR = new wi2();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f44726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f44727d;

    public xi2(Parcel parcel) {
        super("PRIV");
        this.f44726c = (String) lb3.a((Object) parcel.readString());
        this.f44727d = (byte[]) lb3.a((Object) parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && xi2.class == obj.getClass()) {
            xi2 xi2Var = (xi2) obj;
            if (lb3.a(this.f44726c, xi2Var.f44726c) && Arrays.equals(this.f44727d, xi2Var.f44727d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f44726c;
        return Arrays.hashCode(this.f44727d) + (((str != null ? str.hashCode() : 0) + 527) * 31);
    }

    @Override // yads.w21
    public final String toString() {
        return this.f44259b + ": owner=" + this.f44726c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f44726c);
        parcel.writeByteArray(this.f44727d);
    }

    public xi2(String str, byte[] bArr) {
        super("PRIV");
        this.f44726c = str;
        this.f44727d = bArr;
    }
}
