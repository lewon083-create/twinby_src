package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class tw3 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yw3 f43459b;

    public tw3(yw3 yw3Var) {
        this.f43459b = yw3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f10;
        yw3 yw3Var = this.f43459b;
        int streamVolume = yw3Var.f45180c.getStreamVolume(3);
        int streamMaxVolume = yw3Var.f45180c.getStreamMaxVolume(3);
        yw3Var.f45181d.getClass();
        if (streamMaxVolume <= 0 || streamVolume <= 0) {
            f10 = 0.0f;
        } else {
            f10 = streamVolume / streamMaxVolume;
            if (f10 > 1.0f) {
                f10 = 1.0f;
            }
        }
        this.f43459b.f45184g.set(false);
        if (((Float) this.f43459b.f45183f.getAndSet(Float.valueOf(f10))).floatValue() != f10) {
            this.f43459b.f45178a.post(new rw3(this, f10));
        }
    }
}
