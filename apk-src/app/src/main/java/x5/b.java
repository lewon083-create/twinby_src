package x5;

import com.google.android.gms.internal.ads.j0;
import com.google.android.gms.internal.ads.r9;
import com.google.android.gms.internal.ads.vq0;
import com.google.android.gms.internal.ads.y2;
import com.google.android.gms.internal.measurement.h5;
import j3.c0;
import java.util.Objects;
import q4.a0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y2 f35780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m3.p f35781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f35782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f35783e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f35784f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f35785g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a0 f35786h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f35787j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f35788k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f35789l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public j3.o f35790m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f35791n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f35792o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(String str) {
        this(0, 0, null, str);
        this.f35779a = 0;
    }

    @Override // x5.f
    public final void a() {
        switch (this.f35779a) {
            case 0:
                this.i = 0;
                this.f35787j = 0;
                this.f35788k = false;
                this.f35792o = -9223372036854775807L;
                break;
            default:
                this.i = 0;
                this.f35787j = 0;
                this.f35788k = false;
                this.f35792o = -9223372036854775807L;
                break;
        }
    }

    @Override // x5.f
    public final void c(m3.p pVar) {
        switch (this.f35779a) {
            case 0:
                this.f35786h.getClass();
                while (pVar.a() > 0) {
                    int i = this.i;
                    m3.p pVar2 = this.f35781c;
                    if (i == 0) {
                        while (true) {
                            if (pVar.a() <= 0) {
                            }
                            if (this.f35788k) {
                                int iZ = pVar.z();
                                if (iZ == 119) {
                                    this.f35788k = false;
                                    this.i = 1;
                                    byte[] bArr = pVar2.f28589a;
                                    bArr[0] = 11;
                                    bArr[1] = 119;
                                    this.f35787j = 2;
                                } else {
                                    this.f35788k = iZ == 11;
                                }
                            } else {
                                this.f35788k = pVar.z() == 11;
                            }
                            break;
                        }
                    } else if (i == 1) {
                        byte[] bArr2 = pVar2.f28589a;
                        int iMin = Math.min(pVar.a(), 128 - this.f35787j);
                        pVar.k(bArr2, this.f35787j, iMin);
                        int i10 = this.f35787j + iMin;
                        this.f35787j = i10;
                        if (i10 == 128) {
                            y2 y2Var = this.f35780b;
                            y2Var.q(0);
                            vq0 vq0VarQ = q4.b.q(y2Var);
                            int i11 = vq0VarQ.f11445e;
                            int i12 = vq0VarQ.f11441a;
                            int i13 = vq0VarQ.f11442b;
                            String str = (String) vq0VarQ.f11446f;
                            j3.o oVar = this.f35790m;
                            if (oVar == null || i13 != oVar.F || i12 != oVar.G || !Objects.equals(str, oVar.f26335n)) {
                                j3.n nVar = new j3.n();
                                nVar.f26281a = this.f35785g;
                                nVar.f26291l = c0.n(this.f35784f);
                                nVar.f26292m = c0.n(str);
                                nVar.E = i13;
                                nVar.F = i12;
                                nVar.f26284d = this.f35782d;
                                nVar.f26286f = this.f35783e;
                                nVar.i = i11;
                                if ("audio/ac3".equals(str)) {
                                    nVar.f26288h = i11;
                                }
                                j3.o oVar2 = new j3.o(nVar);
                                this.f35790m = oVar2;
                                this.f35786h.a(oVar2);
                            }
                            this.f35791n = vq0VarQ.f11443c;
                            this.f35789l = (((long) vq0VarQ.f11444d) * 1000000) / ((long) this.f35790m.G);
                            pVar2.M(0);
                            this.f35786h.d(128, pVar2);
                            this.i = 2;
                        }
                    } else if (i == 2) {
                        int iMin2 = Math.min(pVar.a(), this.f35791n - this.f35787j);
                        this.f35786h.d(iMin2, pVar);
                        int i14 = this.f35787j + iMin2;
                        this.f35787j = i14;
                        if (i14 == this.f35791n) {
                            h5.r(this.f35792o != -9223372036854775807L);
                            this.f35786h.f(this.f35792o, 1, this.f35791n, 0, null);
                            this.f35792o += this.f35789l;
                            this.i = 0;
                        }
                    }
                }
                break;
            default:
                this.f35786h.getClass();
                while (pVar.a() > 0) {
                    int i15 = this.i;
                    m3.p pVar3 = this.f35781c;
                    if (i15 == 0) {
                        while (pVar.a() > 0) {
                            if (this.f35788k) {
                                int iZ2 = pVar.z();
                                this.f35788k = iZ2 == 172;
                                if (iZ2 == 64 || iZ2 == 65) {
                                    boolean z5 = iZ2 == 65;
                                    this.i = 1;
                                    byte[] bArr3 = pVar3.f28589a;
                                    bArr3[0] = -84;
                                    bArr3[1] = (byte) (z5 ? 65 : 64);
                                    this.f35787j = 2;
                                }
                            } else {
                                this.f35788k = pVar.z() == 172;
                            }
                        }
                    } else if (i15 == 1) {
                        byte[] bArr4 = pVar3.f28589a;
                        int iMin3 = Math.min(pVar.a(), 16 - this.f35787j);
                        pVar.k(bArr4, this.f35787j, iMin3);
                        int i16 = this.f35787j + iMin3;
                        this.f35787j = i16;
                        if (i16 == 16) {
                            y2 y2Var2 = this.f35780b;
                            y2Var2.q(0);
                            j0 j0VarR = q4.b.r(y2Var2);
                            int i17 = j0VarR.f6666a;
                            j3.o oVar3 = this.f35790m;
                            if (oVar3 == null || 2 != oVar3.F || i17 != oVar3.G || !"audio/ac4".equals(oVar3.f26335n)) {
                                j3.n nVar2 = new j3.n();
                                nVar2.f26281a = this.f35785g;
                                nVar2.f26291l = c0.n(this.f35784f);
                                nVar2.f26292m = c0.n("audio/ac4");
                                nVar2.E = 2;
                                nVar2.F = i17;
                                nVar2.f26284d = this.f35782d;
                                nVar2.f26286f = this.f35783e;
                                j3.o oVar4 = new j3.o(nVar2);
                                this.f35790m = oVar4;
                                this.f35786h.a(oVar4);
                            }
                            this.f35791n = j0VarR.f6667b;
                            this.f35789l = (((long) j0VarR.f6668c) * 1000000) / ((long) this.f35790m.G);
                            pVar3.M(0);
                            this.f35786h.d(16, pVar3);
                            this.i = 2;
                        }
                    } else if (i15 == 2) {
                        int iMin4 = Math.min(pVar.a(), this.f35791n - this.f35787j);
                        this.f35786h.d(iMin4, pVar);
                        int i18 = this.f35787j + iMin4;
                        this.f35787j = i18;
                        if (i18 == this.f35791n) {
                            h5.r(this.f35792o != -9223372036854775807L);
                            this.f35786h.f(this.f35792o, 1, this.f35791n, 0, null);
                            this.f35792o += this.f35789l;
                            this.i = 0;
                        }
                    }
                }
                break;
        }
    }

    @Override // x5.f
    public final void e(q4.m mVar, r9 r9Var) {
        switch (this.f35779a) {
            case 0:
                r9Var.a();
                r9Var.b();
                this.f35785g = (String) r9Var.f9764e;
                r9Var.b();
                this.f35786h = mVar.P(r9Var.f9763d, 1);
                break;
            default:
                r9Var.a();
                r9Var.b();
                this.f35785g = (String) r9Var.f9764e;
                r9Var.b();
                this.f35786h = mVar.P(r9Var.f9763d, 1);
                break;
        }
    }

    @Override // x5.f
    public final void f(boolean z5) {
        int i = this.f35779a;
    }

    @Override // x5.f
    public final void i(int i, long j10) {
        switch (this.f35779a) {
            case 0:
                this.f35792o = j10;
                break;
            default:
                this.f35792o = j10;
                break;
        }
    }

    public b(int i, int i10, String str, String str2) {
        this.f35779a = i10;
        switch (i10) {
            case 1:
                y2 y2Var = new y2(16, new byte[16]);
                this.f35780b = y2Var;
                this.f35781c = new m3.p(y2Var.f12462b);
                this.i = 0;
                this.f35787j = 0;
                this.f35788k = false;
                this.f35792o = -9223372036854775807L;
                this.f35782d = str;
                this.f35783e = i;
                this.f35784f = str2;
                break;
            default:
                y2 y2Var2 = new y2(128, new byte[128]);
                this.f35780b = y2Var2;
                this.f35781c = new m3.p(y2Var2.f12462b);
                this.i = 0;
                this.f35792o = -9223372036854775807L;
                this.f35782d = str;
                this.f35783e = i;
                this.f35784f = str2;
                break;
        }
    }

    private final void b(boolean z5) {
    }

    private final void d(boolean z5) {
    }
}
