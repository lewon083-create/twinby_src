package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f14741b;

    public b(ClockFaceView clockFaceView) {
        this.f14741b = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f14741b;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f14720u.f14729e) - clockFaceView.C;
        if (height != clockFaceView.f14744s) {
            clockFaceView.f14744s = height;
            clockFaceView.m();
            ClockHandView clockHandView = clockFaceView.f14720u;
            clockHandView.f14736m = clockFaceView.f14744s;
            clockHandView.invalidate();
        }
        return true;
    }
}
