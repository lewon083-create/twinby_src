package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ii extends qa.a {
    public static final Parcelable.Creator<ii> CREATOR = new ji(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ParcelFileDescriptor f6495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f6497d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f6498e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f6499f;

    public ii(ParcelFileDescriptor parcelFileDescriptor, boolean z5, boolean z10, long j10, boolean z11) {
        this.f6495b = parcelFileDescriptor;
        this.f6496c = z5;
        this.f6497d = z10;
        this.f6498e = j10;
        this.f6499f = z11;
    }

    public final synchronized boolean c() {
        return this.f6495b != null;
    }

    public final synchronized ParcelFileDescriptor.AutoCloseInputStream e() {
        if (this.f6495b == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.f6495b);
        this.f6495b = null;
        return autoCloseInputStream;
    }

    public final synchronized boolean f() {
        return this.f6497d;
    }

    public final synchronized boolean g() {
        return this.f6499f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ParcelFileDescriptor parcelFileDescriptor;
        boolean z5;
        long j10;
        int iI0 = j0.g.i0(parcel, 20293);
        synchronized (this) {
            parcelFileDescriptor = this.f6495b;
        }
        j0.g.a0(parcel, 2, parcelFileDescriptor, i);
        synchronized (this) {
            z5 = this.f6496c;
        }
        j0.g.h0(parcel, 3, 4);
        parcel.writeInt(z5 ? 1 : 0);
        boolean zF = f();
        j0.g.h0(parcel, 4, 4);
        parcel.writeInt(zF ? 1 : 0);
        synchronized (this) {
            j10 = this.f6498e;
        }
        j0.g.h0(parcel, 5, 8);
        parcel.writeLong(j10);
        boolean zG = g();
        j0.g.h0(parcel, 6, 4);
        parcel.writeInt(zG ? 1 : 0);
        j0.g.m0(parcel, iI0);
    }

    public ii() {
        this(null, false, false, 0L, false);
    }
}
