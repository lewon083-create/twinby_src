package com.google.android.gms.internal.play_billing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c0 extends x implements List, RandomAccess {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z f14146c = new z(r0.f14290f, 0);

    public static r0 q(int i, Object[] objArr) {
        return i == 0 ? r0.f14290f : new r0(i, objArr);
    }

    public static c0 r(ArrayList arrayList) {
        Object[] array = arrayList.toArray();
        int length = array.length;
        for (int i = 0; i < length; i++) {
            if (array[i] == null) {
                throw new NullPointerException(l7.o.i(i, "at index "));
            }
        }
        return q(length, array);
    }

    @Override // com.google.android.gms.internal.play_billing.x
    public int a(Object[] objArr) {
        int size = size();
        for (int i = 0; i < size; i++) {
            objArr[i] = get(i);
        }
        return size;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        Object next;
        Object next2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        Object obj2 = get(i);
                        Object obj3 = list.get(i);
                        if (obj2 == obj3 || (obj2 != null && obj2.equals(obj3))) {
                        }
                    }
                    return true;
                }
                z zVarListIterator = listIterator(0);
                Iterator it = list.iterator();
                while (true) {
                    if (zVarListIterator.hasNext()) {
                        if (!it.hasNext() || ((next = zVarListIterator.next()) != (next2 = it.next()) && (next == null || !next.equals(next2)))) {
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

    public int indexOf(Object obj) {
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

    public int lastIndexOf(Object obj) {
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

    public c0 o() {
        return size() <= 1 ? this : new a0(this);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: p */
    public c0 subList(int i, int i10) {
        d3.y(i, i10, size());
        int i11 = i10 - i;
        return i11 == size() ? this : i11 == 0 ? r0.f14290f : new b0(this, i, i11);
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
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final z listIterator(int i) {
        d3.r(i, size());
        return isEmpty() ? f14146c : new z(this, i);
    }

    @Override // com.google.android.gms.internal.play_billing.x
    public final c0 f() {
        return this;
    }
}
