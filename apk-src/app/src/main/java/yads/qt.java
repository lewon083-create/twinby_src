package yads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class qt implements u43 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f42382b;

    public qt(List list) {
        this.f42382b = list;
    }

    @Override // yads.u43
    public final int a() {
        return 1;
    }

    @Override // yads.u43
    public final List b(long j10) {
        return j10 >= 0 ? this.f42382b : Collections.EMPTY_LIST;
    }

    @Override // yads.u43
    public final int a(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    @Override // yads.u43
    public final long a(int i) {
        if (i == 0) {
            return 0L;
        }
        throw new IllegalArgumentException();
    }
}
