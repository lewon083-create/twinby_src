package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class p30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f8904c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f8905d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f8906e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f8907f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f8908g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f8909h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f8910j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f8911k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f8912l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f8913m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f8914n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f8915o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public double f8916p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f8917q;

    public p30(int i, int i10, float f10, float f11, int i11, boolean z5, int i12) {
        switch (i12) {
            case 1:
                this.f8902a = i;
                this.f8903b = i10;
                this.f8904c = f10;
                this.f8905d = f11;
                this.f8906e = i / i11;
                this.f8907f = i / 400;
                int i13 = i / 65;
                this.f8908g = i13;
                this.f8909h = i13 * 2;
                this.f8917q = z5 ? new j20(this, false) : new b30(this, false);
                break;
            default:
                this.f8902a = i;
                this.f8903b = i10;
                this.f8904c = f10;
                this.f8905d = f11;
                this.f8906e = i / i11;
                this.f8907f = i / 400;
                int i14 = i / 65;
                this.f8908g = i14;
                this.f8909h = i14 + i14;
                this.f8917q = z5 ? new j20(this) : new b30(this);
                break;
        }
    }

    public void a(int i, int i10) {
        k3.m mVar = (k3.m) this.f8917q;
        mVar.t(i10);
        Object objP = mVar.p();
        int i11 = this.f8903b;
        System.arraycopy(objP, i * i11, mVar.q(), this.f8910j * i11, i11 * i10);
        this.f8910j += i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void b() {
        int i;
        int iH;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        long j10;
        long j11;
        k3.m mVar = (k3.m) this.f8917q;
        int i16 = this.f8910j;
        float f10 = this.f8904c;
        float f11 = this.f8905d;
        double d10 = f10 / f11;
        float f12 = this.f8906e * f11;
        int i17 = this.f8902a;
        int i18 = 1;
        int i19 = this.f8903b;
        if (d10 > 1.0000100135803223d || d10 < 0.9999899864196777d) {
            int i20 = this.i;
            int i21 = this.f8909h;
            if (i20 >= i21) {
                int i22 = 0;
                while (true) {
                    int i23 = this.f8914n;
                    if (i23 > 0) {
                        int iMin = Math.min(i21, i23);
                        a(i22, iMin);
                        this.f8914n -= iMin;
                        i22 += iMin;
                        i = i21;
                        i10 = i18;
                        i11 = i19;
                    } else {
                        int i24 = i17 > 4000 ? i17 / 4000 : i18;
                        int i25 = this.f8908g;
                        int i26 = this.f8907f;
                        if (i19 == i18 && i24 == i18) {
                            iH = mVar.m(i22, i26, i25);
                            i = i21;
                        } else {
                            mVar.j(i22, i24);
                            i = i21;
                            int iH2 = mVar.H(i26 / i24, i25 / i24);
                            if (i24 != i18) {
                                int i27 = iH2 * i24;
                                int i28 = i24 * 4;
                                int i29 = i27 - i28;
                                int i30 = i27 + i28;
                                if (i29 >= i26) {
                                    i26 = i29;
                                }
                                if (i30 <= i25) {
                                    i25 = i30;
                                }
                                if (i19 == i18) {
                                    iH = mVar.m(i22, i26, i25);
                                } else {
                                    mVar.j(i22, i18);
                                    iH = mVar.H(i26, i25);
                                }
                            } else {
                                iH = iH2;
                            }
                        }
                        int i31 = mVar.u() ? this.f8915o : iH;
                        mVar.n();
                        this.f8915o = iH;
                        if (d10 > 1.0d) {
                            if (d10 >= 2.0d) {
                                i10 = i18;
                                i11 = i19;
                                double d11 = (((double) i31) / (d10 - 1.0d)) + this.f8916p;
                                int iRound = (int) Math.round(d11);
                                this.f8916p = d11 - ((double) iRound);
                                i13 = iRound;
                            } else {
                                i10 = i18;
                                i11 = i19;
                                double d12 = (((2.0d - d10) * ((double) i31)) / (d10 - 1.0d)) + this.f8916p;
                                int iRound2 = (int) Math.round(d12);
                                this.f8914n = iRound2;
                                this.f8916p = d12 - ((double) iRound2);
                                i13 = i31;
                            }
                            mVar.t(i13);
                            mVar.z(i13, this.f8903b, this.f8910j, i22, i22 + i31);
                            this.f8910j += i13;
                            i22 = i31 + i13 + i22;
                        } else {
                            i10 = i18;
                            i11 = i19;
                            if (d10 < 0.5d) {
                                double d13 = ((((double) i31) * d10) / (1.0d - d10)) + this.f8916p;
                                int iRound3 = (int) Math.round(d13);
                                this.f8916p = d13 - ((double) iRound3);
                                i12 = iRound3;
                            } else {
                                double d14 = ((((2.0d * d10) - 1.0d) * ((double) i31)) / (1.0d - d10)) + this.f8916p;
                                int iRound4 = (int) Math.round(d14);
                                this.f8914n = iRound4;
                                this.f8916p = d14 - ((double) iRound4);
                                i12 = i31;
                            }
                            int i32 = i31 + i12;
                            mVar.t(i32);
                            System.arraycopy(mVar.p(), i22 * i11, mVar.q(), this.f8910j * i11, i31 * i11);
                            int i33 = i22;
                            mVar = mVar;
                            mVar.z(i12, this.f8903b, this.f8910j + i31, i22 + i31, i33);
                            this.f8910j += i32;
                            i22 = i33 + i12;
                        }
                    }
                    if (i22 + i > i20) {
                        break;
                    }
                    i21 = i;
                    i18 = i10;
                    i19 = i11;
                }
                int i34 = this.i - i22;
                System.arraycopy(mVar.p(), i22 * i11, mVar.p(), 0, i34 * i11);
                this.i = i34;
            }
            if (f12 != 1.0f || this.f8910j == i16) {
            }
            long j12 = (long) (i17 / f12);
            long j13 = i17;
            while (j12 != 0 && j13 != 0 && j12 % 2 == 0 && j13 % 2 == 0) {
                j12 /= 2;
                j13 /= 2;
            }
            int i35 = this.f8910j - i16;
            mVar.A(i35);
            System.arraycopy(mVar.q(), i16 * i11, mVar.y(), this.f8911k * i11, i35 * i11);
            this.f8910j = i16;
            this.f8911k += i35;
            int i36 = 0;
            while (true) {
                i14 = this.f8911k - 1;
                if (i36 >= i14) {
                    break;
                }
                while (true) {
                    i15 = this.f8912l + 1;
                    j10 = i15;
                    long j14 = j10 * j12;
                    j11 = this.f8913m;
                    if (j14 <= j11 * j13) {
                        break;
                    }
                    int i37 = i10;
                    mVar.t(i37);
                    mVar.e(i36, j13, j12);
                    this.f8913m += i37;
                    this.f8910j += i37;
                }
                int i38 = i10;
                this.f8912l = i15;
                if (j10 == j13) {
                    this.f8912l = 0;
                    com.google.android.gms.internal.measurement.h5.r(j11 == j12 ? i38 : 0);
                    this.f8913m = 0;
                }
                i36++;
                i10 = i38;
            }
            if (i14 == 0) {
                return;
            }
            System.arraycopy(mVar.y(), i14 * i11, mVar.y(), 0, (this.f8911k - i14) * i11);
            this.f8911k -= i14;
            return;
        }
        a(0, this.i);
        this.i = 0;
        i10 = 1;
        i11 = i19;
        if (f12 != 1.0f) {
        }
    }

    public void c(int i, int i10) {
        s20 s20Var = (s20) this.f8917q;
        s20Var.v(i10);
        Object objX = s20Var.x();
        Object objO = s20Var.o();
        int i11 = this.f8910j;
        int i12 = this.f8903b;
        System.arraycopy(objX, i * i12, objO, i11 * i12, i10 * i12);
        this.f8910j += i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d() {
        /*
            Method dump skipped, instruction units count: 578
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.p30.d():void");
    }
}
