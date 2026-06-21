package yads;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ym0 extends gz2 {
    @Override // yads.gz2
    public final vs1 a(ys1 ys1Var, ByteBuffer byteBuffer) {
        lb2 lb2Var = new lb2(byteBuffer.limit(), byteBuffer.array());
        String strJ = lb2Var.j();
        strJ.getClass();
        String strJ2 = lb2Var.j();
        strJ2.getClass();
        return new vs1(new xm0(strJ, strJ2, lb2Var.i(), lb2Var.i(), Arrays.copyOfRange(lb2Var.f40463a, lb2Var.f40464b, lb2Var.f40465c)));
    }
}
