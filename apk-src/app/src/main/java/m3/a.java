package m3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends OutputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FileOutputStream f28537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f28538c = false;

    public a(File file) {
        this.f28537b = new FileOutputStream(file);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        FileOutputStream fileOutputStream = this.f28537b;
        if (this.f28538c) {
            return;
        }
        this.f28538c = true;
        flush();
        try {
            fileOutputStream.getFD().sync();
        } catch (IOException e3) {
            b.t("AtomicFile", "Failed to sync file descriptor:", e3);
        }
        fileOutputStream.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f28537b.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        this.f28537b.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        this.f28537b.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i10) throws IOException {
        this.f28537b.write(bArr, i, i10);
    }
}
