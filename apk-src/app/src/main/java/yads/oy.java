package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class oy implements kj1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jj1 f41768a = new jj1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kj1[] f41769b;

    public oy(kj1... kj1VarArr) {
        this.f41769b = kj1VarArr;
    }

    @Override // yads.kj1
    public final jj1 a(int i, int i10) {
        kj1[] kj1VarArr = this.f41769b;
        int length = kj1VarArr.length;
        int i11 = 0;
        while (i11 < length) {
            jj1 jj1VarA = kj1VarArr[i11].a(i, i10);
            int i12 = jj1VarA.f39877a;
            i11++;
            i10 = jj1VarA.f39878b;
            i = i12;
        }
        jj1 jj1Var = this.f41768a;
        jj1Var.f39877a = i;
        jj1Var.f39878b = i10;
        return jj1Var;
    }
}
