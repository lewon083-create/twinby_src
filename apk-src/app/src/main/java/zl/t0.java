package zl;

import yads.m22;
import yads.n12;
import yads.py1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class t0 implements m22 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ py1 f46640b;

    public /* synthetic */ t0(py1 py1Var, int i) {
        this.f46639a = i;
        this.f46640b = py1Var;
    }

    @Override // yads.m22
    public final boolean a(n12 n12Var) {
        switch (this.f46639a) {
            case 0:
                return py1.c(this.f46640b, n12Var);
            case 1:
                return py1.d(this.f46640b, n12Var);
            case 2:
                return py1.b(this.f46640b, n12Var);
            case 3:
                return py1.a(this.f46640b, n12Var);
            default:
                return py1.e(this.f46640b, n12Var);
        }
    }
}
