package wi;

import android.content.Context;
import m.h3;
import t9.h0;
import z2.w;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class c implements ei.b, fi.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f35258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ii.f f35259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public fi.b f35260d;

    @Override // fi.a
    public final void onAttachedToActivity(fi.b bVar) {
        this.f35260d = bVar;
        h3 h3Var = (h3) bVar;
        h3Var.a(this.f35258b);
        this.f35258b.f35254c = (w) h3Var.f28250b;
    }

    @Override // ei.b
    public final void onAttachedToEngine(ei.a aVar) {
        ii.f fVar = aVar.f16383c;
        Context context = aVar.f16381a;
        h0 h0Var = new h0();
        this.f35259c = fVar;
        b bVar = new b(context, h0Var);
        this.f35258b = bVar;
        b.i(fVar, bVar);
    }

    @Override // fi.a
    public final void onDetachedFromActivity() {
        ((h3) this.f35260d).g(this.f35258b);
        this.f35258b.f35254c = null;
        this.f35260d = null;
    }

    @Override // fi.a
    public final void onDetachedFromActivityForConfigChanges() {
        ((h3) this.f35260d).g(this.f35258b);
        this.f35258b.f35254c = null;
        this.f35260d = null;
    }

    @Override // ei.b
    public final void onDetachedFromEngine(ei.a aVar) {
        this.f35258b = null;
        ii.f fVar = this.f35259c;
        if (fVar != null) {
            b.i(fVar, null);
            this.f35259c = null;
        }
    }

    @Override // fi.a
    public final void onReattachedToActivityForConfigChanges(fi.b bVar) {
        this.f35260d = bVar;
        h3 h3Var = (h3) bVar;
        h3Var.a(this.f35258b);
        this.f35258b.f35254c = (w) h3Var.f28250b;
    }
}
