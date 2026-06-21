package yads;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class g92 implements kx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h92 f38687a;

    public g92(vw1 vw1Var) {
        this.f38687a = vw1Var;
    }

    @Override // yads.kx0
    public final void a() {
        vw1 vw1Var = (vw1) this.f38687a;
        synchronized (vw1Var) {
            try {
                vw1Var.f44209m.size();
                vw1Var.b();
                ArrayList arrayList = new ArrayList();
                Iterator it = vw1Var.f44209m.iterator();
                while (it.hasNext()) {
                    f83 f83Var = (f83) it.next();
                    wb3 wb3VarA = vw1Var.a(f83Var);
                    if (wb3VarA instanceof ub3) {
                        it.remove();
                        vw1Var.a(f83Var, (ub3) wb3VarA);
                    } else if (wb3VarA instanceof tb3) {
                        tb3 tb3Var = (tb3) wb3VarA;
                        vw1Var.f44199b.a(f83Var.f38402d, tb3Var);
                        arrayList.add(new j92(f83Var, tb3Var));
                    }
                }
                vw1Var.f44199b.a(arrayList);
                vw1Var.a();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
