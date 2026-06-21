package vi;

import hi.g;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class e implements yc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f34868a;

    public e(g gVar) {
        this.f34868a = gVar;
    }

    @Override // yc.a
    public final void a(yc.e eVar) {
        g gVar = this.f34868a;
        if (eVar != null) {
            gVar.b(Integer.toString(eVar.f45612a), eVar.f45613b, null);
        } else {
            gVar.success(null);
        }
    }
}
