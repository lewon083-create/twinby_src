package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import j0.g;
import kb.i;
import pa.c0;
import qa.a;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class Scope extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new i(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2628c;

    public Scope(int i, String str) {
        c0.g(str, "scopeUri must not be null or empty");
        this.f2627b = i;
        this.f2628c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f2628c.equals(((Scope) obj).f2628c);
    }

    public final int hashCode() {
        return this.f2628c.hashCode();
    }

    public final String toString() {
        return this.f2628c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = g.i0(parcel, 20293);
        g.h0(parcel, 1, 4);
        parcel.writeInt(this.f2627b);
        g.b0(parcel, 2, this.f2628c);
        g.m0(parcel, iI0);
    }
}
