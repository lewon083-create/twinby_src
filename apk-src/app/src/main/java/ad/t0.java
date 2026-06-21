package ad;

import com.google.android.gms.internal.ads.c31;
import com.google.android.gms.internal.ads.k51;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 extends AbstractList implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f872b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f874d;

    public t0(List list, c31 c31Var) {
        list.getClass();
        this.f873c = list;
        this.f874d = c31Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        switch (this.f872b) {
            case 0:
                return ((zc.e) this.f874d).apply(this.f873c.get(i));
            default:
                return ((c31) this.f874d).apply(this.f873c.get(i));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        switch (this.f872b) {
        }
        return this.f873c.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        switch (this.f872b) {
        }
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.f872b) {
            case 0:
                return new s0(this, this.f873c.listIterator(i), 0);
            default:
                return new k51(this, this.f873c.listIterator(i), 0);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        switch (this.f872b) {
            case 0:
                return ((zc.e) this.f874d).apply(this.f873c.remove(i));
            default:
                return ((c31) this.f874d).apply(this.f873c.remove(i));
        }
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i10) {
        switch (this.f872b) {
            case 0:
                this.f873c.subList(i, i10).clear();
                break;
            default:
                this.f873c.subList(i, i10).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        switch (this.f872b) {
        }
        return this.f873c.size();
    }

    public t0(List list, zc.e eVar) {
        list.getClass();
        this.f873c = list;
        this.f874d = eVar;
    }
}
