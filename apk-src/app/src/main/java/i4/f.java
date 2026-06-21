package i4;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f20884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f20885d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f20886e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f20887f;

    public f(j3.o0 o0Var, long j10, long j11) throws g {
        super(o0Var);
        if (j11 != Long.MIN_VALUE && j11 < j10) {
            throw new g(2, j10, j11);
        }
        boolean z5 = false;
        if (o0Var.h() != 1) {
            throw new g(0);
        }
        j3.n0 n0VarM = o0Var.m(0, new j3.n0(), 0L);
        long jMax = Math.max(0L, j10);
        if (!n0VarM.f26317k && jMax != 0 && !n0VarM.f26315h) {
            throw new g(1);
        }
        long jMax2 = j11 == Long.MIN_VALUE ? n0VarM.f26319m : Math.max(0L, j11);
        long j12 = n0VarM.f26319m;
        if (j12 != -9223372036854775807L) {
            jMax2 = jMax2 > j12 ? j12 : jMax2;
            if (jMax > jMax2) {
                jMax = jMax2;
            }
        }
        this.f20884c = jMax;
        this.f20885d = jMax2;
        this.f20886e = jMax2 != -9223372036854775807L ? jMax2 - jMax : -9223372036854775807L;
        if (n0VarM.i && (jMax2 == -9223372036854775807L || (j12 != -9223372036854775807L && jMax2 == j12))) {
            z5 = true;
        }
        this.f20887f = z5;
    }

    @Override // i4.s, j3.o0
    public final j3.m0 f(int i, j3.m0 m0Var, boolean z5) {
        this.f20995b.f(0, m0Var, z5);
        long j10 = m0Var.f26278e - this.f20884c;
        long j11 = this.f20886e;
        m0Var.h(m0Var.f26274a, m0Var.f26275b, 0, j11 != -9223372036854775807L ? j11 - j10 : -9223372036854775807L, j10, j3.c.f26218c, false);
        return m0Var;
    }

    @Override // i4.s, j3.o0
    public final j3.n0 m(int i, j3.n0 n0Var, long j10) {
        this.f20995b.m(0, n0Var, 0L);
        long j11 = n0Var.f26322p;
        long j12 = this.f20884c;
        n0Var.f26322p = j11 + j12;
        n0Var.f26319m = this.f20886e;
        n0Var.i = this.f20887f;
        long j13 = n0Var.f26318l;
        if (j13 != -9223372036854775807L) {
            long jMax = Math.max(j13, j12);
            n0Var.f26318l = jMax;
            long j14 = this.f20885d;
            if (j14 != -9223372036854775807L) {
                jMax = Math.min(jMax, j14);
            }
            n0Var.f26318l = jMax - j12;
        }
        long jZ = m3.z.Z(j12);
        long j15 = n0Var.f26312e;
        if (j15 != -9223372036854775807L) {
            n0Var.f26312e = j15 + jZ;
        }
        long j16 = n0Var.f26313f;
        if (j16 != -9223372036854775807L) {
            n0Var.f26313f = j16 + jZ;
        }
        return n0Var;
    }
}
