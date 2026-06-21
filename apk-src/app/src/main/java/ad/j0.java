package ad;

import com.google.android.gms.internal.measurement.h5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j0 extends f0 implements List, RandomAccess {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h0 f818c = new h0(b1.f768f, 0);

    public static b1 p(int i, Object[] objArr) {
        return i == 0 ? b1.f768f : new b1(i, objArr);
    }

    public static g0 q() {
        return new g0(4);
    }

    public static j0 r(Collection collection) {
        if (!(collection instanceof f0)) {
            Object[] array = collection.toArray();
            q.b(array.length, array);
            return p(array.length, array);
        }
        j0 j0VarA = ((f0) collection).a();
        if (!j0VarA.n()) {
            return j0VarA;
        }
        Object[] array2 = j0VarA.toArray(f0.f791b);
        return p(array2.length, array2);
    }

    public static b1 t(Object[] objArr) {
        if (objArr.length == 0) {
            return b1.f768f;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        q.b(objArr2.length, objArr2);
        return p(objArr2.length, objArr2);
    }

    public static b1 v(Long l10, Long l11, Long l12, Long l13, Long l14) {
        Object[] objArr = {l10, l11, l12, l13, l14};
        q.b(5, objArr);
        return p(5, objArr);
    }

    public static b1 w(Object obj) {
        Object[] objArr = {obj};
        q.b(1, objArr);
        return p(1, objArr);
    }

    public static b1 x(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        q.b(2, objArr);
        return p(2, objArr);
    }

    public static b1 y(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Object... objArr) {
        h5.g("the total number of elements must fit in an int", objArr.length <= 2147483635);
        int length = objArr.length + 12;
        Object[] objArr2 = new Object[length];
        objArr2[0] = str;
        objArr2[1] = str2;
        objArr2[2] = str3;
        objArr2[3] = str4;
        objArr2[4] = str5;
        objArr2[5] = str6;
        objArr2[6] = str7;
        objArr2[7] = str8;
        objArr2[8] = str9;
        objArr2[9] = str10;
        objArr2[10] = str11;
        objArr2[11] = str12;
        System.arraycopy(objArr, 0, objArr2, 12, objArr.length);
        q.b(length, objArr2);
        return p(length, objArr2);
    }

    public static b1 z(Comparator comparator, List list) {
        List list2;
        comparator.getClass();
        if (list instanceof Collection) {
            list2 = list;
        } else {
            Iterator it = list.iterator();
            ArrayList arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            list2 = arrayList;
        }
        Object[] array = list2.toArray();
        q.b(array.length, array);
        Arrays.sort(array, comparator);
        return p(array.length, array);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public j0 subList(int i, int i10) {
        h5.p(i, i10, size());
        int i11 = i10 - i;
        return i11 == size() ? this : i11 == 0 ? b1.f768f : new i0(this, i, i11);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // ad.f0
    public int c(int i, Object[] objArr) {
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i + i10] = get(i10);
        }
        return i + size;
    }

    @Override // ad.f0, java.util.AbstractCollection, java.util.Collection, java.util.Set
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
                            if (it2.hasNext() && Objects.equals(it.next(), it2.next())) {
                            }
                        }
                        return !it2.hasNext();
                    }
                    for (int i = 0; i < size; i++) {
                        if (Objects.equals(get(i), list.get(i))) {
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

    @Override // ad.f0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
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

    @Override // ad.f0
    /* JADX INFO: renamed from: o */
    public final q1 iterator() {
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

    @Override // java.util.List
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final h0 listIterator(int i) {
        h5.o(i, size());
        return isEmpty() ? f818c : new h0(this, i);
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // ad.f0
    public final j0 a() {
        return this;
    }
}
