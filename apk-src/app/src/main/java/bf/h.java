package bf;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public interface h {
    default void a(e eVar, Runnable runnable) {
        b(new f(eVar == null ? null : new v7.f(6, eVar), runnable));
    }

    void b(f fVar);

    void c();

    void start();
}
