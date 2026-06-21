package nl;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class r implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f29562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f29563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f29564d;

    public r(x source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f29562b = source;
        this.f29563c = new g();
    }

    @Override // nl.i
    public final String A() {
        return q(Long.MAX_VALUE);
    }

    @Override // nl.x
    public final long D(g sink, long j10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(pe.a.d(j10, "byteCount < 0: ").toString());
        }
        if (this.f29564d) {
            throw new IllegalStateException("closed");
        }
        g gVar = this.f29563c;
        if (gVar.f29540c == 0 && this.f29562b.D(gVar, 8192L) == -1) {
            return -1L;
        }
        return gVar.D(sink, Math.min(j10, gVar.f29540c));
    }

    @Override // nl.i
    public final void E(long j10) throws EOFException {
        if (!z(j10)) {
            throw new EOFException();
        }
    }

    @Override // nl.i
    public final long H() throws EOFException {
        g gVar;
        byte bI;
        E(1L);
        int i = 0;
        while (true) {
            int i10 = i + 1;
            boolean z5 = z(i10);
            gVar = this.f29563c;
            if (!z5) {
                break;
            }
            bI = gVar.i(i);
            if ((bI < 48 || bI > 57) && ((bI < 97 || bI > 102) && (bI < 65 || bI > 70))) {
                break;
            }
            i = i10;
        }
        if (i == 0) {
            StringBuilder sb2 = new StringBuilder("Expected leading [0-9a-fA-F] character but was 0x");
            String string = Integer.toString(bI, CharsKt.checkRadix(CharsKt.checkRadix(16)));
            Intrinsics.checkNotNullExpressionValue(string, "toString(this, checkRadix(radix))");
            sb2.append(string);
            throw new NumberFormatException(sb2.toString());
        }
        return gVar.H();
    }

    public final boolean a() {
        if (this.f29564d) {
            throw new IllegalStateException("closed");
        }
        g gVar = this.f29563c;
        return gVar.h() && this.f29562b.D(gVar, 8192L) == -1;
    }

    public final long b(byte b2, long j10, long j11) {
        if (this.f29564d) {
            throw new IllegalStateException("closed");
        }
        if (0 > j11) {
            throw new IllegalArgumentException(pe.a.d(j11, "fromIndex=0 toIndex=").toString());
        }
        long jMax = 0;
        while (jMax < j11) {
            g gVar = this.f29563c;
            byte b10 = b2;
            long j12 = j11;
            long j13 = gVar.j(b10, jMax, j12);
            if (j13 != -1) {
                return j13;
            }
            long j14 = gVar.f29540c;
            if (j14 >= j12 || this.f29562b.D(gVar, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, j14);
            b2 = b10;
            j11 = j12;
        }
        return -1L;
    }

    @Override // nl.i
    public final j c(long j10) throws EOFException {
        E(j10);
        return this.f29563c.c(j10);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.f29564d) {
            return;
        }
        this.f29564d = true;
        this.f29562b.close();
        this.f29563c.a();
    }

    public final int d() throws EOFException {
        E(4L);
        int i = this.f29563c.readInt();
        return ((i & KotlinVersion.MAX_COMPONENT_VALUE) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    @Override // nl.i
    public final g e() {
        return this.f29563c;
    }

    @Override // nl.i
    public final int g(p options) throws EOFException {
        Intrinsics.checkNotNullParameter(options, "options");
        if (this.f29564d) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            g gVar = this.f29563c;
            int iB = ol.a.b(gVar, options, true);
            if (iB != -2) {
                if (iB != -1) {
                    gVar.skip(options.f29557b[iB].a());
                    return iB;
                }
            } else if (this.f29562b.D(gVar, 8192L) == -1) {
                break;
            }
        }
        return -1;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f29564d;
    }

    @Override // nl.i
    public final byte[] n() {
        x xVar = this.f29562b;
        g gVar = this.f29563c;
        gVar.o(xVar);
        return gVar.k(gVar.f29540c);
    }

    @Override // nl.i
    public final String q(long j10) throws EOFException {
        if (j10 < 0) {
            throw new IllegalArgumentException(pe.a.d(j10, "limit < 0: ").toString());
        }
        long j11 = j10 == Long.MAX_VALUE ? Long.MAX_VALUE : j10 + 1;
        long jB = b((byte) 10, 0L, j11);
        g gVar = this.f29563c;
        if (jB != -1) {
            return ol.a.a(gVar, jB);
        }
        if (j11 < Long.MAX_VALUE && z(j11) && gVar.i(j11 - 1) == 13 && z(j11 + 1) && gVar.i(j11) == 10) {
            return ol.a.a(gVar, j11);
        }
        g gVar2 = new g();
        gVar.d(gVar2, 0L, Math.min(32, gVar.f29540c));
        throw new EOFException("\\n not found: limit=" + Math.min(gVar.f29540c, j10) + " content=" + gVar2.c(gVar2.f29540c).b() + (char) 8230);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        g gVar = this.f29563c;
        if (gVar.f29540c == 0 && this.f29562b.D(gVar, 8192L) == -1) {
            return -1;
        }
        return gVar.read(sink);
    }

    @Override // nl.i
    public final byte readByte() {
        E(1L);
        return this.f29563c.readByte();
    }

    @Override // nl.i
    public final int readInt() throws EOFException {
        E(4L);
        return this.f29563c.readInt();
    }

    @Override // nl.i
    public final short readShort() throws EOFException {
        E(2L);
        return this.f29563c.readShort();
    }

    @Override // nl.i
    public final void skip(long j10) throws EOFException {
        if (this.f29564d) {
            throw new IllegalStateException("closed");
        }
        while (j10 > 0) {
            g gVar = this.f29563c;
            if (gVar.f29540c == 0 && this.f29562b.D(gVar, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j10, gVar.f29540c);
            gVar.skip(jMin);
            j10 -= jMin;
        }
    }

    @Override // nl.x
    public final z timeout() {
        return this.f29562b.timeout();
    }

    public final String toString() {
        return "buffer(" + this.f29562b + ')';
    }

    @Override // nl.i
    public final String u(Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        x xVar = this.f29562b;
        g gVar = this.f29563c;
        gVar.o(xVar);
        return gVar.u(charset);
    }

    @Override // nl.i
    public final boolean z(long j10) {
        g gVar;
        if (j10 < 0) {
            throw new IllegalArgumentException(pe.a.d(j10, "byteCount < 0: ").toString());
        }
        if (this.f29564d) {
            throw new IllegalStateException("closed");
        }
        do {
            gVar = this.f29563c;
            if (gVar.f29540c >= j10) {
                return true;
            }
        } while (this.f29562b.D(gVar, 8192L) != -1);
        return false;
    }
}
