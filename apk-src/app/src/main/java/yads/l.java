package yads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class l extends qi1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f40391b;

    public l(n nVar) {
        this.f40391b = nVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Set setEntrySet = this.f40391b.f41112d.entrySet();
        setEntrySet.getClass();
        try {
            return setEntrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new m(this.f40391b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object objRemove;
        Set setEntrySet = this.f40391b.f41112d.entrySet();
        setEntrySet.getClass();
        try {
            if (!setEntrySet.contains(obj)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Objects.requireNonNull(entry);
            a0 a0Var = this.f40391b.f41113e;
            Object key = entry.getKey();
            Map map = a0Var.f36593f;
            map.getClass();
            try {
                objRemove = map.remove(key);
            } catch (ClassCastException | NullPointerException unused) {
                objRemove = null;
            }
            Collection collection = (Collection) objRemove;
            if (collection == null) {
                return true;
            }
            int size = collection.size();
            collection.clear();
            a0Var.f36594g -= size;
            return true;
        } catch (ClassCastException | NullPointerException unused2) {
            return false;
        }
    }
}
