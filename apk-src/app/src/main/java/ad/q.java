package ad;

import com.google.android.gms.internal.measurement.h5;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q {
    public static int a(int i) {
        if (i < 3) {
            d(i, "expectedSize");
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) Math.ceil(((double) i) / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    public static void b(int i, Object[] objArr) {
        for (int i10 = 0; i10 < i; i10++) {
            if (objArr[i10] == null) {
                throw new NullPointerException(l7.o.i(i10, "at index "));
            }
        }
    }

    public static void c(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj + "=null");
    }

    public static void d(int i, String str) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    public static Object e(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            throw new IllegalArgumentException(l7.o.i(i, "must be power of 2 between 2^1 and 2^30: "));
        }
        return i <= 256 ? new byte[i] : i <= 65536 ? new short[i] : new int[i];
    }

    public static boolean f(Object obj, Map map) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static boolean g(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() == set2.size()) {
                return set.containsAll(set2);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static l1 h(Set set, zc.g gVar) {
        if (set instanceof SortedSet) {
            Set set2 = (SortedSet) set;
            if (!(set2 instanceof l1)) {
                return new m1(set2, gVar);
            }
            l1 l1Var = (l1) set2;
            zc.g gVar2 = l1Var.f835c;
            gVar2.getClass();
            return new m1((SortedSet) l1Var.f834b, new zc.h(Arrays.asList(gVar2, gVar)));
        }
        if (!(set instanceof l1)) {
            set.getClass();
            return new l1(set, gVar);
        }
        l1 l1Var2 = (l1) set;
        zc.g gVar3 = l1Var2.f835c;
        gVar3.getClass();
        return new l1(l1Var2.f834b, new zc.h(Arrays.asList(gVar3, gVar)));
    }

    public static Object i(AbstractCollection abstractCollection, String str) {
        Iterator it = abstractCollection.iterator();
        return it.hasNext() ? it.next() : str;
    }

    public static Object j(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            return list.get(list.size() - 1);
        }
        if (iterable instanceof SortedSet) {
            return ((SortedSet) iterable).last();
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static int k(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    public static k1 l(Set set, o0 o0Var) {
        h5.m(set, "set1");
        h5.m(o0Var, "set2");
        return new k1(set, o0Var);
    }

    public static int m(int i, int i10, int i11) {
        return (i & (~i11)) | (i10 & i11);
    }

    public static ArrayList n(Object... objArr) {
        int length = objArr.length;
        d(length, "arraySize");
        ArrayList arrayList = new ArrayList(k3.f.z(((long) length) + 5 + ((long) (length / 10))));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static int o(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i10;
        int i11;
        int iR = r(obj);
        int i12 = iR & i;
        int iS = s(i12, obj3);
        if (iS != 0) {
            int i13 = ~i;
            int i14 = iR & i13;
            int i15 = -1;
            while (true) {
                i10 = iS - 1;
                i11 = iArr[i10];
                if ((i11 & i13) == i14 && Objects.equals(obj, objArr[i10]) && (objArr2 == null || Objects.equals(obj2, objArr2[i10]))) {
                    break;
                }
                int i16 = i11 & i;
                if (i16 == 0) {
                    break;
                }
                i15 = i10;
                iS = i16;
            }
            int i17 = i11 & i;
            if (i15 == -1) {
                t(i12, i17, obj3);
                return i10;
            }
            iArr[i15] = m(iArr[i15], i17, i);
            return i10;
        }
        return -1;
    }

    public static void p(List list, zc.g gVar, int i, int i10) {
        for (int size = list.size() - 1; size > i10; size--) {
            if (gVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i11 = i10 - 1; i11 >= i; i11--) {
            list.remove(i11);
        }
    }

    public static int q(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * (-862048943)), 15)) * 461845907);
    }

    public static int r(Object obj) {
        return q(obj == null ? 0 : obj.hashCode());
    }

    public static int s(int i, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i] & 255 : obj instanceof short[] ? ((short[]) obj)[i] & 65535 : ((int[]) obj)[i];
    }

    public static void t(int i, int i10, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i10;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i10;
        } else {
            ((int[]) obj)[i] = i10;
        }
    }

    public static AbstractList u(List list, zc.e eVar) {
        return list instanceof RandomAccess ? new t0(list, eVar) : new u0(list, eVar);
    }
}
