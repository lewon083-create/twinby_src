package hk;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class u0 extends x {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f20715g = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f20716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f20717e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public kotlin.collections.l f20718f;

    public final void I(boolean z5) {
        this.f20716d = (z5 ? 4294967296L : 1L) + this.f20716d;
        if (z5) {
            return;
        }
        this.f20717e = true;
    }

    public abstract long J();

    public final boolean K() {
        kotlin.collections.l lVar = this.f20718f;
        if (lVar == null) {
            return false;
        }
        j0 j0Var = (j0) (lVar.isEmpty() ? null : lVar.removeFirst());
        if (j0Var == null) {
            return false;
        }
        j0Var.run();
        return true;
    }

    public void L(long j10, r0 r0Var) {
        d0.f20652k.Q(j10, r0Var);
    }

    public final void m(boolean z5) {
        long j10 = this.f20716d - (z5 ? 4294967296L : 1L);
        this.f20716d = j10;
        if (j10 <= 0 && this.f20717e) {
            shutdown();
        }
    }

    public abstract Thread s();

    public abstract void shutdown();
}
