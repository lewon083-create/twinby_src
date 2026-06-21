package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.webkit.CookieManager;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o20 implements k20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f8581b;

    public /* synthetic */ o20(int i, Object obj) {
        this.f8580a = i;
        this.f8581b = obj;
    }

    @Override // com.google.android.gms.internal.ads.k20
    public final void a(HashMap map) {
        switch (this.f8580a) {
            case 0:
                if (((Boolean) q9.s.f31967e.f31970c.a(al.Fb)).booleanValue()) {
                    vv.H(i81.s(((yh0) this.f8581b).a(true)), Throwable.class, n20.f8153b, hx.f6279a);
                    return;
                }
                return;
            case 1:
                String str = (String) map.get("render_in_browser");
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                try {
                    ((wp0) this.f8581b).a(Boolean.parseBoolean(str));
                    return;
                } catch (Exception e3) {
                    throw new IllegalStateException("Invalid render_in_browser state", e3);
                }
            default:
                CookieManager cookieManager = (CookieManager) this.f8581b;
                if (cookieManager == null) {
                    return;
                }
                if (((String) map.get("clear")) == null) {
                    String str2 = (String) map.get("cookie");
                    if (TextUtils.isEmpty(str2)) {
                        return;
                    }
                    cookieManager.setCookie((String) q9.s.f31967e.f31970c.a(al.f3088l1), str2);
                    return;
                }
                String str3 = (String) q9.s.f31967e.f31970c.a(al.f3088l1);
                String cookie = cookieManager.getCookie(str3);
                if (cookie != null) {
                    List listJ = xo0.c(new b31(';')).j(cookie);
                    for (int i = 0; i < listJ.size(); i++) {
                        String str4 = (String) listJ.get(i);
                        xo0 xo0VarC = xo0.c(new b31('='));
                        str4.getClass();
                        m31 m31Var = (m31) ((n31) xo0VarC.f12221c).e(xo0VarC, str4);
                        if (!m31Var.hasNext()) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(0).length() + 70);
                            sb2.append("position (0) must be less than the number of elements that remained (0)");
                            throw new IndexOutOfBoundsException(sb2.toString());
                        }
                        cookieManager.setCookie(str3, String.valueOf((String) m31Var.next()).concat(String.valueOf((String) q9.s.f31967e.f31970c.a(al.X0))));
                    }
                    return;
                }
                return;
        }
    }

    public o20() {
        this.f8580a = 2;
        p9.k.C.f31300f.getClass();
        this.f8581b = t9.h0.i();
    }
}
