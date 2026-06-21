package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class tv0 extends qa.a {
    public static final Parcelable.Creator<tv0> CREATOR = new ji(22);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public wd f10733c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f10734d;

    public tv0(int i, byte[] bArr) {
        this.f10732b = i;
        this.f10734d = bArr;
        j();
    }

    public final void j() {
        wd wdVar = this.f10733c;
        if (wdVar != null || this.f10734d == null) {
            if (wdVar == null || this.f10734d != null) {
                if (wdVar != null && this.f10734d != null) {
                    throw new IllegalStateException("Invalid internal representation - full");
                }
                if (wdVar != null || this.f10734d != null) {
                    throw new IllegalStateException("Impossible");
                }
                throw new IllegalStateException("Invalid internal representation - empty");
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.h0(parcel, 1, 4);
        parcel.writeInt(this.f10732b);
        byte[] bArrB = this.f10734d;
        if (bArrB == null) {
            bArrB = this.f10733c.b();
        }
        j0.g.W(parcel, 2, bArrB);
        j0.g.m0(parcel, iI0);
    }
}
