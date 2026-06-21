package jb;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends qa.a {
    public static final Parcelable.Creator<g> CREATOR = new com.google.android.material.datepicker.a(20);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String[] f26599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f26600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RemoteViews f26601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f26602e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.c0(parcel, 1, this.f26599b);
        j0.g.Y(parcel, 2, this.f26600c);
        j0.g.a0(parcel, 3, this.f26601d, i);
        j0.g.W(parcel, 4, this.f26602e);
        j0.g.m0(parcel, iI0);
    }
}
