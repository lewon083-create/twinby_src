package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.PreloadInfo;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.tc, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0508tc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f24770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0564vi f24771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bd f24772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final N9 f24773d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final E8 f24774e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Eh f24775f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0146f2 f24776g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0477s6 f24777h;
    public final C0421q i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Je f24778j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Qn f24779k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Dg f24780l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C0577w6 f24781m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C0093d0 f24782n;

    public C0508tc(Context context, Af af2, C0564vi c0564vi, Nl nl2) {
        this.f24770a = context;
        this.f24771b = c0564vi;
        this.f24772c = new Bd(af2);
        N9 n92 = new N9(context);
        this.f24773d = n92;
        E8 e82 = new E8(new C0443ql(LoggerStorage.getMainPublicOrAnonymousLogger(), "Crash Environment"));
        this.f24774e = e82;
        this.f24775f = new Eh(af2, new CounterConfiguration(CounterConfigurationReporterType.MAIN), e82);
        this.f24776g = new C0146f2();
        this.f24777h = C0071c4.l().n();
        this.i = new C0421q();
        this.f24778j = new Je(n92);
        this.f24779k = new Qn();
        this.f24780l = new Dg();
        this.f24781m = new C0577w6();
        this.f24782n = new C0093d0();
    }

    public final C0093d0 a() {
        return this.f24782n;
    }

    public final Context b() {
        return this.f24770a;
    }

    public final C0577w6 c() {
        return this.f24781m;
    }

    public final N9 d() {
        return this.f24773d;
    }

    public final Je e() {
        return this.f24778j;
    }

    public final C0477s6 f() {
        return this.f24777h;
    }

    public final Dg g() {
        return this.f24780l;
    }

    public final Eh h() {
        return this.f24775f;
    }

    public final C0564vi i() {
        return this.f24771b;
    }

    public final Qn j() {
        return this.f24779k;
    }

    public final void a(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger) {
        publicLogger.info("Update config with value " + appMetricaConfig.toJson(), new Object[0]);
        this.f24775f.f22439b.applyFromConfig(appMetricaConfig);
        Eh eh2 = this.f24775f;
        String str = appMetricaConfig.userProfileID;
        synchronized (eh2) {
            eh2.f22296f = str;
        }
        Eh eh3 = this.f24775f;
        PreloadInfo preloadInfo = appMetricaConfig.preloadInfo;
        Boolean bool = (Boolean) appMetricaConfig.additionalConfig.get("YMM_preloadInfoAutoTracking");
        eh3.f22294d = new C0511tf(preloadInfo, publicLogger, bool != null ? bool.booleanValue() : false);
        StringBuilder sb2 = new StringBuilder("Actual session timeout is ");
        Integer num = appMetricaConfig.sessionTimeout;
        if (num == null) {
            num = 10;
        }
        sb2.append(num.intValue());
        publicLogger.info(sb2.toString(), new Object[0]);
    }
}
