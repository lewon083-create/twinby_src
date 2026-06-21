package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import j0.g;
import pa.l0;
import qa.a;
import tb.f;
import tb.h;
import tb.i;
import tb.s;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class MaskedWallet extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<MaskedWallet> CREATOR = new l0(21);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f14434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f14435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String[] f14436d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f14437e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s f14438f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public s f14439g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public h[] f14440h;
    public i[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public UserAddress f14441j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public UserAddress f14442k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public f[] f14443l;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = g.i0(parcel, 20293);
        g.b0(parcel, 2, this.f14434b);
        g.b0(parcel, 3, this.f14435c);
        g.c0(parcel, 4, this.f14436d);
        g.b0(parcel, 5, this.f14437e);
        g.a0(parcel, 6, this.f14438f, i);
        g.a0(parcel, 7, this.f14439g, i);
        g.e0(parcel, 8, this.f14440h, i);
        g.e0(parcel, 9, this.i, i);
        g.a0(parcel, 10, this.f14441j, i);
        g.a0(parcel, 11, this.f14442k, i);
        g.e0(parcel, 12, this.f14443l, i);
        g.m0(parcel, iI0);
    }
}
