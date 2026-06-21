package yads;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class w51 extends l51 implements Set {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient r51 f44286c;

    public static w51 b(int i, Object... objArr) {
        if (i == 0) {
            return an2.f36787j;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new a03(obj);
        }
        int iA = a(i);
        Object[] objArr2 = new Object[iA];
        int i10 = iA - 1;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < i; i13++) {
            Object obj2 = objArr[i13];
            if (obj2 == null) {
                throw new NullPointerException(og2.a("at index ", i13));
            }
            int iHashCode = obj2.hashCode();
            int iA2 = q01.a(iHashCode);
            while (true) {
                int i14 = iA2 & i10;
                Object obj3 = objArr2[i14];
                if (obj3 == null) {
                    objArr[i12] = obj2;
                    objArr2[i14] = obj2;
                    i11 += iHashCode;
                    i12++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iA2++;
            }
        }
        Arrays.fill(objArr, i12, i, (Object) null);
        if (i12 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new a03(obj4);
        }
        if (a(i12) < iA / 2) {
            return b(i12, objArr);
        }
        int length = objArr.length;
        if (i12 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i12);
        }
        return new an2(objArr, i11, objArr2, i10, i12);
    }

    @Override // yads.l51
    public r51 a() {
        r51 r51Var = this.f44286c;
        if (r51Var != null) {
            return r51Var;
        }
        r51 r51VarF = f();
        this.f44286c = r51VarF;
        return r51VarF;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof w51) && (this instanceof an2) && (((w51) obj) instanceof an2) && hashCode() != obj.hashCode()) {
            return false;
        }
        return oy2.a(this, obj);
    }

    public r51 f() {
        Object[] array = toArray(l51.f40425b);
        o51 o51Var = r51.f42498c;
        return r51.b(array.length, array);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return oy2.a(this);
    }

    public static int a(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static w51 a(Set set) {
        if ((set instanceof w51) && !(set instanceof SortedSet)) {
            w51 w51Var = (w51) set;
            if (!w51Var.e()) {
                return w51Var;
            }
        }
        Object[] array = set.toArray();
        return b(array.length, array);
    }
}
