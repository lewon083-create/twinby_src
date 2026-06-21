package md;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public interface c {
    default Object a(Class cls) {
        return b(q.a(cls));
    }

    default Object b(q qVar) {
        yd.a aVarF = f(qVar);
        if (aVarF == null) {
            return null;
        }
        return aVarF.get();
    }

    yd.a c(q qVar);

    default yd.a d(Class cls) {
        return f(q.a(cls));
    }

    default Set e(q qVar) {
        return (Set) c(qVar).get();
    }

    yd.a f(q qVar);
}
