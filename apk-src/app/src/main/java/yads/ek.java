package yads;

import android.util.Pair;
import kotlin.KotlinVersion;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ek {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f38150a = lb3.c("OpusHead");

    public static zj a(int i, lb2 lb2Var) {
        lb2Var.e(i + 12);
        lb2Var.e(lb2Var.f40464b + 1);
        a(lb2Var);
        lb2Var.e(lb2Var.f40464b + 2);
        int iM = lb2Var.m();
        if ((iM & 128) != 0) {
            lb2Var.e(lb2Var.f40464b + 2);
        }
        if ((iM & 64) != 0) {
            lb2Var.e(lb2Var.f40464b + lb2Var.m());
        }
        if ((iM & 32) != 0) {
            lb2Var.e(lb2Var.f40464b + 2);
        }
        lb2Var.e(lb2Var.f40464b + 1);
        a(lb2Var);
        String strA = jt1.a(lb2Var.m());
        if ("audio/mpeg".equals(strA) || "audio/vnd.dts".equals(strA) || "audio/vnd.dts.hd".equals(strA)) {
            return new zj(strA, null, -1L, -1L);
        }
        lb2Var.e(lb2Var.f40464b + 4);
        long jN = lb2Var.n();
        long jN2 = lb2Var.n();
        lb2Var.e(lb2Var.f40464b + 1);
        int iA = a(lb2Var);
        byte[] bArr = new byte[iA];
        lb2Var.a(bArr, 0, iA);
        return new zj(strA, bArr, jN2 > 0 ? jN2 : -1L, jN > 0 ? jN : -1L);
    }

    public static int a(lb2 lb2Var) {
        int iM = lb2Var.m();
        int i = iM & 127;
        while ((iM & 128) == 128) {
            iM = lb2Var.m();
            i = (i << 7) | (iM & 127);
        }
        return i;
    }

    public static Pair a(int i, int i10, lb2 lb2Var) throws qb2 {
        Integer num;
        i73 i73Var;
        Pair pairCreate;
        int i11;
        int i12;
        Integer num2;
        boolean z5;
        int i13 = lb2Var.f40464b;
        while (i13 - i < i10) {
            lb2Var.e(i13);
            int iB = lb2Var.b();
            rq0.a("childAtomSize must be positive", iB > 0);
            if (lb2Var.b() == 1936289382) {
                int i14 = i13 + 8;
                int i15 = 0;
                int i16 = -1;
                Integer numValueOf = null;
                String strA = null;
                while (i14 - i13 < iB) {
                    lb2Var.e(i14);
                    int iB2 = lb2Var.b();
                    int iB3 = lb2Var.b();
                    if (iB3 == 1718775137) {
                        numValueOf = Integer.valueOf(lb2Var.b());
                    } else if (iB3 == 1935894637) {
                        lb2Var.e(lb2Var.f40464b + 4);
                        strA = lb2Var.a(4, bu.f37146c);
                    } else if (iB3 == 1935894633) {
                        i16 = i14;
                        i15 = iB2;
                    }
                    i14 += iB2;
                }
                byte[] bArr = null;
                if ("cenc".equals(strA) || "cbc1".equals(strA) || "cens".equals(strA) || "cbcs".equals(strA)) {
                    rq0.a("frma atom is mandatory", numValueOf != null);
                    rq0.a("schi atom is mandatory", i16 != -1);
                    int i17 = i16 + 8;
                    while (true) {
                        if (i17 - i16 >= i15) {
                            num = numValueOf;
                            i73Var = null;
                            break;
                        }
                        lb2Var.e(i17);
                        int iB4 = lb2Var.b();
                        if (lb2Var.b() == 1952804451) {
                            int iB5 = (lb2Var.b() >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
                            lb2Var.e(lb2Var.f40464b + 1);
                            if (iB5 == 0) {
                                lb2Var.e(lb2Var.f40464b + 1);
                                i12 = 0;
                                i11 = 0;
                            } else {
                                int iM = lb2Var.m();
                                i11 = iM & 15;
                                i12 = (iM & 240) >> 4;
                            }
                            if (lb2Var.m() == 1) {
                                num2 = numValueOf;
                                z5 = true;
                            } else {
                                num2 = numValueOf;
                                z5 = false;
                            }
                            int iM2 = lb2Var.m();
                            byte[] bArr2 = new byte[16];
                            lb2Var.a(bArr2, 0, 16);
                            if (z5 && iM2 == 0) {
                                int iM3 = lb2Var.m();
                                byte[] bArr3 = new byte[iM3];
                                lb2Var.a(bArr3, 0, iM3);
                                bArr = bArr3;
                            }
                            num = num2;
                            i73Var = new i73(z5, strA, iM2, bArr2, i12, i11, bArr);
                        } else {
                            i17 += iB4;
                        }
                    }
                    rq0.a("tenc atom is mandatory", i73Var != null);
                    int i18 = lb3.f40466a;
                    pairCreate = Pair.create(num, i73Var);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            i13 += iB;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:229:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0616  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0653 A[PHI: r28 r29 r30
      0x0653: PHI (r28v10 java.util.List) = (r28v8 java.util.List), (r28v11 java.util.List), (r28v12 java.util.List) binds: [B:315:0x0614, B:293:0x0592, B:250:0x0428] A[DONT_GENERATE, DONT_INLINE]
      0x0653: PHI (r29v8 int) = (r29v6 int), (r29v9 int), (r29v10 int) binds: [B:315:0x0614, B:293:0x0592, B:250:0x0428] A[DONT_GENERATE, DONT_INLINE]
      0x0653: PHI (r30v8 java.lang.String) = (r30v5 java.lang.String), (r30v9 java.lang.String), (r30v14 java.lang.String) binds: [B:315:0x0614, B:293:0x0592, B:250:0x0428] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0694  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static yads.bk a(yads.lb2 r47, int r48, int r49, java.lang.String r50, yads.lk0 r51, boolean r52) throws yads.qb2 {
        /*
            Method dump skipped, instruction units count: 2934
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.ek.a(yads.lb2, int, int, java.lang.String, yads.lk0, boolean):yads.bk");
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList a(yads.vj r48, yads.az0 r49, long r50, yads.lk0 r52, boolean r53, boolean r54, yads.xy0 r55) {
        /*
            Method dump skipped, instruction units count: 2140
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.ek.a(yads.vj, yads.az0, long, yads.lk0, boolean, boolean, yads.xy0):java.util.ArrayList");
    }
}
