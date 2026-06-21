package yads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class p implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map.Entry f41782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Iterator f41783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f41784d;

    public p(q qVar, Iterator it) {
        this.f41784d = qVar;
        this.f41783c = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f41783c.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f41783c.next();
        this.f41782b = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        Map.Entry entry = this.f41782b;
        if (!(entry != null)) {
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
        Collection collection = (Collection) entry.getValue();
        this.f41783c.remove();
        this.f41784d.f42125c.f36594g -= collection.size();
        collection.clear();
        this.f41782b = null;
    }
}
