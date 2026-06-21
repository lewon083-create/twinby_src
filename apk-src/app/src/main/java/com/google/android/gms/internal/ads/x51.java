package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class x51 extends d51 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object[] f12048j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final x51 f12049k;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient Object[] f12050e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f12051f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient Object[] f12052g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final transient int f12053h;
    public final transient int i;

    static {
        Object[] objArr = new Object[0];
        f12048j = objArr;
        f12049k = new x51(objArr, 0, objArr, 0, 0);
    }

    public x51(Object[] objArr, int i, Object[] objArr2, int i10, int i11) {
        this.f12050e = objArr;
        this.f12051f = i;
        this.f12052g = objArr2;
        this.f12053h = i10;
        this.i = i11;
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final d61 a() {
        return g().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final Object[] c() {
        return this.f12050e;
    }

    @Override // com.google.android.gms.internal.ads.t41, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f12052g;
            if (objArr.length != 0) {
                int iT = vv.t(obj);
                while (true) {
                    int i = iT & this.f12053h;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iT = i + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final int e() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final int f() {
        return this.i;
    }

    @Override // com.google.android.gms.internal.ads.d51, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f12051f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return g().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final boolean n() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final int o(Object[] objArr, int i) {
        Object[] objArr2 = this.f12050e;
        int i10 = this.i;
        System.arraycopy(objArr2, 0, objArr, i, i10);
        return i + i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.i;
    }

    @Override // com.google.android.gms.internal.ads.d51
    public final x41 u() {
        return x41.x(this.i, this.f12050e);
    }
}
