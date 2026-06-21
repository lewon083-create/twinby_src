package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.m6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0328m6 implements Va {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0353n6 f24339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Eh f24340b;

    public C0328m6(@NotNull C0353n6 c0353n6) {
        this.f24339a = c0353n6;
        this.f24340b = c0353n6.a();
        C0071c4.l().getClass();
    }

    @Override // io.appmetrica.analytics.impl.Va
    public final void a(@NotNull Pn pn) {
        C0564vi c0564vi = this.f24339a.f24401a;
        C0538uh c0538uhA = c0564vi.a(pn, this.f24340b);
        Eh eh2 = c0538uhA.f24851e;
        Ol ol2 = c0564vi.f24915e;
        if (ol2 != null) {
            eh2.f22439b.setUuid(((Nl) ol2).g());
        } else {
            eh2.getClass();
        }
        c0564vi.f24913c.b(c0538uhA);
        LoggerStorage.getMainPublicOrAnonymousLogger().info("Unhandled exception received: " + pn, new Object[0]);
    }

    public final void a(@NotNull AppMetricaConfig appMetricaConfig) {
        Map<String, String> map = appMetricaConfig.errorEnvironment;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                Eh eh2 = this.f24340b;
                String key = entry.getKey();
                String value = entry.getValue();
                synchronized (eh2) {
                    E8 e82 = eh2.f22293c;
                    e82.f22285b.b(e82.f22284a, key, value);
                }
            }
        }
    }
}
