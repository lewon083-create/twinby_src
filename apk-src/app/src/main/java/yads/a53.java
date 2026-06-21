package yads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a53 extends ua0 implements u43 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public u43 f36636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f36637e;

    @Override // yads.u43
    public final long a(int i) {
        u43 u43Var = this.f36636d;
        u43Var.getClass();
        return u43Var.a(i) + this.f36637e;
    }

    @Override // yads.u43
    public final List b(long j10) {
        u43 u43Var = this.f36636d;
        u43Var.getClass();
        return u43Var.b(j10 - this.f36637e);
    }

    @Override // yads.u43
    public final int a() {
        u43 u43Var = this.f36636d;
        u43Var.getClass();
        return u43Var.a();
    }

    @Override // yads.u43
    public final int a(long j10) {
        u43 u43Var = this.f36636d;
        u43Var.getClass();
        return u43Var.a(j10 - this.f36637e);
    }
}
