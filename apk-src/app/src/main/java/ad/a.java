package ad;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f761c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Collection f762d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Iterator f763e = q0.f857b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x0 f764f;

    public a(x0 x0Var) {
        this.f764f = x0Var;
        this.f760b = x0Var.f892e.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f760b.hasNext() || this.f763e.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f763e.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f760b.next();
            this.f761c = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f762d = collection;
            this.f763e = collection.iterator();
        }
        return this.f763e.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f763e.remove();
        Collection collection = this.f762d;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f760b.remove();
        }
        x0 x0Var = this.f764f;
        x0Var.f893f--;
    }
}
