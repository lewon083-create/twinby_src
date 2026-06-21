package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class tn1 extends qm1 implements RandomAccess, wn1, ro1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f10666e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final tn1 f10667f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f10668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10669d;

    static {
        int[] iArr = new int[0];
        f10666e = iArr;
        f10667f = new tn1(iArr, 0, false);
    }

    public tn1(int[] iArr, int i, boolean z5) {
        super(z5);
        this.f10668c = iArr;
        this.f10669d = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i10;
        int iIntValue = ((Integer) obj).intValue();
        a();
        if (i < 0 || i > (i10 = this.f10669d)) {
            throw new IndexOutOfBoundsException(n(i));
        }
        int i11 = i + 1;
        int[] iArr = this.f10668c;
        int length = iArr.length;
        if (i10 < length) {
            System.arraycopy(iArr, i, iArr, i11, i10 - i);
        } else {
            int[] iArr2 = new int[om1.g(length, 3, 2, 1, 10)];
            System.arraycopy(this.f10668c, 0, iArr2, 0, i);
            System.arraycopy(this.f10668c, i, iArr2, i11, this.f10669d - i);
            this.f10668c = iArr2;
        }
        this.f10668c[i] = iIntValue;
        this.f10669d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.qm1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = ao1.f3341a;
        collection.getClass();
        if (!(collection instanceof tn1)) {
            return super.addAll(collection);
        }
        tn1 tn1Var = (tn1) collection;
        int i = tn1Var.f10669d;
        if (i == 0) {
            return false;
        }
        int i10 = this.f10669d;
        if (Integer.MAX_VALUE - i10 < i) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i;
        int[] iArr = this.f10668c;
        if (i11 > iArr.length) {
            this.f10668c = Arrays.copyOf(iArr, i11);
        }
        System.arraycopy(tn1Var.f10668c, 0, this.f10668c, this.f10669d, tn1Var.f10669d);
        this.f10669d = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zn1
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final tn1 b(int i) {
        if (i >= this.f10669d) {
            return new tn1(i == 0 ? f10666e : Arrays.copyOf(this.f10668c, i), this.f10669d, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int e(int i) {
        g(i);
        return this.f10668c[i];
    }

    @Override // com.google.android.gms.internal.ads.qm1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tn1)) {
            return super.equals(obj);
        }
        tn1 tn1Var = (tn1) obj;
        if (this.f10669d != tn1Var.f10669d) {
            return false;
        }
        int[] iArr = tn1Var.f10668c;
        for (int i = 0; i < this.f10669d; i++) {
            if (this.f10668c[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final void f(int i) {
        a();
        int i10 = this.f10669d;
        int length = this.f10668c.length;
        if (i10 == length) {
            int[] iArr = new int[om1.g(length, 3, 2, 1, 10)];
            System.arraycopy(this.f10668c, 0, iArr, 0, this.f10669d);
            this.f10668c = iArr;
        }
        int[] iArr2 = this.f10668c;
        int i11 = this.f10669d;
        this.f10669d = i11 + 1;
        iArr2[i11] = i;
    }

    public final void g(int i) {
        if (i < 0 || i >= this.f10669d) {
            throw new IndexOutOfBoundsException(n(i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        g(i);
        return Integer.valueOf(this.f10668c[i]);
    }

    @Override // com.google.android.gms.internal.ads.qm1, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i10 = 0; i10 < this.f10669d; i10++) {
            i = (i * 31) + this.f10668c[i10];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.f10669d;
        for (int i10 = 0; i10 < i; i10++) {
            if (this.f10668c[i10] == iIntValue) {
                return i10;
            }
        }
        return -1;
    }

    public final String n(int i) {
        int i10 = this.f10669d;
        return pe.a.g(new StringBuilder(String.valueOf(i).length() + 13 + String.valueOf(i10).length()), i, "Index:", i10, ", Size:");
    }

    @Override // com.google.android.gms.internal.ads.qm1, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        a();
        g(i);
        int[] iArr = this.f10668c;
        int i10 = iArr[i];
        if (i < this.f10669d - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.f10669d--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i10) {
        a();
        if (i10 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f10668c;
        System.arraycopy(iArr, i10, iArr, i, this.f10669d - i10);
        this.f10669d -= i10 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        a();
        g(i);
        int[] iArr = this.f10668c;
        int i10 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f10669d;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        f(((Integer) obj).intValue());
        return true;
    }
}
