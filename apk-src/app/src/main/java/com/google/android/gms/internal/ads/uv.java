package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class uv extends qa.a {
    public static final Parcelable.Creator<uv> CREATOR = new ji(17);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f11107d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f11108e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f11109f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f11110g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f11111h;
    public final List i;

    public uv(String str, String str2, boolean z5, boolean z10, List list, boolean z11, boolean z12, List list2) {
        this.f11105b = str;
        this.f11106c = str2;
        this.f11107d = z5;
        this.f11108e = z10;
        this.f11109f = list;
        this.f11110g = z11;
        this.f11111h = z12;
        this.i = list2 == null ? new ArrayList() : list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.b0(parcel, 2, this.f11105b);
        j0.g.b0(parcel, 3, this.f11106c);
        j0.g.h0(parcel, 4, 4);
        parcel.writeInt(this.f11107d ? 1 : 0);
        j0.g.h0(parcel, 5, 4);
        parcel.writeInt(this.f11108e ? 1 : 0);
        j0.g.d0(parcel, 6, this.f11109f);
        j0.g.h0(parcel, 7, 4);
        parcel.writeInt(this.f11110g ? 1 : 0);
        j0.g.h0(parcel, 8, 4);
        parcel.writeInt(this.f11111h ? 1 : 0);
        j0.g.d0(parcel, 9, this.i);
        j0.g.m0(parcel, iI0);
    }
}
