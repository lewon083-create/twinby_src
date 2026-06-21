package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class wi1 extends v63 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hm1 f44412c;

    public wi1(hm1 hm1Var) {
        this.f44412c = hm1Var;
    }

    @Override // yads.v63
    public final int a() {
        return 1;
    }

    @Override // yads.v63
    public final int b() {
        return 1;
    }

    @Override // yads.v63
    public final int a(Object obj) {
        return obj == vi1.f44057f ? 0 : -1;
    }

    @Override // yads.v63
    public final s63 a(int i, s63 s63Var, boolean z5) {
        s63Var.a(z5 ? 0 : null, z5 ? vi1.f44057f : null, 0, -9223372036854775807L, 0L, e6.f38020h, true);
        return s63Var;
    }

    @Override // yads.v63
    public final u63 a(int i, u63 u63Var, long j10) {
        u63Var.a(u63.f43575s, this.f44412c, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
        u63Var.f43589m = true;
        return u63Var;
    }

    @Override // yads.v63
    public final Object a(int i) {
        return vi1.f44057f;
    }
}
