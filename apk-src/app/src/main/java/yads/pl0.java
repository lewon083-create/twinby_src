package yads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class pl0 implements u43 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f41947b;

    public pl0(List list) {
        this.f41947b = list;
    }

    @Override // yads.u43
    public final int a() {
        return 1;
    }

    @Override // yads.u43
    public final List b(long j10) {
        return this.f41947b;
    }

    @Override // yads.u43
    public final int a(long j10) {
        return -1;
    }

    @Override // yads.u43
    public final long a(int i) {
        return 0L;
    }
}
