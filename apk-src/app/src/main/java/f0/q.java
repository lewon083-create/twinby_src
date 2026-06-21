package f0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f16542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f16543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j1.k f16544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j1.k f16545d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j1.h f16546e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public j1.h f16547f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f16548g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f16549h = false;
    public k0.b i;

    public q(f fVar, s sVar) {
        this.f16542a = fVar;
        this.f16543b = sVar;
        final int i = 0;
        this.f16544c = i0.o.w(new j1.i(this) { // from class: f0.p

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ q f16541c;

            {
                this.f16541c = this;
            }

            @Override // j1.i
            public final Object m(j1.h hVar) {
                switch (i) {
                    case 0:
                        this.f16541c.f16546e = hVar;
                        return "CaptureCompleteFuture";
                    default:
                        this.f16541c.f16547f = hVar;
                        return "RequestCompleteFuture";
                }
            }
        });
        final int i10 = 1;
        this.f16545d = i0.o.w(new j1.i(this) { // from class: f0.p

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ q f16541c;

            {
                this.f16541c = this;
            }

            @Override // j1.i
            public final Object m(j1.h hVar) {
                switch (i10) {
                    case 0:
                        this.f16541c.f16546e = hVar;
                        return "CaptureCompleteFuture";
                    default:
                        this.f16541c.f16547f = hVar;
                        return "RequestCompleteFuture";
                }
            }
        });
    }

    public final void a() {
        f fVar = this.f16542a;
        boolean z5 = fVar.f16504k;
        if (!z5 || fVar.a()) {
            if (!z5) {
                f2.g.h("The callback can only complete once.", !this.f16545d.f26173c.isDone());
            }
            this.f16547f.b(null);
        }
    }
}
