package nl;

import java.io.OutputStream;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class q implements h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f29559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f29560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f29561d;

    public q(v sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f29559b = sink;
        this.f29560c = new g();
    }

    @Override // nl.h
    public final h F(long j10) {
        if (this.f29561d) {
            throw new IllegalStateException("closed");
        }
        this.f29560c.M(j10);
        a();
        return this;
    }

    @Override // nl.h
    public final OutputStream G() {
        return new f(this, 1);
    }

    public final h a() {
        if (this.f29561d) {
            throw new IllegalStateException("closed");
        }
        g gVar = this.f29560c;
        long j10 = gVar.f29540c;
        if (j10 == 0) {
            j10 = 0;
        } else {
            s sVar = gVar.f29539b;
            Intrinsics.b(sVar);
            s sVar2 = sVar.f29571g;
            Intrinsics.b(sVar2);
            int i = sVar2.f29567c;
            if (i < 8192 && sVar2.f29569e) {
                j10 -= (long) (i - sVar2.f29566b);
            }
        }
        if (j10 > 0) {
            this.f29559b.write(gVar, j10);
        }
        return this;
    }

    @Override // nl.v, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        v vVar = this.f29559b;
        if (this.f29561d) {
            return;
        }
        try {
            g gVar = this.f29560c;
            long j10 = gVar.f29540c;
            if (j10 > 0) {
                vVar.write(gVar, j10);
            }
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            vVar.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f29561d = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // nl.h, nl.v, java.io.Flushable
    public final void flush() {
        if (this.f29561d) {
            throw new IllegalStateException("closed");
        }
        g gVar = this.f29560c;
        long j10 = gVar.f29540c;
        v vVar = this.f29559b;
        if (j10 > 0) {
            vVar.write(gVar, j10);
        }
        vVar.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f29561d;
    }

    @Override // nl.h
    public final long o(x source) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j10 = 0;
        while (true) {
            long jD = ((d) source).D(this.f29560c, 8192L);
            if (jD == -1) {
                return j10;
            }
            j10 += jD;
            a();
        }
    }

    @Override // nl.h
    public final h t(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        if (this.f29561d) {
            throw new IllegalStateException("closed");
        }
        this.f29560c.R(string);
        a();
        return this;
    }

    @Override // nl.v
    public final z timeout() {
        return this.f29559b.timeout();
    }

    public final String toString() {
        return "buffer(" + this.f29559b + ')';
    }

    @Override // nl.h
    public final h v(j byteString) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        if (this.f29561d) {
            throw new IllegalStateException("closed");
        }
        this.f29560c.K(byteString);
        a();
        return this;
    }

    @Override // nl.h
    public final h w(long j10) {
        if (this.f29561d) {
            throw new IllegalStateException("closed");
        }
        this.f29560c.N(j10);
        a();
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f29561d) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.f29560c.write(source);
        a();
        return iWrite;
    }

    @Override // nl.h
    public final h writeByte(int i) {
        if (this.f29561d) {
            throw new IllegalStateException("closed");
        }
        this.f29560c.L(i);
        a();
        return this;
    }

    @Override // nl.h
    public final h writeInt(int i) {
        if (this.f29561d) {
            throw new IllegalStateException("closed");
        }
        this.f29560c.O(i);
        a();
        return this;
    }

    @Override // nl.h
    public final h writeShort(int i) {
        if (this.f29561d) {
            throw new IllegalStateException("closed");
        }
        this.f29560c.P(i);
        a();
        return this;
    }

    @Override // nl.v
    public final void write(g source, long j10) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!this.f29561d) {
            this.f29560c.write(source, j10);
            a();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // nl.h
    public final h write(byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!this.f29561d) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.f29560c.m623write(source, 0, source.length);
            a();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // nl.h
    public final h write(byte[] source, int i, int i10) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!this.f29561d) {
            this.f29560c.m623write(source, i, i10);
            a();
            return this;
        }
        throw new IllegalStateException("closed");
    }
}
