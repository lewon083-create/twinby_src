package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.n2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0349n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f24393a;

    public C0349n2(ArrayList arrayList) {
        this.f24393a = arrayList;
    }

    public final String toString() {
        return a0.u.p(new StringBuilder("AttributionConfig{deeplinkConditions="), this.f24393a, '}');
    }
}
