package jj;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.collections.o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends kotlin.collections.h implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f26641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f26642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26643d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f26644e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f26645f;

    public c(Object[] backing, int i, int i10, c cVar, e root) {
        Intrinsics.checkNotNullParameter(backing, "backing");
        Intrinsics.checkNotNullParameter(root, "root");
        this.f26641b = backing;
        this.f26642c = i;
        this.f26643d = i10;
        this.f26644e = cVar;
        this.f26645f = root;
        ((AbstractList) this).modCount = ((AbstractList) root).modCount;
    }

    @Override // kotlin.collections.h
    public final int a() {
        n();
        return this.f26643d;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        o();
        n();
        g(this.f26642c + this.f26643d, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        o();
        n();
        int size = elements.size();
        f(this.f26642c + this.f26643d, elements, size);
        return size > 0;
    }

    @Override // kotlin.collections.h
    public final Object c(int i) {
        o();
        n();
        kotlin.collections.c cVar = kotlin.collections.f.Companion;
        int i10 = this.f26643d;
        cVar.getClass();
        kotlin.collections.c.b(i, i10);
        return p(this.f26642c + i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        o();
        n();
        q(this.f26642c, this.f26643d);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        n();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f26641b;
            int i = this.f26643d;
            if (i == list.size()) {
                for (int i10 = 0; i10 < i; i10++) {
                    if (Intrinsics.a(objArr[this.f26642c + i10], list.get(i10))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(int i, Collection collection, int i10) {
        ((AbstractList) this).modCount++;
        e eVar = this.f26645f;
        c cVar = this.f26644e;
        if (cVar != null) {
            cVar.f(i, collection, i10);
        } else {
            e eVar2 = e.f26647f;
            eVar.f(i, collection, i10);
        }
        this.f26641b = eVar.f26648b;
        this.f26643d += i10;
    }

    public final void g(int i, Object obj) {
        ((AbstractList) this).modCount++;
        e eVar = this.f26645f;
        c cVar = this.f26644e;
        if (cVar != null) {
            cVar.g(i, obj);
        } else {
            e eVar2 = e.f26647f;
            eVar.g(i, obj);
        }
        this.f26641b = eVar.f26648b;
        this.f26643d++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        n();
        kotlin.collections.c cVar = kotlin.collections.f.Companion;
        int i10 = this.f26643d;
        cVar.getClass();
        kotlin.collections.c.b(i, i10);
        return this.f26641b[this.f26642c + i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        n();
        Object[] objArr = this.f26641b;
        int i = this.f26643d;
        int iHashCode = 1;
        for (int i10 = 0; i10 < i; i10++) {
            Object obj = objArr[this.f26642c + i10];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        n();
        for (int i = 0; i < this.f26643d; i++) {
            if (Intrinsics.a(this.f26641b[this.f26642c + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        n();
        return this.f26643d == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        n();
        for (int i = this.f26643d - 1; i >= 0; i--) {
            if (Intrinsics.a(this.f26641b[this.f26642c + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public final void n() {
        if (((AbstractList) this.f26645f).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    public final void o() {
        if (this.f26645f.f26650d) {
            throw new UnsupportedOperationException();
        }
    }

    public final Object p(int i) {
        Object objP;
        ((AbstractList) this).modCount++;
        c cVar = this.f26644e;
        if (cVar != null) {
            objP = cVar.p(i);
        } else {
            e eVar = e.f26647f;
            objP = this.f26645f.p(i);
        }
        this.f26643d--;
        return objP;
    }

    public final void q(int i, int i10) {
        if (i10 > 0) {
            ((AbstractList) this).modCount++;
        }
        c cVar = this.f26644e;
        if (cVar != null) {
            cVar.q(i, i10);
        } else {
            e eVar = e.f26647f;
            this.f26645f.q(i, i10);
        }
        this.f26643d -= i10;
    }

    public final int r(int i, int i10, Collection collection, boolean z5) {
        int iR;
        c cVar = this.f26644e;
        if (cVar != null) {
            iR = cVar.r(i, i10, collection, z5);
        } else {
            e eVar = e.f26647f;
            iR = this.f26645f.r(i, i10, collection, z5);
        }
        if (iR > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f26643d -= iR;
        return iR;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        o();
        n();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            c(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        o();
        n();
        return r(this.f26642c, this.f26643d, elements, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        o();
        n();
        return r(this.f26642c, this.f26643d, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        o();
        n();
        kotlin.collections.c cVar = kotlin.collections.f.Companion;
        int i10 = this.f26643d;
        cVar.getClass();
        kotlin.collections.c.b(i, i10);
        Object[] objArr = this.f26641b;
        int i11 = this.f26642c + i;
        Object obj2 = objArr[i11];
        objArr[i11] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i10) {
        kotlin.collections.c cVar = kotlin.collections.f.Companion;
        int i11 = this.f26643d;
        cVar.getClass();
        kotlin.collections.c.d(i, i10, i11);
        return new c(this.f26641b, this.f26642c + i, i10 - i, this, this.f26645f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        n();
        int length = array.length;
        int i = this.f26643d;
        int i10 = this.f26642c;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f26641b, i10, i + i10, array.getClass());
            Intrinsics.checkNotNullExpressionValue(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        o.f(this.f26641b, 0, array, i10, i + i10);
        int i11 = this.f26643d;
        Intrinsics.checkNotNullParameter(array, "array");
        if (i11 < array.length) {
            array[i11] = null;
        }
        return array;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        n();
        return a0.e.b(this.f26641b, this.f26642c, this.f26643d, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        n();
        kotlin.collections.c cVar = kotlin.collections.f.Companion;
        int i10 = this.f26643d;
        cVar.getClass();
        kotlin.collections.c.c(i, i10);
        return new b(this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        o();
        n();
        kotlin.collections.c cVar = kotlin.collections.f.Companion;
        int i10 = this.f26643d;
        cVar.getClass();
        kotlin.collections.c.c(i, i10);
        g(this.f26642c + i, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        o();
        n();
        kotlin.collections.c cVar = kotlin.collections.f.Companion;
        int i10 = this.f26643d;
        cVar.getClass();
        kotlin.collections.c.c(i, i10);
        int size = elements.size();
        f(this.f26642c + i, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        n();
        Object[] objArr = this.f26641b;
        int i = this.f26643d;
        int i10 = this.f26642c;
        return o.h(objArr, i10, i + i10);
    }
}
