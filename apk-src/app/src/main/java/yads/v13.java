package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class v13 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f43852a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean a(oq0 oq0Var, boolean z5, boolean z10) {
        boolean z11;
        boolean z12;
        int i;
        int i10;
        long length = oq0Var.getLength();
        long j10 = -1;
        int i11 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j11 = 4096;
        if (i11 != 0 && length <= 4096) {
            j11 = length;
        }
        int i12 = (int) j11;
        lb2 lb2Var = new lb2(64);
        int i13 = 0;
        int i14 = 0;
        boolean z13 = false;
        while (i14 < i12) {
            lb2Var.c(8);
            if (!oq0Var.b(lb2Var.f40463a, i13, 8, true)) {
                break;
            }
            long jN = lb2Var.n();
            int iB = lb2Var.b();
            if (jN == 1) {
                oq0Var.a(lb2Var.f40463a, 8, 8);
                lb2Var.d(16);
                z12 = i13;
                i = i14;
                i10 = 16;
                jN = lb2Var.i();
            } else {
                if (jN == 0) {
                    long length2 = oq0Var.getLength();
                    if (length2 != j10) {
                        jN = (length2 - oq0Var.c()) + ((long) 8);
                    }
                }
                z12 = i13;
                i = i14;
                i10 = 8;
            }
            long j12 = i10;
            if (jN < j12) {
                return z12;
            }
            int i15 = i + i10;
            boolean z14 = z12;
            if (iB == 1836019574) {
                i12 += (int) jN;
                if (i11 != 0 && i12 > length) {
                    i12 = (int) length;
                }
                i14 = i15;
                i13 = z14 ? 1 : 0;
                j10 = -1;
            } else {
                if (iB == 1836019558 || iB == 1836475768) {
                    z11 = true;
                    break;
                }
                int i16 = i11;
                if ((((long) i15) + jN) - j12 >= i12) {
                    break;
                }
                int i17 = (int) (jN - j12);
                i14 = i15 + i17;
                if (iB == 1718909296) {
                    if (i17 < 8) {
                        return z14;
                    }
                    lb2Var.c(i17);
                    oq0Var.a(lb2Var.f40463a, z14 ? 1 : 0, i17);
                    int i18 = i17 / 4;
                    for (int i19 = 0; i19 < i18; i19++) {
                        if (i19 != 1) {
                            int iB2 = lb2Var.b();
                            if ((iB2 >>> 8) != 3368816 && (iB2 != 1751476579 || !z10)) {
                                int[] iArr = f43852a;
                                for (int i20 = 0; i20 < 29; i20++) {
                                    if (iArr[i20] != iB2) {
                                    }
                                }
                            }
                            z13 = true;
                            break;
                        }
                        lb2Var.e(lb2Var.f40464b + 4);
                    }
                    if (!z13) {
                        return false;
                    }
                } else if (i17 != 0) {
                    oq0Var.b(i17);
                }
                i11 = i16;
                j10 = -1;
                i13 = 0;
            }
        }
        z11 = false;
        return z13 && z5 == z11;
    }
}
