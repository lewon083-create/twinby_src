package b4;

import android.os.HandlerThread;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements zc.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1864c;

    public /* synthetic */ c(int i, int i10) {
        this.f1863b = i10;
        this.f1864c = i;
    }

    @Override // zc.p
    public final Object get() {
        switch (this.f1863b) {
            case 0:
                return new HandlerThread(d.N(this.f1864c, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(d.N(this.f1864c, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
