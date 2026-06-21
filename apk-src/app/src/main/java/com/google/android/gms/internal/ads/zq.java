package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import io.sentry.ProfilingTraceData;
import io.sentry.protocol.Response;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zq implements z71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13076c;

    public /* synthetic */ zq(int i, Object obj, Object obj2) {
        this.f13074a = i;
        this.f13075b = obj;
        this.f13076c = obj2;
    }

    @Override // com.google.android.gms.internal.ads.z71
    public final ed.d a(Object obj) throws JSONException, c7.k {
        rj0 rj0Var;
        yq0 yq0Var = null;
        int i = 0;
        switch (this.f13074a) {
            case 0:
                sq sqVar = (sq) obj;
                sqVar.j((String) this.f13075b, (vo) this.f13076c);
                return vv.d(sqVar);
            case 1:
                cr crVar = (cr) this.f13075b;
                Object obj2 = this.f13076c;
                jx jxVar = new jx();
                t9.g0 g0Var = p9.k.C.f31297c;
                String string = UUID.randomUUID().toString();
                uo.f11019j.a(string, new cp(crVar, jxVar));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", string);
                jSONObject.put("args", (JSONObject) obj2);
                eq eqVar = (eq) ((sq) obj);
                eqVar.getClass();
                eqVar.g("google.afma.activeView.handleUpdate", jSONObject.toString());
                return jxVar;
            case 2:
                w20 w20Var = (w20) this.f13075b;
                Uri.Builder builder = (Uri.Builder) this.f13076c;
                ((gx) w20Var.f11600e).a(new v20(w20Var, (Throwable) obj, 0));
                builder.appendQueryParameter((String) q9.s.f31967e.f31970c.a(al.f3243vb), "9");
                return vv.d(builder.toString());
            case 3:
                b50 b50Var = (b50) this.f13075b;
                ku kuVar = (ku) obj;
                kuVar.f7304j = (xq0) this.f13076c;
                oq0 oq0Var = b50Var.f3625h;
                return oq0Var.B(kuVar, new kx0(21, (jg0) oq0Var.f8763d), new ox0(25, oq0Var), new xf0(kuVar, 2));
            case 4:
                xb0 xb0Var = (xb0) this.f13075b;
                JSONObject jSONObject2 = (JSONObject) this.f13076c;
                sz szVar = (sz) obj;
                wp wpVar = xb0Var.f12099a.f6570b;
                ni niVar = new ni(szVar);
                if (wpVar != null) {
                    szVar.W0(new j0(5, 0, 0));
                } else {
                    szVar.W0(new j0(4, 0, 0));
                }
                szVar.q0().f7062h = new wb0(xb0Var, szVar, niVar, 1);
                szVar.a("google.afma.nativeAds.renderVideo", jSONObject2);
                return niVar;
            case 5:
                cg0 cg0Var = (cg0) this.f13075b;
                yq yqVar = (yq) this.f13076c;
                JSONObject jSONObject3 = (JSONObject) obj;
                if (((Boolean) q9.s.f31967e.f31970c.a(al.D2)).booleanValue()) {
                    a0.u.u(p9.k.C.f31304k, cg0Var.i.f9463e, "scar-preloader-processing-done");
                }
                return yqVar.b(jSONObject3);
            case 6:
                cg0 cg0Var2 = (cg0) this.f13075b;
                List list = (List) this.f13076c;
                Exception exc = (Exception) obj;
                p9.k.C.f31302h.e("PreloadedLoader.getTypeTwoAdResponseString", exc);
                if (exc instanceof TimeoutException) {
                    rj0Var = new rj0(1, "Timed out waiting for ad response.");
                } else if (exc instanceof rj0) {
                    rj0Var = (rj0) exc;
                } else {
                    rj0Var = new rj0(1, exc.getMessage() == null ? "Fetch failed." : exc.getMessage());
                }
                String message = rj0Var.getMessage() == null ? "" : rj0Var.getMessage();
                if (list != null && !list.isEmpty()) {
                    String str = "0.6.0.0";
                    if (!TextUtils.isEmpty(message)) {
                        if (message.contains("Timed out waiting for ad response.")) {
                            message = ProfilingTraceData.TRUNCATION_REASON_TIMEOUT;
                            str = "0.2.0.0";
                        } else if (message.contains("Received HTTP error code from ad server:")) {
                            List listJ = xo0.c(new b31(':')).j(message);
                            if (listJ.size() == 2) {
                                message = (String) listJ.get(1);
                            }
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(at0.c(at0.c((String) it.next(), "@gw_adnetstatus@", str), "@error_code@", message));
                    }
                    cg0Var2.f4209j.a(arrayList, null);
                }
                return vv.y(rj0Var);
            case 7:
                return ((ng0) ((qs1) this.f13075b).j()).c((ku) this.f13076c);
            case 8:
                Bundle bundle = (Bundle) obj;
                cw cwVar = (cw) this.f13075b;
                d8.e0 e0Var = (d8.e0) cwVar.f4347c;
                n10 n10Var = (n10) cwVar.f4350f;
                Context context = n10Var.f8102a.f12809b;
                gr.G(context);
                gx gxVar = hx.f6279a;
                gr.G(gxVar);
                ku kuVar2 = (ku) e0Var.f15621d;
                gr.G(kuVar2.f7300e);
                eo0 eo0Var = new eo0();
                ls1 ls1Var = n10Var.f8108d;
                hl0 hl0Var = new hl0(eo0Var, 0L, (ScheduledExecutorService) ls1Var.j());
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) ls1Var.j();
                Context context2 = n10Var.f8102a.f12809b;
                gr.G(context2);
                hl0 hl0Var2 = new hl0(new dl0(6, scheduledExecutorService), ((Long) q9.s.f31967e.f31970c.a(al.U4)).longValue(), (ScheduledExecutorService) ls1Var.j());
                vw vwVar = new vw();
                gr.G(context2);
                hl0 hl0Var3 = new hl0(new zn0(vwVar, context2, (ScheduledExecutorService) ls1Var.j(), gxVar, e0Var.f15620c, kuVar2.f7307m, kuVar2.f7306l), 0L, (ScheduledExecutorService) ls1Var.j());
                hl0 hl0Var4 = new hl0(new jm0(gxVar, 5), 0L, (ScheduledExecutorService) ls1Var.j());
                jm0 jm0Var = new jm0(gxVar, 4);
                gr.G(gxVar);
                List list2 = ((ku) e0Var.f15621d).f7301f;
                gr.G(list2);
                tl0 tl0Var = new tl0(7, gxVar, list2);
                d8.e0 e0Var2 = (d8.e0) cwVar.f4347c;
                gx gxVar2 = hx.f6279a;
                gr.G(gxVar2);
                ku kuVar3 = (ku) e0Var2.f15621d;
                String string2 = kuVar3.f7297b.getString("ms");
                if (string2 == null) {
                    string2 = "";
                }
                PackageInfo packageInfo = kuVar3.f7302g;
                tl0 tl0Var2 = new tl0(6, gxVar2, string2);
                pn0 pn0Var = (pn0) n10Var.O0.j();
                ls1 ls1Var2 = n10Var.B;
                gr.G(kuVar2.f7300e);
                return new sn0(context, gxVar, d51.p(hl0Var, hl0Var2, hl0Var3, hl0Var4, jm0Var, tl0Var, tl0Var2, pn0Var, new ml0((bx) ls1Var2.j(), (ScheduledExecutorService) ls1Var.j(), gxVar), new io0((bx) ls1Var2.j(), kuVar2.f7306l, gxVar, (ScheduledExecutorService) ls1Var.j(), e0Var.v(), kuVar2.f7310p)), (as0) ((ls1) cwVar.f4348d).j(), (sd0) n10Var.f8118j.j()).f(q9.r.f31959g.f31960a.l(bundle), ((ku) this.f13076c).f7308n, false);
            case 9:
                return ((sn0) this.f13075b).f(q9.r.f31959g.f31960a.l((Bundle) obj), ((ku) this.f13076c).f7308n, false);
            case 10:
                dj0 dj0Var = (dj0) this.f13075b;
                kc0 kc0Var = (kc0) this.f13076c;
                JSONObject jSONObject4 = (JSONObject) obj;
                qq0 qq0Var = dj0Var.f4579d;
                n81 n81VarD = vv.d(kc0Var);
                synchronized (qq0Var) {
                    qq0Var.f9577a.addFirst(n81VarD);
                }
                if (!jSONObject4.optBoolean("success")) {
                    throw new c7.k("process json failed");
                }
                if (((Boolean) q9.s.f31967e.f31970c.a(al.D2)).booleanValue()) {
                    a0.u.u(p9.k.C.f31304k, dj0Var.f4581f.f9463e, "rendering-native-ads-preprocess-end");
                }
                return vv.d(jSONObject4.getJSONObject("json").getJSONArray("ads"));
            case 11:
                dj0 dj0Var2 = (dj0) this.f13075b;
                xp0 xp0Var = (xp0) this.f13076c;
                kc0 kc0Var2 = (kc0) obj;
                wk wkVar = al.D2;
                q9.s sVar = q9.s.f31967e;
                if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue()) {
                    a0.u.u(p9.k.C.f31304k, dj0Var2.f4581f.f9463e, "rendering-native-ads-preprocess-start");
                }
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("isNonagon", true);
                if (((Boolean) sVar.f31970c.a(al.M9)).booleanValue() && ua.b.i()) {
                    jSONObject5.put("skipDeepLinkValidation", true);
                }
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put(Response.TYPE, xp0Var.f12260s.f3854c);
                jSONObject6.put("sdk_params", jSONObject5);
                return vv.J(kc0Var2.a("google.afma.nativeAds.preProcessJson", jSONObject6), new zq(10, dj0Var2, kc0Var2), dj0Var2.f4577b);
            case 12:
                eq0 eq0Var = (eq0) obj;
                ((yq0) this.f13075b).f12688b = eq0Var;
                Iterator it2 = ((List) eq0Var.f5033b.f4347c).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Iterator it3 = ((xp0) it2.next()).f12227a.iterator();
                        while (it3.hasNext()) {
                            if (((String) it3.next()).contains("FirstPartyRenderer")) {
                                i = 1;
                            }
                        }
                    } else if (i != 0) {
                        return ((b50) this.f13076c).c(vv.d(eq0Var));
                    }
                }
                return n81.f8237c;
            case 13:
                oq0 oq0Var2 = (oq0) this.f13075b;
                z50 z50Var = (z50) this.f13076c;
                ap0 ap0Var = (ap0) obj;
                oq0 oq0Var3 = (oq0) oq0Var2.f8762c;
                zq0 zq0Var = ap0Var.f3350b;
                ku kuVar4 = ap0Var.f3349a;
                synchronized (oq0Var3) {
                    try {
                        tq0 tq0Var = (tq0) ((ConcurrentHashMap) oq0Var3.f8762c).get(zq0Var);
                        if (tq0Var != null) {
                            gr0 gr0Var = tq0Var.f10698d;
                            gr0Var.getClass();
                            p9.k.C.f31304k.getClass();
                            gr0Var.f5894c = System.currentTimeMillis();
                            gr0Var.f5895d++;
                            tq0Var.a();
                            LinkedList linkedList = tq0Var.f10695a;
                            if (!linkedList.isEmpty() && (yq0Var = (yq0) linkedList.remove()) != null) {
                                gr0Var.f5896e++;
                                gr0Var.f5893b.f5423b = true;
                            }
                            if (yq0Var == null) {
                                ((vq0) oq0Var3.f8764e).f11444d++;
                            }
                            fr0 fr0Var = tq0Var.f10698d.f5893b;
                            fr0 fr0VarClone = fr0Var.clone();
                            fr0Var.f5423b = false;
                            fr0Var.f5424c = 0;
                            if (yq0Var != null) {
                                rj rjVarZ = wj.z();
                                pj pjVarA = qj.A();
                                pjVarA.b();
                                ((qj) pjVarA.f9560c).B();
                                sj sjVarZ = tj.z();
                                boolean z5 = fr0VarClone.f5423b;
                                sjVarZ.b();
                                ((tj) sjVarZ.f9560c).B(z5);
                                int i10 = fr0VarClone.f5424c;
                                sjVarZ.b();
                                ((tj) sjVarZ.f9560c).C(i10);
                                pjVarA.b();
                                ((qj) pjVarA.f9560c).C((tj) sjVarZ.d());
                                rjVarZ.b();
                                ((wj) rjVarZ.f9560c).A((qj) pjVarA.d());
                                yq0Var.f12687a.h().f3623f.y((wj) rjVarZ.d());
                            }
                            oq0Var3.A();
                        } else {
                            ((vq0) oq0Var3.f8764e).f11443c++;
                            oq0Var3.A();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (yq0Var != null && kuVar4 != null) {
                    b50 b50VarH = z50Var.h();
                    oq0 oq0Var4 = b50VarH.f3625h;
                    int i11 = 24;
                    or0 or0VarR = b50VarH.f3620c.a(oq0Var4.B(kuVar4, new cf(i11, oq0Var4), new gk0(i11, oq0Var4), n20.f8157f), pr0.NOTIFY_CACHE_HIT).r();
                    or0VarR.a(new l81(i, or0VarR, new kx0(13, b50VarH)), b50VarH.f3626j);
                    or0VarR.a(new l81(i, or0VarR, (l80) oq0Var2.f8764e), (Executor) oq0Var2.f8763d);
                }
                return vv.d(new vo0(zq0Var, kuVar4, yq0Var));
            default:
                return ((cz0) ((rx0) this.f13075b).f10078b.f5992g.get()).a((Context) this.f13076c);
        }
    }
}
