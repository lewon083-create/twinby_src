package nl;

import java.io.IOException;
import java.io.InputStream;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f29527b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f29528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f29529d;

    public d(InputStream input, z timeout) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        this.f29528c = input;
        this.f29529d = timeout;
    }

    @Override // nl.x
    public final long D(g sink, long j10) {
        switch (this.f29527b) {
            case 0:
                Intrinsics.checkNotNullParameter(sink, "sink");
                w wVar = (w) this.f29528c;
                d dVar = (d) this.f29529d;
                wVar.h();
                try {
                    long jD = dVar.D(sink, 8192L);
                    if (wVar.i()) {
                        throw wVar.k(null);
                    }
                    return jD;
                } catch (IOException e3) {
                    if (wVar.i()) {
                        throw wVar.k(e3);
                    }
                    throw e3;
                } finally {
                    wVar.i();
                }
            default:
                Intrinsics.checkNotNullParameter(sink, "sink");
                try {
                    ((z) this.f29529d).f();
                    s sVarJ = sink.J(1);
                    int i = ((InputStream) this.f29528c).read(sVarJ.f29565a, sVarJ.f29567c, (int) Math.min(8192L, 8192 - sVarJ.f29567c));
                    if (i == -1) {
                        if (sVarJ.f29566b == sVarJ.f29567c) {
                            sink.f29539b = sVarJ.a();
                            t.a(sVarJ);
                        }
                        return -1L;
                    }
                    sVarJ.f29567c += i;
                    long j11 = i;
                    sink.f29540c += j11;
                    return j11;
                } catch (AssertionError e7) {
                    if (i0.o.y(e7)) {
                        throw new IOException(e7);
                    }
                    throw e7;
                }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.f29527b;
        Object obj = this.f29528c;
        switch (i) {
            case 0:
                w wVar = (w) obj;
                d dVar = (d) this.f29529d;
                wVar.h();
                try {
                    dVar.close();
                    Unit unit = Unit.f27471a;
                    if (wVar.i()) {
                        throw wVar.k(null);
                    }
                    return;
                } catch (IOException e3) {
                    if (!wVar.i()) {
                        throw e3;
                    }
                    throw wVar.k(e3);
                } finally {
                    wVar.i();
                }
            default:
                ((InputStream) obj).close();
                return;
        }
    }

    @Override // nl.x
    public final z timeout() {
        switch (this.f29527b) {
            case 0:
                return (w) this.f29528c;
            default:
                return (z) this.f29529d;
        }
    }

    public final String toString() {
        switch (this.f29527b) {
            case 0:
                return "AsyncTimeout.source(" + ((d) this.f29529d) + ')';
            default:
                return "source(" + ((InputStream) this.f29528c) + ')';
        }
    }

    public d(w wVar, d dVar) {
        this.f29528c = wVar;
        this.f29529d = dVar;
    }
}
