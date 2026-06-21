package ad;

import com.google.android.gms.internal.measurement.h5;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f881k = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient Object f882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient int[] f883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient Object[] f884d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient Object[] f885e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public transient int f886f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public transient int f887g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public transient s f888h;
    public transient s i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public transient m f889j;

    public static v a() {
        v vVar = new v();
        vVar.f886f = Math.min(Math.max(3, 1), 1073741823);
        return vVar;
    }

    public static v b(int i) {
        v vVar = new v();
        h5.g("Expected size must be >= 0", i >= 0);
        vVar.f886f = Math.min(Math.max(i, 1), 1073741823);
        return vVar;
    }

    public final Map c() {
        Object obj = this.f882b;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (g()) {
            return;
        }
        this.f886f += 32;
        Map mapC = c();
        if (mapC != null) {
            this.f886f = Math.min(Math.max(size(), 3), 1073741823);
            mapC.clear();
            this.f882b = null;
            this.f887g = 0;
            return;
        }
        Arrays.fill(j(), 0, this.f887g, (Object) null);
        Arrays.fill(k(), 0, this.f887g, (Object) null);
        Object obj = this.f882b;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(i(), 0, this.f887g, 0);
        this.f887g = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapC = c();
        return mapC != null ? mapC.containsKey(obj) : e(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapC = c();
        if (mapC != null) {
            return mapC.containsValue(obj);
        }
        for (int i = 0; i < this.f887g; i++) {
            if (Objects.equals(obj, k()[i])) {
                return true;
            }
        }
        return false;
    }

    public final int d() {
        return (1 << (this.f886f & 31)) - 1;
    }

    public final int e(Object obj) {
        if (g()) {
            return -1;
        }
        int iR = q.r(obj);
        int iD = d();
        Object obj2 = this.f882b;
        Objects.requireNonNull(obj2);
        int iS = q.s(iR & iD, obj2);
        if (iS == 0) {
            return -1;
        }
        int i = ~iD;
        int i10 = iR & i;
        do {
            int i11 = iS - 1;
            int i12 = i()[i11];
            if ((i12 & i) == i10 && Objects.equals(obj, j()[i11])) {
                return i11;
            }
            iS = i12 & iD;
        } while (iS != 0);
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        s sVar = this.i;
        if (sVar != null) {
            return sVar;
        }
        s sVar2 = new s(this, 0);
        this.i = sVar2;
        return sVar2;
    }

    public final void f(int i, int i10) {
        Object obj = this.f882b;
        Objects.requireNonNull(obj);
        int[] iArrI = i();
        Object[] objArrJ = j();
        Object[] objArrK = k();
        int size = size();
        int i11 = size - 1;
        if (i >= i11) {
            objArrJ[i] = null;
            objArrK[i] = null;
            iArrI[i] = 0;
            return;
        }
        Object obj2 = objArrJ[i11];
        objArrJ[i] = obj2;
        objArrK[i] = objArrK[i11];
        objArrJ[i11] = null;
        objArrK[i11] = null;
        iArrI[i] = iArrI[i11];
        iArrI[i11] = 0;
        int iR = q.r(obj2) & i10;
        int iS = q.s(iR, obj);
        if (iS == size) {
            q.t(iR, i + 1, obj);
            return;
        }
        while (true) {
            int i12 = iS - 1;
            int i13 = iArrI[i12];
            int i14 = i13 & i10;
            if (i14 == size) {
                iArrI[i12] = q.m(i13, i + 1, i10);
                return;
            }
            iS = i14;
        }
    }

    public final boolean g() {
        return this.f882b == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapC = c();
        if (mapC != null) {
            return mapC.get(obj);
        }
        int iE = e(obj);
        if (iE == -1) {
            return null;
        }
        return k()[iE];
    }

    public final Object h(Object obj) {
        if (!g()) {
            int iD = d();
            Object obj2 = this.f882b;
            Objects.requireNonNull(obj2);
            int iO = q.o(obj, null, iD, obj2, i(), j(), null);
            if (iO != -1) {
                Object obj3 = k()[iO];
                f(iO, iD);
                this.f887g--;
                this.f886f += 32;
                return obj3;
            }
        }
        return f881k;
    }

    public final int[] i() {
        int[] iArr = this.f883c;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Object[] j() {
        Object[] objArr = this.f884d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object[] k() {
        Object[] objArr = this.f885e;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        s sVar = this.f888h;
        if (sVar != null) {
            return sVar;
        }
        s sVar2 = new s(this, 1);
        this.f888h = sVar2;
        return sVar2;
    }

    public final int l(int i, int i10, int i11, int i12) {
        Object objE = q.e(i10);
        int i13 = i10 - 1;
        if (i12 != 0) {
            q.t(i11 & i13, i12 + 1, objE);
        }
        Object obj = this.f882b;
        Objects.requireNonNull(obj);
        int[] iArrI = i();
        for (int i14 = 0; i14 <= i; i14++) {
            int iS = q.s(i14, obj);
            while (iS != 0) {
                int i15 = iS - 1;
                int i16 = iArrI[i15];
                int i17 = ((~i) & i16) | i14;
                int i18 = i17 & i13;
                int iS2 = q.s(i18, objE);
                q.t(i18, iS, objE);
                iArrI[i15] = q.m(i17, iS2, i13);
                iS = i16 & i;
            }
        }
        this.f882b = objE;
        this.f886f = q.m(this.f886f, 32 - Integer.numberOfLeadingZeros(i13), 31);
        return i13;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00eb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00fe -> B:37:0x00e4). Please report as a decompilation issue!!! */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object put(java.lang.Object r23, java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ad.v.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapC = c();
        if (mapC != null) {
            return mapC.remove(obj);
        }
        Object objH = h(obj);
        if (objH == f881k) {
            return null;
        }
        return objH;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapC = c();
        return mapC != null ? mapC.size() : this.f887g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        m mVar = this.f889j;
        if (mVar != null) {
            return mVar;
        }
        m mVar2 = new m(1, this);
        this.f889j = mVar2;
        return mVar2;
    }
}
