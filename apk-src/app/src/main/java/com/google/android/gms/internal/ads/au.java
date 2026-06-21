package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class au extends qa.a {
    public static final Parcelable.Creator<au> CREATOR = new ji(10);
    public final List A;
    public final long B;
    public final String C;
    public final float D;
    public final int E;
    public final int F;
    public final boolean G;
    public final String H;
    public final boolean I;
    public final String J;
    public final boolean K;
    public final int L;
    public final Bundle M;
    public final String N;
    public final q9.d2 O;
    public final boolean P;
    public final Bundle Q;
    public final String R;
    public final String S;
    public final String T;
    public final boolean U;
    public final List V;
    public final String W;
    public final List X;
    public final int Y;
    public final boolean Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final boolean f3386a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3387b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final boolean f3388b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f3389c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final ArrayList f3390c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q9.d3 f3391d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final String f3392d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q9.g3 f3393e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final wp f3394e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f3395f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final String f3396f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ApplicationInfo f3397g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final Bundle f3398g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final PackageInfo f3399h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f3400j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f3401k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final u9.a f3402l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Bundle f3403m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f3404n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List f3405o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Bundle f3406p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f3407q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f3408r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f3409s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float f3410t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f3411u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f3412v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f3413w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final List f3414x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f3415y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final wm f3416z;

    public au(int i, Bundle bundle, q9.d3 d3Var, q9.g3 g3Var, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, String str4, u9.a aVar, Bundle bundle2, int i10, ArrayList arrayList, Bundle bundle3, boolean z5, int i11, int i12, float f10, String str5, long j10, String str6, ArrayList arrayList2, String str7, wm wmVar, ArrayList arrayList3, long j11, String str8, float f11, boolean z10, int i13, int i14, boolean z11, String str9, String str10, boolean z12, int i15, Bundle bundle4, String str11, q9.d2 d2Var, boolean z13, Bundle bundle5, String str12, String str13, String str14, boolean z14, ArrayList arrayList4, String str15, ArrayList arrayList5, int i16, boolean z15, boolean z16, boolean z17, ArrayList arrayList6, String str16, wp wpVar, String str17, Bundle bundle6) {
        this.f3387b = i;
        this.f3389c = bundle;
        this.f3391d = d3Var;
        this.f3393e = g3Var;
        this.f3395f = str;
        this.f3397g = applicationInfo;
        this.f3399h = packageInfo;
        this.i = str2;
        this.f3400j = str3;
        this.f3401k = str4;
        this.f3402l = aVar;
        this.f3403m = bundle2;
        this.f3404n = i10;
        this.f3405o = arrayList;
        this.A = arrayList3 == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList3);
        this.f3406p = bundle3;
        this.f3407q = z5;
        this.f3408r = i11;
        this.f3409s = i12;
        this.f3410t = f10;
        this.f3411u = str5;
        this.f3412v = j10;
        this.f3413w = str6;
        this.f3414x = arrayList2 == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList2);
        this.f3415y = str7;
        this.f3416z = wmVar;
        this.B = j11;
        this.C = str8;
        this.D = f11;
        this.I = z10;
        this.E = i13;
        this.F = i14;
        this.G = z11;
        this.H = str9;
        this.J = str10;
        this.K = z12;
        this.L = i15;
        this.M = bundle4;
        this.N = str11;
        this.O = d2Var;
        this.P = z13;
        this.Q = bundle5;
        this.R = str12;
        this.S = str13;
        this.T = str14;
        this.U = z14;
        this.V = arrayList4;
        this.W = str15;
        this.X = arrayList5;
        this.Y = i16;
        this.Z = z15;
        this.f3386a0 = z16;
        this.f3388b0 = z17;
        this.f3390c0 = arrayList6;
        this.f3392d0 = str16;
        this.f3394e0 = wpVar;
        this.f3396f0 = str17;
        this.f3398g0 = bundle6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.h0(parcel, 1, 4);
        parcel.writeInt(this.f3387b);
        j0.g.V(parcel, 2, this.f3389c);
        j0.g.a0(parcel, 3, this.f3391d, i);
        j0.g.a0(parcel, 4, this.f3393e, i);
        j0.g.b0(parcel, 5, this.f3395f);
        j0.g.a0(parcel, 6, this.f3397g, i);
        j0.g.a0(parcel, 7, this.f3399h, i);
        j0.g.b0(parcel, 8, this.i);
        j0.g.b0(parcel, 9, this.f3400j);
        j0.g.b0(parcel, 10, this.f3401k);
        j0.g.a0(parcel, 11, this.f3402l, i);
        j0.g.V(parcel, 12, this.f3403m);
        j0.g.h0(parcel, 13, 4);
        parcel.writeInt(this.f3404n);
        j0.g.d0(parcel, 14, this.f3405o);
        j0.g.V(parcel, 15, this.f3406p);
        j0.g.h0(parcel, 16, 4);
        parcel.writeInt(this.f3407q ? 1 : 0);
        j0.g.h0(parcel, 18, 4);
        parcel.writeInt(this.f3408r);
        j0.g.h0(parcel, 19, 4);
        parcel.writeInt(this.f3409s);
        j0.g.h0(parcel, 20, 4);
        parcel.writeFloat(this.f3410t);
        j0.g.b0(parcel, 21, this.f3411u);
        j0.g.h0(parcel, 25, 8);
        parcel.writeLong(this.f3412v);
        j0.g.b0(parcel, 26, this.f3413w);
        j0.g.d0(parcel, 27, this.f3414x);
        j0.g.b0(parcel, 28, this.f3415y);
        j0.g.a0(parcel, 29, this.f3416z, i);
        j0.g.d0(parcel, 30, this.A);
        j0.g.h0(parcel, 31, 8);
        parcel.writeLong(this.B);
        j0.g.b0(parcel, 33, this.C);
        j0.g.h0(parcel, 34, 4);
        parcel.writeFloat(this.D);
        j0.g.h0(parcel, 35, 4);
        parcel.writeInt(this.E);
        j0.g.h0(parcel, 36, 4);
        parcel.writeInt(this.F);
        j0.g.h0(parcel, 37, 4);
        parcel.writeInt(this.G ? 1 : 0);
        j0.g.b0(parcel, 39, this.H);
        j0.g.h0(parcel, 40, 4);
        parcel.writeInt(this.I ? 1 : 0);
        j0.g.b0(parcel, 41, this.J);
        j0.g.h0(parcel, 42, 4);
        parcel.writeInt(this.K ? 1 : 0);
        j0.g.h0(parcel, 43, 4);
        parcel.writeInt(this.L);
        j0.g.V(parcel, 44, this.M);
        j0.g.b0(parcel, 45, this.N);
        j0.g.a0(parcel, 46, this.O, i);
        j0.g.h0(parcel, 47, 4);
        parcel.writeInt(this.P ? 1 : 0);
        j0.g.V(parcel, 48, this.Q);
        j0.g.b0(parcel, 49, this.R);
        j0.g.b0(parcel, 50, this.S);
        j0.g.b0(parcel, 51, this.T);
        j0.g.h0(parcel, 52, 4);
        parcel.writeInt(this.U ? 1 : 0);
        j0.g.Z(parcel, 53, this.V);
        j0.g.b0(parcel, 54, this.W);
        j0.g.d0(parcel, 55, this.X);
        j0.g.h0(parcel, 56, 4);
        parcel.writeInt(this.Y);
        j0.g.h0(parcel, 57, 4);
        parcel.writeInt(this.Z ? 1 : 0);
        j0.g.h0(parcel, 58, 4);
        parcel.writeInt(this.f3386a0 ? 1 : 0);
        j0.g.h0(parcel, 59, 4);
        parcel.writeInt(this.f3388b0 ? 1 : 0);
        j0.g.d0(parcel, 60, this.f3390c0);
        j0.g.b0(parcel, 61, this.f3392d0);
        j0.g.a0(parcel, 63, this.f3394e0, i);
        j0.g.b0(parcel, 64, this.f3396f0);
        j0.g.V(parcel, 65, this.f3398g0);
        j0.g.m0(parcel, iI0);
    }
}
