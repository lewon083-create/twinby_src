package com.google.android.gms.internal.ads;

import android.hardware.display.DisplayManager;
import android.view.Choreographer;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x0 implements DisplayManager.DisplayListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Choreographer f11953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final DisplayManager f11954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile long f11955e = -9223372036854775807L;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile long f11956f = -9223372036854775807L;

    public /* synthetic */ x0(Choreographer choreographer, DisplayManager displayManager, int i) {
        this.f11952b = i;
        this.f11953c = choreographer;
        this.f11954d = displayManager;
    }

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public abstract void h();

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
        int i10 = this.f11952b;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
        int i10 = this.f11952b;
    }

    private final void a(int i) {
    }

    private final void b(int i) {
    }

    private final void c(int i) {
    }

    private final void d(int i) {
    }
}
