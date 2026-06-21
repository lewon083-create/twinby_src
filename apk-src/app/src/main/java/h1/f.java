package h1;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Collection, Set, xj.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f20329b = i1.a.f20813a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f20330c = i1.a.f20814b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f20331d;

    public f(int i) {
        if (i > 0) {
            h.a(this, i);
        }
    }

    public final Object a(int i) {
        int i10 = this.f20331d;
        Object[] objArr = this.f20330c;
        Object obj = objArr[i];
        if (i10 <= 1) {
            clear();
            return obj;
        }
        int i11 = i10 - 1;
        int[] iArr = this.f20329b;
        if (iArr.length <= 8 || i10 >= iArr.length / 3) {
            if (i < i11) {
                int i12 = i + 1;
                o.e(i, i12, i10, iArr, iArr);
                Object[] objArr2 = this.f20330c;
                o.f(objArr2, i, objArr2, i12, i10);
            }
            this.f20330c[i11] = null;
        } else {
            h.a(this, i10 > 8 ? i10 + (i10 >> 1) : 8);
            if (i > 0) {
                o.e(0, 0, i, iArr, this.f20329b);
                o.g(objArr, 0, this.f20330c, i, 6);
            }
            if (i < i11) {
                int i13 = i + 1;
                o.e(i, i13, i10, iArr, this.f20329b);
                o.f(objArr, i, this.f20330c, i13, i10);
            }
        }
        if (i10 != this.f20331d) {
            throw new ConcurrentModificationException();
        }
        this.f20331d = i11;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int iB;
        int i10 = this.f20331d;
        if (obj == null) {
            Intrinsics.checkNotNullParameter(this, "<this>");
            iB = h.b(this, null, 0);
            i = 0;
        } else {
            int iHashCode = obj.hashCode();
            i = iHashCode;
            iB = h.b(this, obj, iHashCode);
        }
        if (iB >= 0) {
            return false;
        }
        int i11 = ~iB;
        int[] iArr = this.f20329b;
        if (i10 >= iArr.length) {
            int i12 = 8;
            if (i10 >= 8) {
                i12 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i12 = 4;
            }
            Object[] objArr = this.f20330c;
            h.a(this, i12);
            if (i10 != this.f20331d) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f20329b;
            if (iArr2.length != 0) {
                o.e(0, 0, iArr.length, iArr, iArr2);
                o.g(objArr, 0, this.f20330c, objArr.length, 6);
            }
        }
        if (i11 < i10) {
            int[] iArr3 = this.f20329b;
            int i13 = i11 + 1;
            o.e(i13, i11, i10, iArr3, iArr3);
            Object[] objArr2 = this.f20330c;
            o.f(objArr2, i13, objArr2, i11, i10);
        }
        int i14 = this.f20331d;
        if (i10 == i14) {
            int[] iArr4 = this.f20329b;
            if (i11 < iArr4.length) {
                iArr4[i11] = i;
                this.f20330c[i11] = obj;
                this.f20331d = i14 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int size = elements.size() + this.f20331d;
        int i = this.f20331d;
        int[] iArr = this.f20329b;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f20330c;
            h.a(this, size);
            int i10 = this.f20331d;
            if (i10 > 0) {
                o.e(0, 0, i10, iArr, this.f20329b);
                o.g(objArr, 0, this.f20330c, this.f20331d, 6);
            }
        }
        if (this.f20331d != i) {
            throw new ConcurrentModificationException();
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f20331d != 0) {
            int[] iArr = i1.a.f20813a;
            Intrinsics.checkNotNullParameter(iArr, "<set-?>");
            this.f20329b = iArr;
            Object[] objArr = i1.a.f20814b;
            Intrinsics.checkNotNullParameter(objArr, "<set-?>");
            this.f20330c = objArr;
            this.f20331d = 0;
        }
        if (this.f20331d != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int iB;
        if (obj == null) {
            Intrinsics.checkNotNullParameter(this, "<this>");
            iB = h.b(this, null, 0);
        } else {
            iB = h.b(this, obj, obj.hashCode());
        }
        return iB >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.f20331d != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.f20331d;
            for (int i10 = 0; i10 < i; i10++) {
                if (!((Set) obj).contains(this.f20330c[i10])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f20329b;
        int i = this.f20331d;
        int i10 = 0;
        for (int i11 = 0; i11 < i; i11++) {
            i10 += iArr[i11];
        }
        return i10;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f20331d <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new a(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iB;
        if (obj == null) {
            Intrinsics.checkNotNullParameter(this, "<this>");
            iB = h.b(this, null, 0);
        } else {
            iB = h.b(this, obj, obj.hashCode());
        }
        if (iB < 0) {
            return false;
        }
        a(iB);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator it = elements.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z5 = false;
        for (int i = this.f20331d - 1; -1 < i; i--) {
            if (!CollectionsKt.x(elements, this.f20330c[i])) {
                a(i);
                z5 = true;
            }
        }
        return z5;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f20331d;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return o.h(this.f20330c, 0, this.f20331d);
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f20331d * 14);
        sb2.append('{');
        int i = this.f20331d;
        for (int i10 = 0; i10 < i; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            Object obj = this.f20330c[i10];
            if (obj != this) {
                sb2.append(obj);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] result) {
        Intrinsics.checkNotNullParameter(result, "array");
        int i = this.f20331d;
        if (result.length < i) {
            result = (Object[]) Array.newInstance(result.getClass().getComponentType(), i);
        } else if (result.length > i) {
            result[i] = null;
        }
        o.f(this.f20330c, 0, result, 0, this.f20331d);
        Intrinsics.checkNotNullExpressionValue(result, "result");
        return result;
    }
}
