package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.ads.om1;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h3 extends r2 implements RandomAccess, j3, b4 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f14204e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h3 f14205f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f14206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14207d;

    static {
        int[] iArr = new int[0];
        f14204e = iArr;
        f14205f = new h3(iArr, 0, false);
    }

    public h3(int[] iArr, int i, boolean z5) {
        super(z5);
        this.f14206c = iArr;
        this.f14207d = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i10;
        int iIntValue = ((Integer) obj).intValue();
        a();
        if (i < 0 || i > (i10 = this.f14207d)) {
            throw new IndexOutOfBoundsException(a0.u.j(i, this.f14207d, "Index:", ", Size:"));
        }
        int i11 = i + 1;
        int[] iArr = this.f14206c;
        int length = iArr.length;
        if (i10 < length) {
            System.arraycopy(iArr, i, iArr, i11, i10 - i);
        } else {
            int[] iArr2 = new int[om1.g(length, 3, 2, 1, 10)];
            System.arraycopy(this.f14206c, 0, iArr2, 0, i);
            System.arraycopy(this.f14206c, i, iArr2, i11, this.f14207d - i);
            this.f14206c = iArr2;
        }
        this.f14206c[i] = iIntValue;
        this.f14207d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.r2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = l3.f14238a;
        collection.getClass();
        if (!(collection instanceof h3)) {
            return super.addAll(collection);
        }
        h3 h3Var = (h3) collection;
        int i = h3Var.f14207d;
        if (i == 0) {
            return false;
        }
        int i10 = this.f14207d;
        if (Integer.MAX_VALUE - i10 < i) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i;
        int[] iArr = this.f14206c;
        if (i11 > iArr.length) {
            this.f14206c = Arrays.copyOf(iArr, i11);
        }
        System.arraycopy(h3Var.f14206c, 0, this.f14206c, this.f14207d, h3Var.f14207d);
        this.f14207d = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final int c(int i) {
        f(i);
        return this.f14206c[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.play_billing.k3
    public final /* bridge */ /* synthetic */ k3 d(int i) {
        if (i >= this.f14207d) {
            return new h3(i == 0 ? f14204e : Arrays.copyOf(this.f14206c, i), this.f14207d, true);
        }
        throw new IllegalArgumentException();
    }

    public final void e(int i) {
        a();
        int i10 = this.f14207d;
        int length = this.f14206c.length;
        if (i10 == length) {
            int[] iArr = new int[om1.g(length, 3, 2, 1, 10)];
            System.arraycopy(this.f14206c, 0, iArr, 0, this.f14207d);
            this.f14206c = iArr;
        }
        int[] iArr2 = this.f14206c;
        int i11 = this.f14207d;
        this.f14207d = i11 + 1;
        iArr2[i11] = i;
    }

    @Override // com.google.android.gms.internal.play_billing.r2, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h3)) {
            return super.equals(obj);
        }
        h3 h3Var = (h3) obj;
        if (this.f14207d != h3Var.f14207d) {
            return false;
        }
        int[] iArr = h3Var.f14206c;
        for (int i = 0; i < this.f14207d; i++) {
            if (this.f14206c[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final void f(int i) {
        if (i < 0 || i >= this.f14207d) {
            throw new IndexOutOfBoundsException(a0.u.j(i, this.f14207d, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        f(i);
        return Integer.valueOf(this.f14206c[i]);
    }

    @Override // com.google.android.gms.internal.play_billing.r2, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i10 = 0; i10 < this.f14207d; i10++) {
            i = (i * 31) + this.f14206c[i10];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.f14207d;
        for (int i10 = 0; i10 < i; i10++) {
            if (this.f14206c[i10] == iIntValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.r2, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        a();
        f(i);
        int[] iArr = this.f14206c;
        int i10 = iArr[i];
        if (i < this.f14207d - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.f14207d--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i10) {
        a();
        if (i10 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f14206c;
        System.arraycopy(iArr, i10, iArr, i, this.f14207d - i10);
        this.f14207d -= i10 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        a();
        f(i);
        int[] iArr = this.f14206c;
        int i10 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14207d;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Integer) obj).intValue());
        return true;
    }
}
