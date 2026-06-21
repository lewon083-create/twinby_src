package com.google.android.gms.internal.play_billing;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 extends c0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t0 f14298d;

    public s0(t0 t0Var) {
        this.f14298d = t0Var;
    }

    @Override // com.google.android.gms.internal.play_billing.x
    public final boolean g() {
        return true;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        t0 t0Var = this.f14298d;
        d3.h(i, t0Var.f14308f);
        Object[] objArr = t0Var.f14307e;
        int i10 = i + i;
        Object obj = objArr[i10];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i10 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14298d.f14308f;
    }
}
