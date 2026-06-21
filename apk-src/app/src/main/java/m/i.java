package m;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class i implements l.o, i0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28257b;

    public /* synthetic */ i(Object obj) {
        this.f28257b = obj;
    }

    @Override // l.o
    public void b(l.i iVar, boolean z5) {
        if (iVar instanceof l.t) {
            ((l.t) iVar).f27703w.j().c(false);
        }
        l.o oVar = ((j) this.f28257b).f28265f;
        if (oVar != null) {
            oVar.b(iVar, z5);
        }
    }

    @Override // l.o
    public boolean c(l.i iVar) {
        j jVar = (j) this.f28257b;
        if (iVar == jVar.f28263d) {
            return false;
        }
        ((l.t) iVar).f27704x.getClass();
        jVar.getClass();
        l.o oVar = jVar.f28265f;
        if (oVar != null) {
            return oVar.c(iVar);
        }
        return false;
    }

    @Override // m.i0
    public void a(int i) {
    }

    @Override // m.i0
    public void d(int i) {
    }
}
