package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import j0.g;
import kb.i;
import qa.a;

/* JADX INFO: loaded from: classes.dex */
public final class LatLng extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLng> CREATOR = new i(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f14415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f14416c;

    public LatLng(double d10, double d11) {
        if (-180.0d > d11 || d11 >= 180.0d) {
            this.f14416c = ((((d11 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d;
        } else {
            this.f14416c = d11;
        }
        this.f14415b = Math.max(-90.0d, Math.min(90.0d, d10));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLng)) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        return Double.doubleToLongBits(this.f14415b) == Double.doubleToLongBits(latLng.f14415b) && Double.doubleToLongBits(this.f14416c) == Double.doubleToLongBits(latLng.f14416c);
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f14415b);
        int i = ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) + 31;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f14416c);
        return (i * 31) + ((int) ((jDoubleToLongBits2 >>> 32) ^ jDoubleToLongBits2));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(60);
        sb2.append("lat/lng: (");
        sb2.append(this.f14415b);
        sb2.append(StringUtils.COMMA);
        sb2.append(this.f14416c);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = g.i0(parcel, 20293);
        g.h0(parcel, 2, 8);
        parcel.writeDouble(this.f14415b);
        g.h0(parcel, 3, 8);
        parcel.writeDouble(this.f14416c);
        g.m0(parcel, iI0);
    }
}
