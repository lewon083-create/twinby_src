package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class vh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f11381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u9.a f11382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xp0 f11383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sz f11384d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final sd0 f11385e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public yt0 f11386f;

    public vh0(Context context, u9.a aVar, xp0 xp0Var, sz szVar, sd0 sd0Var) {
        this.f11381a = context;
        this.f11382b = aVar;
        this.f11383c = xp0Var;
        this.f11384d = szVar;
        this.f11385e = sd0Var;
    }

    public final synchronized boolean a() {
        sz szVar;
        xp0 xp0Var = this.f11383c;
        if (xp0Var.T) {
            wk wkVar = al.f2922a6;
            q9.s sVar = q9.s.f31967e;
            if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue()) {
                if (((Boolean) sVar.f31970c.a(al.f2969d6)).booleanValue() && (szVar = this.f11384d) != null) {
                    if (this.f11386f != null) {
                        u9.i.h("Omid javascript session service already started for ad.");
                        return false;
                    }
                    Context context = this.f11381a;
                    p9.k kVar = p9.k.C;
                    kVar.f31317x.getClass();
                    if (!l80.e(context)) {
                        u9.i.h("Unable to initialize omid.");
                        return false;
                    }
                    kx0 kx0Var = xp0Var.V;
                    kx0Var.getClass();
                    if (((JSONObject) kx0Var.f7326c).optBoolean((String) sVar.f31970c.a(al.f3000f6), true)) {
                        u9.a aVar = this.f11382b;
                        l80 l80Var = kVar.f31317x;
                        WebView webViewU = szVar.u();
                        l80Var.getClass();
                        yt0 yt0Var = (yt0) l80.r(new zd1(16, (Object) aVar, (Object) webViewU, false));
                        if (((Boolean) sVar.f31970c.a(al.f2985e6)).booleanValue()) {
                            sd0 sd0Var = this.f11385e;
                            String str = yt0Var != null ? "1" : CommonUrlParts.Values.FALSE_INTEGER;
                            zd1 zd1VarA = sd0Var.a();
                            zd1VarA.v("omid_js_session_success", str);
                            zd1VarA.w();
                        }
                        if (yt0Var == null) {
                            u9.i.h("Unable to create javascript session service.");
                            return false;
                        }
                        u9.i.g("Created omid javascript session service.");
                        this.f11386f = yt0Var;
                        szVar.Q0(this);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final synchronized void b() {
        sz szVar;
        try {
            yt0 yt0Var = this.f11386f;
            if (yt0Var == null || (szVar = this.f11384d) == null) {
                return;
            }
            for (View view : szVar.C()) {
                p9.k.C.f31317x.getClass();
                l80.s(new th0(0, yt0Var, view));
            }
            szVar.c("onSdkLoaded", w51.f11648h);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void c() {
        sz szVar;
        if (this.f11386f == null || (szVar = this.f11384d) == null) {
            return;
        }
        szVar.c("onSdkImpression", w51.f11648h);
    }
}
