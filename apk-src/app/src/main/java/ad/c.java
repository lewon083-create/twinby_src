package ad;

import com.google.android.gms.internal.measurement.h5;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class c implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f771b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Iterator f772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f773d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f774e;

    public c(l lVar) {
        this.f774e = lVar;
        Collection collection = lVar.f826d;
        this.f773d = collection;
        this.f772c = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public void a() {
        l lVar = (l) this.f774e;
        lVar.c();
        if (lVar.f826d != ((Collection) this.f773d)) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f771b) {
            case 0:
                break;
            case 1:
                break;
            default:
                a();
                break;
        }
        return this.f772c.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f771b) {
            case 0:
                Map.Entry entry = (Map.Entry) this.f772c.next();
                this.f773d = (Collection) entry.getValue();
                return ((d) this.f774e).a(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) this.f772c.next();
                this.f773d = entry2;
                return entry2.getKey();
            default:
                a();
                return this.f772c.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f771b) {
            case 0:
                h5.q("no calls to next() since the last call to remove()", ((Collection) this.f773d) != null);
                this.f772c.remove();
                ((x0) ((d) this.f774e).f780f).f893f -= ((Collection) this.f773d).size();
                ((Collection) this.f773d).clear();
                this.f773d = null;
                break;
            case 1:
                h5.q("no calls to next() since the last call to remove()", ((Map.Entry) this.f773d) != null);
                Collection collection = (Collection) ((Map.Entry) this.f773d).getValue();
                this.f772c.remove();
                ((e) this.f774e).f785d.f893f -= collection.size();
                collection.clear();
                this.f773d = null;
                break;
            default:
                this.f772c.remove();
                l lVar = (l) this.f774e;
                x0 x0Var = (x0) lVar.f829g;
                x0Var.f893f--;
                lVar.e();
                break;
        }
    }

    public c(l lVar, ListIterator listIterator) {
        this.f774e = lVar;
        this.f773d = lVar.f826d;
        this.f772c = listIterator;
    }

    public c(e eVar, Iterator it) {
        this.f772c = it;
        this.f774e = eVar;
    }

    public c(d dVar) {
        this.f774e = dVar;
        this.f772c = dVar.f777c.entrySet().iterator();
    }
}
