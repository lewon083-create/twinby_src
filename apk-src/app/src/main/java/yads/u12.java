package yads;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class u12 implements m72 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hy1 f43523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n12 f43524b;

    public u12(hy1 hy1Var) {
        this.f43523a = hy1Var;
    }

    @Override // yads.m72
    public final void a(n12 n12Var) {
        n12Var.a();
    }

    @Override // yads.m72
    public final void a(n12 n12Var, gv gvVar) {
        this.f43524b = n12Var;
        hy1 hy1Var = this.f43523a;
        vb vbVar = new vb(n12Var, gvVar, hy1Var.f39367e, new kl3());
        for (oi oiVar : hy1Var.f39364b) {
            pi piVarA = n12Var.a(oiVar);
            if (piVarA == null) {
                piVarA = null;
            }
            if (piVarA != null) {
                piVarA.c(oiVar.f41542c);
                piVarA.a(oiVar, vbVar);
            }
        }
        nm2 nm2Var = n12Var.f41135c.f36616e;
        dk.i iVar = a22.f36611g[4];
        List list = (List) nm2Var.f41294a.get();
        if (list != null) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                throw com.google.android.gms.internal.ads.om1.i(it);
            }
        }
    }

    @Override // yads.m72
    public final void a() {
        n12 n12Var = this.f43524b;
        if (n12Var != null) {
            for (oi oiVar : this.f43523a.f39364b) {
                pi piVarA = n12Var.a(oiVar);
                if (piVarA instanceof pf0) {
                    ((pf0) piVarA).b(oiVar.f41542c);
                }
            }
        }
    }
}
