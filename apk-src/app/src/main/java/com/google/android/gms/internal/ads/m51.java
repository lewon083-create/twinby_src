package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m51 extends f41 implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient Map f7785e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public transient int f7786f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient t31 f7787g;

    public m51(Map map, t31 t31Var) {
        ix.o(map.isEmpty());
        this.f7785e = map;
        this.f7787g = t31Var;
    }

    @Override // com.google.android.gms.internal.ads.f41
    public final Collection a() {
        return new ad.m(3, this);
    }

    @Override // com.google.android.gms.internal.ads.f41
    public final Map b() {
        Map map = this.f7785e;
        return map instanceof NavigableMap ? new z31(this, (NavigableMap) map) : map instanceof SortedMap ? new c41(this, (SortedMap) map) : new ad.d(this, map);
    }

    public final void e() {
        Map map = this.f7785e;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.f7786f = 0;
    }
}
