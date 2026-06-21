package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class rt {
    public static void a(long j10, lb2 lb2Var, p73[] p73VarArr) {
        int i;
        while (true) {
            if (lb2Var.f40465c - lb2Var.f40464b <= 1) {
                return;
            }
            int i10 = 0;
            while (true) {
                if (lb2Var.f40465c - lb2Var.f40464b == 0) {
                    i = -1;
                    break;
                }
                int iM = lb2Var.m();
                i10 += iM;
                if (iM != 255) {
                    i = i10;
                    break;
                }
            }
            int i11 = 0;
            while (true) {
                if (lb2Var.f40465c - lb2Var.f40464b == 0) {
                    i11 = -1;
                    break;
                }
                int iM2 = lb2Var.m();
                i11 += iM2;
                if (iM2 != 255) {
                    break;
                }
            }
            int i12 = lb2Var.f40464b;
            int i13 = i12 + i11;
            if (i11 == -1 || i11 > lb2Var.f40465c - i12) {
                kh1.d("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i13 = lb2Var.f40465c;
            } else if (i == 4 && i11 >= 8) {
                int iM3 = lb2Var.m();
                int iR = lb2Var.r();
                int iB = iR == 49 ? lb2Var.b() : 0;
                int iM4 = lb2Var.m();
                if (iR == 47) {
                    lb2Var.e(lb2Var.f40464b + 1);
                }
                boolean z5 = iM3 == 181 && (iR == 49 || iR == 47) && iM4 == 3;
                if (iR == 49) {
                    z5 &= iB == 1195456820;
                }
                if (z5) {
                    b(j10, lb2Var, p73VarArr);
                }
            }
            lb2Var.e(i13);
        }
    }

    public static void b(long j10, lb2 lb2Var, p73[] p73VarArr) {
        long j11;
        int iM = lb2Var.m();
        if ((iM & 64) != 0) {
            lb2Var.e(lb2Var.f40464b + 1);
            int i = (iM & 31) * 3;
            int i10 = lb2Var.f40464b;
            int length = p73VarArr.length;
            int i11 = 0;
            while (i11 < length) {
                p73 p73Var = p73VarArr[i11];
                lb2Var.e(i10);
                p73Var.a(i, lb2Var);
                if (j10 != -9223372036854775807L) {
                    j11 = j10;
                    p73Var.a(j11, 1, i, 0, null);
                } else {
                    j11 = j10;
                }
                i11++;
                j10 = j11;
            }
        }
    }
}
