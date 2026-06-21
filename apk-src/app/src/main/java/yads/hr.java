package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class hr extends ro2 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final wp2 f39294s;

    public hr(String str, kw0 kw0Var, lw0 lw0Var) {
        super(0, str, lw0Var);
        this.f39294s = kw0Var;
    }

    @Override // yads.ro2
    public final void a(Object obj) {
        this.f39294s.a((byte[]) obj);
    }

    @Override // yads.ro2
    public final xp2 a(h82 h82Var) {
        try {
            return new xp2(h82Var.f39070b, w11.a(h82Var));
        } catch (Exception e3) {
            return new xp2(new lm3(e3));
        }
    }
}
