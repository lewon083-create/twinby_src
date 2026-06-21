package ad;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m1 extends l1 implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f834b).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f834b.iterator();
        it.getClass();
        zc.g gVar = this.f835c;
        gVar.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (gVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new m1(((SortedSet) this.f834b).headSet(obj), this.f835c);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSetHeadSet = (SortedSet) this.f834b;
        while (true) {
            Object objLast = sortedSetHeadSet.last();
            if (this.f835c.apply(objLast)) {
                return objLast;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new m1(((SortedSet) this.f834b).subSet(obj, obj2), this.f835c);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new m1(((SortedSet) this.f834b).tailSet(obj), this.f835c);
    }
}
