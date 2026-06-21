package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import com.google.android.gms.common.internal.ReflectedParcelable;
import gb.i;
import gb.m;
import j0.g;
import java.util.Arrays;
import pa.c0;
import qa.a;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class LocationRequest extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new com.google.android.material.datepicker.a(28);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f14401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f14402d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f14403e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f14404f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f14405g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f14406h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f14407j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f14408k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f14409l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f14410m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final WorkSource f14411n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final i f14412o;

    public LocationRequest(int i, long j10, long j11, long j12, long j13, long j14, int i10, float f10, boolean z5, long j15, int i11, int i12, boolean z10, WorkSource workSource, i iVar) {
        this.f14400b = i;
        if (i == 105) {
            this.f14401c = Long.MAX_VALUE;
        } else {
            this.f14401c = j10;
        }
        this.f14402d = j11;
        this.f14403e = j12;
        this.f14404f = j13 == Long.MAX_VALUE ? j14 : Math.min(Math.max(1L, j13 - SystemClock.elapsedRealtime()), j14);
        this.f14405g = i10;
        this.f14406h = f10;
        this.i = z5;
        this.f14407j = j15 != -1 ? j15 : j10;
        this.f14408k = i11;
        this.f14409l = i12;
        this.f14410m = z10;
        this.f14411n = workSource;
        this.f14412o = iVar;
    }

    public static LocationRequest c() {
        return new LocationRequest(102, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, true, 3600000L, 0, 0, false, new WorkSource(), null);
    }

    public static String g(long j10) {
        String string;
        if (j10 == Long.MAX_VALUE) {
            return "∞";
        }
        StringBuilder sb2 = m.f20095b;
        synchronized (sb2) {
            sb2.setLength(0);
            m.a(j10, sb2);
            string = sb2.toString();
        }
        return string;
    }

    public final boolean e() {
        long j10 = this.f14403e;
        return j10 > 0 && (j10 >> 1) >= this.f14401c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationRequest)) {
            return false;
        }
        LocationRequest locationRequest = (LocationRequest) obj;
        int i = this.f14400b;
        if (i != locationRequest.f14400b) {
            return false;
        }
        if ((i == 105 || this.f14401c == locationRequest.f14401c) && this.f14402d == locationRequest.f14402d && e() == locationRequest.e()) {
            return (!e() || this.f14403e == locationRequest.f14403e) && this.f14404f == locationRequest.f14404f && this.f14405g == locationRequest.f14405g && this.f14406h == locationRequest.f14406h && this.i == locationRequest.i && this.f14408k == locationRequest.f14408k && this.f14409l == locationRequest.f14409l && this.f14410m == locationRequest.f14410m && this.f14411n.equals(locationRequest.f14411n) && c0.m(this.f14412o, locationRequest.f14412o);
        }
        return false;
    }

    public final void f(long j10) {
        c0.a("intervalMillis must be greater than or equal to 0", j10 >= 0);
        long j11 = this.f14402d;
        long j12 = this.f14401c;
        if (j11 == j12 / 6) {
            this.f14402d = j10 / 6;
        }
        if (this.f14407j == j12) {
            this.f14407j = j10;
        }
        this.f14401c = j10;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f14400b), Long.valueOf(this.f14401c), Long.valueOf(this.f14402d), this.f14411n});
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0133 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.LocationRequest.toString():java.lang.String");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = g.i0(parcel, 20293);
        int i10 = this.f14400b;
        g.h0(parcel, 1, 4);
        parcel.writeInt(i10);
        long j10 = this.f14401c;
        g.h0(parcel, 2, 8);
        parcel.writeLong(j10);
        long j11 = this.f14402d;
        g.h0(parcel, 3, 8);
        parcel.writeLong(j11);
        g.h0(parcel, 6, 4);
        parcel.writeInt(this.f14405g);
        float f10 = this.f14406h;
        g.h0(parcel, 7, 4);
        parcel.writeFloat(f10);
        g.h0(parcel, 8, 8);
        parcel.writeLong(this.f14403e);
        g.h0(parcel, 9, 4);
        parcel.writeInt(this.i ? 1 : 0);
        g.h0(parcel, 10, 8);
        parcel.writeLong(this.f14404f);
        long j12 = this.f14407j;
        g.h0(parcel, 11, 8);
        parcel.writeLong(j12);
        g.h0(parcel, 12, 4);
        parcel.writeInt(this.f14408k);
        g.h0(parcel, 13, 4);
        parcel.writeInt(this.f14409l);
        g.h0(parcel, 15, 4);
        parcel.writeInt(this.f14410m ? 1 : 0);
        g.a0(parcel, 16, this.f14411n, i);
        g.a0(parcel, 17, this.f14412o, i);
        g.m0(parcel, iI0);
    }
}
