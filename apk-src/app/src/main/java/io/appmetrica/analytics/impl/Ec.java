package io.appmetrica.analytics.impl;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class Ec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f22289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f22290b;

    public Ec(Object obj) {
        this(new HashMap(), obj);
    }

    public final void a(Object obj, Object obj2) {
        this.f22289a.put(obj, obj2);
    }

    public Ec(HashMap map, Object obj) {
        this.f22289a = map;
        this.f22290b = obj;
    }

    public final Object a(Object obj) {
        Object obj2 = this.f22289a.get(obj);
        return obj2 == null ? this.f22290b : obj2;
    }
}
