package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.Spliterators;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class u61 extends AbstractList implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f10849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10851d;

    public u61(int i, int i10, int[] iArr) {
        this.f10849b = iArr;
        this.f10850c = i;
        this.f10851d = i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.f10850c;
        while (true) {
            if (i >= this.f10851d) {
                i = -1;
                break;
            }
            if (this.f10849b[i] == iIntValue) {
                break;
            }
            i++;
        }
        return i != -1;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u61)) {
            return super.equals(obj);
        }
        u61 u61Var = (u61) obj;
        int i = u61Var.f10851d;
        int i10 = u61Var.f10850c;
        int i11 = i - i10;
        int i12 = this.f10851d;
        int i13 = this.f10850c;
        int i14 = i12 - i13;
        if (i11 != i14) {
            return false;
        }
        for (int i15 = 0; i15 < i14; i15++) {
            if (this.f10849b[i13 + i15] != u61Var.f10849b[i10 + i15]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        int i10 = this.f10851d;
        int i11 = this.f10850c;
        ix.n0(i, i10 - i11);
        return Integer.valueOf(this.f10849b[i11 + i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iHashCode = 1;
        for (int i = this.f10850c; i < this.f10851d; i++) {
            iHashCode = (iHashCode * 31) + Integer.hashCode(this.f10849b[i]);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            int i = this.f10850c;
            int i10 = i;
            while (true) {
                if (i10 >= this.f10851d) {
                    i10 = -1;
                    break;
                }
                if (this.f10849b[i10] == iIntValue) {
                    break;
                }
                i10++;
            }
            if (i10 >= 0) {
                return i10 - i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int i;
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            int i10 = this.f10851d - 1;
            while (true) {
                i = this.f10850c;
                if (i10 < i) {
                    i10 = -1;
                    break;
                }
                if (this.f10849b[i10] == iIntValue) {
                    break;
                }
                i10--;
            }
            if (i10 >= 0) {
                return i10 - i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int i10 = this.f10851d;
        int i11 = this.f10850c;
        Integer num = (Integer) obj;
        ix.n0(i, i10 - i11);
        int i12 = i11 + i;
        int[] iArr = this.f10849b;
        int i13 = iArr[i12];
        num.getClass();
        iArr[i12] = num.intValue();
        return Integer.valueOf(i13);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f10851d - this.f10850c;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return Spliterators.spliterator(this.f10849b, this.f10850c, this.f10851d, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i10) {
        int i11 = this.f10851d;
        int i12 = this.f10850c;
        ix.p0(i, i10, i11 - i12);
        return i == i10 ? Collections.EMPTY_LIST : new u61(i + i12, i12 + i10, this.f10849b);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        int i = this.f10851d;
        int i10 = this.f10850c;
        StringBuilder sb2 = new StringBuilder((i - i10) * 5);
        sb2.append('[');
        int[] iArr = this.f10849b;
        sb2.append(iArr[i10]);
        while (true) {
            i10++;
            if (i10 >= i) {
                sb2.append(']');
                return sb2.toString();
            }
            sb2.append(", ");
            sb2.append(iArr[i10]);
        }
    }
}
