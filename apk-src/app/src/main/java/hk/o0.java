package hk;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class o0 implements y0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f20697b;

    public o0(boolean z5) {
        this.f20697b = z5;
    }

    @Override // hk.y0
    public final m1 c() {
        return null;
    }

    @Override // hk.y0
    public final boolean isActive() {
        return this.f20697b;
    }

    public final String toString() {
        return a0.u.n(new StringBuilder("Empty{"), this.f20697b ? "Active" : "New", '}');
    }
}
