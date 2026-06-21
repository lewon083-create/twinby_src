package yads;

import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class x21 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lb2 f44574a = new lb2(10);

    public final vs1 a(ld0 ld0Var, t21 t21Var) {
        vs1 vs1VarA = null;
        int i = 0;
        while (true) {
            try {
                ld0Var.b(this.f44574a.f40463a, 0, 10, false);
                this.f44574a.e(0);
                if (this.f44574a.o() != 4801587) {
                    break;
                }
                lb2 lb2Var = this.f44574a;
                lb2Var.e(lb2Var.f40464b + 3);
                int iL = this.f44574a.l();
                int i10 = iL + 10;
                if (vs1VarA == null) {
                    byte[] bArr = new byte[i10];
                    System.arraycopy(this.f44574a.f40463a, 0, bArr, 0, 10);
                    ld0Var.b(bArr, 10, iL, false);
                    vs1VarA = new v21(t21Var).a(i10, bArr);
                } else {
                    ld0Var.a(false, iL);
                }
                i += i10;
            } catch (EOFException unused) {
            }
        }
        ld0Var.f40507f = 0;
        ld0Var.a(false, i);
        return vs1VarA;
    }
}
