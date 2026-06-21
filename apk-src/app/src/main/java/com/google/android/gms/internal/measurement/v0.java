package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends qa.a {
    public static final Parcelable.Creator<v0> CREATOR = new u0(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Intent f14014d;

    public v0(int i, Intent intent, String str) {
        this.f14012b = i;
        this.f14013c = str;
        this.f14014d = intent;
    }

    public static v0 a(Activity activity) {
        return new v0(activity.hashCode(), activity.getIntent(), activity.getClass().getCanonicalName());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return this.f14012b == v0Var.f14012b && Objects.equals(this.f14013c, v0Var.f14013c) && Objects.equals(this.f14014d, v0Var.f14014d);
    }

    public final int hashCode() {
        return this.f14012b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.h0(parcel, 1, 4);
        parcel.writeInt(this.f14012b);
        j0.g.b0(parcel, 2, this.f14013c);
        j0.g.a0(parcel, 3, this.f14014d, i);
        j0.g.m0(parcel, iI0);
    }
}
