package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x41 extends t41 implements List, RandomAccess {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v41 f12018c = new v41(r51.f9713f, 0);

    public static r51 q(Object obj) {
        Object[] objArr = {obj};
        vv.j(1, objArr);
        return x(1, objArr);
    }

    public static r51 r(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        vv.j(2, objArr);
        return x(2, objArr);
    }

    public static r51 t(Long l10, Long l11, Long l12, Long l13, Long l14) {
        Object[] objArr = {l10, l11, l12, l13, l14};
        vv.j(5, objArr);
        return x(5, objArr);
    }

    public static r51 u(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        int length = objArr.length;
        int i = length + 12;
        Object[] objArr2 = new Object[i];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        objArr2[6] = obj7;
        objArr2[7] = obj8;
        objArr2[8] = obj9;
        objArr2[9] = obj10;
        objArr2[10] = obj11;
        objArr2[11] = obj12;
        System.arraycopy(objArr, 0, objArr2, 12, length);
        vv.j(i, objArr2);
        return x(i, objArr2);
    }

    public static x41 v(Collection collection) {
        if (!(collection instanceof t41)) {
            Object[] array = collection.toArray();
            int length = array.length;
            vv.j(length, array);
            return x(length, array);
        }
        x41 x41VarG = ((t41) collection).g();
        if (!x41VarG.n()) {
            return x41VarG;
        }
        Object[] array2 = x41VarG.toArray(t41.f10486b);
        return x(array2.length, array2);
    }

    public static r51 w(Object[] objArr) {
        if (objArr.length == 0) {
            return r51.f9713f;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        vv.j(length, objArr2);
        return x(length, objArr2);
    }

    public static r51 x(int i, Object[] objArr) {
        return i == 0 ? r51.f9713f : new r51(i, objArr);
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final d61 a() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.t41, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (Objects.equals(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                v41 v41VarListIterator = listIterator(0);
                Iterator it = list.iterator();
                while (true) {
                    if (v41VarListIterator.hasNext()) {
                        if (!it.hasNext() || !Objects.equals(v41VarListIterator.next(), it.next())) {
                            break;
                        }
                    } else if (!it.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i = 0; i < size; i++) {
            iHashCode = (iHashCode * 31) + get(i).hashCode();
        }
        return iHashCode;
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

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
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

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.t41
    public int o(Object[] objArr, int i) {
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i + i10] = get(i10);
        }
        return i + size;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public x41 subList(int i, int i10) {
        ix.p0(i, i10, size());
        int i11 = i10 - i;
        return i11 == size() ? this : i11 == 0 ? r51.f9713f : new w41(this, i, i11);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final v41 listIterator(int i) {
        ix.o0(i, size());
        return isEmpty() ? f12018c : new v41(this, i);
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final x41 g() {
        return this;
    }
}
