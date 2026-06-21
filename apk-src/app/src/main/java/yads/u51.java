package yads;

import io.sentry.rrweb.RRWebVideoEvent;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class u51 implements Map, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient wm2 f43568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient xm2 f43569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient ym2 f43570d;

    public static u51 a(HashMap map) {
        Set<Map.Entry> setEntrySet = map.entrySet();
        boolean z5 = setEntrySet instanceof Collection;
        s51 s51Var = new s51(z5 ? setEntrySet.size() : 4);
        if (z5) {
            s51Var.a(setEntrySet.size());
        }
        for (Map.Entry entry : setEntrySet) {
            s51Var.a(entry.getKey(), entry.getValue());
        }
        return zm2.a(s51Var.f42812b, s51Var.f42811a);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final w51 entrySet() {
        wm2 wm2Var = this.f43568b;
        if (wm2Var != null) {
            return wm2Var;
        }
        zm2 zm2Var = (zm2) this;
        wm2 wm2Var2 = new wm2(zm2Var, zm2Var.f45464f, zm2Var.f45465g);
        this.f43568b = wm2Var2;
        return wm2Var2;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        ym2 ym2Var = this.f43570d;
        if (ym2Var == null) {
            zm2 zm2Var = (zm2) this;
            ym2 ym2Var2 = new ym2(zm2Var.f45464f, 1, zm2Var.f45465g);
            this.f43570d = ym2Var2;
            ym2Var = ym2Var2;
        }
        return ym2Var.contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return ((w51) entrySet()).equals(((Map) obj).entrySet());
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return oy2.a(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((zm2) this).size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        xm2 xm2Var = this.f43569c;
        if (xm2Var != null) {
            return xm2Var;
        }
        zm2 zm2Var = (zm2) this;
        xm2 xm2Var2 = new xm2(zm2Var, new ym2(zm2Var.f45464f, 0, zm2Var.f45465g));
        this.f43569c = xm2Var2;
        return xm2Var2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = ((zm2) this).size();
        kx.a(size, RRWebVideoEvent.JsonKeys.SIZE);
        StringBuilder sb2 = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
        sb2.append('{');
        boolean z5 = true;
        for (Map.Entry entry : entrySet()) {
            if (!z5) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
            z5 = false;
        }
        sb2.append('}');
        return sb2.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        ym2 ym2Var = this.f43570d;
        if (ym2Var != null) {
            return ym2Var;
        }
        zm2 zm2Var = (zm2) this;
        ym2 ym2Var2 = new ym2(zm2Var.f45464f, 1, zm2Var.f45465g);
        this.f43570d = ym2Var2;
        return ym2Var2;
    }

    public static s51 a() {
        return new s51(4);
    }
}
