package gb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends qa.a implements na.l {
    public static final Parcelable.Creator<s> CREATOR = new com.google.android.material.datepicker.a(11);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Status f20107b;

    public s(Status status) {
        this.f20107b = status;
    }

    @Override // na.l
    public final Status getStatus() {
        return this.f20107b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.a0(parcel, 1, this.f20107b, i);
        j0.g.m0(parcel, iI0);
    }
}
