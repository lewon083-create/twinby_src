package kotlin.collections;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class l extends h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final k f27486e = new k(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object[] f27487f = new Object[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f27489c = f27487f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f27490d;

    @Override // kotlin.collections.h
    public final int a() {
        return this.f27490d;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        q();
        f(elements.size() + a());
        e(p(a() + this.f27488b), elements);
        return true;
    }

    public final void addFirst(Object obj) {
        q();
        f(this.f27490d + 1);
        int length = this.f27488b;
        if (length == 0) {
            Object[] objArr = this.f27489c;
            Intrinsics.checkNotNullParameter(objArr, "<this>");
            length = objArr.length;
        }
        int i = length - 1;
        this.f27488b = i;
        this.f27489c[i] = obj;
        this.f27490d++;
    }

    public final void addLast(Object obj) {
        q();
        f(a() + 1);
        this.f27489c[p(a() + this.f27488b)] = obj;
        this.f27490d = a() + 1;
    }

    @Override // kotlin.collections.h
    public final Object c(int i) {
        c cVar = f.Companion;
        int i10 = this.f27490d;
        cVar.getClass();
        c.b(i, i10);
        if (i == s.e(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        q();
        int iP = p(this.f27488b + i);
        Object[] objArr = this.f27489c;
        Object obj = objArr[iP];
        if (i < (this.f27490d >> 1)) {
            int i11 = this.f27488b;
            if (iP >= i11) {
                o.f(objArr, i11 + 1, objArr, i11, iP);
            } else {
                o.f(objArr, 1, objArr, 0, iP);
                Object[] objArr2 = this.f27489c;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i12 = this.f27488b;
                o.f(objArr2, i12 + 1, objArr2, i12, objArr2.length - 1);
            }
            Object[] objArr3 = this.f27489c;
            int i13 = this.f27488b;
            objArr3[i13] = null;
            this.f27488b = g(i13);
        } else {
            int iP2 = p(s.e(this) + this.f27488b);
            if (iP <= iP2) {
                Object[] objArr4 = this.f27489c;
                o.f(objArr4, iP, objArr4, iP + 1, iP2 + 1);
            } else {
                Object[] objArr5 = this.f27489c;
                o.f(objArr5, iP, objArr5, iP + 1, objArr5.length);
                Object[] objArr6 = this.f27489c;
                objArr6[objArr6.length - 1] = objArr6[0];
                o.f(objArr6, 0, objArr6, 1, iP2 + 1);
            }
            this.f27489c[iP2] = null;
        }
        this.f27490d--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            q();
            o(this.f27488b, p(a() + this.f27488b));
        }
        this.f27488b = 0;
        this.f27490d = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f27489c.length;
        while (i < length && it.hasNext()) {
            this.f27489c[i] = it.next();
            i++;
        }
        int i10 = this.f27488b;
        for (int i11 = 0; i11 < i10 && it.hasNext(); i11++) {
            this.f27489c[i11] = it.next();
        }
        this.f27490d = collection.size() + this.f27490d;
    }

    public final void f(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f27489c;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == f27487f) {
            if (i < 10) {
                i = 10;
            }
            this.f27489c = new Object[i];
            return;
        }
        c cVar = f.Companion;
        int length = objArr.length;
        cVar.getClass();
        Object[] objArr2 = new Object[c.e(length, i)];
        Object[] objArr3 = this.f27489c;
        o.f(objArr3, 0, objArr2, this.f27488b, objArr3.length);
        Object[] objArr4 = this.f27489c;
        int length2 = objArr4.length;
        int i10 = this.f27488b;
        o.f(objArr4, length2 - i10, objArr2, 0, i10);
        this.f27488b = 0;
        this.f27489c = objArr2;
    }

    public final int g(int i) {
        Intrinsics.checkNotNullParameter(this.f27489c, "<this>");
        if (i == r0.length - 1) {
            return 0;
        }
        return i + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        c cVar = f.Companion;
        int i10 = this.f27490d;
        cVar.getClass();
        c.b(i, i10);
        return this.f27489c[p(this.f27488b + i)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iP = p(a() + this.f27488b);
        int length = this.f27488b;
        if (length < iP) {
            while (length < iP) {
                if (Intrinsics.a(obj, this.f27489c[length])) {
                    i = this.f27488b;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iP) {
            return -1;
        }
        int length2 = this.f27489c.length;
        while (true) {
            if (length >= length2) {
                for (int i10 = 0; i10 < iP; i10++) {
                    if (Intrinsics.a(obj, this.f27489c[i10])) {
                        length = i10 + this.f27489c.length;
                        i = this.f27488b;
                    }
                }
                return -1;
            }
            if (Intrinsics.a(obj, this.f27489c[length])) {
                i = this.f27488b;
                break;
            }
            length++;
        }
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return a() == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int iP = p(this.f27490d + this.f27488b);
        int i10 = this.f27488b;
        if (i10 < iP) {
            length = iP - 1;
            if (i10 <= length) {
                while (!Intrinsics.a(obj, this.f27489c[length])) {
                    if (length != i10) {
                        length--;
                    }
                }
                i = this.f27488b;
                return length - i;
            }
            return -1;
        }
        if (i10 > iP) {
            int i11 = iP - 1;
            while (true) {
                if (-1 >= i11) {
                    Object[] objArr = this.f27489c;
                    Intrinsics.checkNotNullParameter(objArr, "<this>");
                    length = objArr.length - 1;
                    int i12 = this.f27488b;
                    if (i12 <= length) {
                        while (!Intrinsics.a(obj, this.f27489c[length])) {
                            if (length != i12) {
                                length--;
                            }
                        }
                        i = this.f27488b;
                    }
                } else {
                    if (Intrinsics.a(obj, this.f27489c[i11])) {
                        length = i11 + this.f27489c.length;
                        i = this.f27488b;
                        break;
                    }
                    i11--;
                }
            }
        }
        return -1;
    }

    public final int n(int i) {
        return i < 0 ? i + this.f27489c.length : i;
    }

    public final void o(int i, int i10) {
        if (i < i10) {
            o.i(this.f27489c, i, i10);
            return;
        }
        Object[] objArr = this.f27489c;
        o.i(objArr, i, objArr.length);
        o.i(this.f27489c, 0, i10);
    }

    public final int p(int i) {
        Object[] objArr = this.f27489c;
        return i >= objArr.length ? i - objArr.length : i;
    }

    public final void q() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        c(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection elements) {
        int iP;
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z5 = false;
        z5 = false;
        z5 = false;
        if (!isEmpty() && this.f27489c.length != 0) {
            int iP2 = p(this.f27490d + this.f27488b);
            int i = this.f27488b;
            if (i < iP2) {
                iP = i;
                while (i < iP2) {
                    Object obj = this.f27489c[i];
                    if (elements.contains(obj)) {
                        z5 = true;
                    } else {
                        this.f27489c[iP] = obj;
                        iP++;
                    }
                    i++;
                }
                o.i(this.f27489c, iP, iP2);
            } else {
                int length = this.f27489c.length;
                boolean z10 = false;
                int i10 = i;
                while (i < length) {
                    Object[] objArr = this.f27489c;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (elements.contains(obj2)) {
                        z10 = true;
                    } else {
                        this.f27489c[i10] = obj2;
                        i10++;
                    }
                    i++;
                }
                iP = p(i10);
                for (int i11 = 0; i11 < iP2; i11++) {
                    Object[] objArr2 = this.f27489c;
                    Object obj3 = objArr2[i11];
                    objArr2[i11] = null;
                    if (elements.contains(obj3)) {
                        z10 = true;
                    } else {
                        this.f27489c[iP] = obj3;
                        iP = g(iP);
                    }
                }
                z5 = z10;
            }
            if (z5) {
                q();
                this.f27490d = n(iP - this.f27488b);
            }
        }
        return z5;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        q();
        Object[] objArr = this.f27489c;
        int i = this.f27488b;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f27488b = g(i);
        this.f27490d = a() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        q();
        int iP = p(s.e(this) + this.f27488b);
        Object[] objArr = this.f27489c;
        Object obj = objArr[iP];
        objArr[iP] = null;
        this.f27490d = a() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i10) {
        c cVar = f.Companion;
        int i11 = this.f27490d;
        cVar.getClass();
        c.d(i, i10, i11);
        int i12 = i10 - i;
        if (i12 == 0) {
            return;
        }
        if (i12 == this.f27490d) {
            clear();
            return;
        }
        if (i12 == 1) {
            c(i);
            return;
        }
        q();
        if (i < this.f27490d - i10) {
            int iP = p(this.f27488b + (i - 1));
            int iP2 = p(this.f27488b + (i10 - 1));
            while (i > 0) {
                int i13 = iP + 1;
                int iMin = Math.min(i, Math.min(i13, iP2 + 1));
                Object[] objArr = this.f27489c;
                int i14 = iP2 - iMin;
                int i15 = iP - iMin;
                o.f(objArr, i14 + 1, objArr, i15 + 1, i13);
                iP = n(i15);
                iP2 = n(i14);
                i -= iMin;
            }
            int iP3 = p(this.f27488b + i12);
            o(this.f27488b, iP3);
            this.f27488b = iP3;
        } else {
            int iP4 = p(this.f27488b + i10);
            int iP5 = p(this.f27488b + i);
            int i16 = this.f27490d;
            while (true) {
                i16 -= i10;
                if (i16 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f27489c;
                i10 = Math.min(i16, Math.min(objArr2.length - iP4, objArr2.length - iP5));
                Object[] objArr3 = this.f27489c;
                int i17 = iP4 + i10;
                o.f(objArr3, iP5, objArr3, iP4, i17);
                iP4 = p(i17);
                iP5 = p(iP5 + i10);
            }
            int iP6 = p(this.f27490d + this.f27488b);
            o(n(iP6 - i12), iP6);
        }
        this.f27490d -= i12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        int iP;
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z5 = false;
        z5 = false;
        z5 = false;
        if (!isEmpty() && this.f27489c.length != 0) {
            int iP2 = p(this.f27490d + this.f27488b);
            int i = this.f27488b;
            if (i < iP2) {
                iP = i;
                while (i < iP2) {
                    Object obj = this.f27489c[i];
                    if (elements.contains(obj)) {
                        this.f27489c[iP] = obj;
                        iP++;
                    } else {
                        z5 = true;
                    }
                    i++;
                }
                o.i(this.f27489c, iP, iP2);
            } else {
                int length = this.f27489c.length;
                boolean z10 = false;
                int i10 = i;
                while (i < length) {
                    Object[] objArr = this.f27489c;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (elements.contains(obj2)) {
                        this.f27489c[i10] = obj2;
                        i10++;
                    } else {
                        z10 = true;
                    }
                    i++;
                }
                iP = p(i10);
                for (int i11 = 0; i11 < iP2; i11++) {
                    Object[] objArr2 = this.f27489c;
                    Object obj3 = objArr2[i11];
                    objArr2[i11] = null;
                    if (elements.contains(obj3)) {
                        this.f27489c[iP] = obj3;
                        iP = g(iP);
                    } else {
                        z10 = true;
                    }
                }
                z5 = z10;
            }
            if (z5) {
                q();
                this.f27490d = n(iP - this.f27488b);
            }
        }
        return z5;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        c cVar = f.Companion;
        int i10 = this.f27490d;
        cVar.getClass();
        c.b(i, i10);
        int iP = p(this.f27488b + i);
        Object[] objArr = this.f27489c;
        Object obj2 = objArr[iP];
        objArr[iP] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int length;
        c cVar = f.Companion;
        int i10 = this.f27490d;
        cVar.getClass();
        c.c(i, i10);
        if (i == this.f27490d) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        q();
        f(this.f27490d + 1);
        int iP = p(this.f27488b + i);
        int i11 = this.f27490d;
        if (i < ((i11 + 1) >> 1)) {
            if (iP == 0) {
                Object[] objArr = this.f27489c;
                Intrinsics.checkNotNullParameter(objArr, "<this>");
                iP = objArr.length;
            }
            int i12 = iP - 1;
            int i13 = this.f27488b;
            if (i13 == 0) {
                Object[] objArr2 = this.f27489c;
                Intrinsics.checkNotNullParameter(objArr2, "<this>");
                length = objArr2.length - 1;
            } else {
                length = i13 - 1;
            }
            int i14 = this.f27488b;
            if (i12 >= i14) {
                Object[] objArr3 = this.f27489c;
                objArr3[length] = objArr3[i14];
                o.f(objArr3, i14, objArr3, i14 + 1, i12 + 1);
            } else {
                Object[] objArr4 = this.f27489c;
                o.f(objArr4, i14 - 1, objArr4, i14, objArr4.length);
                Object[] objArr5 = this.f27489c;
                objArr5[objArr5.length - 1] = objArr5[0];
                o.f(objArr5, 0, objArr5, 1, i12 + 1);
            }
            this.f27489c[i12] = obj;
            this.f27488b = length;
        } else {
            int iP2 = p(i11 + this.f27488b);
            if (iP < iP2) {
                Object[] objArr6 = this.f27489c;
                o.f(objArr6, iP + 1, objArr6, iP, iP2);
            } else {
                Object[] objArr7 = this.f27489c;
                o.f(objArr7, 1, objArr7, 0, iP2);
                Object[] objArr8 = this.f27489c;
                objArr8[0] = objArr8[objArr8.length - 1];
                o.f(objArr8, iP + 1, objArr8, iP, objArr8.length - 1);
            }
            this.f27489c[iP] = obj;
        }
        this.f27490d++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        int length = array.length;
        int i = this.f27490d;
        if (length < i) {
            Intrinsics.checkNotNullParameter(array, "reference");
            Object objNewInstance = Array.newInstance(array.getClass().getComponentType(), i);
            Intrinsics.c(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            array = (Object[]) objNewInstance;
        }
        int iP = p(this.f27490d + this.f27488b);
        int i10 = this.f27488b;
        if (i10 < iP) {
            o.g(this.f27489c, i10, array, iP, 2);
        } else if (!isEmpty()) {
            Object[] objArr = this.f27489c;
            o.f(objArr, 0, array, this.f27488b, objArr.length);
            Object[] objArr2 = this.f27489c;
            o.f(objArr2, objArr2.length - this.f27488b, array, 0, iP);
        }
        int i11 = this.f27490d;
        Intrinsics.checkNotNullParameter(array, "array");
        if (i11 < array.length) {
            array[i11] = null;
        }
        return array;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        c cVar = f.Companion;
        int i10 = this.f27490d;
        cVar.getClass();
        c.c(i, i10);
        if (elements.isEmpty()) {
            return false;
        }
        if (i == this.f27490d) {
            return addAll(elements);
        }
        q();
        f(elements.size() + this.f27490d);
        int iP = p(this.f27490d + this.f27488b);
        int iP2 = p(this.f27488b + i);
        int size = elements.size();
        if (i < ((this.f27490d + 1) >> 1)) {
            int i11 = this.f27488b;
            int length = i11 - size;
            if (iP2 < i11) {
                Object[] objArr = this.f27489c;
                o.f(objArr, length, objArr, i11, objArr.length);
                if (size >= iP2) {
                    Object[] objArr2 = this.f27489c;
                    o.f(objArr2, objArr2.length - size, objArr2, 0, iP2);
                } else {
                    Object[] objArr3 = this.f27489c;
                    o.f(objArr3, objArr3.length - size, objArr3, 0, size);
                    Object[] objArr4 = this.f27489c;
                    o.f(objArr4, 0, objArr4, size, iP2);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.f27489c;
                o.f(objArr5, length, objArr5, i11, iP2);
            } else {
                Object[] objArr6 = this.f27489c;
                length += objArr6.length;
                int i12 = iP2 - i11;
                int length2 = objArr6.length - length;
                if (length2 >= i12) {
                    o.f(objArr6, length, objArr6, i11, iP2);
                } else {
                    o.f(objArr6, length, objArr6, i11, i11 + length2);
                    Object[] objArr7 = this.f27489c;
                    o.f(objArr7, 0, objArr7, this.f27488b + length2, iP2);
                }
            }
            this.f27488b = length;
            e(n(iP2 - size), elements);
            return true;
        }
        int i13 = iP2 + size;
        if (iP2 < iP) {
            int i14 = size + iP;
            Object[] objArr8 = this.f27489c;
            if (i14 <= objArr8.length) {
                o.f(objArr8, i13, objArr8, iP2, iP);
            } else if (i13 >= objArr8.length) {
                o.f(objArr8, i13 - objArr8.length, objArr8, iP2, iP);
            } else {
                int length3 = iP - (i14 - objArr8.length);
                o.f(objArr8, 0, objArr8, length3, iP);
                Object[] objArr9 = this.f27489c;
                o.f(objArr9, i13, objArr9, iP2, length3);
            }
        } else {
            Object[] objArr10 = this.f27489c;
            o.f(objArr10, size, objArr10, 0, iP);
            Object[] objArr11 = this.f27489c;
            if (i13 >= objArr11.length) {
                o.f(objArr11, i13 - objArr11.length, objArr11, iP2, objArr11.length);
            } else {
                o.f(objArr11, 0, objArr11, objArr11.length - size, objArr11.length);
                Object[] objArr12 = this.f27489c;
                o.f(objArr12, i13, objArr12, iP2, objArr12.length - size);
            }
        }
        e(iP2, elements);
        return true;
    }
}
