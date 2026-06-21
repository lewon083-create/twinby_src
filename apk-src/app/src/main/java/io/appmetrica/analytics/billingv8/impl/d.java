package io.appmetrica.analytics.billingv8.impl;

import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d8.d f21663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f21664b = new LinkedHashSet();

    public d(d8.d dVar) {
        this.f21663a = dVar;
    }

    public final void a(Object obj) {
        this.f21664b.remove(obj);
        if (this.f21664b.size() == 0) {
            this.f21663a.a();
        }
    }
}
