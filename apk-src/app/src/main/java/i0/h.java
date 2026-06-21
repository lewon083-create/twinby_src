package i0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import t.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Charset f20774d = StandardCharsets.US_ASCII;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f20775e = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f20776f = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f20779c;

    public h(byte[] bArr, int i, int i10) {
        this.f20777a = i;
        this.f20778b = i10;
        this.f20779c = bArr;
    }

    public static h a(long j10, ByteOrder byteOrder) {
        return b(new long[]{j10}, byteOrder);
    }

    public static h b(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f20776f[4] * jArr.length]);
        byteBufferWrap.order(byteOrder);
        for (long j10 : jArr) {
            byteBufferWrap.putInt((int) j10);
        }
        return new h(byteBufferWrap.array(), 4, jArr.length);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(f20775e[this.f20777a]);
        sb2.append(", data length:");
        return z.d(this.f20779c.length, ")", sb2);
    }
}
