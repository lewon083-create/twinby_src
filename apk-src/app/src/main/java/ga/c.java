package ga;

import android.os.Parcel;
import android.os.Parcelable;
import j0.g;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends qa.a {
    public static final Parcelable.Creator<c> CREATOR = new com.google.android.material.datepicker.a(6);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20062c;

    public c(String str, int i) {
        this.f20061b = str;
        this.f20062c = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = g.i0(parcel, 20293);
        g.b0(parcel, 1, this.f20061b);
        g.h0(parcel, 2, 4);
        parcel.writeInt(this.f20062c);
        g.m0(parcel, iI0);
    }
}
