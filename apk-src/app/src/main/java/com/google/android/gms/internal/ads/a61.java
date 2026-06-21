package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class a61 extends AbstractCollection implements Set {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f2793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g31 f2794c;

    public a61(Set set, g31 g31Var) {
        this.f2793b = set;
        this.f2794c = g31Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        ix.o(this.f2794c.a(obj));
        return this.f2793b.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ix.o(this.f2794c.a(it.next()));
        }
        return this.f2793b.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Set set = this.f2793b;
        boolean z5 = set instanceof RandomAccess;
        g31 g31Var = this.f2794c;
        if (!z5 || !(set instanceof List)) {
            Iterator it = set.iterator();
            g31Var.getClass();
            while (it.hasNext()) {
                if (g31Var.a(it.next())) {
                    it.remove();
                }
            }
            return;
        }
        List list = (List) set;
        g31Var.getClass();
        int i = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            Object obj = list.get(i10);
            if (!g31Var.a(obj)) {
                if (i10 > i) {
                    try {
                        list.set(i, obj);
                    } catch (IllegalArgumentException unused) {
                        fs1.K(list, g31Var, i, i10);
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        fs1.K(list, g31Var, i, i10);
                        return;
                    }
                }
                i++;
            }
        }
        list.subList(i, list.size()).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        boolean zContains;
        Set set = this.f2793b;
        set.getClass();
        try {
            zContains = set.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            zContains = false;
        }
        if (zContains) {
            return this.f2794c.a(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return fs1.L(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return fs1.D(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        Iterator it = this.f2793b.iterator();
        g31 g31Var = this.f2794c;
        ix.m0(g31Var, "predicate");
        int i = 0;
        while (it.hasNext()) {
            if (g31Var.a(it.next())) {
                return i == -1;
            }
            i++;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Iterator it = this.f2793b.iterator();
        it.getClass();
        g31 g31Var = this.f2794c;
        g31Var.getClass();
        return new g51(it, g31Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return contains(obj) && this.f2793b.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f2793b.iterator();
        boolean z5 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f2794c.a(next) && collection.contains(next)) {
                it.remove();
                z5 = true;
            }
        }
        return z5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f2793b.iterator();
        boolean z5 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f2794c.a(next) && !collection.contains(next)) {
                it.remove();
                z5 = true;
            }
        }
        return z5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f2793b.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.f2794c.a(it.next())) {
                i++;
            }
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return ix.j((d61) iterator()).toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        return ix.j((d61) iterator()).toArray(objArr);
    }
}
