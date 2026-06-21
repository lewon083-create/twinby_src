package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {
    public static b0 a(long j10, Object obj) {
        b0 b0Var = (b0) p1.f1459c.h(j10, obj);
        if (((b) b0Var).f1361b) {
            return b0Var;
        }
        int size = b0Var.size();
        a1 a1VarE = ((a1) b0Var).e(size == 0 ? 10 : size * 2);
        p1.o(j10, obj, a1VarE);
        return a1VarE;
    }
}
