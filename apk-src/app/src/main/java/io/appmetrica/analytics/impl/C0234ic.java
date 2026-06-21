package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.AnrListener;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientConfig;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientModule;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ic, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0234ic extends J2 implements Ja {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Long f24065s = Long.valueOf(TimeUnit.SECONDS.toMillis(1));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Dn f24066p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C0508tc f24067q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C0259jc f24068r;

    public C0234ic(C0508tc c0508tc) {
        super(c0508tc.b(), c0508tc.i(), c0508tc.h(), c0508tc.d(), c0508tc.f(), c0508tc.j(), c0508tc.g(), c0508tc.c(), c0508tc.a(), c0508tc.e());
        this.f24066p = new Dn(new Zd("Referral url"));
        this.f24067q = c0508tc;
        this.f24068r = new C0259jc(this);
        l();
    }

    public final void a(AppMetricaConfig appMetricaConfig, C0297l0 c0297l0) {
        if (c0297l0.f24257b) {
            clearAppEnvironment();
        }
        List<String> list = c0297l0.f24256a;
        if (!CollectionUtils.isNullOrEmpty(list)) {
            this.f22480b.f22439b.addAutoCollectedDataSubscribers(list);
        }
        a(appMetricaConfig.appEnvironment);
        b(appMetricaConfig.errorEnvironment);
        Boolean bool = (Boolean) WrapUtils.getOrDefault(appMetricaConfig.nativeCrashReporting, Boolean.TRUE);
        boolean zBooleanValue = bool.booleanValue();
        this.f22481c.info("native crash reporting enabled: %b", bool);
        if (zBooleanValue) {
            Bd bd2 = this.f24067q.f24772c;
            Context context = this.f22479a;
            bd2.f22148d = new H0(this.f22480b.f22439b.getApiKey(), bd2.f22145a.f22072a.getAsString("PROCESS_CFG_PACKAGE_NAME"), CounterConfigurationReporterType.MAIN, bd2.f22145a.f22072a.getAsInteger("PROCESS_CFG_PROCESS_ID").intValue(), bd2.f22145a.f22072a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID"), this.f22480b.d());
            File nativeCrashDirectory = FileUtils.getNativeCrashDirectory(context);
            String absolutePath = nativeCrashDirectory != null ? nativeCrashDirectory.getAbsolutePath() : null;
            if (absolutePath != null) {
                NativeCrashClientModule nativeCrashClientModule = bd2.f22146b;
                I0 i02 = bd2.f22147c;
                H0 h0 = bd2.f22148d;
                if (h0 == null) {
                    Intrinsics.g("nativeCrashMetadata");
                    throw null;
                }
                i02.getClass();
                nativeCrashClientModule.initHandling(context, new NativeCrashClientConfig(absolutePath, I0.a(h0)));
            }
        }
        C0259jc c0259jc = this.f24068r;
        synchronized (c0259jc) {
            try {
                Integer num = appMetricaConfig.anrMonitoringTimeout;
                c0259jc.f24149a = num != null ? num.intValue() : 5;
                Boolean bool2 = appMetricaConfig.anrMonitoring;
                if (bool2 == null) {
                    bool2 = Boolean.FALSE;
                }
                if (bool2.booleanValue()) {
                    c0259jc.f24150b.a(c0259jc.f24149a);
                } else {
                    c0259jc.f24150b.b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final void b(Activity activity) {
        if (this.f24067q.i.a(activity, EnumC0396p.PAUSED)) {
            this.f22481c.info("Pause session", new Object[0]);
            d(activity != null ? activity.getClass().getSimpleName() : null);
            C0146f2 c0146f2 = this.f24067q.f24776g;
            synchronized (c0146f2) {
                for (C0120e2 c0120e2 : c0146f2.f23827a) {
                    if (!c0120e2.f23725d) {
                        c0120e2.f23725d = true;
                        c0120e2.f23723b.executeDelayed(c0120e2.f23726e, c0120e2.f23724c);
                    }
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final void c() {
        C0259jc c0259jc = this.f24068r;
        synchronized (c0259jc) {
            c0259jc.f24150b.a(c0259jc.f24149a);
        }
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final List<String> f() {
        return this.f22480b.f22438a.b();
    }

    @Override // io.appmetrica.analytics.impl.J2
    public final String j() {
        return "[MainReporter]";
    }

    @Override // io.appmetrica.analytics.impl.J2
    public final void k() {
        super.k();
        C0071c4.l().m().c();
    }

    public final void l() {
        C0564vi c0564vi = this.f22486h;
        c0564vi.f24913c.a(this.f22480b.f22438a);
        C0146f2 c0146f2 = this.f24067q.f24776g;
        C0208hc c0208hc = new C0208hc(this);
        long jLongValue = f24065s.longValue();
        synchronized (c0146f2) {
            c0146f2.a(c0208hc, jLongValue);
        }
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final void c(@NonNull String str) {
        this.f24066p.a(str);
        C0564vi c0564vi = this.f22486h;
        PublicLogger publicLogger = this.f22481c;
        Set set = AbstractC0605x9.f25010a;
        HashMap map = new HashMap();
        map.put("type", "referral");
        map.put("link", str);
        map.put("auto", Boolean.FALSE);
        String strB = AbstractC0207hb.b(map);
        EnumC0078cb enumC0078cb = EnumC0078cb.EVENT_TYPE_UNDEFINED;
        N3 n32 = new N3(strB, "", 8208, 0, publicLogger);
        Eh eh2 = this.f22480b;
        c0564vi.getClass();
        c0564vi.a(C0564vi.a(n32, eh2), eh2, 1, (Map) null);
        this.f22481c.info("Referral URL received: " + WrapUtils.wrapToTag(str), new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final void a(@NonNull String str, boolean z5) {
        this.f22481c.info("App opened via deeplink: " + WrapUtils.wrapToTag(str), new Object[0]);
        C0564vi c0564vi = this.f22486h;
        PublicLogger publicLogger = this.f22481c;
        Set set = AbstractC0605x9.f25010a;
        HashMap map = new HashMap();
        map.put("type", "open");
        map.put("link", str);
        map.put("auto", Boolean.valueOf(z5));
        String strB = AbstractC0207hb.b(map);
        EnumC0078cb enumC0078cb = EnumC0078cb.EVENT_TYPE_UNDEFINED;
        N3 n32 = new N3(strB, "", 8208, 0, publicLogger);
        Eh eh2 = this.f22480b;
        c0564vi.getClass();
        c0564vi.a(C0564vi.a(n32, eh2), eh2, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final void a(@NonNull EnumC0346n enumC0346n) {
        if (enumC0346n == EnumC0346n.f24385b) {
            this.f22481c.info("Enable activity auto tracking", new Object[0]);
            return;
        }
        this.f22481c.warning("Could not enable activity auto tracking. " + enumC0346n.f24389a, new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final void a(Activity activity) {
        if (this.f24067q.i.a(activity, EnumC0396p.RESUMED)) {
            this.f22481c.info("Resume session", new Object[0]);
            e(activity != null ? activity.getClass().getSimpleName() : null);
            C0146f2 c0146f2 = this.f24067q.f24776g;
            synchronized (c0146f2) {
                for (C0120e2 c0120e2 : c0146f2.f23827a) {
                    if (c0120e2.f23725d) {
                        c0120e2.f23725d = false;
                        c0120e2.f23723b.remove(c0120e2.f23726e);
                        C0234ic c0234ic = c0120e2.f23722a.f23984a;
                        c0234ic.f22486h.f24913c.b(c0234ic.f22480b.f22438a);
                    }
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Ic
    public final void a(Location location) {
        this.f22480b.f22439b.setManualLocation(location);
        this.f22481c.info("Set location: %s", location);
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Ic
    public final void a(boolean z5) {
        this.f22480b.f22439b.setLocationTracking(z5);
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Ic
    public final void a(boolean z5, boolean z10) {
        this.f22481c.info("Set advIdentifiersTracking to %s", Boolean.valueOf(z5));
        this.f22480b.f22439b.setAdvIdentifiersTracking(z5, z10);
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final void a(@NonNull Go go) {
        PublicLogger publicLogger = this.f22481c;
        synchronized (go) {
            go.f22404b = publicLogger;
        }
        Iterator it = go.f22403a.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).consume(publicLogger);
        }
        go.f22403a.clear();
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final void a(@NonNull AnrListener anrListener) {
        this.f24068r.a(anrListener);
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final void a(@NonNull ExternalAttribution externalAttribution) {
        this.f22481c.info("External attribution received: %s", externalAttribution);
        C0564vi c0564vi = this.f22486h;
        byte[] bytes = externalAttribution.toBytes();
        PublicLogger publicLogger = this.f22481c;
        Set set = AbstractC0605x9.f25010a;
        EnumC0078cb enumC0078cb = EnumC0078cb.EVENT_TYPE_UNDEFINED;
        N3 n32 = new N3(bytes, "", 42, publicLogger);
        Eh eh2 = this.f22480b;
        c0564vi.getClass();
        c0564vi.a(C0564vi.a(n32, eh2), eh2, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.impl.J2, io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Ic
    public final void a(String str, String str2) {
        super.a(str, str2);
        Bd bd2 = this.f24067q.f24772c;
        String strD = this.f22480b.d();
        H0 h0 = bd2.f22148d;
        if (h0 != null) {
            H0 h02 = new H0(h0.f22405a, h0.f22406b, h0.f22407c, h0.f22408d, h0.f22409e, strD);
            bd2.f22148d = h02;
            NativeCrashClientModule nativeCrashClientModule = bd2.f22146b;
            bd2.f22147c.getClass();
            nativeCrashClientModule.updateAppMetricaMetadata(I0.a(h02));
        }
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Ic
    public final void a(@NonNull String str) {
        this.f22481c.info("Add auto collected data subscriber: %s", str);
        this.f22480b.f22439b.addAutoCollectedDataSubscriber(str);
    }
}
