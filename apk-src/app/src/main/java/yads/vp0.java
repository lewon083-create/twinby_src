package yads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class vp0 implements u43 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f44106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r51 f44107c;

    public vp0(long j10, um2 um2Var) {
        this.f44106b = j10;
        this.f44107c = um2Var;
    }

    @Override // yads.u43
    public final int a() {
        return 1;
    }

    @Override // yads.u43
    public final List b(long j10) {
        if (j10 >= this.f44106b) {
            return this.f44107c;
        }
        o51 o51Var = r51.f42498c;
        return um2.f43723f;
    }

    @Override // yads.u43
    public final long a(int i) {
        if (i == 0) {
            return this.f44106b;
        }
        throw new IllegalArgumentException();
    }

    @Override // yads.u43
    public final int a(long j10) {
        return this.f44106b > j10 ? 0 : -1;
    }
}
