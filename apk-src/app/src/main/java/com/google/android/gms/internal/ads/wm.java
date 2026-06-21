package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class wm extends qa.a {
    public static final Parcelable.Creator<wm> CREATOR = new ji(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f11845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11846d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f11847e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f11848f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q9.b3 f11849g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f11850h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f11851j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f11852k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f11853l;

    public wm(int i, boolean z5, int i10, boolean z10, int i11, q9.b3 b3Var, boolean z11, int i12, int i13, boolean z12, int i14) {
        this.f11844b = i;
        this.f11845c = z5;
        this.f11846d = i10;
        this.f11847e = z10;
        this.f11848f = i11;
        this.f11849g = b3Var;
        this.f11850h = z11;
        this.i = i12;
        this.f11852k = z12;
        this.f11851j = i13;
        this.f11853l = i14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.h0(parcel, 1, 4);
        parcel.writeInt(this.f11844b);
        j0.g.h0(parcel, 2, 4);
        parcel.writeInt(this.f11845c ? 1 : 0);
        j0.g.h0(parcel, 3, 4);
        parcel.writeInt(this.f11846d);
        j0.g.h0(parcel, 4, 4);
        parcel.writeInt(this.f11847e ? 1 : 0);
        j0.g.h0(parcel, 5, 4);
        parcel.writeInt(this.f11848f);
        j0.g.a0(parcel, 6, this.f11849g, i);
        j0.g.h0(parcel, 7, 4);
        parcel.writeInt(this.f11850h ? 1 : 0);
        j0.g.h0(parcel, 8, 4);
        parcel.writeInt(this.i);
        j0.g.h0(parcel, 9, 4);
        parcel.writeInt(this.f11851j);
        j0.g.h0(parcel, 10, 4);
        parcel.writeInt(this.f11852k ? 1 : 0);
        j0.g.h0(parcel, 11, 4);
        parcel.writeInt(this.f11853l);
        j0.g.m0(parcel, iI0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public wm(n9.c cVar) {
        boolean z5 = cVar.f29175a;
        int i = cVar.f29176b;
        boolean z10 = cVar.f29178d;
        int i10 = cVar.f29179e;
        k9.u uVar = cVar.f29180f;
        this(4, z5, i, z10, i10, uVar != null ? new q9.b3(uVar) : null, cVar.f29181g, cVar.f29177c, 0, false, 0);
    }
}
