package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class x31 implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12004b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Iterator f12005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f12006d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f12007e;

    public x31(ad.d dVar) {
        Objects.requireNonNull(dVar);
        this.f12007e = dVar;
        this.f12005c = dVar.f777c.entrySet().iterator();
    }

    public void a() {
        ad.l lVar = (ad.l) this.f12007e;
        lVar.f();
        if (lVar.f826d != ((Collection) this.f12006d)) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f12004b) {
            case 0:
                break;
            case 1:
                break;
            default:
                a();
                break;
        }
        return this.f12005c.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f12004b) {
            case 0:
                Map.Entry entry = (Map.Entry) this.f12005c.next();
                this.f12006d = (Collection) entry.getValue();
                return ((ad.d) this.f12007e).b(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) this.f12005c.next();
                this.f12006d = entry2;
                return entry2.getKey();
            default:
                a();
                return this.f12005c.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f12004b) {
            case 0:
                ix.l0("no calls to next() since the last call to remove()", ((Collection) this.f12006d) != null);
                this.f12005c.remove();
                ((m51) ((ad.d) this.f12007e).f780f).f7786f -= ((Collection) this.f12006d).size();
                ((Collection) this.f12006d).clear();
                this.f12006d = null;
                break;
            case 1:
                ix.l0("no calls to next() since the last call to remove()", ((Map.Entry) this.f12006d) != null);
                Collection collection = (Collection) ((Map.Entry) this.f12006d).getValue();
                this.f12005c.remove();
                ((y31) this.f12007e).f12487d.f7786f -= collection.size();
                collection.clear();
                this.f12006d = null;
                break;
            default:
                this.f12005c.remove();
                ad.l lVar = (ad.l) this.f12007e;
                m51 m51Var = (m51) lVar.f829g;
                m51Var.f7786f--;
                lVar.j();
                break;
        }
    }

    public x31(ad.l lVar) {
        Iterator it;
        this.f12007e = lVar;
        Collection collection = lVar.f826d;
        this.f12006d = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f12005c = it;
    }

    public x31(y31 y31Var, Iterator it) {
        this.f12005c = it;
        this.f12007e = y31Var;
    }

    public x31(ad.l lVar, ListIterator listIterator) {
        this.f12007e = lVar;
        this.f12006d = lVar.f826d;
        this.f12005c = listIterator;
    }
}
