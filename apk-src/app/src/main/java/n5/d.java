package n5;

import java.util.List;
import ni.x0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends r3.f implements e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f29109f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f29110g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f29111h = 1;
    public Object i;

    public /* synthetic */ d() {
        super(3);
    }

    @Override // n5.e
    public final int d(long j10) {
        e eVar = this.f29109f;
        eVar.getClass();
        return eVar.d(j10 - this.f29110g);
    }

    @Override // n5.e
    public final long f(int i) {
        e eVar = this.f29109f;
        eVar.getClass();
        return eVar.f(i) + this.f29110g;
    }

    @Override // n5.e
    public final List h(long j10) {
        e eVar = this.f29109f;
        eVar.getClass();
        return eVar.h(j10 - this.f29110g);
    }

    @Override // n5.e
    public final int l() {
        e eVar = this.f29109f;
        eVar.getClass();
        return eVar.l();
    }

    @Override // r3.f
    public final void r() {
        this.f7316c = 0;
        this.f32196d = 0L;
        this.f32197e = false;
        this.f29109f = null;
    }

    @Override // r3.f
    public final void s() {
        switch (this.f29111h) {
            case 0:
                ((k4.b) this.i).m(this);
                break;
            default:
                o5.h hVar = (o5.h) ((x0) this.i).f29501c;
                hVar.getClass();
                r();
                hVar.f29772b.add(this);
                break;
        }
    }

    public d(k4.b bVar) {
        super(3);
        this.i = bVar;
    }
}
