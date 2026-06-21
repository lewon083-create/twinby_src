package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class W8 extends X8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f23211a;

    public W8(List<Object> list) {
        this.f23211a = CollectionUtils.unmodifiableListCopy(list);
    }

    public final List<Object> a() {
        return this.f23211a;
    }
}
