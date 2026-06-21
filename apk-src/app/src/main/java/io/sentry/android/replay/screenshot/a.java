package io.sentry.android.replay.screenshot;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CanvasStrategy f25987c;

    public /* synthetic */ a(CanvasStrategy canvasStrategy, int i) {
        this.f25986b = i;
        this.f25987c = canvasStrategy;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f25986b) {
            case 0:
                CanvasStrategy.pictureRenderTask$lambda$3(this.f25987c);
                break;
            default:
                CanvasStrategy.close$lambda$6(this.f25987c);
                break;
        }
    }
}
