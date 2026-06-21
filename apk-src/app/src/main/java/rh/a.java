package rh;

import ei.b;
import ii.q;
import ob.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class a implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q f32320b;

    @Override // ei.b
    public final void onAttachedToEngine(ei.a aVar) {
        q qVar = new q(aVar.f16383c, "sqlite3_flutter_libs");
        this.f32320b = qVar;
        qVar.b(new z(26));
    }

    @Override // ei.b
    public final void onDetachedFromEngine(ei.a aVar) {
        q qVar = this.f32320b;
        if (qVar != null) {
            qVar.b(null);
            this.f32320b = null;
        }
    }
}
