package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class wd1 extends gr implements Map {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f11756d;

    public wd1(Map map) {
        super(10);
        this.f11756d = map;
    }

    @Override // com.google.android.gms.internal.ads.gr
    public final /* synthetic */ Object C() {
        return this.f11756d;
    }

    @Override // java.util.Map
    public final void clear() {
        this.f11756d.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && this.f11756d.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        Iterator it = ((a61) entrySet()).iterator();
        it.getClass();
        if (obj == null) {
            while (it.hasNext()) {
                if (((Map.Entry) it.next()).getValue() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(((Map.Entry) it.next()).getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return fs1.t(this.f11756d.entrySet(), i2.f6339e);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && gr.I(obj, this);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.f11756d.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return fs1.D(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        Map map = this.f11756d;
        if (map.isEmpty()) {
            return true;
        }
        return map.size() == 1 && map.containsKey(null);
    }

    @Override // java.util.Map
    public final Set keySet() {
        return fs1.t(this.f11756d.keySet(), i2.f6340f);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.f11756d.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        this.f11756d.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return this.f11756d.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        Map map = this.f11756d;
        return map.size() - (map.containsKey(null) ? 1 : 0);
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f11756d.values();
    }
}
