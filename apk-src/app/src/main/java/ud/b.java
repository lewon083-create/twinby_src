package ud;

import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends OutputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f34457b;

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f34457b++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f34457b += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i10) {
        int i11;
        if (i >= 0 && i <= bArr.length && i10 >= 0 && (i11 = i + i10) <= bArr.length && i11 >= 0) {
            this.f34457b += (long) i10;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
