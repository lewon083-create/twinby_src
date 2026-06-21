package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class q93 {
    public static long a(int i, int i10, lb2 lb2Var) {
        lb2Var.e(i);
        if (lb2Var.f40465c - lb2Var.f40464b < 5) {
            return -9223372036854775807L;
        }
        int iB = lb2Var.b();
        if ((8388608 & iB) != 0 || ((2096896 & iB) >> 8) != i10 || (iB & 32) == 0 || lb2Var.m() < 7 || lb2Var.f40465c - lb2Var.f40464b < 7 || (lb2Var.m() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        lb2Var.a(bArr, 0, 6);
        return ((255 & ((long) bArr[4])) >> 7) | ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1);
    }
}
