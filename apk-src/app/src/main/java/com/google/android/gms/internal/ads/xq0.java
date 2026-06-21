package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class xq0 extends qa.a {
    public static final Parcelable.Creator<xq0> CREATOR = new ji(19);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f12279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wq0 f12281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f12282e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f12283f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f12284g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f12285h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f12286j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f12287k;

    public xq0(int i, int i10, int i11, int i12, String str, int i13, int i14) {
        wq0[] wq0VarArrValues = wq0.values();
        this.f12279b = null;
        this.f12280c = i;
        this.f12281d = wq0VarArrValues[i];
        this.f12282e = i10;
        this.f12283f = i11;
        this.f12284g = i12;
        this.f12285h = str;
        this.i = i13;
        this.f12287k = new int[]{1, 2, 3}[i13];
        this.f12286j = i14;
        int i15 = new int[]{1}[i14];
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.h0(parcel, 1, 4);
        parcel.writeInt(this.f12280c);
        j0.g.h0(parcel, 2, 4);
        parcel.writeInt(this.f12282e);
        j0.g.h0(parcel, 3, 4);
        parcel.writeInt(this.f12283f);
        j0.g.h0(parcel, 4, 4);
        parcel.writeInt(this.f12284g);
        j0.g.b0(parcel, 5, this.f12285h);
        j0.g.h0(parcel, 6, 4);
        parcel.writeInt(this.i);
        j0.g.h0(parcel, 7, 4);
        parcel.writeInt(this.f12286j);
        j0.g.m0(parcel, iI0);
    }

    public xq0(Context context, wq0 wq0Var, int i, int i10, int i11, String str, String str2) {
        wq0.values();
        this.f12279b = context;
        this.f12280c = wq0Var.ordinal();
        this.f12281d = wq0Var;
        this.f12282e = i;
        this.f12283f = i10;
        this.f12284g = i11;
        this.f12285h = str;
        int i12 = "oldest".equals(str2) ? 1 : (!"lru".equals(str2) && "lfu".equals(str2)) ? 3 : 2;
        this.f12287k = i12;
        this.i = i12 - 1;
        this.f12286j = 0;
    }
}
