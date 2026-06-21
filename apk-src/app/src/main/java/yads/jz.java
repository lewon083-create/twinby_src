package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class jz extends jo {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f40017o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f40018p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final fu f40019q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f40020r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile boolean f40021s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f40022t;

    public jz(p30 p30Var, u30 u30Var, nx0 nx0Var, int i, Object obj, long j10, long j11, long j12, long j13, long j14, int i10, long j15, fu fuVar) {
        super(p30Var, u30Var, nx0Var, i, obj, j10, j11, j12, j13, j14);
        this.f40017o = i10;
        this.f40018p = j15;
        this.f40019q = fuVar;
    }

    @Override // yads.dg1
    public final void a() {
        int iA;
        if (this.f40020r == 0) {
            lo loVar = this.f39924m;
            if (loVar == null) {
                throw new IllegalStateException();
            }
            long j10 = this.f40018p;
            for (os2 os2Var : loVar.f40628b) {
                if (os2Var.E != j10) {
                    os2Var.E = j10;
                    os2Var.f41718z = true;
                }
            }
            fu fuVar = this.f40019q;
            long j11 = this.f39922k;
            long j12 = j11 == -9223372036854775807L ? -9223372036854775807L : j11 - this.f40018p;
            long j13 = this.f39923l;
            ((ar) fuVar).a(loVar, j12, j13 != -9223372036854775807L ? j13 - this.f40018p : -9223372036854775807L);
        }
        try {
            u30 u30Var = this.f37501b;
            long j14 = this.f40020r;
            long j15 = u30Var.f43539g;
            long j16 = -1;
            if (j15 != -1) {
                j16 = j15 - j14;
            }
            u30 u30VarA = u30Var.a(j14, j16);
            u33 u33Var = this.i;
            ld0 ld0Var = new ld0(u33Var, u30VarA.f43538f, u33Var.a(u30VarA));
            do {
                try {
                    if (this.f40021s) {
                        break;
                    }
                    iA = ((ar) this.f40019q).f36837b.a(ld0Var, ar.f36836l);
                    if (iA == 1) {
                        throw new IllegalStateException();
                    }
                } finally {
                    this.f40020r = ld0Var.f40505d - this.f37501b.f43538f;
                }
            } while (iA == 0);
            s30.a(this.i);
            this.f40022t = !this.f40021s;
        } catch (Throwable th2) {
            s30.a(this.i);
            throw th2;
        }
    }

    @Override // yads.dg1
    public final void b() {
        this.f40021s = true;
    }

    @Override // yads.jo
    public final long c() {
        return this.f39921j + ((long) this.f40017o);
    }

    @Override // yads.jo
    public final boolean d() {
        return this.f40022t;
    }
}
