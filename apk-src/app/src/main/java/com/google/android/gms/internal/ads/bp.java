package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class bp implements vo {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p9.a f3840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sd0 f3841c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ys f3843e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final kh0 f3844f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w20 f3845g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v50 f3846h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public u9.l f3842d = null;
    public s9.a i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final gx f3847j = hx.f6285g;

    public bp(p9.a aVar, ys ysVar, kh0 kh0Var, sd0 sd0Var, w20 w20Var, v50 v50Var) {
        this.f3840b = aVar;
        this.f3843e = ysVar;
        this.f3844f = kh0Var;
        this.f3841c = sd0Var;
        this.f3845g = w20Var;
        this.f3846h = v50Var;
    }

    public static int a(Map map) {
        String str = (String) map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            return 7;
        }
        if ("l".equalsIgnoreCase(str)) {
            return 6;
        }
        return "c".equalsIgnoreCase(str) ? 14 : -1;
    }

    public static Uri b(Context context, xe xeVar, Uri uri, View view, Activity activity, jq0 jq0Var) {
        if (xeVar != null) {
            try {
                if (!((Boolean) q9.s.f31967e.f31970c.a(al.f3067jd)).booleanValue() || jq0Var == null) {
                    if (xeVar.c(uri)) {
                        return xeVar.b(uri, context, view, activity);
                    }
                } else if (xeVar.c(uri)) {
                    return jq0Var.a(uri, context, view, activity);
                }
            } catch (ye unused) {
            } catch (Exception e3) {
                p9.k.C.f31302h.d("OpenGmsgHandler.maybeAddClickSignalsToUri", e3);
            }
        }
        return uri;
    }

    public static Uri c(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") == null) {
                return uri;
            }
            return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
        } catch (UnsupportedOperationException e3) {
            u9.i.f("Error adding click uptime parameter to url: ".concat(String.valueOf(uri.toString())), e3);
            return uri;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0083, code lost:
    
        if (((java.lang.Boolean) q9.s.f31967e.f31970c.a(com.google.android.gms.internal.ads.al.F9)).booleanValue() != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e6, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT < 33 ? ((java.lang.Boolean) q9.s.f31967e.f31970c.a(com.google.android.gms.internal.ads.al.A9)).booleanValue() : ((java.lang.Boolean) q9.s.f31967e.f31970c.a(com.google.android.gms.internal.ads.al.f3302z9)).booleanValue()) != false) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(q9.a r11, android.content.Context r12, java.lang.String r13, java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bp.d(q9.a, android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    public final void e(Context context, String str, String str2) {
        kh0 kh0Var = this.f3844f;
        kh0Var.b(str);
        sd0 sd0Var = this.f3841c;
        if (sd0Var != null) {
            fs1.j("dialog_not_shown_reason", str2);
            ph0.m4(context, sd0Var, kh0Var, str, "dialog_not_shown", w51.d(1, new Object[]{"dialog_not_shown_reason", str2}, null));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0153, code lost:
    
        r6 = r13;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(q9.a r17, java.util.Map r18, boolean r19, java.lang.String r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instruction units count: 409
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bp.f(q9.a, java.util.Map, boolean, java.lang.String, boolean, boolean):void");
    }

    public final void g(boolean z5) {
        ys ysVar = this.f3843e;
        if (ysVar != null) {
            ysVar.D(z5);
        }
    }

    public final void h(int i) {
        sd0 sd0Var;
        String str;
        if (!((Boolean) q9.s.f31967e.f31970c.a(al.f3150p5)).booleanValue() || (sd0Var = this.f3841c) == null) {
            return;
        }
        zd1 zd1VarA = sd0Var.a();
        zd1VarA.v("action", "cct_action");
        switch (i) {
            case 2:
                str = "CONTEXT_NOT_AN_ACTIVITY";
                break;
            case 3:
                str = "CONTEXT_NULL";
                break;
            case 4:
                str = "CCT_NOT_SUPPORTED";
                break;
            case 5:
                str = "CCT_READY_TO_OPEN";
                break;
            case 6:
                str = "ACTIVITY_NOT_FOUND";
                break;
            case 7:
                str = "EMPTY_URL";
                break;
            case 8:
                str = "UNKNOWN";
                break;
            case 9:
                str = "WRONG_EXP_SETUP";
                break;
            default:
                str = "OPT_OUT";
                break;
        }
        zd1VarA.v("cct_open_status", str);
        zd1VarA.w();
    }

    @Override // com.google.android.gms.internal.ads.vo
    public final void o(Object obj, Map map) {
        w20 w20Var;
        q9.a aVar = (q9.a) obj;
        String str = (String) map.get("u");
        HashMap map2 = new HashMap();
        sz szVar = (sz) aVar;
        if (szVar.M() != null) {
            map2 = szVar.M().f12269w0;
        }
        String strF = fs1.f(str, szVar.getContext(), true, map2);
        String str2 = (String) map.get("a");
        if (str2 == null) {
            u9.i.h("Action missing from an open GMSG.");
            return;
        }
        p9.a aVar2 = this.f3840b;
        if (aVar2 != null && !aVar2.a()) {
            aVar2.b(strF);
        } else {
            ed.d dVarA = (((Boolean) q9.s.f31967e.f31970c.a(al.f3111mb)).booleanValue() && (w20Var = this.f3845g) != null && w20.b(strF)) ? w20Var.a(strF, q9.r.f31959g.f31964e) : vv.d(strF);
            dVarA.a(new l81(0, dVarA, new cw(this, map, aVar, str2, 5)), this.f3847j);
        }
    }
}
