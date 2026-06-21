package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class an3 implements us1 {
    public static final Parcelable.Creator<an3> CREATOR = new ym3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f36793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f36794c;

    public an3(Parcel parcel) {
        this.f36793b = (String) lb3.a((Object) parcel.readString());
        this.f36794c = (String) lb3.a((Object) parcel.readString());
    }

    @Override // yads.us1
    public final void a(km1 km1Var) {
        String str = this.f36793b;
        str.getClass();
        switch (str) {
            case "ALBUM":
                km1Var.f40254c = this.f36794c;
                break;
            case "TITLE":
                km1Var.f40252a = this.f36794c;
                break;
            case "DESCRIPTION":
                km1Var.f40258g = this.f36794c;
                break;
            case "ALBUMARTIST":
                km1Var.f40255d = this.f36794c;
                break;
            case "ARTIST":
                km1Var.f40253b = this.f36794c;
                break;
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
        if (obj != null && getClass() == obj.getClass()) {
            an3 an3Var = (an3) obj;
            if (this.f36793b.equals(an3Var.f36793b) && this.f36794c.equals(an3Var.f36794c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f36794c.hashCode() + k4.a(this.f36793b, 527, 31);
    }

    public final String toString() {
        return "VC: " + this.f36793b + "=" + this.f36794c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f36793b);
        parcel.writeString(this.f36794c);
    }

    public an3(String str, String str2) {
        this.f36793b = str;
        this.f36794c = str2;
    }
}
