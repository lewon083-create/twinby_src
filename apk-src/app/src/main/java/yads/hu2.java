package yads;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class hu2 implements gq2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fq2 f39332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pm3 f39333b;

    public /* synthetic */ hu2(ct1 ct1Var) {
        this(f82.a(ct1Var), new pm3());
    }

    @Override // yads.gq2
    public final Object a(h82 h82Var) {
        this.f39333b.getClass();
        int i = h82Var.f39069a;
        zp2 zp2Var = new zp2(h82Var.f39070b);
        Map mapD = h82Var.f39071c;
        if (mapD == null) {
            mapD = kotlin.collections.j0.d();
        }
        return (pt2) this.f39332a.a(new yp2(i, zp2Var, mapD));
    }

    public hu2(fq2 fq2Var, pm3 pm3Var) {
        this.f39332a = fq2Var;
        this.f39333b = pm3Var;
    }
}
