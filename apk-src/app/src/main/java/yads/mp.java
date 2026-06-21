package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class mp extends w21 {
    public static final Parcelable.Creator<mp> CREATOR = new lp();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f40987c;

    public mp(Parcel parcel) {
        super((String) lb3.a((Object) parcel.readString()));
        this.f40987c = (byte[]) lb3.a((Object) parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && mp.class == obj.getClass()) {
            mp mpVar = (mp) obj;
            if (this.f44259b.equals(mpVar.f44259b) && Arrays.equals(this.f40987c, mpVar.f40987c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f40987c) + k4.a(this.f44259b, 527, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f44259b);
        parcel.writeByteArray(this.f40987c);
    }

    public mp(String str, byte[] bArr) {
        super(str);
        this.f40987c = bArr;
    }
}
