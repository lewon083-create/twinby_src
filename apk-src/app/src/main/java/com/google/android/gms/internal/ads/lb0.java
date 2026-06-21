package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import com.twinby.R;
import io.sentry.SentryLogEvent;
import java.util.HashMap;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lb0 implements Callable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f7476e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f7477f;

    public /* synthetic */ lb0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f7473b = i;
        this.f7474c = obj;
        this.f7475d = obj2;
        this.f7476e = obj3;
        this.f7477f = obj4;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws rj0 {
        Bundle bundle;
        switch (this.f7473b) {
            case 0:
                cw cwVar = (cw) this.f7474c;
                eq0 eq0Var = (eq0) this.f7475d;
                xp0 xp0Var = (xp0) this.f7476e;
                JSONObject jSONObject = (JSONObject) this.f7477f;
                if (((Boolean) q9.s.f31967e.f31970c.a(al.I2)).booleanValue()) {
                    a0.u.u(p9.k.C.f31304k, ((qd0) cwVar.f4350f).f9463e, "native-assets-loading-basic-start");
                }
                ja0 ja0Var = new ja0();
                int iOptInt = jSONObject.optInt("template_id", -1);
                synchronized (ja0Var) {
                    ja0Var.f6766a = iOptInt;
                }
                String strOptString = jSONObject.optString("custom_template_id");
                synchronized (ja0Var) {
                    ja0Var.f6785u = strOptString;
                }
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("omid_settings");
                String strOptString2 = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("omid_partner_name") : null;
                synchronized (ja0Var) {
                    ja0Var.f6789y = strOptString2;
                }
                iq0 iq0Var = (iq0) eq0Var.f5032a.f9149c;
                if (!iq0Var.f6576h.contains(Integer.toString(ja0Var.q()))) {
                    int iQ = ja0Var.q();
                    throw new rj0(1, l7.o.j(iQ, "Invalid template ID: ", new StringBuilder(String.valueOf(iQ).length() + 21)));
                }
                if (ja0Var.q() == 3) {
                    if (ja0Var.g() == null) {
                        throw new rj0(1, "No custom template id for custom template ad response.");
                    }
                    if (!iq0Var.i.contains(ja0Var.g())) {
                        throw new rj0(1, "Unexpected custom template id in the response.");
                    }
                }
                double dOptDouble = jSONObject.optDouble("rating", -1.0d);
                synchronized (ja0Var) {
                    ja0Var.f6782r = dOptDouble;
                }
                String strOptString3 = jSONObject.optString("headline", null);
                if (xp0Var.M) {
                    p9.k kVar = p9.k.C;
                    t9.g0 g0Var = kVar.f31297c;
                    Resources resourcesC = kVar.f31302h.c();
                    String string = resourcesC != null ? resourcesC.getString(R.string.s7) : "Test Ad";
                    strOptString3 = t.z.g(new StringBuilder(String.valueOf(string).length() + 3 + String.valueOf(strOptString3).length()), string, " : ", strOptString3);
                }
                ja0Var.o("headline", strOptString3);
                ja0Var.o(SentryLogEvent.JsonKeys.BODY, jSONObject.optString(SentryLogEvent.JsonKeys.BODY, null));
                ja0Var.o("call_to_action", jSONObject.optString("call_to_action", null));
                ja0Var.o("store", jSONObject.optString("store", null));
                ja0Var.o("price", jSONObject.optString("price", null));
                ja0Var.o("advertiser", jSONObject.optString("advertiser", null));
                return ja0Var;
            case 1:
                if (((Boolean) q9.s.f31967e.f31970c.a(al.B2)).booleanValue() && (bundle = ((ku) this.f7474c).f7308n) != null) {
                    a0.u.u(p9.k.C.f31304k, bundle, "http-response-ready");
                }
                return new vg0((zg0) ((or0) this.f7475d).f8767d.get(), (JSONObject) ((or0) this.f7476e).f8767d.get(), (lu) ((or0) this.f7477f).f8767d.get());
            case 2:
                View view = (View) this.f7476e;
                Activity activity = (Activity) this.f7477f;
                e11 e11Var = (e11) this.f7474c;
                Context context = (Context) this.f7475d;
                j21 j21Var = e11Var.f4790d;
                yv0 yv0VarB = e11Var.f4787a.b();
                if (yv0VarB == null) {
                    j21Var.b(15004);
                    return "";
                }
                String strE = yv0VarB.e(context, view, activity);
                if (strE != null) {
                    return strE;
                }
                j21Var.b(15007);
                return "";
            case 3:
                e11 e11Var2 = (e11) this.f7474c;
                Context context2 = (Context) this.f7475d;
                String str = (String) this.f7476e;
                View view2 = (View) this.f7477f;
                j21 j21Var2 = e11Var2.f4790d;
                yv0 yv0VarB2 = e11Var2.f4787a.b();
                if (yv0VarB2 == null) {
                    j21Var2.b(15004);
                    return "";
                }
                String strG = yv0VarB2.g(context2, str, view2, null);
                if (strG != null) {
                    return strG;
                }
                j21Var2.b(15008);
                return "";
            case 4:
                View view3 = (View) this.f7476e;
                Activity activity2 = (Activity) this.f7477f;
                g11 g11Var = (g11) this.f7474c;
                Context context3 = (Context) this.f7475d;
                HashMap map = new HashMap();
                g11Var.f5599e.f(20106, new wy(g11Var, map, context3, view3, activity2));
                String strF = g11Var.f(map);
                map.clear();
                return strF;
            case 5:
                g11 g11Var2 = (g11) this.f7474c;
                Context context4 = (Context) this.f7475d;
                String str2 = (String) this.f7476e;
                View view4 = (View) this.f7477f;
                HashMap map2 = new HashMap();
                g11Var2.f5599e.f(20106, new wy(g11Var2, map2, context4, view4, str2));
                String strF2 = g11Var2.f(map2);
                map2.clear();
                return strF2;
            default:
                ((t11) this.f7474c).f10464a.a((bz0) this.f7475d, (byte[]) this.f7476e, (byte[]) this.f7477f);
                return null;
        }
    }
}
