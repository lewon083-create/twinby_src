package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f14562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f14563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f14564d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q f14565e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f14566f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f14567g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f14568h;

    public c(q qVar, q qVar2, e eVar, q qVar3, int i) {
        Objects.requireNonNull(qVar, "start cannot be null");
        Objects.requireNonNull(qVar2, "end cannot be null");
        Objects.requireNonNull(eVar, "validator cannot be null");
        this.f14562b = qVar;
        this.f14563c = qVar2;
        this.f14565e = qVar3;
        this.f14566f = i;
        this.f14564d = eVar;
        if (qVar3 != null && qVar.f14612b.compareTo(qVar3.f14612b) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (qVar3 != null && qVar3.f14612b.compareTo(qVar2.f14612b) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i < 0 || i > x.c(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f14568h = qVar.d(qVar2) + 1;
        this.f14567g = (qVar2.f14614d - qVar.f14614d) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f14562b.equals(cVar.f14562b) && this.f14563c.equals(cVar.f14563c) && Objects.equals(this.f14565e, cVar.f14565e) && this.f14566f == cVar.f14566f && this.f14564d.equals(cVar.f14564d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14562b, this.f14563c, this.f14565e, Integer.valueOf(this.f14566f), this.f14564d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f14562b, 0);
        parcel.writeParcelable(this.f14563c, 0);
        parcel.writeParcelable(this.f14565e, 0);
        parcel.writeParcelable(this.f14564d, 0);
        parcel.writeInt(this.f14566f);
    }
}
