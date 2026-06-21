package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class fa0 extends r40 {
    public static final r51 J;
    public boolean A;
    public final dw B;
    public final xe C;
    public final u9.a D;
    public final Context E;
    public final ha0 F;
    public final vk0 G;
    public final HashMap H;
    public final ArrayList I;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Executor f5279l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ja0 f5280m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ma0 f5281n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final sa0 f5282o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final la0 f5283p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final na0 f5284q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final js1 f5285r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final js1 f5286s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final js1 f5287t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final js1 f5288u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final js1 f5289v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ug f5290w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f5291x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f5292y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f5293z;

    static {
        v41 v41Var = x41.f12018c;
        Object[] objArr = {"3010", "3008", "1005", "1009", "2011", "2007"};
        vv.j(6, objArr);
        J = x41.x(6, objArr);
    }

    public fa0(sa saVar, Executor executor, ja0 ja0Var, ma0 ma0Var, sa0 sa0Var, la0 la0Var, na0 na0Var, js1 js1Var, js1 js1Var2, js1 js1Var3, js1 js1Var4, js1 js1Var5, dw dwVar, xe xeVar, u9.a aVar, Context context, ha0 ha0Var, vk0 vk0Var) {
        super(saVar);
        this.f5279l = executor;
        this.f5280m = ja0Var;
        this.f5281n = ma0Var;
        this.f5282o = sa0Var;
        this.f5283p = la0Var;
        this.f5284q = na0Var;
        this.f5285r = js1Var;
        this.f5286s = js1Var2;
        this.f5287t = js1Var3;
        this.f5288u = js1Var4;
        this.f5289v = js1Var5;
        this.B = dwVar;
        this.C = xeVar;
        this.D = aVar;
        this.E = context;
        this.F = ha0Var;
        this.G = vk0Var;
        this.H = new HashMap();
        this.I = new ArrayList();
    }

    public static boolean d(View view) {
        wk wkVar = al.Pb;
        q9.s sVar = q9.s.f31967e;
        if (!((Boolean) sVar.f31970c.a(wkVar)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point());
        }
        t9.g0 g0Var = p9.k.C.f31297c;
        long jA = t9.g0.a(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point())) {
            return jA >= ((long) ((Integer) sVar.f31970c.a(al.Qb)).intValue());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.r40
    public final void a() {
        ba0 ba0Var = new ba0(this, 1);
        Executor executor = this.f5279l;
        executor.execute(ba0Var);
        if (this.f5280m.q() != 7) {
            ma0 ma0Var = this.f5281n;
            Objects.requireNonNull(ma0Var);
            executor.execute(new h30(7, ma0Var));
        }
        super.a();
    }

    public final synchronized void c(final View view, final int i) {
        if (((Boolean) q9.s.f31967e.f31970c.a(al.Lc)).booleanValue()) {
            ug ugVar = this.f5290w;
            if (ugVar == null) {
                u9.i.c("Ad should be associated with an ad view before calling performClickForCustomGesture()");
            } else {
                final boolean z5 = ugVar instanceof qa0;
                this.f5279l.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.da0
                    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.eb0, com.google.android.gms.internal.ads.ug] */
                    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.android.gms.internal.ads.eb0, com.google.android.gms.internal.ads.ug] */
                    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.android.gms.internal.ads.eb0, com.google.android.gms.internal.ads.ug] */
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        fa0 fa0Var = this.f4530b;
                        ?? r12 = fa0Var.f5290w;
                        if (r12 == 0) {
                            u9.i.c("Ad should be associated with an ad view before calling performClickForCustomGesture()");
                            return;
                        }
                        fa0Var.f5281n.l(view, r12.e2(), fa0Var.f5290w.d(), fa0Var.f5290w.n(), z5, fa0Var.k(), i);
                    }
                });
            }
        }
    }

    public final wh0 e(String str, boolean z5) {
        boolean z10;
        boolean z11;
        String str2;
        int i;
        int i10;
        p9.k kVar;
        wh0 wh0Var;
        la0 la0Var = this.f5283p;
        if (la0Var.c() && !TextUtils.isEmpty(str)) {
            ja0 ja0Var = this.f5280m;
            sz szVarJ = ja0Var.j();
            sz szVarH = ja0Var.h();
            if (szVarJ == null && szVarH == null) {
                u9.i.h("Omid display and video webview are null. Skipping initialization.");
                return null;
            }
            la0Var.f();
            int iJ = la0Var.f().J();
            int i11 = iJ - 1;
            if (i11 != 0) {
                if (i11 != 1) {
                    String str3 = iJ != 1 ? iJ != 2 ? "UNKNOWN" : "DISPLAY" : "VIDEO";
                    StringBuilder sb2 = new StringBuilder(str3.length() + 49);
                    sb2.append("Unknown omid media type: ");
                    sb2.append(str3);
                    sb2.append(". Not initializing Omid.");
                    u9.i.h(sb2.toString());
                    return null;
                }
                if (szVarJ == null) {
                    u9.i.h("Omid media type was display but there was no display webview.");
                    return null;
                }
                z11 = false;
                z10 = true;
            } else if (szVarH != null) {
                z10 = false;
                z11 = true;
            } else {
                u9.i.h("Omid media type was video but there was no video webview.");
            }
            if (z10) {
                str2 = null;
            } else {
                str2 = "javascript";
                szVarJ = szVarH;
            }
            if (szVarJ == null) {
                u9.i.h("Webview is null in InternalNativeAd");
                return null;
            }
            Context context = this.E;
            p9.k kVar2 = p9.k.C;
            kVar2.f31317x.getClass();
            if (!l80.e(context)) {
                u9.i.h("Failed to initialize omid in InternalNativeAd");
                return null;
            }
            u9.a aVar = this.D;
            int i12 = aVar.f34366c;
            int i13 = aVar.f34367d;
            StringBuilder sb3 = new StringBuilder(pe.a.a(i12, 1) + String.valueOf(i13).length());
            sb3.append(i12);
            sb3.append(".");
            sb3.append(i13);
            String string = sb3.toString();
            if (z11) {
                i10 = 3;
                i = 2;
            } else {
                i = ja0Var.q() == 3 ? 4 : 3;
                i10 = 2;
            }
            l80 l80Var = kVar2.f31317x;
            WebView webViewU = szVarJ.u();
            String str4 = this.f9697b.f12248l0;
            l80Var.getClass();
            if (((Boolean) q9.s.f31967e.f31970c.a(al.f2922a6)).booleanValue() && nz.A.f12499c) {
                kVar = kVar2;
                wh0Var = (wh0) l80.r(new bf.i(str, string, str2, i10, webViewU, str4, i));
            } else {
                kVar = kVar2;
                wh0Var = null;
            }
            if (wh0Var == null) {
                u9.i.h("Failed to create omid session in InternalNativeAd");
                return null;
            }
            synchronized (ja0Var) {
                ja0Var.f6776l = wh0Var;
            }
            szVarJ.x0(wh0Var);
            if (z11) {
                ut0 ut0Var = wh0Var.f11811a;
                if (szVarH != null) {
                    View viewI0 = szVarH.i0();
                    kVar.f31317x.getClass();
                    l80.m(ut0Var, viewI0);
                }
                this.A = true;
            }
            if (z5) {
                l80 l80Var2 = kVar.f31317x;
                ut0 ut0Var2 = wh0Var.f11811a;
                l80Var2.getClass();
                l80.l(ut0Var2);
                szVarJ.c("onSdkLoaded", new h1.e(0));
            }
            return wh0Var;
        }
        return null;
    }

    public final void f(View view) {
        jx jxVar;
        ja0 ja0Var = this.f5280m;
        if (!((Boolean) q9.s.f31967e.f31970c.a(al.f3031h6)).booleanValue() || ja0Var.q() == 3) {
            m(view, ja0Var.k());
            return;
        }
        synchronized (ja0Var) {
            jxVar = ja0Var.f6778n;
        }
        if (jxVar == null) {
            return;
        }
        n90 n90Var = new n90(9, this, view, false);
        jxVar.a(new l81(0 == true ? 1 : 0, jxVar, n90Var), this.f5279l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.android.gms.internal.ads.eb0, com.google.android.gms.internal.ads.ug] */
    public final synchronized void g(eb0 eb0Var) {
        Iterator<String> itKeys;
        View view;
        ve veVar;
        try {
            if (!this.f5291x) {
                this.f5290w = (ug) eb0Var;
                sa0 sa0Var = this.f5282o;
                sa0Var.f10225g.execute(new l81(sa0Var, eb0Var));
                this.f5281n.a(eb0Var.e2(), eb0Var.n(), eb0Var.e(), eb0Var, eb0Var);
                wk wkVar = al.f3028h3;
                q9.s sVar = q9.s.f31967e;
                if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue() && (veVar = this.C.f12136b) != null) {
                    veVar.g(eb0Var.e2());
                }
                if (((Boolean) sVar.f31970c.a(al.f3027h2)).booleanValue()) {
                    xp0 xp0Var = this.f9697b;
                    if (xp0Var.f12246k0 && (itKeys = xp0Var.f12244j0.keys()) != null) {
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            ?? r22 = this.f5290w;
                            WeakReference weakReference = r22 == 0 ? null : (WeakReference) r22.d().get(next);
                            this.H.put(next, Boolean.FALSE);
                            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                                gh ghVar = new gh(this.E, view);
                                this.I.add(ghVar);
                                ghVar.f5806m.add(new aa0(this, next));
                                ghVar.d(3);
                            }
                        }
                    }
                }
                if (eb0Var.m() != null) {
                    gh ghVarM = eb0Var.m();
                    ghVarM.f5806m.add(this.B);
                    ghVarM.d(3);
                }
            }
        } finally {
        }
    }

    public final void h(eb0 eb0Var) {
        View viewE2 = eb0Var.e2();
        eb0Var.d();
        this.f5281n.h(viewE2);
        if (eb0Var.S3() != null) {
            eb0Var.S3().setClickable(false);
            eb0Var.S3().removeAllViews();
        }
        if (eb0Var.m() != null) {
            gh ghVarM = eb0Var.m();
            ghVarM.f5806m.remove(this.B);
        }
        this.f5290w = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.eb0, com.google.android.gms.internal.ads.ug] */
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
    public final synchronized void i(View view, Map map, Map map2) {
        this.f5282o.a(this.f5290w);
        this.f5281n.q(view, map, map2, k());
        this.f5292y = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0031 A[Catch: all -> 0x0075, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x0007, B:14:0x0028, B:21:0x0031, B:23:0x0044, B:25:0x0054, B:27:0x005e, B:29:0x0068, B:34:0x0078, B:36:0x0088, B:38:0x008e, B:41:0x009b, B:43:0x00b0, B:45:0x00cd, B:47:0x00e9, B:18:0x002d, B:53:0x00f9, B:9:0x000b, B:11:0x0012, B:13:0x0022), top: B:56:0x0001, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void j(android.view.View r9, java.util.Map r10, java.util.Map r11) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fa0.j(android.view.View, java.util.Map, java.util.Map):void");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.eb0, com.google.android.gms.internal.ads.ug] */
    public final synchronized ImageView.ScaleType k() {
        ?? r02 = this.f5290w;
        if (r02 == 0) {
            u9.i.c("Ad should be associated with an ad view before calling getMediaviewScaleType()");
            return null;
        }
        xa.a aVarR = r02.r();
        if (aVarR != null) {
            return (ImageView.ScaleType) xa.b.X1(aVarR);
        }
        return sa0.f10218k;
    }

    public final void l() {
        ed.d dVar;
        if (!((Boolean) q9.s.f31967e.f31970c.a(al.f3031h6)).booleanValue()) {
            e("Google", true);
            return;
        }
        ja0 ja0Var = this.f5280m;
        synchronized (ja0Var) {
            dVar = ja0Var.f6777m;
        }
        if (dVar == null) {
            return;
        }
        cf cfVar = new cf(21, this);
        dVar.a(new l81(0, dVar, cfVar), this.f5279l);
    }

    public final void m(View view, wh0 wh0Var) {
        sz szVarJ = this.f5280m.j();
        if (!this.f5283p.c() || wh0Var == null || szVarJ == null || view == null) {
            return;
        }
        l80 l80Var = p9.k.C.f31317x;
        ut0 ut0Var = wh0Var.f11811a;
        l80Var.getClass();
        l80.m(ut0Var, view);
    }

    public final synchronized void n() {
        this.f5291x = true;
        this.f5279l.execute(new ba0(this, 0));
        u60 u60Var = this.f9698c;
        u60Var.getClass();
        u60Var.A1(new zk(null, 2));
    }

    public final synchronized boolean o(Bundle bundle) {
        if (this.f5292y) {
            return true;
        }
        boolean zS = this.f5281n.s(bundle);
        this.f5292y = zS;
        return zS;
    }

    public final synchronized void q(eb0 eb0Var) {
        if (((Boolean) q9.s.f31967e.f31970c.a(al.f2996f2)).booleanValue()) {
            t9.g0.f33596l.post(new ca0(this, eb0Var, 0));
        } else {
            g(eb0Var);
        }
    }

    public final synchronized void r(eb0 eb0Var) {
        if (((Boolean) q9.s.f31967e.f31970c.a(al.f2996f2)).booleanValue()) {
            t9.g0.f33596l.post(new ca0(this, eb0Var, 1));
        } else {
            h(eb0Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e A[Catch: all -> 0x005a, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x000b, B:10:0x0012, B:12:0x001a, B:15:0x0027, B:16:0x002c, B:18:0x003e, B:21:0x0047, B:23:0x004d), top: B:34:0x0001, inners: #0 }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.eb0, com.google.android.gms.internal.ads.ug] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void s(android.view.View r8, android.view.View r9, java.util.Map r10, java.util.Map r11, boolean r12) {
        /*
            r7 = this;
            monitor-enter(r7)
            com.google.android.gms.internal.ads.sa0 r0 = r7.f5282o     // Catch: java.lang.Throwable -> L5a
            com.google.android.gms.internal.ads.ug r1 = r7.f5290w     // Catch: java.lang.Throwable -> L5a
            if (r1 == 0) goto L2c
            com.google.android.gms.internal.ads.za0 r2 = r0.f10223e     // Catch: java.lang.Throwable -> L5a
            if (r2 == 0) goto L2c
            android.widget.FrameLayout r3 = r1.S3()     // Catch: java.lang.Throwable -> L5a
            if (r3 != 0) goto L12
            goto L2c
        L12:
            com.google.android.gms.internal.ads.la0 r0 = r0.f10221c     // Catch: java.lang.Throwable -> L5a
            boolean r0 = r0.a()     // Catch: java.lang.Throwable -> L5a
            if (r0 == 0) goto L2c
            android.widget.FrameLayout r0 = r1.S3()     // Catch: com.google.android.gms.internal.ads.b00 -> L26 java.lang.Throwable -> L5a
            android.view.View r1 = r2.a()     // Catch: com.google.android.gms.internal.ads.b00 -> L26 java.lang.Throwable -> L5a
            r0.addView(r1)     // Catch: com.google.android.gms.internal.ads.b00 -> L26 java.lang.Throwable -> L5a
            goto L2c
        L26:
            r0 = move-exception
            java.lang.String r1 = "web view can not be obtained"
            t9.c0.n(r1, r0)     // Catch: java.lang.Throwable -> L5a
        L2c:
            android.widget.ImageView$ScaleType r6 = r7.k()     // Catch: java.lang.Throwable -> L5a
            com.google.android.gms.internal.ads.ma0 r0 = r7.f5281n     // Catch: java.lang.Throwable -> L5a
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.f(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L5a
            boolean r8 = r7.A     // Catch: java.lang.Throwable -> L5a
            if (r8 == 0) goto L5d
            com.google.android.gms.internal.ads.ja0 r8 = r7.f5280m     // Catch: java.lang.Throwable -> L5a
            com.google.android.gms.internal.ads.sz r9 = r8.h()     // Catch: java.lang.Throwable -> L5a
            if (r9 != 0) goto L47
            goto L5d
        L47:
            com.google.android.gms.internal.ads.sz r8 = r8.h()     // Catch: java.lang.Throwable -> L5a
            if (r8 == 0) goto L5d
            h1.e r9 = new h1.e     // Catch: java.lang.Throwable -> L5a
            r10 = 0
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r10 = "onSdkAdUserInteractionClick"
            r8.c(r10, r9)     // Catch: java.lang.Throwable -> L5a
            monitor-exit(r7)
            return
        L5a:
            r0 = move-exception
            r8 = r0
            goto L5f
        L5d:
            monitor-exit(r7)
            return
        L5f:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L5a
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fa0.s(android.view.View, android.view.View, java.util.Map, java.util.Map, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a A[Catch: all -> 0x000a, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:10:0x000d, B:12:0x001f, B:14:0x0025, B:15:0x002f, B:17:0x0035, B:21:0x004a, B:24:0x005e, B:25:0x0066, B:27:0x006c, B:29:0x0080, B:31:0x0086, B:36:0x008d), top: B:41:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008d A[Catch: all -> 0x000a, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:10:0x000d, B:12:0x001f, B:14:0x0025, B:15:0x002f, B:17:0x0035, B:21:0x004a, B:24:0x005e, B:25:0x0066, B:27:0x006c, B:29:0x0080, B:31:0x0086, B:36:0x008d), top: B:41:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void t(android.view.View r4, java.util.Map r5, java.util.Map r6, boolean r7) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f5292y     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto Ld
            r3.j(r4, r5, r6)     // Catch: java.lang.Throwable -> La
            monitor-exit(r3)
            return
        La:
            r4 = move-exception
            goto L95
        Ld:
            com.google.android.gms.internal.ads.wk r0 = com.google.android.gms.internal.ads.al.f3027h2     // Catch: java.lang.Throwable -> La
            q9.s r1 = q9.s.f31967e     // Catch: java.lang.Throwable -> La
            com.google.android.gms.internal.ads.yk r1 = r1.f31970c     // Catch: java.lang.Throwable -> La
            java.lang.Object r0 = r1.a(r0)     // Catch: java.lang.Throwable -> La
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> La
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L48
            com.google.android.gms.internal.ads.xp0 r0 = r3.f9697b     // Catch: java.lang.Throwable -> La
            boolean r0 = r0.f12246k0     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L48
            java.util.HashMap r0 = r3.H     // Catch: java.lang.Throwable -> La
            java.util.Set r1 = r0.keySet()     // Catch: java.lang.Throwable -> La
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> La
        L2f:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> La
            if (r2 == 0) goto L48
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> La
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> La
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> La
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> La
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> La
            if (r2 != 0) goto L2f
            goto L8b
        L48:
            if (r7 != 0) goto L8d
            com.google.android.gms.internal.ads.wk r7 = com.google.android.gms.internal.ads.al.C4     // Catch: java.lang.Throwable -> La
            q9.s r0 = q9.s.f31967e     // Catch: java.lang.Throwable -> La
            com.google.android.gms.internal.ads.yk r0 = r0.f31970c     // Catch: java.lang.Throwable -> La
            java.lang.Object r7 = r0.a(r7)     // Catch: java.lang.Throwable -> La
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> La
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> La
            if (r7 == 0) goto L8b
            if (r5 == 0) goto L8b
            java.util.Set r7 = r5.entrySet()     // Catch: java.lang.Throwable -> La
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> La
        L66:
            boolean r0 = r7.hasNext()     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L8b
            java.lang.Object r0 = r7.next()     // Catch: java.lang.Throwable -> La
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> La
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> La
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0     // Catch: java.lang.Throwable -> La
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> La
            android.view.View r0 = (android.view.View) r0     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L66
            boolean r0 = d(r0)     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L66
            r3.i(r4, r5, r6)     // Catch: java.lang.Throwable -> La
            monitor-exit(r3)
            return
        L8b:
            monitor-exit(r3)
            return
        L8d:
            r3.i(r4, r5, r6)     // Catch: java.lang.Throwable -> La
            r3.j(r4, r5, r6)     // Catch: java.lang.Throwable -> La
            monitor-exit(r3)
            return
        L95:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> La
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fa0.t(android.view.View, java.util.Map, java.util.Map, boolean):void");
    }
}
