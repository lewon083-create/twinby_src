package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 extends h0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient w0 f14306d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient Object[] f14307e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f14308f;

    public t0(w0 w0Var, Object[] objArr, int i) {
        this.f14306d = w0Var;
        this.f14307e = objArr;
        this.f14308f = i;
    }

    @Override // com.google.android.gms.internal.play_billing.x
    public final int a(Object[] objArr) {
        return f().a(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f14306d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return f().listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.h0
    public final c0 p() {
        return new s0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f14308f;
    }
}
