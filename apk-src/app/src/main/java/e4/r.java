package e4;

import i4.a1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f16174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m4.n f16175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a1 f16176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f16177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f16178e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s f16179f;

    public r(s sVar, w wVar, int i, c cVar) {
        this.f16179f = sVar;
        this.f16175b = new m4.n(l7.o.i(i, "ExoPlayer:RtspMediaPeriod:RtspLoaderWrapper "));
        a1 a1Var = new a1(sVar.f16180b, null, null);
        this.f16176c = a1Var;
        this.f16174a = new q(sVar, wVar, i, a1Var, cVar);
        a1Var.f20838f = sVar.f16182d;
    }

    public final void a() {
        if (this.f16177d) {
            return;
        }
        this.f16174a.f16171b.f16072k = true;
        this.f16177d = true;
        s.a(this.f16179f);
    }
}
