package yads;

import android.os.ConditionVariable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class xy2 extends Thread {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConditionVariable f44847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yy2 f44848c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xy2(yy2 yy2Var, ConditionVariable conditionVariable) {
        super("ExoPlayer:SimpleCacheInit");
        this.f44848c = yy2Var;
        this.f44847b = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        synchronized (this.f44848c) {
            this.f44847b.open();
            this.f44848c.b();
            this.f44848c.f45198b.getClass();
        }
    }
}
