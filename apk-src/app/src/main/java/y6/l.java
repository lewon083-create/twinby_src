package y6;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends View.BaseSavedState {
    public static final Parcelable.Creator<l> CREATOR = new ac.e(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f36504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f36505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Parcelable f36506d;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f36504b);
        parcel.writeInt(this.f36505c);
        parcel.writeParcelable(this.f36506d, i);
    }
}
