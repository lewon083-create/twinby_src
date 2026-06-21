package yads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class x extends AbstractCollection {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f44549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Collection f44550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x f44551d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Collection f44552e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a0 f44553f;

    public x(a0 a0Var, Object obj, Collection collection, x xVar) {
        this.f44553f = a0Var;
        this.f44549b = obj;
        this.f44550c = collection;
        this.f44551d = xVar;
        this.f44552e = xVar == null ? null : xVar.b();
    }

    public final void a() {
        x xVar = this.f44551d;
        if (xVar != null) {
            xVar.a();
        } else {
            this.f44553f.f36593f.put(this.f44549b, this.f44550c);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        c();
        boolean zIsEmpty = this.f44550c.isEmpty();
        boolean zAdd = this.f44550c.add(obj);
        if (zAdd) {
            this.f44553f.f36594g++;
            if (zIsEmpty) {
                a();
            }
        }
        return zAdd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        c();
        int size = this.f44550c.size();
        boolean zAddAll = this.f44550c.addAll(collection);
        if (zAddAll) {
            int size2 = this.f44550c.size();
            a0 a0Var = this.f44553f;
            a0Var.f36594g = (size2 - size) + a0Var.f36594g;
            if (size == 0) {
                a();
            }
        }
        return zAddAll;
    }

    public final Collection b() {
        return this.f44550c;
    }

    public final void c() {
        Collection collection;
        x xVar = this.f44551d;
        if (xVar != null) {
            xVar.c();
            if (this.f44551d.f44550c != this.f44552e) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.f44550c.isEmpty() || (collection = (Collection) this.f44553f.f36593f.get(this.f44549b)) == null) {
                return;
            }
            this.f44550c = collection;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        c();
        int size = this.f44550c.size();
        if (size == 0) {
            return;
        }
        this.f44550c.clear();
        this.f44553f.f36594g -= size;
        d();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        c();
        return this.f44550c.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        c();
        return this.f44550c.containsAll(collection);
    }

    public final void d() {
        x xVar = this.f44551d;
        if (xVar != null) {
            xVar.d();
        } else if (this.f44550c.isEmpty()) {
            this.f44553f.f36593f.remove(this.f44549b);
        }
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        c();
        return this.f44550c.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        c();
        return this.f44550c.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        c();
        return new w(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        c();
        boolean zRemove = this.f44550c.remove(obj);
        if (zRemove) {
            a0 a0Var = this.f44553f;
            a0Var.f36594g--;
            d();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        c();
        int size = this.f44550c.size();
        boolean zRemoveAll = this.f44550c.removeAll(collection);
        if (zRemoveAll) {
            int size2 = this.f44550c.size();
            a0 a0Var = this.f44553f;
            a0Var.f36594g = (size2 - size) + a0Var.f36594g;
            d();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        c();
        int size = this.f44550c.size();
        boolean zRetainAll = this.f44550c.retainAll(collection);
        if (zRetainAll) {
            int size2 = this.f44550c.size();
            a0 a0Var = this.f44553f;
            a0Var.f36594g = (size2 - size) + a0Var.f36594g;
            d();
        }
        return zRetainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        c();
        return this.f44550c.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        c();
        return this.f44550c.toString();
    }
}
