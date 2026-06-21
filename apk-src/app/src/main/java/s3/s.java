package s3;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements m3.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f32643b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j3.y0 f32644c;

    public /* synthetic */ s(j3.y0 y0Var) {
        this.f32644c = y0Var;
    }

    @Override // m3.k, yads.of1
    public final void invoke(Object obj) {
        switch (this.f32643b) {
            case 0:
                ((j3.h0) obj).onVideoSizeChanged(this.f32644c);
                break;
            default:
                t3.i iVar = (t3.i) obj;
                ad.m0 m0Var = iVar.f33454p;
                j3.y0 y0Var = this.f32644c;
                if (m0Var != null) {
                    j3.o oVar = (j3.o) m0Var.f840d;
                    if (oVar.f26343v == -1) {
                        j3.n nVarA = oVar.a();
                        nVarA.f26299t = y0Var.f26416a;
                        nVarA.f26300u = y0Var.f26417b;
                        iVar.f33454p = new ad.m0(new j3.o(nVarA), m0Var.f839c, (String) m0Var.f841e);
                    }
                }
                int i = y0Var.f26416a;
                break;
        }
    }

    public /* synthetic */ s(t3.a aVar, j3.y0 y0Var) {
        this.f32644c = y0Var;
    }
}
