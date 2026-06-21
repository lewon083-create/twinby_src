package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class p63 extends m23 {
    public static final Parcelable.Creator<p63> CREATOR = new o63();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f41829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f41830c;

    public p63(long j10, long j11) {
        this.f41829b = j10;
        this.f41830c = j11;
    }

    public static long a(long j10, lb2 lb2Var) {
        long jM = lb2Var.m();
        if ((128 & jM) != 0) {
            return 8589934591L & ((((jM & 1) << 32) | lb2Var.n()) + j10);
        }
        return -9223372036854775807L;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f41829b);
        parcel.writeLong(this.f41830c);
    }
}
