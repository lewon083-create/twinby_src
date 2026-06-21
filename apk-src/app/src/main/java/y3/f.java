package y3;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends j4.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f36316e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f36317f;

    public f(long j10, List list) {
        super(0L, list.size() - 1);
        this.f36317f = j10;
        this.f36316e = list;
    }

    @Override // j4.n
    public final long b() {
        a();
        return this.f36317f + ((z3.j) this.f36316e.get((int) this.f26450d)).f46092f;
    }

    @Override // j4.n
    public final long i() {
        a();
        z3.j jVar = (z3.j) this.f36316e.get((int) this.f26450d);
        return this.f36317f + jVar.f46092f + jVar.f46090d;
    }
}
