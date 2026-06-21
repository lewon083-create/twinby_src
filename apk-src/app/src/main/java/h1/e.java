package h1;

import androidx.datastore.preferences.protobuf.h1;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends i implements Map {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h1 f20326e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f20327f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d f20328g;

    public e() {
        super(0);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        h1 h1Var = this.f20326e;
        if (h1Var != null) {
            return h1Var;
        }
        h1 h1Var2 = new h1(this, 4);
        this.f20326e = h1Var2;
        return h1Var2;
    }

    public final boolean j(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean k(Collection collection) {
        int i = this.f20340d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.f20340d;
    }

    @Override // java.util.Map
    public final Set keySet() {
        b bVar = this.f20327f;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(this);
        this.f20327f = bVar2;
        return bVar2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f20340d);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        d dVar = this.f20328g;
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d(this);
        this.f20328g = dVar2;
        return dVar2;
    }
}
