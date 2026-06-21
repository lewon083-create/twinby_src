package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class y21 implements vl0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p73 f44890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f44891c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f44893e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f44894f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lb2 f44889a = new lb2(10);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f44892d = -9223372036854775807L;

    @Override // yads.vl0
    public final void a(lb2 lb2Var) {
        if (this.f44890b == null) {
            throw new IllegalStateException();
        }
        if (this.f44891c) {
            int i = lb2Var.f40465c - lb2Var.f40464b;
            int i10 = this.f44894f;
            if (i10 < 10) {
                int iMin = Math.min(i, 10 - i10);
                System.arraycopy(lb2Var.f40463a, lb2Var.f40464b, this.f44889a.f40463a, this.f44894f, iMin);
                if (this.f44894f + iMin == 10) {
                    this.f44889a.e(0);
                    if (73 != this.f44889a.m() || 68 != this.f44889a.m() || 51 != this.f44889a.m()) {
                        kh1.d("Id3Reader", "Discarding invalid ID3 tag");
                        this.f44891c = false;
                        return;
                    } else {
                        lb2 lb2Var2 = this.f44889a;
                        lb2Var2.e(lb2Var2.f40464b + 3);
                        this.f44893e = this.f44889a.l() + 10;
                    }
                }
            }
            int iMin2 = Math.min(i, this.f44893e - this.f44894f);
            this.f44890b.a(iMin2, lb2Var);
            this.f44894f += iMin2;
        }
    }

    @Override // yads.vl0
    public final void b() {
        int i;
        p73 p73Var = this.f44890b;
        if (p73Var == null) {
            throw new IllegalStateException();
        }
        if (this.f44891c && (i = this.f44893e) != 0 && this.f44894f == i) {
            long j10 = this.f44892d;
            if (j10 != -9223372036854775807L) {
                p73Var.a(j10, 1, i, 0, null);
            }
            this.f44891c = false;
        }
    }

    @Override // yads.vl0
    public final void a(qq0 qq0Var, o93 o93Var) {
        o93Var.a();
        o93Var.b();
        p73 p73VarA = qq0Var.a(o93Var.f41501d, 5);
        this.f44890b = p73VarA;
        mx0 mx0Var = new mx0();
        o93Var.b();
        mx0Var.f41066a = o93Var.f41502e;
        mx0Var.f41075k = "application/id3";
        p73VarA.a(new nx0(mx0Var));
    }

    @Override // yads.vl0
    public final void a(int i, long j10) {
        if ((i & 4) == 0) {
            return;
        }
        this.f44891c = true;
        if (j10 != -9223372036854775807L) {
            this.f44892d = j10;
        }
        this.f44893e = 0;
        this.f44894f = 0;
    }

    @Override // yads.vl0
    public final void a() {
        this.f44891c = false;
        this.f44892d = -9223372036854775807L;
    }
}
