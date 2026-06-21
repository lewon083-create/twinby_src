package oc;

import ac.e;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends m2.b {
    public static final Parcelable.Creator<b> CREATOR = new e(7);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f30632d;

    public b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f30632d = parcel.readInt();
    }

    @Override // m2.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f30632d);
    }

    public b(SideSheetBehavior sideSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.f30632d = sideSheetBehavior.f14651h;
    }
}
