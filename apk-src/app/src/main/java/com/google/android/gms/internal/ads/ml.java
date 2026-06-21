package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ml implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qs1 f7904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qs1 f7905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qs1 f7906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qs1 f7907e;

    public ml(d10 d10Var, j10 j10Var, ls1 ls1Var, ls1 ls1Var2) {
        this.f7903a = 15;
        this.f7906d = d10Var;
        this.f7907e = j10Var;
        this.f7904b = ls1Var;
        this.f7905c = ls1Var2;
    }

    public ll a() {
        return new ll((ScheduledExecutorService) ((ls1) this.f7904b).j(), (aa.i0) ((ls1) this.f7905c).j(), (aa.c0) ((ls1) this.f7906d).j(), (wd0) ((ls1) this.f7907e).j());
    }

    public dk0 b() {
        return new dk0((rr0) ((ls1) this.f7904b).j(), (r81) this.f7905c.j(), (bi0) this.f7906d.j(), (fi0) ((ms1) this.f7907e).j(), 0);
    }

    public sn0 c() {
        Context contextA = ((d10) this.f7905c).a();
        gx gxVar = hx.f6279a;
        gr.G(gxVar);
        return new sn0(contextA, gxVar, ((rs1) this.f7906d).j(), (as0) ((ls1) this.f7904b).j(), (sd0) this.f7907e.j());
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final Object j() {
        switch (this.f7903a) {
            case 0:
                return a();
            case 1:
                rr0 rr0Var = (rr0) ((ls1) this.f7904b).j();
                r81 r81Var = (r81) this.f7905c.j();
                bw bwVar = (bw) this.f7906d;
                return new dk0(rr0Var, r81Var, ((k30) this.f7907e).a(), new ni0((Context) bwVar.f3923b.j(), (q10) bwVar.f3924c.f8433a, 0), 0);
            case 2:
                rr0 rr0Var2 = (rr0) ((ls1) this.f7904b).j();
                r81 r81Var2 = (r81) this.f7905c.j();
                bw bwVar2 = (bw) this.f7906d;
                return new dk0(rr0Var2, r81Var2, ((k30) this.f7907e).a(), new ti0((Context) bwVar2.f3923b.j(), (s10) bwVar2.f3924c.f8433a), 0);
            case 3:
                return new k40(((y40) this.f7907e).a(), (q60) ((ls1) this.f7904b).j(), (d70) ((ls1) this.f7905c).j(), (i70) ((ls1) this.f7906d).j());
            case 4:
                return new g50((ua.a) this.f7905c.j(), (h50) this.f7906d.j(), ((d60) this.f7907e).a(), (String) ((ls1) this.f7904b).j());
            case 5:
                rr0 rr0Var3 = (rr0) ((ls1) this.f7904b).j();
                r81 r81Var3 = (r81) this.f7905c.j();
                bw bwVar3 = (bw) this.f7906d;
                return new dk0(rr0Var3, r81Var3, ((k30) this.f7907e).a(), new ni0((Context) bwVar3.f3923b.j(), (w10) bwVar3.f3924c.f8433a, 1), 0);
            case 6:
                yc0 yc0Var = (yc0) this.f7905c.j();
                kc0 kc0Var = (kc0) ((v90) this.f7906d).f11316b.f4348d;
                gr.G(kc0Var);
                q30 q30Var = (q30) ((ls1) this.f7904b).j();
                t90 t90Var = (t90) ((w90) this.f7907e).f11703b.j();
                gr.G(t90Var);
                return new za0(yc0Var, kc0Var, q30Var, t90Var);
            case 7:
                return new dc0(((d10) this.f7904b).a(), ((p20) this.f7905c).a(), ((ta0) this.f7906d).a(), (fa0) ((wm0) this.f7907e).j());
            case 8:
                return new ec0((String) ((y40) this.f7904b).f12492b.f8764e, (fa0) ((wm0) this.f7905c).j(), ((p20) this.f7906d).a(), (sd0) this.f7907e.j());
            case 9:
                rr0 rr0Var4 = (rr0) ((ls1) this.f7904b).j();
                r81 r81Var4 = (r81) this.f7905c.j();
                bw bwVar4 = (bw) this.f7906d;
                return new dk0(rr0Var4, r81Var4, ((k30) this.f7907e).a(), new ni0((Context) bwVar4.f3923b.j(), (z10) bwVar4.f3924c.f8433a, 2), 0);
            case 10:
                return new sf0((rf0) ((ls1) this.f7904b).j(), (sd0) ((ls1) this.f7905c).j(), ((d10) this.f7906d).a(), ((a10) this.f7907e).j());
            case 11:
                return new ph0(((d10) this.f7906d).a(), (kh0) ((ls1) this.f7904b).j(), (u9.l) this.f7907e.j(), (sd0) ((ls1) this.f7905c).j());
            case 12:
                return b();
            case 13:
                return new dk0((rr0) ((ls1) this.f7904b).j(), (r81) this.f7905c.j(), (gl) ((hk0) this.f7906d).f6166b.f5837c, new ox0(29, (w10) ((ge0) this.f7907e).f5787b.f8433a), 1);
            case 14:
                return c();
            case 15:
                return new bs0(((d10) this.f7906d).a(), ((j10) this.f7907e).a(), (fd0) ((ls1) this.f7904b).j(), new fp(14), (w00) ((ls1) this.f7905c).j());
            case 16:
                return new lt0((qt0) ((ls1) this.f7904b).j(), ((g10) this.f7906d).a(), ((d10) this.f7907e).a(), (ua.a) ((ls1) this.f7905c).j());
            default:
                return new py0(ls1.b((rs1) this.f7905c), ls1.b((rs1) this.f7906d), (ExecutorService) ((ns1) this.f7907e).f8433a, ls1.b((ls1) this.f7904b));
        }
    }

    public ml(d10 d10Var, ls1 ls1Var, qs1 qs1Var, ls1 ls1Var2) {
        this.f7903a = 11;
        this.f7906d = d10Var;
        this.f7904b = ls1Var;
        this.f7907e = qs1Var;
        this.f7905c = ls1Var2;
    }

    public ml(y40 y40Var, ls1 ls1Var, ls1 ls1Var2, ls1 ls1Var3) {
        this.f7903a = 3;
        this.f7907e = y40Var;
        this.f7904b = ls1Var;
        this.f7905c = ls1Var2;
        this.f7906d = ls1Var3;
    }

    public ml(ls1 ls1Var, g10 g10Var, d10 d10Var, ls1 ls1Var2) {
        this.f7903a = 16;
        this.f7904b = ls1Var;
        this.f7906d = g10Var;
        this.f7907e = d10Var;
        this.f7905c = ls1Var2;
    }

    public /* synthetic */ ml(qs1 qs1Var, ms1 ms1Var, ls1 ls1Var, qs1 qs1Var2, int i) {
        this.f7903a = i;
        this.f7905c = qs1Var;
        this.f7906d = ms1Var;
        this.f7904b = ls1Var;
        this.f7907e = qs1Var2;
    }

    public /* synthetic */ ml(qs1 qs1Var, qs1 qs1Var2, ms1 ms1Var, ls1 ls1Var, int i) {
        this.f7903a = i;
        this.f7905c = qs1Var;
        this.f7906d = qs1Var2;
        this.f7907e = ms1Var;
        this.f7904b = ls1Var;
    }

    public /* synthetic */ ml(qs1 qs1Var, qs1 qs1Var2, qs1 qs1Var3, qs1 qs1Var4, int i) {
        this.f7903a = i;
        this.f7904b = qs1Var;
        this.f7905c = qs1Var2;
        this.f7906d = qs1Var3;
        this.f7907e = qs1Var4;
    }
}
