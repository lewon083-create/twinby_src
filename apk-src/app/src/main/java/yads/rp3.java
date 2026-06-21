package yads;

import com.yandex.varioqub.config.model.ConfigValue;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class rp3 implements cx2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f42689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f42690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f42691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f42692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f42693e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f42694f;

    public rp3(long j10, int i, long j11, long j12, long[] jArr) {
        this.f42689a = j10;
        this.f42690b = i;
        this.f42691c = j11;
        this.f42694f = jArr;
        this.f42692d = j12;
        this.f42693e = j12 != -1 ? j10 + j12 : -1L;
    }

    @Override // yads.cx2
    public final long a() {
        return this.f42693e;
    }

    @Override // yads.yw2
    public final ww2 b(long j10) {
        if (!b()) {
            ax2 ax2Var = new ax2(0L, this.f42689a + ((long) this.f42690b));
            return new ww2(ax2Var, ax2Var);
        }
        long j11 = this.f42691c;
        int i = lb3.f40466a;
        long jMax = Math.max(0L, Math.min(j10, j11));
        double d10 = (jMax * 100.0d) / this.f42691c;
        double d11 = ConfigValue.DOUBLE_DEFAULT_VALUE;
        if (d10 > ConfigValue.DOUBLE_DEFAULT_VALUE) {
            if (d10 >= 100.0d) {
                d11 = 256.0d;
            } else {
                int i10 = (int) d10;
                long[] jArr = this.f42694f;
                if (jArr == null) {
                    throw new IllegalStateException();
                }
                double d12 = jArr[i10];
                d11 = d12 + (((i10 == 99 ? 256.0d : jArr[i10 + 1]) - d12) * (d10 - ((double) i10)));
            }
        }
        ax2 ax2Var2 = new ax2(jMax, this.f42689a + Math.max(this.f42690b, Math.min(Math.round((d11 / 256.0d) * this.f42692d), this.f42692d - 1)));
        return new ww2(ax2Var2, ax2Var2);
    }

    @Override // yads.yw2
    public final long c() {
        return this.f42691c;
    }

    @Override // yads.cx2
    public final long a(long j10) {
        long j11 = j10 - this.f42689a;
        if (!b() || j11 <= this.f42690b) {
            return 0L;
        }
        long[] jArr = this.f42694f;
        if (jArr == null) {
            throw new IllegalStateException();
        }
        double d10 = (j11 * 256.0d) / this.f42692d;
        int iB = lb3.b(jArr, (long) d10, true);
        long j12 = this.f42691c;
        long j13 = (((long) iB) * j12) / 100;
        long j14 = jArr[iB];
        int i = iB + 1;
        long j15 = (j12 * ((long) i)) / 100;
        return Math.round((j14 == (iB == 99 ? 256L : jArr[i]) ? ConfigValue.DOUBLE_DEFAULT_VALUE : (d10 - j14) / (r0 - j14)) * (j15 - j13)) + j13;
    }

    @Override // yads.yw2
    public final boolean b() {
        return this.f42694f != null;
    }
}
