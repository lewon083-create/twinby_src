package nl;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f29524b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f29525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f29526d;

    public c(OutputStream out, w timeout) {
        Intrinsics.checkNotNullParameter(out, "out");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        this.f29526d = out;
        this.f29525c = timeout;
    }

    @Override // nl.v, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i = this.f29524b;
        Object obj = this.f29526d;
        switch (i) {
            case 0:
                c cVar = (c) obj;
                w wVar = this.f29525c;
                wVar.h();
                try {
                    cVar.close();
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
                ((OutputStream) obj).close();
                return;
        }
    }

    @Override // nl.v, java.io.Flushable
    public final void flush() throws IOException {
        int i = this.f29524b;
        Object obj = this.f29526d;
        switch (i) {
            case 0:
                c cVar = (c) obj;
                w wVar = this.f29525c;
                wVar.h();
                try {
                    cVar.flush();
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
                ((OutputStream) obj).flush();
                return;
        }
    }

    @Override // nl.v
    public final z timeout() {
        switch (this.f29524b) {
        }
        return this.f29525c;
    }

    public final String toString() {
        switch (this.f29524b) {
            case 0:
                return "AsyncTimeout.sink(" + ((c) this.f29526d) + ')';
            default:
                return "sink(" + ((OutputStream) this.f29526d) + ')';
        }
    }

    @Override // nl.v
    public final void write(g source, long j10) throws IOException {
        long j11;
        int i = this.f29524b;
        Object obj = this.f29526d;
        w wVar = this.f29525c;
        Intrinsics.checkNotNullParameter(source, "source");
        switch (i) {
            case 0:
                hl.d.h(source.f29540c, 0L, j10);
                for (long j12 = j10; j12 > 0; j12 -= j11) {
                    s sVar = source.f29539b;
                    Intrinsics.b(sVar);
                    j11 = 0;
                    while (true) {
                        if (j11 < 65536) {
                            j11 += (long) (sVar.f29567c - sVar.f29566b);
                            if (j11 >= j12) {
                                j11 = j12;
                            } else {
                                sVar = sVar.f29570f;
                                Intrinsics.b(sVar);
                            }
                        }
                    }
                    c cVar = (c) obj;
                    wVar.h();
                    try {
                        cVar.write(source, j11);
                        Unit unit = Unit.f27471a;
                        if (wVar.i()) {
                            throw wVar.k(null);
                        }
                    } catch (IOException e3) {
                        if (!wVar.i()) {
                            throw e3;
                        }
                        throw wVar.k(e3);
                    } finally {
                        wVar.i();
                    }
                }
                return;
            default:
                hl.d.h(source.f29540c, 0L, j10);
                long j13 = j10;
                while (j13 > 0) {
                    wVar.f();
                    s sVar2 = source.f29539b;
                    Intrinsics.b(sVar2);
                    int iMin = (int) Math.min(j13, sVar2.f29567c - sVar2.f29566b);
                    ((OutputStream) obj).write(sVar2.f29565a, sVar2.f29566b, iMin);
                    int i10 = sVar2.f29566b + iMin;
                    sVar2.f29566b = i10;
                    long j14 = iMin;
                    j13 -= j14;
                    source.f29540c -= j14;
                    if (i10 == sVar2.f29567c) {
                        source.f29539b = sVar2.a();
                        t.a(sVar2);
                    }
                }
                return;
        }
    }

    public c(w wVar, c cVar) {
        this.f29525c = wVar;
        this.f29526d = cVar;
    }
}
