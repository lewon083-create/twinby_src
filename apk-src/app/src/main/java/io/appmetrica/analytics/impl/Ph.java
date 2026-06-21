package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Ph implements Provider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0646z0 f22834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f22835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ReporterConfig f22836c;

    public Ph(C0646z0 c0646z0, Context context, ReporterConfig reporterConfig) {
        this.f22834a = c0646z0;
        this.f22835b = context;
        this.f22836c = reporterConfig;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Provider
    public final Object get() {
        C0646z0 c0646z0 = this.f22834a;
        Context context = this.f22835b;
        ReporterConfig reporterConfig = this.f22836c;
        c0646z0.getClass();
        return C0621y0.a(context).f().c(reporterConfig);
    }
}
