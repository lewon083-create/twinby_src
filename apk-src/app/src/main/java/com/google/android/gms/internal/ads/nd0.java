package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class nd0 implements q70, z60, l60, z80 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qd0 f8273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wd0 f8274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8275d;

    public nd0(qd0 qd0Var, wd0 wd0Var, int i) {
        this.f8273b = qd0Var;
        this.f8274c = wd0Var;
        this.f8275d = i;
    }

    @Override // com.google.android.gms.internal.ads.z80
    public final void D(String str) {
        wk wkVar = al.I7;
        q9.s sVar = q9.s.f31967e;
        if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue()) {
            boolean zBooleanValue = ((Boolean) sVar.f31970c.a(al.f3152p8)).booleanValue();
            qd0 qd0Var = this.f8273b;
            if (zBooleanValue) {
                qd0Var.f9459a.put("sgw", String.valueOf(this.f8275d));
            }
            qd0Var.f9459a.put("action", "sgf");
            qd0Var.b("sgf_reason", str);
            qd0Var.c();
            this.f8274c.a(qd0Var.f9459a, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final void E(ku kuVar) {
        this.f8273b.a(kuVar.f7297b);
    }

    @Override // com.google.android.gms.internal.ads.l60
    public final void K(q9.x1 x1Var) {
        qd0 qd0Var = this.f8273b;
        qd0Var.f9459a.put("action", "ftl");
        qd0Var.b("ftl", String.valueOf(x1Var.f31976b));
        qd0Var.b("ed", x1Var.f31978d);
        if (((Boolean) q9.s.f31967e.f31970c.a(al.X7)).booleanValue()) {
            qd0Var.b("emsg", x1Var.f31977c);
        }
        qd0Var.c();
        this.f8274c.a(qd0Var.f9459a, false);
    }

    @Override // com.google.android.gms.internal.ads.z80
    public final void a(aa.t tVar) {
        String str;
        wk wkVar = al.I7;
        q9.s sVar = q9.s.f31967e;
        yk ykVar = sVar.f31970c;
        yk ykVar2 = sVar.f31970c;
        if (((Boolean) ykVar.a(wkVar)).booleanValue()) {
            boolean zBooleanValue = ((Boolean) ykVar2.a(al.f3152p8)).booleanValue();
            qd0 qd0Var = this.f8273b;
            if (zBooleanValue) {
                qd0Var.f9459a.put("sgw", String.valueOf(this.f8275d));
            }
            wd0 wd0Var = this.f8274c;
            if (tVar == null) {
                ConcurrentHashMap concurrentHashMap = qd0Var.f9459a;
                concurrentHashMap.put("action", "sgs");
                concurrentHashMap.put(CommonUrlParts.REQUEST_ID, "-1");
                wd0Var.a(concurrentHashMap, false);
                return;
            }
            ku kuVar = tVar.f704d;
            Bundle bundle = tVar.f705e;
            if (kuVar != null) {
                b(kuVar.f7308n, pd0.f9017d);
            } else if (bundle != null && !bundle.isEmpty()) {
                b(bundle, pd0.f9017d);
            }
            try {
                JSONObject jSONObject = new JSONObject(TextUtils.isEmpty(tVar.f703c) ? tVar.f702b : tVar.f703c);
                ConcurrentHashMap concurrentHashMap2 = qd0Var.f9459a;
                ConcurrentHashMap concurrentHashMap3 = qd0Var.f9459a;
                concurrentHashMap2.put("action", "sgs");
                if (((Boolean) ykVar2.a(al.Ta)).booleanValue()) {
                    try {
                        str = jSONObject.getJSONObject("extras").getBoolean("accept_3p_cookie") ? "1" : CommonUrlParts.Values.FALSE_INTEGER;
                    } catch (JSONException e3) {
                        u9.i.f("Error retrieving JSONObject from the requestJson, ", e3);
                        str = "na";
                    }
                } else {
                    str = "na";
                }
                concurrentHashMap3.put("tpc", str);
                if (kuVar != null) {
                    qd0Var.a(kuVar.f7297b);
                }
                qd0Var.c();
                wd0Var.a(concurrentHashMap3, false);
            } catch (JSONException unused) {
                ConcurrentHashMap concurrentHashMap4 = qd0Var.f9459a;
                concurrentHashMap4.put("action", "sgf");
                concurrentHashMap4.put("sgf_reason", "request_invalid");
                wd0Var.a(concurrentHashMap4, false);
            }
        }
    }

    public final void b(Bundle bundle, x41 x41Var) {
        wk wkVar = al.B2;
        q9.s sVar = q9.s.f31967e;
        if (!((Boolean) sVar.f31970c.a(wkVar)).booleanValue() || bundle == null) {
            return;
        }
        a0.u.u(p9.k.C.f31304k, bundle, "public-api-callback");
        qd0 qd0Var = this.f8273b;
        qd0Var.getClass();
        if (((Boolean) sVar.f31970c.a(al.ze)).booleanValue()) {
            qd0Var.b("brr", true != qd0Var.f9461c.f6584q ? CommonUrlParts.Values.FALSE_INTEGER : "1");
        }
        if (bundle.containsKey("ls")) {
            qd0Var.b("ls", true != bundle.getBoolean("ls") ? CommonUrlParts.Values.FALSE_INTEGER : "1");
        }
        int size = x41Var.size();
        for (int i = 0; i < size; i++) {
            pd0 pd0Var = (pd0) x41Var.get(i);
            long j10 = bundle.getLong(a0.u.c(pd0Var.f9020b), -1L);
            long j11 = bundle.getLong(a0.u.c(pd0Var.f9021c), -1L);
            if (j10 > 0 && j11 > 0) {
                qd0Var.b(pd0Var.f9019a, String.valueOf(j11 - j10));
            }
        }
        c(bundle.getBundle("client_sig_latency_key"));
        c(bundle.getBundle("gms_sig_latency_key"));
        if (((Boolean) q9.s.f31967e.f31970c.a(al.f3152p8)).booleanValue()) {
            if (bundle.containsKey("sod_h")) {
                qd0Var.b("sod_h", true != bundle.getBoolean("sod_h") ? CommonUrlParts.Values.FALSE_INTEGER : "1");
            }
            if (bundle.containsKey("cmr")) {
                qd0Var.b("cmr", String.valueOf(bundle.getInt("cmr")));
            }
        }
    }

    public final void c(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (String str : bundle.keySet()) {
            long j10 = bundle.getLong(str);
            if (j10 >= 0) {
                this.f8273b.b(str, String.valueOf(j10));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.z60
    public final void k() {
        qd0 qd0Var = this.f8273b;
        ConcurrentHashMap concurrentHashMap = qd0Var.f9459a;
        concurrentHashMap.put("action", "loaded");
        b(qd0Var.f9463e, pd0.f9018e);
        if (((Boolean) q9.s.f31967e.f31970c.a(al.Qd)).booleanValue()) {
            concurrentHashMap.put("mafe", true != com.google.android.gms.internal.measurement.d4.m("MUTE_AUDIO") ? CommonUrlParts.Values.FALSE_INTEGER : "1");
        }
        qd0Var.c();
        this.f8274c.a(concurrentHashMap, false);
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final void l(eq0 eq0Var) {
        qd0 qd0Var = this.f8273b;
        qd0Var.getClass();
        cw cwVar = eq0Var.f5033b;
        List list = (List) cwVar.f4347c;
        if (!list.isEmpty()) {
            int i = ((xp0) list.get(0)).f12229b;
            qd0Var.b("ad_format", xp0.a(i));
            if (i == 6) {
                qd0Var.f9459a.put("as", true != qd0Var.f9460b.f4706h ? CommonUrlParts.Values.FALSE_INTEGER : "1");
            }
        }
        if (((Boolean) q9.s.f31967e.f31970c.a(al.D2)).booleanValue()) {
            qd0Var.b("mwl", Integer.toString(list.size()));
        }
        qd0Var.b("gqi", ((zp0) cwVar.f4348d).f13056b);
    }
}
