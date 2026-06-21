package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AnrListener;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.k1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC0273k1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AnrListener f24192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0522u1 f24193b;

    public RunnableC0273k1(C0522u1 c0522u1, AnrListener anrListener) {
        this.f24193b = c0522u1;
        this.f24192a = anrListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0522u1.a(this.f24193b).a(this.f24192a);
    }
}
