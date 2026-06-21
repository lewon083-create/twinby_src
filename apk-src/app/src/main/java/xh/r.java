package xh;

import io.appmetrica.analytics.impl.lp;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class r implements io.flutter.embedding.engine.renderer.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.flutter.embedding.engine.renderer.j f36165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lp f36166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f36167c;

    public r(s sVar, io.flutter.embedding.engine.renderer.j jVar, lp lpVar) {
        this.f36167c = sVar;
        this.f36165a = jVar;
        this.f36166b = lpVar;
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void b() {
        m mVar;
        this.f36165a.g(this);
        this.f36166b.run();
        s sVar = this.f36167c;
        if ((sVar.f36173g instanceof m) || (mVar = sVar.f36172f) == null) {
            return;
        }
        mVar.b();
        m mVar2 = sVar.f36172f;
        if (mVar2 != null) {
            mVar2.f36146b.close();
            sVar.removeView(sVar.f36172f);
            sVar.f36172f = null;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void a() {
    }
}
