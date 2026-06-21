package com.google.android.gms.internal.auth;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 extends c0 implements RandomAccess {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i1 f13233e = new i1(new Object[0], 0, false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f13234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13235d;

    public i1(Object[] objArr, int i, boolean z5) {
        super(z5);
        this.f13234c = objArr;
        this.f13235d = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i10;
        a();
        if (i < 0 || i > (i10 = this.f13235d)) {
            throw new IndexOutOfBoundsException(a0.u.j(i, this.f13235d, "Index:", ", Size:"));
        }
        Object[] objArr = this.f13234c;
        if (i10 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i10 - i);
        } else {
            Object[] objArr2 = new Object[((i10 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f13234c, i, objArr2, i + 1, this.f13235d - i);
            this.f13234c = objArr2;
        }
        this.f13234c[i] = obj;
        this.f13235d++;
        ((AbstractList) this).modCount++;
    }

    public final void c(int i) {
        if (i < 0 || i >= this.f13235d) {
            throw new IndexOutOfBoundsException(a0.u.j(i, this.f13235d, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.auth.m0
    public final /* bridge */ /* synthetic */ m0 d(int i) {
        if (i >= this.f13235d) {
            return new i1(Arrays.copyOf(this.f13234c, i), this.f13235d, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        c(i);
        return this.f13234c[i];
    }

    @Override // com.google.android.gms.internal.auth.c0, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        c(i);
        Object[] objArr = this.f13234c;
        Object obj = objArr[i];
        if (i < this.f13235d - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.f13235d--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        a();
        c(i);
        Object[] objArr = this.f13234c;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13235d;
    }

    @Override // com.google.android.gms.internal.auth.c0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i = this.f13235d;
        Object[] objArr = this.f13234c;
        if (i == objArr.length) {
            this.f13234c = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f13234c;
        int i10 = this.f13235d;
        this.f13235d = i10 + 1;
        objArr2[i10] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
