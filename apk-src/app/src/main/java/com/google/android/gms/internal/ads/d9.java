package com.google.android.gms.internal.ads;

import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d9 implements t8, x5.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f4501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4502d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4503e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4504f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4505g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f4506h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4507j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4508k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4509l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f4510m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f4511n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f4512o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f4513p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f4514q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f4515r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f4516s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f4517t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object f4518u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f4519v;

    public d9(String str, int i, int i10) {
        switch (i10) {
            case 1:
                this.f4499a = str;
                this.f4500b = i;
                m3.p pVar = new m3.p(1024);
                this.f4516s = pVar;
                byte[] bArr = pVar.f28589a;
                this.f4517t = new y2(bArr.length, bArr);
                this.f4506h = -9223372036854775807L;
                break;
            default:
                this.f4499a = str;
                this.f4500b = i;
                tk0 tk0Var = new tk0(1024);
                this.f4516s = tk0Var;
                byte[] bArr2 = tk0Var.f10641a;
                this.f4517t = new ik0(bArr2.length, bArr2);
                this.f4506h = -9223372036854775807L;
                break;
        }
    }

    @Override // x5.f
    public void a() {
        this.f4502d = 0;
        this.f4506h = -9223372036854775807L;
        this.i = false;
    }

    @Override // x5.f
    public void c(m3.p pVar) throws j3.d0 {
        int i;
        boolean zH;
        m3.p pVar2 = (m3.p) this.f4516s;
        y2 y2Var = (y2) this.f4517t;
        ((q4.a0) this.f4518u).getClass();
        while (pVar.a() > 0) {
            int i10 = this.f4502d;
            if (i10 != 0) {
                if (i10 == 1) {
                    int iZ = pVar.z();
                    if ((iZ & 224) == 224) {
                        this.f4505g = iZ;
                        this.f4502d = 2;
                    } else if (iZ != 86) {
                        this.f4502d = 0;
                    }
                } else if (i10 == 2) {
                    int iZ2 = ((this.f4505g & (-225)) << 8) | pVar.z();
                    this.f4504f = iZ2;
                    if (iZ2 > pVar2.f28589a.length) {
                        pVar2.J(iZ2);
                        byte[] bArr = pVar2.f28589a;
                        y2Var.getClass();
                        y2Var.o(bArr.length, bArr);
                    }
                    this.f4503e = 0;
                    this.f4502d = 3;
                } else {
                    if (i10 != 3) {
                        throw new IllegalStateException();
                    }
                    int iMin = Math.min(pVar.a(), this.f4504f - this.f4503e);
                    pVar.k(y2Var.f12462b, this.f4503e, iMin);
                    int i11 = this.f4503e + iMin;
                    this.f4503e = i11;
                    if (i11 == this.f4504f) {
                        y2Var.q(0);
                        if (y2Var.h()) {
                            if (this.i) {
                            }
                            this.f4502d = 0;
                        } else {
                            this.i = true;
                            int i12 = y2Var.i(1);
                            int i13 = i12 == 1 ? y2Var.i(1) : 0;
                            this.f4507j = i13;
                            if (i13 != 0) {
                                throw j3.d0.a(null, null);
                            }
                            if (i12 == 1) {
                                y2Var.i((y2Var.i(2) + 1) * 8);
                            }
                            if (!y2Var.h()) {
                                throw j3.d0.a(null, null);
                            }
                            this.f4508k = y2Var.i(6);
                            int i14 = y2Var.i(4);
                            int i15 = y2Var.i(3);
                            if (i14 != 0 || i15 != 0) {
                                throw j3.d0.a(null, null);
                            }
                            if (i12 == 0) {
                                int iG = y2Var.g();
                                int iB = y2Var.b();
                                q4.a aVarS = q4.b.s(y2Var, true);
                                this.f4515r = aVarS.f31693a;
                                this.f4512o = aVarS.f31694b;
                                this.f4514q = aVarS.f31695c;
                                int iB2 = iB - y2Var.b();
                                y2Var.q(iG);
                                byte[] bArr2 = new byte[(iB2 + 7) / 8];
                                y2Var.j(iB2, bArr2);
                                j3.n nVar = new j3.n();
                                nVar.f26281a = this.f4501c;
                                nVar.f26291l = j3.c0.n("video/mp2t");
                                nVar.f26292m = j3.c0.n("audio/mp4a-latm");
                                nVar.f26289j = this.f4515r;
                                nVar.E = this.f4514q;
                                nVar.F = this.f4512o;
                                nVar.f26295p = Collections.singletonList(bArr2);
                                nVar.f26284d = this.f4499a;
                                nVar.f26286f = this.f4500b;
                                j3.o oVar = new j3.o(nVar);
                                if (!oVar.equals((j3.o) this.f4519v)) {
                                    this.f4519v = oVar;
                                    this.f4513p = 1024000000 / ((long) oVar.G);
                                    ((q4.a0) this.f4518u).a(oVar);
                                }
                            } else {
                                int iB3 = y2Var.b();
                                q4.a aVarS2 = q4.b.s(y2Var, true);
                                this.f4515r = aVarS2.f31693a;
                                this.f4512o = aVarS2.f31694b;
                                this.f4514q = aVarS2.f31695c;
                                y2Var.t(y2Var.i((y2Var.i(2) + 1) * 8) - (iB3 - y2Var.b()));
                            }
                            int i16 = y2Var.i(3);
                            this.f4509l = i16;
                            if (i16 == 0) {
                                y2Var.t(8);
                            } else if (i16 == 1) {
                                y2Var.t(9);
                            } else if (i16 == 3 || i16 == 4 || i16 == 5) {
                                y2Var.t(6);
                            } else {
                                if (i16 != 6 && i16 != 7) {
                                    throw new IllegalStateException();
                                }
                                y2Var.t(1);
                            }
                            boolean zH2 = y2Var.h();
                            this.f4510m = zH2;
                            this.f4511n = 0L;
                            if (zH2) {
                                if (i12 == 1) {
                                    this.f4511n = y2Var.i((y2Var.i(2) + 1) * 8);
                                } else {
                                    do {
                                        zH = y2Var.h();
                                        this.f4511n = (this.f4511n << 8) + ((long) y2Var.i(8));
                                    } while (zH);
                                }
                            }
                            if (y2Var.h()) {
                                y2Var.t(8);
                            }
                        }
                        if (this.f4507j != 0) {
                            throw j3.d0.a(null, null);
                        }
                        if (this.f4508k != 0) {
                            throw j3.d0.a(null, null);
                        }
                        if (this.f4509l != 0) {
                            throw j3.d0.a(null, null);
                        }
                        int i17 = 0;
                        do {
                            i = y2Var.i(8);
                            i17 += i;
                        } while (i == 255);
                        int iG2 = y2Var.g();
                        if ((iG2 & 7) == 0) {
                            pVar2.M(iG2 >> 3);
                        } else {
                            y2Var.j(i17 * 8, pVar2.f28589a);
                            pVar2.M(0);
                        }
                        ((q4.a0) this.f4518u).d(i17, pVar2);
                        com.google.android.gms.internal.measurement.h5.r(this.f4506h != -9223372036854775807L);
                        ((q4.a0) this.f4518u).f(this.f4506h, 1, i17, 0, null);
                        this.f4506h += this.f4513p;
                        if (this.f4510m) {
                            y2Var.t((int) this.f4511n);
                        }
                        this.f4502d = 0;
                    } else {
                        continue;
                    }
                }
            } else if (pVar.z() == 86) {
                this.f4502d = 1;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.t8
    public void d(int i, long j10) {
        this.f4506h = j10;
    }

    @Override // x5.f
    public void e(q4.m mVar, r9 r9Var) {
        r9Var.a();
        r9Var.b();
        this.f4518u = mVar.P(r9Var.f9763d, 1);
        r9Var.b();
        this.f4501c = (String) r9Var.f9764e;
    }

    @Override // com.google.android.gms.internal.ads.t8
    public void g(tk0 tk0Var) throws eb {
        int iH;
        int i;
        int iH2;
        boolean zG;
        int i10;
        ik0 ik0Var = (ik0) this.f4517t;
        tk0 tk0Var2 = (tk0) this.f4516s;
        ((w2) this.f4518u).getClass();
        while (tk0Var.B() > 0) {
            int i11 = this.f4502d;
            if (i11 != 0) {
                if (i11 == 1) {
                    int iK = tk0Var.K();
                    if ((iK & 224) == 224) {
                        this.f4505g = iK;
                        this.f4502d = 2;
                    } else if (iK != 86) {
                        this.f4502d = 0;
                    }
                } else if (i11 != 2) {
                    int iMin = Math.min(tk0Var.B(), this.f4504f - this.f4503e);
                    tk0Var.H(ik0Var.f6518a, this.f4503e, iMin);
                    int i12 = this.f4503e + iMin;
                    this.f4503e = i12;
                    if (i12 == this.f4504f) {
                        ik0Var.d(0);
                        if (ik0Var.g()) {
                            if (this.i) {
                            }
                            this.f4502d = 0;
                        } else {
                            this.i = true;
                            int iH3 = ik0Var.h(1);
                            if (iH3 == 1) {
                                iH2 = ik0Var.h(1);
                                i = 1;
                            } else {
                                i = iH3;
                                iH2 = 0;
                            }
                            this.f4507j = iH2;
                            if (iH2 != 0) {
                                throw eb.a(null, null);
                            }
                            if (i == 1) {
                                ik0Var.h((ik0Var.h(2) + 1) * 8);
                                i = 1;
                            }
                            if (!ik0Var.g()) {
                                throw eb.a(null, null);
                            }
                            this.f4508k = ik0Var.h(6);
                            int iH4 = ik0Var.h(4);
                            int iH5 = ik0Var.h(3);
                            if (iH4 != 0 || iH5 != 0) {
                                throw eb.a(null, null);
                            }
                            if (i == 0) {
                                int i13 = (ik0Var.f6519b * 8) + ik0Var.f6520c;
                                int iB = ik0Var.b();
                                l1 l1VarK = rs.k(ik0Var, true);
                                this.f4515r = l1VarK.f7369a;
                                this.f4512o = l1VarK.f7370b;
                                this.f4514q = l1VarK.f7371c;
                                int iB2 = iB - ik0Var.b();
                                ik0Var.d(i13);
                                byte[] bArr = new byte[(iB2 + 7) / 8];
                                ik0Var.j(iB2, bArr);
                                ow1 ow1Var = new ow1();
                                ow1Var.f8822a = this.f4501c;
                                ow1Var.d("video/mp2t");
                                ow1Var.e("audio/mp4a-latm");
                                ow1Var.i = this.f4515r;
                                ow1Var.D = this.f4514q;
                                ow1Var.E = this.f4512o;
                                ow1Var.f8835o = Collections.singletonList(bArr);
                                ow1Var.f8825d = this.f4499a;
                                ow1Var.f8827f = this.f4500b;
                                jx1 jx1Var = new jx1(ow1Var);
                                if (!jx1Var.equals((jx1) this.f4519v)) {
                                    this.f4519v = jx1Var;
                                    this.f4513p = 1024000000 / ((long) jx1Var.F);
                                    ((w2) this.f4518u).e(jx1Var);
                                }
                            } else {
                                int iB3 = ik0Var.b();
                                l1 l1VarK2 = rs.k(ik0Var, true);
                                this.f4515r = l1VarK2.f7369a;
                                this.f4512o = l1VarK2.f7370b;
                                this.f4514q = l1VarK2.f7371c;
                                ik0Var.f(ik0Var.h((ik0Var.h(2) + 1) * 8) - (iB3 - ik0Var.b()));
                            }
                            int iH6 = ik0Var.h(3);
                            this.f4509l = iH6;
                            if (iH6 == 0) {
                                ik0Var.f(8);
                            } else if (iH6 == 1) {
                                ik0Var.f(9);
                            } else if (iH6 == 3 || iH6 == 4 || iH6 == 5) {
                                ik0Var.f(6);
                            } else {
                                if (iH6 != 6 && iH6 != 7) {
                                    throw new IllegalStateException();
                                }
                                ik0Var.f(1);
                            }
                            boolean zG2 = ik0Var.g();
                            this.f4510m = zG2;
                            this.f4511n = 0L;
                            if (zG2) {
                                if (i != 1) {
                                    do {
                                        zG = ik0Var.g();
                                        this.f4511n = (this.f4511n << 8) + ((long) ik0Var.h(8));
                                    } while (zG);
                                } else {
                                    this.f4511n = ik0Var.h((ik0Var.h(2) + 1) * 8);
                                }
                            }
                            if (ik0Var.g()) {
                                ik0Var.f(8);
                            }
                        }
                        if (this.f4507j != 0) {
                            throw eb.a(null, null);
                        }
                        if (this.f4508k != 0) {
                            throw eb.a(null, null);
                        }
                        if (this.f4509l != 0) {
                            throw eb.a(null, null);
                        }
                        int i14 = 0;
                        do {
                            iH = ik0Var.h(8);
                            i14 += iH;
                        } while (iH == 255);
                        int i15 = (ik0Var.f6519b * 8) + ik0Var.f6520c;
                        if ((i15 & 7) == 0) {
                            tk0Var2.E(i15 >> 3);
                        } else {
                            ik0Var.j(i14 * 8, tk0Var2.f10641a);
                            tk0Var2.E(0);
                        }
                        ((w2) this.f4518u).a(i14, tk0Var2);
                        ix.k0(this.f4506h != -9223372036854775807L);
                        ((w2) this.f4518u).c(this.f4506h, 1, i14, 0, null);
                        this.f4506h += this.f4513p;
                        if (this.f4510m) {
                            ik0Var.f((int) this.f4511n);
                        }
                        this.f4502d = 0;
                    } else {
                        continue;
                    }
                } else {
                    int iK2 = ((this.f4505g & (-225)) << 8) | tk0Var.K();
                    this.f4504f = iK2;
                    if (iK2 > tk0Var2.f10641a.length) {
                        tk0Var2.y(iK2);
                        byte[] bArr2 = tk0Var2.f10641a;
                        int length = bArr2.length;
                        ik0Var.f6518a = bArr2;
                        i10 = 0;
                        ik0Var.f6519b = 0;
                        ik0Var.f6520c = 0;
                        ik0Var.f6521d = length;
                    } else {
                        i10 = 0;
                    }
                    this.f4503e = i10;
                    this.f4502d = 3;
                }
            } else if (tk0Var.K() == 86) {
                this.f4502d = 1;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.t8
    public void h() {
        this.f4502d = 0;
        this.f4506h = -9223372036854775807L;
        this.i = false;
    }

    @Override // x5.f
    public void i(int i, long j10) {
        this.f4506h = j10;
    }

    @Override // com.google.android.gms.internal.ads.t8
    public void j(b2 b2Var, r9 r9Var) {
        r9Var.f();
        r9Var.g();
        this.f4518u = b2Var.O(r9Var.f9763d, 1);
        r9Var.g();
        this.f4501c = (String) r9Var.f9764e;
    }

    @Override // com.google.android.gms.internal.ads.t8
    public void b(boolean z5) {
    }

    @Override // x5.f
    public void f(boolean z5) {
    }
}
