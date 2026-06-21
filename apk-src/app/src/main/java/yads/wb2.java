package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class wb2 implements uw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public nx0 f44330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b73 f44331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p73 f44332c;

    public wb2(String str) {
        this.f44330a = new mx0().d(str).a();
    }

    @Override // yads.uw2
    public final void a(lb2 lb2Var) {
        long jA;
        b73 b73Var = this.f44331b;
        if (b73Var == null) {
            throw new IllegalStateException();
        }
        int i = lb3.f40466a;
        synchronized (b73Var) {
            try {
                long j10 = b73Var.f36952c;
                jA = j10 != -9223372036854775807L ? j10 + b73Var.f36951b : b73Var.a();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        long jB = this.f44331b.b();
        if (jA == -9223372036854775807L || jB == -9223372036854775807L) {
            return;
        }
        nx0 nx0Var = this.f44330a;
        if (jB != nx0Var.f41379q) {
            mx0 mx0Var = new mx0(nx0Var);
            mx0Var.f41079o = jB;
            nx0 nx0Var2 = new nx0(mx0Var);
            this.f44330a = nx0Var2;
            this.f44332c.a(nx0Var2);
        }
        int i10 = lb2Var.f40465c - lb2Var.f40464b;
        this.f44332c.a(i10, lb2Var);
        this.f44332c.a(jA, 1, i10, 0, null);
    }

    @Override // yads.uw2
    public final void a(b73 b73Var, qq0 qq0Var, o93 o93Var) {
        this.f44331b = b73Var;
        o93Var.a();
        o93Var.b();
        p73 p73VarA = qq0Var.a(o93Var.f41501d, 5);
        this.f44332c = p73VarA;
        p73VarA.a(this.f44330a);
    }
}
