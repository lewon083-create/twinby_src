package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class v31 implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f11225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Collection f11226c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Iterator f11227d = i51.f6381b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m51 f11228e;

    public v31(m51 m51Var) {
        this.f11228e = m51Var;
        this.f11225b = m51Var.f7785e.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f11225b.hasNext() || this.f11227d.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f11227d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f11225b.next();
            entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f11226c = collection;
            this.f11227d = collection.iterator();
        }
        return this.f11227d.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f11227d.remove();
        Collection collection = this.f11226c;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f11225b.remove();
        }
        m51 m51Var = this.f11228e;
        m51Var.f7786f--;
    }
}
