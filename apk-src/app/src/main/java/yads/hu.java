package yads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class hu implements yw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f39323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f39324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f39325d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f39326e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f39327f;

    public hu(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f39323b = iArr;
        this.f39324c = jArr;
        this.f39325d = jArr2;
        this.f39326e = jArr3;
        int length = iArr.length;
        this.f39322a = length;
        if (length <= 0) {
            this.f39327f = 0L;
        } else {
            int i = length - 1;
            this.f39327f = jArr2[i] + jArr3[i];
        }
    }

    @Override // yads.yw2
    public final boolean b() {
        return true;
    }

    @Override // yads.yw2
    public final long c() {
        return this.f39327f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f39322a + ", sizes=" + Arrays.toString(this.f39323b) + ", offsets=" + Arrays.toString(this.f39324c) + ", timeUs=" + Arrays.toString(this.f39326e) + ", durationsUs=" + Arrays.toString(this.f39325d) + ")";
    }

    @Override // yads.yw2
    public final ww2 b(long j10) {
        int iB = lb3.b(this.f39326e, j10, true);
        long[] jArr = this.f39326e;
        long j11 = jArr[iB];
        long[] jArr2 = this.f39324c;
        ax2 ax2Var = new ax2(j11, jArr2[iB]);
        if (j11 >= j10 || iB == this.f39322a - 1) {
            return new ww2(ax2Var, ax2Var);
        }
        int i = iB + 1;
        return new ww2(ax2Var, new ax2(jArr[i], jArr2[i]));
    }
}
