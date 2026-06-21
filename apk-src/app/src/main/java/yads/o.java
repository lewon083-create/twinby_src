package yads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class o implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f41404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f41405c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Collection f41406d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Iterator f41407e = ae1.f36694b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a0 f41408f;

    public o(a0 a0Var) {
        this.f41408f = a0Var;
        this.f41404b = a0Var.f36593f.entrySet().iterator();
    }

    public abstract Object a(Object obj, Object obj2);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f41404b.hasNext() || this.f41407e.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f41407e.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f41404b.next();
            this.f41405c = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f41406d = collection;
            this.f41407e = collection.iterator();
        }
        return a(this.f41405c, this.f41407e.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f41407e.remove();
        Collection collection = this.f41406d;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f41404b.remove();
        }
        a0 a0Var = this.f41408f;
        a0Var.f36594g--;
    }
}
