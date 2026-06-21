package ad;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c0 extends d0 implements Map {
    @Override // java.util.Map
    public void clear() {
        delegate().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return delegate().containsKey(obj);
    }

    @Override // ad.d0
    public abstract Map delegate();

    @Override // java.util.Map
    public Set entrySet() {
        return delegate().entrySet();
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return delegate().get(obj);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return delegate().isEmpty();
    }

    @Override // java.util.Map
    public Set keySet() {
        return delegate().keySet();
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        return delegate().put(obj, obj2);
    }

    @Override // java.util.Map
    public void putAll(Map<Object, Object> map) {
        delegate().putAll(map);
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        return delegate().remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return delegate().size();
    }

    public boolean standardContainsValue(Object obj) {
        v0 v0Var = new v0(entrySet().iterator());
        if (obj == null) {
            while (v0Var.hasNext()) {
                if (v0Var.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (v0Var.hasNext()) {
            if (obj.equals(v0Var.next())) {
                return true;
            }
        }
        return false;
    }

    public boolean standardEquals(Object obj) {
        return q.f(obj, this);
    }

    public int standardHashCode() {
        return q.k(entrySet());
    }

    @Override // java.util.Map
    public Collection<Object> values() {
        return delegate().values();
    }
}
