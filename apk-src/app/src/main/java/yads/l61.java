package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class l61 implements cx2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f40429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mh1 f40430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mh1 f40431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f40432d;

    public l61(long j10, long j11, long j12) {
        this.f40432d = j10;
        this.f40429a = j12;
        mh1 mh1Var = new mh1();
        this.f40430b = mh1Var;
        mh1 mh1Var2 = new mh1();
        this.f40431c = mh1Var2;
        mh1Var.a(0L);
        mh1Var2.a(j11);
    }

    @Override // yads.cx2
    public final long a() {
        return this.f40429a;
    }

    @Override // yads.yw2
    public final boolean b() {
        return true;
    }

    @Override // yads.yw2
    public final long c() {
        return this.f40432d;
    }

    @Override // yads.cx2
    public final long a(long j10) {
        return this.f40430b.a(lb3.a(this.f40431c, j10));
    }

    @Override // yads.yw2
    public final ww2 b(long j10) {
        int iA = lb3.a(this.f40430b, j10);
        long jA = this.f40430b.a(iA);
        ax2 ax2Var = new ax2(jA, this.f40431c.a(iA));
        if (jA != j10) {
            mh1 mh1Var = this.f40430b;
            if (iA != mh1Var.f40915a - 1) {
                int i = iA + 1;
                return new ww2(ax2Var, new ax2(mh1Var.a(i), this.f40431c.a(i)));
            }
        }
        return new ww2(ax2Var, ax2Var);
    }

    public final boolean c(long j10) {
        mh1 mh1Var = this.f40430b;
        return j10 - mh1Var.a(mh1Var.f40915a - 1) < 100000;
    }
}
