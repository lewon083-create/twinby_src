package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class vy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f44222a;

    public vy() {
        this(0);
    }

    public final synchronized void a() {
        while (!this.f44222a) {
            wait();
        }
    }

    public final synchronized void b() {
        boolean z5 = false;
        while (!this.f44222a) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z5 = true;
            }
        }
        if (z5) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean c() {
        return this.f44222a;
    }

    public final synchronized boolean d() {
        if (this.f44222a) {
            return false;
        }
        this.f44222a = true;
        notifyAll();
        return true;
    }

    public vy(int i) {
    }
}
