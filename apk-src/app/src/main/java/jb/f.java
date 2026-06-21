package jb;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends qa.a {
    public static final Parcelable.Creator<f> CREATOR = new com.google.android.material.datepicker.a(19);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f26598b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.W(parcel, 1, this.f26598b);
        j0.g.m0(parcel, iI0);
    }
}
