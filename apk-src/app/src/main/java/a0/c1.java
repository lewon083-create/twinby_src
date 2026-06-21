package a0;

import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c1 implements n0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f51b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f52c;

    public /* synthetic */ c1(int i, Object obj) {
        this.f51b = i;
        this.f52c = obj;
    }

    @Override // a0.n0
    public final void a(o0 o0Var) {
        n0 n0Var;
        switch (this.f51b) {
            case 0:
                f1 f1Var = (f1) ((WeakReference) ((e1) this.f52c).f67f).get();
                if (f1Var != null) {
                    f1Var.f78w.execute(new d1(0, f1Var));
                    return;
                }
                return;
            default:
                e2 e2Var = (e2) this.f52c;
                synchronized (e2Var.f68b) {
                    try {
                        int i = e2Var.f69c - 1;
                        e2Var.f69c = i;
                        if (e2Var.f70d && i == 0) {
                            e2Var.close();
                        }
                        n0Var = e2Var.f73g;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                if (n0Var != null) {
                    n0Var.a(o0Var);
                    return;
                }
                return;
        }
    }
}
