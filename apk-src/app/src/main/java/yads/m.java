package yads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class m implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f40720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Collection f40721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n f40722d;

    public m(n nVar) {
        this.f40722d = nVar;
        this.f40720b = nVar.f41112d.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f40720b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f40720b.next();
        this.f40721c = (Collection) entry.getValue();
        return this.f40722d.a(entry);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!(this.f40721c != null)) {
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
        this.f40720b.remove();
        this.f40722d.f41113e.f36594g -= this.f40721c.size();
        this.f40721c.clear();
        this.f40721c = null;
    }
}
