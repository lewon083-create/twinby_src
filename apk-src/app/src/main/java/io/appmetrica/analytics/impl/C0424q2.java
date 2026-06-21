package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.q2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0424q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ve f24607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f24608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f24609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SystemTimeProvider f24610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f24611e;

    public C0424q2(R4 r42, Ve ve2) {
        this.f24607a = ve2;
        r42.b();
        this.f24608b = TimeUnit.MINUTES.toMillis(1L);
        this.f24609c = TimeUnit.DAYS.toMillis(7L);
        this.f24610d = new SystemTimeProvider();
        Map<String, Long> mapF = ve2.f();
        a(mapF);
        this.f24611e = mapF;
    }

    public final void a(Map map) {
        long jCurrentTimeMillis = this.f24610d.currentTimeMillis();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (((Number) entry.getValue()).longValue() < jCurrentTimeMillis - this.f24609c) {
                linkedHashSet.add(str);
            }
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            map.remove((String) it.next());
        }
    }
}
