package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class kc2 implements p93 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vl0 f40155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kb2 f40156b = new kb2(new byte[10]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f40157c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f40158d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b73 f40159e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f40160f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f40161g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f40162h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f40163j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f40164k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f40165l;

    public kc2(vl0 vl0Var) {
        this.f40155a = vl0Var;
    }

    @Override // yads.p93
    public final void a(int i, lb2 lb2Var) {
        int i10;
        int i11;
        int i12;
        if (this.f40159e == null) {
            throw new IllegalStateException();
        }
        int i13 = -1;
        int i14 = 0;
        if ((i & 1) != 0) {
            int i15 = this.f40157c;
            if (i15 != 0 && i15 != 1) {
                if (i15 == 2) {
                    kh1.d("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i15 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.f40163j != -1) {
                        kh1.d("PesReader", "Unexpected start indicator: expected " + this.f40163j + " more bytes");
                    }
                    this.f40155a.b();
                }
            }
            this.f40157c = 1;
            this.f40158d = 0;
        }
        int i16 = i;
        while (true) {
            int i17 = lb2Var.f40465c;
            int i18 = lb2Var.f40464b;
            int i19 = i17 - i18;
            if (i19 <= 0) {
                return;
            }
            int i20 = this.f40157c;
            if (i20 == 0) {
                i10 = i13;
                i11 = i14;
                lb2Var.e(i19 + i18);
            } else if (i20 != 1) {
                if (i20 != 2) {
                    if (i20 != 3) {
                        throw new IllegalStateException();
                    }
                    int i21 = this.f40163j;
                    int i22 = i21 == i13 ? i14 : i19 - i21;
                    if (i22 > 0) {
                        i19 -= i22;
                        lb2Var.d(i18 + i19);
                    }
                    this.f40155a.a(lb2Var);
                    int i23 = this.f40163j;
                    if (i23 != i13) {
                        int i24 = i23 - i19;
                        this.f40163j = i24;
                        if (i24 == 0) {
                            this.f40155a.b();
                            this.f40157c = 1;
                            this.f40158d = i14;
                        }
                    }
                } else if (a(Math.min(10, this.i), lb2Var, this.f40156b.f40144a) && a(this.i, lb2Var, (byte[]) null)) {
                    this.f40156b.b(i14);
                    this.f40165l = -9223372036854775807L;
                    if (this.f40160f) {
                        this.f40156b.c(4);
                        long jA = ((long) this.f40156b.a(3)) << 30;
                        this.f40156b.c(1);
                        long jA2 = ((long) (this.f40156b.a(15) << 15)) | jA;
                        this.f40156b.c(1);
                        long jA3 = jA2 | ((long) this.f40156b.a(15));
                        this.f40156b.c(1);
                        if (!this.f40162h && this.f40161g) {
                            this.f40156b.c(4);
                            long jA4 = ((long) this.f40156b.a(3)) << 30;
                            this.f40156b.c(1);
                            long jA5 = jA4 | ((long) (this.f40156b.a(15) << 15));
                            this.f40156b.c(1);
                            long jA6 = jA5 | ((long) this.f40156b.a(15));
                            this.f40156b.c(1);
                            this.f40159e.b(jA6);
                            this.f40162h = true;
                        }
                        this.f40165l = this.f40159e.b(jA3);
                    }
                    i16 |= this.f40164k ? 4 : 0;
                    this.f40155a.a(i16, this.f40165l);
                    this.f40157c = 3;
                    this.f40158d = 0;
                    i14 = 0;
                    i13 = -1;
                }
                i10 = i13;
                i11 = i14;
            } else {
                i11 = i14;
                if (a(9, lb2Var, this.f40156b.f40144a)) {
                    this.f40156b.b(i11);
                    int iA = this.f40156b.a(24);
                    if (iA != 1) {
                        mf1.a("Unexpected start code prefix: ", iA, "PesReader");
                        this.f40163j = -1;
                        i12 = 0;
                        i10 = -1;
                    } else {
                        this.f40156b.c(8);
                        int iA2 = this.f40156b.a(16);
                        this.f40156b.c(5);
                        this.f40164k = this.f40156b.e();
                        this.f40156b.c(2);
                        this.f40160f = this.f40156b.e();
                        this.f40161g = this.f40156b.e();
                        this.f40156b.c(6);
                        int iA3 = this.f40156b.a(8);
                        this.i = iA3;
                        if (iA2 == 0) {
                            this.f40163j = -1;
                        } else {
                            int i25 = (iA2 - 3) - iA3;
                            this.f40163j = i25;
                            if (i25 < 0) {
                                kh1.d("PesReader", "Found negative packet payload size: " + this.f40163j);
                                i10 = -1;
                                this.f40163j = -1;
                            }
                            i12 = 2;
                        }
                        i10 = -1;
                        i12 = 2;
                    }
                    this.f40157c = i12;
                    i11 = 0;
                    this.f40158d = 0;
                } else {
                    i10 = -1;
                }
            }
            i14 = i11;
            i13 = i10;
        }
    }

    public final boolean a(int i, lb2 lb2Var, byte[] bArr) {
        int iMin = Math.min(lb2Var.f40465c - lb2Var.f40464b, i - this.f40158d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            lb2Var.e(lb2Var.f40464b + iMin);
        } else {
            lb2Var.a(bArr, this.f40158d, iMin);
        }
        int i10 = this.f40158d + iMin;
        this.f40158d = i10;
        return i10 == i;
    }

    @Override // yads.p93
    public final void a(b73 b73Var, qq0 qq0Var, o93 o93Var) {
        this.f40159e = b73Var;
        this.f40155a.a(qq0Var, o93Var);
    }

    @Override // yads.p93
    public final void a() {
        this.f40157c = 0;
        this.f40158d = 0;
        this.f40162h = false;
        this.f40155a.a();
    }
}
