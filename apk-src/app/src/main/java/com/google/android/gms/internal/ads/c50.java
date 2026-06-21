package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c50 implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4030a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ls1 f4031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ls1 f4032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ls1 f4033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qs1 f4034e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final qs1 f4035f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final qs1 f4036g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final qs1 f4037h;
    public final qs1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final qs1 f4038j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final qs1 f4039k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final qs1 f4040l;

    public c50(y30 y30Var, d60 d60Var, ls1 ls1Var, jw jwVar, aa.m mVar, ls1 ls1Var2, ns1 ns1Var, jw jwVar2, aa.m mVar2, jw jwVar3, ls1 ls1Var3) {
        this.f4034e = y30Var;
        this.f4035f = d60Var;
        this.f4031b = ls1Var;
        this.f4036g = jwVar;
        this.f4037h = mVar;
        this.f4032c = ls1Var2;
        this.i = ns1Var;
        this.f4038j = jwVar2;
        this.f4039k = mVar2;
        this.f4040l = jwVar3;
        this.f4033d = ls1Var3;
    }

    public sa a() {
        return new sa(((y40) this.f4034e).b(), ((y40) this.f4035f).a(), (u60) this.f4031b.j(), (y60) this.f4036g.j(), ((i80) this.f4037h).f6423a.f5697o, ((j40) this.i).a(), (s70) this.f4032c.j(), new a70(((h60) this.f4038j).f6039b.j()), (q80) this.f4033d.j(), (r50) ((ls1) this.f4039k).j(), (de0) this.f4040l.j());
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final Object j() {
        switch (this.f4030a) {
            case 0:
                cg0 cg0VarB = ((y30) this.f4034e).b();
                iq0 iq0VarA = ((d60) this.f4035f).a();
                rr0 rr0Var = (rr0) this.f4031b.j();
                jw jwVar = (jw) this.f4036g;
                n90 n90Var = new n90(7, ((os1) jwVar.f6949b).j(), ((os1) jwVar.f6950c).j());
                sj0 sj0VarB = ((aa.m) this.f4037h).b();
                z70 z70Var = (z70) this.f4032c.j();
                eq0 eq0Var = (eq0) ((ns1) this.i).f8433a;
                jw jwVar2 = (jw) this.f4038j;
                gx gxVar = hx.f6279a;
                gr.G(gxVar);
                oq0 oq0Var = new oq0(14, gxVar, ((i20) jwVar2.f6949b).a(), ls1.b((j40) jwVar2.f6950c), false);
                y50 y50VarA = ((aa.m) this.f4039k).a();
                gr.G(gxVar);
                jw jwVar3 = (jw) this.f4040l;
                Map map = ((ps1) jwVar3.f6949b).f7291a;
                gr.G(gxVar);
                return new b50(cg0VarB, iq0VarA, rr0Var, n90Var, sj0VarB, z70Var, eq0Var, oq0Var, y50VarA, gxVar, new mg0(map, gxVar, new p70(((h60) jwVar3.f6950c).f6039b.j())), (ei0) this.f4033d.j());
            case 1:
                return a();
            case 2:
                return new gb0((pr) ((hb0) this.f4034e).f6090b.f8764e, (qr) ((hb0) this.f4036g).f6090b.f8763d, (sr) ((hb0) this.f4037h).f6090b.f8762c, (q60) this.f4031b.j(), (i70) this.f4032c.j(), (g60) this.f4033d.j(), (u80) ((ls1) this.i).j(), (Context) this.f4038j.j(), ((y40) this.f4039k).a(), ((j10) this.f4040l).a(), ((d60) this.f4035f).a());
            case 3:
                Context context = (Context) this.f4031b.j();
                xe xeVar = (xe) this.f4034e.j();
                nl nlVar = (nl) this.f4032c.j();
                u9.a aVarA = ((j10) this.f4035f).a();
                fp fpVar = ((b20) this.f4036g).f3559a;
                return new yc0(context, xeVar, nlVar, aVarA, b20.a(), (si) this.f4033d.j(), (n70) ((ms1) this.f4037h).j(), (ph0) this.i.j(), (jq0) this.f4038j.j(), (sd0) this.f4039k.j(), (q00) this.f4040l.j());
            default:
                return new vj0((g60) this.f4031b.j(), (u80) this.f4032c.j(), (q60) this.f4033d.j(), (w60) ((ls1) this.f4034e).j(), (y60) ((ls1) this.f4035f).j(), (o60) ((ls1) this.f4036g).j(), (x70) this.f4037h.j(), (b90) ((ls1) this.i).j(), (f70) ((ls1) this.f4038j).j(), (y80) ((ls1) this.f4039k).j(), (v70) ((ls1) this.f4040l).j());
        }
    }

    public c50(y40 y40Var, y40 y40Var2, ls1 ls1Var, qs1 qs1Var, i80 i80Var, j40 j40Var, ls1 ls1Var2, h60 h60Var, ls1 ls1Var3, ls1 ls1Var4, ls1 ls1Var5) {
        this.f4034e = y40Var;
        this.f4035f = y40Var2;
        this.f4031b = ls1Var;
        this.f4036g = qs1Var;
        this.f4037h = i80Var;
        this.i = j40Var;
        this.f4032c = ls1Var2;
        this.f4038j = h60Var;
        this.f4033d = ls1Var3;
        this.f4039k = ls1Var4;
        this.f4040l = ls1Var5;
    }

    public c50(hb0 hb0Var, hb0 hb0Var2, hb0 hb0Var3, ls1 ls1Var, ls1 ls1Var2, ls1 ls1Var3, ls1 ls1Var4, ls1 ls1Var5, y40 y40Var, j10 j10Var, d60 d60Var) {
        this.f4034e = hb0Var;
        this.f4036g = hb0Var2;
        this.f4037h = hb0Var3;
        this.f4031b = ls1Var;
        this.f4032c = ls1Var2;
        this.f4033d = ls1Var3;
        this.i = ls1Var4;
        this.f4038j = ls1Var5;
        this.f4039k = y40Var;
        this.f4040l = j10Var;
        this.f4035f = d60Var;
    }

    public c50(ls1 ls1Var, ls1 ls1Var2, ls1 ls1Var3, ls1 ls1Var4, ls1 ls1Var5, ls1 ls1Var6, ls1 ls1Var7, ls1 ls1Var8, ls1 ls1Var9, ls1 ls1Var10, ls1 ls1Var11) {
        this.f4031b = ls1Var;
        this.f4032c = ls1Var2;
        this.f4033d = ls1Var3;
        this.f4034e = ls1Var4;
        this.f4035f = ls1Var5;
        this.f4036g = ls1Var6;
        this.f4037h = ls1Var7;
        this.i = ls1Var8;
        this.f4038j = ls1Var9;
        this.f4039k = ls1Var10;
        this.f4040l = ls1Var11;
    }

    public c50(ls1 ls1Var, qs1 qs1Var, ls1 ls1Var2, qs1 qs1Var2, qs1 qs1Var3, ls1 ls1Var3, ms1 ms1Var, qs1 qs1Var4, qs1 qs1Var5, qs1 qs1Var6, qs1 qs1Var7) {
        this.f4031b = ls1Var;
        this.f4034e = qs1Var;
        this.f4032c = ls1Var2;
        this.f4035f = qs1Var2;
        this.f4036g = qs1Var3;
        this.f4033d = ls1Var3;
        this.f4037h = ms1Var;
        this.i = qs1Var4;
        this.f4038j = qs1Var5;
        this.f4039k = qs1Var6;
        this.f4040l = qs1Var7;
    }
}
