package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Om {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f22814a;

    public Om() {
        HashMap map = new HashMap();
        this.f22814a = map;
        Im im = new Im();
        Jm jm = new Jm();
        Km km = new Km();
        Lm lm = new Lm();
        map.put(C0243im.class, im);
        map.put(U1.class, jm);
        map.put(C0082cf.class, km);
        map.put(C0499t3.class, lm);
    }

    public static Pm a(Class cls) {
        return (Pm) Nm.f22760a.f22814a.get(cls);
    }
}
