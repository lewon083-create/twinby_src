package k6;

import android.database.Observable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends Observable {
    public final boolean a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    public final void b(int i, int i10) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((n0) ((Observable) this).mObservers.get(size)).d(i, i10);
        }
    }

    public final void c(int i, int i10, Object obj) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((n0) ((Observable) this).mObservers.get(size)).b(i, i10, obj);
        }
    }

    public final void d(int i, int i10) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((n0) ((Observable) this).mObservers.get(size)).c(i, i10);
        }
    }

    public final void e(int i, int i10) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((n0) ((Observable) this).mObservers.get(size)).e(i, i10);
        }
    }
}
