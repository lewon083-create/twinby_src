package yads;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class g extends ma3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38583b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f38584c;

    public abstract Object a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f38583b;
        if (i == 4) {
            throw new IllegalStateException();
        }
        int iA = hg0.a(i);
        if (iA == 0) {
            return true;
        }
        if (iA != 2) {
            this.f38583b = 4;
            this.f38584c = a();
            if (this.f38583b != 3) {
                this.f38583b = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f38583b = 2;
        Object obj = this.f38584c;
        this.f38584c = null;
        return obj;
    }
}
