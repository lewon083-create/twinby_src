package yads;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class cy extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f37547k = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient Object f37548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient int[] f37549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient Object[] f37550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient Object[] f37551e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public transient int f37552f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public transient int f37553g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public transient yx f37554h;
    public transient wx i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public transient ay f37555j;

    public cy(int i) {
        a(i);
    }

    public final Map a() {
        Object obj = this.f37548b;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final int b() {
        return isEmpty() ? -1 : 0;
    }

    public final boolean c() {
        return this.f37548b == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (c()) {
            return;
        }
        this.f37552f += 32;
        Map mapA = a();
        if (mapA != null) {
            this.f37552f = Math.min(Math.max(size(), 3), 1073741823);
            mapA.clear();
            this.f37548b = null;
            this.f37553g = 0;
            return;
        }
        Object[] objArr = this.f37550d;
        Objects.requireNonNull(objArr);
        Arrays.fill(objArr, 0, this.f37553g, (Object) null);
        Object[] objArr2 = this.f37551e;
        Objects.requireNonNull(objArr2);
        Arrays.fill(objArr2, 0, this.f37553g, (Object) null);
        Object obj = this.f37548b;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        int[] iArr = this.f37549c;
        Objects.requireNonNull(iArr);
        Arrays.fill(iArr, 0, this.f37553g, 0);
        this.f37553g = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapA = a();
        return mapA != null ? mapA.containsKey(obj) : a(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapA = a();
        if (mapA != null) {
            return mapA.containsValue(obj);
        }
        for (int i = 0; i < this.f37553g; i++) {
            if (n92.a(obj, c(i))) {
                return true;
            }
        }
        return false;
    }

    public final int[] d() {
        int[] iArr = this.f37549c;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] e() {
        Object[] objArr = this.f37550d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        wx wxVar = this.i;
        if (wxVar != null) {
            return wxVar;
        }
        wx wxVar2 = new wx(this);
        this.i = wxVar2;
        return wxVar2;
    }

    public final Object f() {
        Object obj = this.f37548b;
        Objects.requireNonNull(obj);
        return obj;
    }

    public final Object[] g() {
        Object[] objArr = this.f37551e;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapA = a();
        if (mapA != null) {
            return mapA.get(obj);
        }
        int iA = a(obj);
        if (iA == -1) {
            return null;
        }
        return c(iA);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        yx yxVar = this.f37554h;
        if (yxVar != null) {
            return yxVar;
        }
        yx yxVar2 = new yx(this);
        this.f37554h = yxVar2;
        return yxVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i;
        int i10 = 32;
        if (c()) {
            if (!c()) {
                throw new IllegalStateException("Arrays already allocated");
            }
            int i11 = this.f37552f;
            int iMax = Math.max(i11 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > ((int) (((double) iHighestOneBit) * 1.0d)) && (iHighestOneBit = iHighestOneBit << 1) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            if (iMax2 < 2 || iMax2 > 1073741824 || Integer.highestOneBit(iMax2) != iMax2) {
                throw new IllegalArgumentException(og2.a("must be power of 2 between 2^1 and 2^30: ", iMax2));
            }
            this.f37548b = iMax2 <= 256 ? new byte[iMax2] : iMax2 <= 65536 ? new short[iMax2] : new int[iMax2];
            this.f37552f = ((32 - Integer.numberOfLeadingZeros(iMax2 - 1)) & 31) | (this.f37552f & (-32));
            this.f37549c = new int[i11];
            this.f37550d = new Object[i11];
            this.f37551e = new Object[i11];
        }
        Map mapA = a();
        if (mapA != null) {
            return mapA.put(obj, obj2);
        }
        int[] iArr = this.f37549c;
        Objects.requireNonNull(iArr);
        int[] iArr2 = iArr;
        Object[] objArr = this.f37550d;
        Objects.requireNonNull(objArr);
        Object[] objArr2 = objArr;
        Object[] objArr3 = this.f37551e;
        Objects.requireNonNull(objArr3);
        Object[] objArr4 = objArr3;
        int i12 = this.f37553g;
        int i13 = i12 + 1;
        int iA = q01.a(obj == null ? 0 : obj.hashCode());
        int i14 = 1 << (this.f37552f & 31);
        int iA2 = i14 - 1;
        int i15 = iA & iA2;
        Object obj3 = this.f37548b;
        Objects.requireNonNull(obj3);
        int iA3 = dy.a(i15, obj3);
        if (iA3 == 0) {
            if (i13 > iA2) {
                iA2 = a(iA2, i14 * (iA2 < 32 ? 4 : 2), iA, i12);
            } else {
                Object obj4 = this.f37548b;
                Objects.requireNonNull(obj4);
                dy.a(i15, i13, obj4);
            }
            i = 1;
        } else {
            int i16 = ~iA2;
            i = 1;
            int i17 = iA & i16;
            int i18 = 0;
            while (true) {
                int i19 = iA3 - 1;
                int i20 = iArr2[i19];
                int i21 = i10;
                int i22 = i20 & i16;
                if (i22 == i17 && n92.a(obj, objArr2[i19])) {
                    Object obj5 = objArr4[i19];
                    objArr4[i19] = obj2;
                    return obj5;
                }
                int i23 = i20 & iA2;
                int[] iArr3 = iArr2;
                int i24 = i18 + 1;
                if (i23 != 0) {
                    i18 = i24;
                    iA3 = i23;
                    iArr2 = iArr3;
                    i10 = i21;
                } else {
                    if (i24 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(1 << (this.f37552f & 31), 1.0f);
                        int iB = b();
                        while (iB >= 0) {
                            linkedHashMap.put(b(iB), c(iB));
                            iB++;
                            if (iB >= this.f37553g) {
                                iB = -1;
                            }
                        }
                        this.f37548b = linkedHashMap;
                        this.f37549c = null;
                        this.f37550d = null;
                        this.f37551e = null;
                        this.f37552f += 32;
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i13 > iA2) {
                        iA2 = a(iA2, i14 * (iA2 < i21 ? 4 : 2), iA, i12);
                    } else {
                        iArr3[i19] = (i13 & iA2) | i22;
                    }
                }
            }
        }
        int[] iArr4 = this.f37549c;
        Objects.requireNonNull(iArr4);
        int length = iArr4.length;
        if (i13 > length) {
            int i25 = i;
            int iMin = Math.min(1073741823, (Math.max(i25, length >>> 1) + length) | i25);
            if (iMin != length) {
                int[] iArr5 = this.f37549c;
                Objects.requireNonNull(iArr5);
                this.f37549c = Arrays.copyOf(iArr5, iMin);
                Object[] objArr5 = this.f37550d;
                Objects.requireNonNull(objArr5);
                this.f37550d = Arrays.copyOf(objArr5, iMin);
                Object[] objArr6 = this.f37551e;
                Objects.requireNonNull(objArr6);
                this.f37551e = Arrays.copyOf(objArr6, iMin);
            }
        }
        int i26 = (~iA2) & iA;
        int[] iArr6 = this.f37549c;
        Objects.requireNonNull(iArr6);
        iArr6[i12] = i26;
        Object[] objArr7 = this.f37550d;
        Objects.requireNonNull(objArr7);
        objArr7[i12] = obj;
        a(i12, obj2);
        this.f37553g = i13;
        this.f37552f += 32;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapA = a();
        if (mapA != null) {
            return mapA.remove(obj);
        }
        Object objB = b(obj);
        if (objB == f37547k) {
            return null;
        }
        return objB;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapA = a();
        return mapA != null ? mapA.size() : this.f37553g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        ay ayVar = this.f37555j;
        if (ayVar != null) {
            return ayVar;
        }
        ay ayVar2 = new ay(this);
        this.f37555j = ayVar2;
        return ayVar2;
    }

    public final Object b(int i) {
        Object[] objArr = this.f37550d;
        Objects.requireNonNull(objArr);
        return objArr[i];
    }

    public final Object c(int i) {
        Object[] objArr = this.f37551e;
        Objects.requireNonNull(objArr);
        return objArr[i];
    }

    public final int a(Object obj) {
        if (c()) {
            return -1;
        }
        int iA = q01.a(obj == null ? 0 : obj.hashCode());
        int i = (1 << (this.f37552f & 31)) - 1;
        Object obj2 = this.f37548b;
        Objects.requireNonNull(obj2);
        int iA2 = dy.a(iA & i, obj2);
        if (iA2 == 0) {
            return -1;
        }
        int i10 = ~i;
        int i11 = iA & i10;
        do {
            int i12 = iA2 - 1;
            int[] iArr = this.f37549c;
            Objects.requireNonNull(iArr);
            int i13 = iArr[i12];
            if ((i13 & i10) == i11 && n92.a(obj, b(i12))) {
                return i12;
            }
            iA2 = i13 & i;
        } while (iA2 != 0);
        return -1;
    }

    public final Object b(Object obj) {
        if (c()) {
            return f37547k;
        }
        int i = (1 << (this.f37552f & 31)) - 1;
        Object obj2 = this.f37548b;
        Objects.requireNonNull(obj2);
        int[] iArr = this.f37549c;
        Objects.requireNonNull(iArr);
        int[] iArr2 = iArr;
        Object[] objArr = this.f37550d;
        Objects.requireNonNull(objArr);
        int iA = dy.a(obj, null, i, obj2, iArr2, objArr, null);
        if (iA == -1) {
            return f37547k;
        }
        Object objC = c(iA);
        a(iA, i);
        this.f37553g--;
        this.f37552f += 32;
        return objC;
    }

    public final void a(int i) {
        if (i >= 0) {
            this.f37552f = Math.min(Math.max(i, 1), 1073741823);
            return;
        }
        throw new IllegalArgumentException("Expected size must be >= 0");
    }

    public final void a(int i, int i10) {
        Object obj = this.f37548b;
        Objects.requireNonNull(obj);
        int[] iArr = this.f37549c;
        Objects.requireNonNull(iArr);
        int[] iArr2 = iArr;
        Object[] objArr = this.f37550d;
        Objects.requireNonNull(objArr);
        Object[] objArr2 = objArr;
        Object[] objArr3 = this.f37551e;
        Objects.requireNonNull(objArr3);
        Object[] objArr4 = objArr3;
        int size = size();
        int i11 = size - 1;
        if (i < i11) {
            Object obj2 = objArr2[i11];
            objArr2[i] = obj2;
            objArr4[i] = objArr4[i11];
            objArr2[i11] = null;
            objArr4[i11] = null;
            iArr2[i] = iArr2[i11];
            iArr2[i11] = 0;
            int iA = q01.a(obj2 != null ? obj2.hashCode() : 0) & i10;
            int iA2 = dy.a(iA, obj);
            if (iA2 == size) {
                dy.a(iA, i + 1, obj);
                return;
            }
            while (true) {
                int i12 = iA2 - 1;
                int i13 = iArr2[i12];
                int i14 = i13 & i10;
                if (i14 == size) {
                    iArr2[i12] = ((i + 1) & i10) | (i13 & (~i10));
                    return;
                }
                iA2 = i14;
            }
        } else {
            objArr2[i] = null;
            objArr4[i] = null;
            iArr2[i] = 0;
        }
    }

    public final int a(int i, int i10, int i11, int i12) {
        Object obj;
        if (i10 >= 2 && i10 <= 1073741824 && Integer.highestOneBit(i10) == i10) {
            if (i10 <= 256) {
                obj = new byte[i10];
            } else if (i10 <= 65536) {
                obj = new short[i10];
            } else {
                obj = new int[i10];
            }
            int i13 = i10 - 1;
            if (i12 != 0) {
                dy.a(i11 & i13, i12 + 1, obj);
            }
            Object obj2 = this.f37548b;
            Objects.requireNonNull(obj2);
            int[] iArr = this.f37549c;
            Objects.requireNonNull(iArr);
            int[] iArr2 = iArr;
            for (int i14 = 0; i14 <= i; i14++) {
                int iA = dy.a(i14, obj2);
                while (iA != 0) {
                    int i15 = iA - 1;
                    int i16 = iArr2[i15];
                    int i17 = ((~i) & i16) | i14;
                    int i18 = i17 & i13;
                    int iA2 = dy.a(i18, obj);
                    dy.a(i18, iA, obj);
                    iArr2[i15] = ((~i13) & i17) | (iA2 & i13);
                    iA = i16 & i;
                }
            }
            this.f37548b = obj;
            this.f37552f = ((32 - Integer.numberOfLeadingZeros(i13)) & 31) | (this.f37552f & (-32));
            return i13;
        }
        throw new IllegalArgumentException(og2.a("must be power of 2 between 2^1 and 2^30: ", i10));
    }

    public final void a(int i, Object obj) {
        Object[] objArr = this.f37551e;
        Objects.requireNonNull(objArr);
        objArr[i] = obj;
    }
}
