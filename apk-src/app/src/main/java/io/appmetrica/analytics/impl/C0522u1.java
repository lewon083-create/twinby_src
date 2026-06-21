package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.AnrListener;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.internal.IdentifiersResult;
import io.appmetrica.analytics.internal.js.AppMetricaInitializerJsInterface;
import io.appmetrica.analytics.internal.js.AppMetricaJsInterface;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;
import io.appmetrica.analytics.profile.UserProfile;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.u1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0522u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0646z0 f24823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Go f24824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0365ni f24825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final E7 f24826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0191gl f24827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final B2 f24828f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0167fn f24829g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Vk f24830h;

    public C0522u1(C0646z0 c0646z0, B2 b2, C0191gl c0191gl, Go go, C0167fn c0167fn, C0365ni c0365ni, E7 e7, Vk vk2) {
        this.f24823a = c0646z0;
        this.f24824b = go;
        this.f24825c = c0365ni;
        this.f24826d = e7;
        this.f24828f = b2;
        this.f24829g = c0167fn;
        this.f24827e = c0191gl;
        this.f24830h = vk2;
    }

    public static IHandlerExecutor c() {
        return C0071c4.l().f23537c.a();
    }

    public final void a(@NonNull Context context, @NonNull AppMetricaConfig appMetricaConfig) {
        B2 b2 = this.f24828f;
        b2.f22105f.a(context);
        b2.f22101b.a(appMetricaConfig);
        C0167fn c0167fn = this.f24829g;
        Context applicationContext = context.getApplicationContext();
        c0167fn.f23904e.a(applicationContext);
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(appMetricaConfig.apiKey);
        if (((Boolean) WrapUtils.getOrDefault(appMetricaConfig.sessionsAutoTrackingEnabled, Boolean.TRUE)).booleanValue()) {
            orCreatePublicLogger.info("Session auto tracking enabled", new Object[0]);
            c0167fn.f23903d.a();
        } else {
            orCreatePublicLogger.info("Session auto tracking disabled", new Object[0]);
        }
        c0167fn.f23900a.getClass();
        C0621y0 c0621y0A = C0621y0.a(applicationContext);
        c0621y0A.f25061d.a(appMetricaConfig, c0621y0A);
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f22059b.post(new a1.c(this, context, appMetricaConfig, 20));
        this.f24823a.getClass();
        C0646z0.b();
    }

    public final String b() {
        this.f24823a.getClass();
        C0621y0 c0621y0 = C0621y0.f25055e;
        if (c0621y0 == null) {
            return null;
        }
        return c0621y0.f().e();
    }

    public final C0284kc d() {
        this.f24823a.getClass();
        return C0621y0.f25055e.f().i();
    }

    public final void e() {
        d().f24229a.a(this.f24830h.a());
    }

    public final void f() {
        this.f24828f.f22100a.a(null);
        this.f24829g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f22059b.post(new W0(this));
    }

    public final void c(Activity activity) {
        this.f24828f.f22100a.a(null);
        this.f24829g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f22059b.post(new RunnableC0197h1(this, activity));
    }

    public final void b(Context context, AppMetricaConfig appMetricaConfig) {
        C0646z0 c0646z0 = this.f24823a;
        Context applicationContext = context.getApplicationContext();
        c0646z0.getClass();
        C0621y0 c0621y0A = C0621y0.a(applicationContext);
        c0621y0A.f().b(this.f24826d.a(appMetricaConfig));
        Context context2 = c0621y0A.f25058a;
        ((A9) C0071c4.l().f23537c.a()).execute(new RunnableC0597x1(context2));
    }

    public final void e(String str) {
        this.f24828f.getClass();
        this.f24829g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f22059b.post(new U0(this, str));
    }

    public final void d(@NonNull String str) {
        B2 b2 = this.f24828f;
        b2.f22100a.a(null);
        b2.f22108j.a(str);
        this.f24829g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f22059b.post(new P0(this, str));
    }

    public C0522u1() {
        this(C0071c4.l().d(), new Go());
    }

    public final void c(@NonNull String str, String str2) {
        B2 b2 = this.f24828f;
        b2.f22100a.a(null);
        b2.f22117s.a(str);
        this.f24829g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f22059b.post(new RunnableC0398p1(this, str, str2));
    }

    public C0522u1(C0646z0 c0646z0, Go go) {
        this(c0646z0, new B2(c0646z0), new C0191gl(c0646z0), go, new C0167fn(c0646z0, go), C0365ni.a(), C0071c4.l().j(), C0071c4.l().o());
    }

    public final void d(@NonNull String str, String str2) {
        B2 b2 = this.f24828f;
        b2.f22100a.a(null);
        if (b2.f22113o.a(str).f24595a) {
            this.f24829g.getClass();
            IHandlerExecutor iHandlerExecutorC = c();
            ((A9) iHandlerExecutorC).f22059b.post(new RunnableC0119e1(this, str, str2));
        }
    }

    public final void b(@NonNull String str) {
        B2 b2 = this.f24828f;
        b2.f22100a.a(null);
        b2.f22117s.a(str);
        this.f24829g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f22059b.post(new RunnableC0373o1(this, str));
    }

    public final void c(boolean z5) {
        this.f24828f.getClass();
        this.f24829g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f22059b.post(new R0(this, z5));
    }

    public final void a(Activity activity) {
        this.f24828f.f22100a.a(null);
        this.f24829g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f22059b.post(new RunnableC0348n1(this, activity));
    }

    public final void b(@NonNull Activity activity) {
        B2 b2 = this.f24828f;
        b2.f22100a.a(null);
        b2.f22102c.a(activity);
        this.f24829g.getClass();
        Intent intentA = C0167fn.a(activity);
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f22059b.post(new M0(this, intentA));
    }

    public final void c(@NonNull String str) {
        if (this.f24827e.a((Void) null).f24595a && this.f24828f.f22112n.a(str).f24595a) {
            this.f24829g.getClass();
            IHandlerExecutor iHandlerExecutorC = c();
            ((A9) iHandlerExecutorC).f22059b.post(new RunnableC0145f1(this, str));
        }
    }

    public final void a(@NonNull Application application) {
        this.f24828f.f22104e.a(application);
        this.f24829g.f23902c.a(application);
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f22059b.post(new a0.d1(28, this));
    }

    public final void b(boolean z5) {
        this.f24828f.getClass();
        this.f24829g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f22059b.post(new T0(this, z5));
    }

    public final void b(@NonNull String str, String str2) {
        this.f24828f.f22110l.a(str);
        this.f24829g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f22059b.post(new RunnableC0068c1(this, str, str2));
    }

    public final void a(@NonNull String str, Map<String, Object> map) {
        B2 b2 = this.f24828f;
        b2.f22100a.a(null);
        b2.f22117s.a(str);
        this.f24829g.getClass();
        List listFromMap = CollectionUtils.getListFromMap(map);
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f22059b.post(new RunnableC0423q1(this, str, listFromMap));
    }

    public final void b(@NonNull Object... objArr) {
        this.f24828f.f22100a.a(null);
        this.f24829g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f22059b.post(new a0.d1(29, objArr));
    }

    public final void a(@NonNull String str, Throwable th2) {
        B2 b2 = this.f24828f;
        b2.f22100a.a(null);
        b2.f22118t.a(str);
        this.f24829g.getClass();
        if (th2 == null) {
            th2 = new O1();
            th2.fillInStackTrace();
        }
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f22059b.post(new RunnableC0447r1(this, str, th2));
    }

    public final void b(@NonNull Context context) {
        this.f24828f.f22105f.a(context);
        this.f24829g.f23904e.a(context);
        this.f24823a.getClass();
        C0621y0.a(context);
    }

    public final void a(@NonNull String str, String str2, Throwable th2) {
        B2 b2 = this.f24828f;
        b2.f22100a.a(null);
        b2.f22119u.a(str);
        this.f24829g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f22059b.post(new RunnableC0472s1(this, str, str2, th2));
    }

    public final void a(@NonNull Throwable th2) {
        B2 b2 = this.f24828f;
        b2.f22100a.a(null);
        b2.f22120v.a(th2);
        this.f24829g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f22059b.post(new RunnableC0497t1(this, th2));
    }

    public final void a(@NonNull String str) {
        B2 b2 = this.f24828f;
        b2.f22100a.a(null);
        b2.i.a(str);
        this.f24829g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f22059b.post(new N0(this, str));
    }

    public final void a(@NonNull Intent intent) {
        B2 b2 = this.f24828f;
        b2.f22100a.a(null);
        b2.f22103d.a(intent);
        this.f24829g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f22059b.post(new O0(this, intent));
    }

    public final void a(Location location) {
        this.f24828f.getClass();
        this.f24829g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f22059b.post(new Q0(this, location));
    }

    public final void a(boolean z5) {
        this.f24828f.getClass();
        this.f24829g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f22059b.post(new S0(this, z5));
    }

    public final void a(@NonNull UserProfile userProfile) {
        B2 b2 = this.f24828f;
        b2.f22100a.a(null);
        b2.f22121w.a(userProfile);
        this.f24829g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f22059b.post(new V0(this, userProfile));
    }

    public final void a(@NonNull Revenue revenue) {
        B2 b2 = this.f24828f;
        b2.f22100a.a(null);
        b2.f22122x.a(revenue);
        this.f24829g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f22059b.post(new X0(this, revenue));
    }

    public final void a(@NonNull AdRevenue adRevenue) {
        B2 b2 = this.f24828f;
        b2.f22100a.a(null);
        b2.f22123y.a(adRevenue);
        this.f24829g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f22059b.post(new Y0(this, adRevenue));
    }

    public final void a(@NonNull ECommerceEvent eCommerceEvent) {
        B2 b2 = this.f24828f;
        b2.f22100a.a(null);
        b2.f22124z.a(eCommerceEvent);
        this.f24829g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f22059b.post(new Z0(this, eCommerceEvent));
    }

    public final void a(@NonNull DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        B2 b2 = this.f24828f;
        b2.f22100a.a(null);
        b2.f22106g.a(deferredDeeplinkParametersListener);
        this.f24829g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f22059b.post(new RunnableC0016a1(this, deferredDeeplinkParametersListener));
    }

    public final void a(@NonNull DeferredDeeplinkListener deferredDeeplinkListener) {
        B2 b2 = this.f24828f;
        b2.f22100a.a(null);
        b2.f22106g.a(deferredDeeplinkListener);
        this.f24829g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f22059b.post(new RunnableC0042b1(this, deferredDeeplinkListener));
    }

    @NonNull
    public final Sa a(@NonNull Context context, @NonNull String str) {
        B2 b2 = this.f24828f;
        b2.f22105f.a(context);
        b2.f22109k.a(str);
        C0167fn c0167fn = this.f24829g;
        c0167fn.f23904e.a(context.getApplicationContext());
        return this.f24825c.a(context.getApplicationContext(), str);
    }

    public final void a(@NonNull Context context, @NonNull ReporterConfig reporterConfig) {
        B2 b2 = this.f24828f;
        b2.f22105f.a(context);
        b2.f22107h.a(reporterConfig);
        C0167fn c0167fn = this.f24829g;
        c0167fn.f23904e.a(context.getApplicationContext());
        C0365ni c0365ni = this.f24825c;
        Context applicationContext = context.getApplicationContext();
        if (((C0162fi) c0365ni.f24447a.get(reporterConfig.apiKey)) == null) {
            synchronized (c0365ni.f24447a) {
                try {
                    if (((C0162fi) c0365ni.f24447a.get(reporterConfig.apiKey)) == null) {
                        String str = reporterConfig.apiKey;
                        IHandlerExecutor iHandlerExecutorA = C0071c4.l().f23537c.a();
                        c0365ni.f24448b.getClass();
                        if (C0621y0.f25055e == null) {
                            ((A9) iHandlerExecutorA).f22059b.post(new RunnableC0315li(c0365ni, applicationContext));
                        }
                        C0162fi c0162fi = new C0162fi(applicationContext.getApplicationContext(), str, new C0646z0());
                        c0365ni.f24447a.put(str, c0162fi);
                        c0162fi.a(reporterConfig);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void a(@NonNull WebView webView) {
        B2 b2 = this.f24828f;
        b2.f22100a.a(null);
        b2.f22111m.a(webView);
        Go go = this.f24829g.f23901b;
        go.getClass();
        try {
            if (webView.getSettings().getJavaScriptEnabled()) {
                webView.addJavascriptInterface(new AppMetricaJsInterface(this), "AppMetrica");
                webView.addJavascriptInterface(new AppMetricaInitializerJsInterface(this), "AppMetricaInitializer");
                Do r42 = new Do();
                synchronized (go) {
                    try {
                        PublicLogger publicLogger = go.f22404b;
                        if (publicLogger == null) {
                            go.f22403a.add(r42);
                        } else {
                            r42.consume(publicLogger);
                        }
                    } finally {
                    }
                }
            } else {
                go.a(new Eo());
            }
        } catch (Throwable th2) {
            go.a(new Fo(th2));
        }
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f22059b.post(new RunnableC0094d1(this));
    }

    @NonNull
    public final IdentifiersResult a(@NonNull Context context) {
        this.f24828f.f22105f.a(context);
        C0167fn c0167fn = this.f24829g;
        Context applicationContext = context.getApplicationContext();
        c0167fn.f23904e.a(applicationContext);
        c0167fn.f23905f.a(applicationContext);
        return C0071c4.l().a(context.getApplicationContext()).a();
    }

    public final void a(@NonNull String str, String str2) {
        this.f24828f.getClass();
        this.f24829g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f22059b.post(new RunnableC0171g1(this, str, str2));
    }

    public final void a() {
        this.f24828f.getClass();
        this.f24829g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f22059b.post(new RunnableC0223i1(this));
    }

    public final void a(@NonNull Context context, @NonNull StartupParamsCallback startupParamsCallback, @NonNull List<String> list) {
        B2 b2 = this.f24828f;
        b2.f22105f.a(context);
        b2.f22114p.a(startupParamsCallback);
        C0167fn c0167fn = this.f24829g;
        c0167fn.f23904e.a(context.getApplicationContext());
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f22059b.post(new RunnableC0248j1(this, context, startupParamsCallback, list));
    }

    public final void a(@NonNull AnrListener anrListener) {
        B2 b2 = this.f24828f;
        b2.f22100a.a(null);
        b2.f22115q.a(anrListener);
        this.f24829g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f22059b.post(new RunnableC0273k1(this, anrListener));
    }

    public final void a(@NonNull ExternalAttribution externalAttribution) {
        B2 b2 = this.f24828f;
        b2.f22100a.a(null);
        b2.f22116r.a(externalAttribution);
        this.f24829g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f22059b.post(new RunnableC0298l1(this, externalAttribution));
    }

    public static /* synthetic */ void a(Object[] objArr) {
        ModuleAdRevenueProcessor moduleAdRevenueProcessorB = C0071c4.l().m().b();
        if (moduleAdRevenueProcessorB != null) {
            moduleAdRevenueProcessorB.process(objArr);
        }
    }

    public final void a(@NonNull Map<Thread, StackTraceElement[]> map) {
        this.f24828f.A.a(map);
        this.f24829g.getClass();
        List listFromMap = CollectionUtils.getListFromMap(map);
        IHandlerExecutor iHandlerExecutorC = c();
        ((A9) iHandlerExecutorC).f22059b.post(new RunnableC0323m1(this, listFromMap));
    }

    public static Ja a(C0522u1 c0522u1) {
        return c0522u1.d().f24229a;
    }
}
