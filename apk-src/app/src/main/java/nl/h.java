package nl;

import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public interface h extends v, WritableByteChannel {
    h F(long j10);

    OutputStream G();

    @Override // nl.v, java.io.Flushable
    void flush();

    long o(x xVar);

    h t(String str);

    h v(j jVar);

    h w(long j10);

    h write(byte[] bArr);

    h write(byte[] bArr, int i, int i10);

    h writeByte(int i);

    h writeInt(int i);

    h writeShort(int i);
}
