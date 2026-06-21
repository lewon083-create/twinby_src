package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.internal.CounterConfiguration;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.zc, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0658zc extends J2 {
    public C0658zc(Context context, Af af2, ReporterConfig reporterConfig, C0564vi c0564vi, N9 n92) {
        this(context, c0564vi, new Eh(af2, new CounterConfiguration(reporterConfig), new E8(new C0443ql(LoggerStorage.getOrCreatePublicLogger(reporterConfig.apiKey), "Crash Environment")), reporterConfig.userProfileID), n92, C0071c4.l().n(), new Qn(), new Dg(), new C0577w6(), new C0093d0(), new Je(n92));
    }

    @Override // io.appmetrica.analytics.impl.J2
    public final String j() {
        return "[ManualReporter]";
    }

    public C0658zc(Context context, C0564vi c0564vi, Eh eh2, N9 n92, C0477s6 c0477s6, Qn qn, Dg dg, C0577w6 c0577w6, C0093d0 c0093d0, Je je2) {
        super(context, c0564vi, eh2, n92, c0477s6, qn, dg, c0577w6, c0093d0, je2);
        C0071c4.l().getClass();
    }
}
