package yads;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class zb3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long[] f45341d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f45342a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f45343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f45344c;

    public static long a(byte[] bArr, int i, boolean z5) {
        long j10 = ((long) bArr[0]) & 255;
        if (z5) {
            j10 &= ~f45341d[i - 1];
        }
        for (int i10 = 1; i10 < i; i10++) {
            j10 = (j10 << 8) | (((long) bArr[i10]) & 255);
        }
        return j10;
    }

    public final long a(ld0 ld0Var, boolean z5, boolean z10, int i) throws EOFException, InterruptedIOException {
        int i10;
        if (this.f45343b == 0) {
            if (!ld0Var.a(this.f45342a, 0, 1, z5)) {
                return -1L;
            }
            int i11 = this.f45342a[0] & 255;
            int i12 = 0;
            while (true) {
                long[] jArr = f45341d;
                if (i12 >= 8) {
                    i10 = -1;
                    break;
                }
                if ((((long) i11) & jArr[i12]) != 0) {
                    i10 = i12 + 1;
                    break;
                }
                i12++;
            }
            this.f45344c = i10;
            if (i10 != -1) {
                this.f45343b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i13 = this.f45344c;
        if (i13 > i) {
            this.f45343b = 0;
            return -2L;
        }
        if (i13 != 1) {
            ld0Var.a(this.f45342a, 1, i13 - 1, false);
        }
        this.f45343b = 0;
        return a(this.f45342a, this.f45344c, z10);
    }
}
