package jj;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class i implements Map, Serializable, xj.c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public static final f f26655o = new f(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final i f26656p;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f26657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f26658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f26659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f26660e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f26661f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f26662g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f26663h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f26664j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public k f26665k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public l f26666l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public j f26667m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f26668n;

    static {
        i iVar = new i(0);
        iVar.f26668n = true;
        f26656p = iVar;
    }

    public i() {
        this(8);
    }

    public final int a(Object obj) {
        c();
        while (true) {
            int iJ = j(obj);
            int i = this.f26661f * 2;
            int length = this.f26660e.length / 2;
            if (i > length) {
                i = length;
            }
            int i10 = 0;
            while (true) {
                int[] iArr = this.f26660e;
                int i11 = iArr[iJ];
                if (i11 <= 0) {
                    int i12 = this.f26662g;
                    Object[] objArr = this.f26657b;
                    if (i12 < objArr.length) {
                        int i13 = i12 + 1;
                        this.f26662g = i13;
                        objArr[i12] = obj;
                        this.f26659d[i12] = iJ;
                        iArr[iJ] = i13;
                        this.f26664j++;
                        this.i++;
                        if (i10 > this.f26661f) {
                            this.f26661f = i10;
                        }
                        return i12;
                    }
                    g(1);
                } else {
                    if (Intrinsics.a(this.f26657b[i11 - 1], obj)) {
                        return -i11;
                    }
                    i10++;
                    if (i10 > i) {
                        k(this.f26660e.length * 2);
                        break;
                    }
                    iJ = iJ == 0 ? this.f26660e.length - 1 : iJ - 1;
                }
            }
        }
    }

    public final i b() {
        c();
        this.f26668n = true;
        if (this.f26664j > 0) {
            return this;
        }
        i iVar = f26656p;
        Intrinsics.c(iVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return iVar;
    }

    public final void c() {
        if (this.f26668n) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        c();
        int i = this.f26662g - 1;
        if (i >= 0) {
            int i10 = 0;
            while (true) {
                int[] iArr = this.f26659d;
                int i11 = iArr[i10];
                if (i11 >= 0) {
                    this.f26660e[i11] = 0;
                    iArr[i10] = -1;
                }
                if (i10 == i) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        a0.e.p(this.f26657b, 0, this.f26662g);
        Object[] objArr = this.f26658c;
        if (objArr != null) {
            a0.e.p(objArr, 0, this.f26662g);
        }
        this.f26664j = 0;
        this.f26662g = 0;
        this.i++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return h(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return i(obj) >= 0;
    }

    public final void d(boolean z5) {
        int i;
        Object[] objArr = this.f26658c;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            i = this.f26662g;
            if (i10 >= i) {
                break;
            }
            int[] iArr = this.f26659d;
            int i12 = iArr[i10];
            if (i12 >= 0) {
                Object[] objArr2 = this.f26657b;
                objArr2[i11] = objArr2[i10];
                if (objArr != null) {
                    objArr[i11] = objArr[i10];
                }
                if (z5) {
                    iArr[i11] = i12;
                    this.f26660e[i12] = i11 + 1;
                }
                i11++;
            }
            i10++;
        }
        a0.e.p(this.f26657b, i11, i);
        if (objArr != null) {
            a0.e.p(objArr, i11, this.f26662g);
        }
        this.f26662g = i11;
    }

    public final boolean e(Collection m8) {
        Intrinsics.checkNotNullParameter(m8, "m");
        for (Object obj : m8) {
            if (obj != null) {
                try {
                    if (!f((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        j jVar = this.f26667m;
        if (jVar != null) {
            return jVar;
        }
        j jVar2 = new j(this);
        this.f26667m = jVar2;
        return jVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.f26664j == map.size() && e(map.entrySet());
    }

    public final boolean f(Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        int iH = h(entry.getKey());
        if (iH < 0) {
            return false;
        }
        Object[] objArr = this.f26658c;
        Intrinsics.b(objArr);
        return Intrinsics.a(objArr[iH], entry.getValue());
    }

    public final void g(int i) {
        Object[] objArrCopyOf;
        Object[] objArr = this.f26657b;
        int length = objArr.length;
        int i10 = this.f26662g;
        int i11 = length - i10;
        int i12 = i10 - this.f26664j;
        if (i11 < i && i11 + i12 >= i && i12 >= objArr.length / 4) {
            d(true);
            return;
        }
        int i13 = i10 + i;
        if (i13 < 0) {
            throw new OutOfMemoryError();
        }
        if (i13 > objArr.length) {
            kotlin.collections.c cVar = kotlin.collections.f.Companion;
            int length2 = objArr.length;
            cVar.getClass();
            int iE = kotlin.collections.c.e(length2, i13);
            Object[] objArr2 = this.f26657b;
            Intrinsics.checkNotNullParameter(objArr2, "<this>");
            Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, iE);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(...)");
            this.f26657b = objArrCopyOf2;
            Object[] objArr3 = this.f26658c;
            if (objArr3 != null) {
                Intrinsics.checkNotNullParameter(objArr3, "<this>");
                objArrCopyOf = Arrays.copyOf(objArr3, iE);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            } else {
                objArrCopyOf = null;
            }
            this.f26658c = objArrCopyOf;
            int[] iArrCopyOf = Arrays.copyOf(this.f26659d, iE);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.f26659d = iArrCopyOf;
            f26655o.getClass();
            int iHighestOneBit = Integer.highestOneBit((iE >= 1 ? iE : 1) * 3);
            if (iHighestOneBit > this.f26660e.length) {
                k(iHighestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iH = h(obj);
        if (iH < 0) {
            return null;
        }
        Object[] objArr = this.f26658c;
        Intrinsics.b(objArr);
        return objArr[iH];
    }

    public final int h(Object obj) {
        int iJ = j(obj);
        int i = this.f26661f;
        while (true) {
            int i10 = this.f26660e[iJ];
            if (i10 == 0) {
                return -1;
            }
            if (i10 > 0) {
                int i11 = i10 - 1;
                if (Intrinsics.a(this.f26657b[i11], obj)) {
                    return i11;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iJ = iJ == 0 ? this.f26660e.length - 1 : iJ - 1;
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        Intrinsics.checkNotNullParameter(this, "map");
        g gVar = new g(this, 0);
        int i = 0;
        while (gVar.hasNext()) {
            int i10 = gVar.f19836b;
            i iVar = (i) gVar.f19839e;
            if (i10 >= iVar.f26662g) {
                throw new NoSuchElementException();
            }
            gVar.f19836b = i10 + 1;
            gVar.f19837c = i10;
            Object obj = iVar.f26657b[i10];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = iVar.f26658c;
            Intrinsics.b(objArr);
            Object obj2 = objArr[gVar.f19837c];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            gVar.e();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    public final int i(Object obj) {
        int i = this.f26662g;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.f26659d[i] >= 0) {
                Object[] objArr = this.f26658c;
                Intrinsics.b(objArr);
                if (Intrinsics.a(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f26664j == 0;
    }

    public final int j(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f26663h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        r3[r0] = r6;
        r5.f26659d[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(int r6) {
        /*
            r5 = this;
            int r0 = r5.i
            int r0 = r0 + 1
            r5.i = r0
            int r0 = r5.f26662g
            int r1 = r5.f26664j
            r2 = 0
            if (r0 <= r1) goto L10
            r5.d(r2)
        L10:
            int[] r0 = new int[r6]
            r5.f26660e = r0
            jj.f r0 = jj.i.f26655o
            r0.getClass()
            int r6 = java.lang.Integer.numberOfLeadingZeros(r6)
            int r6 = r6 + 1
            r5.f26663h = r6
        L21:
            int r6 = r5.f26662g
            if (r2 >= r6) goto L55
            int r6 = r2 + 1
            java.lang.Object[] r0 = r5.f26657b
            r0 = r0[r2]
            int r0 = r5.j(r0)
            int r1 = r5.f26661f
        L31:
            int[] r3 = r5.f26660e
            r4 = r3[r0]
            if (r4 != 0) goto L3f
            r3[r0] = r6
            int[] r1 = r5.f26659d
            r1[r2] = r0
            r2 = r6
            goto L21
        L3f:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L4d
            int r4 = r0 + (-1)
            if (r0 != 0) goto L4b
            int r0 = r3.length
            int r0 = r0 + (-1)
            goto L31
        L4b:
            r0 = r4
            goto L31
        L4d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            r6.<init>(r0)
            throw r6
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jj.i.k(int):void");
    }

    @Override // java.util.Map
    public final Set keySet() {
        k kVar = this.f26665k;
        if (kVar != null) {
            return kVar;
        }
        k kVar2 = new k(this);
        this.f26665k = kVar2;
        return kVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x006b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[LOOP:0: B:9:0x0027->B:33:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(int r12) {
        /*
            r11 = this;
            java.lang.Object[] r0 = r11.f26657b
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r2 = 0
            r0[r12] = r2
            java.lang.Object[] r0 = r11.f26658c
            if (r0 == 0) goto L13
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0[r12] = r2
        L13:
            int[] r0 = r11.f26659d
            r0 = r0[r12]
            int r1 = r11.f26661f
            int r1 = r1 * 2
            int[] r2 = r11.f26660e
            int r2 = r2.length
            int r2 = r2 / 2
            if (r1 <= r2) goto L23
            r1 = r2
        L23:
            r2 = 0
            r3 = r1
            r4 = r2
            r1 = r0
        L27:
            int r5 = r0 + (-1)
            if (r0 != 0) goto L31
            int[] r0 = r11.f26660e
            int r0 = r0.length
            int r0 = r0 + (-1)
            goto L32
        L31:
            r0 = r5
        L32:
            int r4 = r4 + 1
            int r5 = r11.f26661f
            r6 = -1
            if (r4 <= r5) goto L3e
            int[] r0 = r11.f26660e
            r0[r1] = r2
            goto L6f
        L3e:
            int[] r5 = r11.f26660e
            r7 = r5[r0]
            if (r7 != 0) goto L47
            r5[r1] = r2
            goto L6f
        L47:
            if (r7 >= 0) goto L4e
            r5[r1] = r6
        L4b:
            r1 = r0
            r4 = r2
            goto L68
        L4e:
            java.lang.Object[] r5 = r11.f26657b
            int r8 = r7 + (-1)
            r5 = r5[r8]
            int r5 = r11.j(r5)
            int r5 = r5 - r0
            int[] r9 = r11.f26660e
            int r10 = r9.length
            int r10 = r10 + (-1)
            r5 = r5 & r10
            if (r5 < r4) goto L68
            r9[r1] = r7
            int[] r4 = r11.f26659d
            r4[r8] = r1
            goto L4b
        L68:
            int r3 = r3 + r6
            if (r3 >= 0) goto L27
            int[] r0 = r11.f26660e
            r0[r1] = r6
        L6f:
            int[] r0 = r11.f26659d
            r0[r12] = r6
            int r12 = r11.f26664j
            int r12 = r12 + r6
            r11.f26664j = r12
            int r12 = r11.i
            int r12 = r12 + 1
            r11.i = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jj.i.l(int):void");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        c();
        int iA = a(obj);
        Object[] objArr = this.f26658c;
        if (objArr == null) {
            int length = this.f26657b.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.f26658c = objArr;
        }
        if (iA >= 0) {
            objArr[iA] = obj2;
            return null;
        }
        int i = (-iA) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map from) {
        Intrinsics.checkNotNullParameter(from, "from");
        c();
        Set<Map.Entry> setEntrySet = from.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        g(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iA = a(entry.getKey());
            Object[] objArr = this.f26658c;
            if (objArr == null) {
                int length = this.f26657b.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.f26658c = objArr;
            }
            if (iA >= 0) {
                objArr[iA] = entry.getValue();
            } else {
                int i = (-iA) - 1;
                if (!Intrinsics.a(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        c();
        int iH = h(obj);
        if (iH < 0) {
            return null;
        }
        Object[] objArr = this.f26658c;
        Intrinsics.b(objArr);
        Object obj2 = objArr[iH];
        l(iH);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f26664j;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder((this.f26664j * 3) + 2);
        sb2.append("{");
        Intrinsics.checkNotNullParameter(this, "map");
        int i = 0;
        g gVar = new g(this, 0);
        while (gVar.hasNext()) {
            if (i > 0) {
                sb2.append(", ");
            }
            Intrinsics.checkNotNullParameter(sb2, "sb");
            int i10 = gVar.f19836b;
            i iVar = (i) gVar.f19839e;
            if (i10 >= iVar.f26662g) {
                throw new NoSuchElementException();
            }
            gVar.f19836b = i10 + 1;
            gVar.f19837c = i10;
            Object obj = iVar.f26657b[i10];
            if (obj == iVar) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj);
            }
            sb2.append('=');
            Object[] objArr = iVar.f26658c;
            Intrinsics.b(objArr);
            Object obj2 = objArr[gVar.f19837c];
            if (obj2 == iVar) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj2);
            }
            gVar.e();
            i++;
        }
        sb2.append("}");
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Override // java.util.Map
    public final Collection values() {
        l lVar = this.f26666l;
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(this);
        this.f26666l = lVar2;
        return lVar2;
    }

    public i(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        f26655o.getClass();
        int iHighestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.f26657b = objArr;
        this.f26658c = null;
        this.f26659d = iArr;
        this.f26660e = new int[iHighestOneBit];
        this.f26661f = 2;
        this.f26662g = 0;
        this.f26663h = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }
}
