package io.appmetrica.analytics.location.impl;

import io.appmetrica.analytics.locationapi.internal.CacheArguments;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f25157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f25158b;

    public j(k kVar, i iVar) {
        this.f25158b = kVar;
        this.f25157a = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p pVar = this.f25158b.f25161c;
        i iVar = this.f25157a;
        pVar.f25177a = iVar;
        CacheArguments cacheArguments = iVar.f25156b;
        pVar.f25178b.updateCacheControl(cacheArguments.getRefreshPeriod(), cacheArguments.getOutdatedTimeInterval());
    }
}
