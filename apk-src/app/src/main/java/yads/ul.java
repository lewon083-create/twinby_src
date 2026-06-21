package yads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ul {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f43702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f43703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f43704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f43705d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f43706e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f43707f;

    public ul(ArrayList arrayList, int i, int i10, int i11, float f10, String str) {
        this.f43702a = arrayList;
        this.f43703b = i;
        this.f43704c = i10;
        this.f43705d = i11;
        this.f43706e = f10;
        this.f43707f = str;
    }

    public static ul a(lb2 lb2Var) throws qb2 {
        float f10;
        String str;
        int i;
        int i10;
        try {
            lb2Var.e(lb2Var.f40464b + 4);
            int iM = (lb2Var.m() & 3) + 1;
            if (iM == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iM2 = lb2Var.m() & 31;
            for (int i11 = 0; i11 < iM2; i11++) {
                int iR = lb2Var.r();
                int i12 = lb2Var.f40464b;
                lb2Var.e(i12 + iR);
                byte[] bArr = lb2Var.f40463a;
                byte[] bArr2 = new byte[iR + 4];
                System.arraycopy(jx.f40002a, 0, bArr2, 0, 4);
                System.arraycopy(bArr, i12, bArr2, 4, iR);
                arrayList.add(bArr2);
            }
            int iM3 = lb2Var.m();
            for (int i13 = 0; i13 < iM3; i13++) {
                int iR2 = lb2Var.r();
                int i14 = lb2Var.f40464b;
                lb2Var.e(i14 + iR2);
                byte[] bArr3 = lb2Var.f40463a;
                byte[] bArr4 = new byte[iR2 + 4];
                System.arraycopy(jx.f40002a, 0, bArr4, 0, 4);
                System.arraycopy(bArr3, i14, bArr4, 4, iR2);
                arrayList.add(bArr4);
            }
            if (iM2 > 0) {
                ey1 ey1VarB = fy1.b((byte[]) arrayList.get(0), iM, ((byte[]) arrayList.get(0)).length);
                int i15 = ey1VarB.f38287e;
                int i16 = ey1VarB.f38288f;
                f10 = ey1VarB.f38289g;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(ey1VarB.f38283a), Integer.valueOf(ey1VarB.f38284b), Integer.valueOf(ey1VarB.f38285c));
                i = i15;
                i10 = i16;
            } else {
                f10 = 1.0f;
                str = null;
                i = -1;
                i10 = -1;
            }
            return new ul(arrayList, iM, i, i10, f10, str);
        } catch (ArrayIndexOutOfBoundsException e3) {
            throw new qb2("Error parsing AVC config", e3, true, 1);
        }
    }
}
