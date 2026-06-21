package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b61 extends a61 implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f2793b).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f2793b.iterator();
        it.getClass();
        g31 g31Var = this.f2794c;
        g31Var.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (g31Var.a(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new b61(((SortedSet) this.f2793b).headSet(obj), this.f2794c);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSetHeadSet = (SortedSet) this.f2793b;
        while (true) {
            Object objLast = sortedSetHeadSet.last();
            if (this.f2794c.a(objLast)) {
                return objLast;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new b61(((SortedSet) this.f2793b).subSet(obj, obj2), this.f2794c);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new b61(((SortedSet) this.f2793b).tailSet(obj), this.f2794c);
    }
}
