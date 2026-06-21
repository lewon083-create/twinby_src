package yads;

import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class bl0 implements p73 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f37088a = new byte[4096];

    @Override // yads.p73
    public final void a(long j10, int i, int i10, int i11, o73 o73Var) {
    }

    @Override // yads.p73
    public final void a(nx0 nx0Var) {
    }

    @Override // yads.p73
    public final int a(l30 l30Var, int i, boolean z5) throws EOFException {
        int i10 = l30Var.read(this.f37088a, 0, Math.min(this.f37088a.length, i));
        if (i10 != -1) {
            return i10;
        }
        if (z5) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // yads.p73
    public final void a(int i, lb2 lb2Var) {
        lb2Var.e(lb2Var.f40464b + i);
    }
}
