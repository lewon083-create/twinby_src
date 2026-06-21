package bi;

import android.media.MediaDataSource;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends MediaDataSource {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte[] f2153b;

    public c(byte[] bArr) {
        this.f2153b = bArr;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.f2153b.length;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j10, byte[] bArr, int i, int i10) {
        byte[] bArr2 = this.f2153b;
        if (j10 >= bArr2.length) {
            return -1;
        }
        if (((long) i10) + j10 > bArr2.length) {
            i10 = (int) (((long) bArr2.length) - j10);
        }
        System.arraycopy(bArr2, (int) j10, bArr, i, i10);
        return i10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
