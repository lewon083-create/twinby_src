package yads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class w implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f44240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Collection f44241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x f44242d;

    public w(x xVar) {
        this.f44242d = xVar;
        Collection collection = xVar.f44550c;
        this.f44241c = collection;
        this.f44240b = a0.a(collection);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        this.f44242d.c();
        if (this.f44242d.f44550c == this.f44241c) {
            return this.f44240b.hasNext();
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.f44242d.c();
        if (this.f44242d.f44550c == this.f44241c) {
            return this.f44240b.next();
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f44240b.remove();
        x xVar = this.f44242d;
        a0 a0Var = xVar.f44553f;
        a0Var.f36594g--;
        xVar.d();
    }

    public w(x xVar, ListIterator listIterator) {
        this.f44242d = xVar;
        this.f44241c = xVar.f44550c;
        this.f44240b = listIterator;
    }
}
