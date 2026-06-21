package yads;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class mw1 implements p11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iw1 f41046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zv1 f41047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oh3 f41048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final co3 f41049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final wv1 f41050e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l11 f41051f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final pt2 f41052g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ev f41053h;
    public boolean i;

    public /* synthetic */ mw1(iw1 iw1Var, zv1 zv1Var) {
        this(iw1Var, zv1Var, new oh3(), new co3(iw1Var), new wv1(), new l11(), fw2.a().a(iw1Var.f()));
    }

    @Override // yads.p11
    public final void a(jb2 jb2Var, Map map) {
    }

    @Override // yads.p11
    public final void a(boolean z5) {
    }

    @Override // yads.p11
    public final void a(String str) {
        pt2 pt2Var = this.f41052g;
        if (pt2Var == null || !pt2Var.B0 || this.i) {
            ev evVar = this.f41053h;
            if (evVar != null) {
                iw1 iw1Var = this.f41046a;
                tv1 tv1Var = (tv1) evVar;
                kf1 kf1Var = tv1Var.f43452a;
                kf1 kf1Var2 = new kf1(kf1Var.f40181a, kf1Var.f40182b, kf1Var.f40183c, str, kf1Var.f40185e);
                hv hvVar = tv1Var.f43453b;
                n12 n12Var = hvVar.f39336c;
                iv ivVar = n12Var.f41133a;
                oi oiVar = hvVar.f39334a;
                y3 y3Var = hvVar.f39335b;
                mn2 mn2Var = hvVar.f39337d;
                kx0 kx0Var = hvVar.f39338e;
                ivVar.getClass();
                new vz1(kx0Var, mn2Var, y3Var, n12Var, oiVar, kf1Var2).onClick(iw1Var);
            }
            this.i = false;
        }
    }

    public mw1(iw1 iw1Var, zv1 zv1Var, oh3 oh3Var, co3 co3Var, wv1 wv1Var, l11 l11Var, pt2 pt2Var) {
        this.f41046a = iw1Var;
        this.f41047b = zv1Var;
        this.f41048c = oh3Var;
        this.f41049d = co3Var;
        this.f41050e = wv1Var;
        this.f41051f = l11Var;
        this.f41052g = pt2Var;
    }

    @Override // yads.p11
    public final void a() {
        this.i = true;
    }
}
