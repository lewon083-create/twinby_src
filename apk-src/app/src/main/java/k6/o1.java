package k6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o1 implements Parcelable {
    public static final Parcelable.Creator<o1> CREATOR = new com.google.android.material.datepicker.a(22);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f27148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f27149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f27150e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f27147b + ", mGapDir=" + this.f27148c + ", mHasUnwantedGapAfter=" + this.f27150e + ", mGapPerSpan=" + Arrays.toString(this.f27149d) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f27147b);
        parcel.writeInt(this.f27148c);
        parcel.writeInt(this.f27150e ? 1 : 0);
        int[] iArr = this.f27149d;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f27149d);
        }
    }
}
