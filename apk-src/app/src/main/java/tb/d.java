package tb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import pa.l0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends qa.a {
    public static final Parcelable.Creator<d> CREATOR = new l0(15);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f33676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f33677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f33678d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f33679e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public UserAddress f33680f;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.b0(parcel, 1, this.f33676b);
        j0.g.b0(parcel, 2, this.f33677c);
        j0.g.b0(parcel, 3, this.f33678d);
        int i10 = this.f33679e;
        j0.g.h0(parcel, 4, 4);
        parcel.writeInt(i10);
        j0.g.a0(parcel, 5, this.f33680f, i);
        j0.g.m0(parcel, iI0);
    }
}
