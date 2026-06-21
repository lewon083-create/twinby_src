package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class mt1 extends w21 {
    public static final Parcelable.Creator<mt1> CREATOR = new lt1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f41009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f41010d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f41011e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f41012f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f41013g;

    public mt1(int i, int i10, int i11, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f41009c = i;
        this.f41010d = i10;
        this.f41011e = i11;
        this.f41012f = iArr;
        this.f41013g = iArr2;
    }

    @Override // yads.w21, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && mt1.class == obj.getClass()) {
            mt1 mt1Var = (mt1) obj;
            if (this.f41009c == mt1Var.f41009c && this.f41010d == mt1Var.f41010d && this.f41011e == mt1Var.f41011e && Arrays.equals(this.f41012f, mt1Var.f41012f) && Arrays.equals(this.f41013g, mt1Var.f41013g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f41013g) + ((Arrays.hashCode(this.f41012f) + ((((((this.f41009c + 527) * 31) + this.f41010d) * 31) + this.f41011e) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f41009c);
        parcel.writeInt(this.f41010d);
        parcel.writeInt(this.f41011e);
        parcel.writeIntArray(this.f41012f);
        parcel.writeIntArray(this.f41013g);
    }

    public mt1(Parcel parcel) {
        super("MLLT");
        this.f41009c = parcel.readInt();
        this.f41010d = parcel.readInt();
        this.f41011e = parcel.readInt();
        this.f41012f = (int[]) lb3.a(parcel.createIntArray());
        this.f41013g = (int[]) lb3.a(parcel.createIntArray());
    }
}
