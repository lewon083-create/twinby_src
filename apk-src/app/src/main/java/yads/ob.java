package yads;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ob implements nk3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n12 f41503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gv f41504b;

    public ob(n12 n12Var, gv gvVar) {
        this.f41503a = n12Var;
        this.f41504b = gvVar;
    }

    @Override // yads.nk3
    public final void a(View view, oi oiVar) {
    }

    @Override // yads.nk3
    public final void a(oi oiVar, fv fvVar) {
        kf1 kf1Var = oiVar.f41543d;
        gv gvVar = this.f41504b;
        n12 n12Var = this.f41503a;
        gvVar.getClass();
        if (!oiVar.f41544e || kf1Var == null) {
            return;
        }
        fvVar.a(kf1Var, new hv(oiVar, gvVar.f38885a, n12Var, gvVar.f38886b, gvVar.f38887c));
    }
}
