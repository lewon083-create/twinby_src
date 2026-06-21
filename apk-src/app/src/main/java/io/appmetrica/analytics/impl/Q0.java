package io.appmetrica.analytics.impl;

import android.location.Location;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Q0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Location f22849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0522u1 f22850b;

    public Q0(C0522u1 c0522u1, Location location) {
        this.f22850b = c0522u1;
        this.f22849a = location;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0646z0 c0646z0 = this.f22850b.f24823a;
        Location location = this.f22849a;
        c0646z0.getClass();
        C0621y0.c().a(location);
    }
}
