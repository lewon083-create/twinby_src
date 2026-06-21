package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class u51 extends d51 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient w51 f10842e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient v51 f10843f;

    public u51(w51 w51Var, v51 v51Var) {
        this.f10842e = w51Var;
        this.f10843f = v51Var;
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final d61 a() {
        return this.f10843f.listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.t41, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f10842e.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.ads.d51, com.google.android.gms.internal.ads.t41
    public final x41 g() {
        return this.f10843f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f10843f.listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final boolean n() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final int o(Object[] objArr, int i) {
        return this.f10843f.o(objArr, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f10842e.f11654g;
    }
}
