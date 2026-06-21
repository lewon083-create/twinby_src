package com.google.android.gms.internal.ads;

import android.content.Context;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d50 implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qs1 f4465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d60 f4466c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qs1 f4467d;

    public d50(d60 d60Var, ls1 ls1Var, a10 a10Var) {
        this.f4464a = 3;
        this.f4466c = d60Var;
        this.f4465b = ls1Var;
        this.f4467d = a10Var;
    }

    public gl0 a() {
        gx gxVar = hx.f6279a;
        gr.G(gxVar);
        return new gl0(gxVar, (id0) this.f4465b.j(), this.f4466c.a(), (String) this.f4467d.j(), 3);
    }

    public gl0 b() {
        Context contextA = ((d10) this.f4465b).a();
        gx gxVar = hx.f6279a;
        gr.G(gxVar);
        return new gl0(contextA, gxVar, this.f4466c.a(), ((j10) this.f4467d).a());
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final Object j() {
        String string;
        switch (this.f4464a) {
            case 0:
                ua.a aVar = (ua.a) this.f4465b.j();
                dx dxVarJ = ((k10) this.f4467d).j();
                String str = this.f4466c.a().f6575g;
                zd1 zd1Var = dxVarJ.f4702d;
                synchronized (zd1Var) {
                    string = ((BigInteger) zd1Var.f12971c).toString();
                    zd1Var.f12971c = ((BigInteger) zd1Var.f12971c).add(BigInteger.ONE);
                    zd1Var.f12972d = string;
                }
                return new xw(aVar, dxVarJ, string, str);
            case 1:
                return new hl0((ua.a) this.f4465b.j(), this.f4466c.a(), ((Long) this.f4467d.j()).longValue());
            case 2:
                return a();
            case 3:
                gx gxVar = hx.f6279a;
                gr.G(gxVar);
                return new gl0((Object) gxVar, this.f4466c.a(), this.f4465b.j(), (Object) ((a10) this.f4467d).j(), 5);
            default:
                return b();
        }
    }

    public d50(ls1 ls1Var, k10 k10Var, d60 d60Var) {
        this.f4464a = 0;
        this.f4465b = ls1Var;
        this.f4467d = k10Var;
        this.f4466c = d60Var;
    }

    public /* synthetic */ d50(qs1 qs1Var, d60 d60Var, qs1 qs1Var2, int i) {
        this.f4464a = i;
        this.f4465b = qs1Var;
        this.f4466c = d60Var;
        this.f4467d = qs1Var2;
    }
}
