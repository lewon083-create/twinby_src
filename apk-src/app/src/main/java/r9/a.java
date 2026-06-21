package r9;

import android.os.Parcel;
import android.os.Parcelable;
import j0.g;
import pa.l0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends qa.a {
    public static final Parcelable.Creator<a> CREATOR = new l0(6);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f32272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f32273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f32274d;

    public a(String str, String str2, String str3) {
        this.f32272b = str;
        this.f32273c = str2;
        this.f32274d = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = g.i0(parcel, 20293);
        g.b0(parcel, 1, this.f32272b);
        g.b0(parcel, 2, this.f32273c);
        g.b0(parcel, 3, this.f32274d);
        g.m0(parcel, iI0);
    }
}
