package yads;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class gn1 implements en1, qk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final in1 f38829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public dn1 f38830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public pk0 f38831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kn1 f38832d;

    public gn1(kn1 kn1Var, in1 in1Var) {
        this.f38832d = kn1Var;
        this.f38830b = kn1Var.f40284f;
        this.f38831c = kn1Var.f40285g;
        this.f38829a = in1Var;
    }

    @Override // yads.qk0
    public final void a(int i, an1 an1Var) {
        if (e(i, an1Var)) {
            this.f38831c.a();
        }
    }

    @Override // yads.en1
    public final void b(int i, an1 an1Var, jm1 jm1Var) {
        if (e(i, an1Var)) {
            this.f38830b.a(jm1Var);
        }
    }

    @Override // yads.qk0
    public final void c(int i, an1 an1Var) {
        if (e(i, an1Var)) {
            this.f38831c.c();
        }
    }

    @Override // yads.qk0
    public final void d(int i, an1 an1Var) {
        if (e(i, an1Var)) {
            this.f38831c.b();
        }
    }

    public final boolean e(int i, an1 an1Var) {
        an1 an1VarA = null;
        if (an1Var != null) {
            in1 in1Var = this.f38829a;
            int i10 = 0;
            while (true) {
                if (i10 >= in1Var.f39586c.size()) {
                    break;
                }
                if (((an1) in1Var.f39586c.get(i10)).f43369d == an1Var.f43369d) {
                    an1VarA = an1Var.a(e.a(in1Var.f39585b, an1Var.f43366a));
                    break;
                }
                i10++;
            }
            if (an1VarA == null) {
                return false;
            }
        }
        an1 an1Var2 = an1VarA;
        int i11 = i + this.f38829a.f39587d;
        dn1 dn1Var = this.f38830b;
        if (dn1Var.f37845a != i11 || !lb3.a(dn1Var.f37846b, an1Var2)) {
            this.f38830b = new dn1(this.f38832d.f40284f.f37847c, i11, an1Var2, 0L);
        }
        pk0 pk0Var = this.f38831c;
        if (pk0Var.f41944a == i11 && lb3.a(pk0Var.f41945b, an1Var2)) {
            return true;
        }
        this.f38831c = new pk0(this.f38832d.f40285g.f41946c, i11, an1Var2);
        return true;
    }

    @Override // yads.qk0
    public final void a(int i, an1 an1Var, int i10) {
        if (e(i, an1Var)) {
            this.f38831c.a(i10);
        }
    }

    @Override // yads.qk0
    public final void b(int i, an1 an1Var) {
        if (e(i, an1Var)) {
            this.f38831c.d();
        }
    }

    @Override // yads.en1
    public final void c(int i, an1 an1Var, xf1 xf1Var, jm1 jm1Var) {
        if (e(i, an1Var)) {
            this.f38830b.a(xf1Var, jm1Var);
        }
    }

    @Override // yads.qk0
    public final void a(int i, an1 an1Var, Exception exc) {
        if (e(i, an1Var)) {
            this.f38831c.a(exc);
        }
    }

    @Override // yads.en1
    public final void b(int i, an1 an1Var, xf1 xf1Var, jm1 jm1Var) {
        if (e(i, an1Var)) {
            this.f38830b.c(xf1Var, jm1Var);
        }
    }

    @Override // yads.en1
    public final void a(int i, an1 an1Var, xf1 xf1Var, jm1 jm1Var) {
        if (e(i, an1Var)) {
            this.f38830b.b(xf1Var, jm1Var);
        }
    }

    @Override // yads.en1
    public final void a(int i, an1 an1Var, xf1 xf1Var, jm1 jm1Var, IOException iOException, boolean z5) {
        if (e(i, an1Var)) {
            this.f38830b.a(xf1Var, jm1Var, iOException, z5);
        }
    }

    @Override // yads.en1
    public final void a(int i, an1 an1Var, jm1 jm1Var) {
        if (e(i, an1Var)) {
            this.f38830b.b(jm1Var);
        }
    }
}
