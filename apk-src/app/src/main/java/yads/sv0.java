package yads;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class sv0 implements sp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cw0 f43091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f43092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vv0 f43093c = new vv0();

    public sv0(int i, cw0 cw0Var) {
        this.f43091a = cw0Var;
        this.f43092b = i;
    }

    public final long a(ld0 ld0Var) throws EOFException, InterruptedIOException {
        long j10;
        while (true) {
            long j11 = ld0Var.f40505d + ((long) ld0Var.f40507f);
            long j12 = 6;
            if (j11 >= ld0Var.f40504c - 6) {
                j10 = 6;
                break;
            }
            cw0 cw0Var = this.f43091a;
            int i = this.f43092b;
            vv0 vv0Var = this.f43093c;
            byte[] bArr = new byte[2];
            ld0Var.b(bArr, 0, 2, false);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) == i) {
                lb2 lb2Var = new lb2(16);
                System.arraycopy(bArr, 0, lb2Var.f40463a, 0, 2);
                byte[] bArr2 = lb2Var.f40463a;
                int i10 = 0;
                while (true) {
                    if (i10 >= 14) {
                        j10 = j12;
                        break;
                    }
                    j10 = j12;
                    int iB = ld0Var.b(bArr2, 2 + i10, 14 - i10);
                    if (iB == -1) {
                        break;
                    }
                    i10 += iB;
                    j12 = j10;
                }
                lb2Var.d(i10);
                ld0Var.f40507f = 0;
                ld0Var.a(false, (int) (j11 - ld0Var.f40505d));
                if (wv0.a(lb2Var, cw0Var, i, vv0Var)) {
                    break;
                }
            } else {
                ld0Var.f40507f = 0;
                ld0Var.a(false, (int) (j11 - ld0Var.f40505d));
            }
            ld0Var.a(false, 1);
        }
        long j13 = ld0Var.f40505d + ((long) ld0Var.f40507f);
        long j14 = ld0Var.f40504c;
        if (j13 < j14 - j10) {
            return this.f43093c.f44189a;
        }
        ld0Var.a(false, (int) (j14 - j13));
        return this.f43091a.f37539j;
    }

    @Override // yads.sp
    public final rp a(ld0 ld0Var, long j10) throws EOFException, InterruptedIOException {
        long j11 = ld0Var.f40505d;
        long jA = a(ld0Var);
        long j12 = ld0Var.f40505d + ((long) ld0Var.f40507f);
        ld0Var.a(false, Math.max(6, this.f43091a.f37533c));
        long jA2 = a(ld0Var);
        long j13 = ld0Var.f40505d + ((long) ld0Var.f40507f);
        if (jA <= j10 && jA2 > j10) {
            return new rp(0, -9223372036854775807L, j12);
        }
        if (jA2 <= j10) {
            return new rp(-2, jA2, j13);
        }
        return new rp(-1, jA, j11);
    }
}
