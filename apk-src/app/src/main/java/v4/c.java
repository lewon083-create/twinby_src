package v4;

import ad.j0;
import com.google.android.gms.internal.ads.e2;
import com.google.android.gms.internal.ads.g2;
import com.google.android.gms.internal.ads.p1;
import com.google.android.gms.internal.ads.y2;
import j3.b0;
import j3.c0;
import j3.d0;
import j3.n;
import j3.o;
import java.util.Arrays;
import m3.p;
import m3.z;
import ni.i;
import q4.a0;
import q4.h;
import q4.k;
import q4.l;
import q4.m;
import q4.t;
import s3.q;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m f34744e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a0 f34745f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b0 f34747h;
    public g2 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f34748j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f34749k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public b f34750l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f34751m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f34752n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f34740a = new byte[42];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f34741b = new p(0, new byte[32768]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f34742c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e2 f34743d = new e2();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f34746g = 0;

    @Override // q4.k
    public final int a(l lVar, e2 e2Var) throws d0 {
        int i;
        t oVar;
        long j10;
        long j11;
        boolean zD;
        long jH;
        long j12;
        int i10 = this.f34746g;
        b0 b0Var = null;
        if (i10 == 0) {
            lVar.L();
            long jZ = lVar.z();
            b0 b0VarZ = new i(7).z(lVar, !this.f34742c ? null : e5.i.f16250g, 0);
            if (b0VarZ != null && b0VarZ.f26216a.length != 0) {
                b0Var = b0VarZ;
            }
            lVar.M((int) (lVar.z() - jZ));
            this.f34747h = b0Var;
            this.f34746g = 1;
            return 0;
        }
        byte[] bArr = this.f34740a;
        if (i10 == 1) {
            lVar.V(bArr, 0, bArr.length);
            lVar.L();
            this.f34746g = 2;
            return 0;
        }
        int i11 = 4;
        int i12 = 3;
        if (i10 == 2) {
            p pVar = new p(4);
            lVar.readFully(pVar.f28589a, 0, 4);
            if (pVar.B() != 1716281667) {
                throw d0.a(null, "Failed to read FLAC stream marker.");
            }
            this.f34746g = 3;
            return 0;
        }
        if (i10 == 3) {
            int i13 = 0;
            g2 g2Var = this.i;
            boolean z5 = false;
            while (!z5) {
                lVar.L();
                byte[] bArr2 = new byte[i11];
                y2 y2Var = new y2(i11, bArr2);
                int i14 = i13;
                lVar.V(bArr2, i14, i11);
                boolean zH = y2Var.h();
                int i15 = y2Var.i(i);
                int i16 = y2Var.i(24) + i11;
                if (i15 == 0) {
                    byte[] bArr3 = new byte[38];
                    lVar.readFully(bArr3, i14, 38);
                    g2Var = new g2(bArr3, i11, i);
                } else {
                    if (g2Var == null) {
                        throw new IllegalArgumentException();
                    }
                    b0 b0Var2 = (b0) g2Var.f5614l;
                    if (i15 == i12) {
                        p pVar2 = new p(i16);
                        lVar.readFully(pVar2.f28589a, i14, i16);
                        g2Var = new g2(g2Var.f5604a, g2Var.f5605b, g2Var.f5606c, g2Var.f5607d, g2Var.f5608e, g2Var.f5610g, g2Var.f5611h, g2Var.f5612j, q4.b.y(pVar2), (b0) g2Var.f5614l);
                    } else if (i15 == i11) {
                        p pVar3 = new p(i16);
                        lVar.readFully(pVar3.f28589a, 0, i16);
                        pVar3.N(i11);
                        b0 b0VarW = q4.b.w(Arrays.asList((String[]) q4.b.z(pVar3, false, false).f27180c));
                        if (b0Var2 != null) {
                            b0VarW = b0Var2.b(b0VarW);
                        }
                        g2Var = new g2(g2Var.f5604a, g2Var.f5605b, g2Var.f5606c, g2Var.f5607d, g2Var.f5608e, g2Var.f5610g, g2Var.f5611h, g2Var.f5612j, (l6.i) g2Var.f5613k, b0VarW);
                    } else if (i15 == 6) {
                        p pVar4 = new p(i16);
                        lVar.readFully(pVar4.f28589a, 0, i16);
                        pVar4.N(4);
                        b0 b0Var3 = new b0(j0.w(c5.a.d(pVar4)));
                        if (b0Var2 != null) {
                            b0Var3 = b0Var2.b(b0Var3);
                        }
                        g2Var = new g2(g2Var.f5604a, g2Var.f5605b, g2Var.f5606c, g2Var.f5607d, g2Var.f5608e, g2Var.f5610g, g2Var.f5611h, g2Var.f5612j, (l6.i) g2Var.f5613k, b0Var3);
                    } else {
                        lVar.M(i16);
                    }
                }
                String str = z.f28608a;
                this.i = g2Var;
                z5 = zH;
                i = 7;
                i = 1;
                i11 = 4;
                i12 = 3;
                i13 = 0;
            }
            this.i.getClass();
            this.f34748j = Math.max(this.i.f5606c, 6);
            o oVarC = this.i.c(bArr, this.f34747h);
            a0 a0Var = this.f34745f;
            n nVarA = oVarC.a();
            nVarA.f26291l = c0.n("audio/flac");
            pe.a.q(nVarA, a0Var);
            this.f34745f.b(this.i.b());
            this.f34746g = 4;
            return 0;
        }
        long j13 = 0;
        if (i10 == 4) {
            lVar.L();
            p pVar5 = new p(2);
            lVar.V(pVar5.f28589a, 0, 2);
            int iG = pVar5.G();
            if ((iG >> 2) != 16382) {
                lVar.L();
                throw d0.a(null, "First frame does not start with sync code.");
            }
            lVar.L();
            this.f34749k = iG;
            m mVar = this.f34744e;
            String str2 = z.f28608a;
            long position = lVar.getPosition();
            long length = lVar.getLength();
            this.i.getClass();
            g2 g2Var2 = this.i;
            l6.i iVar = (l6.i) g2Var2.f5613k;
            if (iVar != null && ((long[]) iVar.f27978c).length > 0) {
                oVar = new q4.o(g2Var2, position, 0);
                i = 0;
            } else if (length == -1 || g2Var2.f5612j <= 0) {
                i = 0;
                oVar = new q4.o(g2Var2.b());
            } else {
                int i17 = this.f34749k;
                int i18 = g2Var2.f5606c;
                q qVar = new q(17, g2Var2);
                a aVar = new a(g2Var2, i17);
                long jB = g2Var2.b();
                long j14 = g2Var2.f5612j;
                int i19 = g2Var2.f5607d;
                if (i19 > 0) {
                    i = 0;
                    j10 = ((((long) i19) + ((long) i18)) / 2) + 1;
                } else {
                    i = 0;
                    int i20 = g2Var2.f5604a;
                    j10 = 64 + (((((i20 != g2Var2.f5605b || i20 <= 0) ? 4096L : i20) * ((long) g2Var2.f5610g)) * ((long) g2Var2.f5611h)) / 8);
                }
                b bVar = new b(qVar, aVar, jB, j14, position, length, j10, Math.max(6, i18));
                this.f34750l = bVar;
                oVar = (q4.c) bVar.f10460b;
            }
            mVar.j(oVar);
            this.f34746g = 5;
            return i;
        }
        if (i10 != 5) {
            throw new IllegalStateException();
        }
        this.f34745f.getClass();
        this.i.getClass();
        b bVar2 = this.f34750l;
        if (bVar2 != null && ((p1) bVar2.f10462d) != null) {
            return bVar2.a(lVar, e2Var);
        }
        if (this.f34752n == -1) {
            g2 g2Var3 = this.i;
            lVar.L();
            lVar.B(1);
            byte[] bArr4 = new byte[1];
            lVar.V(bArr4, 0, 1);
            boolean z10 = (bArr4[0] & 1) == 1;
            lVar.B(2);
            i = z10 ? 7 : 6;
            p pVar6 = new p(i);
            byte[] bArr5 = pVar6.f28589a;
            int i21 = 0;
            while (i21 < i) {
                int I = lVar.I(bArr5, i21, i - i21);
                if (I == -1) {
                    break;
                }
                i21 += I;
            }
            pVar6.L(i21);
            lVar.L();
            try {
                jH = pVar6.H();
                if (!z10) {
                    jH *= (long) g2Var3.f5605b;
                }
                j12 = g2Var3.f5612j;
            } catch (NumberFormatException unused) {
            }
            if (j12 == 0 || jH <= j12) {
                j13 = jH;
            } else {
                i = 0;
            }
            if (i == 0) {
                throw d0.a(null, null);
            }
            this.f34752n = j13;
        } else {
            p pVar7 = this.f34741b;
            int i22 = pVar7.f28591c;
            if (i22 < 32768) {
                int i23 = lVar.read(pVar7.f28589a, i22, 32768 - i22);
                i = i23 != -1 ? 0 : 1;
                if (i == 0) {
                    pVar7.L(i22 + i23);
                } else if (pVar7.a() == 0) {
                    long j15 = this.f34752n * 1000000;
                    g2 g2Var4 = this.i;
                    String str3 = z.f28608a;
                    this.f34745f.f(j15 / ((long) g2Var4.f5608e), 1, this.f34751m, 0, null);
                    return -1;
                }
            } else {
                i = 0;
            }
            int i24 = pVar7.f28590b;
            int i25 = this.f34751m;
            int i26 = this.f34748j;
            if (i25 < i26) {
                pVar7.N(Math.min(i26 - i25, pVar7.a()));
            }
            this.i.getClass();
            int i27 = pVar7.f28590b;
            while (true) {
                int i28 = pVar7.f28591c - 16;
                e2 e2Var2 = this.f34743d;
                if (i27 <= i28) {
                    pVar7.M(i27);
                    if (q4.b.d(pVar7, this.i, this.f34749k, e2Var2)) {
                        pVar7.M(i27);
                        j11 = e2Var2.f4793b;
                        break;
                    }
                    i27++;
                } else {
                    if (i != 0) {
                        while (true) {
                            int i29 = pVar7.f28591c;
                            if (i27 > i29 - this.f34748j) {
                                pVar7.M(i29);
                                break;
                            }
                            pVar7.M(i27);
                            try {
                                zD = q4.b.d(pVar7, this.i, this.f34749k, e2Var2);
                            } catch (IndexOutOfBoundsException unused2) {
                                zD = false;
                            }
                            if (pVar7.f28590b > pVar7.f28591c) {
                                zD = false;
                            }
                            if (zD) {
                                pVar7.M(i27);
                                j11 = e2Var2.f4793b;
                                break;
                            }
                            i27++;
                        }
                    } else {
                        pVar7.M(i27);
                    }
                    j11 = -1;
                }
            }
            int i30 = pVar7.f28590b - i24;
            pVar7.M(i24);
            this.f34745f.d(i30, pVar7);
            int i31 = this.f34751m + i30;
            this.f34751m = i31;
            if (j11 != -1) {
                long j16 = this.f34752n * 1000000;
                g2 g2Var5 = this.i;
                String str4 = z.f28608a;
                this.f34745f.f(j16 / ((long) g2Var5.f5608e), 1, i31, 0, null);
                this.f34751m = 0;
                this.f34752n = j11;
            }
            int length2 = pVar7.f28589a.length - pVar7.f28591c;
            if (pVar7.a() < 16 && length2 < 16) {
                int iA = pVar7.a();
                byte[] bArr6 = pVar7.f28589a;
                System.arraycopy(bArr6, pVar7.f28590b, bArr6, 0, iA);
                pVar7.M(0);
                pVar7.L(iA);
            }
        }
        return 0;
    }

    @Override // q4.k
    public final void b(m mVar) {
        this.f34744e = mVar;
        this.f34745f = mVar.P(0, 1);
        mVar.G();
    }

    @Override // q4.k
    public final boolean d(l lVar) {
        b0 b0VarZ = new i(7).z(lVar, e5.i.f16250g, 0);
        if (b0VarZ != null) {
            int length = b0VarZ.f26216a.length;
        }
        p pVar = new p(4);
        ((h) lVar).y(pVar.f28589a, 0, 4, false);
        return pVar.B() == 1716281667;
    }

    @Override // q4.k
    public final void seek(long j10, long j11) {
        if (j10 == 0) {
            this.f34746g = 0;
        } else {
            b bVar = this.f34750l;
            if (bVar != null) {
                bVar.c(j11);
            }
        }
        this.f34752n = j11 != 0 ? -1L : 0L;
        this.f34751m = 0;
        this.f34741b.J(0);
    }

    @Override // q4.k
    public final void release() {
    }
}
