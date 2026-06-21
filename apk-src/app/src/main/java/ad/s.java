package ad;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends AbstractSet {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f864c;

    public /* synthetic */ s(v vVar, int i) {
        this.f863b = i;
        this.f864c = vVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f863b) {
            case 0:
                this.f864c.clear();
                break;
            default:
                this.f864c.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f863b) {
            case 0:
                v vVar = this.f864c;
                Map mapC = vVar.c();
                if (mapC != null) {
                    return mapC.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int iE = vVar.e(entry.getKey());
                    if (iE != -1 && Objects.equals(vVar.k()[iE], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f864c.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f863b) {
            case 0:
                v vVar = this.f864c;
                Map mapC = vVar.c();
                return mapC != null ? mapC.entrySet().iterator() : new r(vVar, 1);
            default:
                v vVar2 = this.f864c;
                Map mapC2 = vVar2.c();
                return mapC2 != null ? mapC2.keySet().iterator() : new r(vVar2, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f863b) {
            case 0:
                v vVar = this.f864c;
                Map mapC = vVar.c();
                if (mapC != null) {
                    return mapC.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!vVar.g()) {
                        int iD = vVar.d();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = vVar.f882b;
                        Objects.requireNonNull(obj2);
                        int iO = q.o(key, value, iD, obj2, vVar.i(), vVar.j(), vVar.k());
                        if (iO != -1) {
                            vVar.f(iO, iD);
                            vVar.f887g--;
                            vVar.f886f += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                v vVar2 = this.f864c;
                Map mapC2 = vVar2.c();
                return mapC2 != null ? mapC2.keySet().remove(obj) : vVar2.h(obj) != v.f881k;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f863b) {
        }
        return this.f864c.size();
    }
}
