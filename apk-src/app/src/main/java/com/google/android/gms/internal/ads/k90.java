package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.webkit.WebView;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k90 implements i60, m80 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dw f7143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f7144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fw f7145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f7146e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f7147f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ti f7148g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final xp0 f7149h;

    public k90(dw dwVar, Context context, fw fwVar, WebView webView, ti tiVar, xp0 xp0Var) {
        this.f7143b = dwVar;
        this.f7144c = context;
        this.f7145d = fwVar;
        this.f7146e = webView;
        this.f7148g = tiVar;
        this.f7149h = xp0Var;
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final void F(ru ruVar, String str, String str2) {
        fw fwVar = this.f7145d;
        Context context = this.f7144c;
        if (fwVar.a(context) && this.f7149h.G0) {
            try {
                fwVar.e(context, fwVar.d(context), this.f7143b.f4694d, ruVar.f10065b, ruVar.f10066c);
            } catch (RemoteException e3) {
                u9.i.i("Remote Exception to get reward item.", e3);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final void H() {
        if (this.f7149h.G0) {
            this.f7143b.a(false);
        }
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final void N() {
        if (this.f7149h.G0) {
            View view = this.f7146e;
            if (view != null && this.f7147f != null) {
                Context context = view.getContext();
                String str = this.f7147f;
                fw fwVar = this.f7145d;
                AtomicReference atomicReference = fwVar.f5463g;
                if (fwVar.a(context) && (context instanceof Activity) && fwVar.m(context, "com.google.firebase.analytics.FirebaseAnalytics", atomicReference, false)) {
                    ConcurrentHashMap concurrentHashMap = fwVar.f5464h;
                    Method declaredMethod = (Method) concurrentHashMap.get("setCurrentScreen");
                    if (declaredMethod == null) {
                        try {
                            declaredMethod = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("setCurrentScreen", Activity.class, String.class, String.class);
                            concurrentHashMap.put("setCurrentScreen", declaredMethod);
                        } catch (Exception unused) {
                            fwVar.l("setCurrentScreen", false);
                            declaredMethod = null;
                        }
                    }
                    try {
                        declaredMethod.invoke(atomicReference.get(), (Activity) context, str, context.getPackageName());
                    } catch (Exception unused2) {
                        fwVar.l("setCurrentScreen", false);
                    }
                }
            }
            this.f7143b.a(true);
        }
    }

    @Override // com.google.android.gms.internal.ads.m80
    public final void m() {
        ti tiVar = ti.APP_OPEN;
        ti tiVar2 = this.f7148g;
        if (tiVar2 != tiVar && this.f7149h.G0) {
            fw fwVar = this.f7145d;
            Context context = this.f7144c;
            String str = "";
            if (fwVar.a(context)) {
                AtomicReference atomicReference = fwVar.f5462f;
                if (fwVar.m(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
                    try {
                        String str2 = (String) fwVar.i(context, "getCurrentScreenName").invoke(atomicReference.get(), null);
                        if (str2 == null) {
                            str2 = (String) fwVar.i(context, "getCurrentScreenClass").invoke(atomicReference.get(), null);
                        }
                        if (str2 != null) {
                            str = str2;
                        }
                    } catch (Exception unused) {
                        fwVar.l("getCurrentScreenName", false);
                    }
                }
            }
            this.f7147f = str;
            this.f7147f = String.valueOf(str).concat(tiVar2 == ti.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial");
        }
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final void i() {
    }

    @Override // com.google.android.gms.internal.ads.m80
    public final void k() {
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final void w() {
    }
}
