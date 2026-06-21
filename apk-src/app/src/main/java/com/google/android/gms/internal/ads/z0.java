package com.google.android.gms.internal.ads;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Choreographer;
import android.view.Choreographer$VsyncCallback;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 extends x0 implements Choreographer$VsyncCallback {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Handler f12807g;

    public /* synthetic */ z0(Choreographer choreographer, DisplayManager displayManager) {
        super(choreographer, displayManager, 0);
        this.f12807g = cq0.n();
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final void g() {
        this.f11954d.registerDisplayListener(this, cq0.n());
        this.f11953c.postVsyncCallback(this);
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final void h() {
        this.f11954d.unregisterDisplayListener(this);
        this.f12807g.removeCallbacksAndMessages(null);
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
        this.f12807g.postDelayed(new s(3, this), 500L);
    }
}
