package tb;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import pa.l0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends qa.a {
    public static final Parcelable.Creator<j> CREATOR = new l0(23);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f33718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f33719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public UserAddress f33720d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public l f33721e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f33722f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Bundle f33723g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f33724h;
    public Bundle i;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.b0(parcel, 1, this.f33718b);
        j0.g.a0(parcel, 2, this.f33719c, i);
        j0.g.a0(parcel, 3, this.f33720d, i);
        j0.g.a0(parcel, 4, this.f33721e, i);
        j0.g.b0(parcel, 5, this.f33722f);
        j0.g.V(parcel, 6, this.f33723g);
        j0.g.b0(parcel, 7, this.f33724h);
        j0.g.V(parcel, 8, this.i);
        j0.g.m0(parcel, iI0);
    }
}
