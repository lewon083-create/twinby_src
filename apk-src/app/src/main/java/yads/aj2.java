package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class aj2 extends m23 {
    public static final Parcelable.Creator<aj2> CREATOR = new zi2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f36755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f36756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f36757d;

    public aj2(long j10, byte[] bArr, long j11) {
        this.f36755b = j11;
        this.f36756c = j10;
        this.f36757d = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f36755b);
        parcel.writeLong(this.f36756c);
        parcel.writeByteArray(this.f36757d);
    }

    public aj2(Parcel parcel) {
        this.f36755b = parcel.readLong();
        this.f36756c = parcel.readLong();
        this.f36757d = (byte[]) lb3.a((Object) parcel.createByteArray());
    }
}
