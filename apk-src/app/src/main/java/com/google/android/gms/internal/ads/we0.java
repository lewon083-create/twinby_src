package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.text.TextUtils;
import io.sentry.Session;
import io.sentry.protocol.SentryThread;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class we0 implements l60, q70, b70 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ff0 f11781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f11783d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e60 f11786g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public q9.x1 f11787h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public JSONObject f11790l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public JSONObject f11791m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f11792n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f11793o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f11794p;
    public String i = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f11788j = "";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f11789k = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11784e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ve0 f11785f = ve0.f11366b;

    public we0(ff0 ff0Var, iq0 iq0Var, String str) {
        this.f11781b = ff0Var;
        this.f11783d = str;
        this.f11782c = iq0Var.f6575g;
    }

    public static JSONObject c(q9.x1 x1Var) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", x1Var.f31978d);
        jSONObject.put("errorCode", x1Var.f31976b);
        jSONObject.put("errorDescription", x1Var.f31977c);
        q9.x1 x1Var2 = x1Var.f31979e;
        jSONObject.put("underlyingError", x1Var2 == null ? null : c(x1Var2));
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final void E(ku kuVar) {
        if (((Boolean) q9.s.f31967e.f31970c.a(al.Da)).booleanValue()) {
            return;
        }
        ff0 ff0Var = this.f11781b;
        if (ff0Var.f()) {
            ff0Var.c(this.f11782c, this);
        }
    }

    @Override // com.google.android.gms.internal.ads.b70
    public final void H(r40 r40Var) {
        ff0 ff0Var = this.f11781b;
        if (ff0Var.f()) {
            this.f11786g = r40Var.f9701f;
            this.f11785f = ve0.f11367c;
            if (((Boolean) q9.s.f31967e.f31970c.a(al.Da)).booleanValue()) {
                ff0Var.c(this.f11782c, this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.l60
    public final void K(q9.x1 x1Var) {
        ff0 ff0Var = this.f11781b;
        if (ff0Var.f()) {
            this.f11785f = ve0.f11368d;
            this.f11787h = x1Var;
            if (((Boolean) q9.s.f31967e.f31970c.a(al.Da)).booleanValue()) {
                ff0Var.c(this.f11782c, this);
            }
        }
    }

    public final JSONObject a() throws JSONException {
        JSONObject jSONObjectB;
        IBinder iBinder;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(SentryThread.JsonKeys.STATE, this.f11785f);
        jSONObject.put("format", xp0.a(this.f11784e));
        if (((Boolean) q9.s.f31967e.f31970c.a(al.Da)).booleanValue()) {
            jSONObject.put("isOutOfContext", this.f11792n);
            if (this.f11792n) {
                jSONObject.put("shown", this.f11793o);
            }
        }
        e60 e60Var = this.f11786g;
        if (e60Var != null) {
            jSONObjectB = b(e60Var);
        } else {
            q9.x1 x1Var = this.f11787h;
            JSONObject jSONObjectB2 = null;
            if (x1Var != null && (iBinder = x1Var.f31980f) != null) {
                e60 e60Var2 = (e60) iBinder;
                jSONObjectB2 = b(e60Var2);
                if (e60Var2.f4847f.isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(c(this.f11787h));
                    jSONObjectB2.put(Session.JsonKeys.ERRORS, jSONArray);
                }
            }
            jSONObjectB = jSONObjectB2;
        }
        jSONObject.put("responseInfo", jSONObjectB);
        return jSONObject;
    }

    public final JSONObject b(e60 e60Var) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("winningAdapterClassName", e60Var.f4843b);
        jSONObject.put("responseSecsSinceEpoch", e60Var.f4848g);
        jSONObject.put("responseId", e60Var.f4844c);
        wk wkVar = al.f3258wa;
        q9.s sVar = q9.s.f31967e;
        if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue()) {
            String str = e60Var.f4849h;
            if (!TextUtils.isEmpty(str)) {
                u9.i.c("Bidding data: ".concat(String.valueOf(str)));
                jSONObject.put("biddingData", new JSONObject(str));
            }
        }
        if (!TextUtils.isEmpty(this.i)) {
            jSONObject.put("adRequestUrl", this.i);
        }
        if (!TextUtils.isEmpty(this.f11788j)) {
            jSONObject.put("postBody", this.f11788j);
        }
        if (!TextUtils.isEmpty(this.f11789k)) {
            jSONObject.put("adResponseBody", this.f11789k);
        }
        Object obj = this.f11790l;
        if (obj != null) {
            jSONObject.put("adResponseHeaders", obj);
        }
        Object obj2 = this.f11791m;
        if (obj2 != null) {
            jSONObject.put("transactionExtras", obj2);
        }
        if (((Boolean) sVar.f31970c.a(al.za)).booleanValue()) {
            jSONObject.put("hasExceededMemoryLimit", this.f11794p);
        }
        JSONArray jSONArray = new JSONArray();
        for (q9.i3 i3Var : e60Var.f4847f) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adapterClassName", i3Var.f31902b);
            jSONObject2.put("latencyMillis", i3Var.f31903c);
            if (((Boolean) q9.s.f31967e.f31970c.a(al.f3274xa)).booleanValue()) {
                jSONObject2.put("credentials", q9.r.f31959g.f31960a.l(i3Var.f31905e));
            }
            q9.x1 x1Var = i3Var.f31904d;
            jSONObject2.put("error", x1Var == null ? null : c(x1Var));
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("adNetworks", jSONArray);
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final void l(eq0 eq0Var) {
        ff0 ff0Var = this.f11781b;
        if (ff0Var.f()) {
            cw cwVar = eq0Var.f5033b;
            List list = (List) cwVar.f4347c;
            if (!list.isEmpty()) {
                this.f11784e = ((xp0) list.get(0)).f12229b;
            }
            zp0 zp0Var = (zp0) cwVar.f4348d;
            String str = zp0Var.f13065l;
            if (!TextUtils.isEmpty(str)) {
                this.i = str;
            }
            String str2 = zp0Var.f13066m;
            if (!TextUtils.isEmpty(str2)) {
                this.f11788j = str2;
            }
            JSONObject jSONObject = zp0Var.f13069p;
            if (jSONObject.length() > 0) {
                this.f11791m = jSONObject;
            }
            wk wkVar = al.za;
            q9.s sVar = q9.s.f31967e;
            if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue()) {
                if (ff0Var.f5359w >= ((Long) sVar.f31970c.a(al.Aa)).longValue()) {
                    this.f11794p = true;
                    return;
                }
                String str3 = zp0Var.f13067n;
                if (!TextUtils.isEmpty(str3)) {
                    this.f11789k = str3;
                }
                JSONObject jSONObject2 = zp0Var.f13068o;
                if (jSONObject2.length() > 0) {
                    this.f11790l = jSONObject2;
                }
                JSONObject jSONObject3 = this.f11790l;
                int length = jSONObject3 != null ? jSONObject3.toString().length() : 0;
                if (!TextUtils.isEmpty(this.f11789k)) {
                    length += this.f11789k.length();
                }
                long j10 = length;
                synchronized (ff0Var) {
                    ff0Var.f5359w += j10;
                }
            }
        }
    }
}
