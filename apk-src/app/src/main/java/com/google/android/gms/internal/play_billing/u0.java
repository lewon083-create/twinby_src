package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 extends h0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient w0 f14326d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient v0 f14327e;

    public u0(w0 w0Var, v0 v0Var) {
        this.f14326d = w0Var;
        this.f14327e = v0Var;
    }

    @Override // com.google.android.gms.internal.play_billing.x
    public final int a(Object[] objArr) {
        return this.f14327e.a(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f14326d.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.play_billing.h0, com.google.android.gms.internal.play_billing.x
    public final c0 f() {
        return this.f14327e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f14327e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f14326d.f14350g;
    }
}
