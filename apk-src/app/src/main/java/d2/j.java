package d2;

import android.os.Process;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends Thread {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15554b;

    public j(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f15554b = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f15554b);
        super.run();
    }
}
