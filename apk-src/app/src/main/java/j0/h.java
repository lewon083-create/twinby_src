package j0;

import android.os.Process;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f26138c;

    public /* synthetic */ h(int i, Runnable runnable) {
        this.f26137b = i;
        this.f26138c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f26137b) {
            case 0:
                this.f26138c.run();
                break;
            case 1:
                this.f26138c.run();
                break;
            case 2:
                Process.setThreadPriority(0);
                this.f26138c.run();
                break;
            default:
                try {
                    this.f26138c.run();
                } catch (Exception e3) {
                    ya.e.g("Executor", "Background execution failure.", e3);
                    return;
                }
                break;
        }
    }

    public String toString() {
        switch (this.f26137b) {
            case 1:
                return this.f26138c.toString();
            default:
                return super.toString();
        }
    }
}
