package n5;

import ad.g0;
import ad.j0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public interface m {
    default e i(byte[] bArr, int i, int i10) {
        g0 g0VarQ = j0.q();
        p(bArr, 0, i10, l.f29124c, new he.e(20, g0VarQ));
        return new c(g0VarQ.g());
    }

    void p(byte[] bArr, int i, int i10, l lVar, m3.g gVar);

    int s();

    default void reset() {
    }
}
