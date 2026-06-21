package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.os.Handler;
import android.provider.Settings;
import android.view.View;
import android.webkit.WebView;
import io.sentry.Session;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ut0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k7 f11063a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ou0 f11066d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f11069g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ju0 f11064b = new ju0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f11067e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f11068f = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public zu0 f11065c = new zu0(null);

    public ut0(yv0 yv0Var, k7 k7Var, String str) {
        this.f11063a = k7Var;
        this.f11069g = str;
        tt0 tt0Var = (tt0) k7Var.f7136h;
        if (tt0Var == tt0.HTML || tt0Var == tt0.JAVASCRIPT) {
            WebView webView = (WebView) k7Var.f7131c;
            pu0 pu0Var = new pu0(str);
            if (!webView.getSettings().getJavaScriptEnabled()) {
                webView.getSettings().setJavaScriptEnabled(true);
            }
            pu0Var.f8803b = new zu0(webView);
            this.f11066d = pu0Var;
        } else {
            this.f11066d = new ru0(str, Collections.unmodifiableMap((HashMap) k7Var.f7133e));
        }
        this.f11066d.a();
        fu0.f5441c.f5442a.add(this);
        ou0 ou0Var = this.f11066d;
        c6 c6Var = c6.f4048h;
        WebView webViewC = ou0Var.c();
        String str2 = ou0Var.f8802a;
        JSONObject jSONObject = new JSONObject();
        su0.b(jSONObject, "impressionOwner", (zt0) yv0Var.f12754c);
        su0.b(jSONObject, "mediaEventsOwner", (zt0) yv0Var.f12755d);
        su0.b(jSONObject, "creativeType", (vt0) yv0Var.f12756e);
        su0.b(jSONObject, "impressionType", (xt0) yv0Var.f12757f);
        su0.b(jSONObject, "isolateVerificationScripts", Boolean.valueOf(yv0Var.f12753b));
        c6Var.A(webViewC, Session.JsonKeys.INIT, jSONObject, str2);
    }

    public final void a() {
        if (this.f11067e || this.f11066d == null) {
            return;
        }
        this.f11067e = true;
        ArrayList arrayList = fu0.f5441c.f5443b;
        boolean z5 = arrayList.size() > 0;
        arrayList.add(this);
        if (!z5) {
            lu0 lu0VarB = lu0.b();
            lu0VarB.getClass();
            eu0 eu0Var = eu0.f5068e;
            eu0Var.f6264d = lu0VarB;
            eu0Var.f6262b = true;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            boolean z10 = runningAppProcessInfo.importance == 100 || eu0Var.a();
            eu0Var.f6263c = z10;
            eu0Var.b(z10);
            vu0.f11481g.getClass();
            vu0.b();
            cu0 cu0Var = lu0VarB.f7629b;
            cu0Var.getClass();
            cu0Var.f4318f.submit(new kr0(1, cu0Var));
            cu0Var.f4314b.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, cu0Var);
        }
        float f10 = lu0.b().f7628a;
        ou0 ou0Var = this.f11066d;
        c6.f4048h.A(ou0Var.c(), "setDeviceVolume", Float.valueOf(f10), ou0Var.f8802a);
        ou0 ou0Var2 = this.f11066d;
        Date date = (Date) du0.f4673e.f4676c;
        ou0Var2.f(date != null ? (Date) date.clone() : null);
        this.f11066d.d(this, this.f11063a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(View view) {
        if (this.f11068f || ((View) this.f11065c.get()) == view) {
            return;
        }
        this.f11065c = new zu0(view);
        ou0 ou0Var = this.f11066d;
        ou0Var.getClass();
        ou0Var.f8804c = System.nanoTime();
        ou0Var.f8805d = 1;
        Collection<ut0> collectionUnmodifiableCollection = Collections.unmodifiableCollection(fu0.f5441c.f5442a);
        if (collectionUnmodifiableCollection == null || collectionUnmodifiableCollection.isEmpty()) {
            return;
        }
        for (ut0 ut0Var : collectionUnmodifiableCollection) {
            if (ut0Var != this && ((View) ut0Var.f11065c.get()) == view) {
                ut0Var.f11065c.clear();
            }
        }
    }

    public final void c() {
        if (this.f11068f) {
            return;
        }
        this.f11065c.clear();
        if (!this.f11068f) {
            this.f11064b.f6942a.clear();
        }
        this.f11068f = true;
        ou0 ou0Var = this.f11066d;
        c6.f4048h.A(ou0Var.c(), "finishSession", ou0Var.f8802a);
        fu0 fu0Var = fu0.f5441c;
        ArrayList arrayList = fu0Var.f5442a;
        ArrayList arrayList2 = fu0Var.f5443b;
        boolean z5 = arrayList2.size() > 0;
        arrayList.remove(this);
        arrayList2.remove(this);
        if (z5 && arrayList2.size() <= 0) {
            lu0 lu0VarB = lu0.b();
            lu0VarB.getClass();
            vu0 vu0Var = vu0.f11481g;
            vu0Var.getClass();
            Handler handler = vu0.i;
            if (handler != null) {
                handler.removeCallbacks(vu0.f11484k);
                vu0.i = null;
            }
            vu0Var.f11485a.clear();
            vu0.f11482h.post(new kr0(vu0Var));
            eu0 eu0Var = eu0.f5068e;
            eu0Var.f6262b = false;
            eu0Var.f6264d = null;
            cu0 cu0Var = lu0VarB.f7629b;
            cu0Var.f4314b.getContentResolver().unregisterContentObserver(cu0Var);
        }
        this.f11066d.b();
        this.f11066d = null;
    }
}
