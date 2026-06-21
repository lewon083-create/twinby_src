package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class pv1 implements vl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lb2 f42071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qv1 f42072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f42073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p73 f42074d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f42075e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f42076f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f42077g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f42078h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f42079j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f42080k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f42081l;

    public pv1(String str) {
        lb2 lb2Var = new lb2(4);
        this.f42071a = lb2Var;
        lb2Var.a()[0] = -1;
        this.f42072b = new qv1();
        this.f42081l = -9223372036854775807L;
        this.f42073c = str;
    }

    @Override // yads.vl0
    public final void a(lb2 lb2Var) {
        if (this.f42074d == null) {
            throw new IllegalStateException();
        }
        while (true) {
            int i = lb2Var.f40465c;
            int i10 = lb2Var.f40464b;
            int i11 = i - i10;
            if (i11 <= 0) {
                return;
            }
            int i12 = this.f42076f;
            if (i12 == 0) {
                byte[] bArr = lb2Var.f40463a;
                while (true) {
                    if (i10 >= i) {
                        lb2Var.e(i);
                        break;
                    }
                    byte b2 = bArr[i10];
                    boolean z5 = (b2 & 255) == 255;
                    boolean z10 = this.i && (b2 & 224) == 224;
                    this.i = z5;
                    if (z10) {
                        lb2Var.e(i10 + 1);
                        this.i = false;
                        this.f42071a.f40463a[1] = bArr[i10];
                        this.f42077g = 2;
                        this.f42076f = 1;
                        break;
                    }
                    i10++;
                }
            } else if (i12 == 1) {
                int iMin = Math.min(i11, 4 - this.f42077g);
                lb2Var.a(this.f42071a.f40463a, this.f42077g, iMin);
                int i13 = this.f42077g + iMin;
                this.f42077g = i13;
                if (i13 >= 4) {
                    this.f42071a.e(0);
                    if (this.f42072b.a(this.f42071a.b())) {
                        qv1 qv1Var = this.f42072b;
                        this.f42080k = qv1Var.f42398c;
                        if (!this.f42078h) {
                            long j10 = ((long) qv1Var.f42402g) * 1000000;
                            int i14 = qv1Var.f42399d;
                            this.f42079j = j10 / ((long) i14);
                            mx0 mx0Var = new mx0();
                            mx0Var.f41066a = this.f42075e;
                            mx0Var.f41075k = qv1Var.f42397b;
                            mx0Var.f41076l = 4096;
                            mx0Var.f41088x = qv1Var.f42400e;
                            mx0Var.f41089y = i14;
                            mx0Var.f41068c = this.f42073c;
                            this.f42074d.a(new nx0(mx0Var));
                            this.f42078h = true;
                        }
                        this.f42071a.e(0);
                        this.f42074d.a(4, this.f42071a);
                        this.f42076f = 2;
                    } else {
                        this.f42077g = 0;
                        this.f42076f = 1;
                    }
                }
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException();
                }
                int iMin2 = Math.min(i11, this.f42080k - this.f42077g);
                this.f42074d.a(iMin2, lb2Var);
                int i15 = this.f42077g + iMin2;
                this.f42077g = i15;
                int i16 = this.f42080k;
                if (i15 >= i16) {
                    long j11 = this.f42081l;
                    if (j11 != -9223372036854775807L) {
                        this.f42074d.a(j11, 1, i16, 0, null);
                        this.f42081l += this.f42079j;
                    }
                    this.f42077g = 0;
                    this.f42076f = 0;
                }
            }
        }
    }

    @Override // yads.vl0
    public final void b() {
    }

    @Override // yads.vl0
    public final void a(qq0 qq0Var, o93 o93Var) {
        o93Var.a();
        o93Var.b();
        this.f42075e = o93Var.f41502e;
        o93Var.b();
        this.f42074d = qq0Var.a(o93Var.f41501d, 1);
    }

    @Override // yads.vl0
    public final void a(int i, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f42081l = j10;
        }
    }

    @Override // yads.vl0
    public final void a() {
        this.f42076f = 0;
        this.f42077g = 0;
        this.i = false;
        this.f42081l = -9223372036854775807L;
    }
}
