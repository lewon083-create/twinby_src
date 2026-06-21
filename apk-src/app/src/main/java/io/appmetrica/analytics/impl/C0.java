package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0 implements Da {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f22164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ca f22165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ue f22166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Nl f22167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0237ig f22168e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Af f22169f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0239ii f22170g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0564vi f22171h;
    public final E7 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Vk f22172j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile C0284kc f22173k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0322m0 f22174l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f22175m;

    public C0(@NotNull Context context, @NotNull Ca ca2) {
        this.f22164a = context;
        this.f22165b = ca2;
        Ue ueB = C0071c4.l().b(context);
        this.f22166c = ueB;
        ArrayList arrayListA = C0484sd.a();
        C0071c4 c0071c4L = C0071c4.l();
        c0071c4L.m().a(new L3(context));
        D0.a(context).a(arrayListA);
        Af afA = D0.a(context, D0.a(ca2.b(), this));
        this.f22169f = afA;
        E7 e7J = c0071c4L.j();
        this.i = e7J;
        C0564vi c0564viA = D0.a(afA, context, ca2.getDefaultExecutor());
        this.f22171h = c0564viA;
        e7J.a(c0564viA);
        Nl nlA = D0.a(context, c0564viA, ueB, ca2.b());
        this.f22167d = nlA;
        c0564viA.a(nlA);
        this.f22168e = D0.a(c0564viA, ueB, ca2.b());
        this.f22170g = D0.a(context, afA, c0564viA, ca2.b(), nlA);
        this.f22172j = c0071c4L.o();
        this.f22174l = new C0322m0(ueB);
    }

    @Override // io.appmetrica.analytics.impl.Da
    @NotNull
    public final Sa c(@NotNull ReporterConfig reporterConfig) {
        return this.f22170g.b(reporterConfig);
    }

    @Override // io.appmetrica.analytics.impl.Da, io.appmetrica.analytics.impl.Ic
    public final void clearAppEnvironment() {
        j().clearAppEnvironment();
    }

    @Override // io.appmetrica.analytics.impl.Da
    @NotNull
    public final Y9 d() {
        return this.f22167d.e();
    }

    @Override // io.appmetrica.analytics.impl.Da
    @Nullable
    public final String e() {
        return this.f22167d.d();
    }

    @Override // io.appmetrica.analytics.impl.Da
    @Nullable
    public final Map<String, String> g() {
        return this.f22167d.b();
    }

    @Override // io.appmetrica.analytics.impl.Da
    @NotNull
    public final AdvIdentifiersResult h() {
        return this.f22167d.a();
    }

    @Override // io.appmetrica.analytics.impl.Da
    @Nullable
    public final C0284kc i() {
        return this.f22173k;
    }

    public final Ja j() {
        C0284kc c0284kc = this.f22173k;
        Intrinsics.b(c0284kc);
        return c0284kc.f24229a;
    }

    @NotNull
    public final C0239ii k() {
        return this.f22170g;
    }

    @Override // io.appmetrica.analytics.impl.Da, io.appmetrica.analytics.impl.Ic
    public final void putAppEnvironmentValue(@NotNull String str, @NotNull String str2) {
        j().putAppEnvironmentValue(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.Da, io.appmetrica.analytics.impl.Ic
    public final void setDataSendingEnabled(boolean z5) {
        j().setDataSendingEnabled(z5);
    }

    @Override // io.appmetrica.analytics.impl.Da, io.appmetrica.analytics.impl.Ic
    public final void setUserProfileID(@Nullable String str) {
        j().setUserProfileID(str);
    }

    @Override // io.appmetrica.analytics.impl.Da
    public final void a(@NotNull AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        Boolean bool;
        C0322m0 c0322m0 = this.f22174l;
        C0571w0 c0571w0 = c0322m0.f24326b;
        c0571w0.getClass();
        AppMetricaConfig.Builder builderNewConfigBuilder = AppMetricaConfig.newConfigBuilder("629a824d-c717-4ba5-bc0f-3f3968554d01");
        if (c0571w0.f24951a.b() && Intrinsics.a(c0571w0.f24952b.f23681a, Boolean.TRUE)) {
            builderNewConfigBuilder.handleFirstActivationAsUpdate(true);
        }
        Boolean bool2 = appMetricaLibraryAdapterConfig.advIdentifiersTracking;
        if (bool2 == null) {
            bool2 = Boolean.FALSE;
        }
        builderNewConfigBuilder.withAdvIdentifiersTracking(bool2.booleanValue());
        AppMetricaConfig appMetricaConfigBuild = builderNewConfigBuilder.build();
        AppMetricaConfig.Builder builderF = c0322m0.f24325a.f();
        if (builderF != null) {
            if (builderF.build().advIdentifiersTracking == null && (bool = appMetricaConfigBuild.advIdentifiersTracking) != null) {
                builderF.withAdvIdentifiersTracking(bool.booleanValue());
            }
            appMetricaConfigBuild = builderF.build();
        }
        PublicLogger mainPublicOrAnonymousLogger = LoggerStorage.getMainPublicOrAnonymousLogger();
        if (a(mainPublicOrAnonymousLogger, appMetricaConfigBuild, new B0(this, appMetricaConfigBuild, mainPublicOrAnonymousLogger), false)) {
            ImportantLogger.INSTANCE.info("AppMetrica", "Activate AppMetrica in anonymous mode", new Object[0]);
        }
    }

    @Override // io.appmetrica.analytics.impl.Da
    public final void b(@NotNull AppMetricaConfig appMetricaConfig) {
        boolean z5;
        PublicLogger orCreateMainPublicLogger = LoggerStorage.getOrCreateMainPublicLogger(appMetricaConfig.apiKey);
        boolean zA = a(orCreateMainPublicLogger, appMetricaConfig, new A0(this, appMetricaConfig, orCreateMainPublicLogger), true);
        if (zA || this.f22175m) {
            z5 = false;
        } else {
            a(orCreateMainPublicLogger, appMetricaConfig, true);
            z5 = true;
        }
        if (zA || z5) {
            this.f22166c.a(appMetricaConfig);
        } else {
            orCreateMainPublicLogger.warning("AppMetrica SDK already has been activated", new Object[0]);
        }
        if (zA) {
            ImportantLogger.INSTANCE.info("AppMetrica", "Activate AppMetrica with APIKey " + ApiKeyUtils.createPartialApiKey(appMetricaConfig.apiKey), new Object[0]);
        }
        if (z5) {
            ImportantLogger.INSTANCE.info("AppMetrica", "Upgrade AppMetrica anonymous mode to normal with APIKey " + ApiKeyUtils.createPartialApiKey(appMetricaConfig.apiKey), new Object[0]);
        }
        this.f22175m = true;
    }

    @Override // io.appmetrica.analytics.impl.Da, io.appmetrica.analytics.impl.B6
    public final void a(int i, @NotNull Bundle bundle) {
        this.f22167d.b(bundle, null);
    }

    @Override // io.appmetrica.analytics.impl.Da
    public final void a(@NotNull DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        this.f22168e.a(deferredDeeplinkParametersListener);
    }

    @Override // io.appmetrica.analytics.impl.Da
    public final void a(@NotNull DeferredDeeplinkListener deferredDeeplinkListener) {
        this.f22168e.a(deferredDeeplinkListener);
    }

    @Override // io.appmetrica.analytics.impl.Da
    public final void a(@NotNull ReporterConfig reporterConfig) {
        this.f22170g.a(reporterConfig);
    }

    @Override // io.appmetrica.analytics.impl.Da
    public final void a(@NotNull StartupParamsCallback startupParamsCallback, @NotNull List<String> list) {
        this.f22167d.a(startupParamsCallback, list, AbstractC0207hb.c(this.f22169f.f22072a.getAsString("PROCESS_CFG_CLIDS")));
    }

    public final boolean a(PublicLogger publicLogger, AppMetricaConfig appMetricaConfig, InterfaceC0608xc interfaceC0608xc, boolean z5) {
        if (this.f22173k == null) {
            a(publicLogger, appMetricaConfig, z5);
            this.f22168e.a();
            C0234ic c0234icA = interfaceC0608xc.a();
            C0653z7 c0653z7 = new C0653z7(c0234icA);
            C0284kc c0284kc = new C0284kc(c0234icA, c0653z7);
            this.f22165b.c().a(c0653z7);
            this.f22173k = c0284kc;
            C0352n5 c0352n5 = this.f22172j.f23157b;
            synchronized (c0352n5) {
                try {
                    c0352n5.f24399a = c0234icA;
                    Iterator it = c0352n5.f24400b.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC0029ae) it.next()).consume(c0234icA);
                    }
                    c0352n5.f24400b.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        }
        interfaceC0608xc.a();
        return false;
    }

    public final void a(PublicLogger publicLogger, AppMetricaConfig appMetricaConfig, boolean z5) {
        Boolean bool = appMetricaConfig.logs;
        Boolean bool2 = Boolean.TRUE;
        if (bool2.equals(bool)) {
            publicLogger.setEnabled(true);
            PublicLogger.Companion.getAnonymousInstance().setEnabled(true);
        } else {
            publicLogger.setEnabled(false);
            PublicLogger.Companion.getAnonymousInstance().setEnabled(false);
        }
        if (((Boolean) WrapUtils.getOrDefault(appMetricaConfig.crashReporting, bool2)).booleanValue()) {
            this.f22165b.d().a(this.f22164a, appMetricaConfig, this);
            this.f22165b.d().b();
            publicLogger.info("Register application crash handler", new Object[0]);
        } else {
            this.f22165b.d().a();
            publicLogger.info("Disable all crash handlers", new Object[0]);
        }
        if (((Boolean) WrapUtils.getOrDefault(appMetricaConfig.sessionsAutoTrackingEnabled, bool2)).booleanValue()) {
            this.f22172j.a();
        } else {
            Vk vk2 = this.f22172j;
            synchronized (vk2) {
                if (vk2.f23162g) {
                    vk2.f23156a.unregisterListener(vk2.f23158c, ActivityEvent.RESUMED);
                    vk2.f23156a.unregisterListener(vk2.f23159d, ActivityEvent.PAUSED);
                    vk2.f23162g = false;
                }
            }
        }
        this.f22169f.d(appMetricaConfig);
        Nl nl2 = this.f22167d;
        nl2.f22755e = publicLogger;
        nl2.b(appMetricaConfig.customHosts);
        Nl nl3 = this.f22167d;
        Object obj = appMetricaConfig.additionalConfig.get("YMM_clids");
        nl3.a(obj instanceof Map ? (Map) obj : null);
        String str = (String) appMetricaConfig.additionalConfig.get("YMM_distributionReferrer");
        this.f22167d.a(str);
        if (str != null) {
            this.f22167d.b("api");
        }
        this.f22171h.a(appMetricaConfig.locationTracking, appMetricaConfig.dataSendingEnabled, appMetricaConfig.advIdentifiersTracking, Boolean.valueOf(z5));
        this.f22167d.i();
    }

    @Override // io.appmetrica.analytics.impl.Da, io.appmetrica.analytics.impl.Ic
    public final void a(@Nullable Location location) {
        j().a(location);
    }

    @Override // io.appmetrica.analytics.impl.Da, io.appmetrica.analytics.impl.Ic
    public final void a(boolean z5) {
        j().a(z5);
    }

    @Override // io.appmetrica.analytics.impl.Da, io.appmetrica.analytics.impl.Ic
    public final void a(boolean z5, boolean z10) {
        j().a(z5, z10);
    }

    @Override // io.appmetrica.analytics.impl.Da, io.appmetrica.analytics.impl.Ic
    public final void a(@NotNull String str, @NotNull String str2) {
        j().a(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.Da, io.appmetrica.analytics.impl.Ic
    public final void a(@NotNull String str) {
        j().a(str);
    }

    @Override // io.appmetrica.analytics.impl.Da, io.appmetrica.analytics.impl.Ua
    public final Ta a() {
        return this.f22170g;
    }
}
