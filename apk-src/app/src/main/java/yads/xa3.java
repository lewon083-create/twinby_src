package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class xa3 extends w21 {
    public static final Parcelable.Creator<xa3> CREATOR = new wa3();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f44630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f44631d;

    public xa3(Parcel parcel) {
        super((String) lb3.a((Object) parcel.readString()));
        this.f44630c = parcel.readString();
        this.f44631d = (String) lb3.a((Object) parcel.readString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && xa3.class == obj.getClass()) {
            xa3 xa3Var = (xa3) obj;
            if (this.f44259b.equals(xa3Var.f44259b) && lb3.a(this.f44630c, xa3Var.f44630c) && lb3.a(this.f44631d, xa3Var.f44631d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iA = k4.a(this.f44259b, 527, 31);
        String str = this.f44630c;
        int iHashCode = (iA + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f44631d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // yads.w21
    public final String toString() {
        return this.f44259b + ": url=" + this.f44631d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f44259b);
        parcel.writeString(this.f44630c);
        parcel.writeString(this.f44631d);
    }

    public xa3(String str, String str2, String str3) {
        super(str);
        this.f44630c = str2;
        this.f44631d = str3;
    }
}
