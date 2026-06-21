package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d90 extends r40 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Context f4520l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final WeakReference f4521m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final qr0 f4522n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final h90 f4523o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a50 f4524p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final hv0 f4525q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final o60 f4526r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final dx f4527s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final sd0 f4528t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f4529u;

    public d90(sa saVar, Context context, sz szVar, qr0 qr0Var, h90 h90Var, a50 a50Var, hv0 hv0Var, o60 o60Var, dx dxVar, sd0 sd0Var) {
        super(saVar);
        this.f4529u = false;
        this.f4520l = context;
        this.f4521m = new WeakReference(szVar);
        this.f4522n = qr0Var;
        this.f4523o = h90Var;
        this.f4524p = a50Var;
        this.f4525q = hv0Var;
        this.f4526r = o60Var;
        this.f4527s = dxVar;
        this.f4528t = sd0Var;
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
        xp0 xp0VarM;
        int i;
        Context context = this.f4520l;
        o60 o60Var = this.f4526r;
        qr0 qr0Var = this.f4522n;
        qr0Var.A1(l80.f7420c);
        t9.g0 g0Var = p9.k.C.f31297c;
        h90 h90Var = this.f4523o;
        if (!t9.g0.n(h90Var.j())) {
            wk wkVar = al.Pe;
            q9.s sVar = q9.s.f31967e;
            if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue()) {
                t9.g0.m(context, this.f9697b, this.f4528t);
            }
            if (((Boolean) sVar.f31970c.a(al.Z0)).booleanValue() && t9.g0.h(context)) {
                u9.i.h("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://goo.gle/admob-interstitial-policies");
                o60Var.i();
                if (((Boolean) sVar.f31970c.a(al.f2917a1)).booleanValue()) {
                    this.f4525q.a(((zp0) this.f9696a.f5033b.f4348d).f13056b);
                    return;
                }
                return;
            }
        }
        sz szVar = (sz) this.f4521m.get();
        if (((Boolean) q9.s.f31967e.f31970c.a(al.f2990ed)).booleanValue() && szVar != null && (xp0VarM = szVar.M()) != null && xp0VarM.f12259r0) {
            int i10 = xp0VarM.f12261s0;
            dx dxVar = this.f4527s;
            synchronized (dxVar.f4700b) {
                cx cxVar = dxVar.f4703e;
                synchronized (cxVar.f4357f) {
                    i = cxVar.f4362l;
                }
            }
            if (i10 != i) {
                u9.i.h("The interstitial consent form has been shown.");
                o60Var.p0(vv.C(12, "The consent form has already been shown.", null));
                return;
            }
        }
        if (this.f4529u) {
            u9.i.h("The interstitial ad has been shown.");
            o60Var.p0(vv.C(10, null, null));
        }
        Context context2 = activity;
        if (this.f4529u) {
            return;
        }
        if (activity == null) {
            context2 = context;
        }
        try {
            h90Var.d(z5, context2, o60Var);
            qr0Var.F1();
            this.f4529u = true;
        } catch (g90 e3) {
            o60Var.y0(e3);
        }
    }

    public final void finalize() throws Throwable {
        try {
            sz szVar = (sz) this.f4521m.get();
            if (((Boolean) q9.s.f31967e.f31970c.a(al.f3240v7)).booleanValue()) {
                if (!this.f4529u && szVar != null) {
                    hx.f6284f.execute(new c00(szVar, 4));
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
