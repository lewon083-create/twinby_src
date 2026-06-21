package yads;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class lx extends AbstractCollection {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Collection f40710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qg2 f40711c;

    public lx(Collection collection, qg2 qg2Var) {
        this.f40710b = collection;
        this.f40711c = qg2Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        if (this.f40711c.apply(obj)) {
            return this.f40710b.add(obj);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f40711c.apply(it.next())) {
                throw new IllegalArgumentException();
            }
        }
        return this.f40710b.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        Collection collection = this.f40710b;
        qg2 qg2Var = this.f40711c;
        if (!(collection instanceof RandomAccess) || !(collection instanceof List)) {
            Iterator it = collection.iterator();
            qg2Var.getClass();
            while (it.hasNext()) {
                if (qg2Var.apply(it.next())) {
                    it.remove();
                }
            }
            return;
        }
        List list = (List) collection;
        qg2Var.getClass();
        int i = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            Object obj = list.get(i10);
            if (!qg2Var.apply(obj)) {
                if (i10 > i) {
                    try {
                        list.set(i, obj);
                    } catch (IllegalArgumentException unused) {
                        for (int size = list.size() - 1; size > i10; size--) {
                            if (qg2Var.apply(list.get(size))) {
                                list.remove(size);
                            }
                        }
                        for (int i11 = i10 - 1; i11 >= i; i11--) {
                            list.remove(i11);
                        }
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        for (int size2 = list.size() - 1; size2 > i10; size2--) {
                            if (qg2Var.apply(list.get(size2))) {
                                list.remove(size2);
                            }
                        }
                        for (int i12 = i10 - 1; i12 >= i; i12--) {
                            list.remove(i12);
                        }
                        return;
                    }
                }
                i++;
            }
        }
        list.subList(i, list.size()).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        Collection collection = this.f40710b;
        collection.getClass();
        try {
            if (collection.contains(obj)) {
                return this.f40711c.apply(obj);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        Collection collection = this.f40710b;
        qg2 qg2Var = this.f40711c;
        Iterator it = collection.iterator();
        if (qg2Var == null) {
            throw new NullPointerException("predicate");
        }
        boolean z5 = false;
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (!qg2Var.apply(it.next())) {
                i++;
            } else if (i != -1) {
                z5 = true;
            }
        }
        return !z5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        Iterator it = this.f40710b.iterator();
        qg2 qg2Var = this.f40711c;
        it.getClass();
        qg2Var.getClass();
        return new yd1(it, qg2Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        return contains(obj) && this.f40710b.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f40710b.iterator();
        boolean z5 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f40711c.apply(next) && collection.contains(next)) {
                it.remove();
                z5 = true;
            }
        }
        return z5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f40710b.iterator();
        boolean z5 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f40711c.apply(next) && !collection.contains(next)) {
                it.remove();
                z5 = true;
            }
        }
        return z5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        Iterator it = this.f40710b.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.f40711c.apply(it.next())) {
                i++;
            }
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        yd1 yd1Var = (yd1) iterator();
        ArrayList arrayList = new ArrayList();
        while (yd1Var.hasNext()) {
            arrayList.add(yd1Var.next());
        }
        return arrayList.toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        yd1 yd1Var = (yd1) iterator();
        ArrayList arrayList = new ArrayList();
        while (yd1Var.hasNext()) {
            arrayList.add(yd1Var.next());
        }
        return arrayList.toArray(objArr);
    }
}
