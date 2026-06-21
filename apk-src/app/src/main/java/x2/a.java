package x2;

import android.media.MediaDataSource;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends MediaDataSource {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f35712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f35713c;

    public a(f fVar) {
        this.f35713c = fVar;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j10, byte[] bArr, int i, int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (j10 < 0) {
            return -1;
        }
        try {
            long j11 = this.f35712b;
            f fVar = this.f35713c;
            if (j11 != j10) {
                if (j11 >= 0 && j10 >= j11 + ((long) fVar.f35714b.available())) {
                    return -1;
                }
                fVar.b(j10);
                this.f35712b = j10;
            }
            if (i10 > fVar.f35714b.available()) {
                i10 = fVar.f35714b.available();
            }
            int i11 = fVar.read(bArr, i, i10);
            if (i11 >= 0) {
                this.f35712b += (long) i11;
                return i11;
            }
        } catch (IOException unused) {
        }
        this.f35712b = -1L;
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
