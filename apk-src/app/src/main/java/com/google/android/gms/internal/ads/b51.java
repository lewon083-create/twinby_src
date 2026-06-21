package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b51 extends t41 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient f51 f3629c;

    public b51(f51 f51Var) {
        this.f3629c = f51Var;
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final d61 a() {
        return new a51(this.f3629c);
    }

    @Override // com.google.android.gms.internal.ads.t41, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f3629c.c(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new a51(this.f3629c);
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final int o(Object[] objArr, int i) {
        v41 v41VarListIterator = ((x41) this.f3629c.f5243e.values()).listIterator(0);
        while (v41VarListIterator.hasNext()) {
            i = ((t41) v41VarListIterator.next()).o(objArr, i);
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f3629c.f5244f;
    }
}
