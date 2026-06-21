package ok;

import a0.u;
import hk.c0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class j extends i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Runnable f30729d;

    public j(Runnable runnable, long j10, boolean z5) {
        super(j10, z5);
        this.f30729d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f30729d.run();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Task[");
        Runnable runnable = this.f30729d;
        sb2.append(runnable.getClass().getSimpleName());
        sb2.append('@');
        sb2.append(c0.h(runnable));
        sb2.append(", ");
        sb2.append(this.f30727b);
        sb2.append(", ");
        return u.n(sb2, this.f30728c ? "Blocking" : "Non-blocking", ']');
    }
}
