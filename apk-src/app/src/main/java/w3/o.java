package w3;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends n {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f35086j;

    public o(j jVar, long j10, long j11, long j12, long j13, List list, long j14, List list2, long j15, long j16) {
        super(jVar, j10, j11, j12, j13, list, j14, j15, j16);
        this.f35086j = list2;
    }

    @Override // w3.n
    public final long d(long j10) {
        return this.f35086j.size();
    }

    @Override // w3.n
    public final j h(k kVar, long j10) {
        return (j) this.f35086j.get((int) (j10 - this.f35081d));
    }

    @Override // w3.n
    public final boolean i() {
        return true;
    }
}
