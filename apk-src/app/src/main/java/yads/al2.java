package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class al2 implements sp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b73 f36764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lb2 f36765b = new lb2();

    public al2(b73 b73Var) {
        this.f36764a = b73Var;
    }

    @Override // yads.sp
    public final void a() {
        this.f36765b.a(lb3.f40471f);
    }

    @Override // yads.sp
    public final rp a(ld0 ld0Var, long j10) {
        int i;
        int i10;
        int iA;
        long j11 = ld0Var.f40505d;
        int iMin = (int) Math.min(20000L, ld0Var.f40504c - j11);
        this.f36765b.c(iMin);
        ld0Var.b(this.f36765b.f40463a, 0, iMin, false);
        lb2 lb2Var = this.f36765b;
        int i11 = -1;
        int i12 = -1;
        long j12 = -9223372036854775807L;
        while (true) {
            int i13 = lb2Var.f40465c;
            int i14 = lb2Var.f40464b;
            if (i13 - i14 < 4) {
                return j12 != -9223372036854775807L ? new rp(-2, j12, j11 + ((long) i11)) : rp.f42676d;
            }
            if (bl2.a(i14, lb2Var.f40463a) != 442) {
                lb2Var.e(lb2Var.f40464b + 1);
            } else {
                lb2Var.e(lb2Var.f40464b + 4);
                long jA = cl2.a(lb2Var);
                if (jA != -9223372036854775807L) {
                    long jB = this.f36764a.b(jA);
                    if (jB > j10) {
                        return j12 == -9223372036854775807L ? new rp(-1, jB, j11) : new rp(0, -9223372036854775807L, j11 + ((long) i12));
                    }
                    if (jB + 100000 > j10) {
                        return new rp(0, -9223372036854775807L, j11 + ((long) lb2Var.f40464b));
                    }
                    j12 = jB;
                    i12 = lb2Var.f40464b;
                }
                int i15 = lb2Var.f40465c;
                int i16 = lb2Var.f40464b;
                if (i15 - i16 < 10) {
                    lb2Var.e(i15);
                } else {
                    lb2Var.e(i16 + 9);
                    int iM = lb2Var.m() & 7;
                    int i17 = lb2Var.f40465c;
                    int i18 = lb2Var.f40464b;
                    if (i17 - i18 < iM) {
                        lb2Var.e(i15);
                    } else {
                        lb2Var.e(i18 + iM);
                        int i19 = lb2Var.f40465c;
                        int i20 = lb2Var.f40464b;
                        if (i19 - i20 < 4) {
                            lb2Var.e(i15);
                        } else if (bl2.a(i20, lb2Var.f40463a) == 443) {
                            lb2Var.e(lb2Var.f40464b + 4);
                            int iR = lb2Var.r();
                            int i21 = lb2Var.f40465c;
                            int i22 = lb2Var.f40464b;
                            if (i21 - i22 < iR) {
                                lb2Var.e(i15);
                            } else {
                                lb2Var.e(i22 + iR);
                                while (true) {
                                    i = lb2Var.f40465c;
                                    i10 = lb2Var.f40464b;
                                    if (i - i10 < 4 || (iA = bl2.a(i10, lb2Var.f40463a)) == 442 || iA == 441 || (iA >>> 8) != 1) {
                                        break;
                                    }
                                    lb2Var.e(lb2Var.f40464b + 4);
                                    if (lb2Var.f40465c - lb2Var.f40464b < 2) {
                                        lb2Var.e(i15);
                                        break;
                                    }
                                    lb2Var.e(Math.min(lb2Var.f40465c, lb2Var.f40464b + lb2Var.r()));
                                }
                            }
                        } else {
                            while (true) {
                                i = lb2Var.f40465c;
                                i10 = lb2Var.f40464b;
                                if (i - i10 < 4) {
                                    break;
                                }
                                break;
                                lb2Var.e(Math.min(lb2Var.f40465c, lb2Var.f40464b + lb2Var.r()));
                            }
                        }
                    }
                }
                i11 = lb2Var.f40464b;
            }
        }
    }
}
