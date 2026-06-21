package l5;

import ad.j0;
import com.google.android.gms.internal.ads.t6;
import com.google.android.gms.internal.ads.y2;
import com.google.android.gms.internal.ads.z2;
import j3.b0;
import j3.c0;
import j3.d0;
import j3.n;
import j3.o;
import java.util.ArrayList;
import java.util.Arrays;
import k6.t0;
import kotlin.KotlinVersion;
import m3.p;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends t6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public d1.b f27933n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f27934o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f27935p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public z2 f27936q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public t0 f27937r;

    @Override // com.google.android.gms.internal.ads.t6
    public final void a(long j10) {
        this.f10501c = j10;
        this.f27935p = j10 != 0;
        z2 z2Var = this.f27936q;
        this.f27934o = z2Var != null ? z2Var.f12850e : 0;
    }

    @Override // com.google.android.gms.internal.ads.t6
    public final long b(p pVar) {
        byte b2 = pVar.f28589a[0];
        if ((b2 & 1) == 1) {
            return -1L;
        }
        d1.b bVar = this.f27933n;
        bVar.getClass();
        int i = bVar.f15507c;
        z2 z2Var = (z2) bVar.f15508d;
        int i10 = !((fd.b[]) bVar.f15511g)[(b2 >> 1) & (KotlinVersion.MAX_COMPONENT_VALUE >>> (8 - i))].f16748a ? z2Var.f12850e : z2Var.f12851f;
        long j10 = this.f27935p ? (this.f27934o + i10) / 4 : 0;
        byte[] bArr = pVar.f28589a;
        int length = bArr.length;
        int i11 = pVar.f28591c + 4;
        if (length < i11) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i11);
            pVar.K(bArrCopyOf.length, bArrCopyOf);
        } else {
            pVar.L(i11);
        }
        byte[] bArr2 = pVar.f28589a;
        int i12 = pVar.f28591c;
        bArr2[i12 - 4] = (byte) (j10 & 255);
        bArr2[i12 - 3] = (byte) ((j10 >>> 8) & 255);
        bArr2[i12 - 2] = (byte) ((j10 >>> 16) & 255);
        bArr2[i12 - 1] = (byte) ((j10 >>> 24) & 255);
        this.f27935p = true;
        this.f27934o = i10;
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.t6
    public final boolean c(p pVar, long j10, h3.e eVar) throws d0 {
        d1.b bVar;
        if (this.f27933n != null) {
            ((o) eVar.f20375c).getClass();
            return false;
        }
        z2 z2Var = this.f27936q;
        int i = 4;
        if (z2Var == null) {
            q4.b.B(1, pVar, false);
            pVar.r();
            int iZ = pVar.z();
            int iR = pVar.r();
            int iO = pVar.o();
            int i10 = iO <= 0 ? -1 : iO;
            int iO2 = pVar.o();
            int i11 = iO2 <= 0 ? -1 : iO2;
            pVar.o();
            int iZ2 = pVar.z();
            int iPow = (int) Math.pow(2.0d, iZ2 & 15);
            int iPow2 = (int) Math.pow(2.0d, (iZ2 & 240) >> 4);
            pVar.z();
            this.f27936q = new z2(iZ, iR, i10, i11, iPow, iPow2, Arrays.copyOf(pVar.f28589a, pVar.f28591c));
        } else {
            t0 t0Var = this.f27937r;
            if (t0Var == null) {
                this.f27937r = q4.b.z(pVar, true, true);
            } else {
                int i12 = pVar.f28591c;
                byte[] bArr = new byte[i12];
                System.arraycopy(pVar.f28589a, 0, bArr, 0, i12);
                int i13 = z2Var.f12846a;
                int i14 = 5;
                q4.b.B(5, pVar, false);
                int iZ3 = pVar.z() + 1;
                y2 y2Var = new y2(pVar.f28589a, 5, (byte) 0);
                int i15 = 8;
                y2Var.t(pVar.f28590b * 8);
                int i16 = 0;
                while (true) {
                    int i17 = i15;
                    int i18 = 16;
                    if (i16 >= iZ3) {
                        int i19 = 6;
                        int i20 = y2Var.i(6) + 1;
                        for (int i21 = 0; i21 < i20; i21++) {
                            if (y2Var.i(16) != 0) {
                                throw d0.a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int i22 = 1;
                        int i23 = y2Var.i(6) + 1;
                        int i24 = 0;
                        while (true) {
                            int i25 = 3;
                            if (i24 < i23) {
                                int i26 = y2Var.i(i18);
                                if (i26 == 0) {
                                    int i27 = i17;
                                    y2Var.t(i27);
                                    y2Var.t(16);
                                    y2Var.t(16);
                                    y2Var.t(6);
                                    y2Var.t(i27);
                                    int i28 = y2Var.i(4) + 1;
                                    int i29 = 0;
                                    while (i29 < i28) {
                                        y2Var.t(i27);
                                        i29++;
                                        i27 = 8;
                                    }
                                } else {
                                    if (i26 != i22) {
                                        throw d0.a(null, "floor type greater than 1 not decodable: " + i26);
                                    }
                                    int i30 = y2Var.i(5);
                                    int[] iArr = new int[i30];
                                    int i31 = -1;
                                    for (int i32 = 0; i32 < i30; i32++) {
                                        int i33 = y2Var.i(i);
                                        iArr[i32] = i33;
                                        if (i33 > i31) {
                                            i31 = i33;
                                        }
                                    }
                                    int i34 = i31 + 1;
                                    int[] iArr2 = new int[i34];
                                    int i35 = 0;
                                    while (i35 < i34) {
                                        iArr2[i35] = y2Var.i(i25) + 1;
                                        int i36 = y2Var.i(2);
                                        int i37 = i17;
                                        if (i36 > 0) {
                                            y2Var.t(i37);
                                        }
                                        int[] iArr3 = iArr2;
                                        int i38 = 0;
                                        for (int i39 = 1; i38 < (i39 << i36); i39 = 1) {
                                            y2Var.t(i37);
                                            i38++;
                                            i37 = 8;
                                        }
                                        i35++;
                                        iArr2 = iArr3;
                                        i17 = 8;
                                        i25 = 3;
                                    }
                                    int[] iArr4 = iArr2;
                                    y2Var.t(2);
                                    int i40 = y2Var.i(4);
                                    int i41 = 0;
                                    int i42 = 0;
                                    for (int i43 = 0; i43 < i30; i43++) {
                                        i41 += iArr4[iArr[i43]];
                                        while (i42 < i41) {
                                            y2Var.t(i40);
                                            i42++;
                                        }
                                    }
                                }
                                i24++;
                                i17 = 8;
                                i19 = 6;
                                i18 = 16;
                                i = 4;
                                i22 = 1;
                            } else {
                                int i44 = y2Var.i(i19) + 1;
                                int i45 = 0;
                                while (i45 < i44) {
                                    if (y2Var.i(16) > 2) {
                                        throw d0.a(null, "residueType greater than 2 is not decodable");
                                    }
                                    y2Var.t(24);
                                    y2Var.t(24);
                                    y2Var.t(24);
                                    int i46 = y2Var.i(i19) + 1;
                                    int i47 = 8;
                                    y2Var.t(8);
                                    int[] iArr5 = new int[i46];
                                    for (int i48 = 0; i48 < i46; i48++) {
                                        iArr5[i48] = ((y2Var.h() ? y2Var.i(5) : 0) * 8) + y2Var.i(3);
                                    }
                                    int i49 = 0;
                                    while (i49 < i46) {
                                        int i50 = 0;
                                        while (i50 < i47) {
                                            if ((iArr5[i49] & (1 << i50)) != 0) {
                                                y2Var.t(i47);
                                            }
                                            i50++;
                                            i47 = 8;
                                        }
                                        i49++;
                                        i47 = 8;
                                    }
                                    i45++;
                                    i19 = 6;
                                }
                                int i51 = y2Var.i(i19) + 1;
                                for (int i52 = 0; i52 < i51; i52++) {
                                    int i53 = y2Var.i(16);
                                    if (i53 != 0) {
                                        m3.b.e("VorbisUtil", "mapping type other than 0 not supported: " + i53);
                                    } else {
                                        int i54 = y2Var.h() ? y2Var.i(4) + 1 : 1;
                                        if (y2Var.h()) {
                                            int i55 = y2Var.i(8) + 1;
                                            for (int i56 = 0; i56 < i55; i56++) {
                                                int i57 = i13 - 1;
                                                int i58 = 0;
                                                for (int i59 = i57; i59 > 0; i59 >>>= 1) {
                                                    i58++;
                                                }
                                                y2Var.t(i58);
                                                int i60 = 0;
                                                while (i57 > 0) {
                                                    i60++;
                                                    i57 >>>= 1;
                                                }
                                                y2Var.t(i60);
                                            }
                                        }
                                        if (y2Var.i(2) != 0) {
                                            throw d0.a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                        if (i54 > 1) {
                                            for (int i61 = 0; i61 < i13; i61++) {
                                                y2Var.t(4);
                                            }
                                        }
                                        for (int i62 = 0; i62 < i54; i62++) {
                                            y2Var.t(8);
                                            y2Var.t(8);
                                            y2Var.t(8);
                                        }
                                    }
                                }
                                int i63 = y2Var.i(6);
                                int i64 = i63 + 1;
                                fd.b[] bVarArr = new fd.b[i64];
                                for (int i65 = 0; i65 < i64; i65++) {
                                    boolean zH = y2Var.h();
                                    y2Var.i(16);
                                    y2Var.i(16);
                                    y2Var.i(8);
                                    bVarArr[i65] = new fd.b(zH, false);
                                }
                                if (!y2Var.h()) {
                                    throw d0.a(null, "framing bit after modes not set as expected");
                                }
                                int i66 = 0;
                                while (i63 > 0) {
                                    i66++;
                                    i63 >>>= 1;
                                }
                                bVar = new d1.b(z2Var, t0Var, bArr, bVarArr, i66);
                            }
                        }
                    } else {
                        if (y2Var.i(24) != 5653314) {
                            throw d0.a(null, "expected code book to start with [0x56, 0x43, 0x42] at " + ((y2Var.f12464d * 8) + y2Var.f12465e));
                        }
                        int i67 = y2Var.i(16);
                        int i68 = y2Var.i(24);
                        if (y2Var.h()) {
                            y2Var.t(i14);
                            int i69 = 0;
                            while (i69 < i68) {
                                int i70 = 0;
                                for (int i71 = i68 - i69; i71 > 0; i71 >>>= 1) {
                                    i70++;
                                }
                                i69 += y2Var.i(i70);
                            }
                        } else {
                            boolean zH2 = y2Var.h();
                            for (int i72 = 0; i72 < i68; i72++) {
                                if (!zH2) {
                                    y2Var.t(i14);
                                } else if (y2Var.h()) {
                                    y2Var.t(i14);
                                }
                            }
                        }
                        int i73 = y2Var.i(4);
                        if (i73 > 2) {
                            throw d0.a(null, "lookup type greater than 2 not decodable: " + i73);
                        }
                        if (i73 == 1 || i73 == 2) {
                            y2Var.t(32);
                            y2Var.t(32);
                            int i74 = y2Var.i(4) + 1;
                            y2Var.t(1);
                            y2Var.t((int) ((i73 == 1 ? i67 != 0 ? (long) Math.floor(Math.pow(i68, 1.0d / ((double) i67))) : 0L : ((long) i67) * ((long) i68)) * ((long) i74)));
                        }
                        i16++;
                        i15 = i17;
                        i14 = 5;
                    }
                }
            }
        }
        bVar = null;
        this.f27933n = bVar;
        if (bVar == null) {
            return true;
        }
        z2 z2Var2 = (z2) bVar.f15508d;
        ArrayList arrayList = new ArrayList();
        arrayList.add((byte[]) z2Var2.f12852g);
        arrayList.add((byte[]) bVar.f15510f);
        b0 b0VarW = q4.b.w(j0.t((String[]) ((t0) bVar.f15509e).f27180c));
        n nVar = new n();
        nVar.f26291l = c0.n("audio/ogg");
        nVar.f26292m = c0.n("audio/vorbis");
        nVar.f26288h = z2Var2.f12849d;
        nVar.i = z2Var2.f12848c;
        nVar.E = z2Var2.f12846a;
        nVar.F = z2Var2.f12847b;
        nVar.f26295p = arrayList;
        nVar.f26290k = b0VarW;
        eVar.f20375c = new o(nVar);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.t6
    public final void d(boolean z5) {
        super.d(z5);
        if (z5) {
            this.f27933n = null;
            this.f27936q = null;
            this.f27937r = null;
        }
        this.f27934o = 0;
        this.f27935p = false;
    }
}
