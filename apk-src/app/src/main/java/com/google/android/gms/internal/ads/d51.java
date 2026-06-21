package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d51 extends t41 implements Set {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f4468d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient x41 f4469c;

    public static d51 p(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        int length = objArr.length;
        int i = length + 6;
        Object[] objArr2 = new Object[i];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, length);
        return w(i, objArr2);
    }

    public static int q(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            ix.A("collection too large", iMax < 1073741824);
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (((double) iHighestOneBit) * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static d51 r(Set set) {
        if ((set instanceof d51) && !(set instanceof SortedSet)) {
            d51 d51Var = (d51) set;
            if (!d51Var.n()) {
                return d51Var;
            }
        }
        Object[] array = set.toArray();
        return w(array.length, array);
    }

    public static d51 t(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? w(length, (Object[]) objArr.clone()) : new e51(objArr[0]) : x51.f12049k;
    }

    public static c51 v(int i) {
        fs1.y(i, "expectedSize");
        c51 c51Var = new c51(i);
        c51Var.f4041d = new Object[q(i)];
        return c51Var;
    }

    public static d51 w(int i, Object... objArr) {
        if (i == 0) {
            return x51.f12049k;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new e51(obj);
        }
        int iQ = q(i);
        Object[] objArr2 = new Object[iQ];
        int i10 = iQ - 1;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < i; i13++) {
            Object obj2 = objArr[i13];
            vv.w(i13, obj2);
            int iHashCode = obj2.hashCode();
            int iA = vv.a(iHashCode);
            while (true) {
                int i14 = iA & i10;
                Object obj3 = objArr2[i14];
                if (obj3 == null) {
                    objArr[i12] = obj2;
                    objArr2[i14] = obj2;
                    i11 += iHashCode;
                    i12++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    iA++;
                }
            }
        }
        Arrays.fill(objArr, i12, i, (Object) null);
        if (i12 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new e51(obj4);
        }
        if (q(i12) < iQ / 2) {
            return w(i12, objArr);
        }
        int length = objArr.length;
        if (i12 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i12);
        }
        return new x51(objArr, i11, objArr2, i10, i12);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof d51) && (this instanceof x51) && (((d51) obj) instanceof x51) && hashCode() != obj.hashCode()) {
            return false;
        }
        return fs1.L(this, obj);
    }

    @Override // com.google.android.gms.internal.ads.t41
    public x41 g() {
        x41 x41Var = this.f4469c;
        if (x41Var != null) {
            return x41Var;
        }
        x41 x41VarU = u();
        this.f4469c = x41VarU;
        return x41VarU;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return fs1.D(this);
    }

    public x41 u() {
        Object[] array = toArray(t41.f10486b);
        v41 v41Var = x41.f12018c;
        return x41.x(array.length, array);
    }
}
