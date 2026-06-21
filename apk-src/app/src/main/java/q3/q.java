package q3;

import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f31678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TreeSet f31679b = new TreeSet(new p());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f31680c;

    public q(long j10) {
        this.f31678a = j10;
    }

    public final void a(b bVar, long j10) {
        while (this.f31680c + j10 > this.f31678a && !this.f31679b.isEmpty()) {
            i iVar = (i) this.f31679b.first();
            s sVar = (s) bVar;
            synchronized (sVar) {
                sVar.k(iVar);
            }
        }
    }

    public final void b(s sVar, t tVar) {
        this.f31679b.add(tVar);
        this.f31680c += tVar.f31659d;
        a(sVar, 0L);
    }
}
