package ad;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k1 extends AbstractSet {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set f822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Set f823c;

    public k1(Set set, Set set2) {
        this.f822b = set;
        this.f823c = set2;
    }

    public static int e(Set set) {
        return set instanceof k1 ? ((k1) set).c() : set.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final q1 iterator() {
        return new p0(this.f822b, this.f823c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final int c() {
        return Math.min(e(this.f822b), e(this.f823c));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f822b.contains(obj) && this.f823c.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f822b.containsAll(collection) && this.f823c.containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        Set set;
        int iE;
        if (obj != this) {
            if ((obj instanceof Set) && f() <= (iE = e((set = (Set) obj)))) {
                int iF = set instanceof k1 ? ((k1) set).f() : set.size();
                if (c() >= iF) {
                    q1 it = iterator();
                    int i = 0;
                    while (true) {
                        p0 p0Var = (p0) it;
                        if (p0Var.hasNext()) {
                            try {
                                if (!set.contains(p0Var.next())) {
                                    break;
                                }
                                i++;
                            } catch (ClassCastException | NullPointerException unused) {
                            }
                        } else if (i != iE) {
                            if (i >= iF) {
                                Iterator it2 = set.iterator();
                                int i10 = 0;
                                while (it2.hasNext()) {
                                    it2.next();
                                    i10++;
                                    if (i10 > i) {
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

    public final int f() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return Collections.disjoint(this.f823c, this.f822b);
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
        Iterator it = this.f822b.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.f823c.contains(it.next())) {
                i++;
            }
        }
        return i;
    }
}
