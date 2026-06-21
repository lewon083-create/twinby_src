package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class rn2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h72 f42642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wn2 f42643c;

    public rn2(h72 h72Var, wn2 wn2Var) {
        this.f42642b = h72Var;
        this.f42643c = wn2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f42642b.f39051b.setVisibility(4);
        this.f42643c.f44433a.setVisibility(0);
    }
}
