package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import kotlin.KotlinVersion;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class u6 extends t6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public g f10844n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f10845o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f10846p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public z2 f10847q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public kx0 f10848r;

    @Override // com.google.android.gms.internal.ads.t6
    public final void e(boolean z5) {
        super.e(z5);
        if (z5) {
            this.f10844n = null;
            this.f10847q = null;
            this.f10848r = null;
        }
        this.f10845o = 0;
        this.f10846p = false;
    }

    @Override // com.google.android.gms.internal.ads.t6
    public final long f(tk0 tk0Var) {
        byte b2 = tk0Var.f10641a[0];
        if ((b2 & 1) == 1) {
            return -1L;
        }
        g gVar = this.f10844n;
        gVar.getClass();
        z2 z2Var = (z2) gVar.f5553c;
        int i = !((y5[]) gVar.f5556f)[(b2 >> 1) & (KotlinVersion.MAX_COMPONENT_VALUE >>> (8 - gVar.f5552b))].f12499c ? z2Var.f12850e : z2Var.f12851f;
        int i10 = this.f10846p ? (this.f10845o + i) / 4 : 0;
        byte[] bArr = tk0Var.f10641a;
        int length = bArr.length;
        int i11 = tk0Var.f10643c;
        if (length < i11 + 4) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i11 + 4);
            tk0Var.z(bArrCopyOf.length, bArrCopyOf);
        } else {
            tk0Var.C(i11 + 4);
        }
        long j10 = i10;
        byte[] bArr2 = tk0Var.f10641a;
        int i12 = tk0Var.f10643c;
        bArr2[i12 - 4] = (byte) (j10 & 255);
        bArr2[i12 - 3] = (byte) ((j10 >>> 8) & 255);
        bArr2[i12 - 2] = (byte) ((j10 >>> 16) & 255);
        bArr2[i12 - 1] = (byte) ((j10 >>> 24) & 255);
        this.f10846p = true;
        this.f10845o = i;
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.t6
    public final boolean g(tk0 tk0Var, long j10, zd1 zd1Var) throws eb {
        g gVar;
        int i;
        int i10;
        if (this.f10844n != null) {
            ((jx1) zd1Var.f12971c).getClass();
            return false;
        }
        z2 z2Var = this.f10847q;
        int i11 = 1;
        if (z2Var == null) {
            rs.y(1, tk0Var, false);
            tk0Var.i();
            int iK = tk0Var.K();
            int i12 = tk0Var.i();
            int iC = tk0Var.c();
            int i13 = iC <= 0 ? -1 : iC;
            int iC2 = tk0Var.c();
            int i14 = iC2 <= 0 ? -1 : iC2;
            tk0Var.c();
            int iK2 = tk0Var.K();
            int iPow = (int) Math.pow(2.0d, iK2 & 15);
            int iPow2 = (int) Math.pow(2.0d, (iK2 & 240) >> 4);
            tk0Var.K();
            this.f10847q = new z2(iK, i12, i13, i14, iPow, iPow2, Arrays.copyOf(tk0Var.f10641a, tk0Var.f10643c));
        } else {
            int i15 = 4;
            kx0 kx0Var = this.f10848r;
            if (kx0Var == null) {
                this.f10848r = rs.l(tk0Var, true, true);
            } else {
                int i16 = tk0Var.f10643c;
                byte[] bArr = new byte[i16];
                System.arraycopy(tk0Var.f10641a, 0, bArr, 0, i16);
                int i17 = z2Var.f12846a;
                int i18 = 5;
                rs.y(5, tk0Var, false);
                int iK3 = tk0Var.K() + 1;
                y2 y2Var = new y2(tk0Var.f10641a, 0, (byte) 0);
                int i19 = 8;
                y2Var.z(tk0Var.f10642b * 8);
                int i20 = 0;
                while (true) {
                    int i21 = 2;
                    int i22 = 16;
                    if (i20 < iK3) {
                        int i23 = i19;
                        if (y2Var.x(24) != 5653314) {
                            int i24 = (y2Var.f12464d * 8) + y2Var.f12465e;
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i24).length() + 55);
                            sb2.append("expected code book to start with [0x56, 0x43, 0x42] at ");
                            sb2.append(i24);
                            throw eb.a(null, sb2.toString());
                        }
                        int iX = y2Var.x(16);
                        int iX2 = y2Var.x(24);
                        if (y2Var.w()) {
                            y2Var.z(i18);
                            int iX3 = 0;
                            while (iX3 < iX2) {
                                int i25 = iX2 - iX3;
                                int i26 = 0;
                                while (i25 > 0) {
                                    i25 >>>= 1;
                                    i26++;
                                }
                                iX3 += y2Var.x(i26);
                            }
                        } else {
                            boolean zW = y2Var.w();
                            for (int i27 = 0; i27 < iX2; i27++) {
                                if (!zW) {
                                    y2Var.z(i18);
                                } else if (y2Var.w()) {
                                    y2Var.z(i18);
                                }
                            }
                        }
                        int i28 = i15;
                        int iX4 = y2Var.x(i28);
                        if (iX4 > 2) {
                            StringBuilder sb3 = new StringBuilder(String.valueOf(iX4).length() + 42);
                            sb3.append("lookup type greater than 2 not decodable: ");
                            sb3.append(iX4);
                            throw eb.a(null, sb3.toString());
                        }
                        if (iX4 != 1) {
                            if (iX4 == 2) {
                            }
                            i20++;
                            i19 = i23;
                            i15 = 4;
                            i18 = 5;
                        } else {
                            i21 = iX4;
                        }
                        y2Var.z(32);
                        y2Var.z(32);
                        int iX5 = y2Var.x(i28) + 1;
                        y2Var.z(1);
                        y2Var.z((int) ((i21 == 1 ? iX != 0 ? (long) Math.floor(Math.pow(iX2, 1.0d / ((double) iX))) : 0L : ((long) iX2) * ((long) iX)) * ((long) iX5)));
                        i20++;
                        i19 = i23;
                        i15 = 4;
                        i18 = 5;
                    } else {
                        int i29 = i19;
                        int i30 = 6;
                        int iX6 = y2Var.x(6) + 1;
                        for (int i31 = 0; i31 < iX6; i31++) {
                            if (y2Var.x(16) != 0) {
                                throw eb.a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int iX7 = y2Var.x(6) + 1;
                        int i32 = 0;
                        while (true) {
                            int i33 = 3;
                            if (i32 < iX7) {
                                int iX8 = y2Var.x(i22);
                                if (iX8 == 0) {
                                    int i34 = i29;
                                    i = i11;
                                    y2Var.z(i34);
                                    y2Var.z(16);
                                    y2Var.z(16);
                                    y2Var.z(6);
                                    y2Var.z(i34);
                                    int iX9 = y2Var.x(4) + 1;
                                    int i35 = 0;
                                    while (i35 < iX9) {
                                        y2Var.z(i34);
                                        i35++;
                                        i34 = 8;
                                    }
                                } else {
                                    if (iX8 != i11) {
                                        StringBuilder sb4 = new StringBuilder(pe.a.a(iX8, 41));
                                        sb4.append("floor type greater than 1 not decodable: ");
                                        sb4.append(iX8);
                                        throw eb.a(null, sb4.toString());
                                    }
                                    i = i11;
                                    int iX10 = y2Var.x(5);
                                    int[] iArr = new int[iX10];
                                    int i36 = -1;
                                    for (int i37 = 0; i37 < iX10; i37++) {
                                        int iX11 = y2Var.x(4);
                                        iArr[i37] = iX11;
                                        if (iX11 > i36) {
                                            i36 = iX11;
                                        }
                                    }
                                    int i38 = i36 + 1;
                                    int[] iArr2 = new int[i38];
                                    int i39 = 0;
                                    while (i39 < i38) {
                                        iArr2[i39] = y2Var.x(i33) + 1;
                                        int iX12 = y2Var.x(2);
                                        if (iX12 > 0) {
                                            i10 = i29;
                                            y2Var.z(i10);
                                        } else {
                                            i10 = i29;
                                        }
                                        int i40 = i38;
                                        int i41 = 0;
                                        while (i41 < (i << iX12)) {
                                            y2Var.z(i10);
                                            i41++;
                                            i10 = 8;
                                        }
                                        i39++;
                                        i38 = i40;
                                        i29 = 8;
                                        i33 = 3;
                                    }
                                    y2Var.z(2);
                                    int iX13 = y2Var.x(4);
                                    int i42 = 0;
                                    int i43 = 0;
                                    for (int i44 = 0; i44 < iX10; i44++) {
                                        i42 += iArr2[iArr[i44]];
                                        while (i43 < i42) {
                                            y2Var.z(iX13);
                                            i43++;
                                        }
                                    }
                                }
                                i32++;
                                i11 = i;
                                i29 = 8;
                                i30 = 6;
                                i22 = 16;
                            } else {
                                int i45 = i11;
                                int iX14 = y2Var.x(i30) + 1;
                                int i46 = 0;
                                while (i46 < iX14) {
                                    if (y2Var.x(16) > 2) {
                                        throw eb.a(null, "residueType greater than 2 is not decodable");
                                    }
                                    y2Var.z(24);
                                    y2Var.z(24);
                                    y2Var.z(24);
                                    int iX15 = y2Var.x(i30) + 1;
                                    int i47 = 8;
                                    y2Var.z(8);
                                    int[] iArr3 = new int[iX15];
                                    for (int i48 = 0; i48 < iX15; i48++) {
                                        iArr3[i48] = ((y2Var.w() ? y2Var.x(5) : 0) * 8) + y2Var.x(3);
                                    }
                                    int i49 = 0;
                                    while (i49 < iX15) {
                                        int i50 = 0;
                                        while (i50 < i47) {
                                            if ((iArr3[i49] & (i45 << i50)) != 0) {
                                                y2Var.z(i47);
                                            }
                                            i50++;
                                            i47 = 8;
                                        }
                                        i49++;
                                        i47 = 8;
                                    }
                                    i46++;
                                    i30 = 6;
                                }
                                int iX16 = y2Var.x(i30) + 1;
                                int i51 = 0;
                                while (i51 < iX16) {
                                    int iX17 = y2Var.x(16);
                                    if (iX17 != 0) {
                                        StringBuilder sb5 = new StringBuilder(pe.a.a(iX17, 41));
                                        sb5.append("mapping type other than 0 not supported: ");
                                        sb5.append(iX17);
                                        rs.C("VorbisUtil", sb5.toString());
                                    } else {
                                        int iX18 = y2Var.w() ? y2Var.x(4) + 1 : i45;
                                        if (y2Var.w()) {
                                            int iX19 = y2Var.x(8) + 1;
                                            for (int i52 = 0; i52 < iX19; i52++) {
                                                int i53 = i17 - 1;
                                                int i54 = i53;
                                                int i55 = 0;
                                                while (i54 > 0) {
                                                    i54 >>>= 1;
                                                    i55++;
                                                }
                                                y2Var.z(i55);
                                                int i56 = 0;
                                                while (i53 > 0) {
                                                    i53 >>>= 1;
                                                    i56++;
                                                }
                                                y2Var.z(i56);
                                            }
                                        }
                                        if (y2Var.x(2) != 0) {
                                            throw eb.a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                        if (iX18 > i45) {
                                            for (int i57 = 0; i57 < i17; i57++) {
                                                y2Var.z(4);
                                            }
                                        }
                                        for (int i58 = 0; i58 < iX18; i58++) {
                                            y2Var.z(8);
                                            y2Var.z(8);
                                            y2Var.z(8);
                                        }
                                    }
                                    i51++;
                                    i45 = 1;
                                }
                                int iX20 = y2Var.x(6);
                                int i59 = iX20 + 1;
                                y5[] y5VarArr = new y5[i59];
                                for (int i60 = 0; i60 < i59; i60++) {
                                    boolean zW2 = y2Var.w();
                                    y2Var.x(16);
                                    y2Var.x(16);
                                    y2Var.x(8);
                                    y5VarArr[i60] = new y5(zW2, 1);
                                }
                                if (!y2Var.w()) {
                                    throw eb.a(null, "framing bit after modes not set as expected");
                                }
                                int i61 = 0;
                                while (iX20 > 0) {
                                    iX20 >>>= 1;
                                    i61++;
                                }
                                gVar = new g(z2Var, kx0Var, bArr, y5VarArr, i61);
                            }
                        }
                    }
                }
            }
        }
        gVar = null;
        this.f10844n = gVar;
        if (gVar == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        z2 z2Var2 = (z2) gVar.f5553c;
        arrayList.add((byte[]) z2Var2.f12852g);
        arrayList.add((byte[]) gVar.f5555e);
        f9 f9VarQ = rs.q(x41.w((String[]) ((kx0) gVar.f5554d).f7326c));
        ow1 ow1Var = new ow1();
        ow1Var.d("audio/ogg");
        ow1Var.e("audio/vorbis");
        ow1Var.f8828g = z2Var2.f12849d;
        ow1Var.f8829h = z2Var2.f12848c;
        ow1Var.D = z2Var2.f12846a;
        ow1Var.E = z2Var2.f12847b;
        ow1Var.f8835o = arrayList;
        ow1Var.f8830j = f9VarQ;
        zd1Var.f12971c = new jx1(ow1Var);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.t6
    public final void h(long j10) {
        this.f10501c = j10;
        this.f10846p = j10 != 0;
        z2 z2Var = this.f10847q;
        this.f10845o = z2Var != null ? z2Var.f12850e : 0;
    }
}
