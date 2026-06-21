package o4;

import android.view.Choreographer;
import android.view.Display;
import com.google.android.gms.internal.ads.x0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends x0 implements Choreographer.FrameCallback {
    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        this.f11955e = j10;
        this.f11953c.postFrameCallbackDelayed(this, 500L);
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final void e() {
        long refreshRate;
        this.f11954d.registerDisplayListener(this, m3.z.o(null));
        this.f11953c.postFrameCallback(this);
        Display display = this.f11954d.getDisplay(0);
        if (display != null) {
            refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
        } else {
            m3.b.s("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            refreshRate = -9223372036854775807L;
        }
        this.f11956f = refreshRate;
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final void f() {
        this.f11954d.unregisterDisplayListener(this);
        this.f11953c.removeFrameCallback(this);
        this.f11955e = -9223372036854775807L;
        this.f11956f = -9223372036854775807L;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        long refreshRate;
        if (i == 0) {
            this.f11953c.postFrameCallback(this);
            Display display = this.f11954d.getDisplay(0);
            if (display != null) {
                refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            } else {
                m3.b.s("VideoFrameReleaseHelper", "Unable to query display refresh rate");
                refreshRate = -9223372036854775807L;
            }
            this.f11956f = refreshRate;
        }
    }
}
