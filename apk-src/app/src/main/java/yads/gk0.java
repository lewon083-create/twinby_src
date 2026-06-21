package yads;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class gk0 extends ro2 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Object f38782v = new Object();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final fk0 f38783s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Function1 f38784t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final v41 f38785u;

    public gk0(String str, fk0 fk0Var, dk0 dk0Var, vp2 vp2Var) {
        super(0, str, vp2Var);
        this.f38783s = fk0Var;
        this.f38784t = dk0Var;
        this.f38785u = new v41();
        a(new qe0(2.0f, 1000, 2));
        k();
    }

    @Override // yads.ro2
    public final void a(Object obj) {
        this.f38784t.invoke((hk0) obj);
    }

    @Override // yads.ro2
    public final xp2 a(h82 h82Var) {
        xp2 xp2Var;
        synchronized (f38782v) {
            try {
                v41 v41Var = this.f38785u;
                byte[] bArr = h82Var.f39070b;
                v41Var.getClass();
                xp2Var = new xp2(new hk0(this.f38783s.a(h82Var.f39070b), v41.a(bArr)), w11.a(h82Var));
            } catch (Exception e3) {
                xp2Var = new xp2(new ob2(e3));
            } catch (OutOfMemoryError e7) {
                int length = h82Var.f39070b.length;
                boolean z5 = om3.f41652a;
                xp2Var = new xp2(new ob2(e7));
            }
        }
        return xp2Var;
    }
}
