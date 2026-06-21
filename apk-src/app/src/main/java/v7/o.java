package v7;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f34794b;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f34793a) {
            case 0:
                Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
                threadNewThread.setName("WorkManager-WorkTimer-thread-" + this.f34794b);
                this.f34794b = this.f34794b + 1;
                return threadNewThread;
            default:
                Thread thread = new Thread(runnable);
                StringBuilder sb2 = new StringBuilder("flutter-worker-");
                int i = this.f34794b;
                this.f34794b = i + 1;
                sb2.append(i);
                thread.setName(sb2.toString());
                return thread;
        }
    }
}
