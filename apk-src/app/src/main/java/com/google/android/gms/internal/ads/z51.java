package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class z51 extends AbstractSet {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set f12895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Set f12896c;

    public z51(Set set, Set set2) {
        this.f12895b = set;
        this.f12896c = set2;
    }

    public final int a() {
        Set set = this.f12895b;
        int iA = set instanceof z51 ? ((z51) set).a() : set.size();
        Set set2 = this.f12896c;
        return Math.min(iA, set2 instanceof z51 ? ((z51) set2).a() : set2.size());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f12895b.contains(obj) && this.f12896c.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f12895b.containsAll(collection) && this.f12896c.containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        int size;
        if (obj != this) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                boolean z5 = set instanceof z51;
                int iA = z5 ? ((z51) set).a() : set.size();
                if (iA >= 0) {
                    if (z5) {
                        size = 0;
                    } else {
                        size = set.size();
                    }
                    if (a() >= size) {
                        g51 g51Var = new g51(this, this.f12895b, this.f12896c);
                        int i = 0;
                        while (true) {
                            if (g51Var.hasNext()) {
                                try {
                                    if (!set.contains(g51Var.next())) {
                                        break;
                                    }
                                    i++;
                                } catch (ClassCastException | NullPointerException unused) {
                                }
                            } else if (i != iA) {
                                if (i >= size) {
                                    Iterator it = set.iterator();
                                    int i10 = 0;
                                    while (it.hasNext()) {
                                        it.next();
                                        i10++;
                                        if (i10 > i) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return Collections.disjoint(this.f12896c, this.f12895b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new g51(this, this.f12895b, this.f12896c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f12895b.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.f12896c.contains(it.next())) {
                i++;
            }
        }
        return i;
    }
}
