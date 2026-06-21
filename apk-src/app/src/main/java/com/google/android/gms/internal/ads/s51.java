package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class s51 extends x41 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t51 f10180d;

    public s51(t51 t51Var) {
        this.f10180d = t51Var;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        t51 t51Var = this.f10180d;
        ix.n0(i, t51Var.f10498g);
        Object[] objArr = t51Var.f10497f;
        int i10 = i + i;
        Object obj = objArr[i10];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i10 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final boolean n() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f10180d.f10498g;
    }
}
