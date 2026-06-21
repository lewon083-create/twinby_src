package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Ni {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Revenue f22741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Tm f22742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0090cn f22743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0090cn f22744d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final PublicLogger f22745e;

    public Ni(Revenue revenue, PublicLogger publicLogger) {
        this.f22745e = publicLogger;
        this.f22741a = revenue;
        this.f22742b = new Tm(30720, "revenue payload", publicLogger);
        this.f22743c = new C0090cn(new Tm(184320, "receipt data", publicLogger), "<truncated data was not sent, exceeded the limit of 180kb>");
        this.f22744d = new C0090cn(new Wm(1000, "receipt signature", publicLogger), "<truncated data was not sent, exceeded the limit of 180kb>");
    }
}
