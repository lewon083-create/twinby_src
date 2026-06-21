package yads;

import java.util.ArrayList;
import java.util.Arrays;
import kotlin.KotlinVersion;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class cn3 extends c43 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public bn3 f37446n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f37447o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f37448p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public fn3 f37449q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public dn3 f37450r;

    @Override // yads.c43
    public final void a(long j10) {
        this.f37285g = j10;
        this.f37448p = j10 != 0;
        fn3 fn3Var = this.f37449q;
        this.f37447o = fn3Var != null ? fn3Var.f38500e : 0;
    }

    @Override // yads.c43
    public final long a(lb2 lb2Var) {
        int i;
        byte[] bArr = lb2Var.f40463a;
        byte b2 = bArr[0];
        if ((b2 & 1) == 1) {
            return -1L;
        }
        bn3 bn3Var = this.f37446n;
        if (bn3Var != null) {
            if (!bn3Var.f37110d[(b2 >> 1) & (KotlinVersion.MAX_COMPONENT_VALUE >>> (8 - bn3Var.f37111e))].f38189a) {
                i = bn3Var.f37107a.f38500e;
            } else {
                i = bn3Var.f37107a.f38501f;
            }
            long j10 = this.f37448p ? (this.f37447o + i) / 4 : 0;
            int length = bArr.length;
            int i10 = lb2Var.f40465c + 4;
            if (length < i10) {
                lb2Var.a(Arrays.copyOf(bArr, i10));
            } else {
                lb2Var.d(i10);
            }
            byte[] bArr2 = lb2Var.f40463a;
            int i11 = lb2Var.f40465c;
            bArr2[i11 - 4] = (byte) (j10 & 255);
            bArr2[i11 - 3] = (byte) ((j10 >>> 8) & 255);
            bArr2[i11 - 2] = (byte) ((j10 >>> 16) & 255);
            bArr2[i11 - 1] = (byte) ((j10 >>> 24) & 255);
            this.f37448p = true;
            this.f37447o = i;
            return j10;
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v4, types: [int] */
    /* JADX WARN: Type inference failed for: r9v45 */
    @Override // yads.c43
    public final boolean a(lb2 lb2Var, long j10, a43 a43Var) throws qb2 {
        bn3 bn3Var;
        int i;
        int i10;
        int i11;
        if (this.f37446n != null) {
            a43Var.f36630a.getClass();
            return false;
        }
        fn3 fn3Var = this.f37449q;
        int i12 = 1;
        if (fn3Var == null) {
            this.f37449q = gn3.a(lb2Var);
        } else {
            dn3 dn3Var = this.f37450r;
            if (dn3Var == null) {
                this.f37450r = gn3.a(lb2Var, true, true);
            } else {
                int i13 = lb2Var.f40465c;
                byte[] bArr = new byte[i13];
                System.arraycopy(lb2Var.f40463a, 0, bArr, 0, i13);
                int i14 = fn3Var.f38496a;
                int i15 = 5;
                gn3.a(5, lb2Var, false);
                int iM = lb2Var.m() + 1;
                wm3 wm3Var = new wm3(lb2Var.f40463a);
                int i16 = 8;
                wm3Var.b(lb2Var.f40464b * 8);
                int i17 = 0;
                while (true) {
                    int i18 = i16;
                    int i19 = 16;
                    if (i17 < iM) {
                        int i20 = i12;
                        if (wm3Var.a(24) == 5653314) {
                            int iA = wm3Var.a(16);
                            int iA2 = wm3Var.a(24);
                            long[] jArr = new long[iA2];
                            long jFloor = 0;
                            if (!wm3Var.a()) {
                                boolean zA = wm3Var.a();
                                int i21 = 0;
                                while (i21 < iA2) {
                                    if (zA) {
                                        if (wm3Var.a()) {
                                            i11 = iM;
                                            jArr[i21] = wm3Var.a(i15) + 1;
                                        } else {
                                            i11 = iM;
                                            jArr[i21] = 0;
                                        }
                                        i10 = 5;
                                    } else {
                                        i10 = i15;
                                        i11 = iM;
                                        jArr[i21] = wm3Var.a(i10) + 1;
                                    }
                                    i21++;
                                    i15 = i10;
                                    iM = i11;
                                }
                                i = iM;
                            } else {
                                i = iM;
                                int iA3 = wm3Var.a(i15) + 1;
                                int i22 = 0;
                                while (i22 < iA2) {
                                    int i23 = 0;
                                    for (int i24 = iA2 - i22; i24 > 0; i24 >>>= 1) {
                                        i23++;
                                    }
                                    int iA4 = wm3Var.a(i23);
                                    int i25 = 0;
                                    while (i25 < iA4 && i22 < iA2) {
                                        jArr[i22] = iA3;
                                        i22++;
                                        i25++;
                                        fn3Var = fn3Var;
                                        dn3Var = dn3Var;
                                    }
                                    iA3++;
                                    fn3Var = fn3Var;
                                    dn3Var = dn3Var;
                                }
                            }
                            fn3 fn3Var2 = fn3Var;
                            dn3 dn3Var2 = dn3Var;
                            int iA5 = wm3Var.a(4);
                            if (iA5 > 2) {
                                throw new qb2(og2.a("lookup type greater than 2 not decodable: ", iA5), null, true, 1);
                            }
                            if (iA5 == i20 || iA5 == 2) {
                                wm3Var.b(32);
                                wm3Var.b(32);
                                int iA6 = wm3Var.a(4) + i20;
                                wm3Var.b(i20);
                                if (iA5 != i20) {
                                    jFloor = ((long) iA2) * ((long) iA);
                                } else if (iA != 0) {
                                    jFloor = (long) Math.floor(Math.pow(iA2, 1.0d / ((double) iA)));
                                }
                                wm3Var.b((int) (((long) iA6) * jFloor));
                            }
                            i17++;
                            i16 = i18;
                            fn3Var = fn3Var2;
                            iM = i;
                            dn3Var = dn3Var2;
                            i15 = 5;
                            i12 = 1;
                        } else {
                            throw new qb2("expected code book to start with [0x56, 0x43, 0x42] at " + ((wm3Var.f44431c * 8) + wm3Var.f44432d), null, true, 1);
                        }
                    } else {
                        fn3 fn3Var3 = fn3Var;
                        dn3 dn3Var3 = dn3Var;
                        ?? r92 = i12;
                        int i26 = 6;
                        int iA7 = wm3Var.a(6) + (r92 == true ? 1 : 0);
                        for (int i27 = 0; i27 < iA7; i27++) {
                            if (wm3Var.a(16) != 0) {
                                throw new qb2("placeholder of time domain transforms not zeroed out", null, r92, r92 == true ? 1 : 0);
                            }
                        }
                        int iA8 = wm3Var.a(6) + (r92 == true ? 1 : 0);
                        int i28 = 0;
                        ?? r93 = r92;
                        while (true) {
                            int i29 = 3;
                            if (i28 < iA8) {
                                int iA9 = wm3Var.a(i19);
                                if (iA9 == 0) {
                                    int i30 = i18;
                                    wm3Var.b(i30);
                                    wm3Var.b(16);
                                    wm3Var.b(16);
                                    wm3Var.b(6);
                                    wm3Var.b(i30);
                                    int iA10 = wm3Var.a(4) + r93;
                                    int i31 = 0;
                                    while (i31 < iA10) {
                                        wm3Var.b(i30);
                                        i31++;
                                        i30 = 8;
                                    }
                                } else if (iA9 == r93) {
                                    int iA11 = wm3Var.a(5);
                                    int[] iArr = new int[iA11];
                                    int i32 = -1;
                                    for (int i33 = 0; i33 < iA11; i33++) {
                                        int iA12 = wm3Var.a(4);
                                        iArr[i33] = iA12;
                                        if (iA12 > i32) {
                                            i32 = iA12;
                                        }
                                    }
                                    int i34 = i32 + 1;
                                    int[] iArr2 = new int[i34];
                                    int i35 = 0;
                                    while (i35 < i34) {
                                        iArr2[i35] = wm3Var.a(i29) + 1;
                                        int iA13 = wm3Var.a(2);
                                        int i36 = i18;
                                        if (iA13 > 0) {
                                            wm3Var.b(i36);
                                        }
                                        int i37 = 0;
                                        for (int i38 = 1; i37 < (i38 << iA13); i38 = 1) {
                                            wm3Var.b(i36);
                                            i37++;
                                            i36 = 8;
                                        }
                                        i35++;
                                        i18 = 8;
                                        i29 = 3;
                                    }
                                    wm3Var.b(2);
                                    int iA14 = wm3Var.a(4);
                                    int i39 = 0;
                                    int i40 = 0;
                                    for (int i41 = 0; i41 < iA11; i41++) {
                                        i39 += iArr2[iArr[i41]];
                                        while (i40 < i39) {
                                            wm3Var.b(iA14);
                                            i40++;
                                        }
                                    }
                                } else {
                                    throw new qb2(og2.a("floor type greater than 1 not decodable: ", iA9), null, true, 1);
                                }
                                i28++;
                                i18 = 8;
                                i26 = 6;
                                r93 = 1;
                                i19 = 16;
                            } else {
                                int i42 = 1;
                                int iA15 = wm3Var.a(i26) + 1;
                                int i43 = 0;
                                while (i43 < iA15) {
                                    if (wm3Var.a(16) <= 2) {
                                        wm3Var.b(24);
                                        wm3Var.b(24);
                                        wm3Var.b(24);
                                        int iA16 = wm3Var.a(i26) + 1;
                                        int i44 = 8;
                                        wm3Var.b(8);
                                        int[] iArr3 = new int[iA16];
                                        for (int i45 = 0; i45 < iA16; i45++) {
                                            iArr3[i45] = ((wm3Var.a() ? wm3Var.a(5) : 0) * 8) + wm3Var.a(3);
                                        }
                                        int i46 = 0;
                                        while (i46 < iA16) {
                                            int i47 = 0;
                                            while (i47 < i44) {
                                                if ((iArr3[i46] & (1 << i47)) != 0) {
                                                    wm3Var.b(i44);
                                                }
                                                i47++;
                                                i44 = 8;
                                            }
                                            i46++;
                                            i44 = 8;
                                        }
                                        i43++;
                                        i26 = 6;
                                        i42 = 1;
                                    } else {
                                        throw new qb2("residueType greater than 2 is not decodable", null, true, 1);
                                    }
                                }
                                int iA17 = wm3Var.a(i26) + i42;
                                for (int i48 = 0; i48 < iA17; i48++) {
                                    int iA18 = wm3Var.a(16);
                                    if (iA18 != 0) {
                                        kh1.b("VorbisUtil", "mapping type other than 0 not supported: " + iA18);
                                    } else {
                                        int iA19 = wm3Var.a() ? wm3Var.a(4) + 1 : 1;
                                        if (wm3Var.a()) {
                                            int iA20 = wm3Var.a(8) + 1;
                                            for (int i49 = 0; i49 < iA20; i49++) {
                                                int i50 = i14 - 1;
                                                int i51 = 0;
                                                for (int i52 = i50; i52 > 0; i52 >>>= 1) {
                                                    i51++;
                                                }
                                                wm3Var.b(i51);
                                                int i53 = 0;
                                                while (i50 > 0) {
                                                    i53++;
                                                    i50 >>>= 1;
                                                }
                                                wm3Var.b(i53);
                                            }
                                        }
                                        if (wm3Var.a(2) != 0) {
                                            throw new qb2("to reserved bits must be zero after mapping coupling steps", null, true, 1);
                                        }
                                        if (iA19 > 1) {
                                            for (int i54 = 0; i54 < i14; i54++) {
                                                wm3Var.b(4);
                                            }
                                        }
                                        for (int i55 = 0; i55 < iA19; i55++) {
                                            wm3Var.b(8);
                                            wm3Var.b(8);
                                            wm3Var.b(8);
                                        }
                                    }
                                }
                                int iA21 = wm3Var.a(6);
                                int i56 = iA21 + 1;
                                en3[] en3VarArr = new en3[i56];
                                for (int i57 = 0; i57 < i56; i57++) {
                                    boolean zA2 = wm3Var.a();
                                    wm3Var.a(16);
                                    wm3Var.a(16);
                                    wm3Var.a(8);
                                    en3VarArr[i57] = new en3(zA2);
                                }
                                if (wm3Var.a()) {
                                    int i58 = 0;
                                    while (iA21 > 0) {
                                        i58++;
                                        iA21 >>>= 1;
                                    }
                                    bn3Var = new bn3(fn3Var3, dn3Var3, bArr, en3VarArr, i58);
                                } else {
                                    throw new qb2("framing bit after modes not set as expected", null, true, 1);
                                }
                            }
                        }
                    }
                }
            }
        }
        bn3Var = null;
        this.f37446n = bn3Var;
        if (bn3Var == null) {
            return true;
        }
        fn3 fn3Var4 = bn3Var.f37107a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(fn3Var4.f38502g);
        arrayList.add(bn3Var.f37109c);
        vs1 vs1VarA = gn3.a(r51.b(bn3Var.f37108b.f37850a));
        mx0 mx0Var = new mx0();
        mx0Var.f41075k = "audio/vorbis";
        mx0Var.f41071f = fn3Var4.f38499d;
        mx0Var.f41072g = fn3Var4.f38498c;
        mx0Var.f41088x = fn3Var4.f38496a;
        mx0Var.f41089y = fn3Var4.f38497b;
        mx0Var.f41077m = arrayList;
        mx0Var.i = vs1VarA;
        a43Var.f36630a = new nx0(mx0Var);
        return true;
    }

    @Override // yads.c43
    public final void a(boolean z5) {
        super.a(z5);
        if (z5) {
            this.f37446n = null;
            this.f37449q = null;
            this.f37450r = null;
        }
        this.f37447o = 0;
        this.f37448p = false;
    }
}
