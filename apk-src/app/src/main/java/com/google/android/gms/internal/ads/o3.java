package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o3 implements z1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b2 f8587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public w2 f8588e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f9 f8590g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public g2 f8591h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f8592j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public n3 f8593k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f8594l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f8595m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f8584a = new byte[42];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tk0 f8585b = new tk0(0, new byte[32768]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e2 f8586c = new e2();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f8589f = 0;

    static {
        int i = nz.G;
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final boolean a(a2 a2Var) {
        f9 f9VarA = new l2(0).a(a2Var, c6.f4055p, 0);
        if (f9VarA != null) {
            int length = f9VarA.f5274a.length;
        }
        tk0 tk0Var = new tk0(4);
        ((v1) a2Var).R(tk0Var.f10641a, 0, 4, false);
        return tk0Var.P() == 1716281667;
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final void b(b2 b2Var) {
        this.f8587d = b2Var;
        this.f8588e = b2Var.O(0, 1);
        b2Var.u();
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final void d(long j10, long j11) {
        if (j10 == 0) {
            this.f8589f = 0;
        } else {
            n3 n3Var = this.f8593k;
            if (n3Var != null) {
                n3Var.d(j11);
            }
        }
        this.f8595m = j11 != 0 ? -1L : 0L;
        this.f8594l = 0;
        this.f8585b.y(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [boolean, int] */
    @Override // com.google.android.gms.internal.ads.z1
    public final int e(a2 a2Var, e2 e2Var) throws eb, EOFException, InterruptedIOException {
        g2 g2Var;
        int i;
        o2 f2Var;
        ox0 ox0Var;
        long j10;
        long j11;
        long j12;
        boolean zI;
        long jO;
        long j13;
        int i10 = this.f8589f;
        f9 f9Var = null;
        if (i10 == 0) {
            ((v1) a2Var).f11181g = 0;
            v1 v1Var = (v1) a2Var;
            long jP = v1Var.p();
            f9 f9VarA = new l2(0).a(a2Var, null, 0);
            if (f9VarA != null && f9VarA.f5274a.length != 0) {
                f9Var = f9VarA;
            }
            v1Var.a((int) (v1Var.p() - jP), false);
            this.f8590g = f9Var;
            this.f8589f = 1;
            return 0;
        }
        byte[] bArr = this.f8584a;
        if (i10 == 1) {
            ((v1) a2Var).R(bArr, 0, 42, false);
            ((v1) a2Var).f11181g = 0;
            this.f8589f = 2;
            return 0;
        }
        int i11 = 3;
        int i12 = 4;
        if (i10 == 2) {
            tk0 tk0Var = new tk0(4);
            ((v1) a2Var).J(tk0Var.f10641a, 0, 4, false);
            if (tk0Var.P() != 1716281667) {
                throw eb.a(null, "Failed to read FLAC stream marker.");
            }
            this.f8589f = 3;
            return 0;
        }
        if (i10 != 3) {
            long j14 = 0;
            if (i10 == 4) {
                ((v1) a2Var).f11181g = 0;
                tk0 tk0Var2 = new tk0(2);
                v1 v1Var2 = (v1) a2Var;
                v1Var2.R(tk0Var2.f10641a, 0, 2, false);
                int iL = tk0Var2.L();
                if ((iL >> 2) != 16382) {
                    v1Var2.f11181g = 0;
                    throw eb.a(null, "First frame does not start with sync code.");
                }
                v1Var2.f11181g = 0;
                this.f8592j = iL;
                b2 b2Var = this.f8587d;
                String str = cq0.f4293a;
                long j15 = v1Var2.f11179e;
                long j16 = v1Var2.f11178d;
                g2 g2Var2 = this.f8591h;
                g2Var2.getClass();
                ut utVar = (ut) g2Var2.f5613k;
                if (utVar != null && ((long[]) utVar.f11061c).length > 0) {
                    f2Var = new f2(g2Var2, j15, 0);
                    i = 0;
                } else if (j16 == -1 || g2Var2.f5612j <= 0) {
                    i = 0;
                    f2Var = new f2(g2Var2.e(), 0L);
                } else {
                    int i13 = this.f8592j;
                    int i14 = g2Var2.f5606c;
                    ox0 ox0Var2 = new ox0(2, g2Var2);
                    m3 m3Var = new m3(g2Var2, i13);
                    long jE = g2Var2.e();
                    long j17 = g2Var2.f5612j;
                    int i15 = g2Var2.f5607d;
                    if (i15 > 0) {
                        ox0Var = ox0Var2;
                        i = 0;
                        j11 = ((((long) i15) + ((long) i14)) / 2) + 1;
                        j10 = j15;
                    } else {
                        i = 0;
                        ox0Var = ox0Var2;
                        int i16 = g2Var2.f5604a;
                        long j18 = 4096;
                        if (i16 == g2Var2.f5605b && i16 > 0) {
                            j18 = i16;
                        }
                        j10 = j15;
                        j11 = (((j18 * ((long) g2Var2.f5610g)) * ((long) g2Var2.f5611h)) / 8) + 64;
                    }
                    n3 n3Var = new n3(ox0Var, m3Var, jE, j17, j10, j16, j11, Math.max(6, i14));
                    this.f8593k = n3Var;
                    f2Var = (o1) n3Var.f10460b;
                }
                b2Var.U(f2Var);
                this.f8589f = 5;
                return i;
            }
            this.f8588e.getClass();
            g2 g2Var3 = this.f8591h;
            g2Var3.getClass();
            n3 n3Var2 = this.f8593k;
            if (n3Var2 != null && ((p1) n3Var2.f10462d) != null) {
                return n3Var2.e(a2Var, e2Var);
            }
            if (this.f8595m == -1) {
                ((v1) a2Var).f11181g = 0;
                v1 v1Var3 = (v1) a2Var;
                v1Var3.b(1, false);
                byte[] bArr2 = new byte[1];
                v1Var3.R(bArr2, 0, 1, false);
                int i17 = bArr2[0] & 1;
                boolean z5 = 1 == i17;
                v1Var3.b(2, false);
                i = 1 != i17 ? 6 : 7;
                tk0 tk0Var3 = new tk0(i);
                byte[] bArr3 = tk0Var3.f10641a;
                int i18 = 0;
                while (i18 < i) {
                    int iK = v1Var3.K(bArr3, i18, i - i18);
                    if (iK == -1) {
                        break;
                    }
                    i18 += iK;
                }
                tk0Var3.C(i18);
                v1Var3.f11181g = 0;
                try {
                    jO = tk0Var3.o();
                    if (!z5) {
                        jO *= (long) g2Var3.f5605b;
                    }
                    j13 = g2Var3.f5612j;
                } catch (NumberFormatException unused) {
                }
                if (j13 == 0 || jO <= j13) {
                    j14 = jO;
                } else {
                    z = false;
                }
                if (!z) {
                    throw eb.a(null, null);
                }
                this.f8595m = j14;
            } else {
                tk0 tk0Var4 = this.f8585b;
                int i19 = tk0Var4.f10643c;
                if (i19 < 32768) {
                    int iC = ((v1) a2Var).C(tk0Var4.f10641a, i19, 32768 - i19);
                    z = iC == -1;
                    if (!z) {
                        tk0Var4.C(i19 + iC);
                    } else if (tk0Var4.B() == 0) {
                        long j19 = this.f8595m * 1000000;
                        g2 g2Var4 = this.f8591h;
                        String str2 = cq0.f4293a;
                        this.f8588e.c(j19 / ((long) g2Var4.f5608e), 1, this.f8594l, 0, null);
                        return -1;
                    }
                } else {
                    z = false;
                }
                int i20 = tk0Var4.f10642b;
                int i21 = this.f8594l;
                int i22 = this.i;
                if (i21 < i22) {
                    tk0Var4.G(Math.min(i22 - i21, tk0Var4.B()));
                }
                this.f8591h.getClass();
                int i23 = tk0Var4.f10642b;
                while (true) {
                    int i24 = tk0Var4.f10643c - 16;
                    e2 e2Var2 = this.f8586c;
                    if (i23 <= i24) {
                        tk0Var4.E(i23);
                        if (nz.i(tk0Var4, this.f8591h, this.f8592j, e2Var2)) {
                            tk0Var4.E(i23);
                            j12 = e2Var2.f4793b;
                            break;
                        }
                        i23++;
                    } else {
                        if (z) {
                            while (true) {
                                int i25 = tk0Var4.f10643c;
                                if (i23 > i25 - this.i) {
                                    tk0Var4.E(i25);
                                    break;
                                }
                                tk0Var4.E(i23);
                                try {
                                    zI = nz.i(tk0Var4, this.f8591h, this.f8592j, e2Var2);
                                } catch (IndexOutOfBoundsException unused2) {
                                    zI = false;
                                }
                                if (tk0Var4.f10642b <= tk0Var4.f10643c && zI) {
                                    tk0Var4.E(i23);
                                    j12 = e2Var2.f4793b;
                                    break;
                                }
                                i23++;
                            }
                        } else {
                            tk0Var4.E(i23);
                        }
                        j12 = -1;
                    }
                }
                int i26 = tk0Var4.f10642b - i20;
                tk0Var4.E(i20);
                this.f8588e.a(i26, tk0Var4);
                int i27 = this.f8594l + i26;
                this.f8594l = i27;
                if (j12 != -1) {
                    long j20 = this.f8595m * 1000000;
                    g2 g2Var5 = this.f8591h;
                    String str3 = cq0.f4293a;
                    this.f8588e.c(j20 / ((long) g2Var5.f5608e), 1, i27, 0, null);
                    this.f8594l = 0;
                    this.f8595m = j12;
                }
                int length = tk0Var4.f10641a.length - tk0Var4.f10643c;
                if (tk0Var4.B() < 16 && length < 16) {
                    int iB = tk0Var4.B();
                    byte[] bArr4 = tk0Var4.f10641a;
                    System.arraycopy(bArr4, tk0Var4.f10642b, bArr4, 0, iB);
                    tk0Var4.E(0);
                    tk0Var4.C(iB);
                }
            }
            return 0;
        }
        ?? r22 = 0;
        g2 g2Var6 = this.f8591h;
        while (true) {
            ((v1) a2Var).f11181g = r22;
            byte[] bArr5 = new byte[i12];
            ik0 ik0Var = new ik0(i12, bArr5);
            v1 v1Var4 = (v1) a2Var;
            v1Var4.R(bArr5, r22, i12, r22);
            boolean zG = ik0Var.g();
            int iH = ik0Var.h(i);
            int iH2 = ik0Var.h(24) + i12;
            if (iH == 0) {
                byte[] bArr6 = new byte[38];
                v1Var4.J(bArr6, r22, 38, r22);
                g2Var6 = new g2(bArr6, i12, r22);
            } else {
                if (g2Var6 == null) {
                    throw new IllegalArgumentException();
                }
                f9 f9Var2 = (f9) g2Var6.f5614l;
                if (iH == i11) {
                    tk0 tk0Var5 = new tk0(iH2);
                    v1Var4.J(tk0Var5.f10641a, r22, iH2, r22);
                    g2Var = new g2(g2Var6.f5604a, g2Var6.f5605b, g2Var6.f5606c, g2Var6.f5607d, g2Var6.f5608e, g2Var6.f5610g, g2Var6.f5611h, g2Var6.f5612j, c80.n(tk0Var5), (f9) g2Var6.f5614l);
                } else if (iH == i12) {
                    tk0 tk0Var6 = new tk0(iH2);
                    v1Var4.J(tk0Var6.f10641a, 0, iH2, false);
                    tk0Var6.G(i12);
                    f9 f9VarQ = rs.q(Arrays.asList((String[]) rs.l(tk0Var6, false, false).f7326c));
                    if (f9Var2 != null) {
                        f9VarQ = f9Var2.b(f9VarQ);
                    }
                    g2Var = new g2(g2Var6.f5604a, g2Var6.f5605b, g2Var6.f5606c, g2Var6.f5607d, g2Var6.f5608e, g2Var6.f5610g, g2Var6.f5611h, g2Var6.f5612j, (ut) g2Var6.f5613k, f9VarQ);
                } else if (iH == 6) {
                    tk0 tk0Var7 = new tk0(iH2);
                    v1Var4.J(tk0Var7.f10641a, 0, iH2, false);
                    tk0Var7.G(4);
                    f9 f9Var3 = new f9(x41.q(c4.b(tk0Var7)));
                    if (f9Var2 != null) {
                        f9Var3 = f9Var2.b(f9Var3);
                    }
                    g2Var = new g2(g2Var6.f5604a, g2Var6.f5605b, g2Var6.f5606c, g2Var6.f5607d, g2Var6.f5608e, g2Var6.f5610g, g2Var6.f5611h, g2Var6.f5612j, (ut) g2Var6.f5613k, f9Var3);
                } else {
                    v1Var4.a(iH2, false);
                }
                g2Var6 = g2Var;
            }
            String str4 = cq0.f4293a;
            this.f8591h = g2Var6;
            if (zG) {
                this.i = Math.max(g2Var6.f5606c, 6);
                jx1 jx1VarF = this.f8591h.f(bArr, this.f8590g);
                w2 w2Var = this.f8588e;
                ow1 ow1Var = new ow1(jx1VarF);
                ow1Var.d("audio/flac");
                w2Var.e(new jx1(ow1Var));
                w2 w2Var2 = this.f8588e;
                this.f8591h.e();
                w2Var2.getClass();
                this.f8589f = 4;
                return 0;
            }
            r22 = 0;
            i11 = 3;
            i12 = 4;
            i = 7;
        }
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final void c() {
    }
}
