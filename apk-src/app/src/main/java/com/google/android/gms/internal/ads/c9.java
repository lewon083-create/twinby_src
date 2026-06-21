package com.google.android.gms.internal.ads;

import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c9 implements t8, x5.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f4099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean[] f4101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f4102d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f4103e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f4104f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f4105g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f4106h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f4107j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f4108k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f4109l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f4110m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f4111n;

    public c9(o9 o9Var) {
        this.f4104f = o9Var;
        this.f4101c = new boolean[3];
        this.i = new h9(32, 0);
        this.f4107j = new h9(33, 0);
        this.f4108k = new h9(34, 0);
        this.f4109l = new h9(39, 0);
        this.f4110m = new h9(40, 0);
        this.f4103e = -9223372036854775807L;
        this.f4111n = new tk0();
    }

    @Override // x5.f
    public void a() {
        this.f4102d = 0L;
        this.f4103e = -9223372036854775807L;
        n3.n.a(this.f4101c);
        ((h9) this.i).c();
        ((h9) this.f4107j).c();
        ((h9) this.f4108k).c();
        ((h9) this.f4109l).c();
        ((h9) this.f4110m).c();
        ((yd1) ((bb.e) this.f4104f).f2021e).b(0);
        b9 b9Var = (b9) this.f4106h;
        if (b9Var != null) {
            b9Var.f3676e = false;
            b9Var.f3677f = false;
            b9Var.f3678g = false;
            b9Var.f3679h = false;
            b9Var.i = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.t8
    public void b(boolean z5) {
        ((w2) this.f4105g).getClass();
        String str = cq0.f4293a;
        if (z5) {
            ((o9) this.f4104f).f8642d.i(0);
            p(0, 0, this.f4102d, this.f4103e);
            n(0, 48, this.f4102d, this.f4103e);
        }
    }

    @Override // x5.f
    public void c(m3.p pVar) {
        int i;
        ((q4.a0) this.f4105g).getClass();
        String str = m3.z.f28608a;
        while (pVar.a() > 0) {
            int i10 = pVar.f28590b;
            int i11 = pVar.f28591c;
            byte[] bArr = pVar.f28589a;
            this.f4102d += (long) pVar.a();
            ((q4.a0) this.f4105g).d(pVar.a(), pVar);
            while (i10 < i11) {
                int iB = n3.n.b(bArr, i10, i11, this.f4101c);
                if (iB == i11) {
                    l(bArr, i10, i11);
                    return;
                }
                int i12 = (bArr[iB + 3] & 126) >> 1;
                if (iB <= 0 || bArr[iB - 1] != 0) {
                    i = 3;
                } else {
                    iB--;
                    i = 4;
                }
                int i13 = iB;
                int i14 = i;
                int i15 = i13 - i10;
                if (i15 > 0) {
                    l(bArr, i10, i13);
                }
                int i16 = i11 - i13;
                long j10 = this.f4102d - ((long) i16);
                k(i16, i15 < 0 ? -i15 : 0, j10, this.f4103e);
                m(i16, i12, j10, this.f4103e);
                i10 = i13 + i14;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.t8
    public void d(int i, long j10) {
        this.f4103e = j10;
    }

    @Override // x5.f
    public void e(q4.m mVar, r9 r9Var) {
        r9Var.a();
        r9Var.b();
        this.f4099a = (String) r9Var.f9764e;
        r9Var.b();
        q4.a0 a0VarP = mVar.P(r9Var.f9763d, 2);
        this.f4105g = a0VarP;
        this.f4106h = new b9(a0VarP);
        ((bb.e) this.f4104f).m(mVar, r9Var);
    }

    @Override // x5.f
    public void f(boolean z5) {
        ((q4.a0) this.f4105g).getClass();
        String str = m3.z.f28608a;
        if (z5) {
            ((yd1) ((bb.e) this.f4104f).f2021e).b(0);
            k(0, 0, this.f4102d, this.f4103e);
            m(0, 48, this.f4102d, this.f4103e);
        }
    }

    @Override // com.google.android.gms.internal.ads.t8
    public void g(tk0 tk0Var) {
        ((w2) this.f4105g).getClass();
        String str = cq0.f4293a;
        while (tk0Var.B() > 0) {
            int i = tk0Var.f10642b;
            int i10 = tk0Var.f10643c;
            byte[] bArr = tk0Var.f10641a;
            this.f4102d += (long) tk0Var.B();
            ((w2) this.f4105g).a(tk0Var.B(), tk0Var);
            while (i < i10) {
                int iN = rs.N(bArr, i, i10, this.f4101c);
                if (iN == i10) {
                    o(bArr, i, i10);
                    return;
                }
                int i11 = bArr[iN + 3] & 126;
                int i12 = 3;
                if (iN > 0) {
                    int i13 = iN - 1;
                    if (bArr[i13] == 0) {
                        i12 = 4;
                        iN = i13;
                    }
                }
                int i14 = iN - i;
                if (i14 > 0) {
                    o(bArr, i, iN);
                }
                int i15 = i10 - iN;
                long j10 = this.f4102d - ((long) i15);
                p(i15, i14 < 0 ? -i14 : 0, j10, this.f4103e);
                n(i15, i11 >> 1, j10, this.f4103e);
                i = iN + i12;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.t8
    public void h() {
        this.f4102d = 0L;
        this.f4103e = -9223372036854775807L;
        rs.O(this.f4101c);
        ((h9) this.i).e();
        ((h9) this.f4107j).e();
        ((h9) this.f4108k).e();
        ((h9) this.f4109l).e();
        ((h9) this.f4110m).e();
        ((o9) this.f4104f).f8642d.i(0);
        b9 b9Var = (b9) this.f4106h;
        if (b9Var != null) {
            b9Var.f3676e = false;
            b9Var.f3677f = false;
            b9Var.f3678g = false;
            b9Var.f3679h = false;
            b9Var.i = false;
        }
    }

    @Override // x5.f
    public void i(int i, long j10) {
        this.f4103e = j10;
    }

    @Override // com.google.android.gms.internal.ads.t8
    public void j(b2 b2Var, r9 r9Var) {
        r9Var.f();
        r9Var.g();
        this.f4099a = (String) r9Var.f9764e;
        r9Var.g();
        w2 w2VarO = b2Var.O(r9Var.f9763d, 2);
        this.f4105g = w2VarO;
        this.f4106h = new b9(w2VarO);
        ((o9) this.f4104f).a(b2Var, r9Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void k(int r32, int r33, long r34, long r36) {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.c9.k(int, int, long, long):void");
    }

    public void l(byte[] bArr, int i, int i10) {
        b9 b9Var = (b9) this.f4106h;
        if (b9Var.f3676e) {
            int i11 = b9Var.f3674c;
            int i12 = (i + 2) - i11;
            if (i12 < i10) {
                b9Var.f3677f = (bArr[i12] & 128) != 0;
                b9Var.f3676e = false;
            } else {
                b9Var.f3674c = (i10 - i) + i11;
            }
        }
        if (!this.f4100b) {
            ((h9) this.i).a(bArr, i, i10);
            ((h9) this.f4107j).a(bArr, i, i10);
            ((h9) this.f4108k).a(bArr, i, i10);
        }
        ((h9) this.f4109l).a(bArr, i, i10);
        ((h9) this.f4110m).a(bArr, i, i10);
    }

    public void m(int i, int i10, long j10, long j11) {
        b9 b9Var = (b9) this.f4106h;
        boolean z5 = this.f4100b;
        b9Var.f3677f = false;
        b9Var.f3678g = false;
        b9Var.f3675d = j11;
        b9Var.f3674c = 0;
        b9Var.f3672a = j10;
        if (i10 >= 32 && i10 != 40) {
            if (b9Var.f3679h && !b9Var.i) {
                if (z5) {
                    b9Var.a(i);
                }
                b9Var.f3679h = false;
            }
            if ((32 <= i10 && i10 <= 35) || i10 == 39) {
                b9Var.f3678g = !b9Var.i;
                b9Var.i = true;
            }
        }
        boolean z10 = i10 >= 16 && i10 <= 21;
        b9Var.f3673b = z10;
        b9Var.f3676e = z10 || i10 <= 9;
        if (!this.f4100b) {
            ((h9) this.i).d(i10);
            ((h9) this.f4107j).d(i10);
            ((h9) this.f4108k).d(i10);
        }
        ((h9) this.f4109l).d(i10);
        ((h9) this.f4110m).d(i10);
    }

    public void n(int i, int i10, long j10, long j11) {
        b9 b9Var = (b9) this.f4106h;
        boolean z5 = this.f4100b;
        b9Var.f3677f = false;
        b9Var.f3678g = false;
        b9Var.f3675d = j11;
        b9Var.f3674c = 0;
        b9Var.f3672a = j10;
        if (i10 >= 32 && i10 != 40) {
            if (b9Var.f3679h && !b9Var.i) {
                if (z5) {
                    b9Var.b(i);
                }
                b9Var.f3679h = false;
            }
            if (i10 <= 35 || i10 == 39) {
                b9Var.f3678g = !b9Var.i;
                b9Var.i = true;
            }
        }
        boolean z10 = i10 >= 16 && i10 <= 21;
        b9Var.f3673b = z10;
        b9Var.f3676e = z10 || i10 <= 9;
        if (!this.f4100b) {
            ((h9) this.i).f(i10);
            ((h9) this.f4107j).f(i10);
            ((h9) this.f4108k).f(i10);
        }
        ((h9) this.f4109l).f(i10);
        ((h9) this.f4110m).f(i10);
    }

    public void o(byte[] bArr, int i, int i10) {
        b9 b9Var = (b9) this.f4106h;
        if (b9Var.f3676e) {
            int i11 = b9Var.f3674c;
            int i12 = (i + 2) - i11;
            if (i12 < i10) {
                b9Var.f3677f = (bArr[i12] & 128) != 0;
                b9Var.f3676e = false;
            } else {
                b9Var.f3674c = (i10 - i) + i11;
            }
        }
        if (!this.f4100b) {
            ((h9) this.i).g(bArr, i, i10);
            ((h9) this.f4107j).g(bArr, i, i10);
            ((h9) this.f4108k).g(bArr, i, i10);
        }
        ((h9) this.f4109l).g(bArr, i, i10);
        ((h9) this.f4110m).g(bArr, i, i10);
    }

    public void p(int i, int i10, long j10, long j11) {
        tk0 tk0Var = (tk0) this.f4111n;
        yd1 yd1Var = ((o9) this.f4104f).f8642d;
        b9 b9Var = (b9) this.f4106h;
        boolean z5 = this.f4100b;
        if (b9Var.i && b9Var.f3677f) {
            b9Var.f3682l = b9Var.f3673b;
            b9Var.i = false;
        } else if (b9Var.f3678g || b9Var.f3677f) {
            if (z5 && b9Var.f3679h) {
                b9Var.b(i + ((int) (j10 - b9Var.f3672a)));
            }
            b9Var.f3680j = b9Var.f3672a;
            b9Var.f3681k = b9Var.f3675d;
            b9Var.f3682l = b9Var.f3673b;
            b9Var.f3679h = true;
        }
        if (!this.f4100b) {
            h9 h9Var = (h9) this.i;
            h9Var.h(i10);
            h9 h9Var2 = (h9) this.f4107j;
            h9Var2.h(i10);
            h9 h9Var3 = (h9) this.f4108k;
            h9Var3.h(i10);
            if (h9Var.f6055c && h9Var2.f6055c && h9Var3.f6055c) {
                String str = this.f4099a;
                int i11 = h9Var.f6057e;
                byte[] bArr = new byte[h9Var2.f6057e + i11 + h9Var3.f6057e];
                System.arraycopy(h9Var.f6056d, 0, bArr, 0, i11);
                System.arraycopy(h9Var2.f6056d, 0, bArr, h9Var.f6057e, h9Var2.f6057e);
                System.arraycopy(h9Var3.f6056d, 0, bArr, h9Var.f6057e + h9Var2.f6057e, h9Var3.f6057e);
                String strA = null;
                xz0 xz0VarJ = rs.J(h9Var2.f6056d, 3, h9Var2.f6057e, null);
                sx0 sx0Var = (sx0) xz0VarJ.f12421m;
                if (sx0Var != null) {
                    int i12 = sx0Var.f10431f;
                    int[] iArr = sx0Var.f10430e;
                    int i13 = sx0Var.f10429d;
                    strA = ea0.a(sx0Var.f10426a, sx0Var.f10427b, sx0Var.f10428c, i13, iArr, i12);
                }
                ow1 ow1Var = new ow1();
                ow1Var.f8822a = str;
                ow1Var.d("video/mp2t");
                ow1Var.e("video/hevc");
                ow1Var.i = strA;
                ow1Var.f8839s = xz0VarJ.f12413d;
                ow1Var.f8840t = xz0VarJ.f12414e;
                ow1Var.f8841u = xz0VarJ.f12415f;
                ow1Var.f8842v = xz0VarJ.f12416g;
                ow1Var.B = new rm1(xz0VarJ.f12418j, xz0VarJ.f12419k, xz0VarJ.f12420l, xz0VarJ.f12411b + 8, xz0VarJ.f12412c + 8, null);
                ow1Var.f8845y = xz0VarJ.f12417h;
                ow1Var.f8834n = xz0VarJ.i;
                ow1Var.C = xz0VarJ.f12410a + 1;
                ow1Var.f8835o = Collections.singletonList(bArr);
                jx1 jx1Var = new jx1(ow1Var);
                ((w2) this.f4105g).e(jx1Var);
                int i14 = jx1Var.f6977o;
                ix.k0(i14 != -1);
                yd1Var.g(i14);
                this.f4100b = true;
            }
        }
        h9 h9Var4 = (h9) this.f4109l;
        if (h9Var4.h(i10)) {
            tk0Var.z(rs.c(h9Var4.f6057e, h9Var4.f6056d), h9Var4.f6056d);
            tk0Var.G(5);
            yd1Var.h(j11, tk0Var);
        }
        h9 h9Var5 = (h9) this.f4110m;
        if (h9Var5.h(i10)) {
            tk0Var.z(rs.c(h9Var5.f6057e, h9Var5.f6056d), h9Var5.f6056d);
            tk0Var.G(5);
            yd1Var.h(j11, tk0Var);
        }
    }

    public c9(bb.e eVar) {
        this.f4104f = eVar;
        this.f4101c = new boolean[3];
        this.i = new h9(32, 1);
        this.f4107j = new h9(33, 1);
        this.f4108k = new h9(34, 1);
        this.f4109l = new h9(39, 1);
        this.f4110m = new h9(40, 1);
        this.f4103e = -9223372036854775807L;
        this.f4111n = new m3.p();
    }
}
