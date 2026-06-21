package p3;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends ad.c0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f31191c;

    public o(Map map) {
        this.f31191c = map;
    }

    @Override // ad.c0, java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && super.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return super.standardContainsValue(obj);
    }

    @Override // ad.d0
    public final Object delegate() {
        return this.f31191c;
    }

    @Override // ad.c0, java.util.Map
    public final Set entrySet() {
        return ad.q.h(super.entrySet(), new n(0));
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && super.standardEquals(obj);
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
        return super.standardHashCode();
    }

    @Override // ad.c0, java.util.Map
    public final boolean isEmpty() {
        return super.isEmpty() || (super.size() == 1 && super.containsKey(null));
    }

    @Override // ad.c0, java.util.Map
    public final Set keySet() {
        return ad.q.h(super.keySet(), new n(1));
    }

    @Override // ad.c0, java.util.Map
    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }

    @Override // ad.c0, ad.d0
    public final Map delegate() {
        return this.f31191c;
    }
}
