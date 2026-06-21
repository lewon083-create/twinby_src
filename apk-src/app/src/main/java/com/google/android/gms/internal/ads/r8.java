package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.KotlinVersion;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class r8 implements t8, x5.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f9744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f9747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f9748e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9749f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f9750g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f9751h;
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f9752j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f9753k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f9754l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f9755m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f9756n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f9757o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object f9758p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object f9759q;

    public r8(String str, int i, int i10, int i11) {
        switch (i11) {
            case 1:
                this.f9757o = new m3.p(new byte[i10]);
                this.f9749f = 0;
                this.f9756n = -9223372036854775807L;
                this.f9744a = new AtomicInteger();
                this.f9754l = -1;
                this.f9755m = -1;
                this.f9745b = str;
                this.f9746c = i;
                this.f9747d = "video/mp2t";
                break;
            default:
                this.f9757o = new tk0(new byte[i10]);
                this.f9749f = 0;
                this.f9756n = -9223372036854775807L;
                this.f9744a = new AtomicInteger();
                this.f9754l = -1;
                this.f9755m = -1;
                this.f9745b = str;
                this.f9746c = i;
                this.f9747d = "video/mp2t";
                break;
        }
    }

    @Override // x5.f
    public void a() {
        this.f9749f = 0;
        this.f9750g = 0;
        this.f9751h = 0;
        this.f9756n = -9223372036854775807L;
        this.f9744a.set(0);
    }

    @Override // x5.f
    public void c(m3.p pVar) throws j3.d0 {
        int i;
        byte b2;
        int i10;
        byte b10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        long jU;
        int i17;
        long jU2;
        int i18;
        int i19;
        int i20;
        int i21;
        m3.p pVar2 = (m3.p) this.f9757o;
        ((q4.a0) this.f9758p).getClass();
        while (pVar.a() > 0) {
            switch (this.f9749f) {
                case 0:
                    while (true) {
                        if (pVar.a() > 0) {
                            int i22 = this.f9751h << 8;
                            this.f9751h = i22;
                            int iZ = i22 | pVar.z();
                            this.f9751h = iZ;
                            int iL = q4.b.l(iZ);
                            this.f9753k = iL;
                            if (iL != 0) {
                                byte[] bArr = pVar2.f28589a;
                                int i23 = this.f9751h;
                                bArr[0] = (byte) ((i23 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
                                bArr[1] = (byte) ((i23 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                                bArr[2] = (byte) ((i23 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                                bArr[3] = (byte) (i23 & KotlinVersion.MAX_COMPONENT_VALUE);
                                this.f9750g = 4;
                                this.f9751h = 0;
                                if (iL == 3 || iL == 4) {
                                    this.f9749f = 4;
                                } else if (iL == 1) {
                                    this.f9749f = 1;
                                } else {
                                    this.f9749f = 2;
                                }
                                break;
                            }
                        }
                    }
                    break;
                case 1:
                    if (k(pVar, pVar2.f28589a, 18)) {
                        byte[] bArr2 = pVar2.f28589a;
                        if (((j3.o) this.f9759q) == null) {
                            String str = this.f9748e;
                            y2 y2VarN = q4.b.n(bArr2);
                            y2VarN.t(60);
                            int i24 = q4.b.f31704j[y2VarN.i(6)];
                            int i25 = q4.b.f31705k[y2VarN.i(4)];
                            int i26 = y2VarN.i(5);
                            int i27 = i26 >= 29 ? -1 : (q4.b.f31706l[i26] * 1000) / 2;
                            y2VarN.t(10);
                            int i28 = i24 + (y2VarN.i(2) > 0 ? 1 : 0);
                            j3.n nVar = new j3.n();
                            nVar.f26281a = str;
                            nVar.f26291l = j3.c0.n(this.f9747d);
                            nVar.f26292m = j3.c0.n("audio/vnd.dts");
                            nVar.f26288h = i27;
                            nVar.E = i28;
                            nVar.F = i25;
                            nVar.f26296q = null;
                            nVar.f26284d = this.f9745b;
                            nVar.f26286f = this.f9746c;
                            j3.o oVar = new j3.o(nVar);
                            this.f9759q = oVar;
                            ((q4.a0) this.f9758p).a(oVar);
                        }
                        this.f9752j = q4.b.j(bArr2);
                        byte b11 = bArr2[0];
                        if (b11 != -2) {
                            if (b11 == -1) {
                                i = (bArr2[4] & 7) << 4;
                                b10 = bArr2[7];
                            } else if (b11 != 31) {
                                i = (bArr2[4] & 1) << 6;
                                b2 = bArr2[5];
                            } else {
                                i = (bArr2[5] & 7) << 4;
                                b10 = bArr2[6];
                            }
                            i10 = b10 & 60;
                            this.i = k3.f.d(m3.z.S(((j3.o) this.f9759q).G, (((i10 >> 2) | i) + 1) * 32));
                            pVar2.M(0);
                            ((q4.a0) this.f9758p).d(18, pVar2);
                            this.f9749f = 6;
                        } else {
                            i = (bArr2[5] & 1) << 6;
                            b2 = bArr2[4];
                        }
                        i10 = b2 & 252;
                        this.i = k3.f.d(m3.z.S(((j3.o) this.f9759q).G, (((i10 >> 2) | i) + 1) * 32));
                        pVar2.M(0);
                        ((q4.a0) this.f9758p).d(18, pVar2);
                        this.f9749f = 6;
                        break;
                    }
                    break;
                case 2:
                    if (k(pVar, pVar2.f28589a, 7)) {
                        y2 y2VarN2 = q4.b.n(pVar2.f28589a);
                        y2VarN2.t(42);
                        this.f9754l = y2VarN2.i(y2VarN2.h() ? 12 : 8) + 1;
                        this.f9749f = 3;
                    }
                    break;
                case 3:
                    int i29 = 8;
                    if (k(pVar, pVar2.f28589a, this.f9754l)) {
                        y2 y2VarN3 = q4.b.n(pVar2.f28589a);
                        y2VarN3.t(40);
                        int i30 = y2VarN3.i(2);
                        if (y2VarN3.h()) {
                            i11 = 20;
                            i12 = 12;
                        } else {
                            i11 = 16;
                            i12 = 8;
                        }
                        y2VarN3.t(i12);
                        int i31 = y2VarN3.i(i11) + 1;
                        boolean zH = y2VarN3.h();
                        if (zH) {
                            i13 = y2VarN3.i(2);
                            i14 = (y2VarN3.i(3) + 1) * 512;
                            if (y2VarN3.h()) {
                                y2VarN3.t(36);
                            }
                            int i32 = y2VarN3.i(3) + 1;
                            int i33 = y2VarN3.i(3) + 1;
                            if (i32 != 1 || i33 != 1) {
                                throw j3.d0.c("Multiple audio presentations or assets not supported");
                            }
                            int i34 = i30 + 1;
                            int i35 = y2VarN3.i(i34);
                            int i36 = 0;
                            while (i36 < i34) {
                                if (((i35 >> i36) & 1) == 1) {
                                    y2VarN3.t(i29);
                                }
                                i36++;
                                i29 = 8;
                            }
                            if (y2VarN3.h()) {
                                y2VarN3.t(2);
                                int i37 = (y2VarN3.i(2) + 1) << 2;
                                int i38 = y2VarN3.i(2) + 1;
                                for (int i39 = 0; i39 < i38; i39++) {
                                    y2VarN3.t(i37);
                                }
                            }
                        } else {
                            i13 = -1;
                            i14 = 0;
                        }
                        y2VarN3.t(i11);
                        y2VarN3.t(12);
                        if (zH) {
                            if (y2VarN3.h()) {
                                y2VarN3.t(4);
                            }
                            if (y2VarN3.h()) {
                                y2VarN3.t(24);
                            }
                            if (y2VarN3.h()) {
                                y2VarN3.u(y2VarN3.i(10) + 1);
                            }
                            y2VarN3.t(5);
                            int i40 = q4.b.f31707m[y2VarN3.i(4)];
                            i15 = y2VarN3.i(8) + 1;
                            i16 = i40;
                        } else {
                            i15 = -1;
                            i16 = -2147483647;
                        }
                        if (zH) {
                            if (i13 == 0) {
                                i17 = 32000;
                            } else if (i13 == 1) {
                                i17 = 44100;
                            } else {
                                if (i13 != 2) {
                                    throw j3.d0.a(null, "Unsupported reference clock code in DTS HD header: " + i13);
                                }
                                i17 = 48000;
                            }
                            String str2 = m3.z.f28608a;
                            jU = m3.z.U(i14, 1000000L, i17, RoundingMode.DOWN);
                        } else {
                            jU = -9223372036854775807L;
                        }
                        l(new q4.a("audio/vnd.dts.hd;profile=lbr", i15, i16, i31, jU));
                        this.f9752j = i31;
                        this.i = jU == -9223372036854775807L ? 0L : jU;
                        pVar2.M(0);
                        ((q4.a0) this.f9758p).d(this.f9754l, pVar2);
                        this.f9749f = 6;
                    } else {
                        continue;
                    }
                    break;
                case 4:
                    if (k(pVar, pVar2.f28589a, 6)) {
                        y2 y2VarN4 = q4.b.n(pVar2.f28589a);
                        y2VarN4.t(32);
                        int iV = q4.b.v(y2VarN4, q4.b.f31712r) + 1;
                        this.f9755m = iV;
                        int i41 = this.f9750g;
                        if (i41 > iV) {
                            int i42 = i41 - iV;
                            this.f9750g = i41 - i42;
                            pVar.M(pVar.f28590b - i42);
                        }
                        this.f9749f = 5;
                    }
                    break;
                case 5:
                    if (k(pVar, pVar2.f28589a, this.f9755m)) {
                        byte[] bArr3 = pVar2.f28589a;
                        y2 y2VarN5 = q4.b.n(bArr3);
                        int i43 = y2VarN5.i(32) == 1078008818 ? 1 : 0;
                        int iV2 = q4.b.v(y2VarN5, q4.b.f31708n);
                        int i44 = iV2 + 1;
                        if (i43 == 0) {
                            jU2 = -9223372036854775807L;
                            i18 = -2147483647;
                        } else {
                            if (!y2VarN5.h()) {
                                throw j3.d0.c("Only supports full channel mask-based audio presentation");
                            }
                            int i45 = iV2 - 1;
                            int i46 = ((bArr3[i45] << 8) & 65535) | (bArr3[iV2] & 255);
                            String str3 = m3.z.f28608a;
                            int i47 = 65535;
                            for (int i48 = 0; i48 < i45; i48++) {
                                byte b12 = bArr3[i48];
                                int i49 = (((i47 >> 12) & KotlinVersion.MAX_COMPONENT_VALUE) ^ ((b12 & 255) >> 4)) & KotlinVersion.MAX_COMPONENT_VALUE;
                                int i50 = (i47 << 4) & 65535;
                                int[] iArr = m3.z.f28618l;
                                int i51 = (iArr[i49] ^ i50) & 65535;
                                i47 = (iArr[((b12 & 15) ^ ((i51 >> 12) & KotlinVersion.MAX_COMPONENT_VALUE)) & KotlinVersion.MAX_COMPONENT_VALUE] ^ ((i51 << 4) & 65535)) & 65535;
                            }
                            if (i46 != i47) {
                                throw j3.d0.a(null, "CRC check failed");
                            }
                            int i52 = y2VarN5.i(2);
                            if (i52 != 0) {
                                if (i52 == 1) {
                                    i20 = 480;
                                } else {
                                    if (i52 != 2) {
                                        throw j3.d0.a(null, "Unsupported base duration index in DTS UHD header: " + i52);
                                    }
                                    i20 = 384;
                                }
                                i19 = 3;
                            } else {
                                i19 = 3;
                                i20 = 512;
                            }
                            int i53 = (y2VarN5.i(i19) + 1) * i20;
                            int i54 = y2VarN5.i(2);
                            if (i54 == 0) {
                                i21 = 32000;
                            } else if (i54 == 1) {
                                i21 = 44100;
                            } else {
                                if (i54 != 2) {
                                    throw j3.d0.a(null, "Unsupported clock rate index in DTS UHD header: " + i54);
                                }
                                i21 = 48000;
                            }
                            if (y2VarN5.h()) {
                                y2VarN5.t(36);
                            }
                            int i55 = i21 * (1 << y2VarN5.i(2));
                            jU2 = m3.z.U(i53, 1000000L, i21, RoundingMode.DOWN);
                            i18 = i55;
                        }
                        int iV3 = 0;
                        for (int i56 = 0; i56 < i43; i56++) {
                            iV3 += q4.b.v(y2VarN5, q4.b.f31709o);
                        }
                        AtomicInteger atomicInteger = this.f9744a;
                        if (i43 != 0) {
                            atomicInteger.set(q4.b.v(y2VarN5, q4.b.f31710p));
                        }
                        int iV4 = iV3 + (atomicInteger.get() != 0 ? q4.b.v(y2VarN5, q4.b.f31711q) : 0) + i44;
                        q4.a aVar = new q4.a("audio/vnd.dts.uhd;profile=p2", 2, i18, iV4, jU2);
                        if (this.f9753k == 3) {
                            l(aVar);
                        }
                        this.f9752j = iV4;
                        this.i = jU2 == -9223372036854775807L ? 0L : jU2;
                        pVar2.M(0);
                        ((q4.a0) this.f9758p).d(this.f9755m, pVar2);
                        this.f9749f = 6;
                    } else {
                        continue;
                    }
                    break;
                case 6:
                    int iMin = Math.min(pVar.a(), this.f9752j - this.f9750g);
                    ((q4.a0) this.f9758p).d(iMin, pVar);
                    int i57 = this.f9750g + iMin;
                    this.f9750g = i57;
                    if (i57 == this.f9752j) {
                        com.google.android.gms.internal.measurement.h5.r(this.f9756n != -9223372036854775807L);
                        ((q4.a0) this.f9758p).f(this.f9756n, this.f9753k == 4 ? 0 : 1, this.f9752j, 0, null);
                        this.f9756n += this.i;
                        this.f9749f = 0;
                    }
                    break;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.t8
    public void d(int i, long j10) {
        this.f9756n = j10;
    }

    @Override // x5.f
    public void e(q4.m mVar, r9 r9Var) {
        r9Var.a();
        r9Var.b();
        this.f9748e = (String) r9Var.f9764e;
        r9Var.b();
        this.f9758p = mVar.P(r9Var.f9763d, 1);
    }

    @Override // com.google.android.gms.internal.ads.t8
    public void g(tk0 tk0Var) throws eb {
        long jU;
        int i;
        int i10;
        int i11;
        int i12;
        int iH;
        int iH2;
        long jU2;
        int i13;
        int i14;
        byte b2;
        int i15;
        byte b10;
        tk0 tk0Var2 = (tk0) this.f9757o;
        ((w2) this.f9758p).getClass();
        while (tk0Var.B() > 0) {
            int i16 = this.f9749f;
            if (i16 == 0) {
                while (true) {
                    if (tk0Var.B() > 0) {
                        int i17 = this.f9751h << 8;
                        this.f9751h = i17;
                        int iK = i17 | tk0Var.K();
                        this.f9751h = iK;
                        int iA = pn1.a(iK);
                        this.f9753k = iA;
                        if (iA != 0) {
                            byte[] bArr = tk0Var2.f10641a;
                            int i18 = this.f9751h;
                            bArr[0] = (byte) ((i18 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
                            bArr[1] = (byte) ((i18 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                            bArr[2] = (byte) ((i18 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                            bArr[3] = (byte) (i18 & KotlinVersion.MAX_COMPONENT_VALUE);
                            this.f9750g = 4;
                            this.f9751h = 0;
                            if (iA == 3 || iA == 4) {
                                this.f9749f = 4;
                            } else if (iA == 1) {
                                this.f9749f = 1;
                            } else {
                                this.f9749f = 2;
                            }
                        }
                    }
                }
            } else if (i16 != 1) {
                if (i16 != 2) {
                    int iH3 = -2147483647;
                    if (i16 != 3) {
                        if (i16 != 4) {
                            if (i16 != 5) {
                                int iMin = Math.min(tk0Var.B(), this.f9752j - this.f9750g);
                                ((w2) this.f9758p).a(iMin, tk0Var);
                                int i19 = this.f9750g + iMin;
                                this.f9750g = i19;
                                if (i19 == this.f9752j) {
                                    ix.k0(this.f9756n != -9223372036854775807L);
                                    ((w2) this.f9758p).c(this.f9756n, this.f9753k == 4 ? 0 : 1, this.f9752j, 0, null);
                                    this.f9756n += this.i;
                                    this.f9749f = 0;
                                }
                            } else if (m(tk0Var, tk0Var2.f10641a, this.f9755m)) {
                                byte[] bArr2 = tk0Var2.f10641a;
                                ik0 ik0VarM = pn1.M(bArr2);
                                int iH4 = ik0VarM.h(32);
                                int I = pn1.I(ik0VarM, pn1.f9114g);
                                int i20 = I + 1;
                                char c8 = iH4 == 1078008818 ? (char) 1 : (char) 0;
                                if (c8 == 0) {
                                    jU = -9223372036854775807L;
                                } else {
                                    if (!ik0VarM.g()) {
                                        throw eb.b("Only supports full channel mask-based audio presentation");
                                    }
                                    int i21 = I - 1;
                                    int i22 = bArr2[i21] << 8;
                                    int i23 = bArr2[I] & 255;
                                    String str = cq0.f4293a;
                                    char c9 = 65535;
                                    for (int i24 = 0; i24 < i21; i24++) {
                                        byte b11 = bArr2[i24];
                                        int[] iArr = cq0.f4300h;
                                        char c10 = (char) (iArr[((c9 >> '\f') ^ ((b11 & 255) >> 4)) & KotlinVersion.MAX_COMPONENT_VALUE] ^ ((char) (c9 << 4)));
                                        c9 = (char) (((char) (c10 << 4)) ^ iArr[((b11 & 15) ^ (c10 >> '\f')) & KotlinVersion.MAX_COMPONENT_VALUE]);
                                    }
                                    if ((((char) i22) | i23) != c9) {
                                        throw eb.a(null, "CRC check failed");
                                    }
                                    int iH5 = ik0VarM.h(2);
                                    if (iH5 != 0) {
                                        if (iH5 == 1) {
                                            i10 = 480;
                                        } else {
                                            if (iH5 != 2) {
                                                StringBuilder sb2 = new StringBuilder(String.valueOf(iH5).length() + 51);
                                                sb2.append("Unsupported base duration index in DTS UHD header: ");
                                                sb2.append(iH5);
                                                throw eb.a(null, sb2.toString());
                                            }
                                            i10 = 384;
                                        }
                                        i = 3;
                                    } else {
                                        i = 3;
                                        i10 = 512;
                                    }
                                    int iH6 = ik0VarM.h(i) + 1;
                                    int iH7 = ik0VarM.h(2);
                                    if (iH7 == 0) {
                                        i11 = 32000;
                                    } else if (iH7 == 1) {
                                        i11 = 44100;
                                    } else {
                                        if (iH7 != 2) {
                                            StringBuilder sb3 = new StringBuilder(String.valueOf(iH7).length() + 48);
                                            sb3.append("Unsupported clock rate index in DTS UHD header: ");
                                            sb3.append(iH7);
                                            throw eb.a(null, sb3.toString());
                                        }
                                        i11 = 48000;
                                    }
                                    if (ik0VarM.g()) {
                                        ik0VarM.f(36);
                                    }
                                    iH3 = i11 * (1 << ik0VarM.h(2));
                                    jU = cq0.u(i10 * iH6, 1000000L, i11, RoundingMode.DOWN);
                                }
                                int i25 = iH3;
                                int I2 = 0;
                                for (char c11 = 0; c11 < c8; c11 = 1) {
                                    I2 += pn1.I(ik0VarM, pn1.f9115h);
                                }
                                for (int i26 = 0; i26 <= 0; i26++) {
                                    AtomicInteger atomicInteger = this.f9744a;
                                    if (c8 != 0) {
                                        atomicInteger.set(pn1.I(ik0VarM, pn1.i));
                                    }
                                    I2 += atomicInteger.get() != 0 ? pn1.I(ik0VarM, pn1.f9116j) : 0;
                                }
                                int i27 = i20 + I2;
                                long j10 = jU;
                                l1 l1Var = new l1("audio/vnd.dts.uhd;profile=p2", 2, i25, i27, j10);
                                if (this.f9753k == 3) {
                                    n(l1Var);
                                }
                                this.f9752j = i27;
                                if (j10 == -9223372036854775807L) {
                                    j10 = 0;
                                }
                                this.i = j10;
                                tk0Var2.E(0);
                                ((w2) this.f9758p).a(this.f9755m, tk0Var2);
                                this.f9749f = 6;
                            } else {
                                continue;
                            }
                        } else if (m(tk0Var, tk0Var2.f10641a, 6)) {
                            ik0 ik0VarM2 = pn1.M(tk0Var2.f10641a);
                            ik0VarM2.f(32);
                            int I3 = pn1.I(ik0VarM2, pn1.f9117k) + 1;
                            this.f9755m = I3;
                            int i28 = this.f9750g;
                            if (i28 > I3) {
                                int i29 = i28 - I3;
                                this.f9750g = i28 - i29;
                                tk0Var.E(tk0Var.f10642b - i29);
                            }
                            this.f9749f = 5;
                        }
                    } else if (m(tk0Var, tk0Var2.f10641a, this.f9754l)) {
                        ik0 ik0VarM3 = pn1.M(tk0Var2.f10641a);
                        ik0VarM3.f(40);
                        int iH8 = ik0VarM3.h(2);
                        boolean zG = ik0VarM3.g();
                        int i30 = true != zG ? 16 : 20;
                        ik0VarM3.f(true != zG ? 8 : 12);
                        int iH9 = ik0VarM3.h(i30) + 1;
                        boolean zG2 = ik0VarM3.g();
                        if (zG2) {
                            iH = ik0VarM3.h(2);
                            int iH10 = ik0VarM3.h(3) + 1;
                            if (ik0VarM3.g()) {
                                ik0VarM3.f(36);
                            }
                            int iH11 = ik0VarM3.h(3) + 1;
                            int iH12 = ik0VarM3.h(3) + 1;
                            if (iH11 != 1 || iH12 != 1) {
                                throw eb.b("Multiple audio presentations or assets not supported");
                            }
                            int i31 = iH8 + 1;
                            int iH13 = ik0VarM3.h(i31);
                            for (int i32 = 0; i32 < i31; i32++) {
                                if (((iH13 >> i32) & 1) == 1) {
                                    ik0VarM3.f(8);
                                }
                            }
                            i12 = iH10 * 512;
                            if (ik0VarM3.g()) {
                                ik0VarM3.f(2);
                                int iH14 = (ik0VarM3.h(2) + 1) << 2;
                                int iH15 = ik0VarM3.h(2) + 1;
                                for (int i33 = 0; i33 < iH15; i33++) {
                                    ik0VarM3.f(iH14);
                                }
                            }
                        } else {
                            i12 = 0;
                            iH = -1;
                        }
                        ik0VarM3.f(i30);
                        ik0VarM3.f(12);
                        if (zG2) {
                            if (ik0VarM3.g()) {
                                ik0VarM3.f(4);
                            }
                            if (ik0VarM3.g()) {
                                ik0VarM3.f(24);
                            }
                            if (ik0VarM3.g()) {
                                ik0VarM3.l(ik0VarM3.h(10) + 1);
                            }
                            ik0VarM3.f(5);
                            iH3 = pn1.f9113f[ik0VarM3.h(4)];
                            iH2 = ik0VarM3.h(8) + 1;
                        } else {
                            iH2 = -1;
                        }
                        int i34 = iH3;
                        if (zG2) {
                            if (iH == 0) {
                                i13 = 32000;
                            } else if (iH == 1) {
                                i13 = 44100;
                            } else {
                                if (iH != 2) {
                                    StringBuilder sb4 = new StringBuilder(String.valueOf(iH).length() + 51);
                                    sb4.append("Unsupported reference clock code in DTS HD header: ");
                                    sb4.append(iH);
                                    throw eb.a(null, sb4.toString());
                                }
                                i13 = 48000;
                            }
                            jU2 = cq0.u(i12, 1000000L, i13, RoundingMode.DOWN);
                        } else {
                            jU2 = -9223372036854775807L;
                        }
                        n(new l1("audio/vnd.dts.hd;profile=lbr", iH2, i34, iH9, jU2));
                        this.f9752j = iH9;
                        this.i = jU2 == -9223372036854775807L ? 0L : jU2;
                        tk0Var2.E(0);
                        ((w2) this.f9758p).a(this.f9754l, tk0Var2);
                        this.f9749f = 6;
                    } else {
                        continue;
                    }
                } else if (m(tk0Var, tk0Var2.f10641a, 7)) {
                    ik0 ik0VarM4 = pn1.M(tk0Var2.f10641a);
                    ik0VarM4.f(42);
                    this.f9754l = ik0VarM4.h(true == ik0VarM4.g() ? 12 : 8) + 1;
                    this.f9749f = 3;
                }
            } else if (m(tk0Var, tk0Var2.f10641a, 18)) {
                byte[] bArr3 = tk0Var2.f10641a;
                if (((jx1) this.f9759q) == null) {
                    String str2 = this.f9748e;
                    ik0 ik0VarM5 = pn1.M(bArr3);
                    ik0VarM5.f(60);
                    int i35 = pn1.f9110c[ik0VarM5.h(6)];
                    int i36 = pn1.f9111d[ik0VarM5.h(4)];
                    int iH16 = ik0VarM5.h(5);
                    int i37 = iH16 >= 29 ? -1 : (pn1.f9112e[iH16] * 1000) / 2;
                    ik0VarM5.f(10);
                    int i38 = i35 + (ik0VarM5.h(2) > 0 ? 1 : 0);
                    ow1 ow1Var = new ow1();
                    ow1Var.f8822a = str2;
                    ow1Var.d("video/mp2t");
                    ow1Var.e("audio/vnd.dts");
                    ow1Var.f8828g = i37;
                    ow1Var.D = i38;
                    ow1Var.E = i36;
                    ow1Var.f8836p = null;
                    ow1Var.f8825d = this.f9745b;
                    ow1Var.f8827f = this.f9746c;
                    jx1 jx1Var = new jx1(ow1Var);
                    this.f9759q = jx1Var;
                    ((w2) this.f9758p).e(jx1Var);
                }
                this.f9752j = pn1.r(bArr3);
                byte b12 = bArr3[0];
                if (b12 != -2) {
                    if (b12 == -1) {
                        i14 = (bArr3[4] & 7) << 4;
                        b10 = bArr3[7];
                    } else if (b12 != 31) {
                        i14 = (bArr3[4] & 1) << 6;
                        b2 = bArr3[5];
                    } else {
                        i14 = (bArr3[5] & 7) << 4;
                        b10 = bArr3[6];
                    }
                    i15 = b10 & 60;
                    this.i = gr.e(cq0.t(((jx1) this.f9759q).F, (((i15 >> 2) | i14) + 1) * 32));
                    tk0Var2.E(0);
                    ((w2) this.f9758p).a(18, tk0Var2);
                    this.f9749f = 6;
                } else {
                    i14 = (bArr3[5] & 1) << 6;
                    b2 = bArr3[4];
                }
                i15 = b2 & 252;
                this.i = gr.e(cq0.t(((jx1) this.f9759q).F, (((i15 >> 2) | i14) + 1) * 32));
                tk0Var2.E(0);
                ((w2) this.f9758p).a(18, tk0Var2);
                this.f9749f = 6;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.t8
    public void h() {
        this.f9749f = 0;
        this.f9750g = 0;
        this.f9751h = 0;
        this.f9756n = -9223372036854775807L;
        this.f9744a.set(0);
    }

    @Override // x5.f
    public void i(int i, long j10) {
        this.f9756n = j10;
    }

    @Override // com.google.android.gms.internal.ads.t8
    public void j(b2 b2Var, r9 r9Var) {
        r9Var.f();
        r9Var.g();
        this.f9748e = (String) r9Var.f9764e;
        r9Var.g();
        this.f9758p = b2Var.O(r9Var.f9763d, 1);
    }

    public boolean k(m3.p pVar, byte[] bArr, int i) {
        int iMin = Math.min(pVar.a(), i - this.f9750g);
        pVar.k(bArr, this.f9750g, iMin);
        int i10 = this.f9750g + iMin;
        this.f9750g = i10;
        return i10 == i;
    }

    public void l(q4.a aVar) {
        int i = aVar.f31694b;
        String str = aVar.f31693a;
        int i10 = aVar.f31695c;
        if (i == -2147483647 || i10 == -1) {
            return;
        }
        j3.o oVar = (j3.o) this.f9759q;
        if (oVar != null && i10 == oVar.F && i == oVar.G && str.equals(oVar.f26335n)) {
            return;
        }
        j3.o oVar2 = (j3.o) this.f9759q;
        j3.n nVar = oVar2 == null ? new j3.n() : oVar2.a();
        nVar.f26281a = this.f9748e;
        nVar.f26291l = j3.c0.n(this.f9747d);
        nVar.f26292m = j3.c0.n(str);
        nVar.E = i10;
        nVar.F = i;
        nVar.f26284d = this.f9745b;
        nVar.f26286f = this.f9746c;
        j3.o oVar3 = new j3.o(nVar);
        this.f9759q = oVar3;
        ((q4.a0) this.f9758p).a(oVar3);
    }

    public boolean m(tk0 tk0Var, byte[] bArr, int i) {
        int iMin = Math.min(tk0Var.B(), i - this.f9750g);
        tk0Var.H(bArr, this.f9750g, iMin);
        int i10 = this.f9750g + iMin;
        this.f9750g = i10;
        return i10 == i;
    }

    public void n(l1 l1Var) {
        int i;
        int i10 = l1Var.f7370b;
        String str = l1Var.f7369a;
        if (i10 == -2147483647 || (i = l1Var.f7371c) == -1) {
            return;
        }
        jx1 jx1Var = (jx1) this.f9759q;
        if (jx1Var != null && i == jx1Var.E && i10 == jx1Var.F && str.equals(jx1Var.f6975m)) {
            return;
        }
        jx1 jx1Var2 = (jx1) this.f9759q;
        ow1 ow1Var = jx1Var2 == null ? new ow1() : new ow1(jx1Var2);
        ow1Var.f8822a = this.f9748e;
        ow1Var.d(this.f9747d);
        ow1Var.e(str);
        ow1Var.D = i;
        ow1Var.E = i10;
        ow1Var.f8825d = this.f9745b;
        ow1Var.f8827f = this.f9746c;
        jx1 jx1Var3 = new jx1(ow1Var);
        this.f9759q = jx1Var3;
        ((w2) this.f9758p).e(jx1Var3);
    }

    @Override // com.google.android.gms.internal.ads.t8
    public void b(boolean z5) {
    }

    @Override // x5.f
    public void f(boolean z5) {
    }
}
