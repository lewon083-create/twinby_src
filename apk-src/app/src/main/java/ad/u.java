package ad;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements Map.Entry {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v f877d;

    public u(v vVar, int i) {
        this.f877d = vVar;
        Object obj = v.f881k;
        this.f875b = vVar.j()[i];
        this.f876c = i;
    }

    public final void a() {
        int i = this.f876c;
        Object obj = this.f875b;
        v vVar = this.f877d;
        if (i != -1 && i < vVar.size()) {
            if (Objects.equals(obj, vVar.j()[this.f876c])) {
                return;
            }
        }
        Object obj2 = v.f881k;
        this.f876c = vVar.e(obj);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (Objects.equals(getKey(), entry.getKey()) && Objects.equals(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f875b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        v vVar = this.f877d;
        Map mapC = vVar.c();
        if (mapC != null) {
            return mapC.get(this.f875b);
        }
        a();
        int i = this.f876c;
        if (i == -1) {
            return null;
        }
        return vVar.k()[i];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        Object value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        v vVar = this.f877d;
        Map mapC = vVar.c();
        Object obj2 = this.f875b;
        if (mapC != null) {
            return mapC.put(obj2, obj);
        }
        a();
        int i = this.f876c;
        if (i == -1) {
            vVar.put(obj2, obj);
            return null;
        }
        Object obj3 = vVar.k()[i];
        vVar.k()[this.f876c] = obj;
        return obj3;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
