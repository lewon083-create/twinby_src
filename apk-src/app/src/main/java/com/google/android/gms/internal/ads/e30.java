package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.RemoteException;
import android.view.View;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e30 implements i60, z60, r60, q9.a, p60, r80, k70 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f4808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f4809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f4810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ScheduledExecutorService f4811e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final eq0 f4812f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final xp0 f4813g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final at0 f4814h;
    public final lq0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final xe f4815j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final nl f4816k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final WeakReference f4817l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final WeakReference f4818m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final oq0 f4819n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final g70 f4820o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r50 f4821p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Set f4822q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f4823r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AtomicBoolean f4824s = new AtomicBoolean();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public j0 f4825t = null;

    public e30(Context context, gx gxVar, Executor executor, ScheduledExecutorService scheduledExecutorService, eq0 eq0Var, xp0 xp0Var, at0 at0Var, lq0 lq0Var, View view, sz szVar, xe xeVar, nl nlVar, oq0 oq0Var, g70 g70Var, r50 r50Var, Set set) {
        this.f4808b = context;
        this.f4809c = gxVar;
        this.f4810d = executor;
        this.f4811e = scheduledExecutorService;
        this.f4812f = eq0Var;
        this.f4813g = xp0Var;
        this.f4814h = at0Var;
        this.i = lq0Var;
        this.f4815j = xeVar;
        this.f4817l = new WeakReference(view);
        this.f4818m = new WeakReference(szVar);
        this.f4816k = nlVar;
        this.f4819n = oq0Var;
        this.f4820o = g70Var;
        this.f4821p = r50Var;
        this.f4822q = set;
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final void F(ru ruVar, String str, String str2) {
        fq0 fq0Var;
        xp0 xp0Var = this.f4813g;
        List list = xp0Var.f12241h;
        at0 at0Var = this.f4814h;
        at0Var.getClass();
        ArrayList arrayList = new ArrayList();
        at0Var.f3384h.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            String str3 = ruVar.f10065b;
            String string = Integer.toString(ruVar.f10066c);
            boolean zBooleanValue = ((Boolean) q9.s.f31967e.f31970c.a(al.f3075k4)).booleanValue();
            f31 j31Var = a31.f2740b;
            if (zBooleanValue) {
                gq0 gq0Var = at0Var.f3383g;
                if (gq0Var != null && (fq0Var = gq0Var.f5889a) != null) {
                    j31Var = new j31(fq0Var);
                }
            } else {
                fq0 fq0Var2 = at0Var.f3382f;
                if (fq0Var2 != null) {
                    j31Var = new j31(fq0Var2);
                }
            }
            String str4 = (String) j31Var.b(u5.f10832s).a();
            String str5 = (String) j31Var.b(u5.f10831r).a();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(fs1.f(at0.c(at0.c(at0.c(at0.c(at0.c(at0.c((String) it.next(), "@gw_rwd_userid@", Uri.encode(str4)), "@gw_rwd_custom_data@", Uri.encode(str5)), "@gw_tmstmp@", Long.toString(jCurrentTimeMillis)), "@gw_rwd_itm@", Uri.encode(str3)), "@gw_rwd_amt@", string), "@gw_sdkver@", at0Var.f3378b), at0Var.f3381e, xp0Var.W, xp0Var.f12269w0));
            }
        } catch (RemoteException e3) {
            u9.i.f("Unable to determine award type and amount.", e3);
        }
        this.i.a(arrayList, null);
    }

    public final List a() {
        boolean zBooleanValue = ((Boolean) q9.s.f31967e.f31970c.a(al.Ec)).booleanValue();
        xp0 xp0Var = this.f4813g;
        if (zBooleanValue) {
            t9.g0 g0Var = p9.k.C.f31297c;
            Context context = this.f4808b;
            if (t9.g0.e(context)) {
                Object systemService = context.getSystemService("display");
                Integer numValueOf = systemService instanceof DisplayManager ? Integer.valueOf(((DisplayManager) systemService).getDisplays().length) : null;
                if (numValueOf != null) {
                    int iMin = Math.min(numValueOf.intValue(), 20);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = xp0Var.f12233d.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Uri.parse((String) it.next()).buildUpon().appendQueryParameter("dspct", Integer.toString(iMin)).toString());
                    }
                    return arrayList;
                }
            }
        }
        return xp0Var.f12233d;
    }

    public final void b(int i, int i10) {
        View view;
        if (i <= 0 || !((view = (View) this.f4817l.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            g();
        } else {
            this.f4811e.schedule(new d30(this, i, i10, 0), i10, TimeUnit.MILLISECONDS);
        }
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final void c() {
        xp0 xp0Var = this.f4813g;
        this.i.a(this.f4814h.a(this.f4812f, xp0Var, xp0Var.i), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.AbstractCollection, java.util.List] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.r80
    public final void f() {
        xp0 xp0Var = this.f4813g;
        this.i.a(this.f4814h.a(this.f4812f, xp0Var, xp0Var.f12265u0), null);
    }

    public final void g() {
        int i;
        j0 j0Var;
        xp0 xp0Var = this.f4813g;
        List list = xp0Var.f12233d;
        if (list == null || list.isEmpty()) {
            return;
        }
        wk wkVar = al.Xe;
        q9.s sVar = q9.s.f31967e;
        if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue() && this.f4825t == null) {
            dx dxVar = p9.k.C.f31302h.f3942c;
            Set set = this.f4822q;
            String str = ((iq0) this.f4812f.f5032a.f9149c).f6575g;
            cx cxVar = dxVar.f4703e;
            synchronized (cxVar.f4358g) {
                try {
                    int i10 = cxVar.f4363m;
                    cxVar.f4363m = i10 + 1;
                    if (set.isEmpty()) {
                        j0Var = new j0(i10, -1, -1, false);
                    } else {
                        TreeSet treeSet = new TreeSet(set);
                        StringBuilder sb2 = new StringBuilder();
                        Iterator it = treeSet.iterator();
                        if (it.hasNext()) {
                            Object next = it.next();
                            while (true) {
                                sb2.append((CharSequence) next);
                                if (!it.hasNext()) {
                                    break;
                                }
                                sb2.append((CharSequence) StringUtils.COMMA);
                                next = it.next();
                            }
                        }
                        String string = sb2.toString();
                        HashMap map = cxVar.f4364n;
                        Integer num = (Integer) map.get(string);
                        int iIntValue = 0;
                        int iIntValue2 = num == null ? 0 : num.intValue();
                        map.put(string, Integer.valueOf(iIntValue2 + 1));
                        if (str == null) {
                            j0Var = new j0(i10, iIntValue2, -1, false);
                        } else {
                            StringBuilder sb3 = new StringBuilder(str.length() + 1 + String.valueOf(string).length());
                            sb3.append(str);
                            sb3.append("|");
                            sb3.append(string);
                            String string2 = sb3.toString();
                            HashMap map2 = cxVar.f4365o;
                            Integer num2 = (Integer) map2.get(string2);
                            if (num2 != null) {
                                iIntValue = num2.intValue();
                            }
                            map2.put(string2, Integer.valueOf(iIntValue + 1));
                            j0Var = new j0(i10, iIntValue2, iIntValue, false);
                        }
                    }
                } finally {
                }
            }
            this.f4825t = j0Var;
        }
        String strI = ((Boolean) sVar.f31970c.a(al.f3059j4)).booleanValue() ? this.f4815j.f12136b.i(this.f4808b, (View) this.f4817l.get(), null) : null;
        if ((((Boolean) sVar.f31970c.a(al.Q0)).booleanValue() && ((zp0) this.f4812f.f5033b.f4348d).f13062h) || !((Boolean) am.f3321h.r()).booleanValue()) {
            this.i.a(this.f4814h.b(this.f4812f, xp0Var, false, strI, null, a(), this.f4821p, this.f4825t), this.f4820o);
            return;
        }
        if (((Boolean) am.f3320g.r()).booleanValue() && ((i = xp0Var.f12229b) == 1 || i == 2 || i == 5)) {
        }
        i81 i81Var = (i81) vv.I(i81.s(n81.f8237c), ((Long) sVar.f31970c.a(al.f3205t1)).longValue(), TimeUnit.MILLISECONDS, this.f4811e);
        i81Var.a(new l81(0, i81Var, new zd1(9, this, strI)), this.f4809c);
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final void i() {
        xp0 xp0Var = this.f4813g;
        this.i.a(this.f4814h.a(this.f4812f, xp0Var, xp0Var.f12239g), null);
    }

    @Override // com.google.android.gms.internal.ads.p60
    public final void j(q9.x1 x1Var) {
        if (((Boolean) q9.s.f31967e.f31970c.a(al.S1)).booleanValue()) {
            int i = x1Var.f31976b;
            ArrayList arrayList = new ArrayList();
            xp0 xp0Var = this.f4813g;
            for (String str : xp0Var.f12253o) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 2);
                sb2.append("2.");
                sb2.append(i);
                arrayList.add(at0.c(str, "@gw_mpe@", sb2.toString()));
            }
            this.i.a(this.f4814h.a(this.f4812f, xp0Var, arrayList), null);
        }
    }

    @Override // com.google.android.gms.internal.ads.z60
    public final synchronized void k() {
        oq0 oq0Var;
        long j10;
        try {
            if (this.f4823r) {
                ArrayList arrayList = new ArrayList(a());
                xp0 xp0Var = this.f4813g;
                arrayList.addAll(xp0Var.f12237f);
                this.i.a(this.f4814h.b(this.f4812f, xp0Var, true, null, null, arrayList, null, null), null);
            } else {
                lq0 lq0Var = this.i;
                at0 at0Var = this.f4814h;
                eq0 eq0Var = this.f4812f;
                xp0 xp0Var2 = this.f4813g;
                lq0Var.a(at0Var.a(eq0Var, xp0Var2, xp0Var2.f12249m), null);
                if (((Boolean) q9.s.f31967e.f31970c.a(al.f3133o4)).booleanValue() && (oq0Var = this.f4819n) != null) {
                    List list = ((xp0) oq0Var.f8763d).f12249m;
                    String strD = ((oj0) oq0Var.f8764e).d();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(at0.c((String) it.next(), "@gw_adnetstatus@", strD));
                    }
                    oj0 oj0Var = (oj0) oq0Var.f8764e;
                    synchronized (oj0Var) {
                        j10 = oj0Var.f8705h;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(at0.c((String) it2.next(), "@gw_ttr@", Long.toString(j10, 10)));
                    }
                    lq0Var.a(at0Var.a((eq0) oq0Var.f8762c, (xp0) oq0Var.f8763d, arrayList3), null);
                }
                lq0Var.a(at0Var.a(eq0Var, xp0Var2, xp0Var2.f12237f), null);
            }
            this.f4823r = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.AbstractCollection, java.util.List] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.k70
    public final void n() {
        xp0 xp0Var = this.f4813g;
        if (xp0Var.f12235e == 4) {
            this.i.a(this.f4814h.a(this.f4812f, xp0Var, xp0Var.A0), null);
        }
    }

    @Override // q9.a
    public final void onAdClicked() {
        boolean zBooleanValue = ((Boolean) q9.s.f31967e.f31970c.a(al.Q0)).booleanValue();
        eq0 eq0Var = this.f4812f;
        if ((zBooleanValue && ((zp0) eq0Var.f5033b.f4348d).f13062h) || !((Boolean) am.f3317d.r()).booleanValue()) {
            xp0 xp0Var = this.f4813g;
            this.i.b(true == p9.k.C.f31302h.i(this.f4808b) ? 2 : 1, this.f4814h.a(eq0Var, xp0Var, xp0Var.f12231c));
        } else {
            nl nlVar = this.f4816k;
            nlVar.getClass();
            y61 y61VarG = vv.G(i81.s((i81) vv.I(i81.s(n81.f8237c), ((Long) am.f3316c.r()).longValue(), TimeUnit.MILLISECONDS, nlVar.f8355c)), Throwable.class, u5.f10819e, hx.f6285g);
            y61VarG.a(new l81(0, y61VarG, new ox0(14, this)), this.f4809c);
        }
    }

    @Override // com.google.android.gms.internal.ads.r60
    public final void z() {
        if (this.f4824s.compareAndSet(false, true)) {
            wk wkVar = al.f3193s4;
            q9.s sVar = q9.s.f31967e;
            yk ykVar = sVar.f31970c;
            yk ykVar2 = sVar.f31970c;
            int iIntValue = ((Integer) ykVar.a(wkVar)).intValue();
            if (iIntValue > 0) {
                b(iIntValue, ((Integer) ykVar2.a(al.f3208t4)).intValue());
            } else if (!((Boolean) ykVar2.a(al.f3178r4)).booleanValue()) {
                g();
            } else {
                this.f4810d.execute(new c30(this, 0));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final void H() {
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final void N() {
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final void w() {
    }
}
