package a6;

import a0.a0;
import d.r;
import d.w;
import kk.t;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f455b;

    public final void a() {
        c cVar = this.f454a;
        if (cVar == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (!this.f455b) {
            cVar.c(this, null);
        }
        Intrinsics.checkNotNullParameter(this, "input");
        g gVar = cVar.f449b;
        a0 a0Var = cVar.f448a;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(this, "input");
        if (equals(gVar.f463h) && -1 == gVar.f462g) {
            r rVarC = gVar.f461f;
            if (rVarC == null) {
                rVarC = gVar.c(-1);
            }
            gVar.f461f = null;
            gVar.f462g = 0;
            gVar.f463h = null;
            if (rVarC == null) {
                ((w) a0Var.f13c).f15481a.run();
            } else {
                rVarC.f15474f.a();
            }
            t tVar = gVar.f456a;
            tVar.getClass();
            tVar.H(null, h.f469b);
        }
        this.f455b = false;
    }

    public void b(boolean z5) {
    }
}
