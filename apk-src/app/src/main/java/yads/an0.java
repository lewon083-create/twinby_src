package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class an0 implements ps2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nx0 f36780b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long[] f36782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f36783e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public bn0 f36784f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f36785g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f36786h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zm0 f36781c = new zm0();
    public long i = -9223372036854775807L;

    public an0(bn0 bn0Var, nx0 nx0Var, boolean z5) {
        this.f36780b = nx0Var;
        this.f36784f = bn0Var;
        this.f36782d = bn0Var.f37101b;
        a(bn0Var, z5);
    }

    @Override // yads.ps2
    public final void a() {
    }

    @Override // yads.ps2
    public final boolean isReady() {
        return true;
    }

    @Override // yads.ps2
    public final int a(ox0 ox0Var, sa0 sa0Var, int i) {
        int i10 = this.f36786h;
        boolean z5 = i10 == this.f36782d.length;
        if (z5 && !this.f36783e) {
            sa0Var.f43049b = 4;
            return -4;
        }
        if ((i & 2) != 0 || !this.f36785g) {
            ox0Var.f41759b = this.f36780b;
            this.f36785g = true;
            return -5;
        }
        if (z5) {
            return -3;
        }
        if ((i & 1) == 0) {
            this.f36786h = i10 + 1;
        }
        if ((i & 4) == 0) {
            byte[] bArrA = this.f36781c.a(this.f36784f.f37100a[i10]);
            sa0Var.c(bArrA.length);
            sa0Var.f42864d.put(bArrA);
        }
        sa0Var.f42866f = this.f36782d[i10];
        sa0Var.f43049b = 1;
        return -4;
    }

    @Override // yads.ps2
    public final int a(long j10) {
        int iMax = Math.max(this.f36786h, lb3.a(this.f36782d, j10, true));
        int i = iMax - this.f36786h;
        this.f36786h = iMax;
        return i;
    }

    public final void a(bn0 bn0Var, boolean z5) {
        int i = this.f36786h;
        long j10 = -9223372036854775807L;
        long j11 = i == 0 ? -9223372036854775807L : this.f36782d[i - 1];
        this.f36783e = z5;
        this.f36784f = bn0Var;
        long[] jArr = bn0Var.f37101b;
        this.f36782d = jArr;
        long j12 = this.i;
        if (j12 == -9223372036854775807L) {
            if (j11 != -9223372036854775807L) {
                this.f36786h = lb3.a(jArr, j11, false);
            }
        } else {
            int iA = lb3.a(jArr, j12, true);
            this.f36786h = iA;
            if (this.f36783e && iA == this.f36782d.length) {
                j10 = j12;
            }
            this.i = j10;
        }
    }
}
