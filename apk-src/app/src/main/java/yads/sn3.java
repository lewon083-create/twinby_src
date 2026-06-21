package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class sn3 implements yw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pn3 f43007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f43008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f43009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f43010d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f43011e;

    public sn3(pn3 pn3Var, int i, long j10, long j11) {
        this.f43007a = pn3Var;
        this.f43008b = i;
        this.f43009c = j10;
        long j12 = (j11 - j10) / ((long) pn3Var.f41964c);
        this.f43010d = j12;
        this.f43011e = c(j12);
    }

    @Override // yads.yw2
    public final boolean b() {
        return true;
    }

    public final long c(long j10) {
        return lb3.a(j10 * ((long) this.f43008b), 1000000L, this.f43007a.f41963b);
    }

    @Override // yads.yw2
    public final ww2 b(long j10) {
        long j11 = (((long) this.f43007a.f41963b) * j10) / (((long) this.f43008b) * 1000000);
        long j12 = this.f43010d - 1;
        int i = lb3.f40466a;
        long jMax = Math.max(0L, Math.min(j11, j12));
        long j13 = (((long) this.f43007a.f41964c) * jMax) + this.f43009c;
        long jC = c(jMax);
        ax2 ax2Var = new ax2(jC, j13);
        if (jC >= j10 || jMax == this.f43010d - 1) {
            return new ww2(ax2Var, ax2Var);
        }
        long j14 = jMax + 1;
        return new ww2(ax2Var, new ax2(c(j14), (((long) this.f43007a.f41964c) * j14) + this.f43009c));
    }

    @Override // yads.yw2
    public final long c() {
        return this.f43011e;
    }
}
