package hk;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f20719a = new ThreadLocal();

    public static u0 a() {
        ThreadLocal threadLocal = f20719a;
        u0 u0Var = (u0) threadLocal.get();
        if (u0Var != null) {
            return u0Var;
        }
        g gVar = new g(Thread.currentThread());
        threadLocal.set(gVar);
        return gVar;
    }
}
