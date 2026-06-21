package yads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class xv0 {
    public static bw0 a(lb2 lb2Var) {
        lb2Var.e(lb2Var.f40464b + 1);
        int iO = lb2Var.o();
        long j10 = ((long) lb2Var.f40464b) + ((long) iO);
        int i = iO / 18;
        long[] jArrCopyOf = new long[i];
        long[] jArrCopyOf2 = new long[i];
        int i10 = 0;
        while (true) {
            if (i10 >= i) {
                break;
            }
            long jI = lb2Var.i();
            if (jI == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i10);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i10);
                break;
            }
            jArrCopyOf[i10] = jI;
            jArrCopyOf2[i10] = lb2Var.i();
            lb2Var.e(lb2Var.f40464b + 2);
            i10++;
        }
        int i11 = lb2Var.f40464b;
        lb2Var.e(i11 + ((int) (j10 - ((long) i11))));
        return new bw0(jArrCopyOf, jArrCopyOf2);
    }
}
