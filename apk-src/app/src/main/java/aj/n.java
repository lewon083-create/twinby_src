package aj;

import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class n implements kk.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kk.e f988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t2.e f989d;

    public /* synthetic */ n(kk.e eVar, t2.e eVar2, int i) {
        this.f987b = i;
        this.f988c = eVar;
        this.f989d = eVar2;
    }

    @Override // kk.e
    public final Object p(kk.f fVar, mj.a aVar) {
        switch (this.f987b) {
            case 0:
                Object objP = this.f988c.p(new m(fVar, this.f989d, 0), aVar);
                if (objP != nj.a.f29512b) {
                    break;
                }
                break;
            case 1:
                Object objP2 = this.f988c.p(new m(fVar, this.f989d, 1), aVar);
                if (objP2 != nj.a.f29512b) {
                    break;
                }
                break;
            case 2:
                Object objP3 = this.f988c.p(new m(fVar, this.f989d, 2), aVar);
                if (objP3 != nj.a.f29512b) {
                    break;
                }
                break;
            default:
                Object objP4 = this.f988c.p(new m(fVar, this.f989d, 3), aVar);
                if (objP4 != nj.a.f29512b) {
                    break;
                }
                break;
        }
        return Unit.f27471a;
    }
}
