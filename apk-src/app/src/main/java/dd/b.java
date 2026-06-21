package dd;

import com.google.android.gms.internal.measurement.h5;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.Spliterators;
import k3.f;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractList implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f15771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15773d;

    public b(int i, int i10, int[] iArr) {
        this.f15771b = iArr;
        this.f15772c = i;
        this.f15773d = i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Integer) {
            return f.q(this.f15771b, ((Integer) obj).intValue(), this.f15772c, this.f15773d) != -1;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return super.equals(obj);
        }
        b bVar = (b) obj;
        int size = size();
        if (bVar.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (this.f15771b[this.f15772c + i] != bVar.f15771b[bVar.f15772c + i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        h5.l(i, size());
        return Integer.valueOf(this.f15771b[this.f15772c + i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iHashCode = 1;
        for (int i = this.f15772c; i < this.f15773d; i++) {
            iHashCode = (iHashCode * 31) + Integer.hashCode(this.f15771b[i]);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.f15773d;
        int[] iArr = this.f15771b;
        int i10 = this.f15772c;
        int iQ = f.q(iArr, iIntValue, i10, i);
        if (iQ >= 0) {
            return iQ - i10;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int i;
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            int i10 = this.f15773d;
            while (true) {
                i10--;
                i = this.f15772c;
                if (i10 < i) {
                    i10 = -1;
                    break;
                }
                if (this.f15771b[i10] == iIntValue) {
                    break;
                }
            }
            if (i10 >= 0) {
                return i10 - i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        Integer num = (Integer) obj;
        h5.l(i, size());
        int i10 = this.f15772c + i;
        int[] iArr = this.f15771b;
        int i11 = iArr[i10];
        num.getClass();
        iArr[i10] = num.intValue();
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15773d - this.f15772c;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public final Spliterator spliterator() {
        return Spliterators.spliterator(this.f15771b, this.f15772c, this.f15773d, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i10) {
        h5.p(i, i10, size());
        if (i == i10) {
            return Collections.EMPTY_LIST;
        }
        int i11 = this.f15772c;
        return new b(i + i11, i11 + i10, this.f15771b);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb2 = new StringBuilder(size() * 5);
        sb2.append('[');
        int[] iArr = this.f15771b;
        int i = this.f15772c;
        sb2.append(iArr[i]);
        while (true) {
            i++;
            if (i >= this.f15773d) {
                sb2.append(']');
                return sb2.toString();
            }
            sb2.append(", ");
            sb2.append(iArr[i]);
        }
    }
}
