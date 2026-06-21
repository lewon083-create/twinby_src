package ma;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.b4;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends qa.a {
    public static final Parcelable.Creator<t> CREATOR = new kb.i(7);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f28806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f28807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f28808d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f28809e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f28810f;

    public t(boolean z5, String str, int i, int i10, long j10) {
        this.f28806b = z5;
        this.f28807c = str;
        this.f28808d = b4.M(i) - 1;
        this.f28809e = com.google.android.gms.internal.auth.m.C(i10) - 1;
        this.f28810f = j10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.h0(parcel, 1, 4);
        parcel.writeInt(this.f28806b ? 1 : 0);
        j0.g.b0(parcel, 2, this.f28807c);
        j0.g.h0(parcel, 3, 4);
        parcel.writeInt(this.f28808d);
        j0.g.h0(parcel, 4, 4);
        parcel.writeInt(this.f28809e);
        j0.g.h0(parcel, 5, 8);
        parcel.writeLong(this.f28810f);
        j0.g.m0(parcel, iI0);
    }
}
