package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class s8 implements t8, x5.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f10195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f10196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10197d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10198e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f10199f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f10200g;

    public s8(int i) {
        this.f10194a = i;
        switch (i) {
            case 3:
                this.f10199f = new m3.p(10);
                this.f10196c = -9223372036854775807L;
                break;
            default:
                this.f10199f = new tk0(10);
                this.f10196c = -9223372036854775807L;
                break;
        }
    }

    @Override // x5.f
    public void a() {
        switch (this.f10194a) {
            case 2:
                this.f10195b = false;
                this.f10196c = -9223372036854775807L;
                break;
            default:
                this.f10195b = false;
                this.f10196c = -9223372036854775807L;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.t8
    public void b(boolean z5) {
        int i;
        switch (this.f10194a) {
            case 0:
                if (this.f10195b) {
                    ix.k0(this.f10196c != -9223372036854775807L);
                    for (w2 w2Var : (w2[]) this.f10200g) {
                        w2Var.c(this.f10196c, 1, this.f10198e, 0, null);
                    }
                    this.f10195b = false;
                }
                break;
            default:
                ((w2) this.f10200g).getClass();
                if (this.f10195b && (i = this.f10197d) != 0 && this.f10198e == i) {
                    ix.k0(this.f10196c != -9223372036854775807L);
                    ((w2) this.f10200g).c(this.f10196c, 1, this.f10197d, 0, null);
                    this.f10195b = false;
                    break;
                }
                break;
        }
    }

    @Override // x5.f
    public void c(m3.p pVar) {
        boolean z5;
        boolean z10;
        switch (this.f10194a) {
            case 2:
                if (this.f10195b) {
                    if (this.f10197d == 2) {
                        if (pVar.a() == 0) {
                            z10 = false;
                        } else {
                            if (pVar.z() != 32) {
                                this.f10195b = false;
                            }
                            this.f10197d--;
                            z10 = this.f10195b;
                        }
                        if (!z10) {
                        }
                    }
                    if (this.f10197d == 1) {
                        if (pVar.a() == 0) {
                            z5 = false;
                        } else {
                            if (pVar.z() != 0) {
                                this.f10195b = false;
                            }
                            this.f10197d--;
                            z5 = this.f10195b;
                        }
                        if (!z5) {
                        }
                    }
                    int i = pVar.f28590b;
                    int iA = pVar.a();
                    for (q4.a0 a0Var : (q4.a0[]) this.f10200g) {
                        pVar.M(i);
                        a0Var.d(iA, pVar);
                    }
                    this.f10198e += iA;
                }
                break;
            default:
                m3.p pVar2 = (m3.p) this.f10199f;
                ((q4.a0) this.f10200g).getClass();
                if (this.f10195b) {
                    int iA2 = pVar.a();
                    int i10 = this.f10198e;
                    if (i10 < 10) {
                        int iMin = Math.min(iA2, 10 - i10);
                        System.arraycopy(pVar.f28589a, pVar.f28590b, pVar2.f28589a, this.f10198e, iMin);
                        if (this.f10198e + iMin == 10) {
                            pVar2.M(0);
                            if (73 == pVar2.z() && 68 == pVar2.z() && 51 == pVar2.z()) {
                                pVar2.N(3);
                                this.f10197d = pVar2.y() + 10;
                            } else {
                                m3.b.s("Id3Reader", "Discarding invalid ID3 tag");
                                this.f10195b = false;
                            }
                        }
                    }
                    int iMin2 = Math.min(iA2, this.f10197d - this.f10198e);
                    ((q4.a0) this.f10200g).d(iMin2, pVar);
                    this.f10198e += iMin2;
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.t8
    public void d(int i, long j10) {
        switch (this.f10194a) {
            case 0:
                if ((i & 4) != 0) {
                    this.f10195b = true;
                    this.f10196c = j10;
                    this.f10198e = 0;
                    this.f10197d = 2;
                    break;
                }
                break;
            default:
                if ((i & 4) != 0) {
                    this.f10195b = true;
                    this.f10196c = j10;
                    this.f10197d = 0;
                    this.f10198e = 0;
                    break;
                }
                break;
        }
    }

    @Override // x5.f
    public void e(q4.m mVar, r9 r9Var) {
        switch (this.f10194a) {
            case 2:
                q4.a0[] a0VarArr = (q4.a0[]) this.f10200g;
                for (int i = 0; i < a0VarArr.length; i++) {
                    x5.u uVar = (x5.u) ((List) this.f10199f).get(i);
                    r9Var.a();
                    r9Var.b();
                    q4.a0 a0VarP = mVar.P(r9Var.f9763d, 3);
                    j3.n nVar = new j3.n();
                    r9Var.b();
                    nVar.f26281a = (String) r9Var.f9764e;
                    nVar.f26291l = j3.c0.n("video/mp2t");
                    nVar.f26292m = j3.c0.n("application/dvbsubs");
                    nVar.f26295p = Collections.singletonList(uVar.f35975b);
                    nVar.f26284d = uVar.f35974a;
                    pe.a.q(nVar, a0VarP);
                    a0VarArr[i] = a0VarP;
                }
                break;
            default:
                r9Var.a();
                r9Var.b();
                q4.a0 a0VarP2 = mVar.P(r9Var.f9763d, 5);
                this.f10200g = a0VarP2;
                j3.n nVar2 = new j3.n();
                r9Var.b();
                nVar2.f26281a = (String) r9Var.f9764e;
                nVar2.f26291l = j3.c0.n("video/mp2t");
                nVar2.f26292m = j3.c0.n("application/id3");
                pe.a.q(nVar2, a0VarP2);
                break;
        }
    }

    @Override // x5.f
    public void f(boolean z5) {
        int i;
        switch (this.f10194a) {
            case 2:
                if (this.f10195b) {
                    com.google.android.gms.internal.measurement.h5.r(this.f10196c != -9223372036854775807L);
                    for (q4.a0 a0Var : (q4.a0[]) this.f10200g) {
                        a0Var.f(this.f10196c, 1, this.f10198e, 0, null);
                    }
                    this.f10195b = false;
                }
                break;
            default:
                ((q4.a0) this.f10200g).getClass();
                if (this.f10195b && (i = this.f10197d) != 0 && this.f10198e == i) {
                    com.google.android.gms.internal.measurement.h5.r(this.f10196c != -9223372036854775807L);
                    ((q4.a0) this.f10200g).f(this.f10196c, 1, this.f10197d, 0, null);
                    this.f10195b = false;
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.t8
    public void g(tk0 tk0Var) {
        boolean z5;
        boolean z10;
        switch (this.f10194a) {
            case 0:
                if (this.f10195b) {
                    if (this.f10197d == 2) {
                        if (tk0Var.B() == 0) {
                            z10 = false;
                        } else {
                            if (tk0Var.K() != 32) {
                                this.f10195b = false;
                            }
                            this.f10197d--;
                            z10 = this.f10195b;
                        }
                        if (!z10) {
                        }
                    }
                    if (this.f10197d == 1) {
                        if (tk0Var.B() == 0) {
                            z5 = false;
                        } else {
                            if (tk0Var.K() != 0) {
                                this.f10195b = false;
                            }
                            this.f10197d--;
                            z5 = this.f10195b;
                        }
                        if (!z5) {
                        }
                    }
                    int i = tk0Var.f10642b;
                    int iB = tk0Var.B();
                    for (w2 w2Var : (w2[]) this.f10200g) {
                        tk0Var.E(i);
                        w2Var.a(iB, tk0Var);
                    }
                    this.f10198e += iB;
                }
                break;
            default:
                ((w2) this.f10200g).getClass();
                if (this.f10195b) {
                    int iB2 = tk0Var.B();
                    int i10 = this.f10198e;
                    if (i10 < 10) {
                        int iMin = Math.min(iB2, 10 - i10);
                        byte[] bArr = tk0Var.f10641a;
                        int i11 = tk0Var.f10642b;
                        tk0 tk0Var2 = (tk0) this.f10199f;
                        System.arraycopy(bArr, i11, tk0Var2.f10641a, this.f10198e, iMin);
                        if (this.f10198e + iMin == 10) {
                            tk0Var2.E(0);
                            if (tk0Var2.K() == 73 && tk0Var2.K() == 68 && tk0Var2.K() == 51) {
                                tk0Var2.G(3);
                                this.f10197d = tk0Var2.g() + 10;
                            } else {
                                rs.r("Id3Reader", "Discarding invalid ID3 tag");
                                this.f10195b = false;
                            }
                        }
                    }
                    int iMin2 = Math.min(iB2, this.f10197d - this.f10198e);
                    ((w2) this.f10200g).a(iMin2, tk0Var);
                    this.f10198e += iMin2;
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.t8
    public void h() {
        switch (this.f10194a) {
            case 0:
                this.f10195b = false;
                this.f10196c = -9223372036854775807L;
                break;
            default:
                this.f10195b = false;
                this.f10196c = -9223372036854775807L;
                break;
        }
    }

    @Override // x5.f
    public void i(int i, long j10) {
        switch (this.f10194a) {
            case 2:
                if ((i & 4) != 0) {
                    this.f10195b = true;
                    this.f10196c = j10;
                    this.f10198e = 0;
                    this.f10197d = 2;
                    break;
                }
                break;
            default:
                if ((i & 4) != 0) {
                    this.f10195b = true;
                    this.f10196c = j10;
                    this.f10197d = 0;
                    this.f10198e = 0;
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.t8
    public void j(b2 b2Var, r9 r9Var) {
        switch (this.f10194a) {
            case 0:
                int i = 0;
                while (true) {
                    w2[] w2VarArr = (w2[]) this.f10200g;
                    if (i < w2VarArr.length) {
                        q9 q9Var = (q9) ((List) this.f10199f).get(i);
                        r9Var.f();
                        r9Var.g();
                        w2 w2VarO = b2Var.O(r9Var.f9763d, 3);
                        ow1 ow1Var = new ow1();
                        r9Var.g();
                        ow1Var.f8822a = (String) r9Var.f9764e;
                        ow1Var.d("video/mp2t");
                        ow1Var.e("application/dvbsubs");
                        ow1Var.f8835o = Collections.singletonList(q9Var.f9370b);
                        ow1Var.f8825d = q9Var.f9369a;
                        w2VarO.e(new jx1(ow1Var));
                        w2VarArr[i] = w2VarO;
                        i++;
                    }
                    break;
                }
                break;
            default:
                r9Var.f();
                r9Var.g();
                w2 w2VarO2 = b2Var.O(r9Var.f9763d, 5);
                this.f10200g = w2VarO2;
                ow1 ow1Var2 = new ow1();
                r9Var.g();
                ow1Var2.f8822a = (String) r9Var.f9764e;
                ow1Var2.d("video/mp2t");
                ow1Var2.e("application/id3");
                w2VarO2.e(new jx1(ow1Var2));
                break;
        }
    }

    public s8(List list, int i) {
        this.f10194a = i;
        switch (i) {
            case 2:
                this.f10199f = list;
                this.f10200g = new q4.a0[list.size()];
                this.f10196c = -9223372036854775807L;
                break;
            default:
                this.f10199f = list;
                this.f10200g = new w2[list.size()];
                this.f10196c = -9223372036854775807L;
                break;
        }
    }
}
