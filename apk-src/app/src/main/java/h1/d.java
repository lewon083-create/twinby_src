package h1;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Collection {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f20325b;

    public d(e eVar) {
        this.f20325b = eVar;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f20325b.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f20325b.a(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f20325b.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new a(this.f20325b, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        e eVar = this.f20325b;
        int iA = eVar.a(obj);
        if (iA < 0) {
            return false;
        }
        eVar.g(iA);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        e eVar = this.f20325b;
        int i = eVar.f20340d;
        int i10 = 0;
        boolean z5 = false;
        while (i10 < i) {
            if (collection.contains(eVar.i(i10))) {
                eVar.g(i10);
                i10--;
                i--;
                z5 = true;
            }
            i10++;
        }
        return z5;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        e eVar = this.f20325b;
        int i = eVar.f20340d;
        int i10 = 0;
        boolean z5 = false;
        while (i10 < i) {
            if (!collection.contains(eVar.i(i10))) {
                eVar.g(i10);
                i10--;
                i--;
                z5 = true;
            }
            i10++;
        }
        return z5;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f20325b.f20340d;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        e eVar = this.f20325b;
        int i = eVar.f20340d;
        Object[] objArr = new Object[i];
        for (int i10 = 0; i10 < i; i10++) {
            objArr[i10] = eVar.i(i10);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        e eVar = this.f20325b;
        int i = eVar.f20340d;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i10 = 0; i10 < i; i10++) {
            objArr[i10] = eVar.i(i10);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
