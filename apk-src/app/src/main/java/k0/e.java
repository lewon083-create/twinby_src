package k0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j1.h f26766c;

    public /* synthetic */ e(int i, j1.h hVar) {
        this.f26765b = i;
        this.f26766c = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f26765b) {
            case 0:
                this.f26766c.b(null);
                break;
            default:
                this.f26766c.d(new Exception("Failed to snapshot: OpenGLRenderer not ready."));
                break;
        }
    }
}
