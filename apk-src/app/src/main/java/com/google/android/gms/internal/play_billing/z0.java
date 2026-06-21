package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 extends h0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object f14385d;

    public z0(Object obj) {
        this.f14385d = obj;
    }

    @Override // com.google.android.gms.internal.play_billing.x
    public final int a(Object[] objArr) {
        objArr[0] = this.f14385d;
        return 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f14385d.equals(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.h0, com.google.android.gms.internal.play_billing.x
    public final c0 f() {
        Object[] objArr = {this.f14385d};
        for (int i = 0; i < 1; i++) {
            z zVar = c0.f14146c;
            if (objArr[i] == null) {
                throw new NullPointerException(l7.o.i(i, "at index "));
            }
        }
        return c0.q(1, objArr);
    }

    @Override // com.google.android.gms.internal.play_billing.h0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f14385d.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new k0(this.f14385d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return pe.a.f("[", this.f14385d.toString(), "]");
    }
}
