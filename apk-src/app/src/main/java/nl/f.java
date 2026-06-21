package nl;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends OutputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f29537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f29538c;

    public /* synthetic */ f(h hVar, int i) {
        this.f29537b = i;
        this.f29538c = hVar;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f29537b) {
            case 1:
                ((q) this.f29538c).close();
                break;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        switch (this.f29537b) {
            case 0:
                break;
            case 1:
                q qVar = (q) this.f29538c;
                if (!qVar.f29561d) {
                    qVar.flush();
                }
                break;
            default:
                ((FileOutputStream) this.f29538c).flush();
                break;
        }
    }

    public String toString() {
        switch (this.f29537b) {
            case 0:
                return ((g) this.f29538c) + ".outputStream()";
            case 1:
                return ((q) this.f29538c) + ".outputStream()";
            default:
                return super.toString();
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        switch (this.f29537b) {
            case 0:
                ((g) this.f29538c).L(i);
                return;
            case 1:
                q qVar = (q) this.f29538c;
                if (qVar.f29561d) {
                    throw new IOException("closed");
                }
                qVar.f29560c.L((byte) i);
                qVar.a();
                return;
            default:
                ((FileOutputStream) this.f29538c).write(i);
                return;
        }
    }

    public f(FileOutputStream fileOutputStream) {
        this.f29537b = 2;
        Intrinsics.checkNotNullParameter(fileOutputStream, "fileOutputStream");
        this.f29538c = fileOutputStream;
    }

    @Override // java.io.OutputStream
    public void write(byte[] b2) throws IOException {
        switch (this.f29537b) {
            case 2:
                Intrinsics.checkNotNullParameter(b2, "b");
                ((FileOutputStream) this.f29538c).write(b2);
                break;
            default:
                super.write(b2);
                break;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] data, int i, int i10) throws IOException {
        switch (this.f29537b) {
            case 0:
                Intrinsics.checkNotNullParameter(data, "data");
                ((g) this.f29538c).m623write(data, i, i10);
                return;
            case 1:
                Intrinsics.checkNotNullParameter(data, "data");
                q qVar = (q) this.f29538c;
                if (!qVar.f29561d) {
                    qVar.f29560c.m623write(data, i, i10);
                    qVar.a();
                    return;
                }
                throw new IOException("closed");
            default:
                Intrinsics.checkNotNullParameter(data, "bytes");
                ((FileOutputStream) this.f29538c).write(data, i, i10);
                return;
        }
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void d() {
    }
}
