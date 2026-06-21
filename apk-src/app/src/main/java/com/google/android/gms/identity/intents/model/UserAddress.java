package com.google.android.gms.identity.intents.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import j0.g;
import qa.a;
import ub.i;

/* JADX INFO: loaded from: classes.dex */
public final class UserAddress extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<UserAddress> CREATOR = new i(14);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f2646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f2647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f2648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f2649e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f2650f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f2651g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f2652h;
    public String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f2653j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f2654k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f2655l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f2656m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f2657n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f2658o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f2659p;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = g.i0(parcel, 20293);
        g.b0(parcel, 2, this.f2646b);
        g.b0(parcel, 3, this.f2647c);
        g.b0(parcel, 4, this.f2648d);
        g.b0(parcel, 5, this.f2649e);
        g.b0(parcel, 6, this.f2650f);
        g.b0(parcel, 7, this.f2651g);
        g.b0(parcel, 8, this.f2652h);
        g.b0(parcel, 9, this.i);
        g.b0(parcel, 10, this.f2653j);
        g.b0(parcel, 11, this.f2654k);
        g.b0(parcel, 12, this.f2655l);
        g.b0(parcel, 13, this.f2656m);
        boolean z5 = this.f2657n;
        g.h0(parcel, 14, 4);
        parcel.writeInt(z5 ? 1 : 0);
        g.b0(parcel, 15, this.f2658o);
        g.b0(parcel, 16, this.f2659p);
        g.m0(parcel, iI0);
    }
}
