package gl;

import java.io.IOException;
import java.io.InterruptedIOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class w implements nl.x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f20267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f20268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final nl.g f20269d = new nl.g();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final nl.g f20270e = new nl.g();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f20271f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y f20272g;

    public w(y yVar, long j10, boolean z5) {
        this.f20272g = yVar;
        this.f20267b = j10;
        this.f20268c = z5;
    }

    @Override // nl.x
    public final long D(nl.g sink, long j10) throws Throwable {
        b bVar;
        Throwable d0Var;
        boolean z5;
        long jD;
        Intrinsics.checkNotNullParameter(sink, "sink");
        do {
            y yVar = this.f20272g;
            synchronized (yVar) {
                yVar.f20283k.h();
                try {
                    synchronized (yVar) {
                        bVar = yVar.f20285m;
                    }
                } catch (Throwable th2) {
                    yVar.f20283k.k();
                    throw th2;
                }
            }
            if (bVar != null && !this.f20268c) {
                d0Var = yVar.f20286n;
                if (d0Var == null) {
                    synchronized (yVar) {
                        b bVar2 = yVar.f20285m;
                        Intrinsics.b(bVar2);
                        d0Var = new d0(bVar2);
                    }
                }
            }
            d0Var = null;
            if (this.f20271f) {
                throw new IOException("stream closed");
            }
            nl.g gVar = this.f20270e;
            long j11 = gVar.f29540c;
            z5 = false;
            if (j11 > 0) {
                jD = gVar.D(sink, Math.min(8192L, j11));
                long j12 = yVar.f20276c + jD;
                yVar.f20276c = j12;
                long j13 = j12 - yVar.f20277d;
                if (d0Var == null && j13 >= yVar.f20275b.f20235q.a() / 2) {
                    yVar.f20275b.m(yVar.f20274a, j13);
                    yVar.f20277d = yVar.f20276c;
                }
            } else {
                if (!this.f20268c && d0Var == null) {
                    try {
                        yVar.wait();
                        z5 = true;
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                }
                jD = -1;
            }
            yVar.f20283k.k();
            Unit unit = Unit.f27471a;
        } while (z5);
        if (jD != -1) {
            return jD;
        }
        if (d0Var == null) {
            return -1L;
        }
        throw d0Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j10;
        y yVar = this.f20272g;
        synchronized (yVar) {
            this.f20271f = true;
            nl.g gVar = this.f20270e;
            j10 = gVar.f29540c;
            gVar.a();
            yVar.notifyAll();
            Unit unit = Unit.f27471a;
        }
        if (j10 > 0) {
            y yVar2 = this.f20272g;
            byte[] bArr = al.b.f1041a;
            yVar2.f20275b.j(j10);
        }
        this.f20272g.a();
    }

    @Override // nl.x
    public final nl.z timeout() {
        return this.f20272g.f20283k;
    }
}
