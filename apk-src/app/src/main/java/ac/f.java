package ac;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends m2.b {
    public static final Parcelable.Creator<f> CREATOR = new e(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f743d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f744e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f745f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f746g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f747h;

    public f(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f743d = parcel.readInt();
        this.f744e = parcel.readInt();
        this.f745f = parcel.readInt() == 1;
        this.f746g = parcel.readInt() == 1;
        this.f747h = parcel.readInt() == 1;
    }

    @Override // m2.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f743d);
        parcel.writeInt(this.f744e);
        parcel.writeInt(this.f745f ? 1 : 0);
        parcel.writeInt(this.f746g ? 1 : 0);
        parcel.writeInt(this.f747h ? 1 : 0);
    }

    public f(BottomSheetBehavior bottomSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.f743d = bottomSheetBehavior.L;
        this.f744e = bottomSheetBehavior.f14491e;
        this.f745f = bottomSheetBehavior.f14485b;
        this.f746g = bottomSheetBehavior.I;
        this.f747h = bottomSheetBehavior.J;
    }
}
