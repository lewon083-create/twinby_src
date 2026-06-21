package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ku extends qa.a {
    public static final Parcelable.Creator<ku> CREATOR = new ji(13);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f7297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u9.a f7298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ApplicationInfo f7299d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f7300e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f7301f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PackageInfo f7302g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f7303h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public xq0 f7304j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f7305k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f7306l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f7307m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Bundle f7308n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Bundle f7309o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f7310p;

    public ku(Bundle bundle, u9.a aVar, ApplicationInfo applicationInfo, String str, ArrayList arrayList, PackageInfo packageInfo, String str2, String str3, xq0 xq0Var, String str4, boolean z5, boolean z10, Bundle bundle2, Bundle bundle3, int i) {
        this.f7297b = bundle;
        this.f7298c = aVar;
        this.f7300e = str;
        this.f7299d = applicationInfo;
        this.f7301f = arrayList;
        this.f7302g = packageInfo;
        this.f7303h = str2;
        this.i = str3;
        this.f7304j = xq0Var;
        this.f7305k = str4;
        this.f7306l = z5;
        this.f7307m = z10;
        this.f7308n = bundle2;
        this.f7309o = bundle3;
        this.f7310p = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.V(parcel, 1, this.f7297b);
        j0.g.a0(parcel, 2, this.f7298c, i);
        j0.g.a0(parcel, 3, this.f7299d, i);
        j0.g.b0(parcel, 4, this.f7300e);
        j0.g.d0(parcel, 5, this.f7301f);
        j0.g.a0(parcel, 6, this.f7302g, i);
        j0.g.b0(parcel, 7, this.f7303h);
        j0.g.b0(parcel, 9, this.i);
        j0.g.a0(parcel, 10, this.f7304j, i);
        j0.g.b0(parcel, 11, this.f7305k);
        j0.g.h0(parcel, 12, 4);
        parcel.writeInt(this.f7306l ? 1 : 0);
        j0.g.h0(parcel, 13, 4);
        parcel.writeInt(this.f7307m ? 1 : 0);
        j0.g.V(parcel, 14, this.f7308n);
        j0.g.V(parcel, 15, this.f7309o);
        j0.g.h0(parcel, 16, 4);
        parcel.writeInt(this.f7310p);
        j0.g.m0(parcel, iI0);
    }
}
