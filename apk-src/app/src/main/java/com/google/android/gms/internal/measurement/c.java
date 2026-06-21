package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Iterator f13678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Iterator f13679c;

    public c(d dVar, Iterator it, Iterator it2) {
        this.f13678b = it;
        this.f13679c = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f13678b.hasNext()) {
            return true;
        }
        return this.f13679c.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Iterator it = this.f13678b;
        if (it.hasNext()) {
            return new q(((Integer) it.next()).toString());
        }
        Iterator it2 = this.f13679c;
        if (it2.hasNext()) {
            return new q((String) it2.next());
        }
        throw new NoSuchElementException();
    }
}
