package yads;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class rd0 extends px0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f42553b;

    public rd0(Map map) {
        this.f42553b = map;
    }

    public static /* synthetic */ boolean a(String str) {
        return str != null;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && this.f42553b.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        Iterator it = (Iterator) pg2.a(((lx) entrySet()).iterator());
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

    @Override // yads.px0, java.util.Map
    public final Set entrySet() {
        return oy2.a(super.entrySet(), (qg2) new zl.v0(0));
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return ((ly2) entrySet()).equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.f42553b.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return oy2.a(entrySet());
    }

    @Override // yads.px0, java.util.Map
    public final boolean isEmpty() {
        return super.isEmpty() || (super.size() == 1 && this.f42553b.containsKey(null));
    }

    @Override // yads.px0, java.util.Map
    public final Set keySet() {
        return oy2.a(super.keySet(), (qg2) new zl.v0(1));
    }

    @Override // yads.px0, java.util.Map
    public final int size() {
        return super.size() - (this.f42553b.containsKey(null) ? 1 : 0);
    }

    public static /* synthetic */ boolean a(Map.Entry entry) {
        return entry.getKey() != null;
    }
}
