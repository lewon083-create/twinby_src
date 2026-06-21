package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h0 extends x implements Set {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient c0 f14201c;

    public static int o(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (((double) iHighestOneBit) * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static h0 q(int i, Object... objArr) {
        if (i == 0) {
            return x0.f14357j;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new z0(obj);
        }
        int iO = o(i);
        Object[] objArr2 = new Object[iO];
        int i10 = iO - 1;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < i; i13++) {
            Object obj2 = objArr[i13];
            if (obj2 == null) {
                throw new NullPointerException(l7.o.i(i13, "at index "));
            }
            int iHashCode = obj2.hashCode();
            int iB = d3.b(iHashCode);
            while (true) {
                int i14 = iB & i10;
                Object obj3 = objArr2[i14];
                if (obj3 == null) {
                    objArr[i12] = obj2;
                    objArr2[i14] = obj2;
                    i11 += iHashCode;
                    i12++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    iB++;
                }
            }
        }
        Arrays.fill(objArr, i12, i, (Object) null);
        if (i12 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new z0(obj4);
        }
        if (o(i12) < iO / 2) {
            return q(i12, objArr);
        }
        int length = objArr.length;
        if (i12 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i12);
        }
        return new x0(objArr, i11, objArr2, i10, i12);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof h0) && (this instanceof x0) && (((h0) obj) instanceof x0) && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    return containsAll(set);
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.x
    public c0 f() {
        c0 c0Var = this.f14201c;
        if (c0Var != null) {
            return c0Var;
        }
        c0 c0VarP = p();
        this.f14201c = c0VarP;
        return c0VarP;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    public c0 p() {
        Object[] array = toArray(x.f14356b);
        z zVar = c0.f14146c;
        return c0.q(array.length, array);
    }
}
