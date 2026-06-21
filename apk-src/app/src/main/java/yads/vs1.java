package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class vs1 implements Parcelable {
    public static final Parcelable.Creator<vs1> CREATOR = new ts1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final us1[] f44117b;

    public vs1(Parcel parcel) {
        this.f44117b = new us1[parcel.readInt()];
        int i = 0;
        while (true) {
            us1[] us1VarArr = this.f44117b;
            if (i >= us1VarArr.length) {
                return;
            }
            us1VarArr[i] = (us1) parcel.readParcelable(us1.class.getClassLoader());
            i++;
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
        if (obj == null || vs1.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f44117b, ((vs1) obj).f44117b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f44117b);
    }

    public final String toString() {
        return "entries=" + Arrays.toString(this.f44117b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f44117b.length);
        for (us1 us1Var : this.f44117b) {
            parcel.writeParcelable(us1Var, 0);
        }
    }

    public vs1(List list) {
        this.f44117b = (us1[]) list.toArray(new us1[0]);
    }

    public vs1(us1... us1VarArr) {
        this.f44117b = us1VarArr;
    }
}
