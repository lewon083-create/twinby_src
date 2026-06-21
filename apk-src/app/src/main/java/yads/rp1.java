package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class rp1 implements z22 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9 f42684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jq1 f42685b;

    public rp1(v9 v9Var, jq1 jq1Var) {
        this.f42684a = v9Var;
        this.f42685b = jq1Var;
    }

    @Override // yads.z22
    public final y22 a(o02 o02Var) {
        v9 v9Var = this.f42684a;
        jq1 jq1Var = this.f42685b;
        d4 d4Var = o02Var.f45468c;
        nu2 nu2Var = o02Var.f45469d;
        gp1 gp1Var = new gp1(d4Var);
        zo1 zo1Var = new zo1(d4Var, nu2Var, v9Var);
        np1 np1Var = new np1(new oo1(jq1Var.f39930b, gp1Var, zo1Var));
        fo1 fo1Var = new fo1(d4Var, nu2Var, o02Var.f45467b, new op1(), zo1Var, np1Var, new ub2(o02Var, jq1Var));
        return new qp1(fo1Var, new e22(v9Var, nu2Var, o02Var, fo1Var));
    }
}
