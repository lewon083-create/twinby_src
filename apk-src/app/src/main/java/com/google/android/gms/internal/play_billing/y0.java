package com.google.android.gms.internal.play_billing;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 extends i0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final y0 f14370g;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient c0 f14371f;

    static {
        z zVar = c0.f14146c;
        f14370g = new y0(r0.f14290f, n0.f14245c);
    }

    public y0(c0 c0Var, Comparator comparator) {
        super(comparator);
        this.f14371f = c0Var;
    }

    @Override // com.google.android.gms.internal.play_billing.x
    public final int a(Object[] objArr) {
        return this.f14371f.a(objArr);
    }

    @Override // com.google.android.gms.internal.play_billing.x
    public final int c() {
        return this.f14371f.c();
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int iT = t(obj, true);
        c0 c0Var = this.f14371f;
        if (iT == c0Var.size()) {
            return null;
        }
        return c0Var.get(iT);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.f14371f, obj, this.f14214d) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof m0) {
            collection = ((m0) collection).h();
        }
        Comparator comparator = this.f14214d;
        if (!d3.k(comparator, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        z zVarListIterator = this.f14371f.listIterator(0);
        Iterator it = collection.iterator();
        if (zVarListIterator.hasNext()) {
            Object next = it.next();
            Object next2 = zVarListIterator.next();
            while (true) {
                try {
                    int iCompare = comparator.compare(next2, next);
                    if (iCompare >= 0) {
                        if (iCompare != 0) {
                            break;
                        }
                        if (!it.hasNext()) {
                            return true;
                        }
                        next = it.next();
                    } else {
                        if (!zVarListIterator.hasNext()) {
                            break;
                        }
                        next2 = zVarListIterator.next();
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
        }
        return false;
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return this.f14371f.o().listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.x
    public final int e() {
        return this.f14371f.e();
    }

    @Override // com.google.android.gms.internal.play_billing.h0, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            c0 c0Var = this.f14371f;
            if (c0Var.size() == set.size()) {
                if (isEmpty()) {
                    return true;
                }
                Comparator comparator = this.f14214d;
                if (!d3.k(comparator, set)) {
                    return containsAll(set);
                }
                Iterator it = set.iterator();
                try {
                    z zVarListIterator = c0Var.listIterator(0);
                    while (zVarListIterator.hasNext()) {
                        Object next = zVarListIterator.next();
                        Object next2 = it.next();
                        if (next2 == null || comparator.compare(next, next2) != 0) {
                        }
                    }
                    return true;
                } catch (ClassCastException | NoSuchElementException unused) {
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.h0, com.google.android.gms.internal.play_billing.x
    public final c0 f() {
        return this.f14371f;
    }

    @Override // com.google.android.gms.internal.play_billing.i0, java.util.SortedSet
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f14371f.get(0);
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        int iR = r(obj, true) - 1;
        if (iR == -1) {
            return null;
        }
        return this.f14371f.get(iR);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        int iT = t(obj, false);
        c0 c0Var = this.f14371f;
        if (iT == c0Var.size()) {
            return null;
        }
        return c0Var.get(iT);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final /* synthetic */ Iterator iterator() {
        return this.f14371f.listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.i0, java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f14371f.get(r0.size() - 1);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        int iR = r(obj, false) - 1;
        if (iR == -1) {
            return null;
        }
        return this.f14371f.get(iR);
    }

    @Override // com.google.android.gms.internal.play_billing.x
    public final Object[] n() {
        return this.f14371f.n();
    }

    public final int r(Object obj, boolean z5) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.f14371f, obj, this.f14214d);
        return iBinarySearch >= 0 ? z5 ? iBinarySearch + 1 : iBinarySearch : ~iBinarySearch;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f14371f.size();
    }

    public final int t(Object obj, boolean z5) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.f14371f, obj, this.f14214d);
        return iBinarySearch >= 0 ? z5 ? iBinarySearch : iBinarySearch + 1 : ~iBinarySearch;
    }

    public final y0 u(int i, int i10) {
        c0 c0Var = this.f14371f;
        if (i == 0) {
            if (i10 == c0Var.size()) {
                return this;
            }
            i = 0;
        }
        Comparator comparator = this.f14214d;
        if (i < i10) {
            return new y0(c0Var.subList(i, i10), comparator);
        }
        if (n0.f14245c.equals(comparator)) {
            return f14370g;
        }
        z zVar = c0.f14146c;
        return new y0(r0.f14290f, comparator);
    }
}
