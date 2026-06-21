package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.plugins.IPluginReporter;
import io.appmetrica.analytics.profile.UserProfile;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.fi, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0162fi implements Sa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0646z0 f23884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0663zh f23885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IHandlerExecutor f23886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f23887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ReporterConfig f23888e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0415pi f23889f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Oe f23890g;

    public C0162fi(@NonNull ICommonExecutor iCommonExecutor, @NonNull Context context, @NonNull String str) {
        this(context.getApplicationContext(), str, new C0646z0());
    }

    public static Sa a(C0646z0 c0646z0, Context context, ReporterConfig reporterConfig) {
        c0646z0.getClass();
        return C0621y0.a(context).f().c(reporterConfig);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void clearAppEnvironment() {
        this.f23885b.getClass();
        this.f23889f.getClass();
        this.f23886c.execute(new RunnableC0085ci(this));
    }

    public final void d(@NonNull String str) {
        ReporterConfig reporterConfigBuild = ReporterConfig.newConfigBuilder(str).build();
        this.f23885b.getClass();
        this.f23889f.getClass();
        this.f23886c.execute(new Sh(this, reporterConfigBuild));
    }

    @Override // io.appmetrica.analytics.IReporter
    @NonNull
    public final IPluginReporter getPluginExtension() {
        return this.f23890g;
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void pauseSession() {
        this.f23885b.getClass();
        this.f23889f.getClass();
        this.f23886c.execute(new Kh(this));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void putAppEnvironmentValue(@NonNull String str, String str2) {
        this.f23885b.getClass();
        this.f23889f.getClass();
        this.f23886c.execute(new RunnableC0059bi(this, str, str2));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAdRevenue(@NonNull AdRevenue adRevenue) {
        this.f23885b.f25125h.a(adRevenue);
        this.f23889f.getClass();
        this.f23886c.execute(new Oh(this, adRevenue));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAnr(@NonNull Map<Thread, StackTraceElement[]> map) {
        this.f23885b.f25126j.a(map);
        this.f23889f.getClass();
        this.f23886c.execute(new Yh(this, CollectionUtils.getListFromMap(map)));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportECommerce(@NonNull ECommerceEvent eCommerceEvent) {
        this.f23885b.i.a(eCommerceEvent);
        this.f23889f.getClass();
        this.f23886c.execute(new Qh(this, eCommerceEvent));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, Throwable th2) {
        this.f23885b.f25119b.a(str);
        this.f23889f.getClass();
        if (th2 == null) {
            th2 = new O1();
            th2.fillInStackTrace();
        }
        this.f23886c.execute(new Gh(this, str, th2));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str) {
        this.f23885b.f25118a.a(str);
        this.f23889f.getClass();
        this.f23886c.execute(new RunnableC0111di(this, str));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportRevenue(@NonNull Revenue revenue) {
        this.f23885b.f25124g.a(revenue);
        this.f23889f.getClass();
        this.f23886c.execute(new Nh(this, revenue));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUnhandledException(@NonNull Throwable th2) {
        this.f23885b.f25122e.a(th2);
        this.f23889f.getClass();
        this.f23886c.execute(new Ih(this, th2));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUserProfile(@NonNull UserProfile userProfile) {
        this.f23885b.f25123f.a(userProfile);
        this.f23889f.getClass();
        this.f23886c.execute(new Mh(this, userProfile));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void resumeSession() {
        this.f23885b.getClass();
        this.f23889f.getClass();
        this.f23886c.execute(new Jh(this));
    }

    @Override // io.appmetrica.analytics.IReporter, io.appmetrica.analytics.IModuleReporter
    public final void sendEventsBuffer() {
        this.f23885b.getClass();
        this.f23889f.getClass();
        this.f23886c.execute(new RunnableC0033ai(this));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setDataSendingEnabled(boolean z5) {
        this.f23885b.getClass();
        this.f23889f.getClass();
        this.f23886c.execute(new Rh(this, z5));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void setSessionExtra(@NonNull String str, byte[] bArr) {
        this.f23885b.getClass();
        this.f23889f.getClass();
        this.f23886c.execute(new Vh(this, str, bArr));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setUserProfileID(String str) {
        this.f23885b.getClass();
        this.f23889f.getClass();
        this.f23886c.execute(new Lh(this, str));
    }

    public C0162fi(Context context, String str, C0646z0 c0646z0) {
        this(context, new C0663zh(), c0646z0, new C0415pi(), ReporterConfig.newConfigBuilder(str).build());
    }

    @Override // io.appmetrica.analytics.impl.Sa, io.appmetrica.analytics.impl.Va
    public final void a(@NonNull Pn pn) {
        this.f23885b.f25121d.a(pn);
        this.f23889f.getClass();
        this.f23886c.execute(new Xh(this, pn));
    }

    public C0162fi(Context context, C0663zh c0663zh, C0646z0 c0646z0, C0415pi c0415pi, ReporterConfig reporterConfig) {
        this(context, c0663zh, c0646z0, c0415pi, reporterConfig, new Oe(new Ph(c0646z0, context, reporterConfig)));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportAdRevenue(@NonNull AdRevenue adRevenue, boolean z5) {
        this.f23885b.f25125h.a(adRevenue);
        this.f23889f.getClass();
        this.f23886c.execute(new Wh(this, adRevenue, z5));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str, String str2) {
        this.f23885b.f25118a.a(str);
        this.f23889f.getClass();
        this.f23886c.execute(new RunnableC0136ei(this, str, str2));
    }

    public C0162fi(Context context, C0663zh c0663zh, C0646z0 c0646z0, C0415pi c0415pi, ReporterConfig reporterConfig, Oe oe2) {
        this.f23886c = C0071c4.l().g().a();
        this.f23887d = context;
        this.f23885b = c0663zh;
        this.f23884a = c0646z0;
        this.f23889f = c0415pi;
        this.f23888e = reporterConfig;
        this.f23890g = oe2;
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, String str2) {
        reportError(str, str2, null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, String str2, Throwable th2) {
        this.f23885b.f25120c.a(str);
        this.f23889f.getClass();
        this.f23886c.execute(new Hh(this, str, str2, th2));
    }

    @Override // io.appmetrica.analytics.impl.Sa, io.appmetrica.analytics.impl.InterfaceC0170g0
    public final void a(@NonNull V v5) {
        this.f23885b.getClass();
        this.f23889f.getClass();
        this.f23886c.execute(new Zh(this, v5));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str, Map<String, Object> map) {
        this.f23885b.f25118a.a(str);
        this.f23889f.getClass();
        this.f23886c.execute(new Fh(this, str, CollectionUtils.getListFromMap(map)));
    }

    public final void a(@NonNull ReporterConfig reporterConfig) {
        this.f23885b.getClass();
        this.f23889f.getClass();
        this.f23886c.execute(new Th(this, reporterConfig));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportEvent(@NonNull ModuleEvent moduleEvent) {
        this.f23885b.getClass();
        this.f23889f.getClass();
        this.f23886c.execute(new Uh(this, moduleEvent));
    }
}
