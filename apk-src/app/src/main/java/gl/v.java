package gl;

import java.io.InterruptedIOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class v implements nl.v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f20263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nl.g f20264c = new nl.g();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f20265d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y f20266e;

    public v(y yVar, boolean z5) {
        this.f20266e = yVar;
        this.f20263b = z5;
    }

    /* JADX WARN: Finally extract failed */
    public final void a(boolean z5) {
        long jMin;
        boolean z10;
        y yVar = this.f20266e;
        synchronized (yVar) {
            try {
                yVar.f20284l.h();
                while (yVar.f20278e >= yVar.f20279f && !this.f20263b && !this.f20265d) {
                    try {
                        synchronized (yVar) {
                            b bVar = yVar.f20285m;
                            if (bVar != null) {
                                break;
                            }
                            try {
                                yVar.wait();
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                throw new InterruptedIOException();
                            }
                        }
                    } catch (Throwable th2) {
                        yVar.f20284l.k();
                        throw th2;
                    }
                }
                yVar.f20284l.k();
                yVar.b();
                jMin = Math.min(yVar.f20279f - yVar.f20278e, this.f20264c.f29540c);
                yVar.f20278e += jMin;
                z10 = z5 && jMin == this.f20264c.f29540c;
                Unit unit = Unit.f27471a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f20266e.f20284l.h();
        try {
            y yVar2 = this.f20266e;
            yVar2.f20275b.k(yVar2.f20274a, z10, this.f20264c, jMin);
        } finally {
            this.f20266e.f20284l.k();
        }
    }

    @Override // nl.v, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z5;
        y yVar = this.f20266e;
        byte[] bArr = al.b.f1041a;
        synchronized (yVar) {
            if (this.f20265d) {
                return;
            }
            synchronized (yVar) {
                z5 = yVar.f20285m == null;
                Unit unit = Unit.f27471a;
            }
            y yVar2 = this.f20266e;
            if (!yVar2.f20282j.f20263b) {
                if (this.f20264c.f29540c > 0) {
                    while (this.f20264c.f29540c > 0) {
                        a(true);
                    }
                } else if (z5) {
                    yVar2.f20275b.k(yVar2.f20274a, true, null, 0L);
                }
            }
            synchronized (this.f20266e) {
                this.f20265d = true;
                Unit unit2 = Unit.f27471a;
            }
            this.f20266e.f20275b.flush();
            this.f20266e.a();
        }
    }

    @Override // nl.v, java.io.Flushable
    public final void flush() {
        y yVar = this.f20266e;
        byte[] bArr = al.b.f1041a;
        synchronized (yVar) {
            yVar.b();
            Unit unit = Unit.f27471a;
        }
        while (this.f20264c.f29540c > 0) {
            a(false);
            this.f20266e.f20275b.flush();
        }
    }

    @Override // nl.v
    public final nl.z timeout() {
        return this.f20266e.f20284l;
    }

    @Override // nl.v
    public final void write(nl.g source, long j10) {
        Intrinsics.checkNotNullParameter(source, "source");
        byte[] bArr = al.b.f1041a;
        nl.g gVar = this.f20264c;
        gVar.write(source, j10);
        while (gVar.f29540c >= 16384) {
            a(false);
        }
    }
}
