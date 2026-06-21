package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cf f6669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g00 f6670b;

    public j00(g00 g00Var, cf cfVar) {
        this.f6669a = cfVar;
        this.f6670b = g00Var;
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            t9.c0.m("Click string is empty, not proceeding.");
            return "";
        }
        g00 g00Var = this.f6670b;
        xe xeVar = g00Var.f5564c;
        if (xeVar == null) {
            t9.c0.m("Signal utils is empty, ignoring.");
            return "";
        }
        ve veVar = xeVar.f12136b;
        if (veVar == null) {
            t9.c0.m("Signals object is empty, ignoring.");
            return "";
        }
        if (g00Var.getContext() != null) {
            return veVar.c(g00Var.getContext(), str, g00Var, g00Var.f5562b.f9647a);
        }
        t9.c0.m("Context is null, ignoring.");
        return "";
    }

    @JavascriptInterface
    public String getViewSignals() {
        g00 g00Var = this.f6670b;
        xe xeVar = g00Var.f5564c;
        if (xeVar == null) {
            t9.c0.m("Signal utils is empty, ignoring.");
            return "";
        }
        ve veVar = xeVar.f12136b;
        if (veVar == null) {
            t9.c0.m("Signals object is empty, ignoring.");
            return "";
        }
        if (g00Var.getContext() != null) {
            return veVar.i(g00Var.getContext(), g00Var, g00Var.f5562b.f9647a);
        }
        t9.c0.m("Context is null, ignoring.");
        return "";
    }

    @JavascriptInterface
    public String getViewSignalsJson() {
        g00 g00Var = this.f6670b;
        al.a(g00Var.getContext());
        String viewSignals = getViewSignals();
        if (!((Boolean) q9.s.f31967e.f31970c.a(al.We)).booleanValue()) {
            return viewSignals;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ms", viewSignals);
            k00 k00Var = g00Var.f5576o;
            r50 r50Var = k00Var != null ? k00Var.B : null;
            if (r50Var != null) {
                long j10 = r50Var.f9712a.get();
                if (j10 > 0) {
                    jSONObject.put("plcmtid", j10);
                }
            }
            return jSONObject.toString();
        } catch (JSONException e3) {
            t9.c0.n("Error constructing JSON.", e3);
            return "";
        }
    }

    @JavascriptInterface
    public void notify(String str) {
        if (TextUtils.isEmpty(str)) {
            u9.i.h("URL is empty, ignoring message");
        } else {
            t9.g0.f33596l.post(new l81(17, this, str));
        }
    }
}
