package yads;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class py implements en1, qk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f42107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public dn1 f42108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public pk0 f42109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry f42110d;

    public py(ry ryVar, Object obj) {
        this.f42110d = ryVar;
        this.f42108b = ryVar.b((an1) null);
        this.f42109c = ryVar.a((an1) null);
        this.f42107a = obj;
    }

    public final jm1 a(jm1 jm1Var) {
        ry ryVar = this.f42110d;
        long j10 = jm1Var.f39912f;
        ryVar.getClass();
        ry ryVar2 = this.f42110d;
        long j11 = jm1Var.f39913g;
        ryVar2.getClass();
        return (j10 == jm1Var.f39912f && j11 == jm1Var.f39913g) ? jm1Var : new jm1(jm1Var.f39907a, jm1Var.f39908b, jm1Var.f39909c, jm1Var.f39910d, jm1Var.f39911e, j10, j11);
    }

    @Override // yads.en1
    public final void b(int i, an1 an1Var, jm1 jm1Var) {
        if (e(i, an1Var)) {
            this.f42108b.a(a(jm1Var));
        }
    }

    @Override // yads.qk0
    public final void c(int i, an1 an1Var) {
        if (e(i, an1Var)) {
            this.f42109c.c();
        }
    }

    @Override // yads.qk0
    public final void d(int i, an1 an1Var) {
        if (e(i, an1Var)) {
            this.f42109c.b();
        }
    }

    public final boolean e(int i, an1 an1Var) {
        an1 an1VarA;
        int i10;
        if (an1Var != null) {
            an1VarA = this.f42110d.a(this.f42107a, an1Var);
            if (an1VarA == null) {
                return false;
            }
        } else {
            an1VarA = null;
        }
        an1 an1Var2 = an1VarA;
        this.f42110d.getClass();
        dn1 dn1Var = this.f42108b;
        if (dn1Var.f37845a == i && lb3.a(dn1Var.f37846b, an1Var2)) {
            i10 = i;
        } else {
            i10 = i;
            this.f42108b = new dn1(this.f42110d.f40975c.f37847c, i10, an1Var2, 0L);
        }
        pk0 pk0Var = this.f42109c;
        if (pk0Var.f41944a == i10 && lb3.a(pk0Var.f41945b, an1Var2)) {
            return true;
        }
        this.f42109c = new pk0(this.f42110d.f40976d.f41946c, i10, an1Var2);
        return true;
    }

    @Override // yads.qk0
    public final void b(int i, an1 an1Var) {
        if (e(i, an1Var)) {
            this.f42109c.d();
        }
    }

    @Override // yads.en1
    public final void c(int i, an1 an1Var, xf1 xf1Var, jm1 jm1Var) {
        if (e(i, an1Var)) {
            this.f42108b.a(xf1Var, a(jm1Var));
        }
    }

    @Override // yads.qk0
    public final void a(int i, an1 an1Var) {
        if (e(i, an1Var)) {
            this.f42109c.a();
        }
    }

    @Override // yads.en1
    public final void b(int i, an1 an1Var, xf1 xf1Var, jm1 jm1Var) {
        if (e(i, an1Var)) {
            this.f42108b.c(xf1Var, a(jm1Var));
        }
    }

    @Override // yads.qk0
    public final void a(int i, an1 an1Var, int i10) {
        if (e(i, an1Var)) {
            this.f42109c.a(i10);
        }
    }

    @Override // yads.qk0
    public final void a(int i, an1 an1Var, Exception exc) {
        if (e(i, an1Var)) {
            this.f42109c.a(exc);
        }
    }

    @Override // yads.en1
    public final void a(int i, an1 an1Var, xf1 xf1Var, jm1 jm1Var) {
        if (e(i, an1Var)) {
            this.f42108b.b(xf1Var, a(jm1Var));
        }
    }

    @Override // yads.en1
    public final void a(int i, an1 an1Var, xf1 xf1Var, jm1 jm1Var, IOException iOException, boolean z5) {
        if (e(i, an1Var)) {
            this.f42108b.a(xf1Var, a(jm1Var), iOException, z5);
        }
    }

    @Override // yads.en1
    public final void a(int i, an1 an1Var, jm1 jm1Var) {
        if (e(i, an1Var)) {
            this.f42108b.b(a(jm1Var));
        }
    }
}
