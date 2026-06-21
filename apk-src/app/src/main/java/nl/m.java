package nl;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class m implements x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte f29546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f29547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Inflater f29548d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n f29549e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CRC32 f29550f;

    public m(x source) {
        Intrinsics.checkNotNullParameter(source, "source");
        r rVar = new r(source);
        this.f29547c = rVar;
        Inflater inflater = new Inflater(true);
        this.f29548d = inflater;
        this.f29549e = new n(rVar, inflater);
        this.f29550f = new CRC32();
    }

    public static void a(int i, int i10, String str) throws IOException {
        if (i10 == i) {
            return;
        }
        String str2 = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i10), Integer.valueOf(i)}, 3));
        Intrinsics.checkNotNullExpressionValue(str2, "format(this, *args)");
        throw new IOException(str2);
    }

    @Override // nl.x
    public final long D(g sink, long j10) throws IOException {
        long j11;
        m mVar = this;
        Intrinsics.checkNotNullParameter(sink, "sink");
        byte b2 = mVar.f29546b;
        CRC32 crc32 = mVar.f29550f;
        r rVar = mVar.f29547c;
        if (b2 == 0) {
            rVar.E(10L);
            g gVar = rVar.f29563c;
            byte bI = gVar.i(3L);
            boolean z5 = ((bI >> 1) & 1) == 1;
            if (z5) {
                mVar.b(gVar, 0L, 10L);
            }
            a(8075, rVar.readShort(), "ID1ID2");
            rVar.skip(8L);
            if (((bI >> 2) & 1) == 1) {
                rVar.E(2L);
                if (z5) {
                    b(gVar, 0L, 2L);
                }
                short s10 = gVar.readShort();
                long j12 = ((short) (((s10 & 255) << 8) | ((s10 & 65280) >>> 8))) & 65535;
                rVar.E(j12);
                if (z5) {
                    b(gVar, 0L, j12);
                }
                rVar.skip(j12);
            }
            if (((bI >> 3) & 1) == 1) {
                long jB = rVar.b((byte) 0, 0L, Long.MAX_VALUE);
                if (jB == -1) {
                    throw new EOFException();
                }
                if (z5) {
                    j11 = 2;
                    b(gVar, 0L, jB + 1);
                } else {
                    j11 = 2;
                }
                rVar.skip(jB + 1);
            } else {
                j11 = 2;
            }
            if (((bI >> 4) & 1) == 1) {
                long j13 = j11;
                long jB2 = rVar.b((byte) 0, 0L, Long.MAX_VALUE);
                if (jB2 == -1) {
                    throw new EOFException();
                }
                if (z5) {
                    j11 = j13;
                    mVar = this;
                    mVar.b(gVar, 0L, jB2 + 1);
                } else {
                    mVar = this;
                    j11 = j13;
                }
                rVar.skip(jB2 + 1);
            } else {
                mVar = this;
            }
            if (z5) {
                rVar.E(j11);
                short s11 = gVar.readShort();
                a((short) (((s11 & 255) << 8) | ((s11 & 65280) >>> 8)), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            mVar.f29546b = (byte) 1;
        }
        if (mVar.f29546b == 1) {
            long j14 = sink.f29540c;
            long jD = mVar.f29549e.D(sink, 8192L);
            if (jD != -1) {
                mVar.b(sink, j14, jD);
                return jD;
            }
            mVar.f29546b = (byte) 2;
        }
        if (mVar.f29546b == 2) {
            a(rVar.d(), (int) crc32.getValue(), "CRC");
            a(rVar.d(), (int) mVar.f29548d.getBytesWritten(), "ISIZE");
            mVar.f29546b = (byte) 3;
            if (!rVar.a()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    public final void b(g gVar, long j10, long j11) {
        s sVar = gVar.f29539b;
        Intrinsics.b(sVar);
        while (true) {
            int i = sVar.f29567c;
            int i10 = sVar.f29566b;
            if (j10 < i - i10) {
                break;
            }
            j10 -= (long) (i - i10);
            sVar = sVar.f29570f;
            Intrinsics.b(sVar);
        }
        while (j11 > 0) {
            int i11 = (int) (((long) sVar.f29566b) + j10);
            int iMin = (int) Math.min(sVar.f29567c - i11, j11);
            this.f29550f.update(sVar.f29565a, i11, iMin);
            j11 -= (long) iMin;
            sVar = sVar.f29570f;
            Intrinsics.b(sVar);
            j10 = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f29549e.close();
    }

    @Override // nl.x
    public final z timeout() {
        return this.f29547c.f29562b.timeout();
    }
}
