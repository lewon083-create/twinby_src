package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class tz2 extends jo {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f43494o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final nx0 f43495p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f43496q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f43497r;

    public tz2(p30 p30Var, u30 u30Var, nx0 nx0Var, int i, Object obj, long j10, long j11, long j12, int i10, nx0 nx0Var2) {
        super(p30Var, u30Var, nx0Var, i, obj, j10, j11, -9223372036854775807L, -9223372036854775807L, j12);
        this.f43494o = i10;
        this.f43495p = nx0Var2;
    }

    @Override // yads.dg1
    public final void a() {
        p73 bl0Var;
        lo loVar = this.f39924m;
        if (loVar == null) {
            throw new IllegalStateException();
        }
        for (os2 os2Var : loVar.f40628b) {
            if (os2Var.E != 0) {
                os2Var.E = 0L;
                os2Var.f41718z = true;
            }
        }
        int i = this.f43494o;
        int i10 = 0;
        while (true) {
            int[] iArr = loVar.f40627a;
            if (i10 >= iArr.length) {
                kh1.b("BaseMediaChunkOutput", "Unmatched track of type: " + i);
                bl0Var = new bl0();
                break;
            }
            if (i == iArr[i10]) {
                bl0Var = loVar.f40628b[i10];
                break;
            }
            i10++;
        }
        p73 p73Var = bl0Var;
        p73Var.a(this.f43495p);
        try {
            u30 u30Var = this.f37501b;
            long j10 = this.f43496q;
            long j11 = u30Var.f43539g;
            long jA = this.i.a(u30Var.a(j10, j11 == -1 ? -1L : j11 - j10));
            if (jA != -1) {
                jA += this.f43496q;
            }
            ld0 ld0Var = new ld0(this.i, this.f43496q, jA);
            for (int iA = 0; iA != -1; iA = p73Var.a(ld0Var, Integer.MAX_VALUE, true)) {
                this.f43496q += (long) iA;
            }
            p73Var.a(this.f37506g, 1, (int) this.f43496q, 0, null);
            s30.a(this.i);
            this.f43497r = true;
        } catch (Throwable th2) {
            s30.a(this.i);
            throw th2;
        }
    }

    @Override // yads.jo
    public final boolean d() {
        return this.f43497r;
    }

    @Override // yads.dg1
    public final void b() {
    }
}
