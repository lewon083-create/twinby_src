package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import j0.g;
import java.util.ArrayList;
import pa.l0;
import qa.a;
import ub.f;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class CommonWalletObject extends a {
    public static final Parcelable.Creator<CommonWalletObject> CREATOR = new l0(28);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f14444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f14445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f14446d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f14447e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f14448f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f14449g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f14450h;
    public String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f14451j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public f f14453l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f14455n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f14456o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f14458q;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList f14452k = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f14454m = new ArrayList();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList f14457p = new ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ArrayList f14459r = new ArrayList();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ArrayList f14460s = new ArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ArrayList f14461t = new ArrayList();

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = g.i0(parcel, 20293);
        g.b0(parcel, 2, this.f14444b);
        g.b0(parcel, 3, this.f14445c);
        g.b0(parcel, 4, this.f14446d);
        g.b0(parcel, 5, this.f14447e);
        g.b0(parcel, 6, this.f14448f);
        g.b0(parcel, 7, this.f14449g);
        g.b0(parcel, 8, this.f14450h);
        g.b0(parcel, 9, this.i);
        int i10 = this.f14451j;
        g.h0(parcel, 10, 4);
        parcel.writeInt(i10);
        g.f0(parcel, 11, this.f14452k);
        g.a0(parcel, 12, this.f14453l, i);
        g.f0(parcel, 13, this.f14454m);
        g.b0(parcel, 14, this.f14455n);
        g.b0(parcel, 15, this.f14456o);
        g.f0(parcel, 16, this.f14457p);
        boolean z5 = this.f14458q;
        g.h0(parcel, 17, 4);
        parcel.writeInt(z5 ? 1 : 0);
        g.f0(parcel, 18, this.f14459r);
        g.f0(parcel, 19, this.f14460s);
        g.f0(parcel, 20, this.f14461t);
        g.m0(parcel, iI0);
    }
}
