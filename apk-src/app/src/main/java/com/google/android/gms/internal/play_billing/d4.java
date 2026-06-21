package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.ads.om1;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d4 extends r2 implements RandomAccess {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object[] f14160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d4 f14161f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f14162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14163d;

    static {
        Object[] objArr = new Object[0];
        f14160e = objArr;
        f14161f = new d4(objArr, 0, false);
    }

    public d4(Object[] objArr, int i, boolean z5) {
        super(z5);
        this.f14162c = objArr;
        this.f14163d = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i10;
        a();
        if (i < 0 || i > (i10 = this.f14163d)) {
            throw new IndexOutOfBoundsException(a0.u.j(i, this.f14163d, "Index:", ", Size:"));
        }
        int i11 = i + 1;
        Object[] objArr = this.f14162c;
        int length = objArr.length;
        if (i10 < length) {
            System.arraycopy(objArr, i, objArr, i11, i10 - i);
        } else {
            Object[] objArr2 = new Object[om1.g(length, 3, 2, 1, 10)];
            System.arraycopy(this.f14162c, 0, objArr2, 0, i);
            System.arraycopy(this.f14162c, i, objArr2, i11, this.f14163d - i);
            this.f14162c = objArr2;
        }
        this.f14162c[i] = obj;
        this.f14163d++;
        ((AbstractList) this).modCount++;
    }

    public final void c(int i) {
        if (i < 0 || i >= this.f14163d) {
            throw new IndexOutOfBoundsException(a0.u.j(i, this.f14163d, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.k3
    public final /* bridge */ /* synthetic */ k3 d(int i) {
        if (i >= this.f14163d) {
            return new d4(i == 0 ? f14160e : Arrays.copyOf(this.f14162c, i), this.f14163d, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        c(i);
        return this.f14162c[i];
    }

    @Override // com.google.android.gms.internal.play_billing.r2, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        c(i);
        Object[] objArr = this.f14162c;
        Object obj = objArr[i];
        if (i < this.f14163d - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.f14163d--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        a();
        c(i);
        Object[] objArr = this.f14162c;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14163d;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i = this.f14163d;
        int length = this.f14162c.length;
        if (i == length) {
            this.f14162c = Arrays.copyOf(this.f14162c, om1.g(length, 3, 2, 1, 10));
        }
        Object[] objArr = this.f14162c;
        int i10 = this.f14163d;
        this.f14163d = i10 + 1;
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
