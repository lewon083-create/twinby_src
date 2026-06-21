package q4;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f31731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f31732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f31733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f31734e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f31735f;

    public g(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f31731b = iArr;
        this.f31732c = jArr;
        this.f31733d = jArr2;
        this.f31734e = jArr3;
        int length = iArr.length;
        this.f31730a = length;
        if (length > 0) {
            this.f31735f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f31735f = 0L;
        }
    }

    @Override // q4.t
    public final boolean a() {
        return true;
    }

    @Override // q4.t
    public final s e(long j10) {
        long[] jArr = this.f31734e;
        int iF = m3.z.f(jArr, j10, true);
        long j11 = jArr[iF];
        long[] jArr2 = this.f31732c;
        u uVar = new u(j11, jArr2[iF]);
        if (j11 >= j10 || iF == this.f31730a - 1) {
            return new s(uVar, uVar);
        }
        int i = iF + 1;
        return new s(uVar, new u(jArr[i], jArr2[i]));
    }

    @Override // q4.t
    public final long g() {
        return this.f31735f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f31730a + ", sizes=" + Arrays.toString(this.f31731b) + ", offsets=" + Arrays.toString(this.f31732c) + ", timeUs=" + Arrays.toString(this.f31734e) + ", durationsUs=" + Arrays.toString(this.f31733d) + ")";
    }
}
