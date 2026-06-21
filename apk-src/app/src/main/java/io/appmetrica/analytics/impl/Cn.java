package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.BiFunction;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Cn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bn f22237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BiFunction f22238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bf f22239c;

    public Cn() {
        this(new C0669zn(), new C0332ma(), C0071c4.l().n());
    }

    public final ArrayList a(Thread thread, Thread thread2) {
        Map mapC;
        ArrayList arrayList = new ArrayList();
        TreeMap treeMap = new TreeMap(new An());
        try {
            mapC = this.f22237a.c();
        } catch (SecurityException unused) {
            mapC = null;
        }
        if (mapC != null) {
            treeMap.putAll(mapC);
        }
        if (thread2 != null) {
            treeMap.remove(thread2);
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            Thread thread3 = (Thread) entry.getKey();
            if (thread3 != thread && thread3 != thread2) {
                arrayList.add((C0569vn) this.f22238b.apply(thread3, (StackTraceElement[]) entry.getValue()));
            }
        }
        return arrayList;
    }

    public Cn(Bn bn, C0332ma c0332ma, C0477s6 c0477s6) {
        this.f22237a = bn;
        this.f22238b = c0332ma;
        this.f22239c = c0477s6;
    }
}
