package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class qc0 extends r40 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Context f9442l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final WeakReference f9443m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final h90 f9444n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final qr0 f9445o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o60 f9446p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c70 f9447q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a50 f9448r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final qv f9449s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final hv0 f9450t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final gq0 f9451u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final sd0 f9452v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f9453w;

    public qc0(sa saVar, Context context, sz szVar, h90 h90Var, qr0 qr0Var, o60 o60Var, c70 c70Var, a50 a50Var, xp0 xp0Var, hv0 hv0Var, gq0 gq0Var, sd0 sd0Var) {
        super(saVar);
        this.f9453w = false;
        this.f9442l = context;
        this.f9444n = h90Var;
        this.f9443m = new WeakReference(szVar);
        this.f9445o = qr0Var;
        this.f9446p = o60Var;
        this.f9447q = c70Var;
        this.f9448r = a50Var;
        this.f9450t = hv0Var;
        zu zuVar = xp0Var.f12247l;
        this.f9449s = new qv(zuVar != null ? zuVar.f13122b : "", zuVar != null ? zuVar.f13123c : 1);
        this.f9451u = gq0Var;
        this.f9452v = sd0Var;
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
        t9.g0 g0Var = p9.k.C.f31297c;
        h90 h90Var = this.f9444n;
        boolean zN = t9.g0.n(h90Var.j());
        Context context = this.f9442l;
        o60 o60Var = this.f9446p;
        if (!zN) {
            wk wkVar = al.Pe;
            q9.s sVar = q9.s.f31967e;
            yk ykVar = sVar.f31970c;
            yk ykVar2 = sVar.f31970c;
            if (((Boolean) ykVar.a(wkVar)).booleanValue()) {
                t9.g0.m(context, this.f9697b, this.f9452v);
            }
            if (((Boolean) ykVar2.a(al.Z0)).booleanValue() && t9.g0.h(context)) {
                u9.i.h("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://goo.gle/admob-interstitial-policies");
                o60Var.i();
                if (((Boolean) ykVar2.a(al.f2917a1)).booleanValue()) {
                    this.f9450t.a(((zp0) this.f9696a.f5033b.f4348d).f13056b);
                    return;
                }
                return;
            }
        }
        if (this.f9453w) {
            u9.i.h("The rewarded ad have been showed.");
            o60Var.p0(vv.C(10, null, null));
            return;
        }
        this.f9453w = true;
        l80 l80Var = l80.f7420c;
        qr0 qr0Var = this.f9445o;
        qr0Var.A1(l80Var);
        Context context2 = activity;
        if (activity == null) {
            context2 = context;
        }
        try {
            h90Var.d(z5, context2, o60Var);
            qr0Var.F1();
        } catch (g90 e3) {
            o60Var.y0(e3);
        }
    }

    public final void finalize() throws Throwable {
        try {
            sz szVar = (sz) this.f9443m.get();
            if (((Boolean) q9.s.f31967e.f31970c.a(al.f3240v7)).booleanValue()) {
                if (!this.f9453w && szVar != null) {
                    hx.f6284f.execute(new c00(szVar, 6));
                }
            } else if (szVar != null) {
                szVar.destroy();
            }
            super.finalize();
        } catch (Throwable th2) {
            super.finalize();
            throw th2;
        }
    }
}
