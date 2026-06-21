package nl;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class n implements x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f29551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Inflater f29552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f29553d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f29554e;

    public n(r source, Inflater inflater) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.f29551b = source;
        this.f29552c = inflater;
    }

    @Override // nl.x
    public final long D(g sink, long j10) throws IOException {
        r rVar;
        long j11;
        Inflater inflater = this.f29552c;
        Intrinsics.checkNotNullParameter(sink, "sink");
        do {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (this.f29554e) {
                throw new IllegalStateException("closed");
            }
            try {
                s sVarJ = sink.J(1);
                int iMin = (int) Math.min(8192L, 8192 - sVarJ.f29567c);
                boolean zNeedsInput = inflater.needsInput();
                rVar = this.f29551b;
                if (zNeedsInput && !rVar.a()) {
                    s sVar = rVar.f29563c.f29539b;
                    Intrinsics.b(sVar);
                    int i = sVar.f29567c;
                    int i10 = sVar.f29566b;
                    int i11 = i - i10;
                    this.f29553d = i11;
                    inflater.setInput(sVar.f29565a, i10, i11);
                }
                int iInflate = inflater.inflate(sVarJ.f29565a, sVarJ.f29567c, iMin);
                int i12 = this.f29553d;
                if (i12 != 0) {
                    int remaining = i12 - inflater.getRemaining();
                    this.f29553d -= remaining;
                    rVar.skip(remaining);
                }
                if (iInflate > 0) {
                    sVarJ.f29567c += iInflate;
                    j11 = iInflate;
                    sink.f29540c += j11;
                } else {
                    if (sVarJ.f29566b == sVarJ.f29567c) {
                        sink.f29539b = sVarJ.a();
                        t.a(sVarJ);
                    }
                    j11 = 0;
                }
                if (j11 > 0) {
                    return j11;
                }
                if (inflater.finished() || inflater.needsDictionary()) {
                    return -1L;
                }
            } catch (DataFormatException e3) {
                throw new IOException(e3);
            }
        } while (!rVar.a());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f29554e) {
            return;
        }
        this.f29552c.end();
        this.f29554e = true;
        this.f29551b.close();
    }

    @Override // nl.x
    public final z timeout() {
        return this.f29551b.f29562b.timeout();
    }
}
