package yads;

import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class rk0 implements tk0 {
    @Override // yads.tk0
    public final void a(Looper looper, af2 af2Var) {
    }

    @Override // yads.tk0
    public final nk0 b(pk0 pk0Var, nx0 nx0Var) {
        if (nx0Var.f41378p == null) {
            return null;
        }
        return new tm0(new mk0(new oa3(), 6001));
    }

    @Override // yads.tk0
    public final int a(nx0 nx0Var) {
        return nx0Var.f41378p != null ? 1 : 0;
    }
}
