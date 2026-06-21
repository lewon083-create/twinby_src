package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class sb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bl[] f42875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wy2 f42876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g23 f42877c;

    public sb0(bl[] blVarArr, wy2 wy2Var, g23 g23Var) {
        bl[] blVarArr2 = new bl[blVarArr.length + 2];
        this.f42875a = blVarArr2;
        System.arraycopy(blVarArr, 0, blVarArr2, 0, blVarArr.length);
        this.f42876b = wy2Var;
        this.f42877c = g23Var;
        blVarArr2[blVarArr.length] = wy2Var;
        blVarArr2[blVarArr.length + 1] = g23Var;
    }

    public final bl[] a() {
        return this.f42875a;
    }
}
