package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class cg0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Pattern f4200p = Pattern.compile("\\?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n10 f4201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f4202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u9.a f4203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final iq0 f4204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f4205e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f4206f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f4207g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final as0 f4208h;
    public final qd0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final bt0 f4209j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p70 f4210k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f4211l = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f4212m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List f4213n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Bundle f4214o;

    public cg0(n10 n10Var, Context context, u9.a aVar, iq0 iq0Var, gx gxVar, String str, as0 as0Var, qd0 qd0Var, fp fpVar, ScheduledExecutorService scheduledExecutorService, bt0 bt0Var, p70 p70Var) {
        this.f4201a = n10Var;
        this.f4202b = context;
        this.f4203c = aVar;
        this.f4204d = iq0Var;
        this.f4205e = gxVar;
        this.f4207g = str;
        this.f4208h = as0Var;
        this.i = qd0Var;
        this.f4206f = scheduledExecutorService;
        this.f4209j = bt0Var;
        this.f4210k = p70Var;
    }

    public final h71 a(String str, String str2) {
        ed.d dVarD;
        String str3;
        String str4 = "";
        if (TextUtils.isEmpty(str)) {
            return vv.y(new rj0(15, "Invalid ad string."));
        }
        Context context = this.f4202b;
        xr0 xr0VarK = xr0.k(context, 11);
        xr0VarK.h();
        wq wqVarN = p9.k.C.f31311r.n(context, this.f4203c, this.f4201a.c());
        fp fpVar = nz.f8507m;
        yq yqVarA = wqVarN.a("google.afma.response.normalize", fpVar, fpVar);
        boolean zBooleanValue = ((Boolean) q9.s.f31967e.f31970c.a(al.R7)).booleanValue();
        Executor executor = this.f4205e;
        qd0 qd0Var = this.i;
        if (zBooleanValue) {
            try {
                str3 = str;
                try {
                    JSONObject jSONObject = new JSONObject(str3);
                    this.f4212m = jSONObject.optString("fetch_url", "");
                    this.f4213n = com.google.android.gms.internal.measurement.b4.O(new JSONObject(jSONObject.optString("settings", "")).getJSONArray("nofill_urls"), null);
                } catch (JSONException unused) {
                    u9.i.h("Invalid ad response.");
                }
            } catch (JSONException unused2) {
                str3 = str;
            }
            String string = this.f4212m;
            List list = this.f4213n;
            if (TextUtils.isEmpty(string)) {
                dVarD = vv.d(str3);
                qd0Var.b("sst", "1");
            } else {
                qd0Var.b("sst", "2");
                wk wkVar = al.T7;
                q9.s sVar = q9.s.f31967e;
                yk ykVar = sVar.f31970c;
                yk ykVar2 = sVar.f31970c;
                String str5 = (String) ykVar.a(wkVar);
                if (((Boolean) ykVar2.a(al.S7)).booleanValue()) {
                    Pattern pattern = f4200p;
                    d31 d31Var = new d31(pattern);
                    pattern.matcher("").getClass();
                    ix.e0(!r1.matches(), "The pattern may not match the empty string: %s", d31Var);
                    List listJ = new xo0(7, new nu0(3, d31Var)).j(string);
                    if (listJ.size() < 2) {
                        dVarD = vv.y(new rj0(1, "Invalid fetch URL."));
                    } else {
                        str4 = (String) listJ.get(1);
                        t9.g0 g0Var = p9.k.C.f31297c;
                        string = Uri.parse(string).buildUpon().query(null).build().toString();
                        dVarD = vv.H((i81) vv.I(i81.s(hx.f6279a.b(new je(7, this, new yg0(string, str5, str4.getBytes(StandardCharsets.UTF_8), new HashMap(), 60000)))), ((Integer) ykVar2.a(al.U7)).intValue(), TimeUnit.MILLISECONDS, this.f4206f), Exception.class, new zq(6, this, list), executor);
                    }
                } else {
                    dVarD = vv.H((i81) vv.I(i81.s(hx.f6279a.b(new je(7, this, new yg0(string, str5, str4.getBytes(StandardCharsets.UTF_8), new HashMap(), 60000)))), ((Integer) ykVar2.a(al.U7)).intValue(), TimeUnit.MILLISECONDS, this.f4206f), Exception.class, new zq(6, this, list), executor);
                }
            }
        } else {
            dVarD = vv.d(str);
            qd0Var.b("sst", "1");
        }
        r71 r71VarJ = vv.J(vv.J(vv.J(dVarD, new np(8, str2), executor), new zq(5, this, yqVarA), executor), new np(7, this), executor);
        fs1.R(r71VarJ, this.f4208h, xr0VarK, false);
        r71VarJ.a(new l81(0, r71VarJ, new ox0(24, this)), hx.f6285g);
        return r71VarJ;
    }

    public final void b(int i) {
        Bundle bundle = this.i.f9463e;
        if (((Boolean) q9.s.f31967e.f31970c.a(al.W7)).booleanValue()) {
            a0.u.u(p9.k.C.f31304k, bundle, a0.u.c(i));
        }
    }

    public final String c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && "unknown".equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.f4207g));
            }
            return jSONObject.toString();
        } catch (JSONException e3) {
            u9.i.h("Failed to update the ad types for rendering. ".concat(e3.toString()));
            return str;
        }
    }
}
