package fl;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import nl.g;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f19495e;

    @Override // fl.a, nl.x
    public final long D(g sink, long j10) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (this.f19481c) {
            throw new IllegalStateException("closed");
        }
        if (this.f19495e) {
            return -1L;
        }
        long jD = super.D(sink, 8192L);
        if (jD != -1) {
            return jD;
        }
        this.f19495e = true;
        a();
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f19481c) {
            return;
        }
        if (!this.f19495e) {
            a();
        }
        this.f19481c = true;
    }
}
