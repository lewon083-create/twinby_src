package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.internal.ads.om1;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class u5 extends g5 implements RandomAccess, v5 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f13583e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final u5 f13584f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f13585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13586d;

    static {
        int[] iArr = new int[0];
        f13583e = iArr;
        f13584f = new u5(iArr, 0, false);
    }

    public u5(int[] iArr, int i, boolean z5) {
        super(z5);
        this.f13585c = iArr;
        this.f13586d = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i10;
        int iIntValue = ((Integer) obj).intValue();
        a();
        if (i < 0 || i > (i10 = this.f13586d)) {
            throw new IndexOutOfBoundsException(a0.u.j(i, this.f13586d, "Index:", ", Size:"));
        }
        int i11 = i + 1;
        int[] iArr = this.f13585c;
        int length = iArr.length;
        if (i10 < length) {
            System.arraycopy(iArr, i, iArr, i11, i10 - i);
        } else {
            int[] iArr2 = new int[om1.g(length, 3, 2, 1, 10)];
            System.arraycopy(this.f13585c, 0, iArr2, 0, i);
            System.arraycopy(this.f13585c, i, iArr2, i11, this.f13586d - i);
            this.f13585c = iArr2;
        }
        this.f13585c[i] = iIntValue;
        this.f13586d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.consent_sdk.g5, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = x5.f13606a;
        collection.getClass();
        if (!(collection instanceof u5)) {
            return super.addAll(collection);
        }
        u5 u5Var = (u5) collection;
        int i = u5Var.f13586d;
        if (i == 0) {
            return false;
        }
        int i10 = this.f13586d;
        if (Integer.MAX_VALUE - i10 < i) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i;
        int[] iArr = this.f13585c;
        if (i11 > iArr.length) {
            this.f13585c = Arrays.copyOf(iArr, i11);
        }
        System.arraycopy(u5Var.f13585c, 0, this.f13585c, this.f13586d, u5Var.f13586d);
        this.f13586d = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final int c(int i) {
        e(i);
        return this.f13585c[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.consent_sdk.w5
    public final /* bridge */ /* synthetic */ w5 d(int i) {
        if (i >= this.f13586d) {
            return new u5(i == 0 ? f13583e : Arrays.copyOf(this.f13585c, i), this.f13586d, true);
        }
        throw new IllegalArgumentException();
    }

    public final void e(int i) {
        if (i < 0 || i >= this.f13586d) {
            throw new IndexOutOfBoundsException(a0.u.j(i, this.f13586d, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.g5, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5)) {
            return super.equals(obj);
        }
        u5 u5Var = (u5) obj;
        if (this.f13586d != u5Var.f13586d) {
            return false;
        }
        int[] iArr = u5Var.f13585c;
        for (int i = 0; i < this.f13586d; i++) {
            if (this.f13585c[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        e(i);
        return Integer.valueOf(this.f13585c[i]);
    }

    @Override // com.google.android.gms.internal.consent_sdk.g5, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i10 = 0; i10 < this.f13586d; i10++) {
            i = (i * 31) + this.f13585c[i10];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.f13586d;
        for (int i10 = 0; i10 < i; i10++) {
            if (this.f13585c[i10] == iIntValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.consent_sdk.g5, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        a();
        e(i);
        int[] iArr = this.f13585c;
        int i10 = iArr[i];
        if (i < this.f13586d - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.f13586d--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i10) {
        a();
        if (i10 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f13585c;
        System.arraycopy(iArr, i10, iArr, i, this.f13586d - i10);
        this.f13586d -= i10 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        a();
        e(i);
        int[] iArr = this.f13585c;
        int i10 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13586d;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        a();
        int i = this.f13586d;
        int length = this.f13585c.length;
        if (i == length) {
            int[] iArr = new int[om1.g(length, 3, 2, 1, 10)];
            System.arraycopy(this.f13585c, 0, iArr, 0, this.f13586d);
            this.f13585c = iArr;
        }
        int[] iArr2 = this.f13585c;
        int i10 = this.f13586d;
        this.f13586d = i10 + 1;
        iArr2[i10] = iIntValue;
        return true;
    }
}
