package zk;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class f0 implements Closeable {
    public final byte[] a() throws IOException {
        long jB = b();
        if (jB > 2147483647L) {
            throw new IOException(pe.a.d(jB, "Cannot buffer entire body for content length: "));
        }
        nl.i iVarH = h();
        try {
            byte[] bArrN = iVarH.n();
            iVarH.close();
            int length = bArrN.length;
            if (jB == -1 || jB == length) {
                return bArrN;
            }
            throw new IOException("Content-Length (" + jB + ") and stream length (" + length + ") disagree");
        } finally {
        }
    }

    public abstract long b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        al.b.c(h());
    }

    public abstract p d();

    public abstract nl.i h();
}
