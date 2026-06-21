package yi;

import m.h3;
import t.t0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class a implements ei.b, fi.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g0 f45626b;

    @Override // fi.a
    public final void onAttachedToActivity(fi.b bVar) {
        h3 h3Var = (h3) bVar;
        ((z2.w) h3Var.f28250b).getIntent().putExtra("PROXY_PACKAGE", "io.flutter.plugins.inapppurchase");
        this.f45626b.f45662d = (z2.w) h3Var.f28250b;
    }

    @Override // ei.b
    public final void onAttachedToEngine(ei.a aVar) {
        ii.f fVar = aVar.f16383c;
        g0 g0Var = new g0(aVar.f16381a, new m4.d(fVar), new t0(10));
        this.f45626b = g0Var;
        g0.d(fVar, g0Var);
    }

    @Override // fi.a
    public final void onDetachedFromActivity() {
        g0 g0Var = this.f45626b;
        g0Var.f45662d = null;
        d8.e eVar = g0Var.f45660b;
        if (eVar != null) {
            eVar.a();
            g0Var.f45660b = null;
        }
    }

    @Override // fi.a
    public final void onDetachedFromActivityForConfigChanges() {
        this.f45626b.f45662d = null;
    }

    @Override // ei.b
    public final void onDetachedFromEngine(ei.a aVar) {
        g0.d(aVar.f16383c, null);
        this.f45626b = null;
    }

    @Override // fi.a
    public final void onReattachedToActivityForConfigChanges(fi.b bVar) {
        onAttachedToActivity(bVar);
    }
}
