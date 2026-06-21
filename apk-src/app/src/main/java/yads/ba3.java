package yads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ba3 implements u43 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ba3 f36978c = new ba3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f36979b;

    public ba3() {
        this.f36979b = Collections.EMPTY_LIST;
    }

    @Override // yads.u43
    public final int a() {
        return 1;
    }

    @Override // yads.u43
    public final List b(long j10) {
        return j10 >= 0 ? this.f36979b : Collections.EMPTY_LIST;
    }

    @Override // yads.u43
    public final int a(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    public ba3(o20 o20Var) {
        this.f36979b = Collections.singletonList(o20Var);
    }

    @Override // yads.u43
    public final long a(int i) {
        if (i == 0) {
            return 0L;
        }
        throw new IllegalArgumentException();
    }
}
