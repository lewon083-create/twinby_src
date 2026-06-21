package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Handler;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.LinkedHashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ii, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0239ii implements Ta {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f24082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Af f24083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0564vi f24084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f24085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Nl f24086e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0508tc f24087f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f24088g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Dn f24089h;
    public final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C0234ic f24090j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C0328m6 f24091k;

    public C0239ii(@NotNull Context context, @NotNull Af af2, @NotNull C0564vi c0564vi, @NotNull Handler handler, @NotNull Nl nl2) {
        this.f24082a = context;
        this.f24083b = af2;
        this.f24084c = c0564vi;
        this.f24085d = handler;
        this.f24086e = nl2;
        this.f24087f = new C0508tc(context, af2, c0564vi, nl2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f24088g = linkedHashMap;
        this.f24089h = new Dn(new C0290ki(linkedHashMap));
        this.i = kotlin.collections.s.f("20799a27-fa80-4b36-b2db-0f8141f24180", "0e5e9c33-f8c3-4568-86c5-2e4f57523f72");
    }

    @Override // io.appmetrica.analytics.impl.Ta, io.appmetrica.analytics.impl.Ua
    public final Ta a() {
        return this;
    }

    @NotNull
    public final C0239ii b() {
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ta
    @NotNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final synchronized C0234ic b(@NotNull AppMetricaConfig appMetricaConfig, @NotNull PublicLogger publicLogger, @NotNull C0297l0 c0297l0) {
        C0234ic c0234ic;
        try {
            c0234ic = this.f24090j;
            if (c0234ic != null) {
                C0508tc c0508tc = this.f24087f;
                c0508tc.getClass();
                publicLogger.info("Update anonymous config with value " + appMetricaConfig.toJson(), new Object[0]);
                c0508tc.f24775f.f22439b.applyFromAnonymousConfig(appMetricaConfig);
            } else {
                this.f24089h.a(appMetricaConfig.apiKey);
                C0508tc c0508tc2 = this.f24087f;
                c0508tc2.getClass();
                publicLogger.info("Update anonymous config with value " + appMetricaConfig.toJson(), new Object[0]);
                c0508tc2.f24775f.f22439b.applyFromAnonymousConfig(appMetricaConfig);
                c0234ic = new C0234ic(this.f24087f);
                c0234ic.i = new C0408pb(this.f24085d, c0234ic);
                Nl nl2 = this.f24086e;
                Eh eh2 = c0234ic.f22480b;
                if (nl2 != null) {
                    eh2.f22439b.setUuid(nl2.g());
                } else {
                    eh2.getClass();
                }
                c0234ic.a(appMetricaConfig, c0297l0);
                c0234ic.k();
                this.f24084c.f24916f.f23261c = new C0214hi(c0234ic);
                this.f24088g.put(appMetricaConfig.apiKey, c0234ic);
                this.f24090j = c0234ic;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return c0234ic;
    }

    @Override // io.appmetrica.analytics.impl.Ta
    @NotNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final synchronized C0234ic a(@NotNull AppMetricaConfig appMetricaConfig, @NotNull PublicLogger publicLogger, @NotNull C0297l0 c0297l0) {
        C0234ic c0234ic;
        try {
            c0234ic = this.f24090j;
            if (c0234ic != null) {
                this.f24087f.a(appMetricaConfig, publicLogger);
                c0234ic.a(appMetricaConfig, c0297l0);
                C0071c4.l().getClass();
                this.f24088g.put(appMetricaConfig.apiKey, c0234ic);
            } else {
                this.f24089h.a(appMetricaConfig.apiKey);
                this.f24087f.a(appMetricaConfig, publicLogger);
                c0234ic = new C0234ic(this.f24087f);
                c0234ic.i = new C0408pb(this.f24085d, c0234ic);
                Nl nl2 = this.f24086e;
                Eh eh2 = c0234ic.f22480b;
                if (nl2 != null) {
                    eh2.f22439b.setUuid(nl2.g());
                } else {
                    eh2.getClass();
                }
                c0234ic.a(appMetricaConfig, c0297l0);
                c0234ic.k();
                this.f24084c.f24916f.f23261c = new C0214hi(c0234ic);
                this.f24088g.put(appMetricaConfig.apiKey, c0234ic);
                C0071c4.l().getClass();
                this.f24090j = c0234ic;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return c0234ic;
    }

    @Override // io.appmetrica.analytics.impl.Ta
    public final synchronized void a(@NotNull ReporterConfig reporterConfig) {
        try {
            if (this.f24088g.containsKey(reporterConfig.apiKey)) {
                LoggerStorage.getOrCreatePublicLogger(reporterConfig.apiKey).warning("Reporter with apiKey=%s already exists.", ApiKeyUtils.createPartialApiKey(reporterConfig.apiKey));
            } else {
                b(reporterConfig);
                ImportantLogger.INSTANCE.info("AppMetrica", "Activate reporter with APIKey " + ApiKeyUtils.createPartialApiKey(reporterConfig.apiKey), new Object[0]);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // io.appmetrica.analytics.impl.Ta
    @NotNull
    public final synchronized Sa b(@NotNull ReporterConfig reporterConfig) {
        Sa sa;
        try {
            Sa sa2 = (Sa) this.f24088g.get(reporterConfig.apiKey);
            sa = sa2;
            if (sa2 == null) {
                if (!this.i.contains(reporterConfig.apiKey)) {
                    this.f24086e.i();
                }
                Context context = this.f24082a;
                C0658zc c0658zc = new C0658zc(context, this.f24083b, reporterConfig, this.f24084c, new N9(context));
                c0658zc.i = new C0408pb(this.f24085d, c0658zc);
                Nl nl2 = this.f24086e;
                Eh eh2 = c0658zc.f22480b;
                if (nl2 != null) {
                    eh2.f22439b.setUuid(nl2.g());
                } else {
                    eh2.getClass();
                }
                c0658zc.k();
                this.f24088g.put(reporterConfig.apiKey, c0658zc);
                sa = c0658zc;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return sa;
    }

    @Override // io.appmetrica.analytics.impl.Ta
    @NotNull
    public final synchronized Va a(@NotNull AppMetricaConfig appMetricaConfig) {
        C0328m6 c0328m6;
        try {
            c0328m6 = this.f24091k;
            if (c0328m6 != null) {
                c0328m6.a(appMetricaConfig);
            } else {
                C0328m6 c0328m62 = new C0328m6(new C0353n6(this.f24083b, this.f24087f.f24774e, this.f24084c, appMetricaConfig));
                this.f24091k = c0328m62;
                c0328m6 = c0328m62;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return c0328m6;
    }
}
