package ad;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends q1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f862c;

    public r0(Object obj) {
        this.f861b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f862c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f862c) {
            throw new NoSuchElementException();
        }
        this.f862c = true;
        return this.f861b;
    }
}
