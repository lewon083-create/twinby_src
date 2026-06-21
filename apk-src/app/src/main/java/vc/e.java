package vc;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sb.g f34835b;

    public e() {
        this.f34835b = null;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e3) {
            sb.g gVar = this.f34835b;
            if (gVar != null) {
                gVar.c(e3);
            }
        }
    }

    public e(sb.g gVar) {
        this.f34835b = gVar;
    }
}
