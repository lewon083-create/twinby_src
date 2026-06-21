package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.List;
import java.util.Map;
import java.util.concurrent.FutureTask;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.y0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0621y0 implements Ua {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile C0621y0 f25055e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile boolean f25056f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile boolean f25057g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f25058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0446r0 f25059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FutureTask f25060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ca f25061d;

    public C0621y0(@NonNull Context context) {
        this.f25058a = context;
        C0446r0 c0446r0C = C0071c4.l().c();
        this.f25059b = c0446r0C;
        this.f25061d = c0446r0C.a(context, C0071c4.l().g());
        this.f25060c = new FutureTask(new a7.h(5, this));
    }

    @NonNull
    public static C0621y0 a(@NonNull Context context) {
        C0621y0 c0621y0;
        C0621y0 c0621y02 = f25055e;
        if (c0621y02 != null) {
            return c0621y02;
        }
        synchronized (C0621y0.class) {
            try {
                c0621y0 = f25055e;
                if (c0621y0 == null) {
                    c0621y0 = new C0621y0(context);
                    c0621y0.j();
                    C0071c4.l().f23537c.a().execute(new RunnableC0596x0(c0621y0));
                    f25055e = c0621y0;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c0621y0;
    }

    public static void b(boolean z5) {
        c().a(z5, true);
    }

    public static void clearAppEnvironment() {
        c().clearAppEnvironment();
    }

    public static synchronized boolean k() {
        return f25056f;
    }

    public static boolean l() {
        return f25057g;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized boolean m() {
        /*
            java.lang.Class<io.appmetrica.analytics.impl.y0> r0 = io.appmetrica.analytics.impl.C0621y0.class
            monitor-enter(r0)
            io.appmetrica.analytics.impl.y0 r1 = io.appmetrica.analytics.impl.C0621y0.f25055e     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L1d
            java.util.concurrent.FutureTask r2 = r1.f25060c     // Catch: java.lang.Throwable -> L1b
            boolean r2 = r2.isDone()     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L1d
            io.appmetrica.analytics.impl.Da r1 = r1.f()     // Catch: java.lang.Throwable -> L1b
            io.appmetrica.analytics.impl.kc r1 = r1.i()     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L1d
            r1 = 1
            goto L1e
        L1b:
            r1 = move-exception
            goto L20
        L1d:
            r1 = 0
        L1e:
            monitor-exit(r0)
            return r1
        L20:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C0621y0.m():boolean");
    }

    public static synchronized void n() {
        f25055e = null;
        f25056f = false;
        f25057g = false;
    }

    public static void putAppEnvironmentValue(String str, String str2) {
        c().putAppEnvironmentValue(str, str2);
    }

    public static synchronized void q() {
        f25056f = true;
    }

    public static void r() {
        f25057g = true;
    }

    public static C0621y0 s() {
        return f25055e;
    }

    public static void setDataSendingEnabled(boolean z5) {
        c().setDataSendingEnabled(z5);
    }

    public static void setUserProfileID(String str) {
        c().setUserProfileID(str);
    }

    public final void c(AppMetricaConfig appMetricaConfig) {
        this.f25061d.a(appMetricaConfig, this);
    }

    public final void d(@NonNull AppMetricaConfig appMetricaConfig) {
        f().b(appMetricaConfig);
        C0071c4.l().f23537c.a().execute(new RunnableC0597x1(this.f25058a));
    }

    public final String e() {
        return f().e();
    }

    public final Da f() {
        try {
            return (Da) this.f25060c.get();
        } catch (Exception e3) {
            throw new RuntimeException(e3);
        }
    }

    public final Map<String, String> g() {
        return f().g();
    }

    @NonNull
    public final AdvIdentifiersResult h() {
        return f().h();
    }

    public final C0284kc i() {
        return f().i();
    }

    public final void j() {
        S3 s32 = C0071c4.l().f23537c;
        lp lpVar = new lp(0, this);
        s32.f22940a.getClass();
        new InterruptionSafeThread(lpVar, "IAA-INIT_CORE-" + ThreadFactoryC0659zd.f25117a.incrementAndGet()).start();
    }

    public final void o() {
        C0071c4.l().f23551r.a(this.f25058a);
        new W3(this.f25058a).a(this.f25058a);
        C0071c4.l().a(this.f25058a).a();
        this.f25060c.run();
    }

    public final Da p() {
        Da da2;
        C0446r0 c0446r0 = this.f25059b;
        Context context = this.f25058a;
        Ca ca2 = this.f25061d;
        synchronized (c0446r0) {
            try {
                if (c0446r0.f24674d == null) {
                    if (c0446r0.a(context)) {
                        c0446r0.f24674d = new E0();
                    } else {
                        c0446r0.f24674d = new C0(context, ca2);
                    }
                }
                da2 = c0446r0.f24674d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return da2;
    }

    public final void b(@NonNull AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        f().a(appMetricaLibraryAdapterConfig);
        C0071c4.l().f23537c.a().execute(new RunnableC0597x1(this.f25058a));
    }

    @NonNull
    public final Sa c(@NonNull ReporterConfig reporterConfig) {
        return f().c(reporterConfig);
    }

    public static Ic c() {
        if (m()) {
            return f25055e.f();
        }
        return C0071c4.l().f23536b;
    }

    @NonNull
    public final Y9 d() {
        return f().d();
    }

    @NonNull
    public final C0148f4 b() {
        return this.f25061d.a();
    }

    public static void a(Location location) {
        c().a(location);
    }

    public static void a(boolean z5) {
        c().a(z5);
    }

    public static void a(String str, String str2) {
        c().a(str, str2);
    }

    public static void a(@NonNull String str) {
        c().a(str);
    }

    public final void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        f().a(deferredDeeplinkParametersListener);
    }

    public final void a(DeferredDeeplinkListener deferredDeeplinkListener) {
        f().a(deferredDeeplinkListener);
    }

    public final void a(@NonNull ReporterConfig reporterConfig) {
        f().a(reporterConfig);
    }

    public final void a(@NonNull StartupParamsCallback startupParamsCallback, @NonNull List<String> list) {
        f().a(startupParamsCallback, list);
    }

    public static synchronized void a(C0621y0 c0621y0) {
        f25055e = c0621y0;
    }

    @Override // io.appmetrica.analytics.impl.Ua
    @NonNull
    public final Ta a() {
        return f().a();
    }
}
