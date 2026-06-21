package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ut extends w21 {
    public static final Parcelable.Creator<ut> CREATOR = new tt();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f43761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f43762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f43763e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f43764f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f43765g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w21[] f43766h;

    public ut(Parcel parcel) {
        super("CHAP");
        this.f43761c = (String) lb3.a((Object) parcel.readString());
        this.f43762d = parcel.readInt();
        this.f43763e = parcel.readInt();
        this.f43764f = parcel.readLong();
        this.f43765g = parcel.readLong();
        int i = parcel.readInt();
        this.f43766h = new w21[i];
        for (int i10 = 0; i10 < i; i10++) {
            this.f43766h[i10] = (w21) parcel.readParcelable(w21.class.getClassLoader());
        }
    }

    @Override // yads.w21, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ut.class == obj.getClass()) {
            ut utVar = (ut) obj;
            if (this.f43762d == utVar.f43762d && this.f43763e == utVar.f43763e && this.f43764f == utVar.f43764f && this.f43765g == utVar.f43765g && lb3.a(this.f43761c, utVar.f43761c) && Arrays.equals(this.f43766h, utVar.f43766h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (((((((this.f43762d + 527) * 31) + this.f43763e) * 31) + ((int) this.f43764f)) * 31) + ((int) this.f43765g)) * 31;
        String str = this.f43761c;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f43761c);
        parcel.writeInt(this.f43762d);
        parcel.writeInt(this.f43763e);
        parcel.writeLong(this.f43764f);
        parcel.writeLong(this.f43765g);
        parcel.writeInt(this.f43766h.length);
        for (w21 w21Var : this.f43766h) {
            parcel.writeParcelable(w21Var, 0);
        }
    }

    public ut(String str, int i, int i10, long j10, long j11, w21[] w21VarArr) {
        super("CHAP");
        this.f43761c = str;
        this.f43762d = i;
        this.f43763e = i10;
        this.f43764f = j10;
        this.f43765g = j11;
        this.f43766h = w21VarArr;
    }
}
