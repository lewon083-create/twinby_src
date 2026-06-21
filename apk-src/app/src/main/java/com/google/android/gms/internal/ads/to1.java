package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class to1 extends qm1 implements RandomAccess {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object[] f10680e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final to1 f10681f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f10682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10683d;

    static {
        Object[] objArr = new Object[0];
        f10680e = objArr;
        f10681f = new to1(objArr, 0, false);
    }

    public to1(Object[] objArr, int i, boolean z5) {
        super(z5);
        this.f10682c = objArr;
        this.f10683d = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i10;
        a();
        if (i < 0 || i > (i10 = this.f10683d)) {
            throw new IndexOutOfBoundsException(e(i));
        }
        int i11 = i + 1;
        Object[] objArr = this.f10682c;
        int length = objArr.length;
        if (i10 < length) {
            System.arraycopy(objArr, i, objArr, i11, i10 - i);
        } else {
            Object[] objArr2 = new Object[om1.g(length, 3, 2, 1, 10)];
            System.arraycopy(this.f10682c, 0, objArr2, 0, i);
            System.arraycopy(this.f10682c, i, objArr2, i11, this.f10683d - i);
            this.f10682c = objArr2;
        }
        this.f10682c[i] = obj;
        this.f10683d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zn1
    public final /* bridge */ /* synthetic */ zn1 b(int i) {
        if (i >= this.f10683d) {
            return new to1(i == 0 ? f10680e : Arrays.copyOf(this.f10682c, i), this.f10683d, true);
        }
        throw new IllegalArgumentException();
    }

    public final void c(int i) {
        if (i < 0 || i >= this.f10683d) {
            throw new IndexOutOfBoundsException(e(i));
        }
    }

    public final String e(int i) {
        int i10 = this.f10683d;
        return pe.a.g(new StringBuilder(String.valueOf(i).length() + 13 + String.valueOf(i10).length()), i, "Index:", i10, ", Size:");
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        c(i);
        return this.f10682c[i];
    }

    @Override // com.google.android.gms.internal.ads.qm1, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        c(i);
        Object[] objArr = this.f10682c;
        Object obj = objArr[i];
        if (i < this.f10683d - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.f10683d--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        a();
        c(i);
        Object[] objArr = this.f10682c;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f10683d;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i = this.f10683d;
        int length = this.f10682c.length;
        if (i == length) {
            this.f10682c = Arrays.copyOf(this.f10682c, om1.g(length, 3, 2, 1, 10));
        }
        Object[] objArr = this.f10682c;
        int i10 = this.f10683d;
        this.f10683d = i10 + 1;
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
