package yads;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class zd1 extends ma3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f45388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f45389c;

    public zd1(Object obj) {
        this.f45389c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f45388b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f45388b) {
            throw new NoSuchElementException();
        }
        this.f45388b = true;
        return this.f45389c;
    }
}
