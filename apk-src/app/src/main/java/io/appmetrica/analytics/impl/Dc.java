package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Dc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Wm f22246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Wm f22247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0351n4 f22248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PublicLogger f22249d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f22250e;

    public Dc(String str, PublicLogger publicLogger) {
        this(new C0351n4(30), new Wm(50, str.concat("map key"), publicLogger), new Wm(4000, str.concat("map value"), publicLogger), str, publicLogger);
    }

    public Dc(C0351n4 c0351n4, Wm wm, Wm wm2, String str, PublicLogger publicLogger) {
        this.f22248c = c0351n4;
        this.f22246a = wm;
        this.f22247b = wm2;
        this.f22250e = str;
        this.f22249d = publicLogger;
    }
}
