package g4;

import ob.r;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends j4.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f19959e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f19960f;

    public a(h4.b bVar, int i) {
        super(i, bVar.f20389k - 1);
        this.f19960f = bVar;
    }

    @Override // j4.n
    public final long b() {
        switch (this.f19959e) {
            case 0:
                a();
                h4.b bVar = (h4.b) this.f19960f;
                return bVar.f20393o[(int) this.f26450d];
            default:
                a();
                return ((r) this.f19960f).e(this.f26450d);
        }
    }

    @Override // j4.n
    public final long i() {
        switch (this.f19959e) {
            case 0:
                return ((h4.b) this.f19960f).b((int) this.f26450d) + b();
            default:
                a();
                return ((r) this.f19960f).d(this.f26450d);
        }
    }

    public a(r rVar, long j10, long j11) {
        super(j10, j11);
        this.f19960f = rVar;
    }
}
