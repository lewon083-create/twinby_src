package yads;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class my2 extends ly2 implements SortedSet {
    public my2(SortedSet sortedSet, qg2 qg2Var) {
        super(sortedSet, qg2Var);
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f40710b).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f40710b.iterator();
        qg2 qg2Var = this.f40711c;
        it.getClass();
        qg2Var.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (qg2Var.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new my2(((SortedSet) this.f40710b).headSet(obj), this.f40711c);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSetHeadSet = (SortedSet) this.f40710b;
        while (true) {
            Object objLast = sortedSetHeadSet.last();
            if (this.f40711c.apply(objLast)) {
                return objLast;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new my2(((SortedSet) this.f40710b).subSet(obj, obj2), this.f40711c);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new my2(((SortedSet) this.f40710b).tailSet(obj), this.f40711c);
    }
}
