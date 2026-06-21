package io.appmetrica.analytics.identifiers.impl;

import java.util.Map;
import kotlin.Pair;
import kotlin.collections.j0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f21916a;

    public d(Map map) {
        this.f21916a = map;
    }

    public d() {
        this(j0.g(new Pair("google", new h()), new Pair("huawei", new j()), new Pair("yandex", new q())));
    }
}
