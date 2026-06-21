package o4;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Choreographer;
import android.view.Choreographer$VsyncCallback;
import com.google.android.gms.internal.ads.x0;
import io.appmetrica.analytics.impl.lp;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends x0 implements Choreographer$VsyncCallback {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Handler f29697g;

    public t(Choreographer choreographer, DisplayManager displayManager) {
        super(choreographer, displayManager, 1);
        this.f29697g = m3.z.o(null);
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final void e() {
        this.f11954d.registerDisplayListener(this, m3.z.o(null));
        this.f11953c.postVsyncCallback(this);
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final void f() {
        this.f11954d.unregisterDisplayListener(this);
        this.f29697g.removeCallbacksAndMessages(null);
        this.f11953c.removeVsyncCallback(this);
        this.f11955e = -9223372036854775807L;
        this.f11956f = -9223372036854775807L;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (i == 0) {
            this.f11953c.postVsyncCallback(this);
        }
    }

    public final void onVsync(Choreographer.FrameData frameData) {
        this.f11955e = frameData.getFrameTimeNanos();
        Choreographer.FrameTimeline[] frameTimelines = frameData.getFrameTimelines();
        if (frameTimelines.length >= 2) {
            long expectedPresentationTimeNanos = frameTimelines[1].getExpectedPresentationTimeNanos() - frameTimelines[0].getExpectedPresentationTimeNanos();
            this.f11956f = expectedPresentationTimeNanos != 0 ? expectedPresentationTimeNanos : -9223372036854775807L;
        } else {
            this.f11956f = -9223372036854775807L;
        }
        this.f29697g.postDelayed(new lp(17, this), 500L);
    }
}
