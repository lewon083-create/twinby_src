package yads;

import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class mc1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hk.a0 f40859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jz0 f40860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e53 f40861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final iz0 f40862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final gz0 f40863e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ez0 f40864f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final lz0 f40865g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x70 f40866h;
    public final qb i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final nb f40867j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final kb f40868k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final nr1 f40869l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final kk.p f40870m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final kk.r f40871n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final jk.g f40872o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final kk.e f40873p;

    public mc1(jz0 jz0Var, e53 e53Var, iz0 iz0Var, gz0 gz0Var, ez0 ez0Var, lz0 lz0Var, x70 x70Var, qb qbVar, nb nbVar, kb kbVar, nr1 nr1Var) {
        x10 x10Var = new x10();
        hk.s1 s1Var = new hk.s1();
        ok.e eVar = hk.k0.f20682a;
        this.f40859a = hk.c0.a(kotlin.coroutines.e.d(s1Var, mk.n.f28934a.f21368f).plus(x10Var));
        this.f40860b = jz0Var;
        this.f40861c = e53Var;
        this.f40862d = iz0Var;
        this.f40863e = gz0Var;
        this.f40864f = ez0Var;
        this.f40865g = lz0Var;
        this.f40866h = x70Var;
        this.i = qbVar;
        this.f40867j = nbVar;
        this.f40868k = kbVar;
        this.f40869l = nr1Var;
        kk.t tVar = new kk.t(new p90(null, q70.f42202b, false, kotlin.collections.b0.f27475b));
        this.f40870m = tVar;
        this.f40871n = new kk.q(tVar);
        jk.c cVarA = jk.j.a(0, null, 7);
        this.f40872o = cVarA;
        this.f40873p = new kk.d(cVarA, kotlin.coroutines.g.f27499b, -3, jk.a.f26675b);
    }

    public final void a(g90 g90Var) {
        kk.t tVar;
        Object objF;
        kk.t tVar2;
        Object objF2;
        kk.t tVar3;
        Object objF3;
        kk.t tVar4;
        Object objF4;
        if (g90Var instanceof y80) {
            hk.c0.m(this.f40859a, null, new lc1(this, false, null), 3);
            return;
        }
        if (g90Var instanceof e90) {
            hk.c0.m(this.f40859a, null, new jc1(this, null), 3);
            return;
        }
        if (g90Var instanceof c90) {
            e53 e53Var = this.f40861c;
            boolean z5 = !e53Var.f38019a.f42211a.a().f36958e.f43595a;
            gw2 gw2Var = e53Var.f38019a.f42211a.f42600e.f44589a;
            gw2Var.getClass();
            synchronized (gw2.f38918j) {
                gw2Var.f38923d = z5;
                gw2Var.f38924e = z5;
                gw2Var.f38925f = z5;
                Unit unit = Unit.f27471a;
            }
            hk.c0.m(this.f40859a, null, new lc1(this, false, null), 3);
            return;
        }
        if (g90Var instanceof b90) {
            p90 p90Var = ((p90) ((kk.t) this.f40870m).F()).f41842a;
            if (p90Var == null) {
                hk.c0.m(this.f40859a, null, new ic1(this, h90.f39102a, null), 3);
                return;
            }
            p90 p90VarA = p90.a(p90Var, null, null, false, null, 11);
            kk.p pVar = this.f40870m;
            do {
                tVar4 = (kk.t) pVar;
                objF4 = tVar4.F();
            } while (!tVar4.E(objF4, p90VarA));
            return;
        }
        if (g90Var instanceof a90) {
            p70 p70Var = p70.f41831b;
            p90 p90Var2 = (p90) ((kk.t) this.f40870m).F();
            p90 p90VarA2 = p90.a(p90Var2, p90Var2, p70Var, false, null, 12);
            kk.p pVar2 = this.f40870m;
            do {
                tVar3 = (kk.t) pVar2;
                objF3 = tVar3.F();
            } while (!tVar3.E(objF3, p90VarA2));
            hk.c0.m(this.f40859a, null, new lc1(this, false, null), 3);
            return;
        }
        if (g90Var instanceof z80) {
            n70 n70Var = new n70(((z80) g90Var).f45275a);
            p90 p90Var3 = (p90) ((kk.t) this.f40870m).F();
            p90 p90VarA3 = p90.a(p90Var3, p90Var3, n70Var, false, null, 12);
            kk.p pVar3 = this.f40870m;
            do {
                tVar2 = (kk.t) pVar3;
                objF2 = tVar2.F();
            } while (!tVar2.E(objF2, p90VarA3));
            hk.c0.m(this.f40859a, null, new lc1(this, false, null), 3);
            return;
        }
        if (!(g90Var instanceof d90)) {
            if (g90Var instanceof f90) {
                hk.c0.m(this.f40859a, null, new kc1(this, ((f90) g90Var).f38404a, null), 3);
                return;
            }
            return;
        }
        s70 s70Var = ((p90) ((kk.t) this.f40870m).F()).f41843b;
        y90 y90Var = ((d90) g90Var).f37671a;
        s70 o70Var = s70Var instanceof n70 ? new o70(y90Var) : new r70(y90Var.f44955a);
        p90 p90Var4 = (p90) ((kk.t) this.f40870m).F();
        p90 p90VarA4 = p90.a(p90Var4, p90Var4, o70Var, false, null, 12);
        kk.p pVar4 = this.f40870m;
        do {
            tVar = (kk.t) pVar4;
            objF = tVar.F();
        } while (!tVar.E(objF, p90VarA4));
        hk.c0.m(this.f40859a, null, new lc1(this, false, null), 3);
    }
}
