package yads;

import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public interface tk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rk0 f43347a = new rk0();

    int a(nx0 nx0Var);

    default sk0 a(pk0 pk0Var, nx0 nx0Var) {
        return sk0.f42957a;
    }

    void a(Looper looper, af2 af2Var);

    nk0 b(pk0 pk0Var, nx0 nx0Var);

    default void prepare() {
    }

    default void release() {
    }
}
