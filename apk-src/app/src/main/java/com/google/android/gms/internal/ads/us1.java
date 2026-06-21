package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class us1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final us1 f11057b = new us1(new HashMap());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f11058a;

    public /* synthetic */ us1(HashMap map) {
        this.f11058a = Collections.unmodifiableMap(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof us1) {
            return this.f11058a.equals(((us1) obj).f11058a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11058a.hashCode();
    }
}
