package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class bd1 extends w21 {
    public static final Parcelable.Creator<bd1> CREATOR = new ad1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f36996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f36997d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f36998e;

    public bd1(Parcel parcel) {
        super("----");
        this.f36996c = (String) lb3.a((Object) parcel.readString());
        this.f36997d = (String) lb3.a((Object) parcel.readString());
        this.f36998e = (String) lb3.a((Object) parcel.readString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && bd1.class == obj.getClass()) {
            bd1 bd1Var = (bd1) obj;
            if (lb3.a(this.f36997d, bd1Var.f36997d) && lb3.a(this.f36996c, bd1Var.f36996c) && lb3.a(this.f36998e, bd1Var.f36998e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f36996c;
        int iHashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f36997d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f36998e;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // yads.w21
    public final String toString() {
        return this.f44259b + ": domain=" + this.f36996c + ", description=" + this.f36997d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f44259b);
        parcel.writeString(this.f36996c);
        parcel.writeString(this.f36998e);
    }

    public bd1(String str, String str2, String str3) {
        super("----");
        this.f36996c = str;
        this.f36997d = str2;
        this.f36998e = str3;
    }
}
