package jj;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.collections.o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends kotlin.collections.h implements List, RandomAccess, Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final d f26646e = new d(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f26647f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f26648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f26650d;

    static {
        e eVar = new e(0);
        eVar.f26650d = true;
        f26647f = eVar;
    }

    public e() {
        this(0, 1, null);
    }

    @Override // kotlin.collections.h
    public final int a() {
        return this.f26649c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        n();
        int i = this.f26649c;
        ((AbstractList) this).modCount++;
        o(i, 1);
        this.f26648b[i] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        n();
        int size = elements.size();
        f(this.f26649c, elements, size);
        return size > 0;
    }

    @Override // kotlin.collections.h
    public final Object c(int i) {
        n();
        kotlin.collections.c cVar = kotlin.collections.f.Companion;
        int i10 = this.f26649c;
        cVar.getClass();
        kotlin.collections.c.b(i, i10);
        return p(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        n();
        q(0, this.f26649c);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f26648b;
            int i = this.f26649c;
            if (i == list.size()) {
                for (int i10 = 0; i10 < i; i10++) {
                    if (Intrinsics.a(objArr[i10], list.get(i10))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(int i, Collection collection, int i10) {
        ((AbstractList) this).modCount++;
        o(i, i10);
        Iterator it = collection.iterator();
        for (int i11 = 0; i11 < i10; i11++) {
            this.f26648b[i + i11] = it.next();
        }
    }

    public final void g(int i, Object obj) {
        ((AbstractList) this).modCount++;
        o(i, 1);
        this.f26648b[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        kotlin.collections.c cVar = kotlin.collections.f.Companion;
        int i10 = this.f26649c;
        cVar.getClass();
        kotlin.collections.c.b(i, i10);
        return this.f26648b[i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f26648b;
        int i = this.f26649c;
        int iHashCode = 1;
        for (int i10 = 0; i10 < i; i10++) {
            Object obj = objArr[i10];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.f26649c; i++) {
            if (Intrinsics.a(this.f26648b[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f26649c == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.f26649c - 1; i >= 0; i--) {
            if (Intrinsics.a(this.f26648b[i], obj)) {
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
        if (this.f26650d) {
            throw new UnsupportedOperationException();
        }
    }

    public final void o(int i, int i10) {
        int i11 = this.f26649c + i10;
        if (i11 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f26648b;
        if (i11 > objArr.length) {
            kotlin.collections.c cVar = kotlin.collections.f.Companion;
            int length = objArr.length;
            cVar.getClass();
            int iE = kotlin.collections.c.e(length, i11);
            Object[] objArr2 = this.f26648b;
            Intrinsics.checkNotNullParameter(objArr2, "<this>");
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, iE);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            this.f26648b = objArrCopyOf;
        }
        Object[] objArr3 = this.f26648b;
        o.f(objArr3, i + i10, objArr3, i, this.f26649c);
        this.f26649c += i10;
    }

    public final Object p(int i) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f26648b;
        Object obj = objArr[i];
        o.f(objArr, i, objArr, i + 1, this.f26649c);
        Object[] objArr2 = this.f26648b;
        int i10 = this.f26649c - 1;
        Intrinsics.checkNotNullParameter(objArr2, "<this>");
        objArr2[i10] = null;
        this.f26649c--;
        return obj;
    }

    public final void q(int i, int i10) {
        if (i10 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f26648b;
        o.f(objArr, i, objArr, i + i10, this.f26649c);
        Object[] objArr2 = this.f26648b;
        int i11 = this.f26649c;
        a0.e.p(objArr2, i11 - i10, i11);
        this.f26649c -= i10;
    }

    public final int r(int i, int i10, Collection collection, boolean z5) {
        int i11 = 0;
        int i12 = 0;
        while (i11 < i10) {
            int i13 = i + i11;
            if (collection.contains(this.f26648b[i13]) == z5) {
                Object[] objArr = this.f26648b;
                i11++;
                objArr[i12 + i] = objArr[i13];
                i12++;
            } else {
                i11++;
            }
        }
        int i14 = i10 - i12;
        Object[] objArr2 = this.f26648b;
        o.f(objArr2, i + i12, objArr2, i10 + i, this.f26649c);
        Object[] objArr3 = this.f26648b;
        int i15 = this.f26649c;
        a0.e.p(objArr3, i15 - i14, i15);
        if (i14 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f26649c -= i14;
        return i14;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
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
        n();
        return r(0, this.f26649c, elements, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        n();
        return r(0, this.f26649c, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        n();
        kotlin.collections.c cVar = kotlin.collections.f.Companion;
        int i10 = this.f26649c;
        cVar.getClass();
        kotlin.collections.c.b(i, i10);
        Object[] objArr = this.f26648b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i10) {
        kotlin.collections.c cVar = kotlin.collections.f.Companion;
        int i11 = this.f26649c;
        cVar.getClass();
        kotlin.collections.c.d(i, i10, i11);
        return new c(this.f26648b, i, i10 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        int length = array.length;
        int i = this.f26649c;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f26648b, 0, i, array.getClass());
            Intrinsics.checkNotNullExpressionValue(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        o.f(this.f26648b, 0, array, 0, i);
        int i10 = this.f26649c;
        Intrinsics.checkNotNullParameter(array, "array");
        if (i10 < array.length) {
            array[i10] = null;
        }
        return array;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return a0.e.b(this.f26648b, 0, this.f26649c, this);
    }

    public /* synthetic */ e(int i, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 10 : i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        kotlin.collections.c cVar = kotlin.collections.f.Companion;
        int i10 = this.f26649c;
        cVar.getClass();
        kotlin.collections.c.c(i, i10);
        return new b(this, i);
    }

    public e(int i) {
        if (i >= 0) {
            this.f26648b = new Object[i];
            return;
        }
        throw new IllegalArgumentException("capacity must be non-negative.");
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        n();
        kotlin.collections.c cVar = kotlin.collections.f.Companion;
        int i10 = this.f26649c;
        cVar.getClass();
        kotlin.collections.c.c(i, i10);
        int size = elements.size();
        f(i, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        n();
        kotlin.collections.c cVar = kotlin.collections.f.Companion;
        int i10 = this.f26649c;
        cVar.getClass();
        kotlin.collections.c.c(i, i10);
        ((AbstractList) this).modCount++;
        o(i, 1);
        this.f26648b[i] = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return o.h(this.f26648b, 0, this.f26649c);
    }
}
