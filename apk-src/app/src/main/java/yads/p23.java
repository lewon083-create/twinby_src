package yads;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class p23 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f41809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f41810c;

    public p23(int i, long j10, long j11) {
        this.f41808a = i;
        this.f41809b = j10;
        this.f41810c = j11;
    }

    public static p23 a(Parcel parcel) {
        return new p23(parcel.readInt(), parcel.readLong(), parcel.readLong());
    }
}
