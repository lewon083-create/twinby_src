package q0;

import android.view.Surface;
import g0.z0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements k0.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f31585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f31586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f31587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a0.j f31588e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a0.j f31589f;

    public /* synthetic */ k(m mVar, l lVar, int i, a0.j jVar, a0.j jVar2) {
        this.f31585b = mVar;
        this.f31586c = lVar;
        this.f31587d = i;
        this.f31588e = jVar;
        this.f31589f = jVar2;
    }

    @Override // k0.a
    public final ed.d apply(Object obj) {
        l lVar = this.f31586c;
        Surface surface = (Surface) obj;
        m mVar = this.f31585b;
        mVar.getClass();
        surface.getClass();
        try {
            lVar.d();
            n nVar = new n(surface, this.f31587d, mVar.f31600g.f19677a, this.f31588e, this.f31589f);
            nVar.f31617l.f26173c.a(new g(lVar, 1), hl.d.j());
            f2.g.h("Consumer can only be linked once.", lVar.f31593r == null);
            lVar.f31593r = nVar;
            return k0.j.e(nVar);
        } catch (z0 e3) {
            return new k0.l(1, e3);
        }
    }
}
