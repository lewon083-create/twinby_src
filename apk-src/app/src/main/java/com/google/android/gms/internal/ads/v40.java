package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v40 implements z71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f11234d;

    public /* synthetic */ v40(zh0 zh0Var, xp0 xp0Var, eq0 eq0Var, l80 l80Var, int i) {
        this.f11231a = i;
        this.f11232b = zh0Var;
        this.f11233c = xp0Var;
        this.f11234d = eq0Var;
    }

    @Override // com.google.android.gms.internal.ads.z71
    public final ed.d a(Object obj) {
        qd0 qd0Var;
        switch (this.f11231a) {
            case 0:
                x40 x40Var = (x40) this.f11232b;
                z7 z7Var = (z7) this.f11233c;
                ed.d dVar = (ed.d) this.f11234d;
                r40 r40Var = (r40) obj;
                x40Var.getClass();
                if (r40Var != null) {
                    z7Var.mo6i(r40Var);
                }
                return vv.I(dVar, ((Long) nm.f8365a.r()).longValue(), TimeUnit.MILLISECONDS, x40Var.f12016b);
            case 1:
                xb0 xb0Var = (xb0) this.f11232b;
                p9.a aVar = (p9.a) this.f11233c;
                wv wvVar = (wv) this.f11234d;
                sz szVarA = xb0Var.f12101c.a(q9.g3.c(), null, null);
                ni niVar = new ni(szVarA);
                xb0Var.a(szVarA, aVar, wvVar);
                szVarA.q0().i = new ox0(21, niVar);
                szVarA.loadUrl((String) q9.s.f31967e.f31970c.a(al.f3252w4));
                return niVar;
            case 2:
                kc0 kc0Var = (kc0) this.f11232b;
                String str = (String) this.f11233c;
                JSONObject jSONObject = (JSONObject) this.f11234d;
                sz szVar = (sz) obj;
                so soVar = kc0Var.f7191h;
                soVar.getClass();
                jx jxVar = new jx();
                t9.g0 g0Var = p9.k.C.f31297c;
                String string = UUID.randomUUID().toString();
                soVar.a(string, new cp(soVar, jxVar));
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", string);
                    jSONObject2.put("args", jSONObject);
                    szVar.a(str, jSONObject2);
                    break;
                } catch (Exception e3) {
                    jxVar.d(e3);
                }
                return jxVar;
            case 3:
                hi0 hi0Var = (hi0) this.f11232b;
                xp0 xp0Var = (xp0) this.f11233c;
                eq0 eq0Var = (eq0) this.f11234d;
                qd0 qd0Var2 = hi0Var.i;
                wk wkVar = al.E2;
                yk ykVar = q9.s.f31967e.f31970c;
                if (((Boolean) ykVar.a(wkVar)).booleanValue()) {
                    a0.u.u(p9.k.C.f31304k, qd0Var2.f9463e, "rendering-webview-creation-start");
                }
                yc0 yc0Var = hi0Var.f6148b;
                iq0 iq0Var = hi0Var.f6149c;
                final sz szVarA2 = yc0Var.a(iq0Var.f6574f, xp0Var, (zp0) eq0Var.f5033b.f4348d);
                szVarA2.h1(xp0Var.W);
                if (((Boolean) ykVar.a(wkVar)).booleanValue()) {
                    a0.u.u(p9.k.C.f31304k, qd0Var2.f9463e, "rendering-webview-creation-end");
                }
                jx jxVar2 = new jx();
                q10 q10Var = hi0Var.f6147a;
                oq0 oq0Var = new oq0(eq0Var, xp0Var, (String) null);
                u9.a aVar2 = hi0Var.f6151e;
                boolean z5 = hi0Var.f6153g;
                xo xoVar = hi0Var.f6152f;
                o10 o10Var = new o10(q10Var.f9260c, q10Var.f9261d, oq0Var, new ut(12, new ji0(aVar2, jxVar2, xp0Var, szVarA2, iq0Var, z5, xoVar, hi0Var.f6154h, hi0Var.f6155j), szVarA2), new l7.n(xp0Var.f12228a0, 2));
                if (((Boolean) ykVar.a(wkVar)).booleanValue()) {
                    a0.u.u(p9.k.C.f31304k, qd0Var2.f9463e, "rendering-ad-component-creation-end");
                }
                ls1 ls1Var = o10Var.f8567z;
                final int i = 0;
                ((xc0) ls1Var.j()).a(szVarA2, false, true != z5 ? null : xoVar, qd0Var2.f9463e);
                jxVar2.b(o10Var);
                ((q60) o10Var.f8554m.j()).x1(new r60() { // from class: com.google.android.gms.internal.ads.gi0
                    @Override // com.google.android.gms.internal.ads.r60
                    public final /* synthetic */ void z() {
                        switch (i) {
                            case 0:
                                sz szVar2 = szVarA2;
                                if (szVar2.q0() != null) {
                                    szVar2.q0().E();
                                }
                                break;
                            case 1:
                                sz szVar3 = szVarA2;
                                if (szVar3.q0() != null) {
                                    szVar3.q0().E();
                                }
                                break;
                            case 2:
                                sz szVar4 = szVarA2;
                                if (szVar4.q0() != null) {
                                    szVar4.q0().E();
                                }
                                break;
                            default:
                                sz szVar5 = szVarA2;
                                if (szVar5.q0() != null) {
                                    szVar5.q0().E();
                                }
                                break;
                        }
                    }
                }, hx.f6285g);
                bq0 bq0Var = xp0Var.f12260s;
                String strA = bq0Var.f3852a;
                if (((Boolean) ykVar.a(al.f2969d6)).booleanValue() && ((vh0) o10Var.f8553l.j()).a()) {
                    strA = n00.a(strA, n00.b(xp0Var));
                }
                return vv.K(xc0.b(szVarA2, bq0Var.f3853b, strA, qd0Var2.f9463e, (as0) q10Var.f9263f.j()), new o50(szVarA2, xp0Var, o10Var, 1), hi0Var.f6150d);
            case 4:
                qi0 qi0Var = (qi0) this.f11232b;
                eq0 eq0Var2 = (eq0) this.f11233c;
                xp0 xp0Var2 = (xp0) this.f11234d;
                Executor executor = qi0Var.f9512e;
                qd0 qd0Var3 = qi0Var.f9514g;
                wk wkVar2 = al.E2;
                yk ykVar2 = q9.s.f31967e.f31970c;
                if (((Boolean) ykVar2.a(wkVar2)).booleanValue()) {
                    a0.u.u(p9.k.C.f31304k, qd0Var3.f9463e, "rendering-webview-creation-start");
                }
                Context context = qi0Var.f9509b;
                q9.g3 g3VarH = fs1.h(context, xp0Var2.f12264u);
                final sz szVarA3 = qi0Var.f9510c.a(g3VarH, xp0Var2, (zp0) eq0Var2.f5033b.f4348d);
                szVarA3.h1(xp0Var2.W);
                View viewA = (((Boolean) ykVar2.a(al.U8)).booleanValue() && xp0Var2.f12240g0) ? h40.a(context, szVarA3.i0(), xp0Var2) : new ad0(context, szVarA3.i0(), (t9.i) qi0Var.f9513f.apply(xp0Var2));
                if (((Boolean) ykVar2.a(wkVar2)).booleanValue()) {
                    a0.u.u(p9.k.C.f31304k, qd0Var3.f9463e, "rendering-webview-creation-end");
                }
                s10 s10Var = qi0Var.f9508a;
                r10 r10Var = new r10(s10Var.f10129d, s10Var.f10131e, new oq0(eq0Var2, xp0Var2, (String) null), new cw(viewA, szVarA3, new pi0(szVarA3), g3VarH.f31882j ? new yp0(-3, 0, true) : new yp0(g3VarH.f31879f, g3VarH.f31876c, false)));
                if (((Boolean) ykVar2.a(wkVar2)).booleanValue()) {
                    a0.u.u(p9.k.C.f31304k, qd0Var3.f9463e, "rendering-ad-component-creation-end");
                }
                ls1 ls1Var2 = r10Var.C;
                ((xc0) ls1Var2.j()).a(szVarA3, false, null, qd0Var3.f9463e);
                q60 q60Var = (q60) r10Var.f9666q.j();
                final int i10 = 1;
                r60 r60Var = new r60() { // from class: com.google.android.gms.internal.ads.gi0
                    @Override // com.google.android.gms.internal.ads.r60
                    public final /* synthetic */ void z() {
                        switch (i10) {
                            case 0:
                                sz szVar2 = szVarA3;
                                if (szVar2.q0() != null) {
                                    szVar2.q0().E();
                                }
                                break;
                            case 1:
                                sz szVar3 = szVarA3;
                                if (szVar3.q0() != null) {
                                    szVar3.q0().E();
                                }
                                break;
                            case 2:
                                sz szVar4 = szVarA3;
                                if (szVar4.q0() != null) {
                                    szVar4.q0().E();
                                }
                                break;
                            default:
                                sz szVar5 = szVarA3;
                                if (szVar5.q0() != null) {
                                    szVar5.q0().E();
                                }
                                break;
                        }
                    }
                };
                gx gxVar = hx.f6285g;
                q60Var.x1(r60Var, gxVar);
                bq0 bq0Var2 = xp0Var2.f12260s;
                String strA2 = bq0Var2.f3852a;
                if (((Boolean) ykVar2.a(al.f2969d6)).booleanValue() && ((vh0) r10Var.f9664o.j()).a()) {
                    strA2 = n00.a(strA2, n00.b(xp0Var2));
                }
                jx jxVarB = xc0.b(szVarA3, bq0Var2.f3853b, strA2, qd0Var3.f9463e, (as0) s10Var.f10140l.j());
                y81 y81Var = jxVarB.f6961b;
                if (xp0Var2.M) {
                    y81Var.a(new c00(szVarA3, 7), executor);
                }
                y81Var.a(new th0(1, qi0Var, szVarA3), executor);
                return vv.K(jxVarB, new ju(2, r10Var), gxVar);
            case 5:
                return vv.d(h40.a(((li0) this.f11232b).f7534b, (View) this.f11233c, (xp0) this.f11234d));
            case 6:
                return vv.d(h40.a(((ti0) this.f11232b).f10622b, (View) this.f11233c, (xp0) this.f11234d));
            case 7:
                zi0 zi0Var = (zi0) this.f11232b;
                xp0 xp0Var3 = (xp0) this.f11233c;
                eq0 eq0Var3 = (eq0) this.f11234d;
                qd0 qd0Var4 = zi0Var.f13004j;
                wk wkVar3 = al.E2;
                yk ykVar3 = q9.s.f31967e.f31970c;
                if (((Boolean) ykVar3.a(wkVar3)).booleanValue()) {
                    a0.u.u(p9.k.C.f31304k, qd0Var4.f9463e, "rendering-webview-creation-start");
                }
                yc0 yc0Var2 = zi0Var.f12998c;
                iq0 iq0Var2 = zi0Var.f12999d;
                final sz szVarA4 = yc0Var2.a(iq0Var2.f6574f, xp0Var3, (zp0) eq0Var3.f5033b.f4348d);
                szVarA4.h1(xp0Var3.W);
                if (((Boolean) ykVar3.a(wkVar3)).booleanValue()) {
                    a0.u.u(p9.k.C.f31304k, qd0Var4.f9463e, "rendering-webview-creation-end");
                }
                jx jxVar3 = new jx();
                w10 w10Var = (w10) zi0Var.f13006l;
                oq0 oq0Var2 = new oq0(eq0Var3, xp0Var3, (String) null);
                Context context2 = zi0Var.f12997b;
                u9.a aVar3 = zi0Var.f13001f;
                boolean z10 = zi0Var.f13003h;
                xo xoVar2 = zi0Var.f13002g;
                v10 v10Var = new v10(w10Var.f11572b, w10Var.f11573c, oq0Var2, new ut(12, new yi0(context2, aVar3, jxVar3, xp0Var3, szVarA4, iq0Var2, z10, xoVar2, zi0Var.i, zi0Var.f13005k), szVarA4));
                jxVar3.b(v10Var);
                if (((Boolean) ykVar3.a(wkVar3)).booleanValue()) {
                    qd0Var = qd0Var4;
                    a0.u.u(p9.k.C.f31304k, qd0Var.f9463e, "rendering-ad-component-creation-end");
                } else {
                    qd0Var = qd0Var4;
                }
                final int i11 = 2;
                ((q60) v10Var.f11190l.j()).x1(new r60() { // from class: com.google.android.gms.internal.ads.gi0
                    @Override // com.google.android.gms.internal.ads.r60
                    public final /* synthetic */ void z() {
                        switch (i11) {
                            case 0:
                                sz szVar2 = szVarA4;
                                if (szVar2.q0() != null) {
                                    szVar2.q0().E();
                                }
                                break;
                            case 1:
                                sz szVar3 = szVarA4;
                                if (szVar3.q0() != null) {
                                    szVar3.q0().E();
                                }
                                break;
                            case 2:
                                sz szVar4 = szVarA4;
                                if (szVar4.q0() != null) {
                                    szVar4.q0().E();
                                }
                                break;
                            default:
                                sz szVar5 = szVarA4;
                                if (szVar5.q0() != null) {
                                    szVar5.q0().E();
                                }
                                break;
                        }
                    }
                }, hx.f6285g);
                bq0 bq0Var3 = xp0Var3.f12260s;
                String strA3 = bq0Var3.f3852a;
                if (((Boolean) ykVar3.a(al.f2969d6)).booleanValue() && ((vh0) v10Var.f11189k.j()).a()) {
                    strA3 = n00.a(strA3, n00.b(xp0Var3));
                }
                ls1 ls1Var3 = v10Var.B;
                ((xc0) ls1Var3.j()).a(szVarA4, true, true != z10 ? null : xoVar2, qd0Var.f9463e);
                return vv.K(xc0.b(szVarA4, bq0Var3.f3853b, strA3, qd0Var.f9463e, (as0) w10Var.i.j()), new o50(szVarA4, xp0Var3, v10Var, 2), zi0Var.f13000e);
            case 8:
                dj0 dj0Var = (dj0) this.f11232b;
                eq0 eq0Var4 = (eq0) this.f11233c;
                xp0 xp0Var4 = (xp0) this.f11234d;
                JSONArray jSONArray = (JSONArray) obj;
                if (jSONArray.length() == 0) {
                    return vv.y(new uf0(3));
                }
                int i12 = ((iq0) eq0Var4.f5032a.f9149c).f6579l;
                if (i12 <= 1) {
                    return vv.K(dj0Var.c(eq0Var4, xp0Var4, jSONArray.getJSONObject(0)), u5.f10824k, dj0Var.f4577b);
                }
                int length = jSONArray.length();
                if (((Boolean) q9.s.f31967e.f31970c.a(al.F2)).booleanValue()) {
                    dj0Var.f4581f.b("nsl", String.valueOf(length));
                }
                dj0Var.f4579d.a(Math.min(length, i12));
                ArrayList arrayList = new ArrayList(i12);
                for (int i13 = 0; i13 < i12; i13++) {
                    if (i13 < length) {
                        arrayList.add(dj0Var.c(eq0Var4, xp0Var4, jSONArray.getJSONObject(i13)));
                    } else {
                        arrayList.add(vv.y(new uf0(3)));
                    }
                }
                return vv.d(arrayList);
            default:
                zi0 zi0Var2 = (zi0) this.f11232b;
                xp0 xp0Var5 = (xp0) this.f11233c;
                eq0 eq0Var5 = (eq0) this.f11234d;
                qd0 qd0Var5 = zi0Var2.f13004j;
                wk wkVar4 = al.E2;
                yk ykVar4 = q9.s.f31967e.f31970c;
                if (((Boolean) ykVar4.a(wkVar4)).booleanValue()) {
                    a0.u.u(p9.k.C.f31304k, qd0Var5.f9463e, "rendering-webview-creation-start");
                }
                yc0 yc0Var3 = zi0Var2.f12998c;
                iq0 iq0Var3 = zi0Var2.f12999d;
                final sz szVarA5 = yc0Var3.a(iq0Var3.f6574f, xp0Var5, (zp0) eq0Var5.f5033b.f4348d);
                szVarA5.h1(xp0Var5.W);
                if (((Boolean) ykVar4.a(wkVar4)).booleanValue()) {
                    a0.u.u(p9.k.C.f31304k, qd0Var5.f9463e, "rendering-webview-creation-end");
                }
                jx jxVar4 = new jx();
                z10 z10Var = (z10) zi0Var2.f13006l;
                oq0 oq0Var3 = new oq0(eq0Var5, xp0Var5, (String) null);
                Context context3 = zi0Var2.f12997b;
                u9.a aVar4 = zi0Var2.f13001f;
                xo xoVar3 = zi0Var2.f13002g;
                boolean z11 = zi0Var2.f13003h;
                ph0 ph0Var = zi0Var2.i;
                qd0 qd0Var6 = zi0Var2.f13004j;
                y10 y10Var = new y10(z10Var.f12821c, z10Var.f12822d, oq0Var3, new sc0(new xj0(context3, yc0Var3, iq0Var3, aVar4, xp0Var5, jxVar4, szVarA5, xoVar3, z11, ph0Var, qd0Var6, zi0Var2.f13005k), szVarA5, 0));
                jxVar4.b(y10Var);
                if (((Boolean) ykVar4.a(wkVar4)).booleanValue()) {
                    a0.u.u(p9.k.C.f31304k, qd0Var6.f9463e, "rendering-ad-component-creation-end");
                }
                szVarA5.u0("/reward", new ko(5, (y80) y10Var.A.j()));
                final int i14 = 3;
                ((q60) y10Var.f12444l.j()).x1(new r60() { // from class: com.google.android.gms.internal.ads.gi0
                    @Override // com.google.android.gms.internal.ads.r60
                    public final /* synthetic */ void z() {
                        switch (i14) {
                            case 0:
                                sz szVar2 = szVarA5;
                                if (szVar2.q0() != null) {
                                    szVar2.q0().E();
                                }
                                break;
                            case 1:
                                sz szVar3 = szVarA5;
                                if (szVar3.q0() != null) {
                                    szVar3.q0().E();
                                }
                                break;
                            case 2:
                                sz szVar4 = szVarA5;
                                if (szVar4.q0() != null) {
                                    szVar4.q0().E();
                                }
                                break;
                            default:
                                sz szVar5 = szVarA5;
                                if (szVar5.q0() != null) {
                                    szVar5.q0().E();
                                }
                                break;
                        }
                    }
                }, hx.f6285g);
                ls1 ls1Var4 = y10Var.B;
                ((xc0) ls1Var4.j()).a(szVarA5, true, true != z11 ? null : xoVar3, qd0Var6.f9463e);
                bq0 bq0Var4 = xp0Var5.f12260s;
                String strA4 = bq0Var4.f3852a;
                if (((Boolean) ykVar4.a(al.f2969d6)).booleanValue() && ((vh0) y10Var.f12443k.j()).a()) {
                    strA4 = n00.a(strA4, n00.b(xp0Var5));
                }
                return vv.K(xc0.b(szVarA5, bq0Var4.f3853b, strA4, qd0Var6.f9463e, (as0) z10Var.f12825g.j()), new o50(szVarA5, xp0Var5, y10Var, 3), zi0Var2.f13000e);
        }
    }

    public /* synthetic */ v40(Object obj, Object obj2, Object obj3, int i) {
        this.f11231a = i;
        this.f11232b = obj;
        this.f11233c = obj2;
        this.f11234d = obj3;
    }
}
