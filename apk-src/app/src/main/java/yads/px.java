package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class px extends w21 {
    public static final Parcelable.Creator<px> CREATOR = new ox();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f42095c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f42096d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f42097e;

    public px(Parcel parcel) {
        super("COMM");
        this.f42095c = (String) lb3.a((Object) parcel.readString());
        this.f42096d = (String) lb3.a((Object) parcel.readString());
        this.f42097e = (String) lb3.a((Object) parcel.readString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && px.class == obj.getClass()) {
            px pxVar = (px) obj;
            if (lb3.a(this.f42096d, pxVar.f42096d) && lb3.a(this.f42095c, pxVar.f42095c) && lb3.a(this.f42097e, pxVar.f42097e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f42095c;
        int iHashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f42096d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f42097e;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // yads.w21
    public final String toString() {
        return this.f44259b + ": language=" + this.f42095c + ", description=" + this.f42096d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f44259b);
        parcel.writeString(this.f42095c);
        parcel.writeString(this.f42097e);
    }

    public px(String str, String str2, String str3) {
        super("COMM");
        this.f42095c = str;
        this.f42096d = str2;
        this.f42097e = str3;
    }
}
