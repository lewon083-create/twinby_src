package yads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class yg3 implements vo2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hk.j f45054a;

    public yg3(hk.l lVar) {
        this.f45054a = lVar;
    }

    @Override // yads.vo2
    public final void a(ee3 ee3Var) {
        ee3Var.a();
        if (this.f45054a.isActive()) {
            hk.j jVar = this.f45054a;
            ij.k kVar = ij.m.f21341c;
            jVar.resumeWith(new vg3(ee3Var));
        }
    }

    @Override // yads.vo2
    public final void onSuccess(Object obj) {
        List list = (List) obj;
        if (this.f45054a.isActive()) {
            hk.j jVar = this.f45054a;
            ij.k kVar = ij.m.f21341c;
            jVar.resumeWith(new wg3(list));
        }
    }
}
