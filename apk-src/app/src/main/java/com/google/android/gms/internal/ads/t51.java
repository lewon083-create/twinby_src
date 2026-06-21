package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class t51 extends d51 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient w51 f10496e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient Object[] f10497f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient int f10498g;

    public t51(w51 w51Var, Object[] objArr, int i) {
        this.f10496e = w51Var;
        this.f10497f = objArr;
        this.f10498g = i;
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final d61 a() {
        return g().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.t41, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f10496e.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return g().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final boolean n() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final int o(Object[] objArr, int i) {
        return g().o(objArr, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f10498g;
    }

    @Override // com.google.android.gms.internal.ads.d51
    public final x41 u() {
        return new s51(this);
    }
}
