package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class M implements Provider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f22637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Fi f22638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ N f22639c;

    public M(N n10, Context context, Fi fi2) {
        this.f22639c = n10;
        this.f22637a = context;
        this.f22638b = fi2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Provider
    public final Object get() {
        return this.f22639c.f22705a.a(this.f22637a, this.f22638b);
    }
}
