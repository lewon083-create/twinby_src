package gl;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class t implements nl.x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nl.i f20253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f20255d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f20256e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f20257f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f20258g;

    public t(nl.i source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f20253b = source;
    }

    @Override // nl.x
    public final long D(nl.g sink, long j10) throws IOException {
        int i;
        int i10;
        Intrinsics.checkNotNullParameter(sink, "sink");
        do {
            int i11 = this.f20257f;
            nl.i iVar = this.f20253b;
            if (i11 == 0) {
                iVar.skip(this.f20258g);
                this.f20258g = 0;
                if ((this.f20255d & 4) == 0) {
                    i = this.f20256e;
                    int iR = al.b.r(iVar);
                    this.f20257f = iR;
                    this.f20254c = iR;
                    int i12 = iVar.readByte() & 255;
                    this.f20255d = iVar.readByte() & 255;
                    Logger logger = u.f20259e;
                    if (logger.isLoggable(Level.FINE)) {
                        nl.j jVar = g.f20193a;
                        logger.fine(g.a(true, this.f20256e, this.f20254c, i12, this.f20255d));
                    }
                    i10 = iVar.readInt() & Integer.MAX_VALUE;
                    this.f20256e = i10;
                    if (i12 != 9) {
                        throw new IOException(i12 + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long jD = iVar.D(sink, Math.min(8192L, i11));
                if (jD != -1) {
                    this.f20257f -= (int) jD;
                    return jD;
                }
            }
            return -1L;
        } while (i10 == i);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // nl.x
    public final nl.z timeout() {
        return this.f20253b.timeout();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
