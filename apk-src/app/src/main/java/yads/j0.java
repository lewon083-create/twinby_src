package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class j0 implements vl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kb2 f39672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lb2 f39673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f39674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f39675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p73 f39676e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f39677f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f39678g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f39679h;
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public nx0 f39680j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f39681k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f39682l;

    public j0() {
        this(null);
    }

    @Override // yads.vl0
    public final void a(lb2 lb2Var) {
        if (this.f39676e == null) {
            throw new IllegalStateException();
        }
        while (true) {
            int i = lb2Var.f40465c - lb2Var.f40464b;
            if (i <= 0) {
                return;
            }
            int i10 = this.f39677f;
            if (i10 == 0) {
                while (lb2Var.f40465c - lb2Var.f40464b > 0) {
                    if (this.f39679h) {
                        int iM = lb2Var.m();
                        this.f39679h = iM == 172;
                        if (iM == 64 || iM == 65) {
                            boolean z5 = iM == 65;
                            this.f39677f = 1;
                            byte[] bArr = this.f39673b.f40463a;
                            bArr[0] = -84;
                            bArr[1] = (byte) (z5 ? 65 : 64);
                            this.f39678g = 2;
                        }
                    } else {
                        this.f39679h = lb2Var.m() == 172;
                    }
                }
            } else if (i10 == 1) {
                byte[] bArr2 = this.f39673b.f40463a;
                int iMin = Math.min(i, 16 - this.f39678g);
                lb2Var.a(bArr2, this.f39678g, iMin);
                int i11 = this.f39678g + iMin;
                this.f39678g = i11;
                if (i11 == 16) {
                    this.f39672a.b(0);
                    k0 k0VarA = l0.a(this.f39672a);
                    nx0 nx0Var = this.f39680j;
                    if (nx0Var == null || 2 != nx0Var.f41388z || k0VarA.f40024a != nx0Var.A || !"audio/ac4".equals(nx0Var.f41375m)) {
                        mx0 mx0Var = new mx0();
                        mx0Var.f41066a = this.f39675d;
                        mx0Var.f41075k = "audio/ac4";
                        mx0Var.f41088x = 2;
                        mx0Var.f41089y = k0VarA.f40024a;
                        mx0Var.f41068c = this.f39674c;
                        nx0 nx0Var2 = new nx0(mx0Var);
                        this.f39680j = nx0Var2;
                        this.f39676e.a(nx0Var2);
                    }
                    this.f39681k = k0VarA.f40025b;
                    this.i = (((long) k0VarA.f40026c) * 1000000) / ((long) this.f39680j.A);
                    this.f39673b.e(0);
                    this.f39676e.a(16, this.f39673b);
                    this.f39677f = 2;
                }
            } else if (i10 == 2) {
                int iMin2 = Math.min(i, this.f39681k - this.f39678g);
                this.f39676e.a(iMin2, lb2Var);
                int i12 = this.f39678g + iMin2;
                this.f39678g = i12;
                int i13 = this.f39681k;
                if (i12 == i13) {
                    long j10 = this.f39682l;
                    if (j10 != -9223372036854775807L) {
                        this.f39676e.a(j10, 1, i13, 0, null);
                        this.f39682l += this.i;
                    }
                    this.f39677f = 0;
                }
            }
        }
    }

    public j0(String str) {
        byte[] bArr = new byte[16];
        this.f39672a = new kb2(bArr);
        this.f39673b = new lb2(bArr);
        this.f39677f = 0;
        this.f39678g = 0;
        this.f39679h = false;
        this.f39682l = -9223372036854775807L;
        this.f39674c = str;
    }

    @Override // yads.vl0
    public final void b() {
    }

    @Override // yads.vl0
    public final void a(qq0 qq0Var, o93 o93Var) {
        o93Var.a();
        o93Var.b();
        this.f39675d = o93Var.f41502e;
        o93Var.b();
        this.f39676e = qq0Var.a(o93Var.f41501d, 1);
    }

    @Override // yads.vl0
    public final void a(int i, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f39682l = j10;
        }
    }

    @Override // yads.vl0
    public final void a() {
        this.f39677f = 0;
        this.f39678g = 0;
        this.f39679h = false;
        this.f39682l = -9223372036854775807L;
    }
}
