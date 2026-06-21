package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import j0.g;
import pa.l0;
import qa.a;
import tb.f;
import tb.l;
import tb.s;
import tb.t;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class FullWallet extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<FullWallet> CREATOR = new l0(17);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f14424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f14425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public t f14426d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f14427e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s f14428f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public s f14429g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String[] f14430h;
    public UserAddress i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public UserAddress f14431j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f[] f14432k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public l f14433l;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = g.i0(parcel, 20293);
        g.b0(parcel, 2, this.f14424b);
        g.b0(parcel, 3, this.f14425c);
        g.a0(parcel, 4, this.f14426d, i);
        g.b0(parcel, 5, this.f14427e);
        g.a0(parcel, 6, this.f14428f, i);
        g.a0(parcel, 7, this.f14429g, i);
        g.c0(parcel, 8, this.f14430h);
        g.a0(parcel, 9, this.i, i);
        g.a0(parcel, 10, this.f14431j, i);
        g.e0(parcel, 11, this.f14432k, i);
        g.a0(parcel, 12, this.f14433l, i);
        g.m0(parcel, iI0);
    }
}
