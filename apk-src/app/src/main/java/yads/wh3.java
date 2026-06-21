package yads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class wh3 implements Choreographer.FrameCallback, Handler.Callback {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final wh3 f44407f = new wh3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile long f44408b = -9223372036854775807L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f44409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Choreographer f44410d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f44411e;

    public wh3() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        handlerThread.start();
        Handler handlerA = lb3.a(handlerThread.getLooper(), (Handler.Callback) this);
        this.f44409c = handlerA;
        handlerA.sendEmptyMessage(0);
    }

    public static wh3 a() {
        return f44407f;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        this.f44408b = j10;
        Choreographer choreographer = this.f44410d;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            try {
                this.f44410d = Choreographer.getInstance();
            } catch (RuntimeException e3) {
                kh1.d("VideoFrameReleaseHelper", kh1.a("Vsync sampling disabled due to platform error", e3));
            }
            return true;
        }
        if (i == 1) {
            Choreographer choreographer = this.f44410d;
            if (choreographer != null) {
                int i10 = this.f44411e + 1;
                this.f44411e = i10;
                if (i10 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
            return true;
        }
        if (i != 2) {
            return false;
        }
        Choreographer choreographer2 = this.f44410d;
        if (choreographer2 != null) {
            int i11 = this.f44411e - 1;
            this.f44411e = i11;
            if (i11 == 0) {
                choreographer2.removeFrameCallback(this);
                this.f44408b = -9223372036854775807L;
            }
        }
        return true;
    }
}
