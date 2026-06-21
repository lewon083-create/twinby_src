package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class u13 implements us1 {
    public static final Parcelable.Creator<u13> CREATOR = new t13();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f43525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f43526c;

    public u13(int i, float f10) {
        this.f43525b = f10;
        this.f43526c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u13.class == obj.getClass()) {
            u13 u13Var = (u13) obj;
            if (this.f43525b == u13Var.f43525b && this.f43526c == u13Var.f43526c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f43525b).hashCode() + 527) * 31) + this.f43526c;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f43525b + ", svcTemporalLayerCount=" + this.f43526c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f43525b);
        parcel.writeInt(this.f43526c);
    }

    public u13(Parcel parcel) {
        this.f43525b = parcel.readFloat();
        this.f43526c = parcel.readInt();
    }
}
