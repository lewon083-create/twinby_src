package ob;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f30426b;

    public t(u uVar) {
        this.f30426b = uVar.f30430b.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f30426b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.f30426b.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
