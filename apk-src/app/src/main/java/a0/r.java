package a0;

import android.os.Process;
import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f218b;

    public r(int i) {
        this.f217a = i;
        switch (i) {
            case 1:
                this.f218b = new AtomicInteger(0);
                break;
            case 2:
                this.f218b = new AtomicInteger(0);
                break;
            case 3:
                this.f218b = new AtomicInteger(0);
                break;
            default:
                this.f218b = new AtomicInteger(0);
                break;
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(final Runnable runnable) {
        switch (this.f217a) {
            case 0:
                final int i = 0;
                Thread thread = new Thread(new Runnable() { // from class: a0.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i) {
                            case 0:
                                Process.setThreadPriority(-3);
                                runnable.run();
                                break;
                            default:
                                Process.setThreadPriority(-16);
                                runnable.run();
                                break;
                        }
                    }
                });
                thread.setPriority(7);
                Locale locale = Locale.US;
                thread.setName("CameraX-core_camera_" + this.f218b.getAndIncrement());
                return thread;
            case 1:
                final int i10 = 1;
                Thread thread2 = new Thread(new Runnable() { // from class: a0.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                Process.setThreadPriority(-3);
                                runnable.run();
                                break;
                            default:
                                Process.setThreadPriority(-16);
                                runnable.run();
                                break;
                        }
                    }
                });
                Locale locale2 = Locale.US;
                thread2.setName("CameraX-camerax_audio_" + this.f218b.getAndIncrement());
                return thread2;
            case 2:
                Thread thread3 = new Thread(runnable);
                Locale locale3 = Locale.US;
                thread3.setName("CameraX-camerax_io_" + this.f218b.getAndIncrement());
                return thread3;
            default:
                Thread thread4 = new Thread(runnable);
                thread4.setName("arch_disk_io_" + this.f218b.getAndIncrement());
                return thread4;
        }
    }
}
