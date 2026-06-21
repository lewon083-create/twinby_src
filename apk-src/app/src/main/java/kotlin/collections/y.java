package kotlin.collections;

import kotlin.ranges.IntRange;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class y extends x {
    public static final int r(n0 n0Var, int i) {
        if (i >= 0 && i <= s.e(n0Var)) {
            return s.e(n0Var) - i;
        }
        StringBuilder sbM = l7.o.m(i, "Element index ", " must be in range [");
        sbM.append(new IntRange(0, s.e(n0Var), 1));
        sbM.append("].");
        throw new IndexOutOfBoundsException(sbM.toString());
    }

    public static final int s(n0 n0Var, int i) {
        if (i >= 0 && i <= n0Var.size()) {
            return n0Var.size() - i;
        }
        StringBuilder sbM = l7.o.m(i, "Position index ", " must be in range [");
        sbM.append(new IntRange(0, n0Var.size(), 1));
        sbM.append("].");
        throw new IndexOutOfBoundsException(sbM.toString());
    }
}
