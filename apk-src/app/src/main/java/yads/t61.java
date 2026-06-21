package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class t61 extends cu {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final fu f43192j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public eu f43193k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f43194l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile boolean f43195m;

    public t61(p30 p30Var, u30 u30Var, nx0 nx0Var, int i, Object obj, fu fuVar) {
        super(p30Var, u30Var, 2, nx0Var, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.f43192j = fuVar;
    }

    @Override // yads.dg1
    public final void a() {
        if (this.f43194l == 0) {
            ((ar) this.f43192j).a(this.f43193k, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            u30 u30Var = this.f37501b;
            long j10 = this.f43194l;
            long j11 = u30Var.f43539g;
            long j12 = -1;
            if (j11 != -1) {
                j12 = j11 - j10;
            }
            u30 u30VarA = u30Var.a(j10, j12);
            u33 u33Var = this.i;
            ld0 ld0Var = new ld0(u33Var, u30VarA.f43538f, u33Var.a(u30VarA));
            while (!this.f43195m) {
                try {
                    int iA = ((ar) this.f43192j).f36837b.a(ld0Var, ar.f36836l);
                    if (iA == 1) {
                        throw new IllegalStateException();
                    }
                    if (iA != 0) {
                        break;
                    }
                } finally {
                    this.f43194l = ld0Var.f40505d - this.f37501b.f43538f;
                }
            }
        } finally {
            s30.a(this.i);
        }
    }

    @Override // yads.dg1
    public final void b() {
        this.f43195m = true;
    }
}
