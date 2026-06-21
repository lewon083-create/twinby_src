package yads;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class px0 implements Map {
    @Override // java.util.Map
    public final void clear() {
        ((rd0) this).f42553b.clear();
    }

    @Override // java.util.Map
    public Set entrySet() {
        return ((rd0) this).f42553b.entrySet();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return ((rd0) this).f42553b.isEmpty();
    }

    @Override // java.util.Map
    public Set keySet() {
        return ((rd0) this).f42553b.keySet();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return ((rd0) this).f42553b.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        ((rd0) this).f42553b.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return ((rd0) this).f42553b.remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return ((rd0) this).f42553b.size();
    }

    public final String toString() {
        return ((rd0) this).f42553b.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        return ((rd0) this).f42553b.values();
    }
}
