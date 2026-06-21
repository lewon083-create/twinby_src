package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class t30 extends r40 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final sz f10474l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f10475m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Context f10476n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ut f10477o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h90 f10478p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final qr0 f10479q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final o60 f10480r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f10481s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final dx f10482t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final sd0 f10483u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f10484v;

    public t30(sa saVar, Context context, sz szVar, int i, ut utVar, h90 h90Var, qr0 qr0Var, o60 o60Var, dx dxVar, sd0 sd0Var) {
        super(saVar);
        this.f10484v = false;
        this.f10474l = szVar;
        this.f10476n = context;
        this.f10475m = i;
        this.f10477o = utVar;
        this.f10478p = h90Var;
        this.f10479q = qr0Var;
        this.f10480r = o60Var;
        this.f10481s = ((Boolean) q9.s.f31967e.f31970c.a(al.f3093l6)).booleanValue();
        this.f10482t = dxVar;
        this.f10483u = sd0Var;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void c(Activity activity, boolean z5) {
        sz szVar;
        xp0 xp0VarM;
        int i;
        qr0 qr0Var = this.f10479q;
        o60 o60Var = this.f10480r;
        Context context = activity;
        if (activity == null) {
            context = this.f10476n;
        }
        boolean z10 = this.f10481s;
        if (z10) {
            qr0Var.A1(l80.f7420c);
        }
        p9.k kVar = p9.k.C;
        t9.g0 g0Var = kVar.f31297c;
        h90 h90Var = this.f10478p;
        if (!t9.g0.n(h90Var.j())) {
            wk wkVar = al.Pe;
            q9.s sVar = q9.s.f31967e;
            if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue()) {
                t9.g0.m(context, this.f9697b, this.f10483u);
            }
            if (((Boolean) sVar.f31970c.a(al.Z0)).booleanValue() && t9.g0.h(context)) {
                u9.i.h("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://goo.gle/admob-interstitial-policies");
                o60Var.i();
                if (((Boolean) sVar.f31970c.a(al.f2917a1)).booleanValue()) {
                    new hv0(context.getApplicationContext(), kVar.f31313t.i()).a(((zp0) this.f9696a.f5033b.f4348d).f13056b);
                    return;
                }
                return;
            }
        }
        if (((Boolean) q9.s.f31967e.f31970c.a(al.f2990ed)).booleanValue() && (szVar = this.f10474l) != null && (xp0VarM = szVar.M()) != null && xp0VarM.f12259r0) {
            int i10 = xp0VarM.f12261s0;
            dx dxVar = this.f10482t;
            synchronized (dxVar.f4700b) {
                cx cxVar = dxVar.f4703e;
                synchronized (cxVar.f4357f) {
                    i = cxVar.f4362l;
                }
            }
            if (i10 != i) {
                u9.i.h("The app open consent form has been shown.");
                o60Var.p0(vv.C(12, "The consent form has already been shown.", null));
                return;
            }
        }
        if (this.f10484v) {
            u9.i.h("App open interstitial ad is already visible.");
            o60Var.p0(vv.C(10, null, null));
        }
        if (this.f10484v) {
            return;
        }
        try {
            h90Var.d(z5, context, o60Var);
            if (z10) {
                qr0Var.F1();
            }
            this.f10484v = true;
        } catch (g90 e3) {
            o60Var.y0(e3);
        }
    }

    public final void d() {
        u60 u60Var = this.f9698c;
        u60Var.getClass();
        u60Var.A1(new zk(null, 2));
        sz szVar = this.f10474l;
        if (szVar != null) {
            szVar.destroy();
        }
    }

    public final void e(int i, long j10) {
        ut utVar = this.f10477o;
        zd1 zd1VarA = ((sd0) utVar.f11061c).a();
        zd1VarA.v("gqi", ((zp0) ((eq0) utVar.f11062d).f5033b.f4348d).f13056b);
        zd1VarA.v("action", "ad_closed");
        zd1VarA.v("show_time", String.valueOf(j10));
        zd1VarA.v("ad_format", "app_open_ad");
        int i10 = i - 1;
        zd1VarA.v("acr", i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "u" : "ac" : "cb" : "cc" : "bb" : "h");
        zd1VarA.w();
    }
}
