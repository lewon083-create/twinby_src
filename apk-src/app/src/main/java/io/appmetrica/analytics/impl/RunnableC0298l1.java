package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ExternalAttribution;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.l1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC0298l1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ExternalAttribution f24258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0522u1 f24259b;

    public RunnableC0298l1(C0522u1 c0522u1, ExternalAttribution externalAttribution) {
        this.f24259b = c0522u1;
        this.f24258a = externalAttribution;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0522u1.a(this.f24259b).a(this.f24258a);
    }
}
