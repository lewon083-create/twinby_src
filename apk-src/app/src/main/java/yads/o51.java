package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class o51 extends f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r51 f41467d;

    public o51(int i, r51 r51Var) {
        super(r51Var.size(), i);
        this.f41467d = r51Var;
    }

    @Override // yads.f
    public final Object a(int i) {
        return this.f41467d.get(i);
    }
}
