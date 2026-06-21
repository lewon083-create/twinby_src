package yads;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class vb implements nk3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n12 f43980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gv f43981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kf1 f43982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kl3 f43983d;

    public vb(n12 n12Var, gv gvVar, kf1 kf1Var, kl3 kl3Var) {
        this.f43980a = n12Var;
        this.f43981b = gvVar;
        this.f43982c = kf1Var;
        this.f43983d = kl3Var;
    }

    @Override // yads.nk3
    public final void a(oi oiVar, fv fvVar) {
        kf1 kf1Var = oiVar.f41543d;
        if (kf1Var == null) {
            kf1Var = this.f43982c;
        }
        gv gvVar = this.f43981b;
        n12 n12Var = this.f43980a;
        gvVar.getClass();
        if (!oiVar.f41544e || kf1Var == null) {
            return;
        }
        fvVar.a(kf1Var, new hv(oiVar, gvVar.f38885a, n12Var, gvVar.f38886b, gvVar.f38887c));
    }

    @Override // yads.nk3
    public final void a(View view, oi oiVar) {
        if (view.getTag() == null) {
            kl3 kl3Var = this.f43983d;
            String str = oiVar.f41540a;
            kl3Var.getClass();
            view.setTag(kl3.a(str));
        }
    }
}
