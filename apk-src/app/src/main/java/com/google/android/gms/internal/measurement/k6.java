package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.om1;
import com.google.android.gms.internal.ads.um1;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k6 extends u4 implements RandomAccess {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object[] f13853e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final k6 f13854f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f13855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13856d;

    static {
        Object[] objArr = new Object[0];
        f13853e = objArr;
        f13854f = new k6(objArr, 0, false);
    }

    public k6(Object[] objArr, int i, boolean z5) {
        super(z5);
        this.f13855c = objArr;
        this.f13856d = i;
    }

    @Override // com.google.android.gms.internal.measurement.q5
    public final /* bridge */ /* synthetic */ q5 O(int i) {
        if (i >= this.f13856d) {
            return new k6(i == 0 ? f13853e : Arrays.copyOf(this.f13855c, i), this.f13856d, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i10;
        a();
        if (i < 0 || i > (i10 = this.f13856d)) {
            throw new IndexOutOfBoundsException(um1.a(this.f13856d, i, (byte) 13, "Index:", ", Size:"));
        }
        int i11 = i + 1;
        Object[] objArr = this.f13855c;
        int length = objArr.length;
        if (i10 < length) {
            System.arraycopy(objArr, i, objArr, i11, i10 - i);
        } else {
            Object[] objArr2 = new Object[om1.g(length, 3, 2, 1, 10)];
            System.arraycopy(this.f13855c, 0, objArr2, 0, i);
            System.arraycopy(this.f13855c, i, objArr2, i11, this.f13856d - i);
            this.f13855c = objArr2;
        }
        this.f13855c[i] = obj;
        this.f13856d++;
        ((AbstractList) this).modCount++;
    }

    public final void c(int i) {
        if (i < 0 || i >= this.f13856d) {
            throw new IndexOutOfBoundsException(um1.a(this.f13856d, i, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        c(i);
        return this.f13855c[i];
    }

    @Override // com.google.android.gms.internal.measurement.u4, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        c(i);
        Object[] objArr = this.f13855c;
        Object obj = objArr[i];
        if (i < this.f13856d - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.f13856d--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        a();
        c(i);
        Object[] objArr = this.f13855c;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13856d;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i = this.f13856d;
        int length = this.f13855c.length;
        if (i == length) {
            this.f13855c = Arrays.copyOf(this.f13855c, om1.g(length, 3, 2, 1, 10));
        }
        Object[] objArr = this.f13855c;
        int i10 = this.f13856d;
        this.f13856d = i10 + 1;
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
