package gb;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends qa.a {
    public static final Parcelable.Creator<j> CREATOR = new com.google.android.material.datepicker.a(7);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IBinder f20082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IBinder f20083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final PendingIntent f20084e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f20085f;

    public j(int i, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, String str) {
        this.f20081b = i;
        this.f20082c = iBinder;
        this.f20083d = iBinder2;
        this.f20084e = pendingIntent;
        this.f20085f = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.h0(parcel, 1, 4);
        parcel.writeInt(this.f20081b);
        j0.g.X(parcel, 2, this.f20082c);
        j0.g.X(parcel, 3, this.f20083d);
        j0.g.a0(parcel, 4, this.f20084e, i);
        j0.g.b0(parcel, 6, this.f20085f);
        j0.g.m0(parcel, iI0);
    }
}
