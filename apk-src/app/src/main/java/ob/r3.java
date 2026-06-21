package ob;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class r3 extends qa.a {
    public static final Parcelable.Creator<r3> CREATOR = new kb.i(18);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f30391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f30392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f30393d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f30394e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f30395f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f30396g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f30397h;

    public r3(long j10, byte[] bArr, String str, Bundle bundle, int i, long j11, String str2) {
        this.f30391b = j10;
        this.f30392c = bArr;
        this.f30393d = str;
        this.f30394e = bundle;
        this.f30395f = i;
        this.f30396g = j11;
        this.f30397h = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.h0(parcel, 1, 8);
        parcel.writeLong(this.f30391b);
        j0.g.W(parcel, 2, this.f30392c);
        j0.g.b0(parcel, 3, this.f30393d);
        j0.g.V(parcel, 4, this.f30394e);
        j0.g.h0(parcel, 5, 4);
        parcel.writeInt(this.f30395f);
        j0.g.h0(parcel, 6, 8);
        parcel.writeLong(this.f30396g);
        j0.g.b0(parcel, 7, this.f30397h);
        j0.g.m0(parcel, iI0);
    }
}
