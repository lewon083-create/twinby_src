package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class z41 extends d61 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v41 f12889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f12890d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d61 f12891e;

    public z41(f51 f51Var) {
        super(0);
        Objects.requireNonNull(f51Var);
        this.f12889c = f51Var.f5243e.entrySet().g().listIterator(0);
        this.f12890d = null;
        this.f12891e = h51.f6031f;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12891e.hasNext() || this.f12889c.hasNext();
    }

    @Override // com.google.android.gms.internal.ads.d61, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (!this.f12891e.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f12889c.next();
            this.f12890d = entry.getKey();
            this.f12891e = ((t41) entry.getValue()).a();
        }
        Object obj = this.f12890d;
        Objects.requireNonNull(obj);
        return new AbstractMap.SimpleImmutableEntry(obj, this.f12891e.next());
    }
}
