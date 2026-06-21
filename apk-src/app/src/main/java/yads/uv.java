package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class uv extends qx0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f43776d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f43777e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f43778f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f43779g;

    public uv(v63 v63Var, long j10, long j11) throws vv {
        super(v63Var);
        boolean z5 = false;
        if (v63Var.a() != 1) {
            throw new vv(0);
        }
        u63 u63VarA = v63Var.a(0, new u63());
        long jMax = Math.max(0L, j10);
        if (!u63VarA.f43589m && jMax != 0 && !u63VarA.i) {
            throw new vv(1);
        }
        long jMax2 = j11 == Long.MIN_VALUE ? u63VarA.f43591o : Math.max(0L, j11);
        long j12 = u63VarA.f43591o;
        if (j12 != -9223372036854775807L) {
            jMax2 = jMax2 > j12 ? j12 : jMax2;
            if (jMax > jMax2) {
                throw new vv(2);
            }
        }
        this.f43776d = jMax;
        this.f43777e = jMax2;
        this.f43778f = jMax2 != -9223372036854775807L ? jMax2 - jMax : -9223372036854775807L;
        if (u63VarA.f43586j && (jMax2 == -9223372036854775807L || (j12 != -9223372036854775807L && jMax2 == j12))) {
            z5 = true;
        }
        this.f43779g = z5;
    }

    @Override // yads.v63
    public final s63 a(int i, s63 s63Var, boolean z5) {
        this.f42417c.a(0, s63Var, z5);
        long j10 = s63Var.f42827f - this.f43776d;
        long j11 = this.f43778f;
        return s63Var.a(s63Var.f42823b, s63Var.f42824c, 0, j11 != -9223372036854775807L ? j11 - j10 : -9223372036854775807L, j10, e6.f38020h, false);
    }

    @Override // yads.qx0, yads.v63
    public final u63 a(int i, u63 u63Var, long j10) {
        this.f42417c.a(0, u63Var, 0L);
        long j11 = u63Var.f43594r;
        long j12 = this.f43776d;
        u63Var.f43594r = j11 + j12;
        u63Var.f43591o = this.f43778f;
        u63Var.f43586j = this.f43779g;
        long j13 = u63Var.f43590n;
        if (j13 != -9223372036854775807L) {
            long jMax = Math.max(j13, j12);
            u63Var.f43590n = jMax;
            long j14 = this.f43777e;
            if (j14 != -9223372036854775807L) {
                jMax = Math.min(jMax, j14);
            }
            u63Var.f43590n = jMax - this.f43776d;
        }
        long jB = lb3.b(this.f43776d);
        long j15 = u63Var.f43583f;
        if (j15 != -9223372036854775807L) {
            u63Var.f43583f = j15 + jB;
        }
        long j16 = u63Var.f43584g;
        if (j16 != -9223372036854775807L) {
            u63Var.f43584g = j16 + jB;
        }
        return u63Var;
    }
}
