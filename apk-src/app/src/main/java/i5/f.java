package i5;

import q4.l;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long[] f21157d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f21158a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f21159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21160c;

    public static long a(byte[] bArr, int i, boolean z5) {
        long j10 = ((long) bArr[0]) & 255;
        if (z5) {
            j10 &= ~f21157d[i - 1];
        }
        for (int i10 = 1; i10 < i; i10++) {
            j10 = (j10 << 8) | (((long) bArr[i10]) & 255);
        }
        return j10;
    }

    public final long b(l lVar, boolean z5, boolean z10, int i) {
        int i10;
        int i11 = this.f21159b;
        byte[] bArr = this.f21158a;
        if (i11 == 0) {
            if (!lVar.h(bArr, 0, 1, z5)) {
                return -1L;
            }
            int i12 = bArr[0] & 255;
            int i13 = 0;
            while (true) {
                if (i13 >= 8) {
                    i10 = -1;
                    break;
                }
                if ((f21157d[i13] & ((long) i12)) != 0) {
                    i10 = i13 + 1;
                    break;
                }
                i13++;
            }
            this.f21160c = i10;
            if (i10 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f21159b = 1;
        }
        int i14 = this.f21160c;
        if (i14 > i) {
            this.f21159b = 0;
            return -2L;
        }
        if (i14 != 1) {
            lVar.readFully(bArr, 1, i14 - 1);
        }
        this.f21159b = 0;
        return a(bArr, this.f21160c, z10);
    }
}
