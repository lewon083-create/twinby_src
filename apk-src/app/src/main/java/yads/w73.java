package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class w73 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final on2[] f44302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pp0[] f44303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r83 f44304d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f44305e;

    public w73(on2[] on2VarArr, pp0[] pp0VarArr, r83 r83Var, ni1 ni1Var) {
        this.f44302b = on2VarArr;
        this.f44303c = (pp0[]) pp0VarArr.clone();
        this.f44304d = r83Var;
        this.f44305e = ni1Var;
        this.f44301a = on2VarArr.length;
    }

    public final boolean a(int i) {
        return this.f44302b[i] != null;
    }
}
