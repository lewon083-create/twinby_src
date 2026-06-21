package yads;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class u23 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f43531b;

    public u23(int i, long j10) {
        this.f43530a = i;
        this.f43531b = j10;
    }

    public static u23 a(Parcel parcel) {
        return new u23(parcel.readInt(), parcel.readLong());
    }
}
