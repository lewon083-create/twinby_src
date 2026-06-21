package v7;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f34795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f34796c;

    public q(r rVar, String str) {
        this.f34795b = rVar;
        this.f34796c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f34795b.f34801d) {
            try {
                if (((q) this.f34795b.f34799b.remove(this.f34796c)) != null) {
                    p pVar = (p) this.f34795b.f34800c.remove(this.f34796c);
                    if (pVar != null) {
                        String str = this.f34796c;
                        l7.n.g().e(o7.e.f29794k, "Exceeded time limits on execution for " + str, new Throwable[0]);
                        ((o7.e) pVar).d();
                    }
                } else {
                    l7.n.g().e("WrkTimerRunnable", "Timer with " + this.f34796c + " is already marked as complete.", new Throwable[0]);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
