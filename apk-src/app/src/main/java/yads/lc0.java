package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class lc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fu f40480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final no2 f40481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uo f40482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i30 f40483d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f40484e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f40485f;

    public lc0(long j10, no2 no2Var, uo uoVar, fu fuVar, long j11, i30 i30Var) {
        this.f40484e = j10;
        this.f40481b = no2Var;
        this.f40482c = uoVar;
        this.f40485f = j11;
        this.f40480a = fuVar;
        this.f40483d = i30Var;
    }

    public final lc0 a(long j10, no2 no2Var) throws zo {
        long jA;
        long jA2;
        i30 i30VarD = this.f40481b.d();
        i30 i30VarD2 = no2Var.d();
        if (i30VarD == null) {
            return new lc0(j10, no2Var, this.f40482c, this.f40480a, this.f40485f, i30VarD);
        }
        if (!i30VarD.a()) {
            return new lc0(j10, no2Var, this.f40482c, this.f40480a, this.f40485f, i30VarD2);
        }
        long jC = i30VarD.c(j10);
        if (jC == 0) {
            return new lc0(j10, no2Var, this.f40482c, this.f40480a, this.f40485f, i30VarD2);
        }
        long jB = i30VarD.b();
        long jA3 = i30VarD.a(jB);
        long j11 = jC + jB;
        long j12 = j11 - 1;
        long jB2 = i30VarD.b(j12, j10) + i30VarD.a(j12);
        long jB3 = i30VarD2.b();
        long jA4 = i30VarD2.a(jB3);
        long j13 = this.f40485f;
        if (jB2 == jA4) {
            jA = j11 - jB3;
        } else {
            if (jB2 < jA4) {
                throw new zo();
            }
            if (jA4 < jA3) {
                jA2 = j13 - (i30VarD2.a(jA3, j10) - jB);
                return new lc0(j10, no2Var, this.f40482c, this.f40480a, jA2, i30VarD2);
            }
            jA = i30VarD.a(jA4, j10) - jB3;
        }
        jA2 = jA + j13;
        return new lc0(j10, no2Var, this.f40482c, this.f40480a, jA2, i30VarD2);
    }

    public final long a(long j10) {
        return this.f40483d.b(j10 - this.f40485f, this.f40484e) + this.f40483d.a(j10 - this.f40485f);
    }
}
