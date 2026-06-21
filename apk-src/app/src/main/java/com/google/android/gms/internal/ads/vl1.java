package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class vl1 extends wl1 implements Iterable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f11418b = new ArrayList();

    @Override // com.google.android.gms.internal.ads.wl1
    public final String a() {
        ArrayList arrayList = this.f11418b;
        int size = arrayList.size();
        if (size == 1) {
            return ((wl1) arrayList.get(0)).a();
        }
        throw new IllegalStateException(l7.o.j(size, "Array must have size 1, but has size ", new StringBuilder(String.valueOf(size).length() + 37)));
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof vl1) && ((vl1) obj).f11418b.equals(this.f11418b);
        }
        return true;
    }

    public final int hashCode() {
        return this.f11418b.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f11418b.iterator();
    }
}
