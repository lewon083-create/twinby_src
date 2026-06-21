package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.om1;
import com.google.android.gms.internal.ads.um1;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l5 extends u4 implements RandomAccess, o5, i6 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f13863e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final l5 f13864f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f13865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13866d;

    static {
        int[] iArr = new int[0];
        f13863e = iArr;
        f13864f = new l5(iArr, 0, false);
    }

    public l5(int[] iArr, int i, boolean z5) {
        super(z5);
        this.f13865c = iArr;
        this.f13866d = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i10;
        int iIntValue = ((Integer) obj).intValue();
        a();
        if (i < 0 || i > (i10 = this.f13866d)) {
            throw new IndexOutOfBoundsException(um1.a(this.f13866d, i, (byte) 13, "Index:", ", Size:"));
        }
        int i11 = i + 1;
        int[] iArr = this.f13865c;
        int length = iArr.length;
        if (i10 < length) {
            System.arraycopy(iArr, i, iArr, i11, i10 - i);
        } else {
            int[] iArr2 = new int[om1.g(length, 3, 2, 1, 10)];
            System.arraycopy(this.f13865c, 0, iArr2, 0, i);
            System.arraycopy(this.f13865c, i, iArr2, i11, this.f13866d - i);
            this.f13865c = iArr2;
        }
        this.f13865c[i] = iIntValue;
        this.f13866d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.u4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = r5.f13944a;
        collection.getClass();
        if (!(collection instanceof l5)) {
            return super.addAll(collection);
        }
        l5 l5Var = (l5) collection;
        int i = l5Var.f13866d;
        if (i == 0) {
            return false;
        }
        int i10 = this.f13866d;
        if (Integer.MAX_VALUE - i10 < i) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i;
        int[] iArr = this.f13865c;
        if (i11 > iArr.length) {
            this.f13865c = Arrays.copyOf(iArr, i11);
        }
        System.arraycopy(l5Var.f13865c, 0, this.f13865c, this.f13866d, l5Var.f13866d);
        this.f13866d = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.q5
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final l5 O(int i) {
        if (i >= this.f13866d) {
            return new l5(i == 0 ? f13863e : Arrays.copyOf(this.f13865c, i), this.f13866d, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int e(int i) {
        g(i);
        return this.f13865c[i];
    }

    @Override // com.google.android.gms.internal.measurement.u4, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l5)) {
            return super.equals(obj);
        }
        l5 l5Var = (l5) obj;
        if (this.f13866d != l5Var.f13866d) {
            return false;
        }
        int[] iArr = l5Var.f13865c;
        for (int i = 0; i < this.f13866d; i++) {
            if (this.f13865c[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final void f(int i) {
        a();
        int i10 = this.f13866d;
        int length = this.f13865c.length;
        if (i10 == length) {
            int[] iArr = new int[om1.g(length, 3, 2, 1, 10)];
            System.arraycopy(this.f13865c, 0, iArr, 0, this.f13866d);
            this.f13865c = iArr;
        }
        int[] iArr2 = this.f13865c;
        int i11 = this.f13866d;
        this.f13866d = i11 + 1;
        iArr2[i11] = i;
    }

    public final void g(int i) {
        if (i < 0 || i >= this.f13866d) {
            throw new IndexOutOfBoundsException(um1.a(this.f13866d, i, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        g(i);
        return Integer.valueOf(this.f13865c[i]);
    }

    @Override // com.google.android.gms.internal.measurement.u4, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i10 = 0; i10 < this.f13866d; i10++) {
            i = (i * 31) + this.f13865c[i10];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.f13866d;
        for (int i10 = 0; i10 < i; i10++) {
            if (this.f13865c[i10] == iIntValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.u4, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        a();
        g(i);
        int[] iArr = this.f13865c;
        int i10 = iArr[i];
        if (i < this.f13866d - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.f13866d--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i10) {
        a();
        if (i10 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f13865c;
        System.arraycopy(iArr, i10, iArr, i, this.f13866d - i10);
        this.f13866d -= i10 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        a();
        g(i);
        int[] iArr = this.f13865c;
        int i10 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13866d;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        f(((Integer) obj).intValue());
        return true;
    }
}
