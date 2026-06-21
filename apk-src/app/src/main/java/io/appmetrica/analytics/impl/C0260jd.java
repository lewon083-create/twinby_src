package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.jd, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0260jd extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0360nd f24151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f24153c;

    public C0260jd(C0360nd c0360nd, int i, String str) {
        this.f24151a = c0360nd;
        this.f24152b = i;
        this.f24153c = str;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C0360nd.a(this.f24151a).a(new G9(this.f24152b, this.f24153c));
    }
}
