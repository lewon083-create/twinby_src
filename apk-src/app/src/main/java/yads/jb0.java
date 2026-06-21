package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class jb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s63 f39803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r51 f39804b = r51.g();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public zm2 f39805c = zm2.f45462h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public an1 f39806d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public an1 f39807e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public an1 f39808f;

    public jb0(s63 s63Var) {
        this.f39803a = s63Var;
    }

    public final void a(s51 s51Var, an1 an1Var, v63 v63Var) {
        if (an1Var == null) {
            return;
        }
        if (v63Var.a(an1Var.f43366a) != -1) {
            s51Var.a(an1Var, v63Var);
            return;
        }
        v63 v63Var2 = (v63) this.f39805c.get(an1Var);
        if (v63Var2 != null) {
            s51Var.a(an1Var, v63Var2);
        }
    }

    public static an1 a(qe2 qe2Var, r51 r51Var, an1 an1Var, s63 s63Var) {
        ao0 ao0Var = (ao0) qe2Var;
        v63 v63VarH = ao0Var.h();
        int iF = ao0Var.f();
        Object objA = v63VarH.c() ? null : v63VarH.a(iF);
        int iA = (ao0Var.l() || v63VarH.c()) ? -1 : v63VarH.a(iF, s63Var).a(lb3.a(ao0Var.g()) - s63Var.a());
        for (int i = 0; i < r51Var.size(); i++) {
            an1 an1Var2 = (an1) r51Var.get(i);
            if (a(an1Var2, objA, ao0Var.l(), ao0Var.c(), ao0Var.d(), iA)) {
                return an1Var2;
            }
        }
        if (r51Var.isEmpty() && an1Var != null && a(an1Var, objA, ao0Var.l(), ao0Var.c(), ao0Var.d(), iA)) {
            return an1Var;
        }
        return null;
    }

    public static boolean a(an1 an1Var, Object obj, boolean z5, int i, int i10, int i11) {
        if (!an1Var.f43366a.equals(obj)) {
            return false;
        }
        if (z5 && an1Var.f43367b == i && an1Var.f43368c == i10) {
            return true;
        }
        return !z5 && an1Var.f43367b == -1 && an1Var.f43370e == i11;
    }

    public final void a(v63 v63Var) {
        s51 s51VarA = u51.a();
        if (this.f39804b.isEmpty()) {
            a(s51VarA, this.f39807e, v63Var);
            if (!n92.a(this.f39808f, this.f39807e)) {
                a(s51VarA, this.f39808f, v63Var);
            }
            if (!n92.a(this.f39806d, this.f39807e) && !n92.a(this.f39806d, this.f39808f)) {
                a(s51VarA, this.f39806d, v63Var);
            }
        } else {
            for (int i = 0; i < this.f39804b.size(); i++) {
                a(s51VarA, (an1) this.f39804b.get(i), v63Var);
            }
            if (!this.f39804b.contains(this.f39806d)) {
                a(s51VarA, this.f39806d, v63Var);
            }
        }
        this.f39805c = s51VarA.a();
    }
}
