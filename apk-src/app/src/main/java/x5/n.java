package x5;

import com.google.android.gms.internal.ads.r9;
import com.google.android.gms.internal.ads.y2;
import m3.w;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f35913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y2 f35914b = new y2(10, new byte[10]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f35915c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f35916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public w f35917e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f35918f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f35919g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f35920h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f35921j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f35922k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f35923l;

    public n(f fVar) {
        this.f35913a = fVar;
    }

    @Override // x5.v
    public final void a() {
        this.f35915c = 0;
        this.f35916d = 0;
        this.f35920h = false;
        this.f35913a.a();
    }

    @Override // x5.v
    public final void b(w wVar, q4.m mVar, r9 r9Var) {
        this.f35917e = wVar;
        this.f35913a.e(mVar, r9Var);
    }

    @Override // x5.v
    public final void c(int i, m3.p pVar) {
        this.f35917e.getClass();
        int i10 = i & 1;
        int i11 = -1;
        int i12 = 2;
        f fVar = this.f35913a;
        if (i10 != 0) {
            int i13 = this.f35915c;
            if (i13 != 0 && i13 != 1) {
                if (i13 == 2) {
                    m3.b.s("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i13 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.f35921j != -1) {
                        m3.b.s("PesReader", "Unexpected start indicator: expected " + this.f35921j + " more bytes");
                    }
                    fVar.f(pVar.f28591c == 0);
                }
            }
            this.f35915c = 1;
            this.f35916d = 0;
        }
        int i14 = i;
        while (pVar.a() > 0) {
            int i15 = this.f35915c;
            if (i15 != 0) {
                y2 y2Var = this.f35914b;
                if (i15 != 1) {
                    if (i15 == i12) {
                        if (d(pVar, y2Var.f12462b, Math.min(10, this.i)) && d(pVar, null, this.i)) {
                            y2Var.q(0);
                            this.f35923l = -9223372036854775807L;
                            if (this.f35918f) {
                                y2Var.t(4);
                                long jI = ((long) y2Var.i(3)) << 30;
                                y2Var.t(1);
                                long jI2 = ((long) (y2Var.i(15) << 15)) | jI;
                                y2Var.t(1);
                                long jI3 = jI2 | ((long) y2Var.i(15));
                                y2Var.t(1);
                                if (!this.f35920h && this.f35919g) {
                                    y2Var.t(4);
                                    long jI4 = ((long) y2Var.i(3)) << 30;
                                    y2Var.t(1);
                                    long jI5 = jI4 | ((long) (y2Var.i(15) << 15));
                                    y2Var.t(1);
                                    long jI6 = jI5 | ((long) y2Var.i(15));
                                    y2Var.t(1);
                                    this.f35917e.b(jI6);
                                    this.f35920h = true;
                                }
                                this.f35923l = this.f35917e.b(jI3);
                            }
                            i14 |= this.f35922k ? 4 : 0;
                            fVar.i(i14, this.f35923l);
                            this.f35915c = 3;
                            this.f35916d = 0;
                        }
                    } else {
                        if (i15 != 3) {
                            throw new IllegalStateException();
                        }
                        int iA = pVar.a();
                        int i16 = this.f35921j;
                        int i17 = i16 == i11 ? 0 : iA - i16;
                        if (i17 > 0) {
                            iA -= i17;
                            pVar.L(pVar.f28590b + iA);
                        }
                        fVar.c(pVar);
                        int i18 = this.f35921j;
                        if (i18 != i11) {
                            int i19 = i18 - iA;
                            this.f35921j = i19;
                            if (i19 == 0) {
                                fVar.f(false);
                                this.f35915c = 1;
                                this.f35916d = 0;
                            }
                        }
                    }
                } else if (d(pVar, y2Var.f12462b, 9)) {
                    this.f35915c = e() ? 2 : 0;
                    this.f35916d = 0;
                }
            } else {
                pVar.N(pVar.a());
            }
            i11 = -1;
            i12 = 2;
        }
    }

    public final boolean d(m3.p pVar, byte[] bArr, int i) {
        int iMin = Math.min(pVar.a(), i - this.f35916d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            pVar.N(iMin);
        } else {
            pVar.k(bArr, this.f35916d, iMin);
        }
        int i10 = this.f35916d + iMin;
        this.f35916d = i10;
        return i10 == i;
    }

    public final boolean e() {
        y2 y2Var = this.f35914b;
        y2Var.q(0);
        int i = y2Var.i(24);
        if (i != 1) {
            gf.a.p(i, "Unexpected start code prefix: ", "PesReader");
            this.f35921j = -1;
            return false;
        }
        y2Var.t(8);
        int i10 = y2Var.i(16);
        y2Var.t(5);
        this.f35922k = y2Var.h();
        y2Var.t(2);
        this.f35918f = y2Var.h();
        this.f35919g = y2Var.h();
        y2Var.t(6);
        int i11 = y2Var.i(8);
        this.i = i11;
        if (i10 == 0) {
            this.f35921j = -1;
        } else {
            int i12 = (i10 - 3) - i11;
            this.f35921j = i12;
            if (i12 < 0) {
                m3.b.s("PesReader", "Found negative packet payload size: " + this.f35921j);
                this.f35921j = -1;
            }
        }
        return true;
    }
}
