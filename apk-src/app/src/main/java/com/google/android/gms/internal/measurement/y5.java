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
public final class y5 extends u4 implements RandomAccess, p5, i6 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long[] f14096e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final y5 f14097f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long[] f14098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14099d;

    static {
        long[] jArr = new long[0];
        f14096e = jArr;
        f14097f = new y5(jArr, 0, false);
    }

    public y5(long[] jArr, int i, boolean z5) {
        super(z5);
        this.f14098c = jArr;
        this.f14099d = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i10;
        long jLongValue = ((Long) obj).longValue();
        a();
        if (i < 0 || i > (i10 = this.f14099d)) {
            throw new IndexOutOfBoundsException(um1.a(this.f14099d, i, (byte) 13, "Index:", ", Size:"));
        }
        int i11 = i + 1;
        long[] jArr = this.f14098c;
        int length = jArr.length;
        if (i10 < length) {
            System.arraycopy(jArr, i, jArr, i11, i10 - i);
        } else {
            long[] jArr2 = new long[om1.g(length, 3, 2, 1, 10)];
            System.arraycopy(this.f14098c, 0, jArr2, 0, i);
            System.arraycopy(this.f14098c, i, jArr2, i11, this.f14099d - i);
            this.f14098c = jArr2;
        }
        this.f14098c[i] = jLongValue;
        this.f14099d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.u4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = r5.f13944a;
        collection.getClass();
        if (!(collection instanceof y5)) {
            return super.addAll(collection);
        }
        y5 y5Var = (y5) collection;
        int i = y5Var.f14099d;
        if (i == 0) {
            return false;
        }
        int i10 = this.f14099d;
        if (Integer.MAX_VALUE - i10 < i) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i;
        long[] jArr = this.f14098c;
        if (i11 > jArr.length) {
            this.f14098c = Arrays.copyOf(jArr, i11);
        }
        System.arraycopy(y5Var.f14098c, 0, this.f14098c, this.f14099d, y5Var.f14099d);
        this.f14099d = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final long c(int i) {
        g(i);
        return this.f14098c[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.measurement.q5
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final y5 O(int i) {
        if (i >= this.f14099d) {
            return new y5(i == 0 ? f14096e : Arrays.copyOf(this.f14098c, i), this.f14099d, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.u4, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y5)) {
            return super.equals(obj);
        }
        y5 y5Var = (y5) obj;
        if (this.f14099d != y5Var.f14099d) {
            return false;
        }
        long[] jArr = y5Var.f14098c;
        for (int i = 0; i < this.f14099d; i++) {
            if (this.f14098c[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final void f(long j10) {
        a();
        int i = this.f14099d;
        int length = this.f14098c.length;
        if (i == length) {
            long[] jArr = new long[om1.g(length, 3, 2, 1, 10)];
            System.arraycopy(this.f14098c, 0, jArr, 0, this.f14099d);
            this.f14098c = jArr;
        }
        long[] jArr2 = this.f14098c;
        int i10 = this.f14099d;
        this.f14099d = i10 + 1;
        jArr2[i10] = j10;
    }

    public final void g(int i) {
        if (i < 0 || i >= this.f14099d) {
            throw new IndexOutOfBoundsException(um1.a(this.f14099d, i, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        g(i);
        return Long.valueOf(this.f14098c[i]);
    }

    @Override // com.google.android.gms.internal.measurement.u4, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i10 = 0; i10 < this.f14099d; i10++) {
            long j10 = this.f14098c[i10];
            Charset charset = r5.f13944a;
            i = (i * 31) + ((int) (j10 ^ (j10 >>> 32)));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i = this.f14099d;
        for (int i10 = 0; i10 < i; i10++) {
            if (this.f14098c[i10] == jLongValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.u4, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        a();
        g(i);
        long[] jArr = this.f14098c;
        long j10 = jArr[i];
        if (i < this.f14099d - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
        }
        this.f14099d--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i10) {
        a();
        if (i10 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f14098c;
        System.arraycopy(jArr, i10, jArr, i, this.f14099d - i10);
        this.f14099d -= i10 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        a();
        g(i);
        long[] jArr = this.f14098c;
        long j10 = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14099d;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        f(((Long) obj).longValue());
        return true;
    }
}
