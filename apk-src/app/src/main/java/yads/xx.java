package yads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class xx implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f44830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f44831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f44832d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cy f44833e;

    public xx(cy cyVar) {
        this.f44833e = cyVar;
        this.f44830b = cyVar.f37552f;
        this.f44831c = cyVar.b();
    }

    public abstract Object a(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f44831c >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f44833e.f37552f != this.f44830b) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f44831c;
        this.f44832d = i;
        Object objA = a(i);
        cy cyVar = this.f44833e;
        int i10 = this.f44831c + 1;
        if (i10 >= cyVar.f37553g) {
            i10 = -1;
        }
        this.f44831c = i10;
        return objA;
    }

    @Override // java.util.Iterator
    public final void remove() {
        cy cyVar = this.f44833e;
        int i = cyVar.f37552f;
        int i10 = this.f44830b;
        if (i != i10) {
            throw new ConcurrentModificationException();
        }
        int i11 = this.f44832d;
        if (!(i11 >= 0)) {
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
        this.f44830b = i10 + 32;
        cyVar.remove(cyVar.b(i11));
        cy cyVar2 = this.f44833e;
        int i12 = this.f44831c;
        cyVar2.getClass();
        this.f44831c = i12 - 1;
        this.f44832d = -1;
    }
}
