package yads;

import android.media.AudioTrack;
import android.os.Handler;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class yb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f44992a = new Handler();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xb0 f44993b = new xb0(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zb0 f44994c;

    public yb0(zb0 zb0Var) {
        this.f44994c = zb0Var;
    }

    public final void a(AudioTrack audioTrack) {
        Handler handler = this.f44992a;
        Objects.requireNonNull(handler);
        audioTrack.registerStreamEventCallback(new s3.x(1, handler), this.f44993b);
    }

    public final void b(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.f44993b);
        this.f44992a.removeCallbacksAndMessages(null);
    }
}
