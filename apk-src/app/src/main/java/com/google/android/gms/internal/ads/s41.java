package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f10174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f10176c;

    public s41(int i) {
        fs1.y(i, "initialCapacity");
        this.f10174a = new Object[i];
        this.f10175b = 0;
    }

    public static int d(int i, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
        }
        if (i10 <= i) {
            return i;
        }
        int i11 = i + (i >> 1) + 1;
        if (i11 < i10) {
            int iHighestOneBit = Integer.highestOneBit(i10 - 1);
            i11 = iHighestOneBit + iHighestOneBit;
        }
        if (i11 < 0) {
            return Integer.MAX_VALUE;
        }
        return i11;
    }

    public final void a(Object obj) {
        obj.getClass();
        e(1);
        Object[] objArr = this.f10174a;
        int i = this.f10175b;
        this.f10175b = i + 1;
        objArr[i] = obj;
    }

    public final void b(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            e(collection.size());
            if (collection instanceof t41) {
                this.f10175b = ((t41) collection).o(this.f10174a, this.f10175b);
                return;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            c(it.next());
        }
    }

    public abstract s41 c(Object obj);

    public final void e(int i) {
        int length = this.f10174a.length;
        int iD = d(length, this.f10175b + i);
        if (iD > length || this.f10176c) {
            this.f10174a = Arrays.copyOf(this.f10174a, iD);
            this.f10176c = false;
        }
    }
}
