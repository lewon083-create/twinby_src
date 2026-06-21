package e1;

import android.util.Range;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public interface h0 {
    default boolean a(int i, int i10) {
        if (n(i, i10)) {
            return true;
        }
        return f() && n(i10, i);
    }

    int c();

    Range d();

    boolean f();

    Range h(int i);

    Range k(int i);

    int l();

    Range m();

    boolean n(int i, int i10);

    Range p();
}
