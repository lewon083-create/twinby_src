package h1;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import l7.o;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f20338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f20339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f20340d;

    public i(int i) {
        this.f20338b = i == 0 ? i1.a.f20813a : new int[i];
        this.f20339c = i == 0 ? i1.a.f20814b : new Object[i << 1];
    }

    public final int a(Object obj) {
        int i = this.f20340d * 2;
        Object[] objArr = this.f20339c;
        if (obj == null) {
            for (int i10 = 1; i10 < i; i10 += 2) {
                if (objArr[i10] == null) {
                    return i10 >> 1;
                }
            }
            return -1;
        }
        for (int i11 = 1; i11 < i; i11 += 2) {
            if (obj.equals(objArr[i11])) {
                return i11 >> 1;
            }
        }
        return -1;
    }

    public final void b(int i) {
        int i10 = this.f20340d;
        int[] iArr = this.f20338b;
        if (iArr.length < i) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.f20338b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f20339c, i * 2);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.f20339c = objArrCopyOf;
        }
        if (this.f20340d != i10) {
            throw new ConcurrentModificationException();
        }
    }

    public final int c(int i, Object obj) {
        int i10 = this.f20340d;
        if (i10 == 0) {
            return -1;
        }
        int iA = i1.a.a(i10, i, this.f20338b);
        if (iA < 0 || Intrinsics.a(obj, this.f20339c[iA << 1])) {
            return iA;
        }
        int i11 = iA + 1;
        while (i11 < i10 && this.f20338b[i11] == i) {
            if (Intrinsics.a(obj, this.f20339c[i11 << 1])) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iA - 1; i12 >= 0 && this.f20338b[i12] == i; i12--) {
            if (Intrinsics.a(obj, this.f20339c[i12 << 1])) {
                return i12;
            }
        }
        return ~i11;
    }

    public final void clear() {
        if (this.f20340d > 0) {
            this.f20338b = i1.a.f20813a;
            this.f20339c = i1.a.f20814b;
            this.f20340d = 0;
        }
        if (this.f20340d > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return d(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public final int d(Object obj) {
        return obj == null ? e() : c(obj.hashCode(), obj);
    }

    public final int e() {
        int i = this.f20340d;
        if (i == 0) {
            return -1;
        }
        int iA = i1.a.a(i, 0, this.f20338b);
        if (iA < 0 || this.f20339c[iA << 1] == null) {
            return iA;
        }
        int i10 = iA + 1;
        while (i10 < i && this.f20338b[i10] == 0) {
            if (this.f20339c[i10 << 1] == null) {
                return i10;
            }
            i10++;
        }
        for (int i11 = iA - 1; i11 >= 0 && this.f20338b[i11] == 0; i11--) {
            if (this.f20339c[i11 << 1] == null) {
                return i11;
            }
        }
        return ~i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof i) {
                int i = this.f20340d;
                if (i != ((i) obj).f20340d) {
                    return false;
                }
                i iVar = (i) obj;
                for (int i10 = 0; i10 < i; i10++) {
                    Object objF = f(i10);
                    Object objI = i(i10);
                    Object obj2 = iVar.get(objF);
                    if (objI == null) {
                        if (obj2 != null || !iVar.containsKey(objF)) {
                            return false;
                        }
                    } else if (!objI.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f20340d != ((Map) obj).size()) {
                return false;
            }
            int i11 = this.f20340d;
            for (int i12 = 0; i12 < i11; i12++) {
                Object objF2 = f(i12);
                Object objI2 = i(i12);
                Object obj3 = ((Map) obj).get(objF2);
                if (objI2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objF2)) {
                        return false;
                    }
                } else if (!objI2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i) {
        if (i < 0 || i >= this.f20340d) {
            throw new IllegalArgumentException(o.i(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        return this.f20339c[i << 1];
    }

    public final Object g(int i) {
        int i10;
        if (i < 0 || i >= (i10 = this.f20340d)) {
            throw new IllegalArgumentException(o.i(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        Object[] objArr = this.f20339c;
        int i11 = i << 1;
        Object obj = objArr[i11 + 1];
        if (i10 <= 1) {
            clear();
            return obj;
        }
        int i12 = i10 - 1;
        int[] iArr = this.f20338b;
        if (iArr.length <= 8 || i10 >= iArr.length / 3) {
            if (i < i12) {
                int i13 = i + 1;
                kotlin.collections.o.e(i, i13, i10, iArr, iArr);
                Object[] objArr2 = this.f20339c;
                kotlin.collections.o.f(objArr2, i11, objArr2, i13 << 1, i10 << 1);
            }
            Object[] objArr3 = this.f20339c;
            int i14 = i12 << 1;
            objArr3[i14] = null;
            objArr3[i14 + 1] = null;
        } else {
            int i15 = i10 > 8 ? i10 + (i10 >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i15);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.f20338b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f20339c, i15 << 1);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.f20339c = objArrCopyOf;
            if (i10 != this.f20340d) {
                throw new ConcurrentModificationException();
            }
            if (i > 0) {
                kotlin.collections.o.e(0, 0, i, iArr, this.f20338b);
                kotlin.collections.o.f(objArr, 0, this.f20339c, 0, i11);
            }
            if (i < i12) {
                int i16 = i + 1;
                kotlin.collections.o.e(i, i16, i10, iArr, this.f20338b);
                kotlin.collections.o.f(objArr, i11, this.f20339c, i16 << 1, i10 << 1);
            }
        }
        if (i10 != this.f20340d) {
            throw new ConcurrentModificationException();
        }
        this.f20340d = i12;
        return obj;
    }

    public Object get(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return this.f20339c[(iD << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iD = d(obj);
        return iD >= 0 ? this.f20339c[(iD << 1) + 1] : obj2;
    }

    public final Object h(int i, Object obj) {
        if (i < 0 || i >= this.f20340d) {
            throw new IllegalArgumentException(o.i(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        int i10 = (i << 1) + 1;
        Object[] objArr = this.f20339c;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    public final int hashCode() {
        int[] iArr = this.f20338b;
        Object[] objArr = this.f20339c;
        int i = this.f20340d;
        int i10 = 1;
        int i11 = 0;
        int iHashCode = 0;
        while (i11 < i) {
            Object obj = objArr[i10];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i11];
            i11++;
            i10 += 2;
        }
        return iHashCode;
    }

    public final Object i(int i) {
        if (i < 0 || i >= this.f20340d) {
            throw new IllegalArgumentException(o.i(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        return this.f20339c[(i << 1) + 1];
    }

    public final boolean isEmpty() {
        return this.f20340d <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i = this.f20340d;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iC = obj != null ? c(iHashCode, obj) : e();
        if (iC >= 0) {
            int i10 = (iC << 1) + 1;
            Object[] objArr = this.f20339c;
            Object obj3 = objArr[i10];
            objArr[i10] = obj2;
            return obj3;
        }
        int i11 = ~iC;
        int[] iArr = this.f20338b;
        if (i >= iArr.length) {
            int i12 = 8;
            if (i >= 8) {
                i12 = (i >> 1) + i;
            } else if (i < 4) {
                i12 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i12);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.f20338b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f20339c, i12 << 1);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.f20339c = objArrCopyOf;
            if (i != this.f20340d) {
                throw new ConcurrentModificationException();
            }
        }
        if (i11 < i) {
            int[] iArr2 = this.f20338b;
            int i13 = i11 + 1;
            kotlin.collections.o.e(i13, i11, i, iArr2, iArr2);
            Object[] objArr2 = this.f20339c;
            kotlin.collections.o.f(objArr2, i13 << 1, objArr2, i11 << 1, this.f20340d << 1);
        }
        int i14 = this.f20340d;
        if (i == i14) {
            int[] iArr3 = this.f20338b;
            if (i11 < iArr3.length) {
                iArr3[i11] = iHashCode;
                Object[] objArr3 = this.f20339c;
                int i15 = i11 << 1;
                objArr3[i15] = obj;
                objArr3[i15 + 1] = obj2;
                this.f20340d = i14 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return g(iD);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD >= 0) {
            return h(iD, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f20340d;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f20340d * 28);
        sb2.append('{');
        int i = this.f20340d;
        for (int i10 = 0; i10 < i; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            Object objF = f(i10);
            if (objF != sb2) {
                sb2.append(objF);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            Object objI = i(i10);
            if (objI != sb2) {
                sb2.append(objI);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD < 0 || !Intrinsics.a(obj2, i(iD))) {
            return false;
        }
        g(iD);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iD = d(obj);
        if (iD < 0 || !Intrinsics.a(obj2, i(iD))) {
            return false;
        }
        h(iD, obj3);
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(i map) {
        this(0);
        Intrinsics.checkNotNullParameter(map, "map");
        int i = map.f20340d;
        b(this.f20340d + i);
        if (this.f20340d != 0) {
            for (int i10 = 0; i10 < i; i10++) {
                put(map.f(i10), map.i(i10));
            }
        } else if (i > 0) {
            kotlin.collections.o.e(0, 0, i, map.f20338b, this.f20338b);
            kotlin.collections.o.f(map.f20339c, 0, this.f20339c, 0, i << 1);
            this.f20340d = i;
        }
    }
}
