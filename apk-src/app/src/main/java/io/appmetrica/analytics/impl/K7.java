package io.appmetrica.analytics.impl;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class K7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f22558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22560c;

    public K7(String str, HashMap map, String str2) {
        this.f22559b = str;
        this.f22558a = map;
        this.f22560c = str2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeferredDeeplinkState{mParameters=");
        sb2.append(this.f22558a);
        sb2.append(", mDeeplink='");
        sb2.append(this.f22559b);
        sb2.append("', mUnparsedReferrer='");
        return a0.u.o(sb2, this.f22560c, "'}");
    }
}
