package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Sh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ReporterConfig f22967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0162fi f22968b;

    public Sh(C0162fi c0162fi, ReporterConfig reporterConfig) {
        this.f22968b = c0162fi;
        this.f22967a = reporterConfig;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0162fi c0162fi = this.f22968b;
        ReporterConfig reporterConfig = this.f22967a;
        C0646z0 c0646z0 = c0162fi.f23884a;
        Context context = c0162fi.f23887d;
        c0646z0.getClass();
        C0621y0.a(context).f().a(reporterConfig);
    }
}
