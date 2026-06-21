package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import j0.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import pa.c0;
import qa.a;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class TokenData extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<TokenData> CREATOR = new com.google.android.material.datepicker.a(12);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Long f2581d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f2582e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f2583f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f2584g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f2585h;

    public TokenData(int i, String str, Long l10, boolean z5, boolean z10, ArrayList arrayList, String str2) {
        this.f2579b = i;
        c0.f(str);
        this.f2580c = str;
        this.f2581d = l10;
        this.f2582e = z5;
        this.f2583f = z10;
        this.f2584g = arrayList;
        this.f2585h = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        return TextUtils.equals(this.f2580c, tokenData.f2580c) && c0.m(this.f2581d, tokenData.f2581d) && this.f2582e == tokenData.f2582e && this.f2583f == tokenData.f2583f && c0.m(this.f2584g, tokenData.f2584g) && c0.m(this.f2585h, tokenData.f2585h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2580c, this.f2581d, Boolean.valueOf(this.f2582e), Boolean.valueOf(this.f2583f), this.f2584g, this.f2585h});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = g.i0(parcel, 20293);
        g.h0(parcel, 1, 4);
        parcel.writeInt(this.f2579b);
        g.b0(parcel, 2, this.f2580c);
        Long l10 = this.f2581d;
        if (l10 != null) {
            g.h0(parcel, 3, 8);
            parcel.writeLong(l10.longValue());
        }
        g.h0(parcel, 4, 4);
        parcel.writeInt(this.f2582e ? 1 : 0);
        g.h0(parcel, 5, 4);
        parcel.writeInt(this.f2583f ? 1 : 0);
        g.d0(parcel, 6, this.f2584g);
        g.b0(parcel, 7, this.f2585h);
        g.m0(parcel, iI0);
    }
}
