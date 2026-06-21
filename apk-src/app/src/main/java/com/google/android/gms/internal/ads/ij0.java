package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ij0 extends jj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6509a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n10 f6510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a60 f6511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g80 f6512d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final oj0 f6513e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ei0 f6514f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f6515g;

    public ij0(n10 n10Var, a60 a60Var, g80 g80Var, fq0 fq0Var, oj0 oj0Var, ei0 ei0Var) {
        this.f6510b = n10Var;
        this.f6511c = a60Var;
        this.f6512d = g80Var;
        this.f6515g = fq0Var;
        this.f6513e = oj0Var;
        this.f6514f = ei0Var;
    }

    @Override // com.google.android.gms.internal.ads.jj0
    public final or0 c(iq0 iq0Var, Bundle bundle, xp0 xp0Var, eq0 eq0Var) {
        fq0 fq0Var;
        switch (this.f6509a) {
            case 0:
                a60 a60Var = this.f6511c;
                a60Var.f2787b = iq0Var;
                a60Var.f2788c = bundle;
                a60Var.f2790e = new oq0(10, eq0Var, xp0Var, this.f6513e, false);
                if (((Boolean) q9.s.f31967e.f31970c.a(al.f3106m4)).booleanValue()) {
                    a60Var.f2791f = this.f6514f;
                }
                n10 n10Var = this.f6510b.f8104b;
                a60 a60Var2 = new a60(a60Var);
                n90 n90Var = (n90) this.f6515g;
                cf cfVar = new cf(16, (Object) null);
                g80 g80Var = this.f6512d;
                gr.L(g80Var, g80.class);
                gr.L(n90Var, n90.class);
                b50 b50Var = (b50) new m10(n10Var, cfVar, n90Var, new l80(16), g80Var, a60Var2, new gk0(26), null, null).f7731o.j();
                return b50Var.c(b50Var.b());
            case 1:
                a60 a60Var3 = this.f6511c;
                a60Var3.f2787b = iq0Var;
                a60Var3.f2788c = bundle;
                a60Var3.f2790e = new oq0(10, eq0Var, xp0Var, this.f6513e, false);
                if (((Boolean) q9.s.f31967e.f31970c.a(al.f3106m4)).booleanValue()) {
                    a60Var3.f2791f = this.f6514f;
                }
                n10 n10Var2 = this.f6510b.f8104b;
                a60 a60Var4 = new a60(a60Var3);
                gk0 gk0Var = (gk0) this.f6515g;
                g80 g80Var2 = this.f6512d;
                gr.L(g80Var2, g80.class);
                gr.L(gk0Var, gk0.class);
                b50 b50Var2 = (b50) new w10(n10Var2, new l80(16), g80Var2, a60Var4, new gk0(26), gk0Var, null, null).f11583n.j();
                return b50Var2.c(b50Var2.b());
            default:
                a60 a60Var5 = this.f6511c;
                a60Var5.f2787b = iq0Var;
                a60Var5.f2788c = bundle;
                a60Var5.f2790e = new oq0(10, eq0Var, xp0Var, this.f6513e, false);
                wk wkVar = al.f3091l4;
                q9.s sVar = q9.s.f31967e;
                if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue() && (fq0Var = (fq0) this.f6515g) != null) {
                    a60Var5.f2789d = fq0Var;
                }
                if (((Boolean) sVar.f31970c.a(al.f3106m4)).booleanValue()) {
                    a60Var5.f2791f = this.f6514f;
                }
                n10 n10Var3 = this.f6510b.f8104b;
                a60 a60Var6 = new a60(a60Var5);
                g80 g80Var3 = this.f6512d;
                gr.L(g80Var3, g80.class);
                b50 b50VarH = new z10(n10Var3, new l80(16), g80Var3, a60Var6, new gk0(26), null, null).h();
                return b50VarH.c(b50VarH.b());
        }
    }

    public ij0(n10 n10Var, a60 a60Var, gk0 gk0Var, g80 g80Var, oj0 oj0Var, ei0 ei0Var) {
        this.f6510b = n10Var;
        this.f6511c = a60Var;
        this.f6515g = gk0Var;
        this.f6512d = g80Var;
        this.f6513e = oj0Var;
        this.f6514f = ei0Var;
    }

    public ij0(n10 n10Var, n90 n90Var, a60 a60Var, g80 g80Var, oj0 oj0Var, ei0 ei0Var) {
        this.f6510b = n10Var;
        this.f6515g = n90Var;
        this.f6511c = a60Var;
        this.f6512d = g80Var;
        this.f6513e = oj0Var;
        this.f6514f = ei0Var;
    }
}
