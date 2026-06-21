package yads;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class v83 implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f43929b;

    public v83(Iterator it) {
        this.f43929b = (Iterator) pg2.a(it);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f43929b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return ((Map.Entry) this.f43929b.next()).getValue();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f43929b.remove();
    }
}
