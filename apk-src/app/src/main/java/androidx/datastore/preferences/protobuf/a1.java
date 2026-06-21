package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 extends b implements RandomAccess {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a1 f1358e = new a1(new Object[0], 0, false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f1359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1360d;

    public a1(Object[] objArr, int i, boolean z5) {
        this.f1361b = z5;
        this.f1359c = objArr;
        this.f1360d = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i = this.f1360d;
        Object[] objArr = this.f1359c;
        if (i == objArr.length) {
            this.f1359c = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f1359c;
        int i10 = this.f1360d;
        this.f1360d = i10 + 1;
        objArr2[i10] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void c(int i) {
        if (i < 0 || i >= this.f1360d) {
            StringBuilder sbM = l7.o.m(i, "Index:", ", Size:");
            sbM.append(this.f1360d);
            throw new IndexOutOfBoundsException(sbM.toString());
        }
    }

    public final a1 e(int i) {
        if (i >= this.f1360d) {
            return new a1(Arrays.copyOf(this.f1359c, i), this.f1360d, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        c(i);
        return this.f1359c[i];
    }

    @Override // androidx.datastore.preferences.protobuf.b, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        c(i);
        Object[] objArr = this.f1359c;
        Object obj = objArr[i];
        if (i < this.f1360d - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.f1360d--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        a();
        c(i);
        Object[] objArr = this.f1359c;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f1360d;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i10;
        a();
        if (i >= 0 && i <= (i10 = this.f1360d)) {
            Object[] objArr = this.f1359c;
            if (i10 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i + 1, i10 - i);
            } else {
                Object[] objArr2 = new Object[((i10 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(this.f1359c, i, objArr2, i + 1, this.f1360d - i);
                this.f1359c = objArr2;
            }
            this.f1359c[i] = obj;
            this.f1360d++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbM = l7.o.m(i, "Index:", ", Size:");
        sbM.append(this.f1360d);
        throw new IndexOutOfBoundsException(sbM.toString());
    }
}
