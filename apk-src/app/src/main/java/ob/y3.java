package ob;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class y3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z3 f30556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f30557b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f30558c = a();

    public y3(z3 z3Var) {
        this.f30556a = z3Var;
    }

    public final long a() {
        z3 z3Var = this.f30556a;
        pa.c0.i(z3Var);
        long jLongValue = ((Long) d0.f30046v.a(null)).longValue();
        long jLongValue2 = ((Long) d0.f30048w.a(null)).longValue();
        for (int i = 1; i < this.f30557b; i++) {
            jLongValue += jLongValue;
            if (jLongValue >= jLongValue2) {
                break;
            }
        }
        z3Var.o().getClass();
        return Math.min(jLongValue, jLongValue2) + System.currentTimeMillis();
    }
}
