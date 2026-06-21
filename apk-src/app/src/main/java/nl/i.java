package nl;

import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public interface i extends x, ReadableByteChannel {
    String A();

    void E(long j10);

    long H();

    j c(long j10);

    g e();

    int g(p pVar);

    byte[] n();

    String q(long j10);

    byte readByte();

    int readInt();

    short readShort();

    void skip(long j10);

    String u(Charset charset);

    boolean z(long j10);
}
