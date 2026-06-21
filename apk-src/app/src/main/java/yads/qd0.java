package yads;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class qd0 extends ad.c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f42276b;

    public qd0(Map map) {
        this.f42276b = map;
    }

    public static /* synthetic */ boolean a(String str) {
        return str != null;
    }

    @Override // ad.c0, java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && super.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return standardContainsValue(obj);
    }

    @Override // ad.d0
    public final Object delegate() {
        return this.f42276b;
    }

    @Override // ad.c0, java.util.Map
    public final Set entrySet() {
        return ad.q.h(super.entrySet(), new p3.n(2));
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && standardEquals(obj);
    }

    @Override // ad.c0, java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) super.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return standardHashCode();
    }

    @Override // ad.c0, java.util.Map
    public final boolean isEmpty() {
        return super.isEmpty() || (super.size() == 1 && super.containsKey(null));
    }

    @Override // ad.c0, java.util.Map
    public final Set keySet() {
        return ad.q.h(super.keySet(), new p3.n(3));
    }

    @Override // ad.c0, java.util.Map
    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }

    public static /* synthetic */ boolean a(Map.Entry entry) {
        return entry.getKey() != null;
    }

    @Override // ad.c0, ad.d0
    public final Map delegate() {
        return this.f42276b;
    }
}
