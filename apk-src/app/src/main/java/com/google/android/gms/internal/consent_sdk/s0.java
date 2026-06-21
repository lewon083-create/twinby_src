package com.google.android.gms.internal.consent_sdk;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 extends n0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object f13546d;

    public s0(Object obj) {
        this.f13546d = obj;
    }

    @Override // com.google.android.gms.internal.consent_sdk.j0
    public final int a(Object[] objArr) {
        objArr[0] = this.f13546d;
        return 1;
    }

    @Override // com.google.android.gms.internal.consent_sdk.j0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f13546d.equals(obj);
    }

    @Override // com.google.android.gms.internal.consent_sdk.n0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f13546d.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new o0(this.f13546d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return pe.a.f("[", this.f13546d.toString(), "]");
    }
}
