package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class hb implements ib {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f6087b = Logger.getLogger(hb.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gb f6088a = new gb(0);

    /* JADX WARN: Multi-variable type inference failed */
    public final kb a(ly lyVar, es1 es1Var) throws EOFException {
        int iA;
        long jLimit;
        kb nbVar;
        kb kbVar;
        long jB = lyVar.b();
        ByteBuffer byteBuffer = lyVar.f7674b;
        gb gbVar = this.f6088a;
        ((ByteBuffer) gbVar.get()).rewind().limit(8);
        do {
            iA = lyVar.a((ByteBuffer) gbVar.get());
            if (iA == 8) {
                ((ByteBuffer) gbVar.get()).rewind();
                long jD = rs.d((ByteBuffer) gbVar.get());
                if (jD < 8 && jD > 1) {
                    Level level = Level.SEVERE;
                    StringBuilder sb2 = new StringBuilder(80);
                    sb2.append("Plausibility check failed: size < 8 (size = ");
                    sb2.append(jD);
                    sb2.append("). Stop parsing!");
                    f6087b.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb2.toString());
                    return null;
                }
                byte[] bArr = new byte[4];
                ((ByteBuffer) gbVar.get()).get(bArr);
                try {
                    String str = new String(bArr, "ISO-8859-1");
                    if (jD == 1) {
                        ((ByteBuffer) gbVar.get()).limit(16);
                        lyVar.a((ByteBuffer) gbVar.get());
                        ((ByteBuffer) gbVar.get()).position(8);
                        jLimit = rs.v((ByteBuffer) gbVar.get()) - 16;
                    } else {
                        jLimit = jD == 0 ? ((long) byteBuffer.limit()) - lyVar.b() : jD - 8;
                    }
                    if ("uuid".equals(str)) {
                        ((ByteBuffer) gbVar.get()).limit(((ByteBuffer) gbVar.get()).limit() + 16);
                        lyVar.a((ByteBuffer) gbVar.get());
                        byte[] bArr2 = new byte[16];
                        for (int iPosition = ((ByteBuffer) gbVar.get()).position() - 16; iPosition < ((ByteBuffer) gbVar.get()).position(); iPosition++) {
                            bArr2[iPosition - (((ByteBuffer) gbVar.get()).position() - 16)] = ((ByteBuffer) gbVar.get()).get(iPosition);
                        }
                        jLimit -= 16;
                    }
                    long j10 = jLimit;
                    if (es1Var instanceof kb) {
                    }
                    if ("moov".equals(str)) {
                        nbVar = new lb();
                    } else {
                        if ("mvhd".equals(str)) {
                            mb mbVar = new mb("mvhd");
                            mbVar.f7838o = 1.0d;
                            mbVar.f7839p = 1.0f;
                            mbVar.f7840q = is1.f6591j;
                            kbVar = mbVar;
                            ((ByteBuffer) gbVar.get()).rewind();
                            kbVar.a(lyVar, (ByteBuffer) gbVar.get(), j10, this);
                            return kbVar;
                        }
                        nbVar = new nb(str, 0);
                    }
                    kbVar = nbVar;
                    ((ByteBuffer) gbVar.get()).rewind();
                    kbVar.a(lyVar, (ByteBuffer) gbVar.get(), j10, this);
                    return kbVar;
                } catch (UnsupportedEncodingException e3) {
                    throw new RuntimeException(e3);
                }
            }
        } while (iA >= 0);
        byteBuffer.position((int) jB);
        throw new EOFException();
    }
}
