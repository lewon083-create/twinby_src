package yads;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class fk extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FileOutputStream f38465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f38466b = false;

    public fk(File file) {
        this.f38465a = new FileOutputStream(file);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f38466b) {
            return;
        }
        this.f38466b = true;
        this.f38465a.flush();
        try {
            this.f38465a.getFD().sync();
        } catch (IOException e3) {
            kh1.d("AtomicFile", kh1.a("Failed to sync file descriptor:", e3));
        }
        this.f38465a.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f38465a.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        this.f38465a.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        this.f38465a.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i10) throws IOException {
        this.f38465a.write(bArr, i, i10);
    }
}
