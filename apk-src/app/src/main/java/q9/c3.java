package q9;

import com.google.android.gms.internal.ads.cq;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c3 extends a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k9.v f31796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cq f31797c;

    public c3(k9.v vVar, cq cqVar) {
        this.f31796b = vVar;
        this.f31797c = cqVar;
    }

    @Override // q9.b0
    public final void p0(x1 x1Var) {
        k9.v vVar = this.f31796b;
        if (vVar != null) {
            vVar.d(x1Var.e());
        }
    }

    @Override // q9.b0
    public final void z() {
        cq cqVar;
        k9.v vVar = this.f31796b;
        if (vVar == null || (cqVar = this.f31797c) == null) {
            return;
        }
        vVar.i(cqVar);
    }
}
