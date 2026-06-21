package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ho1 extends qm1 implements RandomAccess, yn1, ro1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long[] f6206e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ho1 f6207f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long[] f6208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6209d;

    static {
        long[] jArr = new long[0];
        f6206e = jArr;
        f6207f = new ho1(jArr, 0, false);
    }

    public ho1(long[] jArr, int i, boolean z5) {
        super(z5);
        this.f6208c = jArr;
        this.f6209d = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i10;
        long jLongValue = ((Long) obj).longValue();
        a();
        if (i < 0 || i > (i10 = this.f6209d)) {
            throw new IndexOutOfBoundsException(n(i));
        }
        int i11 = i + 1;
        long[] jArr = this.f6208c;
        int length = jArr.length;
        if (i10 < length) {
            System.arraycopy(jArr, i, jArr, i11, i10 - i);
        } else {
            long[] jArr2 = new long[om1.g(length, 3, 2, 1, 10)];
            System.arraycopy(this.f6208c, 0, jArr2, 0, i);
            System.arraycopy(this.f6208c, i, jArr2, i11, this.f6209d - i);
            this.f6208c = jArr2;
        }
        this.f6208c[i] = jLongValue;
        this.f6209d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.qm1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = ao1.f3341a;
        collection.getClass();
        if (!(collection instanceof ho1)) {
            return super.addAll(collection);
        }
        ho1 ho1Var = (ho1) collection;
        int i = ho1Var.f6209d;
        if (i == 0) {
            return false;
        }
        int i10 = this.f6209d;
        if (Integer.MAX_VALUE - i10 < i) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i;
        long[] jArr = this.f6208c;
        if (i11 > jArr.length) {
            this.f6208c = Arrays.copyOf(jArr, i11);
        }
        System.arraycopy(ho1Var.f6208c, 0, this.f6208c, this.f6209d, ho1Var.f6209d);
        this.f6209d = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final long c(int i) {
        g(i);
        return this.f6208c[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(long j10) {
        a();
        int i = this.f6209d;
        int length = this.f6208c.length;
        if (i == length) {
            long[] jArr = new long[om1.g(length, 3, 2, 1, 10)];
            System.arraycopy(this.f6208c, 0, jArr, 0, this.f6209d);
            this.f6208c = jArr;
        }
        long[] jArr2 = this.f6208c;
        int i10 = this.f6209d;
        this.f6209d = i10 + 1;
        jArr2[i10] = j10;
    }

    @Override // com.google.android.gms.internal.ads.qm1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ho1)) {
            return super.equals(obj);
        }
        ho1 ho1Var = (ho1) obj;
        if (this.f6209d != ho1Var.f6209d) {
            return false;
        }
        long[] jArr = ho1Var.f6208c;
        for (int i = 0; i < this.f6209d; i++) {
            if (this.f6208c[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zn1
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final ho1 b(int i) {
        if (i >= this.f6209d) {
            return new ho1(i == 0 ? f6206e : Arrays.copyOf(this.f6208c, i), this.f6209d, true);
        }
        throw new IllegalArgumentException();
    }

    public final void g(int i) {
        if (i < 0 || i >= this.f6209d) {
            throw new IndexOutOfBoundsException(n(i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        g(i);
        return Long.valueOf(this.f6208c[i]);
    }

    @Override // com.google.android.gms.internal.ads.qm1, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i10 = 0; i10 < this.f6209d; i10++) {
            long j10 = this.f6208c[i10];
            Charset charset = ao1.f3341a;
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
        int i = this.f6209d;
        for (int i10 = 0; i10 < i; i10++) {
            if (this.f6208c[i10] == jLongValue) {
                return i10;
            }
        }
        return -1;
    }

    public final String n(int i) {
        int i10 = this.f6209d;
        return pe.a.g(new StringBuilder(String.valueOf(i).length() + 13 + String.valueOf(i10).length()), i, "Index:", i10, ", Size:");
    }

    @Override // com.google.android.gms.internal.ads.qm1, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        a();
        g(i);
        long[] jArr = this.f6208c;
        long j10 = jArr[i];
        if (i < this.f6209d - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
        }
        this.f6209d--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i10) {
        a();
        if (i10 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f6208c;
        System.arraycopy(jArr, i10, jArr, i, this.f6209d - i10);
        this.f6209d -= i10 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        a();
        g(i);
        long[] jArr = this.f6208c;
        long j10 = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6209d;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Long) obj).longValue());
        return true;
    }
}
