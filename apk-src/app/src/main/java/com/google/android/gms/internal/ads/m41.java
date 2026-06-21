package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m41 extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f7765k = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient Object f7766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient int[] f7767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient Object[] f7768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient Object[] f7769e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public transient int f7770f = Math.min(Math.max(3, 1), 1073741823);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public transient int f7771g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public transient k41 f7772h;
    public transient k41 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public transient ad.m f7773j;

    public m41() {
    }

    public final int[] a() {
        int[] iArr = this.f7767c;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] b() {
        Object[] objArr = this.f7768d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object[] c() {
        Object[] objArr = this.f7769e;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (d()) {
            return;
        }
        this.f7770f += 32;
        Map mapE = e();
        if (mapE != null) {
            this.f7770f = Math.min(Math.max(size(), 3), 1073741823);
            mapE.clear();
            this.f7766b = null;
            this.f7771g = 0;
            return;
        }
        Arrays.fill(b(), 0, this.f7771g, (Object) null);
        Arrays.fill(c(), 0, this.f7771g, (Object) null);
        Object obj = this.f7766b;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(a(), 0, this.f7771g, 0);
        this.f7771g = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapE = e();
        return mapE != null ? mapE.containsKey(obj) : i(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapE = e();
        if (mapE != null) {
            return mapE.containsValue(obj);
        }
        for (int i = 0; i < this.f7771g; i++) {
            if (Objects.equals(obj, c()[i])) {
                return true;
            }
        }
        return false;
    }

    public final boolean d() {
        return this.f7766b == null;
    }

    public final Map e() {
        Object obj = this.f7766b;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        k41 k41Var = this.i;
        if (k41Var != null) {
            return k41Var;
        }
        k41 k41Var2 = new k41(this, 0);
        this.i = k41Var2;
        return k41Var2;
    }

    public final void f(int i, int i10) {
        Object obj = this.f7766b;
        Objects.requireNonNull(obj);
        int[] iArrA = a();
        Object[] objArrB = b();
        Object[] objArrC = c();
        int size = size();
        int i11 = size - 1;
        if (i >= i11) {
            objArrB[i] = null;
            objArrC[i] = null;
            iArrA[i] = 0;
            return;
        }
        int i12 = i + 1;
        Object obj2 = objArrB[i11];
        objArrB[i] = obj2;
        objArrC[i] = objArrC[i11];
        objArrB[i11] = null;
        objArrC[i11] = null;
        iArrA[i] = iArrA[i11];
        iArrA[i11] = 0;
        int iT = vv.t(obj2) & i10;
        int iT2 = ix.t(iT, obj);
        if (iT2 == size) {
            ix.L(iT, i12, obj);
            return;
        }
        while (true) {
            int i13 = iT2 - 1;
            int i14 = iArrA[i13];
            int i15 = i14 & i10;
            if (i15 == size) {
                iArrA[i13] = (i14 & (~i10)) | (i10 & i12);
                return;
            }
            iT2 = i15;
        }
    }

    public final int g() {
        return (1 << (this.f7770f & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapE = e();
        if (mapE != null) {
            return mapE.get(obj);
        }
        int i = i(obj);
        if (i == -1) {
            return null;
        }
        return c()[i];
    }

    public final int h(int i, int i10, int i11, int i12) {
        int i13 = i10 - 1;
        Object objC = ix.c(i10);
        if (i12 != 0) {
            ix.L(i11 & i13, i12 + 1, objC);
        }
        Object obj = this.f7766b;
        Objects.requireNonNull(obj);
        int[] iArrA = a();
        for (int i14 = 0; i14 <= i; i14++) {
            int iT = ix.t(i14, obj);
            while (iT != 0) {
                int i15 = iT - 1;
                int i16 = iArrA[i15];
                int i17 = ((~i) & i16) | i14;
                int i18 = i17 & i13;
                int iT2 = ix.t(i18, objC);
                ix.L(i18, iT, objC);
                iArrA[i15] = ((~i13) & i17) | (iT2 & i13);
                iT = i16 & i;
            }
        }
        this.f7766b = objC;
        this.f7770f = ((32 - Integer.numberOfLeadingZeros(i13)) & 31) | (this.f7770f & (-32));
        return i13;
    }

    public final int i(Object obj) {
        if (d()) {
            return -1;
        }
        int iT = vv.t(obj);
        int iG = g();
        Object obj2 = this.f7766b;
        Objects.requireNonNull(obj2);
        int iT2 = ix.t(iT & iG, obj2);
        if (iT2 != 0) {
            int i = ~iG;
            int i10 = iT & i;
            do {
                int i11 = iT2 - 1;
                int i12 = a()[i11];
                if ((i12 & i) == i10 && Objects.equals(obj, b()[i11])) {
                    return i11;
                }
                iT2 = i12 & iG;
            } while (iT2 != 0);
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Object j(Object obj) {
        if (!d()) {
            int iG = g();
            Object obj2 = this.f7766b;
            Objects.requireNonNull(obj2);
            int iW = ix.W(obj, null, iG, obj2, a(), b(), null);
            if (iW != -1) {
                Object obj3 = c()[iW];
                f(iW, iG);
                this.f7771g--;
                this.f7770f += 32;
                return obj3;
            }
        }
        return f7765k;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        k41 k41Var = this.f7772h;
        if (k41Var != null) {
            return k41Var;
        }
        k41 k41Var2 = new k41(this, 1);
        this.f7772h = k41Var2;
        return k41Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i;
        int i10 = 32;
        if (d()) {
            ix.l0("Arrays already allocated", d());
            int i11 = this.f7770f;
            int iMax = Math.max(i11 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.f7766b = ix.c(iMax2);
            this.f7770f = ((32 - Integer.numberOfLeadingZeros(iMax2 - 1)) & 31) | (this.f7770f & (-32));
            this.f7767c = new int[i11];
            this.f7768d = new Object[i11];
            this.f7769e = new Object[i11];
        }
        Map mapE = e();
        if (mapE != null) {
            return mapE.put(obj, obj2);
        }
        int[] iArrA = a();
        Object[] objArrB = b();
        Object[] objArrC = c();
        int i12 = this.f7771g;
        int i13 = i12 + 1;
        int iT = vv.t(obj);
        int iG = g();
        int i14 = iT & iG;
        Object obj3 = this.f7766b;
        Objects.requireNonNull(obj3);
        int iT2 = ix.t(i14, obj3);
        if (iT2 == 0) {
            if (i13 > iG) {
                iG = h(iG, (iG + 1) * (iG < 32 ? 4 : 2), iT, i12);
            } else {
                Object obj4 = this.f7766b;
                Objects.requireNonNull(obj4);
                ix.L(i14, i13, obj4);
            }
            i = 1;
        } else {
            int i15 = ~iG;
            int i16 = iT & i15;
            int i17 = 0;
            while (true) {
                int i18 = iT2 - 1;
                int i19 = iArrA[i18];
                i = 1;
                int i20 = i19 & i15;
                int i21 = i10;
                if (i20 == i16 && Objects.equals(obj, objArrB[i18])) {
                    Object obj5 = objArrC[i18];
                    objArrC[i18] = obj2;
                    return obj5;
                }
                int i22 = i19 & iG;
                int i23 = i17 + 1;
                if (i22 != 0) {
                    i17 = i23;
                    iT2 = i22;
                    i10 = i21;
                } else {
                    if (i23 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(g() + 1, 1.0f);
                        int i24 = isEmpty() ? -1 : 0;
                        while (i24 >= 0) {
                            linkedHashMap.put(b()[i24], c()[i24]);
                            int i25 = i24 + 1;
                            i24 = i25 < this.f7771g ? i25 : -1;
                        }
                        this.f7766b = linkedHashMap;
                        this.f7767c = null;
                        this.f7768d = null;
                        this.f7769e = null;
                        this.f7770f += 32;
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i13 > iG) {
                        iG = h(iG, (iG + 1) * (iG < i21 ? 4 : 2), iT, i12);
                    } else {
                        iArrA[i18] = (i13 & iG) | i20;
                    }
                }
            }
        }
        int length = a().length;
        if (i13 > length) {
            int i26 = i;
            int iMin = Math.min(1073741823, (Math.max(i26, length >>> 1) + length) | i26);
            if (iMin != length) {
                this.f7767c = Arrays.copyOf(a(), iMin);
                this.f7768d = Arrays.copyOf(b(), iMin);
                this.f7769e = Arrays.copyOf(c(), iMin);
            }
        }
        a()[i12] = (~iG) & iT;
        b()[i12] = obj;
        c()[i12] = obj2;
        this.f7771g = i13;
        this.f7770f += 32;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapE = e();
        if (mapE != null) {
            return mapE.remove(obj);
        }
        Object objJ = j(obj);
        if (objJ == f7765k) {
            return null;
        }
        return objJ;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapE = e();
        return mapE != null ? mapE.size() : this.f7771g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        ad.m mVar = this.f7773j;
        if (mVar != null) {
            return mVar;
        }
        ad.m mVar2 = new ad.m(4, this);
        this.f7773j = mVar2;
        return mVar2;
    }

    public m41(int i) {
    }
}
