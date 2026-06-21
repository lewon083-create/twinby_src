package xc;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sb.g f36082b;

    public o() {
        this.f36082b = null;
    }

    public void a(Exception exc) {
        sb.g gVar = this.f36082b;
        if (gVar != null) {
            gVar.c(exc);
        }
    }

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (Exception e3) {
            a(e3);
        }
    }

    public o(sb.g gVar) {
        this.f36082b = gVar;
    }
}
