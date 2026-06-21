package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.webkit.WebView;
import io.sentry.SentryBaseEvent;
import io.sentry.SentryLogEvent;
import io.sentry.protocol.FeatureFlags;
import io.sentry.protocol.Response;
import io.sentry.rrweb.RRWebVideoEvent;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l80 implements e80, k81, k9.p, jr0, uq, vq, q40, wo0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ l80 f7420c = new l80(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ l80 f7421d = new l80(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ l80 f7422e = new l80(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ l80 f7423f = new l80(3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ l80 f7424g = new l80(4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ l80 f7425h = new l80(5);
    public static final /* synthetic */ l80 i = new l80(6);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ l80 f7426j = new l80(7);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ l80 f7427k = new l80(8);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ l80 f7428l = new l80(9);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ l80 f7429m = new l80(10);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ l80 f7430n = new l80(11);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ l80 f7431o = new l80(12);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ l80 f7432p = new l80(13);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ l80 f7433q = new l80(17);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ l80 f7434r = new l80(18);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ l80 f7435s = new l80(19);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ l80 f7436t = new l80(20);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ l80 f7437u = new l80(23);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ l80 f7438v = new l80(24);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ l80 f7439w = new l80(25);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ l80 f7440x = new l80(26);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ l80 f7441y = new l80(27);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ l80 f7442z = new l80(29);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7443b;

    public /* synthetic */ l80(int i10) {
        this.f7443b = i10;
    }

    public static boolean e(Context context) {
        if (((Boolean) q9.s.f31967e.f31970c.a(al.f2922a6)).booleanValue()) {
            Boolean bool = (Boolean) r(new ku0(context, 4));
            return bool != null && bool.booleanValue();
        }
        u9.i.h("Omid flag is disabled");
        return false;
    }

    public static String g() {
        if (((Boolean) q9.s.f31967e.f31970c.a(al.f2922a6)).booleanValue()) {
            return "a.1.5.2-google_20241009";
        }
        return null;
    }

    public static wh0 j(int i10, int i11, WebView webView, String str, String str2, String str3) {
        if (((Boolean) q9.s.f31967e.f31970c.a(al.f2922a6)).booleanValue() && nz.A.f12499c) {
            return (wh0) r(new rh0(i11, i10, webView, str, str2, str3));
        }
        return null;
    }

    public static void l(ut0 ut0Var) {
        if (((Boolean) q9.s.f31967e.f31970c.a(al.f2922a6)).booleanValue() && nz.A.f12499c) {
            s(new qh0(ut0Var, 0));
        }
    }

    public static void m(ut0 ut0Var, View view) {
        s(new sh0(ut0Var, view, 1));
    }

    public static final Set n(ae0 ae0Var, Executor executor) {
        return ((Boolean) dm.f4602a.r()).booleanValue() ? Collections.singleton(new s80(ae0Var, executor)) : Collections.EMPTY_SET;
    }

    public static zt0 o(String str) {
        return "native".equals(str) ? zt0.NATIVE : "javascript".equals(str) ? zt0.JAVASCRIPT : zt0.NONE;
    }

    public static xt0 p(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -1104128070) {
            if (iHashCode != 1318088141) {
                if (iHashCode == 1988248512 && str.equals("onePixel")) {
                    return xt0.ONE_PIXEL;
                }
            } else if (str.equals("definedByJavascript")) {
                return xt0.DEFINED_BY_JAVASCRIPT;
            }
        } else if (str.equals("beginToRender")) {
            return xt0.BEGIN_TO_RENDER;
        }
        return xt0.UNSPECIFIED;
    }

    public static vt0 q(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == -382745961) {
            if (str.equals("htmlDisplay")) {
                return vt0.HTML_DISPLAY;
            }
            return null;
        }
        if (iHashCode == 112202875) {
            if (str.equals(RRWebVideoEvent.EVENT_TAG)) {
                return vt0.VIDEO;
            }
            return null;
        }
        if (iHashCode == 714893483 && str.equals("nativeDisplay")) {
            return vt0.NATIVE_DISPLAY;
        }
        return null;
    }

    public static final Object r(uh0 uh0Var) {
        try {
            return uh0Var.h();
        } catch (RuntimeException e3) {
            p9.k.C.f31302h.e("omid exception", e3);
            return null;
        }
    }

    public static final void s(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e3) {
            p9.k.C.f31302h.e("omid exception", e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.e80
    /* JADX INFO: renamed from: a */
    public void mo7a(Object obj) {
        switch (this.f7443b) {
            case 0:
                ((m80) obj).m();
                break;
            case 1:
                ((o80) obj).z();
                break;
            case 2:
                ((o80) obj).a();
                break;
            case 3:
                ((r80) obj).f();
                break;
            case 4:
                ((v80) obj).L();
                break;
            case 5:
                ((v80) obj).J();
                break;
            case 6:
                x80 x80Var = (x80) obj;
                if (!x80Var.f12077d) {
                    x80Var.f12075b.a(x80Var.f12074a, x80Var.f12076c);
                    x80Var.f12077d = true;
                }
                break;
            case 7:
                ((ep) obj).h();
                break;
            case 8:
                ((ep) obj).a();
                break;
            case 9:
                q9.b2 b2VarR = ((oc0) obj).f8664a.r();
                q9.c2 c2VarR = null;
                if (b2VarR != null) {
                    try {
                        c2VarR = b2VarR.r();
                        break;
                    } catch (RemoteException unused) {
                    }
                }
                if (c2VarR != null) {
                    try {
                        c2VarR.m();
                    } catch (RemoteException e3) {
                        u9.i.i("Unable to call onVideoEnd()", e3);
                        return;
                    }
                    break;
                }
                break;
            case 10:
                ((oc0) obj).a();
                break;
            case 11:
                ((oc0) obj).getClass();
                break;
            case 12:
                ((oc0) obj).a();
                break;
            case 13:
                q9.b2 b2VarR2 = ((oc0) obj).f8664a.r();
                q9.c2 c2VarR2 = null;
                if (b2VarR2 != null) {
                    try {
                        c2VarR2 = b2VarR2.r();
                        break;
                    } catch (RemoteException unused2) {
                    }
                }
                if (c2VarR2 != null) {
                    try {
                        c2VarR2.k();
                    } catch (RemoteException e7) {
                        u9.i.i("Unable to call onVideoEnd()", e7);
                        return;
                    }
                    break;
                }
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            default:
                ((hv) obj).n();
                break;
            case 24:
                ((q9.y) obj).d();
                break;
            case 25:
                ((e70) obj).e();
                break;
            case 26:
                ((s9.l) obj).A2();
                break;
            case 27:
                ((s9.l) obj).d3();
                break;
        }
    }

    @Override // k9.p
    public /* synthetic */ void b(cf cfVar) {
        int i10 = this.f7443b;
    }

    @Override // com.google.android.gms.internal.ads.q40
    /* JADX INFO: renamed from: h */
    public /* synthetic */ q9.b2 mo3h() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.vq
    public JSONObject i(Object obj) throws JSONException {
        vg0 vg0Var = (vg0) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (((Boolean) q9.s.f31967e.f31970c.a(al.f3288ya)).booleanValue()) {
            lu luVar = vg0Var.f11378c;
            jSONObject2.put("ad_request_url", luVar.f7620f);
            jSONObject2.put("ad_request_post_body", luVar.f7617c);
        }
        lu luVar2 = vg0Var.f11378c;
        jSONObject2.put("base_url", luVar2.f7616b);
        jSONObject2.put("signals", vg0Var.f11377b);
        zg0 zg0Var = vg0Var.f11376a;
        jSONObject3.put(SentryLogEvent.JsonKeys.BODY, zg0Var.f12994c);
        jSONObject3.put("headers", q9.r.f31959g.f31960a.k(zg0Var.f12993b));
        jSONObject3.put("response_code", zg0Var.f12992a);
        jSONObject3.put("latency", zg0Var.f12995d);
        jSONObject.put(SentryBaseEvent.JsonKeys.REQUEST, jSONObject2);
        jSONObject.put(Response.TYPE, jSONObject3);
        jSONObject.put(FeatureFlags.TYPE, luVar2.f7622h);
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.k81
    public void k(Throwable th2) {
        switch (this.f7443b) {
            case 14:
                break;
            default:
                t9.c0.m("Notification of cache hit failed.");
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.uq
    public /* synthetic */ Object x(JSONObject jSONObject) {
        return new lu(jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.k81
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void mo6i(Object obj) {
        switch (this.f7443b) {
            case 14:
                ((sz) obj).destroy();
                break;
            default:
                t9.c0.m("Notification of cache hit successful.");
                break;
        }
    }

    private final /* synthetic */ void c(cf cfVar) {
    }

    private final /* synthetic */ void d(cf cfVar) {
    }

    private final void f(Throwable th2) {
    }

    @Override // com.google.android.gms.internal.ads.jr0
    public /* synthetic */ Object a(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        t9.c0.m("Ad request signals:");
        t9.c0.m(jSONObject.toString(2));
        return jSONObject;
    }
}
