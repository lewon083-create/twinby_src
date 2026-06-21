package yads;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class tg0 extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f43320b;

    public tg0(BufferedInputStream bufferedInputStream, long j10) {
        super(bufferedInputStream);
        this.f43319a = j10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = super.read();
        if (i != -1) {
            this.f43320b++;
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i10) throws IOException {
        int i11 = super.read(bArr, i, i10);
        if (i11 != -1) {
            this.f43320b += (long) i11;
        }
        return i11;
    }
}
