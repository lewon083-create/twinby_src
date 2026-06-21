package yads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class x01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f44554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f44555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f44556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f44557d;

    public x01(List list, int i, float f10, String str) {
        this.f44554a = list;
        this.f44555b = i;
        this.f44556c = f10;
        this.f44557d = str;
    }

    public static x01 a(lb2 lb2Var) throws qb2 {
        boolean z5;
        int i;
        boolean z10 = true;
        try {
            lb2Var.e(lb2Var.f40464b + 21);
            int iM = lb2Var.m() & 3;
            int iM2 = lb2Var.m();
            int i10 = lb2Var.f40464b;
            int i11 = 0;
            int i12 = 0;
            for (int i13 = 0; i13 < iM2; i13++) {
                lb2Var.e(lb2Var.f40464b + 1);
                int iR = lb2Var.r();
                for (int i14 = 0; i14 < iR; i14++) {
                    int iR2 = lb2Var.r();
                    i12 += iR2 + 4;
                    lb2Var.e(lb2Var.f40464b + iR2);
                }
            }
            lb2Var.e(i10);
            byte[] bArr = new byte[i12];
            float f10 = 1.0f;
            String strA = null;
            int i15 = 0;
            int i16 = 0;
            while (i15 < iM2) {
                int iM3 = lb2Var.m() & 127;
                int iR3 = lb2Var.r();
                int i17 = i11;
                while (i17 < iR3) {
                    int iR4 = lb2Var.r();
                    z5 = z10;
                    try {
                        System.arraycopy(fy1.f38575a, i11, bArr, i16, 4);
                        int i18 = i16 + 4;
                        System.arraycopy(lb2Var.f40463a, lb2Var.f40464b, bArr, i18, iR4);
                        if (iM3 == 33 && i17 == 0) {
                            cy1 cy1VarA = fy1.a(bArr, i18, i18 + iR4);
                            f10 = cy1VarA.f37562g;
                            i = iM;
                            strA = jx.a(cy1VarA.f37556a, cy1VarA.f37557b, cy1VarA.f37558c, cy1VarA.f37559d, cy1VarA.f37560e, cy1VarA.f37561f);
                        } else {
                            i = iM;
                        }
                        i16 = i18 + iR4;
                        lb2Var.e(lb2Var.f40464b + iR4);
                        i17++;
                        z10 = z5;
                        iM = i;
                        i11 = 0;
                    } catch (ArrayIndexOutOfBoundsException e3) {
                        e = e3;
                        boolean z11 = z5;
                        throw new qb2("Error parsing HEVC config", e, z11, z11 ? 1 : 0);
                    }
                }
                i15++;
                i11 = 0;
            }
            z5 = z10;
            return new x01(i12 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iM + 1, f10, strA);
        } catch (ArrayIndexOutOfBoundsException e7) {
            e = e7;
            z5 = z10;
        }
    }
}
