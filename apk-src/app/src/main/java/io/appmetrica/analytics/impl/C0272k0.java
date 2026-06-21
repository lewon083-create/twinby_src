package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.HashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.k0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0272k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f24191a = new HashMap();

    public final synchronized C0247j0 a(R4 r42, PublicLogger publicLogger, Ve ve2) {
        C0247j0 c0247j0;
        c0247j0 = (C0247j0) this.f24191a.get(r42.toString());
        if (c0247j0 == null) {
            C0222i0 c0222i0D = ve2.d();
            c0247j0 = new C0247j0(c0222i0D.f24033a, c0222i0D.f24034b, new C0443ql(publicLogger, "[App Environment]"));
            this.f24191a.put(r42.toString(), c0247j0);
        }
        return c0247j0;
    }

    public final synchronized void a(C0222i0 c0222i0, Ve ve2) {
        ve2.a(c0222i0).b();
    }
}
