package ad;

import com.google.android.gms.internal.measurement.h5;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o0 extends f0 implements Set {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f846d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient j0 f847c;

    public static int p(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            h5.g("collection too large", iMax < 1073741824);
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static o0 q(int i, Object... objArr) {
        if (i == 0) {
            return i1.f812k;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new o1(obj);
        }
        int iP = p(i);
        Object[] objArr2 = new Object[iP];
        int i10 = iP - 1;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < i; i13++) {
            Object obj2 = objArr[i13];
            if (obj2 == null) {
                throw new NullPointerException(l7.o.i(i13, "at index "));
            }
            int iHashCode = obj2.hashCode();
            int iQ = q.q(iHashCode);
            while (true) {
                int i14 = iQ & i10;
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
                iQ++;
            }
        }
        Arrays.fill(objArr, i12, i, (Object) null);
        if (i12 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new o1(obj4);
        }
        if (p(i12) < iP / 2) {
            return q(i12, objArr);
        }
        int length = objArr.length;
        if (i12 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i12);
        }
        return new i1(objArr, i11, objArr2, i10, i12);
    }

    public static o0 r(Collection collection) {
        if ((collection instanceof o0) && !(collection instanceof SortedSet)) {
            o0 o0Var = (o0) collection;
            if (!o0Var.n()) {
                return o0Var;
            }
        }
        Object[] array = collection.toArray();
        return q(array.length, array);
    }

    @Override // ad.f0
    public j0 a() {
        j0 j0Var = this.f847c;
        if (j0Var != null) {
            return j0Var;
        }
        j0 j0VarT = t();
        this.f847c = j0VarT;
        return j0VarT;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof o0) && (this instanceof i1) && (((o0) obj) instanceof i1) && hashCode() != obj.hashCode()) {
            return false;
        }
        return q.g(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return q.k(this);
    }

    public j0 t() {
        Object[] array = toArray(f0.f791b);
        h0 h0Var = j0.f818c;
        return j0.p(array.length, array);
    }
}
