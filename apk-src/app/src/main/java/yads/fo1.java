package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class fo1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f38510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nu2 f38511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w5 f38512c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final no1 f38513d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zo1 f38514e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final go1 f38515f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ub2 f38516g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final uo1 f38517h;

    public /* synthetic */ fo1(d4 d4Var, nu2 nu2Var, w5 w5Var, no1 no1Var, zo1 zo1Var, go1 go1Var, ub2 ub2Var) {
        this(d4Var, nu2Var, w5Var, no1Var, zo1Var, go1Var, ub2Var, new uo1());
    }

    public final void a(Context context, Object obj) {
        this.f38515f.a(context);
        ub2 ub2Var = this.f38516g;
        nm2 nm2Var = ub2Var.f43628b;
        dk.i iVar = ub2.f43626c[0];
        zn znVar = (zn) nm2Var.f41294a.get();
        if (znVar == null || znVar.f45482r == z5.f45250b) {
            return;
        }
        vb2 vb2Var = ub2Var.f43627a;
        znVar.a(z5.f45252d);
        synchronized (znVar) {
            hk.c0.m(znVar.f45470e, null, new qn(znVar, vb2Var, null), 3);
        }
    }

    public fo1(d4 d4Var, nu2 nu2Var, w5 w5Var, no1 no1Var, zo1 zo1Var, go1 go1Var, ub2 ub2Var, uo1 uo1Var) {
        this.f38510a = d4Var;
        this.f38511b = nu2Var;
        this.f38512c = w5Var;
        this.f38513d = no1Var;
        this.f38514e = zo1Var;
        this.f38515f = go1Var;
        this.f38516g = ub2Var;
        this.f38517h = uo1Var;
    }
}
