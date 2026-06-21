package yads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class r51 extends l51 implements List, RandomAccess {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o51 f42498c = new o51(0, um2.f43723f);

    public static um2 b(int i, Object[] objArr) {
        return i == 0 ? um2.f43723f : new um2(i, objArr);
    }

    public static n51 f() {
        return new n51();
    }

    public static um2 g() {
        return um2.f43723f;
    }

    @Override // yads.l51
    public final r51 a() {
        return this;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // yads.l51, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (!(list instanceof RandomAccess)) {
                        Iterator it = iterator();
                        Iterator it2 = list.iterator();
                        while (it.hasNext()) {
                            if (it2.hasNext() && n92.a(it.next(), it2.next())) {
                            }
                        }
                        return !it2.hasNext();
                    }
                    for (int i = 0; i < size; i++) {
                        if (n92.a(get(i), list.get(i))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i10 = 0; i10 < size; i10++) {
            i = ~(~(get(i10).hashCode() + (i * 31)));
        }
        return i;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // yads.l51, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    public static um2 a(Object... objArr) {
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (objArr[i] == null) {
                throw new NullPointerException(og2.a("at index ", i));
            }
        }
        return b(objArr.length, objArr);
    }

    @Override // yads.l51, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final ma3 iterator() {
        return listIterator(0);
    }

    public static um2 b(Object[] objArr) {
        if (objArr.length == 0) {
            return um2.f43723f;
        }
        return a((Object[]) objArr.clone());
    }

    @Override // yads.l51
    public int a(int i, Object[] objArr) {
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i + i10] = get(i10);
        }
        return i + size;
    }

    public static r51 a(Collection collection) {
        if (collection instanceof l51) {
            r51 r51VarA = ((l51) collection).a();
            if (!r51VarA.e()) {
                return r51VarA;
            }
            Object[] array = r51VarA.toArray(l51.f40425b);
            return b(array.length, array);
        }
        return a(collection.toArray());
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final o51 listIterator(int i) {
        pg2.b(i, size());
        if (isEmpty()) {
            return f42498c;
        }
        return new o51(i, this);
    }

    public static um2 a(Object obj) {
        return a(obj);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public r51 subList(int i, int i10) {
        pg2.a(i, i10, size());
        int i11 = i10 - i;
        if (i11 == size()) {
            return this;
        }
        if (i11 == 0) {
            return um2.f43723f;
        }
        return new q51(this, i, i11);
    }
}
