package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class gz implements yw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f38947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f38948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f38949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f38950d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f38951e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f38952f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f38953g;

    public gz(int i, int i10, long j10, long j11, boolean z5) {
        this.f38947a = j10;
        this.f38948b = j11;
        this.f38949c = i10 == -1 ? 1 : i10;
        this.f38951e = i;
        this.f38953g = z5;
        if (j10 == -1) {
            this.f38950d = -1L;
            this.f38952f = -9223372036854775807L;
        } else {
            this.f38950d = j10 - j11;
            this.f38952f = a(i, j10, j11);
        }
    }

    public static long a(int i, long j10, long j11) {
        return (Math.max(0L, j10 - j11) * 8000000) / ((long) i);
    }

    @Override // yads.yw2
    public final ww2 b(long j10) {
        long j11 = this.f38950d;
        if (j11 == -1 && !this.f38953g) {
            ax2 ax2Var = new ax2(0L, this.f38948b);
            return new ww2(ax2Var, ax2Var);
        }
        long j12 = (((long) this.f38951e) * j10) / 8000000;
        long j13 = this.f38949c;
        long jMin = (j12 / j13) * j13;
        if (j11 != -1) {
            jMin = Math.min(jMin, j11 - j13);
        }
        long jMax = Math.max(jMin, 0L);
        long j14 = this.f38948b;
        long j15 = jMax + j14;
        long jA = a(this.f38951e, j15, j14);
        ax2 ax2Var2 = new ax2(jA, j15);
        if (this.f38950d != -1 && jA < j10) {
            long j16 = j15 + ((long) this.f38949c);
            if (j16 < this.f38947a) {
                return new ww2(ax2Var2, new ax2(a(this.f38951e, j16, this.f38948b), j16));
            }
        }
        return new ww2(ax2Var2, ax2Var2);
    }

    @Override // yads.yw2
    public final long c() {
        return this.f38952f;
    }

    @Override // yads.yw2
    public final boolean b() {
        return this.f38950d != -1 || this.f38953g;
    }
}
