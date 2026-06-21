package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class bd1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final bd1 f3764b = new bd1(Collections.unmodifiableMap(new HashMap()));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f3765a;

    public /* synthetic */ bd1(Map map) {
        this.f3765a = map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bd1) {
            return this.f3765a.equals(((bd1) obj).f3765a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3765a.hashCode();
    }

    public final String toString() {
        return this.f3765a.toString();
    }
}
