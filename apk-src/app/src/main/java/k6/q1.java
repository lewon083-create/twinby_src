package k6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class q1 implements Parcelable {
    public static final Parcelable.Creator<q1> CREATOR = new com.google.android.material.datepicker.a(23);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f27157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f27158d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f27159e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f27160f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int[] f27161g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f27162h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f27163j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f27164k;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f27156b);
        parcel.writeInt(this.f27157c);
        parcel.writeInt(this.f27158d);
        if (this.f27158d > 0) {
            parcel.writeIntArray(this.f27159e);
        }
        parcel.writeInt(this.f27160f);
        if (this.f27160f > 0) {
            parcel.writeIntArray(this.f27161g);
        }
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.f27163j ? 1 : 0);
        parcel.writeInt(this.f27164k ? 1 : 0);
        parcel.writeList(this.f27162h);
    }
}
