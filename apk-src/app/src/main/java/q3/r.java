package q3;

import com.google.android.gms.internal.measurement.h5;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import m3.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends BufferedOutputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f31681b;

    public final void a(OutputStream outputStream) {
        h5.r(this.f31681b);
        ((BufferedOutputStream) this).out = outputStream;
        ((BufferedOutputStream) this).count = 0;
        this.f31681b = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        this.f31681b = true;
        try {
            flush();
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            ((BufferedOutputStream) this).out.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        if (th == null) {
            return;
        }
        String str = z.f28608a;
        throw th;
    }
}
