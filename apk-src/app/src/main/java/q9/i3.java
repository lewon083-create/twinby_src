package q9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i3 extends qa.a {
    public static final Parcelable.Creator<i3> CREATOR = new f1(11);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f31902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f31903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public x1 f31904d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f31905e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f31906f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f31907g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f31908h;
    public final String i;

    public i3(String str, long j10, x1 x1Var, Bundle bundle, String str2, String str3, String str4, String str5) {
        this.f31902b = str;
        this.f31903c = j10;
        this.f31904d = x1Var;
        this.f31905e = bundle;
        this.f31906f = str2;
        this.f31907g = str3;
        this.f31908h = str4;
        this.i = str5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.b0(parcel, 1, this.f31902b);
        long j10 = this.f31903c;
        j0.g.h0(parcel, 2, 8);
        parcel.writeLong(j10);
        j0.g.a0(parcel, 3, this.f31904d, i);
        j0.g.V(parcel, 4, this.f31905e);
        j0.g.b0(parcel, 5, this.f31906f);
        j0.g.b0(parcel, 6, this.f31907g);
        j0.g.b0(parcel, 7, this.f31908h);
        j0.g.b0(parcel, 8, this.i);
        j0.g.m0(parcel, iI0);
    }
}
