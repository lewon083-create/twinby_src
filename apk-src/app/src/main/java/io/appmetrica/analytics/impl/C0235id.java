package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.id, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0235id extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0360nd f24069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ModuleEvent f24070b;

    public C0235id(C0360nd c0360nd, ModuleEvent moduleEvent) {
        this.f24069a = c0360nd;
        this.f24070b = moduleEvent;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C0360nd.a(this.f24069a).reportEvent(this.f24070b);
    }
}
